# Automatically generated by Pynguin.
import pytest
import snippy.content.base as module_0

def test_case_0():
    none_type_0 = None
    content_base_0 = module_0.ContentBase(none_type_0, none_type_0, none_type_0)
    assert f'{type(module_0.ContentBase.category).__module__}.{type(module_0.ContentBase.category).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.ContentBase.collection).__module__}.{type(module_0.ContentBase.collection).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.ContentBase.uniques).__module__}.{type(module_0.ContentBase.uniques).__qualname__}' == 'builtins.property'

@pytest.mark.xfail(strict=True)
def test_case_1():
    int_0 = -1395
    none_type_0 = None
    content_base_0 = module_0.ContentBase(int_0, none_type_0, none_type_0)
    assert f'{type(module_0.ContentBase.category).__module__}.{type(module_0.ContentBase.category).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.ContentBase.collection).__module__}.{type(module_0.ContentBase.collection).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.ContentBase.uniques).__module__}.{type(module_0.ContentBase.uniques).__qualname__}' == 'builtins.property'
    content_base_0.create()

@pytest.mark.xfail(strict=True)
def test_case_2():
    none_type_0 = None
    content_base_0 = module_0.ContentBase(none_type_0, none_type_0, none_type_0)
    assert f'{type(module_0.ContentBase.category).__module__}.{type(module_0.ContentBase.category).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.ContentBase.collection).__module__}.{type(module_0.ContentBase.collection).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.ContentBase.uniques).__module__}.{type(module_0.ContentBase.uniques).__qualname__}' == 'builtins.property'
    var_0 = module_0.ContentBase(content_base_0, content_base_0, none_type_0)
    content_base_1 = module_0.ContentBase(content_base_0, content_base_0, var_0)
    content_base_1.unique()

@pytest.mark.xfail(strict=True)
def test_case_3():
    tuple_0 = ()
    set_0 = {tuple_0, tuple_0, tuple_0, tuple_0}
    str_0 = 'Ys'
    content_base_0 = module_0.ContentBase(set_0, set_0, str_0)
    assert f'{type(module_0.ContentBase.category).__module__}.{type(module_0.ContentBase.category).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.ContentBase.collection).__module__}.{type(module_0.ContentBase.collection).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.ContentBase.uniques).__module__}.{type(module_0.ContentBase.uniques).__qualname__}' == 'builtins.property'
    content_base_0.run()