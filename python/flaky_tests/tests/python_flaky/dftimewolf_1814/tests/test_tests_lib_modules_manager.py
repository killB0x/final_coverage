# Automatically generated by Pynguin.
import pytest
import tests.lib.modules.manager as module_0

def test_case_0():
    modules_manager_test_0 = module_0.ModulesManagerTest()

@pytest.mark.xfail(strict=True)
def test_case_1():
    modules_manager_test_0 = module_0.ModulesManagerTest()
    modules_manager_test_1 = module_0.ModulesManagerTest()
    var_0 = modules_manager_test_1.setUp()
    modules_manager_test_2 = module_0.ModulesManagerTest()
    var_0.printErrors()

@pytest.mark.xfail(strict=True)
def test_case_2():
    modules_manager_test_0 = module_0.ModulesManagerTest()
    modules_manager_test_0.testOverrideModuleRegistration()

@pytest.mark.xfail(strict=True)
def test_case_3():
    modules_manager_test_0 = module_0.ModulesManagerTest()
    var_0 = modules_manager_test_0.setUp()
    modules_manager_test_0.testRegisterModules()