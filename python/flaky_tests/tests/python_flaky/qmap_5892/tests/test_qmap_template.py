# Automatically generated by Pynguin.
import pytest
import qmap.template as module_0
import re as module_1
import qmap.file.metadata as module_2

def test_case_0():
    format_dict_0 = module_0.FormatDict()
    var_0 = module_0.generate(format_dict_0, format_dict_0)

def test_case_1():
    template_error_0 = module_0.TemplateError()

@pytest.mark.xfail(strict=True)
def test_case_2():
    format_dict_0 = module_0.FormatDict()
    format_dict_0.__missing__(format_dict_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    format_dict_0 = module_0.FormatDict()
    none_type_0 = None
    module_0.generate(none_type_0, none_type_0, easy_build_modules=format_dict_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    var_0 = module_1.purge()
    str_0 = 'QJ[WoAc+'
    var_1 = module_0.check_command(str_0)
    none_type_0 = None
    module_0.Template(none_type_0, var_0, var_1, str_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    dict_0 = {}
    var_0 = module_0.generate(dict_0, dict_0, conda_env=dict_0)
    var_0.resubmit()

def test_case_6():
    str_0 = '\x0bU[\t"m,3?J2^?b3pN'
    var_0 = module_0.expand(str_0)
    var_1 = var_0.__next__()
    assert var_1 == 'U[ "m,3?J2^?b3pN'

def test_case_7():
    format_dict_0 = module_0.FormatDict()
    format_dict_1 = module_0.FormatDict()
    format_dict_2 = module_0.FormatDict()
    str_0 = '\x0bU[\tk\x0b"m,3?J2^?b3p{N'
    var_0 = module_0.expand(str_0)
    template_0 = module_0.Template(var_0, format_dict_1, var_0)
    assert f'{type(template_0).__module__}.{type(template_0).__qualname__}' == 'qmap.template.Template'
    assert len(template_0) == 2
    var_1 = module_0.expand(str_0)
    var_2 = module_0.expand_command(template_0)
    var_3 = var_1.__next__()
    assert var_3 == 'U[ k "m,3?J2^?b3p{N'

@pytest.mark.xfail(strict=True)
def test_case_8():
    none_type_0 = None
    var_0 = module_0.expand(none_type_0)
    var_1 = module_0.read_substitutions_file(none_type_0)
    var_2 = module_0.expand_command(none_type_0)
    var_2.__next__()

@pytest.mark.xfail(strict=True)
def test_case_9():
    format_dict_0 = module_0.FormatDict()
    bool_0 = True
    none_type_0 = None
    var_0 = module_0.expand_command(format_dict_0)
    var_1 = module_0.generate(bool_0, format_dict_0, conda_env=none_type_0)
    var_2 = module_0.expand_command(bool_0)
    format_dict_1 = module_0.FormatDict()
    module_0.FormatDict(*var_1, **format_dict_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    format_dict_0 = module_0.FormatDict()
    none_type_0 = None
    bytes_0 = b'~\x8a'
    module_0.generate(none_type_0, none_type_0, none_type_0, easy_build_modules=bytes_0)

def test_case_11():
    str_0 = 'QJ[WoAc+'
    var_0 = module_0.check_command(str_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    format_dict_0 = module_0.FormatDict()
    var_0 = module_0.read_substitutions_file(format_dict_0)
    module_0.FormatDict(*var_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    format_dict_0 = module_0.FormatDict()
    str_0 = '/Qo~*F]'
    var_0 = module_0.expand(str_0)
    var_1 = module_0.generate(var_0, format_dict_0)
    var_2 = module_1.purge()
    var_0.__next__()

@pytest.mark.xfail(strict=True)
def test_case_14():
    format_dict_0 = module_0.FormatDict()
    var_0 = module_2.save(format_dict_0, format_dict_0)
    str_0 = '{{(?P<wildcard>\\*|\\*\\*)}}'
    var_1 = module_0.expand(str_0)
    var_2 = module_0.expand(var_0)
    module_0.Template(format_dict_0, var_2, var_1)

@pytest.mark.xfail(strict=True)
def test_case_15():
    bool_0 = False
    str_0 = 'rE**D/3#g\\r-/ov)y'
    str_1 = '_wT\x0bxs:HV"BSnp6*'
    dict_0 = {str_0: str_0, str_1: str_1}
    none_type_0 = None
    var_0 = module_0.generate(bool_0, dict_0, easy_build_modules=str_0)
    var_0.__getattr__(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    str_0 = '{{(?P<wildcard>\\*|\\*\\*)}}'
    var_0 = module_0.expand(str_0)
    var_0.__next__()