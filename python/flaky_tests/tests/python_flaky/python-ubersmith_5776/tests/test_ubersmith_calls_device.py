# Automatically generated by Pynguin.
import ubersmith.calls.device as module_0

def test_case_0():
    bytes_0 = b'\xff\x03\xe2\xaeH\x8f'
    module_graph_call_0 = module_0.ModuleGraphCall(request_handler=bytes_0)
    assert module_0.ModuleGraphCall.method == 'device.module_graph'