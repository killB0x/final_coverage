# Automatically generated by Pynguin.
import pytest
import waddle.utils as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    complex_0 = (-358.99976+1041.6903j)
    list_0 = [complex_0]
    module_0.load_config(*list_0)

def test_case_1():
    var_0 = module_0.load_config()

def test_case_2():
    bool_0 = False
    var_0 = module_0.load_config()
    list_0 = [bool_0, bool_0, bool_0]
    var_1 = module_0.load_config(*list_0)

def test_case_3():
    bool_0 = False
    list_0 = [bool_0, bool_0, bool_0]
    var_0 = module_0.load_config(*list_0)
    var_1 = module_0.load_config()