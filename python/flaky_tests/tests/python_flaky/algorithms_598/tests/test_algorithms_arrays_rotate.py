# Automatically generated by Pynguin.
import pytest
import algorithms.arrays.rotate as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    var_0 = module_0.rotate_v3(none_type_0, none_type_0)
    module_0.rotate_v2(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    bool_0 = False
    list_0 = [bool_0, bool_0, bool_0]
    module_0.rotate_v3(list_0, list_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    set_0 = set()
    module_0.rotate_v1(set_0, set_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    bytes_0 = b'\xf4p\xfa\xf2\x83\x91\x9d\xa2\x1e\x9a65'
    module_0.rotate_v2(bytes_0, bytes_0)

def test_case_4():
    bool_0 = False
    list_0 = [bool_0, bool_0, bool_0]
    int_0 = 999
    var_0 = module_0.rotate_v2(list_0, int_0)

def test_case_5():
    bool_0 = False
    list_0 = [bool_0, bool_0, bool_0]
    int_0 = 999
    var_0 = module_0.rotate_v2(list_0, int_0)
    var_1 = module_0.rotate_v1(var_0, int_0)
    var_2 = module_0.rotate_v1(list_0, int_0)

def test_case_6():
    bool_0 = False
    list_0 = [bool_0, bool_0, bool_0, bool_0, bool_0]
    int_0 = 999
    var_0 = module_0.rotate_v2(list_0, int_0)
    var_1 = module_0.rotate_v1(var_0, int_0)
    var_2 = module_0.rotate_v1(list_0, int_0)