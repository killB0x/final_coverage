# Automatically generated by Pynguin.
import pytest
import ledger.stores.text_file_store as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    list_0 = []
    module_0.TextFileStore(list_0, list_0, ensureDurability=list_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    bytes_0 = b'\t'
    bool_0 = False
    text_file_store_0 = module_0.TextFileStore(bytes_0, bytes_0, bool_0)
    assert f'{type(text_file_store_0).__module__}.{type(text_file_store_0).__qualname__}' == 'ledger.stores.text_file_store.TextFileStore'
    assert text_file_store_0.delimiter == '\t'
    assert text_file_store_0.lineSep == '\r\n'
    assert text_file_store_0.isLineNoKey is False
    assert text_file_store_0.storeContentHash is True
    assert text_file_store_0.ensureDurability is True
    assert text_file_store_0.dbDir == b'\t'
    assert text_file_store_0.dbName == b'\t'
    assert text_file_store_0.dbPath == b'\t/\t'
    assert f'{type(text_file_store_0.dbFile).__module__}.{type(text_file_store_0.dbFile).__qualname__}' == '_io.TextIOWrapper'
    none_type_0 = None
    text_file_store_1 = text_file_store_0.get(bytes_0)
    bool_1 = False
    bool_2 = True
    var_0 = text_file_store_0.__exit__(none_type_0, text_file_store_0, text_file_store_1)
    module_0.TextFileStore(bool_1, bool_1, bool_2, defaultFile=bool_2)