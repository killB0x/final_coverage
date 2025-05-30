# Automatically generated by Pynguin.
import pytest
import mdutils.tools.Table as module_0

def test_case_0():
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0

@pytest.mark.xfail(strict=True)
def test_case_1():
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    table_0.create_table(table_0, table_0, table_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    var_0 = module_0.Table()
    assert var_0.rows == 0
    assert var_0.columns == 0
    table_0.create_table(table_0, table_0, table_0, table_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    int_0 = 182
    none_type_0 = None
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    table_0.create_table(int_0, int_0, none_type_0)

def test_case_4():
    bool_0 = False
    dict_0 = {}
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    var_0 = table_0.create_table(bool_0, bool_0, dict_0)
    assert var_0 == '\n|\n'

def test_case_5():
    bool_0 = False
    str_0 = 'left'
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    with pytest.raises(ValueError):
        table_0.create_table(bool_0, bool_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    bool_0 = True
    list_0 = [bool_0]
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    table_1 = module_0.Table()
    assert table_1.rows == 0
    assert table_1.columns == 0
    table_1.create_table(bool_0, bool_0, list_0)

def test_case_7():
    bool_0 = False
    str_0 = 'right'
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    with pytest.raises(ValueError):
        table_0.create_table(bool_0, bool_0, str_0, str_0)

def test_case_8():
    bool_0 = False
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    dict_0 = {}
    table_1 = module_0.Table()
    assert table_1.rows == 0
    assert table_1.columns == 0
    table_2 = module_0.Table()
    assert table_2.rows == 0
    assert table_2.columns == 0
    var_0 = table_1.create_table(bool_0, bool_0, dict_0)
    assert var_0 == '\n|\n'
    with pytest.raises(ValueError):
        table_1.create_table(bool_0, bool_0, dict_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    bool_0 = False
    dict_0 = {}
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    bool_1 = True
    var_0 = module_0.Table()
    assert var_0.rows == 0
    assert var_0.columns == 0
    var_1 = var_0.create_table(bool_0, bool_1, dict_0)
    assert var_1 == '\n|\n|\n'
    table_1 = module_0.Table()
    assert table_1.rows == 0
    assert table_1.columns == 0
    table_1.create_table(var_0, var_1, var_1, var_0)

def test_case_10():
    bool_0 = True
    str_0 = 'left'
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    with pytest.raises(ValueError):
        table_0.create_table(bool_0, bool_0, str_0, str_0)

def test_case_11():
    bool_0 = True
    str_0 = 'right'
    table_0 = module_0.Table()
    assert table_0.rows == 0
    assert table_0.columns == 0
    with pytest.raises(ValueError):
        table_0.create_table(bool_0, bool_0, str_0, str_0)