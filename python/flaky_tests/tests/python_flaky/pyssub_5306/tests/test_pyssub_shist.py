# Automatically generated by Pynguin.
import pytest
import pyssub.shist as module_0

def test_case_0():
    str_0 = 'executable'
    dict_0 = module_0.load(str_0)

def test_case_1():
    str_0 = 'Pq3'
    str_1 = 'lokEjT\tm3\n2kLo#y'
    bool_0 = True
    dict_0 = {str_1: bool_0}
    none_type_0 = module_0.save(str_0, dict_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = 'executable'
    dict_0 = {}
    none_type_0 = module_0.save(str_0, dict_0)
    str_1 = '\n'
    module_0.load(str_1)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = 'Submitted batch job (?P<jobid>\\d+)'
    module_0.save(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    dict_0 = {}
    module_0.save(dict_0, dict_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    int_0 = 5
    module_0.load(int_0)

def test_case_6():
    str_0 = 'executable'
    dict_0 = module_0.load(str_0)

def test_case_7():
    str_0 = 'executable'
    dict_0 = module_0.load(str_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = ''
    str_1 = 'eK,g\r*Y^fu~1I|?\n'
    module_0.save(str_1, str_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    int_0 = 2
    module_0.load(int_0)