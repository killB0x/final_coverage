# Automatically generated by Pynguin.
import pytest
import jtop.core.command as module_0
import builtins as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = '--yte'
    command_0 = module_0.Command(str_0)
    assert module_0.EXTRA_TIMEOUT == pytest.approx(1.0, abs=0.01, rel=0.01)
    command_0.run_command(command_0)

def test_case_1():
    bool_0 = False
    dict_0 = {}
    object_0 = module_1.object(**dict_0)
    command_0 = module_0.Command(object_0)
    assert module_0.EXTRA_TIMEOUT == pytest.approx(1.0, abs=0.01, rel=0.01)
    command_0.run_command(bool_0, bool_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    bool_0 = False
    command_0 = module_0.Command(bool_0)
    assert module_0.EXTRA_TIMEOUT == pytest.approx(1.0, abs=0.01, rel=0.01)
    command_0.communicate()

def test_case_3():
    bool_0 = False
    command_0 = module_0.Command(bool_0)
    assert module_0.EXTRA_TIMEOUT == pytest.approx(1.0, abs=0.01, rel=0.01)
    command_0.communicate(bool_0)

def test_case_4():
    float_0 = 0.5
    command_0 = module_0.Command(float_0)
    assert module_0.EXTRA_TIMEOUT == pytest.approx(1.0, abs=0.01, rel=0.01)

def test_case_5():
    bool_0 = False
    bytes_0 = b''
    bool_1 = False
    command_0 = module_0.Command(bool_0)
    assert module_0.EXTRA_TIMEOUT == pytest.approx(1.0, abs=0.01, rel=0.01)
    command_0.run_command(bytes_0, timeout=bool_1)