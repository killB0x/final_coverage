# Automatically generated by Pynguin.
import pytest
import recipe_scrapers.nihhealthyeating as module_0
import recipe_scrapers._utils as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    int_0 = -760
    module_0.NIHHealthyEating(int_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'https://www.finedininglovers.com'
    str_1 = 'qty'
    list_0 = [str_1, str_1]
    n_i_h_healthy_eating_0 = module_0.NIHHealthyEating(str_0, list_0, str_1)
    assert f'{type(n_i_h_healthy_eating_0).__module__}.{type(n_i_h_healthy_eating_0).__qualname__}' == 'recipe_scrapers.nihhealthyeating.NIHHealthyEating'
    assert n_i_h_healthy_eating_0.exception_handling == ['qty', 'qty']
    assert n_i_h_healthy_eating_0.meta_http_equiv == 'qty'
    assert f'{type(n_i_h_healthy_eating_0.schema).__module__}.{type(n_i_h_healthy_eating_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert n_i_h_healthy_eating_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.NIHHealthyEating.host).__module__}.{type(module_0.NIHHealthyEating.host).__qualname__}' == 'builtins.method'
    var_0 = n_i_h_healthy_eating_0.links()
    var_0.title()

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = 'https://www.finedininglovers.com'
    str_1 = 'qty'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_1}
    list_0 = [str_1, str_1]
    n_i_h_healthy_eating_0 = module_0.NIHHealthyEating(str_0, list_0, str_1)
    assert f'{type(n_i_h_healthy_eating_0).__module__}.{type(n_i_h_healthy_eating_0).__qualname__}' == 'recipe_scrapers.nihhealthyeating.NIHHealthyEating'
    assert n_i_h_healthy_eating_0.exception_handling == ['qty', 'qty']
    assert n_i_h_healthy_eating_0.meta_http_equiv == 'qty'
    assert f'{type(n_i_h_healthy_eating_0.schema).__module__}.{type(n_i_h_healthy_eating_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert n_i_h_healthy_eating_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.NIHHealthyEating.host).__module__}.{type(module_0.NIHHealthyEating.host).__qualname__}' == 'builtins.method'
    var_0 = n_i_h_healthy_eating_0.links()
    var_1 = n_i_h_healthy_eating_0.ingredients()
    module_1.get_yields(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = 'https://www.finedininglovers.com'
    str_1 = 'qty'
    list_0 = [str_1, str_1]
    n_i_h_healthy_eating_0 = module_0.NIHHealthyEating(str_0, list_0, str_1)
    assert f'{type(n_i_h_healthy_eating_0).__module__}.{type(n_i_h_healthy_eating_0).__qualname__}' == 'recipe_scrapers.nihhealthyeating.NIHHealthyEating'
    assert n_i_h_healthy_eating_0.exception_handling == ['qty', 'qty']
    assert n_i_h_healthy_eating_0.meta_http_equiv == 'qty'
    assert f'{type(n_i_h_healthy_eating_0.schema).__module__}.{type(n_i_h_healthy_eating_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert n_i_h_healthy_eating_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.NIHHealthyEating.host).__module__}.{type(module_0.NIHHealthyEating.host).__qualname__}' == 'builtins.method'
    var_0 = n_i_h_healthy_eating_0.total_time()
    var_0.title()

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = 'https://www.finedininglovers.com'
    str_1 = '+L!3'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_1}
    list_0 = [dict_0, str_1, str_1]
    n_i_h_healthy_eating_0 = module_0.NIHHealthyEating(str_0, list_0, str_1)
    assert f'{type(n_i_h_healthy_eating_0).__module__}.{type(n_i_h_healthy_eating_0).__qualname__}' == 'recipe_scrapers.nihhealthyeating.NIHHealthyEating'
    assert n_i_h_healthy_eating_0.exception_handling == [{'https://www.finedininglovers.com': '+L!3'}, '+L!3', '+L!3']
    assert n_i_h_healthy_eating_0.meta_http_equiv == '+L!3'
    assert f'{type(n_i_h_healthy_eating_0.schema).__module__}.{type(n_i_h_healthy_eating_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert n_i_h_healthy_eating_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.NIHHealthyEating.host).__module__}.{type(module_0.NIHHealthyEating.host).__qualname__}' == 'builtins.method'
    var_0 = n_i_h_healthy_eating_0.title()
    assert var_0 == 'Home'
    module_1.get_yields(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = 'https://www.finedininglovers.com'
    str_1 = 'qty'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_1}
    list_0 = [str_1, str_1]
    n_i_h_healthy_eating_0 = module_0.NIHHealthyEating(str_0, list_0, str_1)
    assert f'{type(n_i_h_healthy_eating_0).__module__}.{type(n_i_h_healthy_eating_0).__qualname__}' == 'recipe_scrapers.nihhealthyeating.NIHHealthyEating'
    assert n_i_h_healthy_eating_0.exception_handling == ['qty', 'qty']
    assert n_i_h_healthy_eating_0.meta_http_equiv == 'qty'
    assert f'{type(n_i_h_healthy_eating_0.schema).__module__}.{type(n_i_h_healthy_eating_0.schema).__qualname__}' == 'recipe_scrapers._schemaorg.SchemaOrg'
    assert n_i_h_healthy_eating_0.url == 'https://www.finedininglovers.com'
    assert f'{type(module_0.NIHHealthyEating.host).__module__}.{type(module_0.NIHHealthyEating.host).__qualname__}' == 'builtins.method'
    var_0 = n_i_h_healthy_eating_0.instructions()
    var_1 = n_i_h_healthy_eating_0.links()
    module_1.get_yields(dict_0)