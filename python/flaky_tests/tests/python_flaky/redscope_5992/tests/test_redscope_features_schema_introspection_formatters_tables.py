# Automatically generated by Pynguin.
import redscope.features.schema_introspection.formatters.tables as module_0

def test_case_0():
    str_0 = ' is not a valid name. Allowed values are '
    table_formatter_0 = module_0.TableFormatter()
    assert f'{type(table_formatter_0).__module__}.{type(table_formatter_0).__qualname__}' == 'redscope.features.schema_introspection.formatters.tables.TableFormatter'
    assert table_formatter_0.raw_ddl == ()
    tuple_0 = (str_0,)
    list_0 = table_formatter_0.format(tuple_0)
    table_formatter_1 = module_0.TableFormatter(tuple_0)
    assert f'{type(table_formatter_1).__module__}.{type(table_formatter_1).__qualname__}' == 'redscope.features.schema_introspection.formatters.tables.TableFormatter'
    assert table_formatter_1.raw_ddl == (' is not a valid name. Allowed values are ',)

def test_case_1():
    str_0 = ' is not a valid name. Allowed values are '
    table_formatter_0 = module_0.TableFormatter()
    assert f'{type(table_formatter_0).__module__}.{type(table_formatter_0).__qualname__}' == 'redscope.features.schema_introspection.formatters.tables.TableFormatter'
    assert table_formatter_0.raw_ddl == ()
    tuple_0 = (str_0,)
    list_0 = table_formatter_0.format(tuple_0)

def test_case_2():
    bytes_0 = b'\x08*n]\xbcQ+\x96P\xc8 '
    dict_0 = {bytes_0: bytes_0, bytes_0: bytes_0, bytes_0: bytes_0}
    table_formatter_0 = module_0.TableFormatter()
    assert f'{type(table_formatter_0).__module__}.{type(table_formatter_0).__qualname__}' == 'redscope.features.schema_introspection.formatters.tables.TableFormatter'
    assert table_formatter_0.raw_ddl == ()
    list_0 = table_formatter_0.format(dict_0)