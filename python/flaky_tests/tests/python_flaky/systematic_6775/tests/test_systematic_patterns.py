# Automatically generated by Pynguin.
import pytest
import systematic.patterns as module_0

def test_case_0():
    str_0 = 'N/q##_%bK34kSG'
    var_0 = module_0.match_path_patterns(str_0, str_0, str_0)
    assert var_0 is False

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'N/q##_%bK34kSG'
    var_0 = module_0.match_path_patterns(str_0, str_0, str_0)
    assert var_0 is False
    str_1 = 'C&U {}'
    module_0.match_path_patterns(var_0, str_0, str_1)

@pytest.mark.xfail(strict=True)
def test_case_2():
    none_type_0 = None
    module_0.match_path_prefix(none_type_0, none_type_0)

def test_case_3():
    dict_0 = {}
    var_0 = module_0.match_path_prefix(dict_0, dict_0)
    assert var_0 is True

def test_case_4():
    str_0 = '\nee'
    var_0 = module_0.match_path_prefix(str_0, str_0)
    assert var_0 is True
    str_1 = 'C&U {}'
    var_1 = module_0.match_path_patterns(str_0, str_1, str_1)
    assert var_1 is False

def test_case_5():
    str_0 = ')pP"6GD?u_Z5RV*\rR'
    var_0 = module_0.match_path_patterns(str_0, str_0, str_0)
    assert var_0 is True

def test_case_6():
    str_0 = 'N/q##_%bK34kSG'
    var_0 = module_0.match_path_patterns(str_0, str_0, str_0)
    assert var_0 is False
    str_1 = 'C&U {}'
    var_1 = module_0.match_path_prefix(str_1, str_0)
    assert var_1 is False
    var_2 = module_0.match_path_patterns(str_0, str_1, str_1)
    assert var_2 is False

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = 'N/q##_%bK34kSG'
    str_1 = 'Q\r EF{?y'
    var_0 = module_0.match_path_patterns(str_0, str_0, str_1)
    assert var_0 is False
    str_2 = 'C&U {}'
    var_1 = module_0.match_path_prefix(str_2, str_1)
    assert var_1 is False
    list_0 = [str_1, str_2, var_0, str_0]
    module_0.match_path_patterns(var_1, list_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = 'N/q##_%bK34kSG'
    var_0 = module_0.get_relative_path(str_0, str_0)
    assert var_0 == ''
    set_0 = {str_0, str_0, str_0, var_0}
    var_1 = module_0.match_path_patterns(set_0, var_0, var_0)
    assert var_1 is True
    tuple_0 = (var_0,)
    module_0.match_path_patterns(var_1, set_0, tuple_0)