# Automatically generated by Pynguin.
import pytest
import daemons.interfaces.message as module_0

def test_case_0():
    message_manager_0 = module_0.MessageManager()
    assert message_manager_0.idle_time == pytest.approx(0.1, abs=0.01, rel=0.01)
    assert message_manager_0.pool_size == 100
    assert f'{type(module_0.MessageManager.pool).__module__}.{type(module_0.MessageManager.pool).__qualname__}' == 'builtins.property'

def test_case_1():
    bool_0 = True
    message_manager_0 = module_0.MessageManager()
    assert message_manager_0.idle_time == pytest.approx(0.1, abs=0.01, rel=0.01)
    assert message_manager_0.pool_size == 100
    assert f'{type(module_0.MessageManager.pool).__module__}.{type(module_0.MessageManager.pool).__qualname__}' == 'builtins.property'
    with pytest.raises(NotImplementedError):
        message_manager_0.dispatch(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    message_manager_0 = module_0.MessageManager()
    assert message_manager_0.idle_time == pytest.approx(0.1, abs=0.01, rel=0.01)
    assert message_manager_0.pool_size == 100
    assert f'{type(module_0.MessageManager.pool).__module__}.{type(module_0.MessageManager.pool).__qualname__}' == 'builtins.property'
    message_manager_0.step()

def test_case_3():
    complex_0 = (3370.307+2327.595151j)
    dict_0 = {}
    message_manager_0 = module_0.MessageManager(**dict_0)
    assert message_manager_0.idle_time == pytest.approx(0.1, abs=0.01, rel=0.01)
    assert message_manager_0.pool_size == 100
    assert f'{type(module_0.MessageManager.pool).__module__}.{type(module_0.MessageManager.pool).__qualname__}' == 'builtins.property'
    with pytest.raises(NotImplementedError):
        message_manager_0.handle_message(complex_0)