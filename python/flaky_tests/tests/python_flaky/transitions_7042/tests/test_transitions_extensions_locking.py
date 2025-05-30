# Automatically generated by Pynguin.
import pytest
import transitions.extensions.locking as module_0
import inspect as module_1

def test_case_0():
    var_0 = module_0.nested()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'contextlib._GeneratorContextManager'
    assert f'{type(var_0.gen).__module__}.{type(var_0.gen).__qualname__}' == 'builtins.generator'
    assert var_0.args == ()
    assert var_0.kwds == {}

def test_case_1():
    locked_machine_0 = module_0.LockedMachine()
    assert f'{type(locked_machine_0).__module__}.{type(locked_machine_0).__qualname__}' == 'transitions.extensions.locking.LockedMachine'
    assert f'{type(locked_machine_0.machine_context).__module__}.{type(locked_machine_0.machine_context).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.machine_context) == 2
    assert f'{type(locked_machine_0.model_context_map).__module__}.{type(locked_machine_0.model_context_map).__qualname__}' == 'collections.defaultdict'
    assert len(locked_machine_0.model_context_map) == 1
    assert f'{type(locked_machine_0.states).__module__}.{type(locked_machine_0.states).__qualname__}' == 'collections.OrderedDict'
    assert len(locked_machine_0.states) == 1
    assert f'{type(locked_machine_0.events).__module__}.{type(locked_machine_0.events).__qualname__}' == 'builtins.dict'
    assert len(locked_machine_0.events) == 1
    assert locked_machine_0.send_event is False
    assert locked_machine_0.auto_transitions is True
    assert locked_machine_0.ignore_invalid_triggers is None
    assert locked_machine_0.name == ''
    assert locked_machine_0.model_attribute == 'state'
    assert f'{type(locked_machine_0.models).__module__}.{type(locked_machine_0.models).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.models) == 1
    assert locked_machine_0.state == 'initial'

@pytest.mark.xfail(strict=True)
def test_case_2():
    locked_machine_0 = module_0.LockedMachine()
    assert f'{type(locked_machine_0).__module__}.{type(locked_machine_0).__qualname__}' == 'transitions.extensions.locking.LockedMachine'
    assert f'{type(locked_machine_0.machine_context).__module__}.{type(locked_machine_0.machine_context).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.machine_context) == 2
    assert f'{type(locked_machine_0.model_context_map).__module__}.{type(locked_machine_0.model_context_map).__qualname__}' == 'collections.defaultdict'
    assert len(locked_machine_0.model_context_map) == 1
    assert f'{type(locked_machine_0.states).__module__}.{type(locked_machine_0.states).__qualname__}' == 'collections.OrderedDict'
    assert len(locked_machine_0.states) == 1
    assert f'{type(locked_machine_0.events).__module__}.{type(locked_machine_0.events).__qualname__}' == 'builtins.dict'
    assert len(locked_machine_0.events) == 1
    assert locked_machine_0.send_event is False
    assert locked_machine_0.auto_transitions is True
    assert locked_machine_0.ignore_invalid_triggers is None
    assert locked_machine_0.name == ''
    assert locked_machine_0.model_attribute == 'state'
    assert f'{type(locked_machine_0.models).__module__}.{type(locked_machine_0.models).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.models) == 1
    assert locked_machine_0.state == 'initial'
    locked_machine_0.set_state(locked_machine_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    locked_machine_0 = module_0.LockedMachine()
    assert f'{type(locked_machine_0).__module__}.{type(locked_machine_0).__qualname__}' == 'transitions.extensions.locking.LockedMachine'
    assert f'{type(locked_machine_0.machine_context).__module__}.{type(locked_machine_0.machine_context).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.machine_context) == 2
    assert f'{type(locked_machine_0.model_context_map).__module__}.{type(locked_machine_0.model_context_map).__qualname__}' == 'collections.defaultdict'
    assert len(locked_machine_0.model_context_map) == 1
    assert f'{type(locked_machine_0.states).__module__}.{type(locked_machine_0.states).__qualname__}' == 'collections.OrderedDict'
    assert len(locked_machine_0.states) == 1
    assert f'{type(locked_machine_0.events).__module__}.{type(locked_machine_0.events).__qualname__}' == 'builtins.dict'
    assert len(locked_machine_0.events) == 1
    assert locked_machine_0.send_event is False
    assert locked_machine_0.auto_transitions is True
    assert locked_machine_0.ignore_invalid_triggers is None
    assert locked_machine_0.name == ''
    assert locked_machine_0.model_attribute == 'state'
    assert f'{type(locked_machine_0.models).__module__}.{type(locked_machine_0.models).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.models) == 1
    assert locked_machine_0.state == 'initial'
    str_0 = 'P#/z[T'
    dict_0 = {str_0: str_0, str_0: locked_machine_0}
    locked_machine_0.__getattr__(dict_0)

def test_case_4():
    var_0 = module_0.PicklableLock()

def test_case_5():
    picklable_lock_0 = module_0.PicklableLock()
    var_0 = picklable_lock_0.__getstate__()
    assert var_0 == ''

@pytest.mark.xfail(strict=True)
def test_case_6():
    picklable_lock_0 = module_0.PicklableLock()
    var_0 = picklable_lock_0.__setstate__(picklable_lock_0)
    var_1 = module_1.iscode(picklable_lock_0)
    var_1.isupper()

def test_case_7():
    ident_manager_0 = module_0.IdentManager()
    assert ident_manager_0.current == 0

@pytest.mark.xfail(strict=True)
def test_case_8():
    locked_machine_0 = module_0.LockedMachine()
    assert f'{type(locked_machine_0).__module__}.{type(locked_machine_0).__qualname__}' == 'transitions.extensions.locking.LockedMachine'
    assert f'{type(locked_machine_0.machine_context).__module__}.{type(locked_machine_0.machine_context).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.machine_context) == 2
    assert f'{type(locked_machine_0.model_context_map).__module__}.{type(locked_machine_0.model_context_map).__qualname__}' == 'collections.defaultdict'
    assert len(locked_machine_0.model_context_map) == 1
    assert f'{type(locked_machine_0.states).__module__}.{type(locked_machine_0.states).__qualname__}' == 'collections.OrderedDict'
    assert len(locked_machine_0.states) == 1
    assert f'{type(locked_machine_0.events).__module__}.{type(locked_machine_0.events).__qualname__}' == 'builtins.dict'
    assert len(locked_machine_0.events) == 1
    assert locked_machine_0.send_event is False
    assert locked_machine_0.auto_transitions is True
    assert locked_machine_0.ignore_invalid_triggers is None
    assert locked_machine_0.name == ''
    assert locked_machine_0.model_attribute == 'state'
    assert f'{type(locked_machine_0.models).__module__}.{type(locked_machine_0.models).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.models) == 1
    assert locked_machine_0.state == 'initial'
    locked_event_0 = module_0.LockedEvent(locked_machine_0, locked_machine_0)
    locked_machine_1 = module_0.LockedMachine()
    assert len(locked_machine_1.model_context_map) == 1
    var_0 = locked_machine_1.add_model(locked_machine_0, model_context=locked_machine_0)
    assert len(locked_machine_1.model_context_map) == 2
    assert len(locked_machine_1.models) == 2
    var_0.__new__(locked_machine_1)

@pytest.mark.xfail(strict=True)
def test_case_9():
    locked_machine_0 = module_0.LockedMachine()
    assert f'{type(locked_machine_0).__module__}.{type(locked_machine_0).__qualname__}' == 'transitions.extensions.locking.LockedMachine'
    assert f'{type(locked_machine_0.machine_context).__module__}.{type(locked_machine_0.machine_context).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.machine_context) == 2
    assert f'{type(locked_machine_0.model_context_map).__module__}.{type(locked_machine_0.model_context_map).__qualname__}' == 'collections.defaultdict'
    assert len(locked_machine_0.model_context_map) == 1
    assert f'{type(locked_machine_0.states).__module__}.{type(locked_machine_0.states).__qualname__}' == 'collections.OrderedDict'
    assert len(locked_machine_0.states) == 1
    assert f'{type(locked_machine_0.events).__module__}.{type(locked_machine_0.events).__qualname__}' == 'builtins.dict'
    assert len(locked_machine_0.events) == 1
    assert locked_machine_0.send_event is False
    assert locked_machine_0.auto_transitions is True
    assert locked_machine_0.ignore_invalid_triggers is None
    assert locked_machine_0.name == ''
    assert locked_machine_0.model_attribute == 'state'
    assert f'{type(locked_machine_0.models).__module__}.{type(locked_machine_0.models).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.models) == 1
    assert locked_machine_0.state == 'initial'
    picklable_lock_0 = module_0.PicklableLock()
    var_0 = module_1.isfunction(locked_machine_0)
    var_1 = locked_machine_0.add_model(picklable_lock_0)
    assert len(locked_machine_0.model_context_map) == 2
    assert len(locked_machine_0.models) == 2
    assert picklable_lock_0.state == 'initial'
    module_1.getcoroutinestate(picklable_lock_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    locked_machine_0 = module_0.LockedMachine()
    assert f'{type(locked_machine_0).__module__}.{type(locked_machine_0).__qualname__}' == 'transitions.extensions.locking.LockedMachine'
    assert f'{type(locked_machine_0.machine_context).__module__}.{type(locked_machine_0.machine_context).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.machine_context) == 2
    assert f'{type(locked_machine_0.model_context_map).__module__}.{type(locked_machine_0.model_context_map).__qualname__}' == 'collections.defaultdict'
    assert len(locked_machine_0.model_context_map) == 1
    assert f'{type(locked_machine_0.states).__module__}.{type(locked_machine_0.states).__qualname__}' == 'collections.OrderedDict'
    assert len(locked_machine_0.states) == 1
    assert f'{type(locked_machine_0.events).__module__}.{type(locked_machine_0.events).__qualname__}' == 'builtins.dict'
    assert len(locked_machine_0.events) == 1
    assert locked_machine_0.send_event is False
    assert locked_machine_0.auto_transitions is True
    assert locked_machine_0.ignore_invalid_triggers is None
    assert locked_machine_0.name == ''
    assert locked_machine_0.model_attribute == 'state'
    assert f'{type(locked_machine_0.models).__module__}.{type(locked_machine_0.models).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.models) == 1
    assert locked_machine_0.state == 'initial'
    var_0 = locked_machine_0.remove_model(locked_machine_0)
    assert len(locked_machine_0.model_context_map) == 0
    assert locked_machine_0.models == []
    locked_event_0 = module_0.LockedEvent(var_0, locked_machine_0)
    locked_event_0.trigger(locked_machine_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    locked_machine_0 = module_0.LockedMachine()
    assert f'{type(locked_machine_0).__module__}.{type(locked_machine_0).__qualname__}' == 'transitions.extensions.locking.LockedMachine'
    assert f'{type(locked_machine_0.machine_context).__module__}.{type(locked_machine_0.machine_context).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.machine_context) == 2
    assert f'{type(locked_machine_0.model_context_map).__module__}.{type(locked_machine_0.model_context_map).__qualname__}' == 'collections.defaultdict'
    assert len(locked_machine_0.model_context_map) == 1
    assert f'{type(locked_machine_0.states).__module__}.{type(locked_machine_0.states).__qualname__}' == 'collections.OrderedDict'
    assert len(locked_machine_0.states) == 1
    assert f'{type(locked_machine_0.events).__module__}.{type(locked_machine_0.events).__qualname__}' == 'builtins.dict'
    assert len(locked_machine_0.events) == 1
    assert locked_machine_0.send_event is False
    assert locked_machine_0.auto_transitions is True
    assert locked_machine_0.ignore_invalid_triggers is None
    assert locked_machine_0.name == ''
    assert locked_machine_0.model_attribute == 'state'
    assert f'{type(locked_machine_0.models).__module__}.{type(locked_machine_0.models).__qualname__}' == 'builtins.list'
    assert len(locked_machine_0.models) == 1
    assert locked_machine_0.state == 'initial'
    locked_event_0 = module_0.LockedEvent(locked_machine_0, locked_machine_0)
    locked_event_0.trigger(locked_event_0)