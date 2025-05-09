# Automatically generated by Pynguin.
import pytest
import aeneas.extra.ctw_espeak as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    custom_t_t_s_wrapper_0 = module_0.CustomTTSWrapper()
    assert f'{type(custom_t_t_s_wrapper_0).__module__}.{type(custom_t_t_s_wrapper_0).__qualname__}' == 'aeneas.extra.ctw_espeak.CustomTTSWrapper'
    assert f'{type(custom_t_t_s_wrapper_0.logger).__module__}.{type(custom_t_t_s_wrapper_0.logger).__qualname__}' == 'aeneas.logger.Logger'
    assert len(custom_t_t_s_wrapper_0.logger) == 7
    assert f'{type(custom_t_t_s_wrapper_0.rconf).__module__}.{type(custom_t_t_s_wrapper_0.rconf).__qualname__}' == 'aeneas.runtimeconfiguration.RuntimeConfiguration'
    assert custom_t_t_s_wrapper_0.subprocess_arguments == ['/usr/bin/espeak', '-v', 'VOICE_CODE_STRING', '-w', 'WAVE_PATH', 'TEXT_STDIN']
    assert custom_t_t_s_wrapper_0.tts_path is None
    assert custom_t_t_s_wrapper_0.use_cache is False
    assert custom_t_t_s_wrapper_0.cache is None
    assert module_0.CustomTTSWrapper.LANGUAGE_TO_VOICE_CODE == {'eng': 'en', 'ita': 'it', 'rus': 'ru', 'ukr': 'ru'}
    assert module_0.CustomTTSWrapper.DEFAULT_LANGUAGE == 'eng'
    assert module_0.CustomTTSWrapper.OUTPUT_AUDIO_FORMAT == ('pcm_s16le', 1, 22050)
    assert module_0.CustomTTSWrapper.HAS_SUBPROCESS_CALL is True
    assert module_0.CustomTTSWrapper.TAG == 'CustomTTSWrapperESPEAK'
    module_0.CustomTTSWrapper(custom_t_t_s_wrapper_0)