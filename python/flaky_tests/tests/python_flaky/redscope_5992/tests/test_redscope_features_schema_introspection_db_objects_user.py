# Automatically generated by Pynguin.
import redscope.features.schema_introspection.db_objects.user as module_0

def test_case_0():
    str_0 = '_groups.sql'
    user_0 = module_0.User(str_0)
    assert f'{type(user_0).__module__}.{type(user_0).__qualname__}' == 'redscope.features.schema_introspection.db_objects.user.User'
    assert user_0.name == '_groups.sql'
    assert f'{type(module_0.User.file_name).__module__}.{type(module_0.User.file_name).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.User.create).__module__}.{type(module_0.User.create).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.User.create_if_not_exist).__module__}.{type(module_0.User.create_if_not_exist).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.User.drop).__module__}.{type(module_0.User.drop).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.User.drop_if_exist).__module__}.{type(module_0.User.drop_if_exist).__qualname__}' == 'builtins.property'