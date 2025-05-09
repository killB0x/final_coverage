# Automatically generated by Pynguin.
import pytest
import bl.config as module_0

def test_case_0():
    config_template_0 = module_0.ConfigTemplate()
    assert f'{type(config_template_0).__module__}.{type(config_template_0).__qualname__}' == 'bl.config.ConfigTemplate'
    assert len(config_template_0) == 0

@pytest.mark.xfail(strict=True)
def test_case_1():
    config_template_0 = module_0.ConfigTemplate()
    assert f'{type(config_template_0).__module__}.{type(config_template_0).__qualname__}' == 'bl.config.ConfigTemplate'
    assert len(config_template_0) == 0
    config_template_0.render(config_template_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    config_template_0 = module_0.ConfigTemplate()
    assert f'{type(config_template_0).__module__}.{type(config_template_0).__qualname__}' == 'bl.config.ConfigTemplate'
    assert len(config_template_0) == 0
    config_template_0.write(config_template_0, config_template_0)

def test_case_3():
    config_template_0 = module_0.ConfigTemplate()
    assert f'{type(config_template_0).__module__}.{type(config_template_0).__qualname__}' == 'bl.config.ConfigTemplate'
    assert len(config_template_0) == 0
    var_0 = config_template_0.render(prompt=config_template_0, **config_template_0)

def test_case_4():
    bool_0 = False
    var_0 = module_0.package_config(bool_0, bool_0)

def test_case_5():
    str_0 = 'blT.cofig'
    config_template_0 = module_0.ConfigTemplate(str_0, join_list=str_0)
    assert f'{type(config_template_0).__module__}.{type(config_template_0).__qualname__}' == 'bl.config.ConfigTemplate'
    assert len(config_template_0) == 0
    var_0 = config_template_0.write(wait=str_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = '\n+4cXdI /'
    config_template_0 = module_0.ConfigTemplate(interpolation=str_0, join_list=str_0)
    assert f'{type(config_template_0).__module__}.{type(config_template_0).__qualname__}' == 'bl.config.ConfigTemplate'
    assert len(config_template_0) == 0
    config_template_1 = module_0.ConfigTemplate(split_list=str_0)
    var_0 = config_template_1.render()
    config_template_1.write(wait=config_template_1)

@pytest.mark.xfail(strict=True)
def test_case_7():
    none_type_0 = None
    str_0 = '\\D}[mX$ =vk^n'
    config_template_0 = module_0.ConfigTemplate(split_list=none_type_0)
    assert f'{type(config_template_0).__module__}.{type(config_template_0).__qualname__}' == 'bl.config.ConfigTemplate'
    assert len(config_template_0) == 0
    var_0 = config_template_0.__setattr__(str_0, config_template_0)
    config_template_0.write()

def test_case_8():
    config_template_0 = module_0.ConfigTemplate()
    assert f'{type(config_template_0).__module__}.{type(config_template_0).__qualname__}' == 'bl.config.ConfigTemplate'
    assert len(config_template_0) == 0
    var_0 = module_0.package_config(config_template_0)

def test_case_9():
    none_type_0 = None
    str_0 = '/'
    config_0 = module_0.Config(none_type_0)
    assert f'{type(config_0).__module__}.{type(config_0).__qualname__}' == 'bl.config.Config'
    assert len(config_0) == 0
    with pytest.raises(FileExistsError):
        config_0.write(str_0)

def test_case_10():
    str_0 = 'bl.cofig'
    config_0 = module_0.Config(str_0)
    assert f'{type(config_0).__module__}.{type(config_0).__qualname__}' == 'bl.config.Config'
    assert len(config_0) == 0

@pytest.mark.xfail(strict=True)
def test_case_11():
    none_type_0 = None
    str_0 = '\\D}[mX$ =vk^n'
    config_template_0 = module_0.ConfigTemplate(split_list=none_type_0)
    assert f'{type(config_template_0).__module__}.{type(config_template_0).__qualname__}' == 'bl.config.ConfigTemplate'
    assert len(config_template_0) == 0
    var_0 = config_template_0.__setattr__(str_0, config_template_0)
    var_1 = config_template_0.render(prompt=var_0)
    config_template_0.write()

@pytest.mark.xfail(strict=True)
def test_case_12():
    none_type_0 = None
    var_0 = module_0.package_config(none_type_0)
    config_0 = module_0.Config(none_type_0)
    none_type_1 = None
    config_template_0 = module_0.ConfigTemplate(none_type_0, split_list=none_type_1, join_list=config_0)
    var_1 = config_0.__setattr__(none_type_0, var_0)
    var_2 = config_template_0.__setattr__(var_1, config_0)
    config_template_0.write()

@pytest.mark.xfail(strict=True)
def test_case_13():
    none_type_0 = None
    var_0 = module_0.package_config(none_type_0)
    config_0 = module_0.Config(none_type_0)
    config_template_0 = module_0.ConfigTemplate(split_list=none_type_0)
    str_0 = 'bl.cofig'
    var_1 = config_0.__setattr__(none_type_0, var_0)
    var_2 = config_template_0.__setattr__(str_0, config_0)
    config_template_0.write()

def test_case_14():
    none_type_0 = None
    config_0 = module_0.Config(none_type_0)
    assert f'{type(config_0).__module__}.{type(config_0).__qualname__}' == 'bl.config.Config'
    assert len(config_0) == 0
    config_template_0 = module_0.ConfigTemplate(split_list=none_type_0)
    str_0 = 'xmlcharrefreplace'
    var_0 = config_0.__setattr__(none_type_0, str_0)
    var_1 = config_template_0.__setattr__(str_0, config_0)
    var_2 = config_template_0.render(prompt=str_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    none_type_0 = None
    str_0 = '/'
    var_0 = module_0.package_config(none_type_0)
    config_0 = module_0.Config(none_type_0)
    config_0.__call__(str_0, **config_0)

def test_case_16():
    none_type_0 = None
    str_0 = 'fE"d\'yu'
    config_0 = module_0.Config(str_0, none_type_0)
    assert f'{type(config_0).__module__}.{type(config_0).__qualname__}' == 'bl.config.Config'
    assert len(config_0) == 0

@pytest.mark.xfail(strict=True)
def test_case_17():
    none_type_0 = None
    str_0 = '\\D}[mX$ =vk^n'
    var_0 = module_0.package_config(none_type_0)
    config_0 = module_0.Config(none_type_0)
    var_1 = config_0.__call__(str_0, **config_0)
    var_2 = var_1.__call__(none_type_0, str_0, str_0)
    var_3 = var_1.write()
    none_type_1 = None
    config_template_0 = module_0.ConfigTemplate(none_type_0, split_list=none_type_1, join_list=config_0)
    str_1 = 'bl.cofig'
    var_4 = config_0.__setattr__(none_type_0, var_0)
    var_5 = config_template_0.__setattr__(str_1, config_0)
    var_6 = config_template_0.render(prompt=str_1)
    var_7 = config_0.__repr__()
    config_template_0.write()

@pytest.mark.xfail(strict=True)
def test_case_18():
    none_type_0 = None
    str_0 = '\\D}[mX$ =vk^n'
    config_0 = module_0.Config(split_list=str_0, join_list=str_0)
    assert f'{type(config_0).__module__}.{type(config_0).__qualname__}' == 'bl.config.Config'
    assert len(config_0) == 0
    config_1 = module_0.Config(none_type_0)
    var_0 = config_1.__call__(str_0, **config_1)
    var_1 = config_1.write(str_0)
    config_template_0 = module_0.ConfigTemplate(split_list=none_type_0)
    str_1 = 'xmlcharrefreplace'
    var_2 = config_1.__setattr__(none_type_0, str_1)
    var_3 = config_template_0.__setattr__(str_1, config_1)
    var_4 = config_template_0.render(prompt=str_1)
    var_5 = module_0.package_config(var_2, config_name=str_1)
    config_2 = module_0.Config(var_2, config_1, var_0)
    var_6 = config_1.__repr__()
    bool_0 = True
    config_0.write(var_1, bool_0)