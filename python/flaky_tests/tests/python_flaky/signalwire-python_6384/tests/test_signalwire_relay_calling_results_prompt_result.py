# Automatically generated by Pynguin.
import signalwire.relay.calling.results.prompt_result as module_0

def test_case_0():
    bytes_0 = b'\xf6\xde\x12\xb3L\xaf\xad\xe7\xe9\x99\xed\x86"\xb9\xfe\x89v;'
    prompt_result_0 = module_0.PromptResult(bytes_0)
    assert f'{type(module_0.PromptResult.prompt_type).__module__}.{type(module_0.PromptResult.prompt_type).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.PromptResult.result).__module__}.{type(module_0.PromptResult.result).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.PromptResult.terminator).__module__}.{type(module_0.PromptResult.terminator).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.PromptResult.confidence).__module__}.{type(module_0.PromptResult.confidence).__qualname__}' == 'builtins.property'

def test_case_1():
    bytes_0 = b"r\x8b\xbe*'\xd2\x02\xb1\xfe\xe08\xb3$\x17"
    prompt_volume_result_0 = module_0.PromptVolumeResult(bytes_0)