# Automatically generated by Pynguin.
import pytest
import phenum.phenumStr as module_0
import phenum.msg as module_1

def test_case_0():
    var_0 = module_0.examples()

def test_case_1():
    str_0 = 'structures'
    dict_0 = {str_0: str_0, str_0: str_0}
    with pytest.raises(ValueError):
        module_0.run(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    var_0 = module_0.examples()
    var_1 = module_0.examples()
    module_0.RepresentsInt(var_1)

def test_case_3():
    var_0 = module_0.examples()
    with pytest.raises(ValueError):
        module_0.run(var_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    int_0 = -1359
    module_0.run(int_0)

def test_case_5():
    var_0 = module_0.examples()
    str_0 = 'structures'
    var_1 = module_1.gen(str_0)
    dict_0 = {str_0: str_0, str_0: var_0}
    with pytest.raises(ValueError):
        module_0.run(dict_0)