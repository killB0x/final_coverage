# Automatically generated by Pynguin.
import pytest
import tramway.inference.bayes_factors.stopwatch as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    bool_0 = True
    stopwatch_0 = module_0.stopwatch(bool_0)
    str_0 = 'v2K!K%CXi;9'
    var_0 = stopwatch_0.__enter__()
    var_1 = stopwatch_0.__exit__(stopwatch_0, bool_0, var_0)
    var_1.__exit__(str_0, stopwatch_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    bool_0 = False
    stopwatch_0 = module_0.stopwatch(bool_0)
    int_0 = -1424
    bool_1 = False
    stopwatch_0.__exit__(bool_0, int_0, bool_1)

@pytest.mark.xfail(strict=True)
def test_case_2():
    int_0 = 200
    none_type_0 = None
    none_type_1 = None
    stopwatch_0 = module_0.stopwatch(none_type_1, none_type_0)
    var_0 = stopwatch_0.__enter__()
    var_1 = stopwatch_0.__exit__(int_0, var_0, var_0)
    var_1.__enter__()