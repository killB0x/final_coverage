# Automatically generated by Pynguin.
import pytest
import tramway.core.exceptions as module_0

def test_case_0():
    multiple_argument_error_0 = module_0.MultipleArgumentError()
    with pytest.raises(AssertionError):
        multiple_argument_error_0.__str__()

def test_case_1():
    na_n_warning_0 = module_0.NaNWarning()

@pytest.mark.xfail(strict=True)
def test_case_2():
    multiple_argument_error_0 = module_0.MultipleArgumentError()
    list_0 = [multiple_argument_error_0, multiple_argument_error_0]
    multiple_argument_error_1 = module_0.MultipleArgumentError(*list_0)
    multiple_argument_error_1.__str__()

def test_case_3():
    none_type_0 = None
    list_0 = [none_type_0]
    multiple_argument_error_0 = module_0.MultipleArgumentError(*list_0)
    na_n_warning_0 = module_0.NaNWarning()
    na_n_warning_1 = module_0.NaNWarning()
    with pytest.raises(AssertionError):
        multiple_argument_error_0.__str__()

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = '5mC!g(3O7(mq0C'
    multiple_argument_error_0 = module_0.MultipleArgumentError(*str_0)
    var_0 = multiple_argument_error_0.__str__()
    assert var_0 == "please define either '5', 'm', 'C', '!', 'g', '(', '3', 'O', '7', '(', 'm', 'q', '0' or 'C'"
    multiple_argument_error_1 = module_0.MultipleArgumentError()
    str_1 = '\r;,D6j4lM}9'
    dict_0 = {str_0: str_0, str_1: str_0}
    module_0.MissingSupportWarning(**dict_0)