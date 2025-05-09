# Automatically generated by Pynguin.
import pytest
import olutils.storing.txt as module_0

def test_case_0():
    str_0 = '#>r'
    var_0 = module_0.read_txt(str_0, str_0, encoding=str_0)

def test_case_1():
    none_type_0 = None
    with pytest.raises(TypeError):
        module_0.read_txt(none_type_0, w_eol=none_type_0, f_eol=none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    int_0 = 2
    module_0.read_txt(int_0, w_eol=int_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    bytes_0 = b'\xc7}\xe8grf\t\x91\xcbe.?BXU\xf0\xcd'
    module_0.write_txt(bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = 'json'
    var_0 = module_0.write_txt(str_0, str_0)
    var_1 = module_0.read_txt(str_0, f_eol=str_0)
    bool_0 = True
    module_0.read_txt(bool_0, encoding=var_0)

def test_case_5():
    str_0 = '`\ri]QaQ~c'
    var_0 = module_0.rm_eol(str_0)

def test_case_6():
    bytes_0 = b"\xa4a\xdd\xcb\xab\x84'\xe5\xca\x97@\x94s\x9a\x9b"
    with pytest.raises(TypeError):
        module_0.read_txt(bytes_0, w_eol=bytes_0, encoding=bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = 'Initiate PlotDesigner\n\n        Args:\n            **params: <deco_param_descr>\n        '
    none_type_0 = None
    var_0 = module_0.write_txt(none_type_0, str_0, eol=str_0)
    var_1 = module_0.read_txt(none_type_0, var_0, f_eol=none_type_0)
    module_0.write_txt(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = '#>r'
    var_0 = module_0.read_txt(str_0)
    var_1 = module_0.read_txt(str_0, str_0)
    module_0.rm_eol(var_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    str_0 = '#>r'
    var_0 = module_0.read_txt(str_0)
    var_1 = module_0.read_txt(str_0, str_0)
    module_0.rm_eol(var_1)

def test_case_10():
    str_0 = 'json'
    var_0 = module_0.rm_eol(str_0)
    var_1 = module_0.read_txt(str_0, f_eol=var_0)
    bool_0 = False
    with pytest.raises(TypeError):
        module_0.read_txt(var_1, encoding=bool_0)

def test_case_11():
    str_0 = '#>r'
    var_0 = module_0.read_txt(str_0, str_0, encoding=str_0)
    bool_0 = False
    with pytest.raises(TypeError):
        module_0.read_txt(bool_0, f_eol=var_0, encoding=str_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    str_0 = '#>-'
    var_0 = module_0.read_txt(str_0, str_0, encoding=str_0)
    bool_0 = False
    list_0 = [var_0, var_0, var_0, var_0]
    module_0.write_txt(list_0, str_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    none_type_0 = None
    str_0 = 'iter'
    var_0 = module_0.rm_eol(str_0)
    var_1 = module_0.read_txt(str_0, str_0, encoding=str_0)
    bool_0 = False
    list_0 = [var_1, var_1, var_1, none_type_0]
    module_0.write_txt(list_0, str_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    str_0 = 'str'
    var_0 = module_0.rm_eol(str_0)
    var_1 = module_0.write_txt(str_0, str_0)
    module_0.read_txt(str_0, str_0, encoding=str_0)