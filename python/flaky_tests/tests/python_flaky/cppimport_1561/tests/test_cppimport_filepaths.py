# Automatically generated by Pynguin.
import pytest
import cppimport.filepaths as module_0

def test_case_0():
    bytes_0 = b'\xdfCj_\xa5\xeb\xc0s'
    var_0 = module_0.make_absolute(bytes_0, bytes_0)
    assert var_0 == b'\xdfCj_\xa5\xeb\xc0s/\xdfCj_\xa5\xeb\xc0s'

@pytest.mark.xfail(strict=True)
def test_case_1():
    int_0 = -1457
    module_0.make_absolute(int_0, int_0)

def test_case_2():
    bytes_0 = b'\xdfCj_\xa5\xeb\xc0s'
    var_0 = module_0.make_absolute(bytes_0, bytes_0)
    assert var_0 == b'\xdfCj_\xa5\xeb\xc0s/\xdfCj_\xa5\xeb\xc0s'
    bytes_1 = b'/n\xbe\x99iy\x85{\x18P\xd0@[\xb4M\xc5'
    var_1 = module_0.make_absolute(bytes_0, var_0)
    assert var_1 == b'\xdfCj_\xa5\xeb\xc0s/\xdfCj_\xa5\xeb\xc0s/\xdfCj_\xa5\xeb\xc0s'
    var_2 = module_0.make_absolute(bytes_0, bytes_1)
    var_3 = module_0.make_absolute(bytes_0, bytes_0)
    assert var_3 == b'\xdfCj_\xa5\xeb\xc0s/\xdfCj_\xa5\xeb\xc0s'
    var_4 = module_0.make_absolute(var_3, var_0)
    assert var_4 == b'\xdfCj_\xa5\xeb\xc0s/\xdfCj_\xa5\xeb\xc0s/\xdfCj_\xa5\xeb\xc0s/\xdfCj_\xa5\xeb\xc0s'