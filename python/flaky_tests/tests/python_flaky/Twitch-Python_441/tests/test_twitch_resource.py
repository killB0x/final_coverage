# Automatically generated by Pynguin.
import pytest
import twitch.resource as module_0
import twitch.api as module_1
import typing as module_2

def test_case_0():
    str_0 = '!{)5`:xx->\x0cf[5'
    resource_0 = module_0.Resource(str_0, str_0, str_0)
    assert f'{type(resource_0).__module__}.{type(resource_0).__qualname__}' == 'twitch.resource.Resource'
    assert module_0.Resource.FIRST_API_LIMIT == 100

def test_case_1():
    str_0 = 'Y'
    resource_0 = module_0.Resource(str_0, str_0)
    assert f'{type(resource_0).__module__}.{type(resource_0).__qualname__}' == 'twitch.resource.Resource'
    assert module_0.Resource.FIRST_API_LIMIT == 100

@pytest.mark.xfail(strict=True)
def test_case_2():
    bool_0 = True
    none_type_0 = None
    a_p_i_0 = module_1.API(client_id=none_type_0, handle_rate_limit=none_type_0)
    resource_0 = module_0.Resource(a_p_i_0, a_p_i_0, none_type_0)
    assert f'{type(resource_0).__module__}.{type(resource_0).__qualname__}' == 'twitch.resource.Resource'
    assert module_0.Resource.FIRST_API_LIMIT == 100
    resource_0.__getitem__(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = '[re6f#%E1Z&M\x0c+-~\\Y0'
    resource_0 = module_0.Resource(str_0, str_0)
    assert f'{type(resource_0).__module__}.{type(resource_0).__qualname__}' == 'twitch.resource.Resource'
    assert module_0.Resource.FIRST_API_LIMIT == 100
    module_2.Generic(*resource_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = '[re\nf#%E1Z,&M\x0c+-~\\Y0'
    bytes_0 = b'\xc0U@\xd3\x88W"\x0cr4~|\x0e1\x1d'
    list_0 = [str_0, bytes_0, str_0, str_0]
    resource_0 = module_0.Resource(str_0, bytes_0, list_0)
    assert f'{type(resource_0).__module__}.{type(resource_0).__qualname__}' == 'twitch.resource.Resource'
    assert module_0.Resource.FIRST_API_LIMIT == 100
    module_2.Generic(*resource_0)