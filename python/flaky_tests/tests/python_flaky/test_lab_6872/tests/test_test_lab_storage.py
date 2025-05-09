# Automatically generated by Pynguin.
import pytest
import test_lab.storage as module_0
import builtins as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    storage_0 = module_0.Storage()
    var_0 = storage_0.push_test_case(storage_0)
    var_1 = storage_0.get_records_count(storage_0)
    assert var_1 == 0
    var_1.get_test_case(var_1)

def test_case_1():
    none_type_0 = None
    storage_0 = module_0.Storage()
    var_0 = storage_0.get_records_count(none_type_0)
    assert var_0 == 0

def test_case_2():
    storage_0 = module_0.Storage()

@pytest.mark.xfail(strict=True)
def test_case_3():
    test_case_record_0 = module_0.TestCaseRecord()
    assert test_case_record_0.client_id == ''
    assert test_case_record_0.client_name == ''
    assert test_case_record_0.client_platform == ''
    assert test_case_record_0.result_code == 0
    assert test_case_record_0.duration == 0
    storage_0 = module_0.Storage()
    var_0 = storage_0.push_test_case(test_case_record_0)
    var_0.get_records_count(test_case_record_0)

def test_case_4():
    bool_0 = False
    test_case_0 = module_0.TestCase(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    bool_0 = True
    bool_1 = True
    storage_0 = module_0.Storage()
    var_0 = storage_0.push_test_case(bool_1)
    var_0.push_test_case(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    storage_0 = module_0.Storage()
    test_case_record_0 = module_0.TestCaseRecord()
    assert test_case_record_0.client_id == ''
    assert test_case_record_0.client_name == ''
    assert test_case_record_0.client_platform == ''
    assert test_case_record_0.result_code == 0
    assert test_case_record_0.duration == 0
    bytes_0 = b'\xe0\x98\x8c7]4\x8a\x7f\x926ER\xa0SS'
    int_0 = 3032
    tuple_0 = (test_case_record_0, bytes_0, int_0)
    storage_1 = module_0.Storage()
    storage_1.add_result(tuple_0, int_0, bytes_0, bytes_0, test_case_record_0, test_case_record_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    storage_0 = module_0.Storage()
    object_0 = module_1.object()
    var_0 = storage_0.get_test_case(storage_0)
    var_1 = storage_0.get_records_count(object_0)
    assert var_1 == 0
    storage_1 = module_0.Storage()
    storage_2 = module_0.Storage()
    var_2 = storage_2.push_test_case(storage_0)
    var_3 = storage_2.push_test_case(storage_0)
    str_0 = 'WcpX7yNX=pye\thC'
    bool_0 = False
    storage_2.add_result(bool_0, storage_2, bool_0, bool_0, str_0, var_3)