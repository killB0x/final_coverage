# Automatically generated by Pynguin.
import pytest
import lcs.metrics as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    bool_0 = False
    var_0 = module_0.basic_metrics(bool_0, bool_0, bool_0)
    module_0.population_metrics(var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    tuple_0 = ()
    var_0 = module_0.population_metrics(tuple_0, tuple_0)
    module_0.population_metrics(var_0, tuple_0)