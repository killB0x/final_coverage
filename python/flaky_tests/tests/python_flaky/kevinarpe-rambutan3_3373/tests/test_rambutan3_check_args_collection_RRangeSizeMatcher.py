# Automatically generated by Pynguin.
import pytest
import rambutan3.check_args.collection.RRangeSizeMatcher as module_0
import rambutan3.RArgs as module_1
import abc as module_2
import rambutan3.check_args.base.traverse.RTypeMatcherError as module_3
import rambutan3.check_args.RCheckArgsError as module_4

@pytest.mark.xfail(strict=True)
def test_case_0():
    module_0.RRangeSizeMatcher()

def test_case_1():
    int_0 = 1050
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=int_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'

def test_case_2():
    bool_0 = True
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    str_0 = r_range_size_matcher_0.__str__()
    assert str_0 == ' where size >= True'
    bool_1 = r_range_size_matcher_0.__eq__(r_range_size_matcher_0)
    assert bool_1 is True

def test_case_3():
    int_0 = 0
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(max_size=int_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'

def test_case_4():
    bool_0 = False
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(max_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    bool_1 = r_range_size_matcher_0.__eq__(bool_0)
    assert bool_1 is False

@pytest.mark.xfail(strict=True)
def test_case_5():
    int_0 = 1349
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(max_size=int_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    var_0 = r_range_size_matcher_0.__str__()
    assert var_0 == ' where size <= 1349'
    module_0.RRangeSizeMatcher()

@pytest.mark.xfail(strict=True)
def test_case_6():
    bool_0 = True
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    str_0 = '67o\\L\\'
    bool_1 = str_0.__eq__(bool_0)
    bool_2 = r_range_size_matcher_0.matches(bool_1)
    assert bool_2 is False
    int_0 = r_range_size_matcher_0.__hash__()
    assert int_0 == -6779188579744246035
    r_range_size_matcher_0.__or__(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    int_0 = -18
    module_0.RRangeSizeMatcher(max_size=int_0)

def test_case_8():
    bool_0 = True
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    bool_1 = r_range_size_matcher_0.matches(bool_0)
    assert bool_1 is False

@pytest.mark.xfail(strict=True)
def test_case_9():
    int_0 = -5879
    module_0.RRangeSizeMatcher(min_size=int_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    bool_0 = True
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    r_range_size_matcher_0.matches(r_range_size_matcher_0, r_range_size_matcher_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    bool_0 = True
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    str_0 = '672L\\'
    bool_1 = r_range_size_matcher_0.__str__()
    assert bool_1 == ' where size >= True'
    bool_2 = r_range_size_matcher_0.matches(bool_0)
    assert bool_2 is False
    str_1 = '67o\\L\\'
    var_0 = r_range_size_matcher_0.check_arg(str_0, str_1)
    assert var_0 == '672L\\'
    module_1.check_iterable_items_not_none(bool_0, str_1, *bool_2)

@pytest.mark.xfail(strict=True)
def test_case_12():
    bool_0 = True
    bool_1 = False
    module_0.RRangeSizeMatcher(min_size=bool_0, max_size=bool_1)

@pytest.mark.xfail(strict=True)
def test_case_13():
    bool_0 = False
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=bool_0, max_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    bool_1 = r_range_size_matcher_0.__eq__(bool_0)
    assert bool_1 is False
    bool_2 = r_range_size_matcher_0.matches(bool_0)
    assert bool_2 is False
    module_2.ABC(**r_range_size_matcher_0)

def test_case_14():
    int_0 = 0
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(max_size=int_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    var_0 = r_range_size_matcher_0.__str__()
    assert var_0 == ' where size <= 0'
    var_1 = var_0.__str__()
    assert var_1 == ' where size <= 0'
    r_type_matcher_error_0 = module_3.RTypeMatcherError()
    bool_0 = r_type_matcher_error_0.__eq__(r_type_matcher_error_0)
    r_range_size_matcher_1 = module_0.RRangeSizeMatcher(min_size=int_0)
    assert f'{type(r_range_size_matcher_1).__module__}.{type(r_range_size_matcher_1).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    bool_1 = r_range_size_matcher_0.matches(bool_0, r_type_matcher_error_0)
    assert bool_1 is False
    with pytest.raises(module_4.RCheckArgsError):
        r_range_size_matcher_0.check_arg(var_1, var_0, *var_1)

@pytest.mark.xfail(strict=True)
def test_case_15():
    bool_0 = True
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    set_0 = set()
    bool_1 = r_range_size_matcher_0.__eq__(set_0)
    assert bool_1 is False
    bool_2 = r_range_size_matcher_0.matches(bool_0)
    assert bool_2 is False
    r_range_size_matcher_0.check_arg(set_0, set_0)

def test_case_16():
    bool_0 = False
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=bool_0, max_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    var_0 = r_range_size_matcher_0.__str__()
    assert var_0 == ' where size >= False and size <= False'
    with pytest.raises(module_4.RCheckArgsError):
        r_range_size_matcher_0.check_arg(var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_17():
    int_0 = 0
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(max_size=int_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    var_0 = r_range_size_matcher_0.__str__()
    assert var_0 == ' where size <= 0'
    var_1 = var_0.__str__()
    assert var_1 == ' where size <= 0'
    r_type_matcher_error_0 = module_3.RTypeMatcherError()
    bool_0 = r_type_matcher_error_0.__eq__(r_type_matcher_error_0)
    r_range_size_matcher_1 = module_0.RRangeSizeMatcher(min_size=int_0)
    assert f'{type(r_range_size_matcher_1).__module__}.{type(r_range_size_matcher_1).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    bool_1 = r_range_size_matcher_0.__eq__(r_range_size_matcher_1)
    assert bool_1 is False
    var_2 = r_type_matcher_error_0.add_failed_match(r_type_matcher_error_0, r_type_matcher_error_0)
    none_type_0 = None
    bool_2 = r_range_size_matcher_1.matches(none_type_0)
    assert bool_2 is False
    str_0 = '67o\\L\\'
    var_3 = r_range_size_matcher_1.check_arg(str_0, var_0)
    assert var_3 == '67o\\L\\'
    var_2.__or__(r_type_matcher_error_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    int_0 = 0
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(max_size=int_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    bool_0 = r_range_size_matcher_0.matches(int_0)
    assert bool_0 is False
    set_0 = set()
    var_0 = r_range_size_matcher_0.check_arg(set_0, set_0)
    var_1 = var_0.__str__()
    var_2 = r_range_size_matcher_0.__str__()
    assert var_2 == ' where size <= 0'
    r_type_matcher_error_0 = module_3.RTypeMatcherError()
    bool_1 = var_2.__eq__(r_type_matcher_error_0)
    module_0.RRangeSizeMatcher()

@pytest.mark.xfail(strict=True)
def test_case_19():
    bool_0 = False
    r_range_size_matcher_0 = module_0.RRangeSizeMatcher(min_size=bool_0, max_size=bool_0)
    assert f'{type(r_range_size_matcher_0).__module__}.{type(r_range_size_matcher_0).__qualname__}' == 'rambutan3.check_args.collection.RRangeSizeMatcher.RRangeSizeMatcher'
    var_0 = r_range_size_matcher_0.__str__()
    assert var_0 == ' where size >= False and size <= False'
    bool_1 = r_range_size_matcher_0.__eq__(var_0)
    assert bool_1 is False
    module_2.ABC(**var_0)