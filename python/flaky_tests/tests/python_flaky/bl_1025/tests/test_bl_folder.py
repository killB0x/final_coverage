# Automatically generated by Pynguin.
import bl.folder as module_0

def test_case_0():
    folder_0 = module_0.Folder()

def test_case_1():
    folder_0 = module_0.Folder()
    var_0 = folder_0.clean_filename(ext=folder_0)
    var_1 = folder_0.rglob(var_0)

def test_case_2():
    folder_0 = module_0.Folder()
    folder_1 = module_0.Folder(folder_0)
    var_0 = folder_1.glob(folder_1, folder_0)

def test_case_3():
    folder_0 = module_0.Folder()
    var_0 = folder_0.clean_filename(ext=folder_0)
    folder_1 = module_0.Folder(var_0)
    var_1 = folder_1.glob(folder_1)

def test_case_4():
    folder_0 = module_0.Folder()
    var_0 = folder_0.clean_filename(ext=folder_0)
    folder_1 = module_0.Folder(var_0)
    var_1 = folder_1.glob(folder_1, folder_0)