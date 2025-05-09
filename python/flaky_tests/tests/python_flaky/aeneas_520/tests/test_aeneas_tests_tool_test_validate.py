# Automatically generated by Pynguin.
import pytest
import aeneas.tests.tool_test_validate as module_0
import aeneas.globalfunctions as module_1
import platform as module_2
import pprint as module_3
import inspect as module_4
import re as module_5

def test_case_0():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()

def test_case_1():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_read_missing_3()

@pytest.mark.xfail(strict=True)
def test_case_2():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_job()
    var_1 = test_validate_c_l_i_0.test_bad_type()
    var_2 = test_validate_c_l_i_0.test_container_too_many_tasks()
    var_3 = test_validate_c_l_i_0.test_task_bad()
    var_2.test_read_missing_4()

def test_case_3():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_container_too_many_tasks()

def test_case_4():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_job()

@pytest.mark.xfail(strict=True)
def test_case_5():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_task()
    var_0.test_read_cannot_read_2()

def test_case_6():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_read_cannot_read_2()

def test_case_7():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_task_bad()

def test_case_8():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_read_cannot_read_3()

def test_case_9():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_container_bad()

@pytest.mark.xfail(strict=True)
def test_case_10():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_config_xml()
    var_1 = test_validate_c_l_i_0.test_read_missing_2()
    var_2 = test_validate_c_l_i_0.test_job()
    var_3 = test_validate_c_l_i_0.test_bad_type()
    var_3.test_container_too_many_tasks()

def test_case_11():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_job_bad()

def test_case_12():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_wizard()

def test_case_13():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_read_cannot_read_1()

@pytest.mark.xfail(strict=True)
def test_case_14():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_wizard_bad()
    var_1 = test_validate_c_l_i_0.test_job()
    var_2 = test_validate_c_l_i_0.test_wizard()
    var_2.test_job()

def test_case_15():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_read_missing_4()

@pytest.mark.xfail(strict=True)
def test_case_16():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.countTestCases()
    var_1 = test_validate_c_l_i_0.test_task()
    var_2 = test_validate_c_l_i_0.test_task()
    var_3 = test_validate_c_l_i_0.doCleanups()
    var_4 = test_validate_c_l_i_0.test_read_cannot_read_2()
    var_5 = test_validate_c_l_i_0.test_help()
    var_0.format()

def test_case_17():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_container()

def test_case_18():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_config_xml_bad()

@pytest.mark.xfail(strict=True)
def test_case_19():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_read_missing_5()
    var_1 = test_validate_c_l_i_0.test_job()
    var_2 = test_validate_c_l_i_0.test_bad_type()
    var_3 = test_validate_c_l_i_0.test_container_too_many_tasks()
    var_4 = test_validate_c_l_i_0.test_task_bad()
    var_3.test_read_missing_4()

@pytest.mark.xfail(strict=True)
def test_case_20():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_help()
    var_1 = test_validate_c_l_i_0.test_config_txt_bad()
    var_2 = test_validate_c_l_i_0.test_read_missing_4()
    var_0.test_read_missing_1()

@pytest.mark.xfail(strict=True)
def test_case_21():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_read_cannot_read_4()
    var_1 = test_validate_c_l_i_0.test_read_missing_4()
    var_2 = test_validate_c_l_i_0.test_read_missing_1()
    test_validate_c_l_i_0.assertDictContainsSubset(var_2, var_2, var_2)

@pytest.mark.xfail(strict=True)
def test_case_22():
    test_validate_c_l_i_0 = module_0.TestValidateCLI()
    var_0 = test_validate_c_l_i_0.test_config_txt()
    var_1 = test_validate_c_l_i_0.test_config_xml_bad()
    var_2 = module_1.safe_print(test_validate_c_l_i_0)
    var_3 = test_validate_c_l_i_0.test_job()
    var_4 = test_validate_c_l_i_0.test_container_too_many_tasks()
    var_5 = module_2.processor()
    var_6 = test_validate_c_l_i_0.test_read_missing_4()
    var_7 = test_validate_c_l_i_0.test_read_cannot_read_3()
    var_8 = module_3.pp(var_5)
    var_9 = module_4.currentframe()
    var_10 = var_3.__repr__()
    var_11 = test_validate_c_l_i_0.test_read_cannot_read_3()
    module_5.subn(var_7, var_10, var_6, flags=var_4)