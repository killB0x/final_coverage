# Automatically generated by Pynguin.
import pytest
import paragraph.session as module_0
import paragraph.types as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = 'CD\n'
    dict_0 = {}
    module_0.evaluate(str_0, dict_0)

def test_case_1():
    list_0 = []
    list_1 = module_0.solve(list_0, list_0, list_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    future_0 = module_0.eager_mode()
    assert f'{type(future_0).__module__}.{type(future_0).__qualname__}' == 'contextlib._GeneratorContextManager'
    assert f'{type(future_0.gen).__module__}.{type(future_0.gen).__qualname__}' == 'builtins.generator'
    assert future_0.args == ()
    assert future_0.kwds == {}
    dict_0 = {future_0: future_0, future_0: future_0, future_0: future_0}
    module_0.evaluate(future_0, dict_0)

def test_case_3():
    dict_0 = {}
    list_0 = module_0.evaluate(dict_0, dict_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    list_0 = []
    dict_0 = {}
    list_1 = module_0.evaluate(list_0, dict_0)
    list_2 = module_0.solve(list_0, list_0, list_0)
    var_0 = module_0.eager_mode()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'contextlib._GeneratorContextManager'
    assert f'{type(var_0.gen).__module__}.{type(var_0.gen).__qualname__}' == 'builtins.generator'
    assert var_0.args == ()
    assert var_0.kwds == {}
    var_1 = module_0.eager_mode()
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'contextlib._GeneratorContextManager'
    assert f'{type(var_1.gen).__module__}.{type(var_1.gen).__qualname__}' == 'builtins.generator'
    assert var_1.args == ()
    assert var_1.kwds == {}
    var_2 = var_1.__gt__(var_1)
    list_3 = [dict_0, dict_0, var_0]
    module_0.solve(dict_0, list_3, var_2)

def test_case_5():
    dict_0 = {}
    dict_1 = module_0.solve_requirements(dict_0)

def test_case_6():
    var_0 = module_0.eager_mode()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'contextlib._GeneratorContextManager'
    assert f'{type(var_0.gen).__module__}.{type(var_0.gen).__qualname__}' == 'builtins.generator'
    assert var_0.args == ()
    assert var_0.kwds == {}

@pytest.mark.xfail(strict=True)
def test_case_7():
    list_0 = []
    dict_0 = module_0.solve_requirements(list_0)
    list_1 = module_0.evaluate(list_0, dict_0)
    list_2 = module_0.solve(list_0, list_0, list_0)
    var_0 = module_0.eager_mode()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'contextlib._GeneratorContextManager'
    assert f'{type(var_0.gen).__module__}.{type(var_0.gen).__qualname__}' == 'builtins.generator'
    assert var_0.args == ()
    assert var_0.kwds == {}
    list_3 = var_0.__enter__()
    generator_0 = module_0.traverse_bw(list_2)
    dict_1 = module_0.solve_requirements(dict_0)
    var_1 = dict_1.__gt__(dict_1)
    var_1.submit(list_0, *list_0, **var_1)

def test_case_8():
    list_0 = []
    dict_0 = {}
    generator_0 = module_0.apply(list_0, dict_0, dict_0)
    list_1 = module_0.solve(generator_0, dict_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    dict_0 = {}
    dict_1 = module_0.solve_requirements(dict_0)
    op_0 = module_1.Op()
    var_0 = op_0.__call__()
    variable_0 = op_0.op()
    var_0.set_running_or_notify_cancel()

@pytest.mark.xfail(strict=True)
def test_case_10():
    list_0 = []
    dict_0 = {}
    str_0 = 'wp_i5\'lh?\x0b9"T"'
    generator_0 = module_0.apply(list_0, dict_0, str_0)
    module_0.evaluate(generator_0, list_0)

def test_case_11():
    tuple_0 = ()
    none_type_0 = None
    dict_0 = {none_type_0: tuple_0}
    variable_0 = module_1.Variable(op=tuple_0, args=dict_0)
    dict_1 = {variable_0: none_type_0, variable_0: none_type_0, variable_0: tuple_0}
    with pytest.raises(ValueError):
        module_0.evaluate(none_type_0, dict_1, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    str_0 = '$__EMx+o+@\n%hc &'
    variable_0 = module_1.Variable(str_0)
    dict_0 = {variable_0: str_0, variable_0: variable_0, variable_0: variable_0}
    module_0.evaluate(str_0, dict_0)

def test_case_13():
    float_0 = -2367.8408
    dict_0 = {float_0: float_0, float_0: float_0, float_0: float_0, float_0: float_0}
    variable_0 = module_1.Variable(args=dict_0)
    dict_1 = {variable_0: variable_0, variable_0: dict_0, variable_0: float_0, variable_0: dict_0}
    with pytest.raises(ValueError):
        module_0.solve(float_0, dict_1, variable_0)