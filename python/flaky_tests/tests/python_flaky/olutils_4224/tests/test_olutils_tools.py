# Automatically generated by Pynguin.
import pytest
import olutils.tools as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = 'uV"k"yZ'
    var_0 = module_0.countiter(str_0, w_count=str_0, v_batch=str_0, suffix=str_0)
    module_0.diff(str_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'Pretty print self\n\n        Args:\n            *args, **kwargs: @see olutils.conversion.dict2str\n        '
    var_0 = module_0.countiter(str_0)
    bool_0 = True
    module_0.diff(var_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    none_type_0 = None
    var_0 = module_0.countiter(none_type_0, v_batch=none_type_0)
    module_0.diff(var_0, none_type_0)

def test_case_3():
    var_0 = module_0.display()

@pytest.mark.xfail(strict=True)
def test_case_4():
    none_type_0 = None
    module_0.diff(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    var_0 = module_0.display()
    str_0 = 'Pretty print self\n\n        Args:\n            *args, **kwargs: @see olutils.conversion.dict2str\n        '
    var_1 = module_0.countiter(str_0, w_count=str_0, v_batch=var_0, suffix=var_0)
    var_2 = module_0.countiter(var_0, var_0)
    module_0.diff(var_1, var_2)

def test_case_6():
    int_0 = 97
    str_0 = 'Pretty print self\n\n        Args:\n            *args, **kwargs: @see olutils.conversion.dict2str\n        '
    var_0 = module_0.display()
    var_1 = module_0.countiter(str_0, w_count=int_0, v_batch=int_0, suffix=int_0)
    var_2 = module_0.countiter(var_1, suffix=int_0)
    var_3 = module_0.diff(var_2, str_0)

def test_case_7():
    float_0 = 185.779967
    str_0 = 'v'
    dict_0 = {str_0: float_0, str_0: str_0, str_0: str_0, str_0: float_0}
    var_0 = module_0.display(*str_0, **dict_0)

def test_case_8():
    str_0 = 'minus'
    str_1 = 'verbose'
    str_2 = '{?'
    dict_0 = {str_0: str_0, str_1: str_1, str_2: str_1}
    with pytest.raises(TypeError):
        module_0.display(**dict_0)

def test_case_9():
    str_0 = 'v'
    bool_0 = False
    dict_0 = {str_0: bool_0, str_0: bool_0, str_0: str_0, str_0: bool_0, str_0: bool_0}
    var_0 = module_0.display(**dict_0)