# Automatically generated by Pynguin.
import pytest
import nala.api as module_0
import nala.generator as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    bool_0 = True
    module_0.find_cached_mocked_functions(bool_0)

def test_case_1():
    str_0 = 'Do not add any real variadic functions.'
    var_0 = module_0.has_implementation(str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = 'F:)m"e;#Fl[B\re+~{'
    var_0 = module_1.header_file(str_0)
    var_1 = module_0.load_real_variadic_functions(var_0)
    var_0.load_struct_members(var_1)

def test_case_3():
    str_0 = 'long'
    var_0 = module_0.find_mocked_functions(str_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = ''
    module_0.generate_mocks(str_0, str_0, str_0, str_0, str_0, str_0, str_0)

def test_case_5():
    str_0 = 'F:)m"e;#Fl[B\re+~{'
    var_0 = module_0.generate_mocks(str_0, str_0, str_0, str_0, str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = 'm@#>tlF%>kH3o;aJ'
    module_0.generate_mocks(str_0, str_0, str_0, str_0, str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = ' 7bE+"kJytU)KS&#N_U'
    str_1 = 'U'
    var_0 = module_0.has_implementation(str_1, str_1, str_0)
    assert var_0 is True
    module_0.generate_mocks(str_0, str_0, str_0, str_0, str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    int_0 = 2
    module_0.load_real_variadic_functions(int_0)

def test_case_9():
    bool_0 = True
    str_0 = '$.NF3IWc?6 Z<I2s3F('
    var_0 = module_0.find_mocked_function_name(str_0, bool_0)
    assert var_0 == 'Z<I2s3F($'

def test_case_10():
    str_0 = 'F:)m"e;#Fl[B\re+~{'
    var_0 = module_0.has_implementation(str_0, str_0, str_0)
    var_1 = module_0.generate_mocks(str_0, str_0, var_0, var_0, var_0, var_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = 'F:)m"e;#Fl[B\re+~{'
    var_0 = module_0.has_implementation(str_0, str_0, str_0)
    module_0.generate_mocks(str_0, var_0, var_0, str_0, var_0, var_0, str_0)

def test_case_12():
    str_0 = 'F:)m"e;#Kl[B\re+~{'
    str_1 = 'glhl>LO<\n\rm<G|~*w}'
    none_type_0 = None
    var_0 = module_0.generate_mocks(str_0, str_1, none_type_0, none_type_0, none_type_0, str_1, str_0)
    var_1 = module_0.has_implementation(str_0, str_0, str_1)
    assert var_1 is False
    var_2 = module_0.generate_mocks(str_0, str_0, str_0, var_1, str_0, str_0, str_0)