# Automatically generated by Pynguin.
import pytest
import olutils.params as module_0
import builtins as module_1

def test_case_0():
    bool_0 = True
    bool_1 = False
    dict_0 = {bool_0: bool_1, bool_1: bool_1}
    var_0 = module_0.read_params(dict_0, dict_0, dict_0, bool_1)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 2
    with pytest.raises(TypeError):
        module_0.check_type(dict_0, bool_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    bool_0 = True
    bool_1 = False
    dict_0 = {bool_1: bool_0, bool_0: bool_0, bool_0: bool_0, bool_1: bool_0, bool_0: bool_1}
    var_0 = module_0.read_params(dict_0, dict_0, default=bool_1)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 2
    var_0.__getattr__(var_0)

def test_case_2():
    none_type_0 = None
    tuple_0 = ()
    var_0 = module_0.read_params(none_type_0, tuple_0, default=none_type_0)
    with pytest.raises(TypeError):
        module_0.check_type(none_type_0, none_type_0, tuple_0)

def test_case_3():
    param_0 = module_0.Param()
    var_0 = module_0.read_params(param_0, param_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 0

@pytest.mark.xfail(strict=True)
def test_case_4():
    bool_0 = True
    bool_1 = False
    dict_0 = {bool_1: bool_0, bool_1: bool_1, bool_0: bool_1, bool_0: bool_1, bool_1: bool_0, bool_1: bool_1, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_1: bool_1}
    var_0 = module_0.read_params(dict_0, dict_0, default=bool_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 2
    module_0.add_dft_args(var_0, var_0)

def test_case_5():
    param_0 = module_0.Param()

def test_case_6():
    param_0 = module_0.Param()
    none_type_0 = None
    with pytest.raises(AttributeError):
        param_0.__setattr__(none_type_0, none_type_0)

def test_case_7():
    bool_0 = False
    bool_1 = True
    dict_0 = {bool_1: bool_0, bool_0: bool_1, bool_1: bool_0}
    var_0 = module_0.read_params(dict_0, dict_0, default=bool_1)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 2
    var_1 = module_0.iter_params(dict_0)

def test_case_8():
    param_0 = module_0.Param()
    var_0 = module_0.read_params(param_0, param_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 0
    var_1 = module_1.object(*var_0)
    var_2 = module_0.iter_params(param_0)

def test_case_9():
    tuple_0 = ()
    with pytest.raises(TypeError):
        module_0.check_type(tuple_0, tuple_0, tuple_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    bool_0 = False
    str_0 = '[,LD\x0coSc@'
    dict_0 = {str_0: str_0, str_0: bool_0, str_0: str_0}
    param_0 = module_0.Param(**dict_0)
    var_0 = module_0.read_params(dict_0, param_0, param_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 1
    module_0.add_dft_args(dict_0, param_0)

def test_case_11():
    param_0 = module_0.Param()
    var_0 = module_0.add_dft_args(param_0, param_0)
    bool_0 = True
    bool_1 = False
    dict_0 = {bool_1: bool_0, bool_1: bool_0, bool_0: bool_1, bool_1: bool_1, bool_0: bool_1, bool_1: bool_0, bool_1: bool_0}
    var_1 = module_0.read_params(dict_0, dict_0, default=bool_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'olutils.params.Param'
    assert len(var_1) == 2

@pytest.mark.xfail(strict=True)
def test_case_12():
    param_0 = module_0.Param()
    var_0 = module_0.read_params(param_0, param_0, default=param_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 0
    bool_0 = True
    var_1 = module_0.iter_params(param_0)
    var_2 = module_0.add_dft_args(bool_0, param_0)
    var_3 = module_0.read_params(var_0, var_1)
    module_0.add_dft_args(var_2, var_2)

def test_case_13():
    bool_0 = True
    bool_1 = False
    dict_0 = {bool_0: bool_0, bool_0: bool_1, bool_1: bool_0}
    var_0 = module_0.read_params(dict_0, dict_0, default=bool_1)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 2
    var_1 = var_0.__setattr__(bool_1, dict_0)

def test_case_14():
    bool_0 = True
    dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0}
    var_0 = module_0.read_params(dict_0, dict_0, default=dict_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 1

@pytest.mark.xfail(strict=True)
def test_case_15():
    bool_0 = False
    bool_1 = True
    dict_0 = {bool_1: bool_0, bool_1: bool_1, bool_1: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_1: bool_0, bool_1: bool_1}
    var_0 = module_0.read_params(dict_0, dict_0, default=bool_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 2
    module_0.add_dft_args(var_0, var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    bool_0 = True
    bool_1 = False
    dict_0 = {bool_0: bool_1, bool_1: bool_0}
    param_0 = module_0.Param()
    module_0.read_params(dict_0, param_0)

def test_case_17():
    bool_0 = True
    bool_1 = False
    dict_0 = {bool_1: bool_1, bool_0: bool_0, bool_0: bool_0, bool_0: bool_1}
    set_0 = set()
    tuple_0 = (set_0,)
    var_0 = module_0.read_params(dict_0, tuple_0, bool_1)

def test_case_18():
    bool_0 = True
    dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0}
    var_0 = module_0.read_params(dict_0, dict_0, default=bool_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'olutils.params.Param'
    assert len(var_0) == 1