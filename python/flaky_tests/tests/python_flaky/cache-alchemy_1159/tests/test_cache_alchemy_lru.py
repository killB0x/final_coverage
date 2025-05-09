# Automatically generated by Pynguin.
import pytest
import cache_alchemy.lru as module_0
import typing as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    int_0 = 402
    double_linked_list_0 = module_0.DoubleLinkedList(int_0)
    assert f'{type(double_linked_list_0).__module__}.{type(double_linked_list_0).__qualname__}' == 'cache_alchemy.lru.DoubleLinkedList'
    assert f'{type(module_0.DoubleLinkedList.key).__module__}.{type(module_0.DoubleLinkedList.key).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.next).__module__}.{type(module_0.DoubleLinkedList.next).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.prev).__module__}.{type(module_0.DoubleLinkedList.prev).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.result).__module__}.{type(module_0.DoubleLinkedList.result).__qualname__}' == 'builtins.member_descriptor'
    double_linked_list_0.__len__()

def test_case_1():
    bool_0 = False
    with pytest.raises(TypeError):
        module_0.LRUDict(bool_0)

def test_case_2():
    bool_0 = True
    l_r_u_dict_0 = module_0.LRUDict(bool_0)
    assert f'{type(l_r_u_dict_0).__module__}.{type(l_r_u_dict_0).__qualname__}' == 'cache_alchemy.lru.LRUDict'
    assert len(l_r_u_dict_0) == 0
    assert f'{type(module_0.LRUDict.full).__module__}.{type(module_0.LRUDict.full).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.LRUDict.lock).__module__}.{type(module_0.LRUDict.lock).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.max_size).__module__}.{type(module_0.LRUDict.max_size).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.root).__module__}.{type(module_0.LRUDict.root).__qualname__}' == 'builtins.member_descriptor'

@pytest.mark.xfail(strict=True)
def test_case_3():
    bool_0 = True
    l_r_u_dict_0 = module_0.LRUDict(bool_0)
    assert f'{type(l_r_u_dict_0).__module__}.{type(l_r_u_dict_0).__qualname__}' == 'cache_alchemy.lru.LRUDict'
    assert len(l_r_u_dict_0) == 0
    assert f'{type(module_0.LRUDict.full).__module__}.{type(module_0.LRUDict.full).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.LRUDict.lock).__module__}.{type(module_0.LRUDict.lock).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.max_size).__module__}.{type(module_0.LRUDict.max_size).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.root).__module__}.{type(module_0.LRUDict.root).__qualname__}' == 'builtins.member_descriptor'
    l_r_u_dict_0.__setitem__(l_r_u_dict_0, l_r_u_dict_0)

def test_case_4():
    bool_0 = True
    l_r_u_dict_0 = module_0.LRUDict(bool_0)
    assert f'{type(l_r_u_dict_0).__module__}.{type(l_r_u_dict_0).__qualname__}' == 'cache_alchemy.lru.LRUDict'
    assert len(l_r_u_dict_0) == 0
    assert f'{type(module_0.LRUDict.full).__module__}.{type(module_0.LRUDict.full).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.LRUDict.lock).__module__}.{type(module_0.LRUDict.lock).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.max_size).__module__}.{type(module_0.LRUDict.max_size).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.root).__module__}.{type(module_0.LRUDict.root).__qualname__}' == 'builtins.member_descriptor'
    var_0 = l_r_u_dict_0.get(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    generic_0 = module_1.Generic()
    double_linked_list_0 = module_0.DoubleLinkedList(generic_0)
    assert f'{type(double_linked_list_0).__module__}.{type(double_linked_list_0).__qualname__}' == 'cache_alchemy.lru.DoubleLinkedList'
    assert f'{type(module_0.DoubleLinkedList.key).__module__}.{type(module_0.DoubleLinkedList.key).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.next).__module__}.{type(module_0.DoubleLinkedList.next).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.prev).__module__}.{type(module_0.DoubleLinkedList.prev).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.result).__module__}.{type(module_0.DoubleLinkedList.result).__qualname__}' == 'builtins.member_descriptor'
    var_0 = double_linked_list_0.__iter__()
    double_linked_list_1 = module_0.DoubleLinkedList(var_0, generic_0)
    var_1 = double_linked_list_1.__hash__()
    var_1.clear()

@pytest.mark.xfail(strict=True)
def test_case_6():
    bool_0 = True
    double_linked_list_0 = module_0.DoubleLinkedList(bool_0)
    assert f'{type(double_linked_list_0).__module__}.{type(double_linked_list_0).__qualname__}' == 'cache_alchemy.lru.DoubleLinkedList'
    assert f'{type(module_0.DoubleLinkedList.key).__module__}.{type(module_0.DoubleLinkedList.key).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.next).__module__}.{type(module_0.DoubleLinkedList.next).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.prev).__module__}.{type(module_0.DoubleLinkedList.prev).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.result).__module__}.{type(module_0.DoubleLinkedList.result).__qualname__}' == 'builtins.member_descriptor'
    var_0 = double_linked_list_0.__repr__()
    assert var_0 == 'None'
    l_r_u_dict_0 = module_0.LRUDict(bool_0)
    assert f'{type(l_r_u_dict_0).__module__}.{type(l_r_u_dict_0).__qualname__}' == 'cache_alchemy.lru.LRUDict'
    assert len(l_r_u_dict_0) == 0
    assert f'{type(module_0.LRUDict.full).__module__}.{type(module_0.LRUDict.full).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.LRUDict.lock).__module__}.{type(module_0.LRUDict.lock).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.max_size).__module__}.{type(module_0.LRUDict.max_size).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.root).__module__}.{type(module_0.LRUDict.root).__qualname__}' == 'builtins.member_descriptor'
    var_1 = l_r_u_dict_0.get(bool_0)
    l_r_u_dict_0.__setitem__(l_r_u_dict_0, l_r_u_dict_0)

def test_case_7():
    bool_0 = False
    double_linked_list_0 = module_0.DoubleLinkedList(bool_0)
    assert f'{type(double_linked_list_0).__module__}.{type(double_linked_list_0).__qualname__}' == 'cache_alchemy.lru.DoubleLinkedList'
    assert f'{type(module_0.DoubleLinkedList.key).__module__}.{type(module_0.DoubleLinkedList.key).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.next).__module__}.{type(module_0.DoubleLinkedList.next).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.prev).__module__}.{type(module_0.DoubleLinkedList.prev).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.DoubleLinkedList.result).__module__}.{type(module_0.DoubleLinkedList.result).__qualname__}' == 'builtins.member_descriptor'
    none_type_0 = None
    double_linked_list_1 = module_0.DoubleLinkedList(double_linked_list_0, none_type_0)
    var_0 = double_linked_list_1.__str__()
    var_1 = double_linked_list_0.__hash__()
    assert var_1 == 0
    var_2 = var_0.__iter__()
    var_3 = var_2.__hash__()

@pytest.mark.xfail(strict=True)
def test_case_8():
    bool_0 = True
    l_r_u_dict_0 = module_0.LRUDict(bool_0)
    assert f'{type(l_r_u_dict_0).__module__}.{type(l_r_u_dict_0).__qualname__}' == 'cache_alchemy.lru.LRUDict'
    assert len(l_r_u_dict_0) == 0
    assert f'{type(module_0.LRUDict.full).__module__}.{type(module_0.LRUDict.full).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.LRUDict.lock).__module__}.{type(module_0.LRUDict.lock).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.max_size).__module__}.{type(module_0.LRUDict.max_size).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.root).__module__}.{type(module_0.LRUDict.root).__qualname__}' == 'builtins.member_descriptor'
    l_r_u_dict_0.get(l_r_u_dict_0, l_r_u_dict_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    bool_0 = True
    l_r_u_dict_0 = module_0.LRUDict(bool_0)
    assert f'{type(l_r_u_dict_0).__module__}.{type(l_r_u_dict_0).__qualname__}' == 'cache_alchemy.lru.LRUDict'
    assert len(l_r_u_dict_0) == 0
    assert f'{type(module_0.LRUDict.full).__module__}.{type(module_0.LRUDict.full).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.LRUDict.lock).__module__}.{type(module_0.LRUDict.lock).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.max_size).__module__}.{type(module_0.LRUDict.max_size).__qualname__}' == 'builtins.member_descriptor'
    assert f'{type(module_0.LRUDict.root).__module__}.{type(module_0.LRUDict.root).__qualname__}' == 'builtins.member_descriptor'
    str_0 = '-7;'
    var_0 = l_r_u_dict_0.get(bool_0)
    var_1 = l_r_u_dict_0.__setitem__(str_0, var_0)
    assert len(l_r_u_dict_0) == 1
    l_r_u_dict_0.__setitem__(l_r_u_dict_0, l_r_u_dict_0)