# Automatically generated by Pynguin.
import pytest
import policyuniverse.action_categories as module_0
import enum as module_1

def test_case_0():
    str_0 = "ah ^'qa|Umx@f\\dgJc"
    var_0 = module_0.translate_aws_action_groups(str_0)
    assert var_0 == 'Unknown'

@pytest.mark.xfail(strict=True)
def test_case_1():
    bytes_0 = b'\xb6\xfd\xc8(|h\xa1'
    module_0.build_action_categories_from_service_data(bytes_0)

def test_case_2():
    none_type_0 = None
    var_0 = module_0.actions_for_category(none_type_0)
    var_1 = module_0.build_action_categories_from_service_data(var_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = '<h."L @l6aB'
    var_0 = module_1._EnumDict()
    var_1 = module_0.categories_for_actions(str_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'collections.defaultdict'
    assert len(var_1) == 11
    var_2 = module_0.build_action_categories_from_service_data(var_0)
    module_0.build_action_categories_from_service_data(str_0)

def test_case_4():
    str_0 = "ah ^'qa|Umx@f\\dgJc"
    var_0 = module_0.actions_for_category(str_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = 'List'
    var_0 = module_0.translate_aws_action_groups(str_0)
    assert var_0 == 'Unknown'
    var_1 = module_0.actions_for_category(str_0)
    var_2 = module_0.translate_aws_action_groups(var_1)
    assert var_2 == 'Unknown'
    var_3 = module_0.categories_for_actions(var_2)
    assert f'{type(var_3).__module__}.{type(var_3).__qualname__}' == 'collections.defaultdict'
    assert len(var_3) == 5
    none_type_0 = None
    module_0.build_action_categories_from_service_data(none_type_0)