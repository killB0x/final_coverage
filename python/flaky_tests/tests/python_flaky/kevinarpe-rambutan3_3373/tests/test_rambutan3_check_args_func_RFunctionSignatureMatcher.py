# Automatically generated by Pynguin.
import pytest
import inspect as module_0
import rambutan3.check_args.func.RFunctionSignatureMatcher as module_1
import re as module_2

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    var_0 = module_0.isasyncgenfunction(none_type_0)
    bool_0 = var_0.__eq__(none_type_0)
    var_1 = var_0.__repr__()
    module_1.RFunctionSignatureMatcher(var_1)

def test_case_1():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    r_function_signature_matcher_1 = module_1.RFunctionSignatureMatcher(tuple_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    r_function_signature_matcher_1 = module_1.RFunctionSignatureMatcher(tuple_0, r_function_signature_matcher_0)
    bool_0 = r_function_signature_matcher_1.__eq__(r_function_signature_matcher_1)
    assert bool_0 is True
    var_0 = module_0.formatannotationrelativeto(bool_0)
    r_function_signature_matcher_1.matches(var_0, r_function_signature_matcher_1)

@pytest.mark.xfail(strict=True)
def test_case_3():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    bool_0 = r_function_signature_matcher_0.__eq__(tuple_0)
    r_function_signature_matcher_1 = module_1.RFunctionSignatureMatcher(tuple_0)
    module_2.template(r_function_signature_matcher_1)

def test_case_4():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    str_0 = r_function_signature_matcher_0.__str__()
    assert str_0 == 'def *()'

@pytest.mark.xfail(strict=True)
def test_case_5():
    none_type_0 = None
    module_1.RFunctionSignatureMatcher(none_type_0)

def test_case_6():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    bool_0 = r_function_signature_matcher_0.__eq__(r_function_signature_matcher_0)
    assert bool_0 is True

@pytest.mark.xfail(strict=True)
def test_case_7():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    r_function_signature_matcher_1 = module_1.RFunctionSignatureMatcher(tuple_0)
    r_function_signature_matcher_2 = module_1.RFunctionSignatureMatcher(tuple_0, r_function_signature_matcher_1)
    r_function_signature_matcher_3 = module_1.RFunctionSignatureMatcher(tuple_0, r_function_signature_matcher_0)
    str_0 = r_function_signature_matcher_2.__str__()
    assert str_0 == 'def *() -> def *()'
    bool_0 = r_function_signature_matcher_1.__eq__(r_function_signature_matcher_0)
    assert bool_0 is True
    int_0 = r_function_signature_matcher_0.__hash__()
    assert int_0 == 1966358031609004356
    str_1 = r_function_signature_matcher_0.__str__()
    assert str_1 == 'def *()'
    r_function_signature_matcher_4 = module_1.RFunctionSignatureMatcher(tuple_0, r_function_signature_matcher_1)
    r_function_signature_matcher_5 = module_1.RFunctionSignatureMatcher(tuple_0)
    int_1 = r_function_signature_matcher_0.__hash__()
    assert int_1 == 1966358031609004356
    str_2 = r_function_signature_matcher_0.__str__()
    assert str_2 == 'def *()'
    int_2 = r_function_signature_matcher_1.__hash__()
    assert int_2 == 1966358031609004356
    var_0 = module_0.currentframe()
    bool_1 = var_0.__eq__(bool_0)
    var_0.rpartition(int_1)

@pytest.mark.xfail(strict=True)
def test_case_8():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    r_function_signature_matcher_1 = module_1.RFunctionSignatureMatcher(tuple_0, r_function_signature_matcher_0)
    str_0 = r_function_signature_matcher_0.__str__()
    assert str_0 == 'def *()'
    var_0 = module_0.ismethoddescriptor(r_function_signature_matcher_0)
    int_0 = r_function_signature_matcher_0.__hash__()
    assert int_0 == 1966358031609004356
    str_1 = r_function_signature_matcher_0.__str__()
    assert str_1 == 'def *()'
    bool_0 = r_function_signature_matcher_0.matches(r_function_signature_matcher_1)
    assert bool_0 is False
    bool_1 = r_function_signature_matcher_1.__eq__(r_function_signature_matcher_0)
    assert bool_1 is False
    module_1.RFunctionSignatureMatcher(str_1, var_0)

def test_case_9():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    bool_0 = r_function_signature_matcher_0.matches(r_function_signature_matcher_0)
    assert bool_0 is False

@pytest.mark.xfail(strict=True)
def test_case_10():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    r_function_signature_matcher_1 = module_1.RFunctionSignatureMatcher(tuple_0)
    bool_0 = r_function_signature_matcher_0.matches(r_function_signature_matcher_1)
    assert bool_0 is False
    tuple_1 = (r_function_signature_matcher_1,)
    r_function_signature_matcher_2 = module_1.RFunctionSignatureMatcher(tuple_1)
    str_0 = r_function_signature_matcher_1.__str__()
    assert str_0 == 'def *()'
    none_type_0 = None
    bool_1 = r_function_signature_matcher_1.__eq__(none_type_0)
    int_0 = r_function_signature_matcher_2.__hash__()
    assert int_0 == -6593278901783766154
    str_1 = r_function_signature_matcher_1.__str__()
    assert str_1 == 'def *()'
    bool_2 = r_function_signature_matcher_2.__eq__(r_function_signature_matcher_2)
    assert bool_2 is True
    str_2 = r_function_signature_matcher_1.__str__()
    assert str_2 == 'def *()'
    int_1 = r_function_signature_matcher_0.__hash__()
    assert int_1 == 1966358031609004356
    bool_3 = r_function_signature_matcher_2.__eq__(tuple_0)
    r_function_signature_matcher_3 = module_1.RFunctionSignatureMatcher(tuple_0)
    bool_4 = r_function_signature_matcher_0.__eq__(bool_1)
    r_function_signature_matcher_4 = module_1.RFunctionSignatureMatcher(tuple_1)
    int_2 = r_function_signature_matcher_3.__hash__()
    assert int_2 == 1966358031609004356
    str_3 = r_function_signature_matcher_2.__str__()
    assert str_3 == 'def *(def *())'
    int_3 = r_function_signature_matcher_0.__hash__()
    assert int_3 == 1966358031609004356
    module_2.split(str_1, int_3)

@pytest.mark.xfail(strict=True)
def test_case_11():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    bool_0 = r_function_signature_matcher_0.__eq__(r_function_signature_matcher_0)
    assert bool_0 is True
    var_0 = module_0.formatannotationrelativeto(bool_0)
    r_function_signature_matcher_0.matches(var_0, r_function_signature_matcher_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    tuple_0 = ()
    r_function_signature_matcher_0 = module_1.RFunctionSignatureMatcher(tuple_0)
    assert f'{type(r_function_signature_matcher_0).__module__}.{type(r_function_signature_matcher_0).__qualname__}' == 'rambutan3.check_args.func.RFunctionSignatureMatcher.RFunctionSignatureMatcher'
    r_function_signature_matcher_1 = module_1.RFunctionSignatureMatcher(tuple_0)
    r_function_signature_matcher_2 = module_1.RFunctionSignatureMatcher(tuple_0)
    r_function_signature_matcher_3 = module_1.RFunctionSignatureMatcher(tuple_0)
    var_0 = module_0.istraceback(r_function_signature_matcher_2)
    bool_0 = r_function_signature_matcher_1.matches(r_function_signature_matcher_2, var_0)
    assert bool_0 is False
    bool_1 = r_function_signature_matcher_0.__eq__(r_function_signature_matcher_0)
    assert bool_1 is True
    int_0 = r_function_signature_matcher_0.__hash__()
    assert int_0 == 1966358031609004356
    var_1 = module_0.formatannotationrelativeto(var_0)
    bool_2 = r_function_signature_matcher_2.matches(var_1)
    assert bool_2 is False
    var_1.strip()