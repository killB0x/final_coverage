# Automatically generated by Pynguin.
import pytest
import pydicom.multival as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = '^||EM'
    module_0.MultiValue(str_0, str_0)

def test_case_1():
    dict_0 = {}
    multi_value_0 = module_0.MultiValue(dict_0, dict_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0

@pytest.mark.xfail(strict=True)
def test_case_2():
    tuple_0 = ()
    multi_value_0 = module_0.MultiValue(tuple_0, tuple_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0
    multi_value_1 = multi_value_0.__str__()
    assert multi_value_1 == ''
    multi_value_0.append(multi_value_1)

@pytest.mark.xfail(strict=True)
def test_case_3():
    tuple_0 = ()
    multi_value_0 = module_0.MultiValue(tuple_0, tuple_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0
    multi_value_0.pop()

@pytest.mark.xfail(strict=True)
def test_case_4():
    dict_0 = {}
    multi_value_0 = module_0.MultiValue(dict_0, dict_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0
    multi_value_0.__setitem__(dict_0, dict_0)

def test_case_5():
    dict_0 = {}
    multi_value_0 = module_0.MultiValue(dict_0, dict_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0
    var_0 = multi_value_0.__str__()
    assert var_0 == ''

@pytest.mark.xfail(strict=True)
def test_case_6():
    tuple_0 = ()
    multi_value_0 = module_0.MultiValue(tuple_0, tuple_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0
    var_0 = multi_value_0.__eq__(multi_value_0)
    assert var_0 is True
    bool_0 = True
    multi_value_0.__delitem__(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = 'R\x0b9-40B0'
    tuple_0 = ()
    bool_0 = False
    multi_value_0 = module_0.MultiValue(bool_0, tuple_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0
    var_0 = multi_value_0.__eq__(str_0)
    assert var_0 is False
    var_1 = multi_value_0.__str__()
    assert var_1 == ''
    var_2 = multi_value_0.__contains__(multi_value_0)
    multi_value_0.__setitem__(str_0, multi_value_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    tuple_0 = ()
    multi_value_0 = module_0.MultiValue(tuple_0, tuple_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0
    var_0 = multi_value_0.__ne__(tuple_0)
    assert var_0 is True
    var_0.sort(reverse=tuple_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    tuple_0 = ()
    multi_value_0 = module_0.MultiValue(tuple_0, tuple_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0
    var_0 = multi_value_0.__contains__(tuple_0)
    var_1 = multi_value_0.__len__()
    multi_value_1 = module_0.MultiValue(tuple_0, multi_value_0)
    var_2 = multi_value_0.sort()
    var_2.__getitem__(tuple_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    float_0 = 1464.795518
    tuple_0 = ()
    bool_0 = False
    none_type_0 = None
    multi_value_0 = module_0.MultiValue(bool_0, tuple_0)
    assert f'{type(multi_value_0).__module__}.{type(multi_value_0).__qualname__}' == 'pydicom.multival.MultiValue'
    assert len(multi_value_0) == 0
    multi_value_0.insert(float_0, none_type_0)