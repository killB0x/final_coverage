# Automatically generated by Pynguin.
import pytest
import phenum.msg as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = ")k'}xV\nj.(&R3"
    module_0.example(str_0, str_0, str_0, str_0, str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    bytes_0 = b"Q\xfe\x06I'\xfa\xb9\x82\x08"
    module_0.printer(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    bytes_0 = b'I\xb8\xf70\t\x8e'
    module_0.arb(bytes_0, bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = 'K'
    var_0 = module_0.warn(str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    module_0.arb(str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    var_0 = module_0.will_print()
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    module_0.example(var_0, var_0, var_0, var_0, var_0, var_0, var_0)

def test_case_5():
    bytes_0 = b'\xffS\xb6t\x9d'
    var_0 = module_0.warn(bytes_0, bytes_0, bytes_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

def test_case_6():
    str_0 = "k'}xV\nj.(&R3"
    var_0 = module_0.warn(str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

def test_case_7():
    str_0 = 'S'
    var_0 = module_0.err(str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

def test_case_8():
    str_0 = 'S'
    var_0 = module_0.err(str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

def test_case_9():
    bytes_0 = b'FL\xc0\xc2\xf9\x14\xc0o\xffx\x1e\xb1\xaf\xe3'
    var_0 = module_0.info(bytes_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

@pytest.mark.xfail(strict=True)
def test_case_10():
    str_0 = 'e'
    none_type_0 = None
    var_0 = module_0.info(none_type_0, none_type_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    module_0.example(str_0, str_0, str_0, str_0, str_0, str_0, str_0)

def test_case_11():
    bool_0 = True
    var_0 = module_0.okay(bool_0, bool_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

def test_case_12():
    str_0 = ''
    var_0 = module_0.example(str_0, str_0, str_0, str_0, str_0, str_0, str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    var_1 = module_0.okay(var_0)

def test_case_13():
    bool_0 = True
    var_0 = module_0.gen(bool_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

def test_case_14():
    str_0 = ''
    var_0 = module_0.example(str_0, str_0, str_0, str_0, str_0, str_0, str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    var_1 = module_0.printer(str_0)
    var_2 = module_0.gen(var_1)

def test_case_15():
    str_0 = ''
    var_0 = module_0.example(str_0, str_0, str_0, str_0, str_0, str_0, str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    var_1 = module_0.printer(str_0)
    var_2 = module_0.gen(var_1)

def test_case_16():
    var_0 = module_0.blank()
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

@pytest.mark.xfail(strict=True)
def test_case_17():
    str_0 = ")k'}xV\nj.(&R3"
    var_0 = module_0.gen(str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    module_0.example(str_0, str_0, str_0, str_0, str_0, str_0, str_0)

def test_case_18():
    bool_0 = False
    var_0 = module_0.set_verbosity(bool_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

def test_case_19():
    bytes_0 = b'I\xb1\xb8\xf70\t\x8e'
    var_0 = module_0.set_quiet(bytes_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']

def test_case_20():
    var_0 = module_0.will_print()
    assert var_0 is False
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    var_1 = module_0.gen(var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    list_0 = []
    var_0 = module_0.set_quiet(list_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    none_type_0 = None
    module_0.warn(none_type_0, prefix=none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_22():
    bool_0 = True
    list_0 = [bool_0, bool_0, bool_0]
    var_0 = module_0.info(list_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    float_0 = 873.12013
    module_0.warn(float_0)
    var_2 = module_0.err(bool_0, prefix=var_1)

@pytest.mark.xfail(strict=True)
def test_case_23():
    str_0 = ''
    none_type_0 = None
    var_0 = module_0.example(str_0, str_0, str_0, str_0, str_0, str_0, str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    var_1 = module_0.printer(str_0)
    module_0.err(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_24():
    bytes_0 = b'\xa1%\xb5\x99\xaf\xa8\xf7'
    dict_0 = {}
    bool_0 = False
    list_0 = [bool_0]
    tuple_0 = (dict_0, list_0, bool_0)
    var_0 = module_0.set_verbosity(bool_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    var_1 = module_0.std(tuple_0)
    module_0.arb(bytes_0, list_0, var_1)

@pytest.mark.xfail(strict=True)
def test_case_25():
    bytes_0 = b'\x00\xb8\xf70\t\x8e'
    module_0.arb(bytes_0, bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    str_0 = 'Ee'
    var_0 = module_0.info(str_0)
    assert module_0.cenum == {'cerrs': 0, 'cwarn': 1, 'cinfo': 2, 'cgens': 3, 'cstds': 4, 'cokay': 5}
    assert module_0.icols == ['red', 'yellow', 'cyan', 'blue', 'white', 'green']
    bytes_0 = b'\xa1%\xb5\x99\xaf\xa8\xf7'
    dict_0 = {}
    var_1 = module_0.example(str_0, str_0, dict_0, str_0, bytes_0, var_0, var_0)
    bool_0 = True
    list_0 = [bool_0]
    tuple_0 = (dict_0, list_0, bool_0)
    var_2 = module_0.std(tuple_0)
    str_1 = "Writes a 'struct_enum.in' file for the executable enum.x.\n    Args:\n        params (dict): values returned from method:read_lattice().\n    "
    var_3 = module_0.arb(str_1, list_0, str_0)
    module_0.arb(bytes_0, list_0, var_2)