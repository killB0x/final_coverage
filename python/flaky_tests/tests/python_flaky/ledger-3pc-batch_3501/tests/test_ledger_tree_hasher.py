# Automatically generated by Pynguin.
import pytest
import ledger.tree_hasher as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    bytes_0 = b'\xfd?\x8a\x0b%b\xa1\x90<N\x16\xba\xcf \xc1\xb2\x9ba\xe5\x14'
    tree_hasher_0 = module_0.TreeHasher()
    tree_hasher_0.hash_full_tree(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    list_0 = []
    tree_hasher_0 = module_0.TreeHasher()
    var_0 = tree_hasher_0.hash_full_tree(list_0)
    assert var_0 == b"\xe3\xb0\xc4B\x98\xfc\x1c\x14\x9a\xfb\xf4\xc8\x99o\xb9$'\xaeA\xe4d\x9b\x93L\xa4\x95\x99\x1bxR\xb8U"
    var_1 = var_0.__str__()
    var_1.hash_children(var_0, var_1)

def test_case_2():
    tree_hasher_0 = module_0.TreeHasher()

@pytest.mark.xfail(strict=True)
def test_case_3():
    bytes_0 = b''
    tree_hasher_0 = module_0.TreeHasher()
    var_0 = tree_hasher_0.__str__()
    assert var_0 == 'TreeHasher(<built-in function openssl_sha256>)'
    var_0.hash_leaf(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    tree_hasher_0 = module_0.TreeHasher()
    tree_hasher_0.hash_children(tree_hasher_0, tree_hasher_0)