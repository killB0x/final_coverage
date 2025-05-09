# Automatically generated by Pynguin.
import pytest
import ln2sql.table as module_0
import ln2sql.column as module_1

def test_case_0():
    table_0 = module_0.Table()
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.is_equivalent(table_0)
    assert var_0 is False
    var_1 = table_0.get_equivalences()
    table_1 = module_0.Table(equivalences=table_0)
    assert table_1.columns == []
    var_2 = table_1.get_primary_key_names()
    int_0 = 1929
    var_3 = table_0.add_foreign_key(table_0, table_0, int_0)

def test_case_1():
    table_0 = module_0.Table()
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'

@pytest.mark.xfail(strict=True)
def test_case_2():
    set_0 = set()
    complex_0 = (-1272.246+2453.711116j)
    table_0 = module_0.Table(columns=complex_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == (-1272.246+2453.711116j)
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.is_equivalent(set_0)
    assert var_0 is False
    var_0.get_equivalences()

def test_case_3():
    table_0 = module_0.Table()
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.is_equivalent(table_0)
    assert var_0 is False
    var_1 = table_0.get_equivalences()
    var_2 = table_0.get_column_by_name(var_0)
    int_0 = 1929
    var_3 = table_0.add_foreign_key(table_0, table_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    table_0 = module_0.Table()
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.add_foreign_key(table_0, table_0, table_0)
    var_1 = table_0.is_equivalent(var_0)
    assert var_1 is False
    var_2 = table_0.get_number_of_columns()
    var_2.is_foreign()

@pytest.mark.xfail(strict=True)
def test_case_5():
    table_0 = module_0.Table()
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_primary_keys()
    var_0.get_foreign_keys()

@pytest.mark.xfail(strict=True)
def test_case_6():
    bytes_0 = b'\x8f\x15\xd0)\xf5\x89&J\xd6\xf2\x00\\f'
    table_0 = module_0.Table(columns=bytes_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == b'\x8f\x15\xd0)\xf5\x89&J\xd6\xf2\x00\\f'
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_columns()
    assert var_0 == b'\x8f\x15\xd0)\xf5\x89&J\xd6\xf2\x00\\f'
    table_0.get_primary_key_names()

def test_case_7():
    table_0 = module_0.Table()
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_primary_key_names()

@pytest.mark.xfail(strict=True)
def test_case_8():
    int_0 = 2
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    table_1 = module_0.Table()
    assert table_1.columns == []
    assert table_1.equivalences == []
    var_0 = table_1.get_number_of_columns()
    assert var_0 == 0
    var_1 = table_1.add_foreign_key(table_1, table_1, table_1)
    var_2 = table_1.add_column(var_0, var_0, var_1)
    var_3 = table_1.is_equivalent(table_1)
    assert var_3 is False
    var_4 = table_1.add_primary_key(table_1)
    var_5 = table_1.get_foreign_keys()
    var_6 = table_1.get_equivalences()
    var_5.get_primary_key_names()

def test_case_9():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_primary_key_names()
    var_1 = table_0.get_foreign_keys()
    var_2 = table_0.add_primary_key(var_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_foreign_key_names()
    var_1 = table_0.get_primary_key_names()
    var_2 = table_0.get_foreign_keys()
    var_1.add_foreign_key(table_0, var_1, int_0)

def test_case_11():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_foreign_key_names()
    var_1 = table_0.get_columns()
    var_2 = table_0.get_foreign_keys()
    var_3 = table_0.get_equivalences()
    var_4 = table_0.add_primary_key(var_1)

def test_case_12():
    table_0 = module_0.Table()
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_primary_key_names()
    var_1 = table_0.add_column(table_0, table_0, table_0)

def test_case_13():
    table_0 = module_0.Table()
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.is_equivalent(table_0)
    assert var_0 is False
    var_1 = table_0.get_equivalences()
    int_0 = 1929
    var_2 = table_0.add_foreign_key(table_0, table_0, int_0)

def test_case_14():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_foreign_key_names()
    var_1 = table_0.get_primary_key_names()
    var_2 = table_0.get_foreign_keys()
    var_3 = table_0.get_equivalences()
    var_4 = table_0.add_equivalence(var_3)
    assert f'{type(table_0.equivalences).__module__}.{type(table_0.equivalences).__qualname__}' == 'builtins.list'
    assert len(table_0.equivalences) == 1

@pytest.mark.xfail(strict=True)
def test_case_15():
    bool_0 = False
    table_0 = module_0.Table(columns=bool_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.add_column(bool_0, table_0, bool_0)
    assert f'{type(table_0.columns).__module__}.{type(table_0.columns).__qualname__}' == 'builtins.list'
    assert len(table_0.columns) == 1
    var_1 = table_0.get_foreign_key_names()
    var_2 = table_0.add_foreign_key(bool_0, var_1, bool_0)
    var_1.add_type(var_1)

@pytest.mark.xfail(strict=True)
def test_case_16():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    none_type_0 = None
    var_0 = table_0.add_column(none_type_0, table_0, none_type_0)
    assert f'{type(table_0.columns).__module__}.{type(table_0.columns).__qualname__}' == 'builtins.list'
    assert len(table_0.columns) == 1
    column_0 = module_1.Column(equivalences=table_0)
    var_1 = table_0.get_foreign_key_names()
    var_2 = table_0.get_primary_key_names()
    int_1 = -1281
    var_3 = table_0.get_columns()
    var_4 = table_0.get_number_of_columns()
    var_5 = table_0.add_foreign_key(int_0, var_1, int_1)
    var_4.get_column_by_name(int_1)

@pytest.mark.xfail(strict=True)
def test_case_17():
    bytes_0 = b'U'
    int_0 = 2
    list_0 = [bytes_0, int_0]
    table_0 = module_0.Table(equivalences=list_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == [b'U', 2]
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.is_equivalent(int_0)
    assert var_0 is True
    var_0.get_primary_keys()

@pytest.mark.xfail(strict=True)
def test_case_18():
    bytes_0 = b'U'
    int_0 = 2
    list_0 = [bytes_0, int_0]
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    tuple_0 = (bytes_0, int_0, int_0, list_0)
    table_1 = module_0.Table(columns=tuple_0, equivalences=list_0)
    assert table_1.columns == (b'U', 2, 2, [b'U', 2])
    assert table_1.equivalences == [b'U', 2]
    table_2 = module_0.Table()
    assert table_2.columns == []
    assert table_2.equivalences == []
    var_0 = table_2.add_foreign_key(table_2, table_2, table_2)
    var_1 = table_2.is_equivalent(table_2)
    assert var_1 is False
    var_2 = table_2.add_primary_key(table_2)
    var_3 = table_2.get_foreign_keys()
    table_1.get_column_by_name(table_0)

@pytest.mark.xfail(strict=True)
def test_case_19():
    bytes_0 = b'U'
    int_0 = 2
    list_0 = [bytes_0, int_0]
    tuple_0 = (bytes_0, int_0, int_0, list_0)
    table_0 = module_0.Table(columns=tuple_0, equivalences=list_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == (b'U', 2, 2, [b'U', 2])
    assert table_0.equivalences == [b'U', 2]
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    table_1 = module_0.Table()
    assert table_1.columns == []
    assert table_1.equivalences == []
    var_0 = table_1.add_foreign_key(table_1, table_1, table_1)
    table_0.get_primary_keys()

def test_case_20():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    none_type_0 = None
    var_0 = table_0.add_column(none_type_0, table_0, none_type_0)
    assert f'{type(table_0.columns).__module__}.{type(table_0.columns).__qualname__}' == 'builtins.list'
    assert len(table_0.columns) == 1
    var_1 = table_0.get_primary_key_names()
    var_2 = table_0.get_foreign_key_names()
    var_3 = table_0.is_equivalent(var_1)
    assert var_3 is False
    var_4 = table_0.get_primary_key_names()
    var_5 = table_0.get_primary_keys()
    var_6 = table_0.add_primary_key(var_4)
    int_1 = -1281
    var_7 = table_0.get_number_of_columns()
    var_8 = table_0.add_foreign_key(int_0, var_2, int_1)
    var_9 = table_0.get_primary_key_names()
    var_10 = table_0.get_foreign_keys()
    var_11 = table_0.get_column_by_name(var_10)

@pytest.mark.xfail(strict=True)
def test_case_21():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_foreign_key_names()
    int_1 = 159
    var_1 = table_0.add_column(int_0, int_1, int_0)
    var_2 = table_0.add_primary_key(table_0)
    int_2 = -1281
    var_3 = table_0.add_foreign_key(int_0, var_0, int_2)
    var_4 = table_0.get_primary_key_names()
    var_5 = table_0.get_foreign_keys()
    var_6 = table_0.get_column_by_name(var_5)
    var_6.is_foreign()

@pytest.mark.xfail(strict=True)
def test_case_22():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    none_type_0 = None
    var_0 = table_0.add_column(none_type_0, table_0, none_type_0)
    assert f'{type(table_0.columns).__module__}.{type(table_0.columns).__qualname__}' == 'builtins.list'
    assert len(table_0.columns) == 1
    column_0 = module_1.Column(equivalences=table_0)
    var_1 = table_0.get_foreign_key_names()
    var_2 = table_0.get_primary_key_names()
    var_3 = table_0.get_primary_keys()
    var_4 = table_0.add_primary_key(var_2)
    int_1 = -1281
    var_5 = table_0.get_columns()
    var_6 = table_0.get_number_of_columns()
    var_7 = table_0.add_foreign_key(int_0, var_1, int_1)
    var_6.get_column_by_name(int_1)

@pytest.mark.xfail(strict=True)
def test_case_23():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    var_0 = table_0.get_primary_key_names()
    var_1 = table_0.get_foreign_key_names()
    var_2 = table_0.get_primary_key_names()
    var_3 = table_0.add_column(var_1, table_0, var_1)
    var_4 = table_0.get_primary_keys()
    var_5 = table_0.add_primary_key(var_2)
    int_1 = -1281
    var_6 = table_0.get_columns()
    var_7 = table_0.add_foreign_key(int_0, var_1, int_1)
    var_8 = table_0.get_primary_key_names()
    var_9 = table_0.get_foreign_keys()
    var_10 = table_0.get_column_by_name(var_9)
    assert f'{type(var_10).__module__}.{type(var_10).__qualname__}' == 'ln2sql.column.Column'
    assert var_10.primary is True
    assert var_10.foreign is False
    var_11 = var_10.is_foreign()
    assert var_11 is False
    var_12 = table_0.get_equivalences()
    var_12.add_equivalence(var_9)

@pytest.mark.xfail(strict=True)
def test_case_24():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    none_type_0 = None
    var_0 = table_0.add_column(none_type_0, table_0, none_type_0)
    assert f'{type(table_0.columns).__module__}.{type(table_0.columns).__qualname__}' == 'builtins.list'
    assert len(table_0.columns) == 1
    var_1 = table_0.add_primary_key(none_type_0)
    var_2 = table_0.get_foreign_key_names()
    var_3 = table_0.get_primary_key_names()
    var_4 = table_0.get_primary_keys()
    var_5 = table_0.add_primary_key(var_3)
    var_6 = table_0.get_columns()
    var_7 = table_0.get_number_of_columns()
    var_0.get_primary_keys()

@pytest.mark.xfail(strict=True)
def test_case_25():
    int_0 = -4722
    table_0 = module_0.Table(int_0)
    assert f'{type(table_0).__module__}.{type(table_0).__qualname__}' == 'ln2sql.table.Table'
    assert table_0.columns == []
    assert table_0.equivalences == []
    assert f'{type(module_0.Table.name).__module__}.{type(module_0.Table.name).__qualname__}' == 'builtins.property'
    none_type_0 = None
    var_0 = table_0.add_column(none_type_0, table_0, none_type_0)
    assert f'{type(table_0.columns).__module__}.{type(table_0.columns).__qualname__}' == 'builtins.list'
    assert len(table_0.columns) == 1
    var_1 = table_0.add_foreign_key(none_type_0, var_0, var_0)
    var_2 = table_0.get_primary_key_names()
    var_3 = table_0.get_foreign_key_names()
    var_4 = table_0.is_equivalent(var_2)
    assert var_4 is False
    var_5 = table_0.get_primary_key_names()
    var_6 = table_0.get_primary_keys()
    var_7 = table_0.add_primary_key(var_5)
    int_1 = -1281
    var_8 = table_0.get_columns()
    var_9 = table_0.get_number_of_columns()
    var_10 = table_0.add_foreign_key(int_0, var_3, int_1)
    var_11 = table_0.get_primary_key_names()
    var_1.get_columns()