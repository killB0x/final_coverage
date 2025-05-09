# Automatically generated by Pynguin.
import pytest
import ln2sql.parsingException as module_0
import builtins as module_1

def test_case_0():
    float_0 = -379.44042
    parsing_exception_0 = module_0.ParsingException(float_0)
    assert f'{type(parsing_exception_0).__module__}.{type(parsing_exception_0).__qualname__}' == 'ln2sql.parsingException.ParsingException'
    assert parsing_exception_0.reason == pytest.approx(-379.44042, abs=0.01, rel=0.01)
    parsing_exception_1 = module_0.ParsingException(float_0)
    assert parsing_exception_1.reason == pytest.approx(-379.44042, abs=0.01, rel=0.01)

def test_case_1():
    exception_0 = module_1.Exception()
    parsing_exception_0 = module_0.ParsingException(exception_0)
    assert f'{type(parsing_exception_0).__module__}.{type(parsing_exception_0).__qualname__}' == 'ln2sql.parsingException.ParsingException'
    assert f'{type(parsing_exception_0.reason).__module__}.{type(parsing_exception_0.reason).__qualname__}' == 'builtins.Exception'
    parsing_exception_1 = module_0.ParsingException()
    assert parsing_exception_1.reason == ''
    var_0 = parsing_exception_1.__str__()
    assert var_0 == '\x1b[1m\x1b[91m\x1b[0m'
    parsing_exception_2 = module_0.ParsingException()
    assert parsing_exception_2.reason == ''
    parsing_exception_3 = module_0.ParsingException(exception_0)
    var_1 = parsing_exception_2.__str__()
    assert var_1 == '\x1b[1m\x1b[91m\x1b[0m'