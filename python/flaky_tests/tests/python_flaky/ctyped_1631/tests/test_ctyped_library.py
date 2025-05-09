# Automatically generated by Pynguin.
import pytest
import ctyped.library as module_0
import collections as module_1
import ctyped.exceptions as module_2
import inspect as module_3

def test_case_0():
    dict_0 = {}
    scopes_0 = module_0.Scopes(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    none_type_0 = None
    module_0.Library(none_type_0, prefix=none_type_0)

def test_case_2():
    str_0 = 'Unable to find library: '
    bool_0 = False
    library_0 = module_0.Library(str_0, autoload=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'Unable to find library: '
    assert library_0.lib is None
    assert library_0.funcs == {}
    callable_0 = library_0.function(int_bits=bool_0)
    assert f'{type(callable_0).__module__}.{type(callable_0).__qualname__}' == 'functools.partial'

@pytest.mark.xfail(strict=True)
def test_case_3():
    none_type_0 = None
    none_type_0.bind_types()

def test_case_4():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    var_0 = library_0.bind_types()

@pytest.mark.xfail(strict=True)
def test_case_5():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    var_0 = library_0.structure(pack=none_type_0)
    var_0.__call__(var_0)

def test_case_6():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    var_0 = library_0.cls(prefix=none_type_0, str_type=none_type_0)
    ordered_dict_values_view_0 = module_1._OrderedDictValuesView(bool_0)
    var_1 = library_0.bind_types()

@pytest.mark.xfail(strict=True)
def test_case_7():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    library_0.sniff()

def test_case_8():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    var_0 = library_0.method(bool_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'functools.partial'

def test_case_9():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    callable_0 = library_0.function(int_sign=bool_0)
    assert f'{type(callable_0).__module__}.{type(callable_0).__qualname__}' == 'functools.partial'
    var_0 = library_0.structure(pack=none_type_0)
    var_1 = library_0.bind_types()
    with pytest.raises(module_2.CtypedException):
        library_0.load()

@pytest.mark.xfail(strict=True)
def test_case_10():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    callable_0 = library_0.function(wrap=bool_0, str_type=library_0, int_sign=none_type_0)
    assert f'{type(callable_0).__module__}.{type(callable_0).__qualname__}' == 'functools.partial'
    ordered_dict_values_view_0 = module_1._OrderedDictValuesView(bool_0)
    var_0 = library_0.bind_types()
    library_0.function(int_bits=ordered_dict_values_view_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    ordered_dict_values_view_0 = module_1._OrderedDictValuesView(bool_0)
    library_0.function(int_bits=ordered_dict_values_view_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    var_0 = library_0.structure(pack=none_type_0)
    library_0.method(var_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    str_0 = '>[sb 5N1{'
    var_0 = library_0.cls(prefix=str_0, str_type=str_0)
    var_1 = library_0.structure(pack=none_type_0)
    var_2 = library_0.bind_types()
    var_1.__call__(var_1)

def test_case_14():
    none_type_0 = None
    bool_0 = False
    library_0 = module_0.Library(none_type_0, autoload=bool_0, prefix=none_type_0, str_type=bool_0, int_bits=none_type_0, int_sign=bool_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'None'
    assert library_0.lib is None
    assert library_0.funcs == {}
    str_0 = 'Xc1d7u!C@xwg'
    var_0 = library_0.cls(prefix=str_0, str_type=str_0)
    var_1 = library_0.method()
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'functools.partial'
    var_2 = library_0.bind_types()
    abstract_context_manager_0 = var_0.__call__(var_0)
    with pytest.raises(module_2.CtypedException):
        library_0.load()

@pytest.mark.xfail(strict=True)
def test_case_15():
    str_0 = 'z'
    library_0 = module_0.Library(str_0)
    assert f'{type(library_0).__module__}.{type(library_0).__qualname__}' == 'ctyped.library.Library'
    assert library_0.name == 'z'
    assert f'{type(library_0.lib).__module__}.{type(library_0.lib).__qualname__}' == 'ctypes.CDLL'
    assert library_0.funcs == {}
    str_1 = '0w#vKpJ3!Yj2FFkkaL.C'
    str_2 = 'av%>\\s*\tMh8+'
    var_0 = module_3.getblock(str_2)
    dict_0 = {str_0: library_0, str_1: str_0, str_2: str_1, str_1: var_0}
    library_0.method(str_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    str_0 = '.'
    none_type_0 = None
    module_0.Library(str_0, prefix=str_0, int_sign=none_type_0)