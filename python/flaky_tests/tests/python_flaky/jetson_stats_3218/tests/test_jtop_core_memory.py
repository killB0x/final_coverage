# Automatically generated by Pynguin.
import pytest
import jtop.core.memory as module_0
import re as module_1

def test_case_0():
    var_0 = module_0.mem_info()

@pytest.mark.xfail(strict=True)
def test_case_1():
    regex_flag_0 = module_1.RegexFlag.IGNORECASE
    module_0.mem_info(regex_flag_0)

def test_case_2():
    memory_service_0 = module_0.MemoryService()
    var_0 = memory_service_0.meminfo()

def test_case_3():
    memory_service_0 = module_0.MemoryService()
    var_0 = module_0.mem_info()