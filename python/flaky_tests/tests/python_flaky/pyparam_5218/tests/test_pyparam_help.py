# Automatically generated by Pynguin.
import pytest
import pyparam.help as module_0
import pygments.regexopt as module_1
import pygments.plugin as module_2
import colorama.win32 as module_3
import codecs as module_4
import posixpath as module_5
import pygments.lexer as module_6

def test_case_0():
    str_0 = "<g`)y9'%ag\r\nW0"
    dict_0 = {str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = helps_0.delete(str_0)
    assert len(helps_0) == 0
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_0) == 0

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'hKE'
    dict_0 = {str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    helps_0.delete(helps_0)

def test_case_2():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'

@pytest.mark.xfail(strict=True)
def test_case_3():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_options_0.delete(help_options_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_options_0.add_param(help_options_0)

def test_case_5():
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}

@pytest.mark.xfail(strict=True)
def test_case_6():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    none_type_0 = None
    help_options_0.after(none_type_0, help_options_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_options_0.add_command(help_options_0, help_options_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = 'hKE'
    dict_0 = {str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = helps_0.__getitem__(str_0)
    var_1 = helps_0.delete(var_0)
    assert len(helps_0) == 0
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_1) == 0
    var_2 = var_1.add(var_0, str_0)
    assert len(helps_0) == 1
    assert len(var_1) == 1
    assert f'{type(var_2).__module__}.{type(var_2).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_2) == 1
    var_1.delete(var_1)

@pytest.mark.xfail(strict=True)
def test_case_9():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_options_0.select(help_options_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_options_0.replace(help_options_0, help_options_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = 'ihArE'
    dict_0 = {str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = helps_0.query(str_0, helps_0)
    assert var_0 == 'ihArE'
    var_0.opttype(str_0)

def test_case_12():
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.prog()
    assert var_0 == '\x1b[1m\x1b[32mpynguin\x1b[0m'
    none_type_0 = None
    var_1 = help_assembler_0.optdesc(var_0, none_type_0)
    assert var_1 == '\x1b[1m\x1b[32mpynguin\x1b[0m\x1b[0m'

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = 'hKE'
    dict_0 = {str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = helps_0.__getitem__(str_0)
    var_1 = helps_0.delete(var_0)
    assert len(helps_0) == 0
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_1) == 0
    var_1.delete(var_1)

@pytest.mark.xfail(strict=True)
def test_case_14():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    none_type_0 = None
    help_options_0.add(none_type_0, ishelp=none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.prog()
    assert var_0 == '\x1b[1m\x1b[32mpynguin\x1b[0m'
    var_1 = help_assembler_0.optdesc(var_0, help_assembler_0)
    assert var_1 == '\x1b[35m\x1b[1m\x1b[32mpynguin\x1b[0m\x1b[0m'
    none_type_0 = None
    module_1.make_charset(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    bool_0 = False
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = module_2.find_plugin_filters()
    help_options_0.before(bool_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_17():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_options_0.insert(help_options_0, help_options_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    str_0 = ')Uv09X61Ko6oi*D'
    str_1 = 'd1'
    dict_0 = {str_1: str_0, str_1: str_0, str_1: str_0}
    help_options_0 = module_0.HelpOptions(**dict_0)
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.optdesc(str_1, dict_0)
    assert var_0 == '\x1b[35md1\x1b[0m'
    help_options_0.add_command(str_0, str_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_19():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    var_0 = help_options_0.fix_mixed()
    help_options_0.insert(help_options_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_20():
    str_0 = ')Uv09X6oKo6oi*D'
    str_1 = 'F4,^'
    str_2 = '1'
    dict_0 = {str_2: str_0, str_0: str_2, str_1: str_0, str_2: str_0}
    help_options_0 = module_0.HelpOptions(**dict_0)
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    str_3 = '=1N~K\t\n(#bvrN+'
    dict_1 = {str_0: str_0, str_3: str_3}
    var_0 = help_assembler_0.opttype(str_0)
    assert var_0 == '\x1b[34m)UV09X6OKO6OI*D\x1b[0m'
    helps_0 = module_0.Helps(**dict_1)
    var_1 = helps_0.before(str_3, var_0)
    assert len(helps_0) == 3
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_1) == 3
    var_2 = help_assembler_0.assemble(helps_0)
    var_3 = helps_0.__getitem__(str_3)
    var_4 = help_assembler_0.error(str_0, dict_0)
    assert var_4 == '\x1b[31mError: )Uv09X6oKo6oi*D\x1b[0m'
    help_options_0.add_command(var_0, var_0)

def test_case_21():
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    str_0 = 'o \roX6fC\x0bh!\t%i79z.i'
    dict_0 = {str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = help_assembler_0.assemble(helps_0)

@pytest.mark.xfail(strict=True)
def test_case_22():
    str_0 = '#OT:&ewC'
    tuple_0 = (str_0, str_0)
    module_0.HelpOptions(*tuple_0)

@pytest.mark.xfail(strict=True)
def test_case_23():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_options_0.add(help_options_0)
    var_1 = help_assembler_0.prog()
    assert var_1 == '\x1b[1m\x1b[32mpynguin\x1b[0m'
    var_2 = help_assembler_0.optdesc(var_1, help_assembler_0)
    assert var_2 == '\x1b[35m\x1b[1m\x1b[32mpynguin\x1b[0m\x1b[0m'
    help_options_0.add_param(var_0, help_assembler_0)

def test_case_24():
    str_0 = '/`TW%eHnZS\r'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = helps_0.before(str_0, str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_0) == 1

@pytest.mark.xfail(strict=True)
def test_case_25():
    str_0 = '1'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    helps_0.add(helps_0, helps_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    str_0 = ')Uv09X6oKo6o\ti*D'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.prog(str_0)
    assert var_0 == '\x1b[1m\x1b[32m)Uv09X6oKo6o\ti*D\x1b[0m'
    str_1 = '/`TW%eHnZS\r'
    var_1 = help_assembler_0.optdesc(str_0, help_assembler_0)
    assert var_1 == '\x1b[35m)Uv09X6oKo6o\ti*D\x1b[0m'
    dict_0 = {str_0: str_0, var_1: str_1, str_1: str_1}
    var_2 = help_assembler_0.optdesc(var_1)
    assert var_2 == '\x1b[35m)Uv09X6oKo6o\ti*D\x1b[0m\x1b[0m'
    helps_0 = module_0.Helps(**dict_0)
    var_3 = help_assembler_0.error(str_1)
    assert var_3 == '\x1b[31mError: /`TW%eHnZS\r\x1b[0m'
    var_4 = help_assembler_0.optname(var_0, var_0)
    assert var_4 == '\x1b[1m\x1b[32m\x1b[1m\x1b[32m)Uv09X6oKo6o\ti*D\x1b[0m\x1b[1m\x1b[32m)Uv09X6oKo6o\ti*D\x1b[0m\x1b[0m'
    var_5 = helps_0.before(str_1, var_0)
    assert len(helps_0) == 4
    assert f'{type(var_5).__module__}.{type(var_5).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_5) == 4
    var_6 = help_assembler_0.assemble(helps_0)
    var_5.add(helps_0, str_0)

def test_case_27():
    str_0 = '1'
    str_1 = '/`TW%eHnZS\r'
    dict_0 = {str_0: str_0, str_0: str_1, str_1: str_1}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = helps_0.before(str_1, str_1)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_0) == 2

@pytest.mark.xfail(strict=True)
def test_case_28():
    str_0 = 'iho\trE'
    help_option_descriptions_0 = module_0.HelpOptionDescriptions()
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.warning(str_0, help_option_descriptions_0)
    assert var_0 == '\x1b[33miho\trE\x1b[0m'
    var_1 = module_1.make_charset(var_0)
    assert var_1 == '[\x1b\\[33miho\trE\x1b\\[0m]'
    module_3.<lambda>()

def test_case_29():
    str_0 = '1'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.warning(str_0)
    assert var_0 == '\x1b[33mWarning: 1\x1b[0m'
    str_1 = '/`TW%eHnZS\r'
    dict_0 = {str_1: str_1, var_0: str_1, str_1: str_1}
    helps_0 = module_0.Helps(**dict_0)
    var_1 = help_assembler_0.error(str_0)
    assert var_1 == '\x1b[31mError: 1\x1b[0m'
    var_2 = helps_0.before(str_1, help_assembler_0)
    assert len(helps_0) == 3
    assert f'{type(var_2).__module__}.{type(var_2).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_2) == 3
    var_3 = help_assembler_0.assemble(helps_0)

@pytest.mark.xfail(strict=True)
def test_case_30():
    str_0 = '}ofC'
    help_option_descriptions_0 = module_0.HelpOptionDescriptions()
    var_0 = help_option_descriptions_0.add(str_0)
    assert len(help_option_descriptions_0) == 1
    assert len(var_0) == 1
    var_1 = help_option_descriptions_0.select(str_0)
    assert var_1 == '}ofC'
    var_2 = var_0.after(str_0, var_0)
    assert len(help_option_descriptions_0) == 2
    assert len(var_0) == 2
    assert f'{type(var_2).__module__}.{type(var_2).__qualname__}' == 'pyparam.help.HelpOptionDescriptions'
    assert len(var_2) == 2
    help_assembler_0 = module_0.HelpAssembler(var_2)
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert f'{type(help_assembler_0.progname).__module__}.{type(help_assembler_0.progname).__qualname__}' == 'pyparam.help.HelpOptionDescriptions'
    assert len(help_assembler_0.progname) == 2
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0.after(help_option_descriptions_0, var_2)

@pytest.mark.xfail(strict=True)
def test_case_31():
    str_0 = '1'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.warning(str_0)
    assert var_0 == '\x1b[33mWarning: 1\x1b[0m'
    str_1 = '/`TW%eHnZS\r'
    dict_0 = {str_1: str_1, str_0: str_1, str_1: str_1}
    helps_0 = module_0.Helps(**dict_0)
    var_1 = helps_0.after(str_0, var_0, *dict_0)
    assert len(helps_0) == 3
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_1) == 3
    var_2 = helps_0.before(str_1, str_1)
    assert f'{type(var_2).__module__}.{type(var_2).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_2) == 3
    var_3 = help_assembler_0.assemble(helps_0)
    var_2.add(helps_0, var_2)

def test_case_32():
    str_0 = 'ihArE'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    dict_0 = {str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = helps_0.query(str_0, helps_0)
    assert var_0 == 'ihArE'
    var_1 = help_assembler_0.opttype(str_0)
    assert var_1 == '\x1b[34mIHARE\x1b[0m'

@pytest.mark.xfail(strict=True)
def test_case_33():
    helps_0 = module_0.Helps()
    help_assembler_0 = module_0.HelpAssembler(theme=helps_0)
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = helps_0.__repr__()
    str_0 = 'F^1$S\x0baudm4'
    var_1 = helps_0.setdefault(str_0, var_0)
    var_0.cursor_adjust(helps_0, helps_0)

@pytest.mark.xfail(strict=True)
def test_case_34():
    str_0 = ')Uv09X6oKo6oi*D'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.plain(str_0)
    assert var_0 == ')Uv09X6oKo6oi*D'
    module_0.HelpAssembler(str_0, var_0)

def test_case_35():
    str_0 = '1'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = helps_0.before(str_0, str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_0) == 1

@pytest.mark.xfail(strict=True)
def test_case_36():
    str_0 = '}ofC'
    help_option_descriptions_0 = module_0.HelpOptionDescriptions()
    var_0 = help_option_descriptions_0.add(str_0)
    assert len(help_option_descriptions_0) == 1
    assert len(var_0) == 1
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_1 = help_assembler_0.prog()
    assert var_1 == '\x1b[1m\x1b[32mpynguin\x1b[0m'
    var_2 = help_option_descriptions_0.add(help_option_descriptions_0)
    assert len(help_option_descriptions_0) == 2
    assert len(var_0) == 2
    assert f'{type(var_2).__module__}.{type(var_2).__qualname__}' == 'pyparam.help.HelpOptionDescriptions'
    assert len(var_2) == 2
    str_1 = ''
    dict_0 = {str_1: help_option_descriptions_0, str_0: str_0, str_0: str_1, str_1: str_0}
    helps_0 = module_0.Helps(**dict_0)
    var_3 = help_assembler_0.opttype(str_1)
    assert var_3 == ''
    var_4 = help_assembler_0.assemble(helps_0)
    var_5 = helps_0.__getitem__(str_1)
    var_6 = helps_0.delete(var_5)
    assert len(helps_0) == 1
    assert f'{type(var_6).__module__}.{type(var_6).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_6) == 1
    var_7 = var_6.add(help_assembler_0)
    assert len(helps_0) == 2
    assert len(var_6) == 2
    assert f'{type(var_7).__module__}.{type(var_7).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_7) == 2
    var_8 = help_option_descriptions_0.replace(str_0, help_option_descriptions_0)
    assert f'{type(var_8).__module__}.{type(var_8).__qualname__}' == 'pyparam.help.HelpOptionDescriptions'
    assert len(var_8) == 2
    buffered_incremental_decoder_0 = module_4.BufferedIncrementalDecoder()
    var_5.get_background_style_defs(var_5)

@pytest.mark.xfail(strict=True)
def test_case_37():
    str_0 = "`H$o0'$Xo>Xvd/D_/~i"
    help_option_descriptions_0 = module_0.HelpOptionDescriptions()
    var_0 = help_option_descriptions_0.add(str_0)
    assert len(help_option_descriptions_0) == 1
    assert len(var_0) == 1
    var_1 = var_0.after(str_0, var_0)
    assert len(help_option_descriptions_0) == 2
    assert len(var_0) == 2
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'pyparam.help.HelpOptionDescriptions'
    assert len(var_1) == 2
    var_0.after(var_0, var_1, *help_option_descriptions_0, **var_1)

@pytest.mark.xfail(strict=True)
def test_case_38():
    str_0 = '}ofC'
    help_items_0 = module_0.HelpItems()
    help_option_descriptions_0 = module_0.HelpOptionDescriptions()
    var_0 = help_option_descriptions_0.add(str_0)
    assert len(help_option_descriptions_0) == 1
    assert len(var_0) == 1
    var_1 = var_0.after(str_0, var_0)
    assert len(help_option_descriptions_0) == 2
    assert len(var_0) == 2
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'pyparam.help.HelpOptionDescriptions'
    assert len(var_1) == 2
    var_2 = var_0.select(str_0)
    var_3 = var_0.before(var_2, var_2)
    assert len(help_option_descriptions_0) == 3
    assert len(var_0) == 3
    assert len(var_1) == 3
    assert len(var_3) == 3
    var_1.assemble(var_0)

@pytest.mark.xfail(strict=True)
def test_case_39():
    str_0 = 'a|C'
    help_option_descriptions_0 = module_0.HelpOptionDescriptions()
    var_0 = help_option_descriptions_0.add(str_0)
    assert len(help_option_descriptions_0) == 1
    assert len(var_0) == 1
    var_1 = var_0.after(str_0, var_0)
    assert len(help_option_descriptions_0) == 2
    assert len(var_0) == 2
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'pyparam.help.HelpOptionDescriptions'
    assert len(var_1) == 2
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_2 = help_assembler_0.optdesc(str_0, str_0)
    assert var_2 == '\x1b[35ma|C\x1b[0m'
    help_assembler_0.error(var_0)

@pytest.mark.xfail(strict=True)
def test_case_40():
    str_0 = '}ofC'
    help_items_0 = module_0.HelpItems()
    help_option_descriptions_0 = module_0.HelpOptionDescriptions()
    var_0 = help_option_descriptions_0.add(str_0)
    assert len(help_option_descriptions_0) == 1
    assert len(var_0) == 1
    var_1 = var_0.after(str_0, var_0)
    assert len(help_option_descriptions_0) == 2
    assert len(var_0) == 2
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'pyparam.help.HelpOptionDescriptions'
    assert len(var_1) == 2
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_2 = help_option_descriptions_0.add(help_option_descriptions_0)
    assert len(help_option_descriptions_0) == 4
    assert len(var_0) == 4
    assert len(var_1) == 4
    assert len(var_2) == 4
    var_3 = var_0.select(str_0)
    var_4 = var_0.before(var_3, var_2)
    assert len(help_option_descriptions_0) == 8
    assert len(var_0) == 8
    assert len(var_1) == 8
    assert len(var_2) == 8
    assert f'{type(var_4).__module__}.{type(var_4).__qualname__}' == 'pyparam.help.HelpOptionDescriptions'
    assert len(var_4) == 8
    var_1.assemble(help_assembler_0)

@pytest.mark.xfail(strict=True)
def test_case_41():
    str_0 = ')Uv09X6oKo6o\ti*D'
    str_1 = '51VP*ovrX:]jn'
    str_2 = '1'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.prog(str_2)
    assert var_0 == '\x1b[1m\x1b[32m1\x1b[0m'
    var_1 = help_assembler_0.warning(str_2)
    assert var_1 == '\x1b[33mWarning: 1\x1b[0m'
    str_3 = '/`TW%eHnZS\r'
    var_2 = help_assembler_0.optdesc(str_1, help_assembler_0)
    assert var_2 == '\x1b[35m51VP*ovrX:]jn\x1b[0m'
    var_3 = help_assembler_0.optdesc(var_1, str_0)
    assert var_3 == '\x1b[35m\x1b[33mWarning: 1\x1b[0m\x1b[0m'
    dict_0 = {str_0: str_0, var_2: str_3, str_3: str_3}
    var_4 = help_assembler_0.optdesc(var_2)
    assert var_4 == '\x1b[35m51VP*ovrX:]jn\x1b[0m\x1b[0m'
    helps_0 = module_0.Helps(**dict_0)
    var_5 = help_assembler_0.error(str_1)
    assert var_5 == '\x1b[31mError: 51VP*ovrX:]jn\x1b[0m'
    var_6 = helps_0.after(str_2, var_1, *dict_0)
    assert len(helps_0) == 4
    assert f'{type(var_6).__module__}.{type(var_6).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_6) == 4
    var_7 = helps_0.before(str_3, str_1)
    assert len(helps_0) == 5
    assert len(var_6) == 5
    assert f'{type(var_7).__module__}.{type(var_7).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_7) == 5
    var_8 = var_7.select(var_2)
    assert var_8 == '/`TW%eHnZS\r'
    var_9 = help_assembler_0.assemble(helps_0)
    var_10 = helps_0.query(str_2, str_3)
    assert var_10 == '\x1b[35m51VP*ovrX:]jn\x1b[0m'
    var_7.add(helps_0, str_1)

@pytest.mark.xfail(strict=True)
def test_case_42():
    str_0 = ')Uv09X6oKo6oi*D'
    str_1 = 'd1'
    dict_0 = {str_1: str_0, str_1: str_0, str_1: str_0}
    help_options_0 = module_0.HelpOptions(**dict_0)
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.optdesc(str_1, dict_0)
    assert var_0 == '\x1b[35md1\x1b[0m'
    dict_1 = {str_0: str_0, str_0: str_0}
    helps_0 = module_0.Helps(**dict_1)
    var_1 = helps_0.before(str_0, var_0)
    assert len(helps_0) == 2
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_1) == 2
    help_options_0.add(dict_1)

@pytest.mark.xfail(strict=True)
def test_case_43():
    str_0 = ')Uv09X6oKo6oi*D'
    str_1 = 'F4,^'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    none_type_0 = None
    var_0 = help_assembler_0.title(str_1, none_type_0)
    assert var_0 == '\x1b[1m\x1b[36mF4,^\x1b[0m'
    str_2 = '=1N~K\t\n(#bvrN+'
    var_1 = help_assembler_0.optdesc(str_0, help_assembler_0)
    assert var_1 == '\x1b[35m)Uv09X6oKo6oi*D\x1b[0m'
    dict_0 = {str_0: str_0, var_1: str_2, str_2: str_2}
    var_2 = help_assembler_0.optdesc(var_1)
    assert var_2 == '\x1b[35m)Uv09X6oKo6oi*D\x1b[0m\x1b[0m'
    helps_0 = module_0.Helps(**dict_0)
    var_3 = help_assembler_0.error(str_0)
    assert var_3 == '\x1b[31mError: )Uv09X6oKo6oi*D\x1b[0m'
    var_4 = helps_0.before(str_2, str_2)
    assert f'{type(var_4).__module__}.{type(var_4).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_4) == 3
    var_5 = help_assembler_0.assemble(helps_0)
    var_4.add(helps_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_44():
    str_0 = '51VP*ovrX:]jn'
    help_items_0 = module_0.HelpItems()
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_0 = help_assembler_0.optdesc(str_0, help_assembler_0)
    assert var_0 == '\x1b[35m51VP*ovrX:]jn\x1b[0m'
    helps_0 = module_0.Helps()
    var_1 = help_assembler_0.error(str_0, helps_0)
    assert var_1 == '\x1b[31m51VP*ovrX:]jn\x1b[0m'
    helps_0.before(str_0, helps_0)

@pytest.mark.xfail(strict=True)
def test_case_45():
    help_options_0 = module_0.HelpOptions()
    assert f'{type(help_options_0).__module__}.{type(help_options_0).__qualname__}' == 'pyparam.help.HelpOptions'
    assert len(help_options_0) == 0
    assert f'{type(module_0.HelpOptions.is_mixed).__module__}.{type(module_0.HelpOptions.is_mixed).__qualname__}' == 'builtins.property'
    dict_0 = {}
    list_0 = [dict_0, dict_0]
    help_options_0.insert(help_options_0, list_0)

@pytest.mark.xfail(strict=True)
def test_case_46():
    str_0 = 'a|C'
    help_option_descriptions_0 = module_0.HelpOptionDescriptions()
    var_0 = help_option_descriptions_0.add(str_0)
    assert len(help_option_descriptions_0) == 1
    assert len(var_0) == 1
    var_1 = help_option_descriptions_0.select(str_0)
    assert var_1 == 'a|C'
    var_2 = var_0.after(str_0, str_0)
    assert len(help_option_descriptions_0) == 2
    assert len(var_0) == 2
    assert len(var_2) == 2
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    var_3 = help_assembler_0.optdesc(str_0, str_0)
    assert var_3 == '\x1b[35ma|C\x1b[0m'
    none_type_0 = None
    str_1 = 'p@4'
    dict_0 = {str_0: none_type_0, var_3: var_2, str_1: none_type_0, str_1: none_type_0}
    helps_0 = module_0.Helps(**dict_0)
    module_5.splitdrive(var_0)

@pytest.mark.xfail(strict=True)
def test_case_47():
    str_0 = ')Uv09X6oKo6o\ti*D'
    str_1 = '51VP*ovrX:]jn'
    str_2 = '1'
    help_assembler_0 = module_0.HelpAssembler()
    assert f'{type(help_assembler_0).__module__}.{type(help_assembler_0).__qualname__}' == 'pyparam.help.HelpAssembler'
    assert help_assembler_0.progname == 'pynguin'
    assert help_assembler_0.theme == {'error': '\x1b[31m', 'warning': '\x1b[33m', 'title': '\x1b[1m\x1b[36m', 'prog': '\x1b[1m\x1b[32m', 'default': '\x1b[35m', 'optname': '\x1b[1m\x1b[32m', 'opttype': '\x1b[34m', 'codebg': '\x1b[40m', 'optdesc': ''}
    combined_0 = module_6.combined()
    var_0 = help_assembler_0.warning(str_2)
    assert var_0 == '\x1b[33mWarning: 1\x1b[0m'
    str_3 = '/`TW%eHnZS\r'
    var_1 = help_assembler_0.optdesc(str_1, help_assembler_0)
    assert var_1 == '\x1b[35m51VP*ovrX:]jn\x1b[0m'
    dict_0 = {str_0: str_0, var_1: str_3, str_3: str_3}
    var_2 = help_assembler_0.optdesc(var_1)
    assert var_2 == '\x1b[35m51VP*ovrX:]jn\x1b[0m\x1b[0m'
    helps_0 = module_0.Helps(**dict_0)
    var_3 = help_assembler_0.error(str_1)
    assert var_3 == '\x1b[31mError: 51VP*ovrX:]jn\x1b[0m'
    var_4 = helps_0.after(str_2, var_0, *dict_0)
    assert len(helps_0) == 4
    assert f'{type(var_4).__module__}.{type(var_4).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_4) == 4
    var_5 = helps_0.before(str_3, str_1)
    assert len(helps_0) == 5
    assert len(var_4) == 5
    assert f'{type(var_5).__module__}.{type(var_5).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_5) == 5
    var_6 = help_assembler_0.assemble(helps_0)
    var_7 = var_5.add(combined_0)
    var_5.before(var_3, str_1)

@pytest.mark.xfail(strict=True)
def test_case_48():
    str_0 = ')Uv09X6oKo6o\ti*D'
    str_1 = '51VP*ovrX:]jn'
    help_items_0 = module_0.HelpItems()
    combined_0 = module_6.combined()
    str_2 = '/`TW%eHnZS\r'
    dict_0 = {str_0: str_0, str_2: str_2, str_2: str_2}
    helps_0 = module_0.Helps(**dict_0)
    var_0 = helps_0.before(str_2, str_1)
    assert len(helps_0) == 3
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'pyparam.help.Helps'
    assert len(var_0) == 3
    var_0.add(var_0, combined_0)