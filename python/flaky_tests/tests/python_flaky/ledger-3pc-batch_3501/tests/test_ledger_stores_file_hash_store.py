# Automatically generated by Pynguin.
import pytest
import ledger.stores.file_hash_store as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    float_0 = -3599.85376
    module_0.FileHashStore(float_0, float_0)

def test_case_1():
    str_0 = 'N1\x0b\x0beq\\0c=H\r2T'
    file_hash_store_0 = module_0.FileHashStore(str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == 'N1\x0b\x0beq\\0c=H\r2T'
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    int_0 = 12
    with pytest.raises(IndexError):
        file_hash_store_0.readLeaf(int_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = '.o<~&IHp'
    file_hash_store_0 = module_0.FileHashStore(str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == '.o<~&IHp'
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    int_0 = 12
    var_0 = file_hash_store_0.readLeafs(int_0, int_0)
    file_hash_store_0.readNode(int_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    none_type_0 = None
    str_0 = '%,%s nota valid rnge over 0,%s]'
    file_hash_store_0 = module_0.FileHashStore(str_0, leafSize=none_type_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == '%,%s nota valid rnge over 0,%s]'
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize is None
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    file_hash_store_0.writeNode(str_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = '%s,%s not a valid range over [0,%s]'
    file_hash_store_0 = module_0.FileHashStore(str_0, str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == '%s,%s not a valid range over [0,%s]'
    assert file_hash_store_0.fileNamePrefix == '%s,%s not a valid range over [0,%s]'
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    var_0 = file_hash_store_0.close()
    file_hash_store_0.writeLeaf(str_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = ',I|\r%"Hg/aU\\)'
    file_hash_store_0 = module_0.FileHashStore(str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == ',I|\r%"Hg/aU\\)'
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    file_hash_store_0.writeLeaf(file_hash_store_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = '+ID\x0cV(<DYBJ~_3q'
    file_hash_store_0 = module_0.FileHashStore(str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == '+ID\x0cV(<DYBJ~_3q'
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    var_0 = file_hash_store_0.readNodes(str_0, str_0)
    int_0 = 33
    file_hash_store_0.readNodeByTree(int_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = ',(\n7V|5Vo_s_!M{7aF`('
    file_hash_store_0 = module_0.FileHashStore(str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == ',(\n7V|5Vo_s_!M{7aF`('
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    file_hash_store_0.writeLeaf(str_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = '+ID\x0cV(<DY#J~J3&'
    file_hash_store_0 = module_0.FileHashStore(str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == '+ID\x0cV(<DY#J~J3&'
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    var_0 = file_hash_store_0.reset()
    assert var_0 is True
    file_hash_store_0.readLeaf(var_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    str_0 = 'Tree are identcal ignoring proof'
    file_hash_store_0 = module_0.FileHashStore(str_0, nodeSize=str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == 'Tree are identcal ignoring proof'
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 'Tree are identcal ignoring proof'
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    var_0 = file_hash_store_0.writeLeaf(str_0)
    var_1 = file_hash_store_0.reset()
    assert var_1 is True
    file_hash_store_0.readLeaf(var_1)

@pytest.mark.xfail(strict=True)
def test_case_10():
    str_0 = 'N1\x0b\x0beq\\0c=H\r2T'
    file_hash_store_0 = module_0.FileHashStore(str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == 'N1\x0b\x0beq\\0c=H\r2T'
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    int_0 = 49
    file_hash_store_0.readNodeByTree(int_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = ',(\n7V|5Vo_s_!M{7aF`('
    file_hash_store_0 = module_0.FileHashStore(str_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == ',(\n7V|5Vo_s_!M{7aF`('
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize == 32
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    bytes_0 = b'(\xeb\x82\x80n\x1a\xda\x85\x08U\x12\xbe\xa2'
    file_hash_store_0.writeLeaf(bytes_0)

def test_case_12():
    str_0 = '*V+\t48^L2~A0'
    bool_0 = False
    file_hash_store_0 = module_0.FileHashStore(str_0, leafSize=bool_0)
    assert f'{type(file_hash_store_0).__module__}.{type(file_hash_store_0).__qualname__}' == 'ledger.stores.file_hash_store.FileHashStore'
    assert file_hash_store_0.dataDir == '*V+\t48^L2~A0'
    assert file_hash_store_0.fileNamePrefix == ''
    assert f'{type(file_hash_store_0.nodesFile).__module__}.{type(file_hash_store_0.nodesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert f'{type(file_hash_store_0.leavesFile).__module__}.{type(file_hash_store_0.leavesFile).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert file_hash_store_0.nodeSize == 32
    assert file_hash_store_0.leafSize is False
    assert f'{type(module_0.FileHashStore.leafCount).__module__}.{type(module_0.FileHashStore.leafCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.nodeCount).__module__}.{type(module_0.FileHashStore.nodeCount).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.FileHashStore.closed).__module__}.{type(module_0.FileHashStore.closed).__qualname__}' == 'builtins.property'
    var_0 = file_hash_store_0.readLeaf(bool_0)
    assert var_0 == b''