# Automatically generated by Pynguin.
import pytest
import retriever.engines.jsonengine as module_0

def test_case_0():
    engine_0 = module_0.engine()
    assert module_0.engine.name == 'JSON'
    assert module_0.engine.abbreviation == 'json'
    assert module_0.engine.auto_column_number == 0
    assert module_0.engine.datatypes == {'auto': 'INTEGER', 'int': 'INTEGER', 'bigint': 'INTEGER', 'double': 'REAL', 'decimal': 'REAL', 'char': 'TEXT', 'bool': 'INTEGER'}
    assert module_0.engine.insert_limit == 1000
    assert module_0.engine.required_opts == [('table_name', 'Format of table name', '{db}_{table}.json'), ('data_dir', 'Install directory', '.')]

@pytest.mark.xfail(strict=True)
def test_case_1():
    list_0 = []
    engine_0 = module_0.engine(*list_0)
    assert module_0.engine.name == 'JSON'
    assert module_0.engine.abbreviation == 'json'
    assert module_0.engine.auto_column_number == 0
    assert module_0.engine.datatypes == {'auto': 'INTEGER', 'int': 'INTEGER', 'bigint': 'INTEGER', 'double': 'REAL', 'decimal': 'REAL', 'char': 'TEXT', 'bool': 'INTEGER'}
    assert module_0.engine.insert_limit == 1000
    assert module_0.engine.required_opts == [('table_name', 'Format of table name', '{db}_{table}.json'), ('data_dir', 'Install directory', '.')]
    engine_0.execute(list_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    engine_0 = module_0.engine()
    assert module_0.engine.name == 'JSON'
    assert module_0.engine.abbreviation == 'json'
    assert module_0.engine.auto_column_number == 0
    assert module_0.engine.datatypes == {'auto': 'INTEGER', 'int': 'INTEGER', 'bigint': 'INTEGER', 'double': 'REAL', 'decimal': 'REAL', 'char': 'TEXT', 'bool': 'INTEGER'}
    assert module_0.engine.insert_limit == 1000
    assert module_0.engine.required_opts == [('table_name', 'Format of table name', '{db}_{table}.json'), ('data_dir', 'Install directory', '.')]
    engine_0.connect(engine_0)

def test_case_3():
    engine_0 = module_0.engine()
    assert module_0.engine.name == 'JSON'
    assert module_0.engine.abbreviation == 'json'
    assert module_0.engine.auto_column_number == 0
    assert module_0.engine.datatypes == {'auto': 'INTEGER', 'int': 'INTEGER', 'bigint': 'INTEGER', 'double': 'REAL', 'decimal': 'REAL', 'char': 'TEXT', 'bool': 'INTEGER'}
    assert module_0.engine.insert_limit == 1000
    assert module_0.engine.required_opts == [('table_name', 'Format of table name', '{db}_{table}.json'), ('data_dir', 'Install directory', '.')]
    var_0 = engine_0.disconnect()

@pytest.mark.xfail(strict=True)
def test_case_4():
    engine_0 = module_0.engine()
    assert module_0.engine.name == 'JSON'
    assert module_0.engine.abbreviation == 'json'
    assert module_0.engine.auto_column_number == 0
    assert module_0.engine.datatypes == {'auto': 'INTEGER', 'int': 'INTEGER', 'bigint': 'INTEGER', 'double': 'REAL', 'decimal': 'REAL', 'char': 'TEXT', 'bool': 'INTEGER'}
    assert module_0.engine.insert_limit == 1000
    assert module_0.engine.required_opts == [('table_name', 'Format of table name', '{db}_{table}.json'), ('data_dir', 'Install directory', '.')]
    engine_0.insert_statement(engine_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    engine_0 = module_0.engine()
    assert module_0.engine.name == 'JSON'
    assert module_0.engine.abbreviation == 'json'
    assert module_0.engine.auto_column_number == 0
    assert module_0.engine.datatypes == {'auto': 'INTEGER', 'int': 'INTEGER', 'bigint': 'INTEGER', 'double': 'REAL', 'decimal': 'REAL', 'char': 'TEXT', 'bool': 'INTEGER'}
    assert module_0.engine.insert_limit == 1000
    assert module_0.engine.required_opts == [('table_name', 'Format of table name', '{db}_{table}.json'), ('data_dir', 'Install directory', '.')]
    var_0 = engine_0.create_db()
    none_type_0 = None
    var_0.read(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    engine_0 = module_0.engine()
    assert module_0.engine.name == 'JSON'
    assert module_0.engine.abbreviation == 'json'
    assert module_0.engine.auto_column_number == 0
    assert module_0.engine.datatypes == {'auto': 'INTEGER', 'int': 'INTEGER', 'bigint': 'INTEGER', 'double': 'REAL', 'decimal': 'REAL', 'char': 'TEXT', 'bool': 'INTEGER'}
    assert module_0.engine.insert_limit == 1000
    assert module_0.engine.required_opts == [('table_name', 'Format of table name', '{db}_{table}.json'), ('data_dir', 'Install directory', '.')]
    engine_0.executemany(engine_0, engine_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    engine_0 = module_0.engine()
    assert module_0.engine.name == 'JSON'
    assert module_0.engine.abbreviation == 'json'
    assert module_0.engine.auto_column_number == 0
    assert module_0.engine.datatypes == {'auto': 'INTEGER', 'int': 'INTEGER', 'bigint': 'INTEGER', 'double': 'REAL', 'decimal': 'REAL', 'char': 'TEXT', 'bool': 'INTEGER'}
    assert module_0.engine.insert_limit == 1000
    assert module_0.engine.required_opts == [('table_name', 'Format of table name', '{db}_{table}.json'), ('data_dir', 'Install directory', '.')]
    var_0 = engine_0.disconnect()
    none_type_0 = None
    engine_0.table_exists(none_type_0, none_type_0)

def test_case_8():
    engine_0 = module_0.engine()
    assert module_0.engine.name == 'JSON'
    assert module_0.engine.abbreviation == 'json'
    assert module_0.engine.auto_column_number == 0
    assert module_0.engine.datatypes == {'auto': 'INTEGER', 'int': 'INTEGER', 'bigint': 'INTEGER', 'double': 'REAL', 'decimal': 'REAL', 'char': 'TEXT', 'bool': 'INTEGER'}
    assert module_0.engine.insert_limit == 1000
    assert module_0.engine.required_opts == [('table_name', 'Format of table name', '{db}_{table}.json'), ('data_dir', 'Install directory', '.')]
    var_0 = engine_0.drop_statement(engine_0, engine_0)
    var_1 = engine_0.format_insert_value(var_0, var_0)