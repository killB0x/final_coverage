# Automatically generated by Pynguin.
import pytest
import blockchainetl_common.streaming.streamer_adapter_stub as module_0

def test_case_0():
    streamer_adapter_stub_0 = module_0.StreamerAdapterStub()
    var_0 = streamer_adapter_stub_0.close()
    var_1 = streamer_adapter_stub_0.open()

@pytest.mark.xfail(strict=True)
def test_case_1():
    streamer_adapter_stub_0 = module_0.StreamerAdapterStub()
    var_0 = streamer_adapter_stub_0.get_current_block_number()
    assert var_0 == 0
    tuple_0 = (var_0, var_0)
    float_0 = -4298.2555
    tuple_1 = (tuple_0, float_0)
    none_type_0 = None
    var_1 = streamer_adapter_stub_0.export_all(tuple_1, none_type_0)
    streamer_adapter_stub_1 = module_0.StreamerAdapterStub()
    var_2 = streamer_adapter_stub_1.get_current_block_number()
    assert var_2 == 0
    var_2.close()