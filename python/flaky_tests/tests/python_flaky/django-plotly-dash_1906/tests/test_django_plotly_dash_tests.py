# Automatically generated by Pynguin.
import pytest
import django_plotly_dash.tests as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    module_0.test_direct_access(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    none_type_0 = None
    module_0.test_updating(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = 'some_config'
    module_0.test_injection_app_access(str_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    var_0 = module_0.test_middleware_artifacts()
    module_0.test_injection_updating_multiple_callbacks(var_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    none_type_0 = None
    module_0.test_injection_updating(none_type_0)

def test_case_5():
    var_0 = module_0.test_middleware_artifacts()

@pytest.mark.xfail(strict=True)
def test_case_6():
    module_0.test_demo_routing()