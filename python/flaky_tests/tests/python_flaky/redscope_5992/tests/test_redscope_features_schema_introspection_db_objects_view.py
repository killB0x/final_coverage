# Automatically generated by Pynguin.
import redscope.features.schema_introspection.db_objects.view as module_0

def test_case_0():
    str_0 = 'Hj|V\x0brPC\x0b;bfs'
    view_0 = module_0.View(str_0, str_0, str_0)
    assert f'{type(view_0).__module__}.{type(view_0).__qualname__}' == 'redscope.features.schema_introspection.db_objects.view.View'
    assert view_0.name == 'Hj|V\x0brPC\x0b;bfs'
    assert view_0.schema == 'Hj|V\x0brPC\x0b;bfs'
    assert view_0.ddl == 'Hj|V\x0brPC\x0b;bfs'
    assert f'{type(module_0.View.file_name).__module__}.{type(module_0.View.file_name).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.View.create).__module__}.{type(module_0.View.create).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.View.create_if_not_exist).__module__}.{type(module_0.View.create_if_not_exist).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.View.drop).__module__}.{type(module_0.View.drop).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.View.drop_if_exist).__module__}.{type(module_0.View.drop_if_exist).__qualname__}' == 'builtins.property'