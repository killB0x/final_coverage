# Automatically generated by Pynguin.
import pytest
import test_cmpa.tst_util as module_0

def test_case_0():
    bytes_0 = b'z\x8ahA\xf9\xefL'
    var_0 = module_0.rmdir(bytes_0)
    assert var_0 is True

def test_case_1():
    int_0 = -727
    var_0 = module_0.rmdir(int_0)
    assert var_0 is False

@pytest.mark.xfail(strict=True)
def test_case_2():
    bool_0 = True
    var_0 = module_0.mkdirs(bool_0)
    var_1 = module_0.remove_readonly(bool_0)
    module_0.rmdir(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    int_0 = -727
    module_0.mkdirs(int_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    tuple_0 = ()
    module_0.rmdir(tuple_0)

def test_case_5():
    bool_0 = True
    var_0 = module_0.remove_readonly(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    bool_0 = True
    module_0.rmdir(bool_0)

def test_case_7():
    bytes_0 = b'z\x8ahA\xf9\xefL'
    var_0 = module_0.mkdirs(bytes_0)