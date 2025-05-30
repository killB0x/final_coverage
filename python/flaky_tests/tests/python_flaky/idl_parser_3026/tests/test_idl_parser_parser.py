# Automatically generated by Pynguin.
import pytest
import idl_parser.parser as module_0
import idl_parser.typedef as module_1
import idl_parser.struct as module_2
import re as module_3

@pytest.mark.xfail(strict=True)
def test_case_0():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    console_tracker_0 = module_0.ConsoleTracker()
    var_0 = console_tracker_0.deindent()
    var_1 = console_tracker_0.deindent()
    i_d_l_parser_0.is_primitive(i_d_l_parser_0, console_tracker_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    var_0 = i_d_l_parser_0.parse()
    i_d_l_parser_1 = module_0.IDLParser(verbose=i_d_l_parser_0)
    i_d_l_parser_2 = module_0.IDLParser(i_d_l_parser_0)
    var_1 = i_d_l_parser_1.parse()
    var_2 = var_1.__str__()
    var_3 = var_2.__str__()
    var_2.member_by_name(var_1)

@pytest.mark.xfail(strict=True)
def test_case_2():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    i_d_l_parser_0.is_primitive(i_d_l_parser_0, i_d_l_parser_0)

def test_case_3():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    var_0 = i_d_l_parser_0.parse(except_files=i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    i_d_l_parser_0.parse_idl(i_d_l_parser_0)

def test_case_5():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    var_0 = i_d_l_parser_0.for_each_idl(i_d_l_parser_0, except_files=i_d_l_parser_0, find_all=i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    i_d_l_parser_0.for_each_idl(i_d_l_parser_0, except_files=i_d_l_parser_0, idls=i_d_l_parser_0, find_all=i_d_l_parser_0)

def test_case_7():
    console_tracker_0 = module_0.ConsoleTracker()

@pytest.mark.xfail(strict=True)
def test_case_8():
    console_tracker_0 = module_0.ConsoleTracker()
    assert module_0.offset == 1
    i_d_l_parser_0 = module_0.IDLParser(console_tracker_0, console_tracker_0)
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    i_d_l_parser_0.parse_idl(console_tracker_0)

def test_case_9():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'

@pytest.mark.xfail(strict=True)
def test_case_10():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    console_tracker_0 = i_d_l_parser_0.parse(except_files=i_d_l_parser_0)
    i_d_l_parser_0.prepare_input(i_d_l_parser_0)

def test_case_11():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = '|v'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'

@pytest.mark.xfail(strict=True)
def test_case_12():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    i_d_l_parser_1 = module_0.IDLParser(i_d_l_parser_0)
    var_0 = i_d_l_parser_0.parse()
    i_d_l_parser_0.is_primitive(var_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    i_d_l_parser_0.parse_lines(i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    set_0 = {i_d_l_parser_0}
    i_d_l_parser_0.parse_lines(set_0, set_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    none_type_0 = None
    set_0 = {none_type_0, none_type_0, none_type_0, none_type_0}
    i_d_l_parser_0.parse(set_0, except_files=none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    set_0 = set()
    var_0 = i_d_l_parser_0.parse_lines(set_0, set_0)
    assert module_0.offset == 0
    var_0.is_primitive(var_0, set_0)

@pytest.mark.xfail(strict=True)
def test_case_17():
    none_type_0 = None
    bool_0 = False
    i_d_l_parser_0 = module_0.IDLParser(none_type_0, bool_0)
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    i_d_l_parser_0.includes(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = ''
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    var_1 = i_d_l_parser_0.generate_constructor_python(var_0)
    assert var_1 == ''
    str_0.to_simple_dic()

@pytest.mark.xfail(strict=True)
def test_case_19():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    none_type_0 = None
    str_0 = 'parse(\n'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    assert module_0.offset == 1
    set_0 = set()
    var_1 = i_d_l_parser_0.parse()
    var_2 = i_d_l_parser_0.parse_lines(set_0, none_type_0)
    assert module_0.offset == 0
    i_d_l_parser_0.parse_idl(i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_20():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = 'V}&~3\\Q'
    bool_0 = False
    i_d_l_parser_0.includes(bool_0)
    var_0 = i_d_l_parser_0.load(str_0)
    var_1 = i_d_l_parser_0.is_primitive(str_0)
    var_2 = i_d_l_parser_0.parse()
    var_3 = i_d_l_parser_0.parse_idl(i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = '|v'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    assert module_0.offset == 1
    var_1 = i_d_l_parser_0.generate_constructor_python(var_0)
    assert var_1 == ''
    str_0.to_simple_dic()

@pytest.mark.xfail(strict=True)
def test_case_22():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = 'g\n.ZdXdda~Kk~4rD{\\C}'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    assert module_0.offset == 2
    var_1 = var_0.to_simple_dic()
    var_1.parse_blocks(var_1, i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_23():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = ':\nO<iR`)'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    var_1 = i_d_l_parser_0.is_primitive(str_0)
    var_2 = i_d_l_parser_0.is_primitive(str_0, i_d_l_parser_0)
    var_3 = i_d_l_parser_0.parse()
    i_d_l_parser_0.parse_idl(i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_24():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = 'g`.ZdXdda~Kk~4D{]C}'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    assert module_0.offset == 1
    str_0.for_each_typedef(str_0)

@pytest.mark.xfail(strict=True)
def test_case_25():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = "n`V; 1n'0"
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    var_1 = i_d_l_parser_0.is_primitive(str_0)
    var_2 = i_d_l_parser_0.is_primitive(str_0, i_d_l_parser_0)
    var_3 = i_d_l_parser_0.parse()
    i_d_l_parser_0.parse_idl(i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    none_type_0 = None
    var_0 = module_1.IDLTypedef(none_type_0)
    i_d_l_parser_0.generate_constructor_python(var_0)

@pytest.mark.xfail(strict=True)
def test_case_27():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = 'V}&~3\\Q'
    var_0 = module_2.IDLStruct(str_0, str_0)
    i_d_l_parser_0.generate_constructor_python(var_0)

@pytest.mark.xfail(strict=True)
def test_case_28():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = 'string'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    var_1 = i_d_l_parser_0.is_primitive(str_0)
    assert var_1 is True
    var_2 = i_d_l_parser_0.is_primitive(str_0, i_d_l_parser_0)
    assert var_2 is False
    i_d_l_parser_0.parse_idl(i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_29():
    i_d_l_parser_0 = module_0.IDLParser()
    assert module_0.offset == 1
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = '#endif'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    var_1 = i_d_l_parser_0.is_primitive(str_0)
    var_2 = var_0.typedef_by_name(var_1)
    var_3 = i_d_l_parser_0.parse()
    i_d_l_parser_0.parse_idl(i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_30():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = '7fs.C//->'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    var_1 = i_d_l_parser_0.generate_constructor_python(var_0)
    assert var_1 == ''
    var_2 = i_d_l_parser_0.is_primitive(str_0)
    var_3 = module_3.RegexFlag.TEMPLATE
    str_1 = 'Xdein&'
    var_4 = i_d_l_parser_0.is_primitive(str_1, str_1)
    var_5 = i_d_l_parser_0.parse()
    var_3.const_by_name(i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_31():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    list_0 = [i_d_l_parser_0, i_d_l_parser_0, i_d_l_parser_0]
    i_d_l_parser_0.parse(idl_dirs=list_0)

@pytest.mark.xfail(strict=True)
def test_case_32():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = '/*'
    var_0 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_0.sep == '::'
    assert module_0.offset == 0
    var_1 = i_d_l_parser_0.generate_constructor_python(var_0)
    assert var_1 == ''
    var_2 = i_d_l_parser_0.is_primitive(str_0)
    str_1 = 'Nstynk'
    var_3 = i_d_l_parser_0.is_primitive(str_1, str_1)
    var_4 = i_d_l_parser_0.parse()
    i_d_l_parser_0.parse_idl(i_d_l_parser_0)

@pytest.mark.xfail(strict=True)
def test_case_33():
    i_d_l_parser_0 = module_0.IDLParser()
    assert f'{type(module_0.IDLParser.global_module).__module__}.{type(module_0.IDLParser.global_module).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.IDLParser.dirs).__module__}.{type(module_0.IDLParser.dirs).__qualname__}' == 'builtins.property'
    str_0 = '49wOY\\3'
    var_0 = i_d_l_parser_0.parse(except_files=i_d_l_parser_0)
    var_1 = i_d_l_parser_0.load(str_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'idl_parser.module.IDLModule'
    assert var_1.sep == '::'
    assert module_0.offset == 1
    var_2 = i_d_l_parser_0.generate_constructor_python(var_1)
    assert var_2 == ''
    var_3 = i_d_l_parser_0.is_primitive(str_0)
    str_1 = 'wstring'
    var_4 = i_d_l_parser_0.is_primitive(str_1, str_1)
    assert var_4 is False
    var_5 = i_d_l_parser_0.parse()
    i_d_l_parser_0.parse_idl(i_d_l_parser_0)