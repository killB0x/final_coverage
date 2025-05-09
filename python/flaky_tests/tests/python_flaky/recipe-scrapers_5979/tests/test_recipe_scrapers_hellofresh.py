# Automatically generated by Pynguin.
import pytest
import re as module_0
import recipe_scrapers.hellofresh as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    match_0 = module_0.purge()
    module_1.HelloFresh(match_0, match_0, match_0)

def test_case_1():
    int_0 = 10
    str_0 = 'https://www.finedininglovers.com'
    hello_fresh_0 = module_1.HelloFresh(str_0, meta_http_equiv=int_0)
    assert f'{type(hello_fresh_0).__module__}.{type(hello_fresh_0).__qualname__}' == 'recipe_scrapers.hellofresh.HelloFresh'
    assert hello_fresh_0.exception_handling is True
    assert hello_fresh_0.meta_http_equiv == 10
    assert f'{type(hello_fresh_0.schema).__module__}.{type(hello_fresh_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert hello_fresh_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_1.HelloFresh.host).__module__}.{type(module_1.HelloFresh.host).__qualname__}' == 'builtins.method'

def test_case_2():
    int_0 = 10
    str_0 = 'https://www.finedininglovers.com'
    hello_fresh_0 = module_1.HelloFresh(str_0, meta_http_equiv=int_0)
    assert f'{type(hello_fresh_0).__module__}.{type(hello_fresh_0).__qualname__}' == 'recipe_scrapers.hellofresh.HelloFresh'
    assert hello_fresh_0.exception_handling is True
    assert hello_fresh_0.meta_http_equiv == 10
    assert f'{type(hello_fresh_0.schema).__module__}.{type(hello_fresh_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert hello_fresh_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_1.HelloFresh.host).__module__}.{type(module_1.HelloFresh.host).__qualname__}' == 'builtins.method'
    var_0 = hello_fresh_0.title()
    assert var_0 == 'Home'

def test_case_3():
    int_0 = 10
    str_0 = 'https://www.finedininglovers.com'
    hello_fresh_0 = module_1.HelloFresh(str_0, meta_http_equiv=int_0)
    assert f'{type(hello_fresh_0).__module__}.{type(hello_fresh_0).__qualname__}' == 'recipe_scrapers.hellofresh.HelloFresh'
    assert hello_fresh_0.exception_handling is True
    assert hello_fresh_0.meta_http_equiv == 10
    assert f'{type(hello_fresh_0.schema).__module__}.{type(hello_fresh_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert hello_fresh_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_1.HelloFresh.host).__module__}.{type(module_1.HelloFresh.host).__qualname__}' == 'builtins.method'
    var_0 = hello_fresh_0.yields()
    var_1 = hello_fresh_0.instructions()
    hello_fresh_1 = module_1.HelloFresh(str_0, var_1, test=var_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    int_0 = 10
    str_0 = 'https://www.finedininglovers.com'
    hello_fresh_0 = module_1.HelloFresh(str_0, meta_http_equiv=int_0)
    assert f'{type(hello_fresh_0).__module__}.{type(hello_fresh_0).__qualname__}' == 'recipe_scrapers.hellofresh.HelloFresh'
    assert hello_fresh_0.exception_handling is True
    assert hello_fresh_0.meta_http_equiv == 10
    assert f'{type(hello_fresh_0.schema).__module__}.{type(hello_fresh_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert hello_fresh_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_1.HelloFresh.host).__module__}.{type(module_1.HelloFresh.host).__qualname__}' == 'builtins.method'
    var_0 = hello_fresh_0.title()
    assert var_0 == 'Home'
    hello_fresh_1 = module_1.HelloFresh(str_0, str_0, var_0)
    assert hello_fresh_1.meta_http_equiv == 'Home'
    var_1 = hello_fresh_1.ingredients()
    var_1.__iter__(var_0)

def test_case_5():
    int_0 = 10
    str_0 = 'https://www.finedininglovers.com'
    hello_fresh_0 = module_1.HelloFresh(str_0, meta_http_equiv=int_0)
    assert f'{type(hello_fresh_0).__module__}.{type(hello_fresh_0).__qualname__}' == 'recipe_scrapers.hellofresh.HelloFresh'
    assert hello_fresh_0.exception_handling is True
    assert hello_fresh_0.meta_http_equiv == 10
    assert f'{type(hello_fresh_0.schema).__module__}.{type(hello_fresh_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert hello_fresh_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_1.HelloFresh.host).__module__}.{type(module_1.HelloFresh.host).__qualname__}' == 'builtins.method'
    var_0 = hello_fresh_0.instructions()

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = 'https://www.finedininglovers.com'
    hello_fresh_0 = module_1.HelloFresh(str_0)
    assert f'{type(hello_fresh_0).__module__}.{type(hello_fresh_0).__qualname__}' == 'recipe_scrapers.hellofresh.HelloFresh'
    assert hello_fresh_0.exception_handling is True
    assert hello_fresh_0.meta_http_equiv is False
    assert f'{type(hello_fresh_0.schema).__module__}.{type(hello_fresh_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert hello_fresh_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_1.HelloFresh.host).__module__}.{type(module_1.HelloFresh.host).__qualname__}' == 'builtins.method'
    var_0 = hello_fresh_0.yields()
    var_1 = hello_fresh_0.total_time()
    var_2 = hello_fresh_0.instructions()
    module_1.HelloFresh(hello_fresh_0)