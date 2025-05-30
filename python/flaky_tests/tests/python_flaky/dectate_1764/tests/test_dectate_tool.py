# Automatically generated by Pynguin.
import pytest
import dectate.tool as module_0
import argparse as module_1
import inspect as module_2
import ast as module_3

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    module_0.query_tool(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    none_type_0 = None
    module_0.query_app(none_type_0, none_type_0)

def test_case_2():
    str_0 = 'f.a42#'
    with pytest.raises(module_1.ArgumentTypeError):
        module_0.parse_app_class(str_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = '.Yi_&JL`TMSn98xlTj'
    module_0.parse_app_class(str_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = '.Yi_&JL`TMSnR98xlTj'
    module_0.convert_dotted_name(str_0)

def test_case_5():
    none_type_0 = None
    with pytest.raises(ValueError):
        module_0.convert_bool(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = 'f.a42#'
    module_0.resolve_dotted_name(str_0)

def test_case_7():
    tool_error_0 = module_0.ToolError()

def test_case_8():
    str_0 = '.Yi_&JL`TMSn98xlTj'
    var_0 = module_0.convert_default(str_0)
    with pytest.raises(ValueError):
        module_0.resolve_dotted_name(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    str_0 = '.Yi_&JL`TMSn}m98xlTj'
    module_0.query_app(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    str_0 = 're.LOCALE'
    var_0 = module_0.query_tool_output(str_0, str_0, str_0)
    module_2.getblock(var_0)

def test_case_11():
    str_0 = 'f.a42#'
    with pytest.raises(module_0.ToolError):
        module_0.convert_dotted_name(str_0)

def test_case_12():
    set_0 = set()
    none_type_0 = None
    var_0 = module_0.query_tool_output(set_0, set_0, none_type_0)
    var_1 = module_0.parse_filters(var_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = 'True'
    var_0 = module_0.query_tool_output(str_0, str_0, str_0)
    tool_error_0 = module_0.ToolError()
    var_1 = module_0.convert_default(str_0)
    var_2 = module_0.convert_bool(str_0)
    assert var_2 is True
    var_2.visit_IfExp(str_0)

def test_case_14():
    str_0 = '.Yi_&JL`TMSn98xlTj'
    with pytest.raises(ValueError):
        module_0.resolve_dotted_name(str_0, str_0)

def test_case_15():
    str_0 = '.Yi_&JL`TMSn98xlTj'
    with pytest.raises(ValueError):
        module_0.resolve_dotted_name(str_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    str_0 = '.'
    module_0.resolve_dotted_name(str_0, str_0)

def test_case_17():
    set_0 = set()
    none_type_0 = None
    var_0 = module_0.query_tool_output(set_0, set_0, none_type_0)
    tuple_0 = module_3.Tuple(*var_0)
    assert f'{type(tuple_0).__module__}.{type(tuple_0).__qualname__}' == 'ast.Tuple'

@pytest.mark.xfail(strict=True)
def test_case_18():
    bytes_0 = b'\xe0\xab:9)\x01Lcy\xa7\xa0>\x96\x15:\x87\xfd'
    module_0.parse_filters(bytes_0)

def test_case_19():
    none_type_0 = None
    var_0 = module_2.isframe(none_type_0)
    var_1 = var_0.__repr__()
    var_2 = module_0.convert_bool(var_1)
    assert var_2 is False

def test_case_20():
    str_0 = 'io'
    var_0 = module_0.resolve_dotted_name(str_0)

def test_case_21():
    str_0 = 'io'
    with pytest.raises(module_1.ArgumentTypeError):
        module_0.parse_app_class(str_0)

def test_case_22():
    str_0 = 'io.'
    with pytest.raises(module_1.ArgumentTypeError):
        module_0.parse_app_class(str_0)