# Automatically generated by Pynguin.
import pytest
import tests.resource_a as module_0

def test_case_0():
    var_0 = module_0.json_test()
    assert var_0 == 'test'

@pytest.mark.xfail(strict=True)
def test_case_1():
    var_0 = module_0.json_test()
    assert var_0 == 'test'
    var_1 = var_0.__dir__()
    var_0.attach_mock(var_0, var_1)

@pytest.mark.xfail(strict=True)
def test_case_2():
    var_0 = module_0.memory_test()
    assert var_0 == 'test'
    var_0.mock_add_spec(var_0)