# Automatically generated by Pynguin.
import pytest
import ledger.stores.binary_file_store as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    module_0.BinaryFileStore(none_type_0, none_type_0, storeContentHash=none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'seqNo stars from 1, index requested: }'
    binary_file_store_0 = module_0.BinaryFileStore(str_0, str_0)
    assert f'{type(binary_file_store_0).__module__}.{type(binary_file_store_0).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert binary_file_store_0.delimiter == '\t'
    assert binary_file_store_0.lineSep == '\r\n'
    assert binary_file_store_0.isLineNoKey is False
    assert binary_file_store_0.storeContentHash is True
    assert binary_file_store_0.ensureDurability is True
    assert binary_file_store_0.dbDir == 'seqNo stars from 1, index requested: }'
    assert binary_file_store_0.dbName == 'seqNo stars from 1, index requested: }'
    assert binary_file_store_0.dbPath == 'seqNo stars from 1, index requested: }/seqNo stars from 1, index requested: }.bin'
    assert f'{type(binary_file_store_0.dbFile).__module__}.{type(binary_file_store_0.dbFile).__qualname__}' == '_io.FileIO'
    binary_file_store_0.get(binary_file_store_0)

def test_case_2():
    str_0 = 'seqNo stars from 1, index requested: }'
    binary_file_store_0 = module_0.BinaryFileStore(str_0, str_0)
    assert f'{type(binary_file_store_0).__module__}.{type(binary_file_store_0).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert binary_file_store_0.delimiter == '\t'
    assert binary_file_store_0.lineSep == '\r\n'
    assert binary_file_store_0.isLineNoKey is False
    assert binary_file_store_0.storeContentHash is True
    assert binary_file_store_0.ensureDurability is True
    assert binary_file_store_0.dbDir == 'seqNo stars from 1, index requested: }'
    assert binary_file_store_0.dbName == 'seqNo stars from 1, index requested: }'
    assert binary_file_store_0.dbPath == 'seqNo stars from 1, index requested: }/seqNo stars from 1, index requested: }.bin'
    assert f'{type(binary_file_store_0.dbFile).__module__}.{type(binary_file_store_0.dbFile).__qualname__}' == '_io.FileIO'
    with pytest.raises(ValueError):
        binary_file_store_0.put(str_0)

def test_case_3():
    str_0 = '\n        Close current and start next chunk\n        '
    binary_file_store_0 = module_0.BinaryFileStore(str_0, str_0)
    assert f'{type(binary_file_store_0).__module__}.{type(binary_file_store_0).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert binary_file_store_0.delimiter == '\t'
    assert binary_file_store_0.lineSep == '\r\n'
    assert binary_file_store_0.isLineNoKey is False
    assert binary_file_store_0.storeContentHash is True
    assert binary_file_store_0.ensureDurability is True
    assert binary_file_store_0.dbDir == '\n        Close current and start next chunk\n        '
    assert binary_file_store_0.dbName == '\n        Close current and start next chunk\n        '
    assert binary_file_store_0.dbPath == '\n        Close current and start next chunk\n        /\n        Close current and start next chunk\n        .bin'
    assert f'{type(binary_file_store_0.dbFile).__module__}.{type(binary_file_store_0.dbFile).__qualname__}' == '_io.FileIO'
    with pytest.raises(ValueError):
        binary_file_store_0.put(binary_file_store_0, str_0)

def test_case_4():
    str_0 = 'quw'
    binary_file_store_0 = module_0.BinaryFileStore(str_0, str_0)
    assert f'{type(binary_file_store_0).__module__}.{type(binary_file_store_0).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert binary_file_store_0.delimiter == '\t'
    assert binary_file_store_0.lineSep == '\r\n'
    assert binary_file_store_0.isLineNoKey is False
    assert binary_file_store_0.storeContentHash is True
    assert binary_file_store_0.ensureDurability is True
    assert binary_file_store_0.dbDir == 'quw'
    assert binary_file_store_0.dbName == 'quw'
    assert binary_file_store_0.dbPath == 'quw/quw.bin'
    assert f'{type(binary_file_store_0.dbFile).__module__}.{type(binary_file_store_0.dbFile).__qualname__}' == '_io.FileIO'
    with pytest.raises(TypeError):
        binary_file_store_0.iterator(str_0)

def test_case_5():
    str_0 = '6'
    binary_file_store_0 = module_0.BinaryFileStore(str_0, str_0)
    assert f'{type(binary_file_store_0).__module__}.{type(binary_file_store_0).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert binary_file_store_0.delimiter == '\t'
    assert binary_file_store_0.lineSep == '\r\n'
    assert binary_file_store_0.isLineNoKey is False
    assert binary_file_store_0.storeContentHash is True
    assert binary_file_store_0.ensureDurability is True
    assert binary_file_store_0.dbDir == '6'
    assert binary_file_store_0.dbName == '6'
    assert binary_file_store_0.dbPath == '6/6.bin'
    assert f'{type(binary_file_store_0.dbFile).__module__}.{type(binary_file_store_0.dbFile).__qualname__}' == '_io.FileIO'
    with pytest.raises(TypeError):
        binary_file_store_0.iterator(prefix=str_0)

def test_case_6():
    str_0 = 'seqNo starts from 1, index requested: {}'
    binary_file_store_0 = module_0.BinaryFileStore(str_0, str_0)
    assert f'{type(binary_file_store_0).__module__}.{type(binary_file_store_0).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert binary_file_store_0.delimiter == '\t'
    assert binary_file_store_0.lineSep == '\r\n'
    assert binary_file_store_0.isLineNoKey is False
    assert binary_file_store_0.storeContentHash is True
    assert binary_file_store_0.ensureDurability is True
    assert binary_file_store_0.dbDir == 'seqNo starts from 1, index requested: {}'
    assert binary_file_store_0.dbName == 'seqNo starts from 1, index requested: {}'
    assert binary_file_store_0.dbPath == 'seqNo starts from 1, index requested: {}/seqNo starts from 1, index requested: {}.bin'
    assert f'{type(binary_file_store_0.dbFile).__module__}.{type(binary_file_store_0.dbFile).__qualname__}' == '_io.FileIO'
    var_0 = binary_file_store_0.__enter__()
    assert var_0.delimiter == '\t'
    assert var_0.lineSep == '\r\n'
    assert var_0.dbDir == 'seqNo starts from 1, index requested: {}'
    assert var_0.dbName == 'seqNo starts from 1, index requested: {}'
    assert var_0.dbPath == 'seqNo starts from 1, index requested: {}/seqNo starts from 1, index requested: {}.bin'
    assert f'{type(var_0.dbFile).__module__}.{type(var_0.dbFile).__qualname__}' == '_io.FileIO'
    bytes_0 = b'\t'
    with pytest.raises(ValueError):
        binary_file_store_0.put(bytes_0)

def test_case_7():
    str_0 = 'quw'
    binary_file_store_0 = module_0.BinaryFileStore(str_0, str_0)
    assert f'{type(binary_file_store_0).__module__}.{type(binary_file_store_0).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert binary_file_store_0.delimiter == '\t'
    assert binary_file_store_0.lineSep == '\r\n'
    assert binary_file_store_0.isLineNoKey is False
    assert binary_file_store_0.storeContentHash is True
    assert binary_file_store_0.ensureDurability is True
    assert binary_file_store_0.dbDir == 'quw'
    assert binary_file_store_0.dbName == 'quw'
    assert binary_file_store_0.dbPath == 'quw/quw.bin'
    assert f'{type(binary_file_store_0.dbFile).__module__}.{type(binary_file_store_0.dbFile).__qualname__}' == '_io.FileIO'
    bytes_0 = b'\n\x07\n\x01'
    with pytest.raises(ValueError):
        binary_file_store_0.put(str_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = 'Kp6'
    binary_file_store_0 = module_0.BinaryFileStore(str_0, str_0)
    assert f'{type(binary_file_store_0).__module__}.{type(binary_file_store_0).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert binary_file_store_0.delimiter == '\t'
    assert binary_file_store_0.lineSep == '\r\n'
    assert binary_file_store_0.isLineNoKey is False
    assert binary_file_store_0.storeContentHash is True
    assert binary_file_store_0.ensureDurability is True
    assert binary_file_store_0.dbDir == 'Kp6'
    assert binary_file_store_0.dbName == 'Kp6'
    assert binary_file_store_0.dbPath == 'Kp6/Kp6.bin'
    assert f'{type(binary_file_store_0.dbFile).__module__}.{type(binary_file_store_0.dbFile).__qualname__}' == '_io.FileIO'
    dict_0 = {binary_file_store_0: str_0, binary_file_store_0: str_0, binary_file_store_0: str_0}
    bytes_0 = b'\x01'
    binary_file_store_0.iterator(includeValue=dict_0, prefix=bytes_0)

def test_case_9():
    str_0 = 'Some expected property of the input cannot be verified.\n\n    The property either verifiably does not hold, or cannot be conclusively\n    verified. Domain-specific verification errors inherit from this class.\n    '
    binary_file_store_0 = module_0.BinaryFileStore(str_0, str_0)
    assert f'{type(binary_file_store_0).__module__}.{type(binary_file_store_0).__qualname__}' == 'ledger.stores.binary_file_store.BinaryFileStore'
    assert binary_file_store_0.delimiter == '\t'
    assert binary_file_store_0.lineSep == '\r\n'
    assert binary_file_store_0.isLineNoKey is False
    assert binary_file_store_0.storeContentHash is True
    assert binary_file_store_0.ensureDurability is True
    assert binary_file_store_0.dbDir == 'Some expected property of the input cannot be verified.\n\n    The property either verifiably does not hold, or cannot be conclusively\n    verified. Domain-specific verification errors inherit from this class.\n    '
    assert binary_file_store_0.dbName == 'Some expected property of the input cannot be verified.\n\n    The property either verifiably does not hold, or cannot be conclusively\n    verified. Domain-specific verification errors inherit from this class.\n    '
    assert binary_file_store_0.dbPath == 'Some expected property of the input cannot be verified.\n\n    The property either verifiably does not hold, or cannot be conclusively\n    verified. Domain-specific verification errors inherit from this class.\n    /Some expected property of the input cannot be verified.\n\n    The property either verifiably does not hold, or cannot be conclusively\n    verified. Domain-specific verification errors inherit from this class.\n    .bin'
    assert f'{type(binary_file_store_0.dbFile).__module__}.{type(binary_file_store_0.dbFile).__qualname__}' == '_io.FileIO'
    bytes_0 = b'\\VN\x90\x06;g\x93\xe8\xd4\x9bK\xe1\x1b\x9b!'
    with pytest.raises(TypeError):
        binary_file_store_0.get(bytes_0)