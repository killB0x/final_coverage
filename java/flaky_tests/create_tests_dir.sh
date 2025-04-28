#!/bin/bash

# --- Enable Debugging ---
# This will print every command the script executes
set -x
# ----------------------

# Directory containing the project folders
CODE_DIR="./code"

# Set the name of the source directory we're looking for inside each project
SOURCE_SUBDIR="evosuite-tests"

# Set the base directory for the target structure (relative to where script is run)
TARGET_BASE_DIR="./tests"

# --- Sanity Checks ---
echo "+ DEBUG: Checking if CODE_DIR exists: $CODE_DIR"
# Check if the code directory exists
if [ ! -d "$CODE_DIR" ]; then
    echo "Error: Source directory '$CODE_DIR' not found in the current location ($(pwd)). Aborting."
    set +x # Turn off debugging before exiting
    exit 1
fi
echo "+ DEBUG: CODE_DIR check passed."

echo "+ DEBUG: Ensuring TARGET_BASE_DIR exists: $TARGET_BASE_DIR"
# Ensure the main target directory exists or can be created
mkdir -p "$TARGET_BASE_DIR"
if [ $? -ne 0 ]; then
    echo "Error: Could not create base target directory '$TARGET_BASE_DIR'. Check permissions. Aborting."
    set +x # Turn off debugging before exiting
    exit 1
fi
echo "+ DEBUG: TARGET_BASE_DIR check passed."
# --- End Sanity Checks ---

echo "+ DEBUG: Script starting main processing..."
echo "+ DEBUG: Looking for project directories inside '$CODE_DIR' using pattern '$CODE_DIR'/*/ "

# Loop through each directory inside the CODE_DIR
# The trailing slash in */ ensures we only match directories
for project_path in "$CODE_DIR"/*/; do

    echo "+ DEBUG: Loop iteration started. project_path='$project_path'"

    # Check if the glob pattern expanded correctly and it's a directory
    if [ ! -d "$project_path" ]; then
        echo "+ DEBUG: Item '$project_path' is not a directory or glob failed to expand. Checking if it's the literal pattern."
        if [ "$project_path" = "$CODE_DIR/*/" ]; then
            echo "+ DEBUG: Literal pattern match. No project subdirectories found inside '$CODE_DIR'."
        else
            echo "+ DEBUG: Not the literal pattern, but not a directory. Skipping."
        fi
        continue # Skip to the next iteration
    fi
    echo "+ DEBUG: Item '$project_path' is a directory."

    # Extract the base name of the project directory
    project_name=$(basename "$project_path")
    echo "+ DEBUG: Extracted project_name='$project_name'"

    # Define the full path to the source evosuite-tests directory
    source_dir="${project_path}${SOURCE_SUBDIR}"
    echo "+ DEBUG: Defined source_dir='$source_dir'"

    # Define the full path to the target directory for this project's tests
    target_dir="${TARGET_BASE_DIR}/${project_name}" # Target is relative to script execution dir
    echo "+ DEBUG: Defined target_dir='$target_dir'"

    # Check if the specific source subdirectory exists within this project directory
    echo "+ DEBUG: Checking if source_dir exists: '$source_dir'"
    if [ -d "$source_dir" ]; then
        echo "+ DEBUG: Source directory '$source_dir' found."
        echo "Processing project: $project_name (Source: $source_dir)"

        # Create the corresponding target directory
        echo "+ DEBUG: Ensuring target project directory exists: '$target_dir'"
        mkdir -p "$target_dir"
        if [ $? -ne 0 ]; then
            echo "  Error: Could not create target directory '$target_dir'. Skipping project."
            continue # Skip to the next project
        fi
        echo "  Ensured target directory exists: $target_dir"

        # Move the *contents* of the source directory to the target directory
        echo "+ DEBUG: Checking if source directory '$source_dir' is non-empty."
        # Enable dotglob to include hidden files/dirs
        shopt -s dotglob
        if [ -n "$(ls -A "$source_dir")" ]; then
             echo "+ DEBUG: Source directory is non-empty. Moving contents."
             echo "  Moving contents from '$source_dir' to '$target_dir'..."
             # The /* ensures we move the contents, not the directory itself
             mv "$source_dir"/* "$target_dir/"
             if [ $? -ne 0 ]; then
                 echo "  Warning: Issues encountered while moving contents from '$source_dir'. Please check manually."
             else
                 echo "  Move successful."
                 # Attempt to remove the now-empty source directory
                 echo "+ DEBUG: Attempting to remove empty source directory '$source_dir'"
                 rmdir "$source_dir" 2>/dev/null # Suppress error message if it fails
                 if [ $? -eq 0 ]; then
                     echo "  Removed empty source directory '$source_dir'."
                 else
                     echo "  Info: Source directory '$source_dir' may not be empty or couldn't be removed."
                 fi
             fi
        else
             echo "+ DEBUG: Source directory '$source_dir' is empty."
             echo "  Source directory '$source_dir' is empty. Nothing to move."
             # Attempt to remove the empty source directory
             echo "+ DEBUG: Attempting to remove empty source directory '$source_dir'"
             rmdir "$source_dir" 2>/dev/null && echo "  Removed empty source directory '$source_dir'."
        fi
        # Disable dotglob again
        shopt -u dotglob

    else
         echo "+ DEBUG: Source directory '$source_dir' NOT found."
         # Optional: uncomment below if you want to know which projects *don't* have the dir
         # echo "Skipping project '$project_name': No '$SOURCE_SUBDIR' directory found in '$project_path'."
    fi
    echo "+ DEBUG: Finished processing for project_path='$project_path'"

done

echo "+ DEBUG: Loop finished."
echo "Script finished."

# --- Disable Debugging ---
set +x
# -------------------------