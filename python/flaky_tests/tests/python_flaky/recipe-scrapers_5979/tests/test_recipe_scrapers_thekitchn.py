# Automatically generated by Pynguin.
import pytest
import recipe_scrapers.thekitchn as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    int_0 = -760
    module_0.TheKitchn(int_0, int_0)

def test_case_1():
    str_0 = 'https://www.finedininglovers.com'
    the_kitchn_0 = module_0.TheKitchn(str_0, meta_http_equiv=str_0)
    assert f'{type(the_kitchn_0).__module__}.{type(the_kitchn_0).__qualname__}' == 'recipe_scrapers.thekitchn.TheKitchn'
    assert the_kitchn_0.exception_handling is True
    assert the_kitchn_0.meta_http_equiv == 'https://www.finedininglovers.com'
    assert f'{type(the_kitchn_0.schema).__module__}.{type(the_kitchn_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert the_kitchn_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.TheKitchn.host).__module__}.{type(module_0.TheKitchn.host).__qualname__}' == 'builtins.method'

def test_case_2():
    str_0 = 'https://www.finedininglovers.com'
    the_kitchn_0 = module_0.TheKitchn(str_0)
    assert f'{type(the_kitchn_0).__module__}.{type(the_kitchn_0).__qualname__}' == 'recipe_scrapers.thekitchn.TheKitchn'
    assert the_kitchn_0.exception_handling is True
    assert the_kitchn_0.meta_http_equiv is False
    assert f'{type(the_kitchn_0.schema).__module__}.{type(the_kitchn_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert the_kitchn_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.TheKitchn.host).__module__}.{type(module_0.TheKitchn.host).__qualname__}' == 'builtins.method'
    var_0 = the_kitchn_0.total_time()
    the_kitchn_1 = the_kitchn_0.yields()
    assert the_kitchn_1 == ''

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = 'https://www.finedininglovers.com'
    the_kitchn_0 = module_0.TheKitchn(str_0)
    assert f'{type(the_kitchn_0).__module__}.{type(the_kitchn_0).__qualname__}' == 'recipe_scrapers.thekitchn.TheKitchn'
    assert the_kitchn_0.exception_handling is True
    assert the_kitchn_0.meta_http_equiv is False
    assert f'{type(the_kitchn_0.schema).__module__}.{type(the_kitchn_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert the_kitchn_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.TheKitchn.host).__module__}.{type(module_0.TheKitchn.host).__qualname__}' == 'builtins.method'
    var_0 = the_kitchn_0.instructions()
    assert var_0 == ''
    module_0.TheKitchn(the_kitchn_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = 'https://www.finedininglovers.com'
    the_kitchn_0 = module_0.TheKitchn(str_0)
    assert f'{type(the_kitchn_0).__module__}.{type(the_kitchn_0).__qualname__}' == 'recipe_scrapers.thekitchn.TheKitchn'
    assert the_kitchn_0.exception_handling is True
    assert the_kitchn_0.meta_http_equiv is False
    assert f'{type(the_kitchn_0.schema).__module__}.{type(the_kitchn_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert the_kitchn_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.TheKitchn.host).__module__}.{type(module_0.TheKitchn.host).__qualname__}' == 'builtins.method'
    var_0 = the_kitchn_0.total_time()
    module_0.TheKitchn(var_0, test=str_0)

def test_case_5():
    str_0 = 'https://www.finedininglovers.com'
    the_kitchn_0 = module_0.TheKitchn(str_0)
    assert f'{type(the_kitchn_0).__module__}.{type(the_kitchn_0).__qualname__}' == 'recipe_scrapers.thekitchn.TheKitchn'
    assert the_kitchn_0.exception_handling is True
    assert the_kitchn_0.meta_http_equiv is False
    assert f'{type(the_kitchn_0.schema).__module__}.{type(the_kitchn_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert the_kitchn_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.TheKitchn.host).__module__}.{type(module_0.TheKitchn.host).__qualname__}' == 'builtins.method'
    var_0 = the_kitchn_0.ingredients()
    var_1 = the_kitchn_0.yields()
    assert var_1 == ''

def test_case_6():
    str_0 = 'https://www.finedininglovers.com'
    the_kitchn_0 = module_0.TheKitchn(str_0)
    assert f'{type(the_kitchn_0).__module__}.{type(the_kitchn_0).__qualname__}' == 'recipe_scrapers.thekitchn.TheKitchn'
    assert the_kitchn_0.exception_handling is True
    assert the_kitchn_0.meta_http_equiv is False
    assert f'{type(the_kitchn_0.schema).__module__}.{type(the_kitchn_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert the_kitchn_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.TheKitchn.host).__module__}.{type(module_0.TheKitchn.host).__qualname__}' == 'builtins.method'
    var_0 = the_kitchn_0.title()
    assert var_0 == ''
    var_1 = the_kitchn_0.total_time()
    var_2 = the_kitchn_0.instructions()
    assert var_2 == ''
    var_3 = the_kitchn_0.yields()
    assert var_3 == ''