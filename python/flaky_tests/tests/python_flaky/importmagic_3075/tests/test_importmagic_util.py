# Automatically generated by Pynguin.
import pytest
import importmagic.util as module_0
import re as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    var_0 = module_0.get_cache_dir()
    assert var_0 == '/root/.cache/importmagic/'
    module_0.parse_ast(var_0)

def test_case_1():
    str_0 = 'tkinter.dnd'
    var_0 = module_0.parse_ast(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'ast.Module'
    assert f'{type(var_0.body).__module__}.{type(var_0.body).__qualname__}' == 'builtins.list'
    assert len(var_0.body) == 1
    assert var_0.type_ignores == []
    var_1 = module_0.parse_ast(var_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'ast.Module'
    assert f'{type(var_1.body).__module__}.{type(var_1.body).__qualname__}' == 'builtins.list'
    assert len(var_1.body) == 1
    assert var_1.type_ignores == []
    var_2 = module_0.dump(var_0)
    assert var_2 == "Module(\n  body=[\n      Expr(\n        value=Attribute(\n          value=Name(\n            id='tkinter',\n            ctx=Load()),\n          attr='dnd',\n          ctx=Load())),\n    ],\n  type_ignores=[])"
    with pytest.raises(TypeError):
        module_0.dump(str_0)

def test_case_2():
    var_0 = module_0.get_cache_dir()
    assert var_0 == '/root/.cache/importmagic/'
    with pytest.raises(TypeError):
        module_0.dump(var_0, include_attributes=var_0)

def test_case_3():
    var_0 = module_0.get_cache_dir()
    assert var_0 == '/root/.cache/importmagic/'

@pytest.mark.xfail(strict=True)
def test_case_4():
    var_0 = module_0.get_cache_dir()
    assert var_0 == '/root/.cache/importmagic/'
    var_0.visit_ExceptHandler(var_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    var_0 = module_0.get_cache_dir()
    assert var_0 == '/root/.cache/importmagic/'
    module_0.parse_ast(var_0, var_0)

def test_case_6():
    str_0 = 'XvxFl_2wI'
    var_0 = module_0.parse_ast(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'ast.Module'
    assert f'{type(var_0.body).__module__}.{type(var_0.body).__qualname__}' == 'builtins.list'
    assert len(var_0.body) == 1
    assert var_0.type_ignores == []
    var_1 = module_0.get_cache_dir()
    assert var_1 == '/root/.cache/importmagic/'
    var_2 = module_0.get_cache_dir()
    assert var_2 == '/root/.cache/importmagic/'
    var_3 = module_0.get_cache_dir()
    assert var_3 == '/root/.cache/importmagic/'
    var_4 = module_0.dump(var_0, include_attributes=var_2)
    assert var_4 == "Module(\n  body=[\n      Expr(\n        value=Name(\n          id='XvxFl_2wI',\n          ctx=Load(),\n          lineno=1,\n          col_offset=0,\n          end_lineno=1,\n          end_col_offset=9),\n        lineno=1,\n        col_offset=0,\n        end_lineno=1,\n        end_col_offset=9),\n    ],\n  type_ignores=[])"
    with pytest.raises(TypeError):
        module_0.dump(str_0, indent=var_4)

def test_case_7():
    str_0 = 'XvxFl_2wI'
    var_0 = module_0.parse_ast(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'ast.Module'
    assert f'{type(var_0.body).__module__}.{type(var_0.body).__qualname__}' == 'builtins.list'
    assert len(var_0.body) == 1
    assert var_0.type_ignores == []
    var_1 = module_1.purge()
    var_2 = module_0.dump(var_0, var_1)
    assert var_2 == "Module(\n  [\n      Expr(\n        Name(\n          'XvxFl_2wI',\n          Load())),\n    ],\n  [])"
    var_3 = module_0.get_cache_dir()
    assert var_3 == '/root/.cache/importmagic/'
    var_4 = module_0.get_cache_dir()
    assert var_4 == '/root/.cache/importmagic/'
    var_5 = module_0.dump(var_0)
    assert var_5 == "Module(\n  body=[\n      Expr(\n        value=Name(\n          id='XvxFl_2wI',\n          ctx=Load())),\n    ],\n  type_ignores=[])"
    var_6 = module_0.get_cache_dir()
    assert var_6 == '/root/.cache/importmagic/'
    var_7 = module_0.dump(var_0, include_attributes=var_3)
    assert var_7 == "Module(\n  body=[\n      Expr(\n        value=Name(\n          id='XvxFl_2wI',\n          ctx=Load(),\n          lineno=1,\n          col_offset=0,\n          end_lineno=1,\n          end_col_offset=9),\n        lineno=1,\n        col_offset=0,\n        end_lineno=1,\n        end_col_offset=9),\n    ],\n  type_ignores=[])"
    with pytest.raises(TypeError):
        module_0.dump(str_0, indent=var_7)