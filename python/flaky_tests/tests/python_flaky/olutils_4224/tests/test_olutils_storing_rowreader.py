# Automatically generated by Pynguin.
import pytest
import olutils.storing.rowreader as module_0
import olutils.tools as module_1

def test_case_0():
    dict_0 = {}
    row_reader_0 = module_0.RowReader(dict_0)
    var_0 = row_reader_0.read(row_reader_0)
    assert f'{type(module_0.Row.attributes).__module__}.{type(module_0.Row.attributes).__qualname__}' == 'builtins.property'

@pytest.mark.xfail(strict=True)
def test_case_1():
    list_0 = []
    bool_0 = False
    var_0 = module_1.countiter(bool_0, v_batch=bool_0, prefix=bool_0)
    row_0 = module_0.Row(list_0)
    assert f'{type(module_0.Row.attributes).__module__}.{type(module_0.Row.attributes).__qualname__}' == 'builtins.property'
    var_0.pop(list_0)

def test_case_2():
    bool_0 = True
    row_reader_0 = module_0.RowReader(bool_0, bool_0, delete=bool_0)

def test_case_3():
    none_type_0 = None
    row_reader_0 = module_0.RowReader(none_type_0, operations=none_type_0, delete=none_type_0)

def test_case_4():
    int_0 = 60
    row_reader_0 = module_0.RowReader(int_0, operations=int_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    int_0 = 60
    row_reader_0 = module_0.RowReader(int_0)
    row_reader_0.read(int_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    int_0 = 25
    dict_0 = {int_0: int_0}
    row_reader_0 = module_0.RowReader(dict_0)
    row_reader_0.read(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    dict_0 = {}
    row_reader_0 = module_0.RowReader(dict_0)
    var_0 = row_reader_0.read(row_reader_0)
    assert f'{type(module_0.Row.attributes).__module__}.{type(module_0.Row.attributes).__qualname__}' == 'builtins.property'
    var_0.delattr(var_0)

def test_case_8():
    int_0 = 30
    dict_0 = {}
    row_reader_0 = module_0.RowReader(dict_0)
    var_0 = row_reader_0.read(row_reader_0)
    assert f'{type(module_0.Row.attributes).__module__}.{type(module_0.Row.attributes).__qualname__}' == 'builtins.property'
    with pytest.raises(AttributeError):
        var_0.delattr(int_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    dict_0 = {}
    bytes_0 = b'l\xd9\xfaD\x12E;\xa5\nrj\x7f\x94\xdf\x1d\x07\xbe\xe5,'
    row_reader_0 = module_0.RowReader(dict_0, delete=bytes_0)
    none_type_0 = None
    bool_0 = True
    row_reader_1 = module_0.RowReader(bool_0, operations=dict_0, delete=dict_0)
    float_0 = -904.8036329987464
    bool_1 = True
    row_reader_2 = module_0.RowReader(float_0, bool_1)
    row_reader_0.read(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    dict_0 = {}
    row_0 = module_1.diff(dict_0, dict_0)
    row_reader_0 = module_0.RowReader(dict_0, row_0, dict_0)
    float_0 = -905.6
    row_reader_0.read(float_0)

def test_case_11():
    dict_0 = {}
    row_reader_0 = module_0.RowReader(dict_0)
    none_type_0 = None
    list_0 = [row_reader_0]
    var_0 = row_reader_0.read(list_0)
    assert f'{type(module_0.Row.attributes).__module__}.{type(module_0.Row.attributes).__qualname__}' == 'builtins.property'
    var_1 = var_0.pop(none_type_0, *list_0, **dict_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'olutils.storing.rowreader.RowReader'
    assert var_1.fields == {}
    assert var_1.conversions == {}
    assert var_1.operations == {}
    assert var_1.delete == []

@pytest.mark.xfail(strict=True)
def test_case_12():
    dict_0 = {}
    var_0 = module_1.diff(dict_0, dict_0)
    float_0 = -905.6
    row_reader_0 = module_0.RowReader(dict_0, operations=var_0)
    row_reader_0.read(float_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = 'lRmiq`S-<1E'
    dict_0 = {str_0: str_0}
    row_0 = module_0.Row(dict_0)
    assert f'{type(row_0).__module__}.{type(row_0).__qualname__}' == 'olutils.storing.rowreader.Row'
    assert len(row_0) == 1
    assert f'{type(module_0.Row.attributes).__module__}.{type(module_0.Row.attributes).__qualname__}' == 'builtins.property'
    dict_1 = {}
    row_reader_0 = module_0.RowReader(dict_1)
    none_type_0 = None
    row_reader_1 = row_0.setattr(str_0, row_0)
    var_0 = row_reader_0.read(row_reader_1)
    list_0 = [row_reader_0]
    var_1 = row_reader_0.read(list_0)
    var_2 = module_1.countiter(row_0, prefix=none_type_0, suffix=str_0)
    row_reader_2 = module_0.RowReader(var_2, operations=dict_1)
    row_reader_1.read(var_2)

def test_case_14():
    str_0 = 'lFRiq`-N<1E'
    dict_0 = {str_0: str_0}
    row_0 = module_0.Row(dict_0)
    assert f'{type(row_0).__module__}.{type(row_0).__qualname__}' == 'olutils.storing.rowreader.Row'
    assert len(row_0) == 1
    assert f'{type(module_0.Row.attributes).__module__}.{type(module_0.Row.attributes).__qualname__}' == 'builtins.property'
    dict_1 = {}
    row_reader_0 = module_0.RowReader(dict_1)
    row_reader_1 = module_0.RowReader(row_reader_0, operations=row_reader_0)
    var_0 = row_reader_0.read(row_reader_1)
    list_0 = [row_reader_0]
    var_1 = row_reader_0.read(list_0)
    row_reader_2 = module_0.RowReader(dict_0)
    with pytest.raises(KeyError):
        row_reader_2.read(dict_1)