# Automatically generated by Pynguin.
import pytest
import nodal.nodes.noop as module_0

def test_case_0():
    no_op_0 = module_0.NoOp()
    assert f'{type(no_op_0).__module__}.{type(no_op_0).__qualname__}' == 'nodal.nodes.noop.NoOp'
    assert f'{type(module_0.NoOp.output_type).__module__}.{type(module_0.NoOp.output_type).__qualname__}' == 'builtins.property'
    var_0 = no_op_0.execute()

def test_case_1():
    no_op_0 = module_0.NoOp()
    assert f'{type(no_op_0).__module__}.{type(no_op_0).__qualname__}' == 'nodal.nodes.noop.NoOp'
    assert f'{type(module_0.NoOp.output_type).__module__}.{type(module_0.NoOp.output_type).__qualname__}' == 'builtins.property'

@pytest.mark.xfail(strict=True)
def test_case_2():
    no_op_0 = module_0.NoOp()
    assert f'{type(no_op_0).__module__}.{type(no_op_0).__qualname__}' == 'nodal.nodes.noop.NoOp'
    assert f'{type(module_0.NoOp.output_type).__module__}.{type(module_0.NoOp.output_type).__qualname__}' == 'builtins.property'
    bool_0 = False
    no_op_0.set_input(bool_0, no_op_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    no_op_0 = module_0.NoOp()
    assert f'{type(no_op_0).__module__}.{type(no_op_0).__qualname__}' == 'nodal.nodes.noop.NoOp'
    assert f'{type(module_0.NoOp.output_type).__module__}.{type(module_0.NoOp.output_type).__qualname__}' == 'builtins.property'
    no_op_1 = module_0.NoOp()
    no_op_2 = module_0.NoOp()
    var_0 = no_op_2.execute()
    bool_0 = False
    var_1 = var_0.__eq__(no_op_0)
    var_2 = no_op_2.set_input(bool_0, no_op_1)
    assert var_2 is True
    no_op_2.set_input(bool_0, no_op_2)

@pytest.mark.xfail(strict=True)
def test_case_4():
    no_op_0 = module_0.NoOp()
    assert f'{type(no_op_0).__module__}.{type(no_op_0).__qualname__}' == 'nodal.nodes.noop.NoOp'
    assert f'{type(module_0.NoOp.output_type).__module__}.{type(module_0.NoOp.output_type).__qualname__}' == 'builtins.property'
    no_op_1 = module_0.NoOp()
    no_op_2 = module_0.NoOp()
    var_0 = no_op_2.execute()
    bool_0 = False
    var_1 = no_op_2.delete()
    var_2 = no_op_2.set_input(bool_0, no_op_1)
    assert var_2 is True
    var_3 = no_op_2.execute()
    module_0.NoOp(*bool_0)