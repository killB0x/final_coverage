# Automatically generated by Pynguin.
import pytest
import signalwire.relay.calling.results.disconnect_result as module_0
import abc as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    bool_0 = True
    set_0 = {bool_0, bool_0}
    disconnect_result_0 = module_0.DisconnectResult(set_0)
    assert disconnect_result_0.component == {True}
    float_0 = 2170.77701
    list_0 = [float_0, float_0, float_0, float_0]
    module_1.ABC(*list_0)