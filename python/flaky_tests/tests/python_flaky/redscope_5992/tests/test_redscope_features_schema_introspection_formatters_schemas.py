# Automatically generated by Pynguin.
import pytest
import redscope.features.schema_introspection.db_objects.schema as module_0
import redscope.features.schema_introspection.formatters.schemas as module_1
import abc as module_2

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = "SWE<9sk&qb0'q3RftB"
    schema_0 = module_0.Schema(str_0)
    schema_1 = module_0.Schema(schema_0)
    list_0 = [schema_1, schema_1, schema_1]
    schema_formatter_0 = module_1.SchemaFormatter()
    assert f'{type(schema_formatter_0).__module__}.{type(schema_formatter_0).__qualname__}' == 'redscope.features.schema_introspection.formatters.schemas.SchemaFormatter'
    schema_formatter_0.format(list_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = ''
    list_0 = []
    schema_formatter_0 = module_1.SchemaFormatter(*list_0)
    assert f'{type(schema_formatter_0).__module__}.{type(schema_formatter_0).__qualname__}' == 'redscope.features.schema_introspection.formatters.schemas.SchemaFormatter'
    list_1 = schema_formatter_0.format(str_0)
    bool_0 = True
    list_2 = [bool_0, bool_0, bool_0]
    str_1 = 'le17tD+6A`-,RrlQ9)'
    str_2 = "cKtx'"
    dict_0 = {str_1: bool_0, str_1: str_1, str_1: str_1, str_2: str_1}
    module_1.SchemaFormatter(*list_2, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    a_b_c_0 = module_2.ABC()
    schema_formatter_0 = module_1.SchemaFormatter()
    assert f'{type(schema_formatter_0).__module__}.{type(schema_formatter_0).__qualname__}' == 'redscope.features.schema_introspection.formatters.schemas.SchemaFormatter'
    none_type_0 = None
    list_0 = [none_type_0, none_type_0]
    module_1.SchemaFormatter(*list_0)