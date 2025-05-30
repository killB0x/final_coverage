# Automatically generated by Pynguin.
import pytest
import penman.transform as module_0
import penman.graph as module_1
import penman.tree as module_2
import penman.model as module_3

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    module_0.canonicalize_roles(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    float_0 = -789.0
    module_0.canonicalize_roles(float_0, float_0)

def test_case_2():
    graph_0 = module_1.Graph()
    graph_1 = module_0.dereify_edges(graph_0, graph_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    none_type_0 = None
    module_0.dereify_edges(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    bool_0 = True
    module_0.dereify_edges(bool_0, bool_0)

def test_case_5():
    graph_0 = module_1.Graph()
    graph_1 = module_0.reify_attributes(graph_0)

def test_case_6():
    graph_0 = module_1.Graph()
    graph_1 = module_0.reify_edges(graph_0, graph_0)

def test_case_7():
    graph_0 = module_1.Graph()
    graph_1 = module_0.indicate_branches(graph_0, graph_0)

def test_case_8():
    str_0 = 'Z=\\qWmbJ(w|6 fC\r'
    tuple_0 = (str_0, str_0)
    list_0 = [tuple_0, tuple_0, tuple_0]
    tuple_1 = (str_0, list_0)
    tree_0 = module_2.Tree(tuple_1)
    none_type_0 = None
    tree_1 = module_0.canonicalize_roles(tree_0, none_type_0)
    assert f'{type(tree_1).__module__}.{type(tree_1).__qualname__}' == 'penman.tree.Tree'

def test_case_9():
    set_0 = set()
    none_type_0 = None
    graph_0 = module_1.Graph(epidata=set_0, metadata=none_type_0)
    graph_1 = module_0.reify_edges(graph_0, none_type_0)

def test_case_10():
    str_0 = '<L^|da,'
    tuple_0 = (str_0, str_0, str_0)
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    graph_0 = module_1.Graph(tuple_1, str_0)
    graph_1 = module_0.dereify_edges(graph_0, tuple_1)
    assert f'{type(graph_1).__module__}.{type(graph_1).__qualname__}' == 'penman.graph.Graph'
    assert graph_1.triples == [('<L^|da,', ':<L^|da,', '<L^|da,'), ('<L^|da,', ':<L^|da,', '<L^|da,'), ('<L^|da,', ':<L^|da,', '<L^|da,')]
    assert graph_1.epidata == {}
    assert graph_1.metadata == {}

def test_case_11():
    str_0 = '<L^|da,'
    tuple_0 = (str_0, str_0, str_0)
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    str_1 = ';Q?F,g'
    graph_0 = module_1.Graph(tuple_1, str_1)
    tuple_2 = ()
    graph_1 = module_0.indicate_branches(graph_0, tuple_2)
    assert f'{type(graph_1).__module__}.{type(graph_1).__qualname__}' == 'penman.graph.Graph'
    assert graph_1.triples == [('<L^|da,', ':<L^|da,', '<L^|da,'), ('<L^|da,', ':<L^|da,', '<L^|da,'), ('<L^|da,', ':<L^|da,', '<L^|da,')]
    assert graph_1.epidata == {}
    assert graph_1.metadata == {}

def test_case_12():
    str_0 = 'nfbmQNfTi_|i=e"'
    str_1 = 'LK.?5 '
    tuple_0 = (str_0, str_1, str_1)
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    graph_0 = module_1.Graph(tuple_1, str_0)
    graph_1 = module_0.reify_attributes(graph_0)
    assert f'{type(graph_1).__module__}.{type(graph_1).__qualname__}' == 'penman.graph.Graph'
    assert graph_1.triples == [('nfbmQNfTi_|i=e"', ':LK.?5 ', '_'), ('_', ':instance', 'LK.?5 '), ('nfbmQNfTi_|i=e"', ':LK.?5 ', '_2'), ('_2', ':instance', 'LK.?5 '), ('nfbmQNfTi_|i=e"', ':LK.?5 ', '_3'), ('_3', ':instance', 'LK.?5 ')]
    assert f'{type(graph_1.epidata).__module__}.{type(graph_1.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_1.epidata) == 6
    assert graph_1.metadata == {}

def test_case_13():
    str_0 = 'nfbmQNfTi_|i=e"'
    tuple_0 = (str_0, str_0, str_0)
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    graph_0 = module_1.Graph(tuple_1, str_0)
    none_type_0 = None
    graph_1 = module_0.reify_edges(graph_0, none_type_0)
    assert f'{type(graph_1).__module__}.{type(graph_1).__qualname__}' == 'penman.graph.Graph'
    assert graph_1.triples == [('nfbmQNfTi_|i=e"', ':nfbmQNfTi_|i=e"', 'nfbmQNfTi_|i=e"'), ('nfbmQNfTi_|i=e"', ':nfbmQNfTi_|i=e"', 'nfbmQNfTi_|i=e"'), ('nfbmQNfTi_|i=e"', ':nfbmQNfTi_|i=e"', 'nfbmQNfTi_|i=e"')]
    assert graph_1.epidata == {}
    assert graph_1.metadata == {}
    graph_2 = module_0.reify_attributes(graph_0)
    assert graph_2.triples == [('nfbmQNfTi_|i=e"', ':nfbmQNfTi_|i=e"', 'nfbmQNfTi_|i=e"'), ('nfbmQNfTi_|i=e"', ':nfbmQNfTi_|i=e"', 'nfbmQNfTi_|i=e"'), ('nfbmQNfTi_|i=e"', ':nfbmQNfTi_|i=e"', 'nfbmQNfTi_|i=e"')]
    assert graph_2.epidata == {}

def test_case_14():
    str_0 = 'nfbmQNfTi_|i=e"'
    tuple_0 = (str_0, str_0, str_0)
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    graph_0 = module_1.Graph(tuple_1, str_0)
    none_type_0 = None
    graph_1 = module_0.reify_edges(graph_0, none_type_0)
    assert f'{type(graph_1).__module__}.{type(graph_1).__qualname__}' == 'penman.graph.Graph'
    assert graph_1.triples == [('nfbmQNfTi_|i=e"', ':nfbmQNfTi_|i=e"', 'nfbmQNfTi_|i=e"'), ('nfbmQNfTi_|i=e"', ':nfbmQNfTi_|i=e"', 'nfbmQNfTi_|i=e"'), ('nfbmQNfTi_|i=e"', ':nfbmQNfTi_|i=e"', 'nfbmQNfTi_|i=e"')]
    assert graph_1.epidata == {}
    assert graph_1.metadata == {}

@pytest.mark.xfail(strict=True)
def test_case_15():
    str_0 = 'nfbmQNfTi_|i=e"'
    str_1 = '<q$'
    tuple_0 = (str_0, str_1, str_1)
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    graph_0 = module_1.Graph(tuple_1, str_0)
    graph_1 = module_0.reify_attributes(graph_0)
    assert f'{type(graph_1).__module__}.{type(graph_1).__qualname__}' == 'penman.graph.Graph'
    assert graph_1.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert f'{type(graph_1.epidata).__module__}.{type(graph_1.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_1.epidata) == 6
    assert graph_1.metadata == {}
    module_0.indicate_branches(graph_1, tuple_1)

def test_case_16():
    str_0 = 'nfbmQNfTi_|i=e"'
    str_1 = '<q$'
    tuple_0 = (str_0, str_1, str_1)
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    graph_0 = module_1.Graph(tuple_1, str_0)
    graph_1 = module_0.reify_attributes(graph_0)
    assert f'{type(graph_1).__module__}.{type(graph_1).__qualname__}' == 'penman.graph.Graph'
    assert graph_1.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert f'{type(graph_1.epidata).__module__}.{type(graph_1.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_1.epidata) == 6
    assert graph_1.metadata == {}
    graph_2 = module_0.dereify_edges(graph_1, str_0)
    assert f'{type(graph_2).__module__}.{type(graph_2).__qualname__}' == 'penman.graph.Graph'
    assert graph_2.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert f'{type(graph_2.epidata).__module__}.{type(graph_2.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_2.epidata) == 6
    assert graph_2.metadata == {}

@pytest.mark.xfail(strict=True)
def test_case_17():
    str_0 = 'nfbmQNfTi_|i=e"'
    str_1 = '<q$'
    tuple_0 = (str_0, str_1, str_1)
    none_type_0 = None
    graph_0 = module_1.Graph(metadata=none_type_0)
    graph_1 = module_0.reify_edges(graph_0, str_1)
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    str_2 = ';Q?F,g'
    graph_2 = module_1.Graph(tuple_1, str_2)
    str_3 = 't=qjFO\tN*r5juh|<'
    str_4 = 'n"WT'
    tuple_2 = (str_4, graph_1)
    tuple_3 = (str_3, str_1)
    list_0 = [tuple_2, tuple_3, tuple_3]
    tuple_4 = (str_3, list_0)
    tree_0 = module_2.Tree(tuple_4, none_type_0)
    var_0 = graph_0.__or__(none_type_0)
    var_1 = var_0.__repr__()
    module_0.canonicalize_roles(tree_0, var_1)

@pytest.mark.xfail(strict=True)
def test_case_18():
    str_0 = 'nfbmQNfTi_|i=e"'
    str_1 = '<q$'
    tuple_0 = (str_0, str_1, str_1)
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    graph_0 = module_1.Graph(tuple_1, str_0)
    graph_1 = module_0.reify_attributes(graph_0)
    assert f'{type(graph_1).__module__}.{type(graph_1).__qualname__}' == 'penman.graph.Graph'
    assert graph_1.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert f'{type(graph_1.epidata).__module__}.{type(graph_1.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_1.epidata) == 6
    assert graph_1.metadata == {}
    graph_2 = module_0.dereify_edges(graph_1, graph_1)
    assert f'{type(graph_2).__module__}.{type(graph_2).__qualname__}' == 'penman.graph.Graph'
    assert graph_2.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert f'{type(graph_2.epidata).__module__}.{type(graph_2.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_2.epidata) == 6
    assert graph_2.metadata == {}
    var_0 = graph_0.__ior__(graph_1)
    assert graph_0.triples == [('nfbmQNfTi_|i=e"', ':<q$', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert len(graph_0.epidata) == 6
    assert var_0.triples == [('nfbmQNfTi_|i=e"', ':<q$', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert len(var_0.epidata) == 6
    var_1 = graph_2.__eq__(str_0)
    graph_3 = module_0.reify_attributes(graph_0)
    assert graph_3.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_4'), ('_4', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_5'), ('_5', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_6'), ('_6', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert len(graph_3.epidata) == 12
    module_0.indicate_branches(graph_2, str_1)

@pytest.mark.xfail(strict=True)
def test_case_19():
    str_0 = 'nfbmQNfTi_|i=e"'
    str_1 = '<q$'
    tuple_0 = (str_0, str_1, str_1)
    none_type_0 = None
    tuple_1 = (tuple_0, tuple_0, tuple_0)
    str_2 = ';Q?F,g'
    graph_0 = module_1.Graph(tuple_1, str_2)
    graph_1 = module_0.reify_attributes(graph_0)
    assert f'{type(graph_1).__module__}.{type(graph_1).__qualname__}' == 'penman.graph.Graph'
    assert graph_1.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert f'{type(graph_1.epidata).__module__}.{type(graph_1.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_1.epidata) == 6
    assert graph_1.metadata == {}
    graph_2 = module_0.dereify_edges(graph_1, graph_1)
    assert f'{type(graph_2).__module__}.{type(graph_2).__qualname__}' == 'penman.graph.Graph'
    assert graph_2.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert f'{type(graph_2.epidata).__module__}.{type(graph_2.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_2.epidata) == 6
    assert graph_2.metadata == {}
    str_3 = ':A'
    model_0 = module_3.Model(tuple_1, reifications=none_type_0)
    graph_3 = module_0.indicate_branches(graph_2, model_0)
    assert f'{type(graph_3).__module__}.{type(graph_3).__qualname__}' == 'penman.graph.Graph'
    assert graph_3.triples == [('nfbmQNfTi_|i=e"', ':TOP', '_'), ('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':TOP', '_2'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':TOP', '_3'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert f'{type(graph_3.epidata).__module__}.{type(graph_3.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_3.epidata) == 6
    assert graph_3.metadata == {}
    list_0 = []
    list_1 = graph_1.edges()
    tuple_2 = (str_3, list_0)
    tree_0 = module_2.Tree(tuple_2)
    graph_4 = module_0.reify_attributes(graph_1)
    assert graph_4.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert len(graph_4.epidata) == 6
    graph_5 = module_0.reify_edges(graph_1, none_type_0)
    assert f'{type(graph_5).__module__}.{type(graph_5).__qualname__}' == 'penman.graph.Graph'
    assert graph_5.triples == [('nfbmQNfTi_|i=e"', ':<q$', '_'), ('_', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_2'), ('_2', ':instance', '<q$'), ('nfbmQNfTi_|i=e"', ':<q$', '_3'), ('_3', ':instance', '<q$')]
    assert f'{type(graph_5.epidata).__module__}.{type(graph_5.epidata).__qualname__}' == 'builtins.dict'
    assert len(graph_5.epidata) == 6
    assert graph_5.metadata == {}
    var_0 = graph_2.__eq__(str_2)
    var_1 = var_0.__repr__()
    tree_1 = module_0.canonicalize_roles(tree_0, var_1)
    assert f'{type(tree_1).__module__}.{type(tree_1).__qualname__}' == 'penman.tree.Tree'
    module_0.indicate_branches(graph_1, var_0)