# Automatically generated by Pynguin.
import pytest
import scrapbook.api as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    bytes_0 = b'-\xff$\tw\xee\xfdN\x13e}'
    module_0.glue(bytes_0, bytes_0, bytes_0)

def test_case_1():
    bytes_0 = b'-\xff$\tw\xee\xfdN\x13e}'
    with pytest.raises(NotImplementedError):
        module_0.glue(bytes_0, bytes_0)

def test_case_2():
    int_0 = 2
    var_0 = module_0.read_notebook(int_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    bool_0 = False
    module_0.glue(bool_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    int_0 = -1042
    module_0.glue(int_0, int_0, display=int_0)

def test_case_5():
    bytes_0 = b'\x9b;n3\xc4.\x8c\xd7);\n'
    var_0 = module_0.glue(bytes_0, bytes_0, display=bytes_0)

def test_case_6():
    bytes_0 = b''
    var_0 = module_0.glue(bytes_0, bytes_0, display=bytes_0)

def test_case_7():
    str_0 = '<=*i 0bYd"\'W2)t\'_b'
    var_0 = module_0.glue(str_0, str_0, display=str_0)

def test_case_8():
    bytes_0 = b'\xcb1}\x96\x1e\xf2\xbc6\xa16/\xdb\x97\xb6\x83\x84;'
    tuple_0 = (bytes_0,)
    var_0 = module_0.read_notebook(tuple_0)
    var_1 = module_0.glue(var_0, var_0, display=tuple_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    set_0 = set()
    var_0 = module_0.glue(set_0, set_0, display=set_0)
    tuple_0 = ()
    var_1 = module_0.glue(tuple_0, tuple_0, display=tuple_0)
    var_2 = module_0.read_notebook(var_1)
    dict_0 = {var_1: var_1, var_1: var_1, tuple_0: var_2, var_2: tuple_0}
    module_0.glue(var_2, var_1, var_1, dict_0)

def test_case_10():
    str_0 = '/'
    var_0 = module_0.read_notebooks(str_0)