# Automatically generated by Pynguin.
import pytest
import toolkit.structures.linked_list as module_0

def test_case_0():
    str_0 = '!ZWZtQo2mPPj%d#'
    linked_list_0 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 15
    var_0 = linked_list_0.__eq__(linked_list_0)
    assert var_0 is True

def test_case_1():
    bytes_0 = b'\x06\x18M'
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 3

def test_case_2():
    str_0 = ''
    linked_list_0 = module_0.LinkedList(str_0)
    assert len(linked_list_0) == 0

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = '!ZWZtQo2mPPj%d#'
    node_0 = module_0.Node(str_0)
    linked_list_0 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 15
    var_0 = linked_list_0.pop()
    assert var_0 == '#'
    assert len(linked_list_0) == 14
    var_1 = linked_list_0.__eq__(var_0)
    var_2 = var_0.__hash__()
    assert var_2 == -8909956860558866038
    var_3 = var_2.__eq__(var_0)
    var_4 = var_0.__str__()
    assert var_4 == '#'
    var_4.insert(var_0, var_3)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = '!ZWZtQo2mPPj%d#'
    node_0 = module_0.Node(str_0)
    linked_list_0 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 15
    var_0 = linked_list_0.pop()
    assert var_0 == '#'
    assert len(linked_list_0) == 14
    linked_list_0.__setitem__(linked_list_0, linked_list_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = '!ZWZtQo2mPPj%d#'
    linked_list_0 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 15
    linked_list_0.__getitem__(str_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    tuple_0 = ()
    list_0 = [tuple_0, tuple_0]
    bool_0 = False
    linked_list_0 = module_0.LinkedList(list_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 2
    var_0 = linked_list_0.__iter__()
    assert f'{type(var_0.current_node).__module__}.{type(var_0.current_node).__qualname__}' == 'toolkit.structures.linked_list.Node'
    assert var_0.towards == 'right'
    var_1 = linked_list_0.__len__()
    assert var_1 == 2
    var_2 = linked_list_0.pop()
    assert len(linked_list_0) == 1
    var_3 = linked_list_0.__radd__(tuple_0)
    assert f'{type(var_3).__module__}.{type(var_3).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_3) == 1
    var_3.insert(list_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    bytes_0 = b'\x06\x18M'
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 3
    linked_list_0.__setitem__(linked_list_0, linked_list_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = '!ZWZtQo2mPPj%d#'
    node_0 = module_0.Node(str_0)
    linked_list_0 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 15
    var_0 = linked_list_0.__iadd__(str_0)
    assert len(linked_list_0) == 30
    assert len(var_0) == 30
    var_0.remove(str_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    str_0 = '\t'
    bytes_0 = b'\xee\xe1b\x17L'
    linked_list_0 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 1
    linked_list_0.remove(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    bytes_0 = b'>>> '
    iterator_0 = module_0.Iterator(bytes_0)
    assert iterator_0.towards == 'right'
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 4
    linked_list_0.find(bytes_0, linked_list_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    int_0 = -413
    module_0.LinkedList(int_0)

def test_case_12():
    none_type_0 = None
    node_0 = module_0.Node(none_type_0)

def test_case_13():
    str_0 = '!ZWZtQo2mPPj%d#'
    node_0 = module_0.Node(str_0)
    linked_list_0 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 15
    var_0 = linked_list_0.pop()
    assert var_0 == '#'
    assert len(linked_list_0) == 14
    var_1 = node_0.__str__()

def test_case_14():
    set_0 = set()
    iterator_0 = module_0.Iterator(set_0)
    assert iterator_0.towards == 'right'

@pytest.mark.xfail(strict=True)
def test_case_15():
    bytes_0 = b'tF\xc2\xe1\xb7\xe2G\xec\xdb\t\xad\xfdFSE\xf7E\xb2\xd2\xe7'
    iterator_0 = module_0.Iterator(bytes_0)
    assert iterator_0.towards == 'right'
    var_0 = iterator_0.__iter__()
    assert var_0.towards == 'right'
    var_0.reverse_iter()

def test_case_16():
    bool_0 = False
    str_0 = 'qcA&g`jw7g;Fos'
    set_0 = {str_0}
    linked_list_0 = module_0.LinkedList(set_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 1
    var_0 = linked_list_0.insert(bool_0, bool_0)
    assert len(linked_list_0) == 2

@pytest.mark.xfail(strict=True)
def test_case_17():
    bytes_0 = b''
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert len(linked_list_0) == 0
    var_0 = linked_list_0.__str__()
    assert var_0 == '[]'
    str_0 = 'ayjcglMyJ=IV{2!gX$'
    node_0 = module_0.Node(str_0)
    linked_list_1 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_1).__module__}.{type(linked_list_1).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_1) == 18
    var_1 = linked_list_1.reverse_iter()
    assert f'{type(var_1.current_node).__module__}.{type(var_1.current_node).__qualname__}' == 'toolkit.structures.linked_list.Node'
    assert var_1.towards == 'left'
    linked_list_0.pop()

@pytest.mark.xfail(strict=True)
def test_case_18():
    set_0 = set()
    complex_0 = (537.7547-2286.5511j)
    linked_list_0 = module_0.LinkedList(set_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 0
    linked_list_0.__radd__(complex_0)

@pytest.mark.xfail(strict=True)
def test_case_19():
    bytes_0 = b''
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert len(linked_list_0) == 0
    var_0 = linked_list_0.__str__()
    assert var_0 == '[]'
    linked_list_0.find(var_0)

@pytest.mark.xfail(strict=True)
def test_case_20():
    bool_0 = False
    list_0 = [bool_0, bool_0, bool_0]
    linked_list_0 = module_0.LinkedList(list_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 3
    linked_list_0.__add__(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    bytes_0 = b'j\xecRK\xaf\xd6\x05mN\x9d'
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 10
    linked_list_1 = module_0.LinkedList(bytes_0)
    assert len(linked_list_1) == 10
    var_0 = linked_list_0.pop()
    assert var_0 == 157
    assert len(linked_list_0) == 9
    var_1 = linked_list_1.pop()
    assert var_1 == 157
    assert len(linked_list_1) == 9
    var_2 = linked_list_0.__eq__(bytes_0)
    var_3 = linked_list_1.__iter__()
    assert f'{type(var_3.current_node).__module__}.{type(var_3.current_node).__qualname__}' == 'toolkit.structures.linked_list.Node'
    assert var_3.towards == 'right'
    var_4 = linked_list_0.__radd__(bytes_0)
    assert f'{type(var_4).__module__}.{type(var_4).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_4) == 19
    var_5 = linked_list_0.__add__(linked_list_0)
    assert f'{type(var_5).__module__}.{type(var_5).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_5) == 18
    var_6 = linked_list_1.__add__(linked_list_1)
    assert len(var_6) == 18
    var_7 = var_5.__getitem__(var_2)
    assert var_7 == 106
    var_8 = linked_list_1.__eq__(linked_list_0)
    assert var_8 is True
    iterator_0 = module_0.Iterator(linked_list_0)
    assert len(iterator_0.current_node) == 9
    var_9 = linked_list_0.insert(var_2, linked_list_0)
    assert len(linked_list_0) == 10
    assert len(iterator_0.current_node) == 10
    var_10 = var_3.__iter__()
    int_0 = -388
    var_11 = linked_list_0.insert(int_0, bytes_0)
    assert len(linked_list_0) == 11
    assert len(iterator_0.current_node) == 11
    var_12 = linked_list_0.find(bytes_0)
    assert var_12 == 10
    linked_list_0.__setitem__(int_0, int_0)

def test_case_22():
    none_type_0 = None
    set_0 = {none_type_0, none_type_0, none_type_0, none_type_0}
    iterator_0 = module_0.Iterator(none_type_0, set_0)
    bool_0 = False
    bool_1 = False
    bool_2 = False
    bytes_0 = b'\xa9xJ\xb4\x85'
    bool_3 = False
    tuple_0 = (bool_2, bytes_0, bool_3)
    linked_list_0 = module_0.LinkedList(tuple_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 3
    var_0 = linked_list_0.remove(bool_1)
    assert var_0 is True
    assert len(linked_list_0) == 2
    var_1 = var_0.__radd__(bool_3)
    var_2 = var_0.__add__(bool_0)
    with pytest.raises(StopIteration):
        iterator_0.__next__()

def test_case_23():
    str_0 = '!WZtQomPPj%#'
    linked_list_0 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 12
    var_0 = linked_list_0.pop()
    assert var_0 == '#'
    assert len(linked_list_0) == 11
    var_1 = var_0.__iter__()
    var_2 = var_1.__str__()
    with pytest.raises(ValueError):
        linked_list_0.__hash__()

@pytest.mark.xfail(strict=True)
def test_case_24():
    bool_0 = False
    list_0 = [bool_0, bool_0, bool_0]
    linked_list_0 = module_0.LinkedList(list_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 3
    none_type_0 = None
    linked_list_0.remove(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_25():
    bytes_0 = b'>>> '
    iterator_0 = module_0.Iterator(bytes_0)
    assert iterator_0.towards == 'right'
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 4
    linked_list_0.find(bytes_0, linked_list_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    str_0 = '!ZWZtQo2mPPj%d#'
    node_0 = module_0.Node(str_0)
    linked_list_0 = module_0.LinkedList(str_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 15
    var_0 = linked_list_0.__str__()
    assert var_0 == "['!', 'Z', 'W', 'Z', 't', 'Q', 'o', '2', 'm', 'P', 'P', 'j', '%', 'd', '#']"
    var_1 = linked_list_0.pop()
    assert var_1 == '#'
    assert len(linked_list_0) == 14
    linked_list_0.__setitem__(linked_list_0, linked_list_0)

@pytest.mark.xfail(strict=True)
def test_case_27():
    bytes_0 = b''
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert len(linked_list_0) == 0
    int_0 = -384
    var_0 = linked_list_0.__radd__(linked_list_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_0) == 0
    var_1 = linked_list_0.insert(int_0, bytes_0)
    assert len(linked_list_0) == 1
    linked_list_0.find(linked_list_0)

@pytest.mark.xfail(strict=True)
def test_case_28():
    bytes_0 = b'Q\x18\xf0&\x08\x8a_\xccN\xfd*\xeb_v\xca>\xea\xda'
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 18
    iterator_0 = module_0.Iterator(bytes_0)
    assert iterator_0.towards == 'right'
    var_0 = linked_list_0.__eq__(linked_list_0)
    assert var_0 is True
    linked_list_1 = module_0.LinkedList(bytes_0)
    assert len(linked_list_1) == 18
    var_1 = linked_list_1.__len__()
    assert var_1 == 18
    linked_list_1.__setitem__(var_1, linked_list_0)

@pytest.mark.xfail(strict=True)
def test_case_29():
    bytes_0 = b'j\xecRK\xaf\xd6\x05mN\x9d'
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 10
    linked_list_1 = module_0.LinkedList(bytes_0)
    assert len(linked_list_1) == 10
    var_0 = linked_list_0.pop()
    assert var_0 == 157
    assert len(linked_list_0) == 9
    var_1 = linked_list_0.__eq__(bytes_0)
    var_2 = linked_list_1.__iter__()
    assert var_2.towards == 'right'
    var_3 = linked_list_0.__radd__(bytes_0)
    assert f'{type(var_3).__module__}.{type(var_3).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_3) == 19
    var_4 = linked_list_0.__add__(linked_list_0)
    assert f'{type(var_4).__module__}.{type(var_4).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_4) == 18
    var_5 = linked_list_1.__add__(linked_list_1)
    assert len(var_5) == 20
    var_6 = var_4.__getitem__(var_1)
    assert var_6 == 106
    var_7 = linked_list_1.__eq__(linked_list_0)
    assert var_7 is False
    var_8 = linked_list_1.__radd__(var_2)
    assert var_2.current_node is None
    assert f'{type(var_8).__module__}.{type(var_8).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_8) == 20
    iterator_0 = module_0.Iterator(linked_list_0)
    assert len(iterator_0.current_node) == 9
    var_9 = linked_list_0.insert(var_1, linked_list_0)
    assert len(linked_list_0) == 10
    assert len(iterator_0.current_node) == 10
    var_10 = var_2.__iter__()
    int_0 = -388
    var_11 = linked_list_0.insert(int_0, bytes_0)
    assert len(linked_list_0) == 11
    assert len(iterator_0.current_node) == 11
    var_12 = linked_list_1.__eq__(var_1)
    assert var_12 is False
    linked_list_0.__setitem__(int_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_30():
    bytes_0 = b'\xbbjj\xecRK\xaf\xd6\x05mN\x9d'
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 12
    var_0 = linked_list_0.__add__(linked_list_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_0) == 24
    var_1 = var_0.pop()
    assert var_1 == 157
    assert len(var_0) == 23
    var_2 = linked_list_0.insert(var_1, var_0)
    assert len(linked_list_0) == 13
    var_3 = linked_list_0.__eq__(bytes_0)
    var_4 = linked_list_0.__add__(linked_list_0)
    assert len(var_4) == 26
    var_5 = var_0.__eq__(var_0)
    assert var_5 is True
    var_6 = var_0.__eq__(linked_list_0)
    var_4.find(var_5, var_5)

@pytest.mark.xfail(strict=True)
def test_case_31():
    bytes_0 = b'j\xecRK\xaf\xd6\x05mN\x9d'
    linked_list_0 = module_0.LinkedList(bytes_0)
    assert f'{type(linked_list_0).__module__}.{type(linked_list_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(linked_list_0) == 10
    linked_list_1 = module_0.LinkedList(bytes_0)
    assert len(linked_list_1) == 10
    var_0 = linked_list_1.__add__(linked_list_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_0) == 20
    var_1 = linked_list_0.pop()
    assert var_1 == 157
    assert len(linked_list_0) == 9
    var_2 = linked_list_1.pop()
    assert var_2 == 157
    assert len(linked_list_1) == 9
    var_3 = linked_list_0.__eq__(bytes_0)
    var_4 = linked_list_1.__iter__()
    assert f'{type(var_4.current_node).__module__}.{type(var_4.current_node).__qualname__}' == 'toolkit.structures.linked_list.Node'
    var_5 = linked_list_0.__radd__(bytes_0)
    assert f'{type(var_5).__module__}.{type(var_5).__qualname__}' == 'toolkit.structures.linked_list.LinkedList'
    assert len(var_5) == 19
    var_6 = linked_list_1.__setitem__(var_3, linked_list_1)
    var_7 = linked_list_0.__add__(linked_list_0)
    assert len(var_7) == 18
    var_8 = var_7.__getitem__(var_3)
    assert var_8 == 106
    var_9 = linked_list_1.__eq__(linked_list_0)
    assert var_9 is False
    var_10 = linked_list_0.insert(var_3, linked_list_0)
    assert len(linked_list_0) == 10
    int_0 = -388
    var_11 = linked_list_0.insert(int_0, bytes_0)
    assert len(linked_list_0) == 11
    var_12 = linked_list_1.__eq__(var_3)
    assert var_12 is False
    var_13 = linked_list_0.find(bytes_0)
    assert var_13 == 10
    linked_list_0.__setitem__(int_0, int_0)