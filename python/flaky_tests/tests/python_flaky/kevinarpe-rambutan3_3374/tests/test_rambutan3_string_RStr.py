# Automatically generated by Pynguin.
import pytest
import rambutan3.string.RStr as module_0

def test_case_0():
    r_str_0 = module_0.RStr()
    with pytest.raises(TypeError):
        r_str_0.__iter__()

def test_case_1():
    dict_0 = {}
    r_str_0 = module_0.RStr(**dict_0)
    var_0 = r_str_0.iter()
    var_1 = var_0.__iter__()