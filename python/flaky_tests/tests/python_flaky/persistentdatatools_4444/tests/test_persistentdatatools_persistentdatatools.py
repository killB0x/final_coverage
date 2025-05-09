# Automatically generated by Pynguin.
import pytest
import persistentdatatools.persistentdatatools as module_0
import posixpath as module_1
import genericpath as module_2

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    module_0.verify_directory(none_type_0, none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    none_type_0 = None
    module_0.list_files_in_directory(none_type_0)

def test_case_2():
    list_0 = []
    var_0 = module_0.random_line_data()
    var_1 = module_0.split_strings_in_list_retain_spaces(var_0)
    with pytest.raises(TypeError):
        module_0.collect_and_zip_files(list_0, list_0, list_0, var_1, var_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    list_0 = []
    var_0 = module_0.split_strings_in_list_retain_spaces(list_0)
    module_0.collect_and_zip_files(list_0, list_0, list_0, var_0, var_0)

def test_case_4():
    var_0 = module_0.random_line_data()

def test_case_5():
    var_0 = module_0.random_line_data()
    with pytest.raises(TypeError):
        module_0.collect_and_zip_files(var_0, var_0, var_0, var_0)

def test_case_6():
    bytes_0 = b'\xd4\xab;\xceDg<\xb7b'
    var_0 = module_0.file_name_increase(bytes_0, bytes_0)
    assert var_0 == b'\xd4\xab;\xceDg<\xb7b'

@pytest.mark.xfail(strict=True)
def test_case_7():
    none_type_0 = None
    module_0.file_to_list(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    bytes_0 = b':+N\xe6'
    module_0.remove_spaces_add_hyphen(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    bytes_0 = b'\x1a,\xf9\xf0\xd0\x0b\x18$\xd1\xc5\x90\xdf\x11\x9f\x11\xd3\x85\x05\x14'
    var_0 = module_0.file_name_increase(bytes_0, bytes_0)
    assert var_0 == b'\x1a,\xf9\xf0\xd0\x0b\x18$\xd1\xc5\x90\xdf\x11\x9f\x11\xd3\x85\x05\x14'
    module_0.remove_extra_spaces(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    bool_0 = True
    module_0.remove_symbol_add_symbol(bool_0, bool_0, bool_0)

def test_case_11():
    list_0 = []
    var_0 = module_0.random_line_data()
    var_1 = module_0.split_string_retain_spaces(var_0)
    with pytest.raises(TypeError):
        module_0.collect_and_zip_files(list_0, var_0, list_0, var_0)

def test_case_12():
    bytes_0 = b'\x89Zm\x98_\x9d'
    var_0 = module_0.list_directories_in_directory(bytes_0)
    var_1 = var_0.__repr__()
    assert var_1 == "[b';Y\\\\\\xfc\\x02jY\\x14\\x05\\xa5I\\x1br\\xc8', b'\\x89Zm\\x98_\\x9d', b'\\xc8\\xc7\\xe9%']"
    var_2 = module_0.join_split_string(var_1)
    assert var_2 == "[b';Y\\\\\\xfc\\x02jY\\x14\\x05\\xa5I\\x1br\\xc8', b'\\x89Zm\\x98_\\x9d', b'\\xc8\\xc7\\xe9%']"
    with pytest.raises(Exception):
        module_0.collect_and_zip_files(var_0, bytes_0, var_1)

@pytest.mark.xfail(strict=True)
def test_case_13():
    none_type_0 = None
    module_0.list_directories_in_directory(none_type_0)

def test_case_14():
    var_0 = module_0.random_data()

@pytest.mark.xfail(strict=True)
def test_case_15():
    none_type_0 = None
    module_0.remove_spaces(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    var_0 = module_0.random_line_data()
    module_0.verify_directory(var_0, var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_17():
    bytes_0 = b'%\xab;\xceDg<\xb7b'
    module_0.csv_to_dict(bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    list_0 = []
    module_0.collect_and_zip_files(list_0, list_0, list_0)

def test_case_19():
    bytes_0 = b'[\xab;\xceDg<\xb7b '
    list_0 = [bytes_0]
    with pytest.raises(Exception):
        module_0.collect_and_zip_files(list_0, list_0, list_0)

def test_case_20():
    bytes_0 = b'\xd4\xf2'
    list_0 = []
    none_type_0 = None
    with pytest.raises(TypeError):
        module_0.collect_and_zip_files(list_0, bytes_0, none_type_0, file_name_list=bytes_0)

def test_case_21():
    var_0 = module_0.random_line_data()
    list_0 = []
    with pytest.raises(NameError):
        module_0.collect_and_zip_files(list_0, list_0, var_0)

def test_case_22():
    bytes_0 = b'\xd4\xf2'
    list_0 = []
    with pytest.raises(TypeError):
        module_0.collect_and_zip_files(list_0, bytes_0, bytes_0, bytes_0, list_0)

def test_case_23():
    list_0 = []
    var_0 = module_0.random_line_data()
    var_1 = module_0.split_strings_in_list_retain_spaces(var_0)
    with pytest.raises(NameError):
        module_0.collect_and_zip_files(list_0, var_1, var_0, file_name_list=var_1)

def test_case_24():
    bytes_0 = b'\x89Zm\x98_\x9d'
    var_0 = module_0.list_directories_in_directory(bytes_0)
    var_1 = var_0.__repr__()
    assert var_1 == "[b';Y\\\\\\xfc\\x02jY\\x14\\x05\\xa5I\\x1br\\xc8', b'\\x89Zm\\x98_\\x9d', b'\\xc8\\xc7\\xe9%']"
    with pytest.raises(Exception):
        module_0.collect_and_zip_files(var_0, var_0, var_1)

def test_case_25():
    bytes_0 = b'\x89Zm\x98_\x9d'
    var_0 = module_1.abspath(bytes_0)
    var_1 = module_0.verify_directory(var_0, var_0, var_0)
    var_2 = var_0.__repr__()
    with pytest.raises(TypeError):
        module_0.collect_and_zip_files(var_0, var_0, var_2)

def test_case_26():
    bytes_0 = b'\x89Zm\x98_\x9d'
    var_0 = module_2.isdir(bytes_0)
    var_1 = module_0.verify_directory(bytes_0, bytes_0)
    assert var_1 is True
    var_2 = module_0.list_directories_in_directory(bytes_0)
    list_0 = [bytes_0]
    with pytest.raises(TypeError):
        module_0.collect_and_zip_files(list_0, var_0, bytes_0)

def test_case_27():
    bytes_0 = b'\x89Zm\x98_\x9d'
    var_0 = module_0.list_directories_in_directory(bytes_0)
    with pytest.raises(Exception):
        module_0.collect_and_zip_files(var_0, var_0, var_0, var_0, bytes_0)

def test_case_28():
    bytes_0 = b'\x89Zm\x98_\x9d'
    var_0 = module_0.list_directories_in_directory(bytes_0)
    with pytest.raises(Exception):
        module_0.collect_and_zip_files(var_0, var_0, var_0, file_name_list=var_0)

@pytest.mark.xfail(strict=True)
def test_case_29():
    bytes_0 = b'\x89Zm\x98_\x9d'
    bytes_1 = b'\x8b\xe2O\xeb\x8e\xab5\xcb\xe01\xac\x11|\xcd\xf7'
    var_0 = module_0.list_to_file(bytes_0, bytes_1, bytes_0)
    assert var_0 == b'\x8b\xe2O\xeb\x8e\xab5\xcb\xe01\xac\x11|\xcd\xf7'
    var_1 = module_2.isdir(bytes_0)
    var_2 = module_0.verify_directory(bytes_0, bytes_0)
    assert var_2 is True
    var_3 = module_0.random_data(var_2)
    module_0.list_directories_in_directory(var_1)

def test_case_30():
    bytes_0 = b'\x89Zm\x98_\x9d'
    list_0 = [bytes_0, bytes_0, bytes_0]
    with pytest.raises(TypeError):
        module_0.collect_and_zip_files(list_0, bytes_0, bytes_0, list_0, list_0)

@pytest.mark.xfail(strict=True)
def test_case_31():
    var_0 = module_0.random_line_data()
    var_1 = module_1.dirname(var_0)
    module_0.dict_to_csv(var_0, var_0, var_0, var_1)