# Automatically generated by Pynguin.
import pytest
import snippy.content.collection as module_0
import snippy.content.resource as module_1

def test_case_0():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.__str__()
    assert var_0 == '\x1b[96;1m# \x1b[1;92mcollection meta\x1b[0m\n   \x1b[91m!\x1b[0m \x1b[2mtotal\x1b[0m : 0\n'

def test_case_1():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.__ne__(collection_0)
    assert var_0 is False

def test_case_2():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.dump_term(collection_0, collection_0, collection_0, collection_0, collection_0)

def test_case_3():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.load_dict(collection_0, collection_0)

def test_case_4():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.values()

def test_case_5():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.category_list()

def test_case_6():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.migrate(collection_0)
    assert var_0 is False

def test_case_7():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    resource_0 = module_1.Resource(list_=collection_0)
    assert f'{type(resource_0).__module__}.{type(resource_0).__qualname__}' == 'snippy.content.resource.Resource'
    var_0 = collection_0.merge(resource_0)

def test_case_8():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.merge(collection_0)

def test_case_9():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    str_0 = 'B<}xy]Og9~\x0ciyp#'
    var_0 = collection_0.convert(str_0, collection_0)

def test_case_10():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.convert(collection_0)

def test_case_11():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.dump_mkdn(collection_0)
    assert var_0 == ''
    var_1 = collection_0.load(var_0, collection_0, collection_0)

def test_case_12():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.dump_dict(collection_0)

def test_case_13():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.dump_dict()

def test_case_14():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.dump_text(collection_0)
    assert var_0 == ''

def test_case_15():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.dump_mkdn(collection_0)
    assert var_0 == ''

def test_case_16():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'

@pytest.mark.xfail(strict=True)
def test_case_17():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.dump_text(collection_0)
    assert var_0 == ''
    var_1 = collection_0.load_mkdn(collection_0, var_0)
    var_2 = collection_0.dump_term(var_0, var_0, var_0, var_0, var_0)
    collection_0.__getitem__(var_1)

def test_case_18():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.load_text(collection_0, collection_0)

def test_case_19():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.__str__()
    assert var_0 == '\x1b[96;1m# \x1b[1;92mcollection meta\x1b[0m\n   \x1b[91m!\x1b[0m \x1b[2mtotal\x1b[0m : 0\n'
    var_1 = collection_0.load_mkdn(collection_0, var_0)

def test_case_20():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    var_0 = collection_0.keys()
    complex_0 = (-896.8-1447.7j)
    var_1 = collection_0.merge(complex_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    collection_0 = module_0.Collection()
    assert len(collection_0) == 0
    assert f'{type(module_0.Collection.get_resource).__module__}.{type(module_0.Collection.get_resource).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.Collection.total).__module__}.{type(module_0.Collection.total).__qualname__}' == 'builtins.property'
    none_type_0 = None
    var_0 = collection_0.__iter__()
    var_1 = collection_0.merge(none_type_0)
    tuple_0 = ()
    collection_1 = module_0.Collection()
    assert len(collection_1) == 0
    var_2 = collection_1.resources()
    var_3 = collection_1.convert(tuple_0)
    bool_0 = False
    tuple_1 = (bool_0, tuple_0)
    var_4 = collection_0.convert(tuple_1, tuple_0)
    var_1.remove_ansi(collection_0)