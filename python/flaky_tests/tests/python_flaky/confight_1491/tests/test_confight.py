# Automatically generated by Pynguin.
import pytest
import confight as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    module_0.cli()

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'tom'
    var_0 = module_0.load_user_app(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}
    module_0.merge(str_0)

def test_case_2():
    str_0 = 'om'
    var_0 = module_0.load_app(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}

def test_case_3():
    str_0 = '=HS^\tho8\t\rV7'
    var_0 = module_0.load_app(str_0, prefix=str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}

def test_case_4():
    var_0 = module_0.load_app_paths()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = 'om'
    module_0.load(str_0)

def test_case_6():
    none_type_0 = None
    var_0 = module_0.find(none_type_0)
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}

@pytest.mark.xfail(strict=True)
def test_case_7():
    none_type_0 = None
    module_0.load_ini(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = 'o#.'
    var_0 = module_0.load_app(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}
    var_1 = module_0.load_paths(str_0, extension=str_0, force_extension=str_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'collections.OrderedDict'
    assert len(var_1) == 0
    var_2 = module_0.load_ini(var_0)
    var_3 = module_0.load_paths(var_2)
    var_4 = module_0.load_ini(var_2)
    var_5 = module_0.merge(var_1)
    var_6 = module_0.load(var_2, parser=var_5)
    module_0.cli_configure_logging(var_1)

@pytest.mark.xfail(strict=True)
def test_case_9():
    none_type_0 = None
    var_0 = module_0.check_access(none_type_0)
    assert var_0 is False
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}
    module_0.cli_show(none_type_0)

def test_case_10():
    bytes_0 = b'\x01\xee\x9f\xe7\x88B\xec\xfe\x05\xd2\xc1\xac'
    with pytest.raises(ValueError):
        module_0.format_from_path(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = 'tom'
    var_0 = module_0.load_user_app(str_0, user_prefix=str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}
    var_1 = module_0.load_app(str_0, str_0)
    var_2 = module_0.load_paths(var_1, extension=str_0, force_extension=str_0)
    var_3 = module_0.load_ini(var_1)
    module_0.merge(str_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    str_0 = 'om'
    var_0 = module_0.load_app(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}
    var_1 = module_0.load_ini(var_0)
    var_2 = module_0.load_app_paths(paths=str_0)
    var_3 = module_0.load(var_0)
    module_0.load(str_0, merger=var_1)

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = 'om'
    module_0.load(str_0, str_0)

def test_case_14():
    str_0 = ''
    var_0 = module_0.load_ini(str_0)
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}

@pytest.mark.xfail(strict=True)
def test_case_15():
    str_0 = 'om'
    var_0 = module_0.load_app(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}
    var_1 = module_0.load_ini(var_0)
    module_0.load(str_0, var_1, var_1)

@pytest.mark.xfail(strict=True)
def test_case_16():
    str_0 = 'om'
    module_0.load(str_0, merger=str_0)

def test_case_17():
    str_0 = '8:h1N1~ig'
    var_0 = module_0.load_paths(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}

@pytest.mark.xfail(strict=True)
def test_case_18():
    str_0 = 'tom'
    module_0.merge(str_0)

@pytest.mark.xfail(strict=True)
def test_case_19():
    str_0 = 'tom'
    var_0 = module_0.load_app(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}
    var_1 = module_0.load_paths(var_0, var_0)
    module_0.load(str_0, str_0)

def test_case_20():
    str_0 = 'tom'
    var_0 = module_0.load_paths(str_0, extension=str_0, force_extension=str_0)
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}

def test_case_21():
    str_0 = 'o#.'
    var_0 = module_0.load_paths(str_0, extension=str_0, force_extension=str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.OrderedDict'
    assert len(var_0) == 0
    assert f'{type(module_0.logger).__module__}.{type(module_0.logger).__qualname__}' == 'logging.Logger'
    assert module_0.logger.name == 'confight'
    assert module_0.logger.level == 0
    assert f'{type(module_0.logger.parent).__module__}.{type(module_0.logger.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.logger.handlers == []
    assert module_0.FORMATS == ('toml', 'ini', 'json')
    assert module_0.FORMAT_EXTENSIONS == {'js': 'json', 'json': 'json', 'toml': 'toml', 'ini': 'ini', 'cfg': 'ini'}