# Automatically generated by Pynguin.
import pytest
import w2re.prefix_tree.primitives as module_0
import re as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = 'su tC2F 0\nxCh;] '
    str_1 = '.&I~~*W8'
    var_0 = module_0.add_brackets_around_string(str_1)
    assert var_0 == '(?:.&I~~*W8)'
    var_0.add(str_0)

def test_case_1():
    bytes_0 = b'w\x9b\xb6\xd8'
    var_0 = module_0.compress(bytes_0)
    assert var_0 == b'w\x9b\xb6\xd8'

def test_case_2():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = 'su tC2F 0\nxCh;] '
    str_1 = ';\x0b7-y~Q;r'
    var_0 = prefix_tree_node_0.add(str_1)
    var_1 = prefix_tree_node_0.to_regexp()
    assert var_1 == ';\\\x0b7\\-y\\~Q;r'
    prefix_tree_edge_0 = module_0.PrefixTreeEdge(var_1, str_0)
    var_2 = prefix_tree_edge_0.add(str_0)

def test_case_3():
    int_0 = -1999
    prefix_tree_edge_0 = module_0.PrefixTreeEdge(int_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = '(?:\\W+|\\A)({})(?=\\W+|\\Z)'
    var_0 = prefix_tree_node_0.add(str_0)
    str_1 = ';\x0b7-y~Q;r'
    var_1 = prefix_tree_node_0.add(str_1)
    var_2 = prefix_tree_node_0.to_regexp()
    assert var_2 == '(?:\\(\\?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\)|;\\\x0b7\\-y\\~Q;r)'
    prefix_tree_edge_0 = module_0.PrefixTreeEdge(var_2, str_1)
    var_3 = prefix_tree_node_0.to_regexp()
    assert var_3 == '(?:\\(\\?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\)|;\\\x0b7\\-y\\~Q;r)'
    var_4 = prefix_tree_edge_0.add(var_2)
    var_2.__getitem__(var_0, var_0)

def test_case_5():
    prefix_tree_node_0 = module_0.PrefixTreeNode()

@pytest.mark.xfail(strict=True)
def test_case_6():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = '(?:\\W+|\\A)({})(?=\\W+|\\Z)'
    var_0 = prefix_tree_node_0.add(str_0)
    var_1 = module_0.add_brackets_around_string(str_0)
    assert var_1 == '(?:(?:\\W+|\\A)({})(?=\\W+|\\Z))'
    var_2 = prefix_tree_node_0.add(var_1)
    var_3 = prefix_tree_node_0.to_regexp()
    assert var_3 == '\\(\\?:(?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\)|\\(\\?:\\\\W\\+\\|\\\\A\\)\\(\\{\\}\\)\\(\\?=\\\\W\\+\\|\\\\Z\\){2})'
    module_1.split(var_2, var_1, flags=var_3)

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = 'py'
    bool_0 = False
    var_0 = module_0.get_stop_index(str_0, bool_0)
    assert var_0 == 3
    var_1 = module_0.add_brackets_around_string(str_0)
    assert var_1 == '(?:py)'
    var_1.__bool__()

def test_case_8():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = '(?:\\W+|\\A)({})(?=\\W+|\\Z)'
    str_1 = 'su tChF \nxh;] '
    str_2 = '('
    var_0 = prefix_tree_node_0.add(str_2)
    var_1 = prefix_tree_node_0.to_regexp()
    assert var_1 == '\\('
    var_2 = prefix_tree_node_0.add(str_0, var_0)
    var_3 = prefix_tree_node_0.to_regexp()
    assert var_3 == '\\((?:\\?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\))?'
    var_4 = module_1.purge()
    prefix_tree_edge_0 = module_0.PrefixTreeEdge(str_2, str_1, var_4)
    var_5 = prefix_tree_node_0.add(str_1)
    var_6 = prefix_tree_node_0.to_regexp()
    assert var_6 == '(?:\\((?:\\?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\))?|su\\ tChF\\ \\\nxh;\\]\\ )'
    var_7 = prefix_tree_node_0.add(var_5)
    var_8 = var_7.__dir__()

@pytest.mark.xfail(strict=True)
def test_case_9():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = 'q3v:Yl&lokEj'
    str_1 = ''
    var_0 = prefix_tree_node_0.to_regexp()
    assert var_0 == ''
    var_1 = prefix_tree_node_0.add(str_0)
    var_2 = prefix_tree_node_0.to_regexp()
    assert var_2 == 'q3v:Yl\\&lokEj'
    prefix_tree_edge_0 = module_0.PrefixTreeEdge(var_2, str_1)
    var_3 = prefix_tree_node_0.to_regexp()
    assert var_3 == 'q3v:Yl\\&lokEj'
    var_4 = prefix_tree_edge_0.add(str_1)
    var_2.__getitem__(str_1, str_1)

def test_case_10():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = 'su tChF \nxh;] '
    str_1 = '{'
    var_0 = prefix_tree_node_0.add(str_1)
    var_1 = prefix_tree_node_0.to_regexp()
    assert var_1 == '\\{'
    prefix_tree_edge_0 = module_0.PrefixTreeEdge(prefix_tree_node_0, str_0)
    var_2 = prefix_tree_node_0.to_regexp()
    assert var_2 == '\\{'

@pytest.mark.xfail(strict=True)
def test_case_11():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = '{'
    str_1 = '\\A'
    var_0 = prefix_tree_node_0.add(str_1)
    var_1 = prefix_tree_node_0.add(str_0)
    var_2 = prefix_tree_node_0.to_regexp()
    assert var_2 == '(?:{|\\{2}A)'
    error_0 = module_1.error(str_0, prefix_tree_node_0)
    error_0.__contains__(var_2, str_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = '(?:\\W+|\\A)({})(?=\\W+|\\Z)'
    var_0 = prefix_tree_node_0.add(str_0)
    str_1 = 'su tC2F 0\nxCh;] '
    var_1 = prefix_tree_node_0.to_regexp()
    assert var_1 == '\\(\\?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\)'
    str_2 = ';\x0b7-y~Q;r'
    var_2 = prefix_tree_node_0.add(str_2)
    var_3 = prefix_tree_node_0.add(str_2)
    var_4 = prefix_tree_node_0.to_regexp()
    assert var_4 == '(?:\\(\\?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\)|;\\\x0b7\\-y\\~Q;r)'
    prefix_tree_edge_0 = module_0.PrefixTreeEdge(var_4, str_1)
    var_5 = prefix_tree_node_0.to_regexp()
    assert var_5 == '(?:\\(\\?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\)|;\\\x0b7\\-y\\~Q;r)'
    var_6 = prefix_tree_edge_0.add(str_1)
    var_4.__getitem__(str_1, str_1)

@pytest.mark.xfail(strict=True)
def test_case_13():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = '(?:\\W+|\\A)({})(?=\\W+|\\Z)'
    str_1 = 'o'
    var_0 = prefix_tree_node_0.add(str_1)
    var_1 = prefix_tree_node_0.add(str_0)
    str_2 = '{'
    var_2 = prefix_tree_node_0.add(str_2)
    var_3 = module_0.add_brackets_around_string(str_0)
    assert var_3 == '(?:(?:\\W+|\\A)({})(?=\\W+|\\Z))'
    var_4 = prefix_tree_node_0.to_regexp()
    assert var_4 == '(?:[o{]|\\(\\?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\))'
    var_5 = prefix_tree_node_0.add(var_3)
    var_6 = prefix_tree_node_0.add(var_5)
    var_7 = prefix_tree_node_0.to_regexp()
    assert var_7 == '(?:[o{]|\\(\\?:(?:\\{2}W\\+\\|\\{2}A\\)\\(\\{\\}\\)\\(\\?=\\{2}W\\+\\|\\{2}Z\\)|\\(\\?:\\\\W\\+\\|\\\\A\\)\\(\\{\\}\\)\\(\\?=\\\\W\\+\\|\\\\Z\\){2}))'
    module_1.findall(var_7, var_1)

@pytest.mark.xfail(strict=True)
def test_case_14():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = '('
    str_1 = '{'
    var_0 = prefix_tree_node_0.add(str_1)
    var_1 = prefix_tree_node_0.to_regexp()
    assert var_1 == '\\{'
    var_2 = module_0.add_brackets_around_string(str_0)
    assert var_2 == '('
    var_3 = prefix_tree_node_0.add(str_0, var_0)
    var_4 = prefix_tree_node_0.to_regexp()
    assert var_4 == '[({]'
    var_5 = prefix_tree_node_0.to_regexp()
    assert var_5 == '[({]'
    var_6 = prefix_tree_node_0.add(var_0)
    module_1.split(var_5, prefix_tree_node_0, flags=var_1)

@pytest.mark.xfail(strict=True)
def test_case_15():
    prefix_tree_node_0 = module_0.PrefixTreeNode()
    str_0 = '(Z`\\5&ar1t}>ef'
    str_1 = '('
    var_0 = prefix_tree_node_0.add(str_1)
    var_1 = prefix_tree_node_0.to_regexp()
    assert var_1 == '\\('
    var_2 = module_0.add_brackets_around_string(str_0)
    assert var_2 == '(?:(Z`\\5&ar1t}>ef)'
    var_3 = prefix_tree_node_0.add(str_0, var_0)
    var_4 = module_1.purge()
    var_5 = prefix_tree_node_0.add(var_2)
    var_6 = prefix_tree_node_0.to_regexp()
    assert var_6 == '\\((?:Z`\\{2}5\\&ar1t\\}>ef|\\?:\\(Z`\\{2}5\\&ar1t\\}>ef\\))?'
    var_7 = prefix_tree_node_0.add(var_5)
    var_8 = var_6.__dir__()
    module_0.get_stop_index(var_2, var_2)