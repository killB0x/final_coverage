# Automatically generated by Pynguin.
import sundry.get_func_info as module_0

def test_case_0():
    str_0 = module_0.get_func_name()
    assert str_0 == '<module>'

def test_case_1():
    str_0 = module_0.get_line_number()
    assert str_0 == 1

def test_case_2():
    str_0 = module_0.get_file_name()
    assert str_0 == '<ast>'
    str_1 = module_0.get_func_name()
    assert str_1 == '<module>'
    str_2 = module_0.get_func_name()
    assert str_2 == '<module>'
    str_3 = module_0.get_line_number()
    assert str_3 == 1

def test_case_3():
    str_0 = module_0.get_file_path()
    assert str_0 == '<ast>'
    str_1 = module_0.get_line_number()
    assert str_1 == 1