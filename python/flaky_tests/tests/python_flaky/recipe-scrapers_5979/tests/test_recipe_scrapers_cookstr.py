# Automatically generated by Pynguin.
import pytest
import recipe_scrapers.cookstr as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    int_0 = -760
    module_0.Cookstr(int_0, int_0)

def test_case_1():
    str_0 = 'https://www.finedininglovers.com'
    cookstr_0 = module_0.Cookstr(str_0, str_0)
    assert f'{type(cookstr_0).__module__}.{type(cookstr_0).__qualname__}' == 'recipe_scrapers.cookstr.Cookstr'
    assert cookstr_0.exception_handling == 'https://www.finedininglovers.com'
    assert cookstr_0.meta_http_equiv is False
    assert f'{type(cookstr_0.schema).__module__}.{type(cookstr_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert cookstr_0.url == 'https://www.finedininglovers.com'

def test_case_2():
    str_0 = 'https://www.finedininglovers.com'
    cookstr_0 = module_0.Cookstr(str_0)
    assert f'{type(cookstr_0).__module__}.{type(cookstr_0).__qualname__}' == 'recipe_scrapers.cookstr.Cookstr'
    assert cookstr_0.exception_handling is True
    assert cookstr_0.meta_http_equiv is False
    assert f'{type(cookstr_0.schema).__module__}.{type(cookstr_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert cookstr_0.url == 'https://www.finedininglovers.com'
    var_0 = cookstr_0.yields()
    assert var_0 == 0

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = 'https://www.finedininglovers.com'
    cookstr_0 = module_0.Cookstr(str_0)
    assert f'{type(cookstr_0).__module__}.{type(cookstr_0).__qualname__}' == 'recipe_scrapers.cookstr.Cookstr'
    assert cookstr_0.exception_handling is True
    assert cookstr_0.meta_http_equiv is False
    assert f'{type(cookstr_0.schema).__module__}.{type(cookstr_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert cookstr_0.url == 'https://www.finedininglovers.com'
    bool_0 = False
    var_0 = cookstr_0.title()
    var_1 = cookstr_0.total_time()
    assert var_1 == 0
    module_0.Cookstr(var_1, test=bool_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = 'https://www.finedininglovers.com'
    cookstr_0 = module_0.Cookstr(str_0)
    assert f'{type(cookstr_0).__module__}.{type(cookstr_0).__qualname__}' == 'recipe_scrapers.cookstr.Cookstr'
    assert cookstr_0.exception_handling is True
    assert cookstr_0.meta_http_equiv is False
    assert f'{type(cookstr_0.schema).__module__}.{type(cookstr_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert cookstr_0.url == 'https://www.finedininglovers.com'
    var_0 = cookstr_0.total_time()
    assert var_0 == 0
    module_0.Cookstr(cookstr_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = 'https://www.finedininglovers.com'
    cookstr_0 = module_0.Cookstr(str_0)
    assert f'{type(cookstr_0).__module__}.{type(cookstr_0).__qualname__}' == 'recipe_scrapers.cookstr.Cookstr'
    assert cookstr_0.exception_handling is True
    assert cookstr_0.meta_http_equiv is False
    assert f'{type(cookstr_0.schema).__module__}.{type(cookstr_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert cookstr_0.url == 'https://www.finedininglovers.com'
    var_0 = cookstr_0.instructions()
    var_1 = cookstr_0.total_time()
    assert var_1 == 0
    var_2 = cookstr_0.yields()
    assert var_2 == 0
    float_0 = 2284.0
    module_0.Cookstr(float_0, var_2)

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = 'https://www.finedininglovers.com'
    cookstr_0 = module_0.Cookstr(str_0)
    assert f'{type(cookstr_0).__module__}.{type(cookstr_0).__qualname__}' == 'recipe_scrapers.cookstr.Cookstr'
    assert cookstr_0.exception_handling is True
    assert cookstr_0.meta_http_equiv is False
    assert f'{type(cookstr_0.schema).__module__}.{type(cookstr_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert cookstr_0.url == 'https://www.finedininglovers.com'
    var_0 = cookstr_0.ingredients()
    var_1 = cookstr_0.yields()
    assert var_1 == 0
    var_2 = cookstr_0.ratings()
    var_1.yields()