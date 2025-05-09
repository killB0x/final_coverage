# Automatically generated by Pynguin.
import pytest
import aries_staticagent.module as module_0
import builtins as module_1

def test_case_0():
    with pytest.raises(ValueError):
        module_0.route()

def test_case_1():
    str_0 = 'mNL?02{FB97?r(dGr-'
    invalid_module_0 = module_0.InvalidModule()
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    with pytest.raises(TypeError):
        module_0.type(str_0, version=str_0)

def test_case_2():
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    str_0 = '@{4""jO|%\x0b\x0cIR'
    partial_type_0 = module_0.PartialType(str_0, version=str_0)
    assert f'{type(partial_type_0).__module__}.{type(partial_type_0).__qualname__}' == 'aries_staticagent.module.PartialType'
    assert f'{type(module_0.PartialType.doc_uri).__module__}.{type(module_0.PartialType.doc_uri).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.name).__module__}.{type(module_0.PartialType.name).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.protocol).__module__}.{type(module_0.PartialType.protocol).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.version).__module__}.{type(module_0.PartialType.version).__qualname__}' == 'builtins.member_descriptor'
    list_0 = [module_0]
    with pytest.raises(TypeError):
        module_0.type(str_0, protocol=list_0)

def test_case_3():
    str_0 = 'i'
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    with pytest.raises(TypeError):
        module_0.type(str_0, str_0)

def test_case_4():
    str_0 = 'n'
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    invalid_module_0 = module_0.InvalidModule()
    list_0 = [str_0, module_0]
    dict_0 = {str_0: list_0}
    var_0 = module_0.route(*list_0, **dict_0)
    partial_type_0 = module_0.PartialType(var_0, str_0, version=var_0)
    assert f'{type(partial_type_0).__module__}.{type(partial_type_0).__qualname__}' == 'aries_staticagent.module.PartialType'
    assert f'{type(module_0.PartialType.doc_uri).__module__}.{type(module_0.PartialType.doc_uri).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.name).__module__}.{type(module_0.PartialType.name).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.protocol).__module__}.{type(module_0.PartialType.protocol).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.version).__module__}.{type(module_0.PartialType.version).__qualname__}' == 'builtins.member_descriptor'
    with pytest.raises(TypeError):
        partial_type_0.complete(module_0)

def test_case_5():
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    str_0 = '^RvOeSg*6'
    partial_type_0 = module_0.PartialType(str_0)
    assert f'{type(partial_type_0).__module__}.{type(partial_type_0).__qualname__}' == 'aries_staticagent.module.PartialType'
    assert f'{type(module_0.PartialType.doc_uri).__module__}.{type(module_0.PartialType.doc_uri).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.name).__module__}.{type(module_0.PartialType.name).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.protocol).__module__}.{type(module_0.PartialType.protocol).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.version).__module__}.{type(module_0.PartialType.version).__qualname__}' == 'builtins.member_descriptor'
    with pytest.raises(TypeError):
        partial_type_0.complete(module_0)

def test_case_6():
    bool_0 = True
    list_0 = [bool_0, bool_0]
    with pytest.raises(ValueError):
        module_0.route(*list_0)

def test_case_7():
    var_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'

def test_case_8():
    str_0 = 'n'
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    list_0 = [module_0, str_0, module_0]
    dict_0 = {str_0: list_0}
    var_0 = module_0.route(*list_0, **dict_0)
    exception_0 = module_1.Exception()
    partial_type_0 = module_0.PartialType(var_0, str_0, version=var_0)
    assert f'{type(partial_type_0).__module__}.{type(partial_type_0).__qualname__}' == 'aries_staticagent.module.PartialType'
    assert f'{type(module_0.PartialType.doc_uri).__module__}.{type(module_0.PartialType.doc_uri).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.name).__module__}.{type(module_0.PartialType.name).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.protocol).__module__}.{type(module_0.PartialType.protocol).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.version).__module__}.{type(module_0.PartialType.version).__qualname__}' == 'builtins.member_descriptor'
    with pytest.raises(TypeError):
        partial_type_0.complete(module_0)

def test_case_9():
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    str_0 = '!u:U\x0c.>x'
    none_type_0 = None
    partial_type_0 = module_0.PartialType(module_0, str_0, version=none_type_0)
    assert f'{type(partial_type_0).__module__}.{type(partial_type_0).__qualname__}' == 'aries_staticagent.module.PartialType'
    assert f'{type(module_0.PartialType.doc_uri).__module__}.{type(module_0.PartialType.doc_uri).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.name).__module__}.{type(module_0.PartialType.name).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.protocol).__module__}.{type(module_0.PartialType.protocol).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.version).__module__}.{type(module_0.PartialType.version).__qualname__}' == 'builtins.member_descriptor'
    with pytest.raises(TypeError):
        partial_type_0.complete(module_0)

def test_case_10():
    str_0 = 'n'
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    with pytest.raises(TypeError):
        module_0.type(module_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = 'n'
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    list_0 = [str_0, module_0]
    dict_0 = {str_0: list_0}
    var_0 = module_0.route(*list_0, **dict_0)
    partial_type_0 = module_0.PartialType(var_0, str_0, version=var_0)
    assert f'{type(partial_type_0).__module__}.{type(partial_type_0).__qualname__}' == 'aries_staticagent.module.PartialType'
    assert f'{type(module_0.PartialType.doc_uri).__module__}.{type(module_0.PartialType.doc_uri).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.name).__module__}.{type(module_0.PartialType.name).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.protocol).__module__}.{type(module_0.PartialType.protocol).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.version).__module__}.{type(module_0.PartialType.version).__qualname__}' == 'builtins.member_descriptor'
    var_1 = var_0.__ne__(list_0)
    var_2 = var_1.__hash__()
    invalid_module_0 = module_0.InvalidModule()
    str_1 = 'JWM/1.0'
    var_2.type(str_1, module_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    str_0 = ' Flags for MTC '
    invalid_module_0 = module_0.InvalidModule()
    module_1 = module_0.Module()
    str_1 = 'Iuqj"=MVr7AB2'
    module_2 = module_0.Module()
    module_2.type(str_0, str_1, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = 'n'
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    list_0 = [module_0, str_0, module_0]
    partial_type_0 = module_0.PartialType(list_0, str_0, str_0, str_0)
    assert f'{type(partial_type_0).__module__}.{type(partial_type_0).__qualname__}' == 'aries_staticagent.module.PartialType'
    assert f'{type(module_0.PartialType.doc_uri).__module__}.{type(module_0.PartialType.doc_uri).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.name).__module__}.{type(module_0.PartialType.name).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.protocol).__module__}.{type(module_0.PartialType.protocol).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.version).__module__}.{type(module_0.PartialType.version).__qualname__}' == 'builtins.member_descriptor'
    partial_type_0.complete(partial_type_0)

def test_case_14():
    str_0 = 'n'
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    list_0 = [module_0, str_0, module_0]
    dict_0 = {str_0: list_0, str_0: list_0}
    var_0 = module_0.route(*list_0, **dict_0)
    partial_type_0 = module_0.PartialType(var_0, var_0, str_0)
    assert f'{type(partial_type_0).__module__}.{type(partial_type_0).__qualname__}' == 'aries_staticagent.module.PartialType'
    assert f'{type(module_0.PartialType.doc_uri).__module__}.{type(module_0.PartialType.doc_uri).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.name).__module__}.{type(module_0.PartialType.name).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.protocol).__module__}.{type(module_0.PartialType.protocol).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.PartialType.version).__module__}.{type(module_0.PartialType.version).__qualname__}' == 'builtins.member_descriptor'
    with pytest.raises(TypeError):
        partial_type_0.complete(module_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    str_0 = 'n'
    module_1 = module_0.route(*str_0)
    list_0 = [module_1, str_0, module_1]
    dict_0 = {str_0: list_0}
    var_0 = module_0.route(*list_0, **dict_0)
    partial_type_0 = module_0.PartialType(var_0, var_0, str_0)
    partial_type_0.complete(module_1)

@pytest.mark.xfail(strict=True)
def test_case_16():
    str_0 = 'n'
    module_0 = module_0.Module()
    assert f'{type(module_0.Module.routes).__module__}.{type(module_0.Module.routes).__qualname__}' == 'builtins.property'
    list_0 = [str_0, module_0, str_0]
    module_0.MetaModule(*list_0)