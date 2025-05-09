# Automatically generated by Pynguin.
import pytest
import geomstats.errors as module_0
import autograd.tracer as module_1

def test_case_0():
    bool_0 = False
    with pytest.raises(ValueError):
        module_0.check_integer(bool_0, bool_0)

def test_case_1():
    str_0 = "+a'"
    with pytest.raises(ValueError):
        module_0.check_integer(str_0, str_0)

def test_case_2():
    str_0 = 'R"58AcV'
    none_type_0 = None
    var_0 = module_0.check_parameter_accepted_values(str_0, none_type_0, str_0)
    var_1 = module_0.check_parameter_accepted_values(str_0, str_0, str_0)
    with pytest.raises(ValueError):
        module_0.check_integer(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    module_1.clip()

@pytest.mark.xfail(strict=True)
def test_case_4():
    none_type_0 = None
    var_0 = module_0.check_integer(none_type_0, none_type_0)
    var_1 = module_0.check_integer(none_type_0, none_type_0)
    none_type_1 = None
    module_0.check_parameter_accepted_values(none_type_1, none_type_1, none_type_1)

def test_case_5():
    str_0 = 'R"58AcV'
    str_1 = 'R"58AMcV'
    with pytest.raises(ValueError):
        module_0.check_parameter_accepted_values(str_0, str_0, str_1)

@pytest.mark.xfail(strict=True)
def test_case_6():
    int_0 = 1274
    none_type_0 = None
    var_0 = module_0.check_integer(int_0, none_type_0)
    var_1 = module_0.check_integer(int_0, int_0)
    module_0.check_parameter_accepted_values(int_0, int_0, int_0)

def test_case_7():
    float_0 = 1e309
    none_type_0 = None
    var_0 = module_0.check_integer(float_0, none_type_0)
    str_0 = 'L*-[(L'
    with pytest.raises(ValueError):
        module_0.check_integer(str_0, str_0)