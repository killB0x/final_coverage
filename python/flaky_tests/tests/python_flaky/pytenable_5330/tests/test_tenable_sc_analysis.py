# Automatically generated by Pynguin.
import pytest
import tenable.sc.analysis as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    analysis_results_iterator_0 = module_0.AnalysisResultsIterator(none_type_0)
    analysis_results_iterator_0.next()

def test_case_1():
    bytes_0 = b'\x0bKK'
    analysis_a_p_i_0 = module_0.AnalysisAPI(bytes_0)
    var_0 = analysis_a_p_i_0.console()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'tenable.sc.analysis.AnalysisResultsIterator'

def test_case_2():
    none_type_0 = None
    analysis_a_p_i_0 = module_0.AnalysisAPI(none_type_0)
    var_0 = analysis_a_p_i_0.vulns()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'tenable.sc.analysis.AnalysisResultsIterator'

def test_case_3():
    none_type_0 = None
    analysis_a_p_i_0 = module_0.AnalysisAPI(none_type_0)
    var_0 = analysis_a_p_i_0.scan(none_type_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'tenable.sc.analysis.AnalysisResultsIterator'

def test_case_4():
    none_type_0 = None
    analysis_a_p_i_0 = module_0.AnalysisAPI(none_type_0)
    var_0 = analysis_a_p_i_0.events()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'tenable.sc.analysis.AnalysisResultsIterator'

def test_case_5():
    bytes_0 = b'\x0bKK'
    analysis_a_p_i_0 = module_0.AnalysisAPI(bytes_0)

def test_case_6():
    bytes_0 = b'\x0bKK'
    analysis_a_p_i_0 = module_0.AnalysisAPI(bytes_0)
    var_0 = analysis_a_p_i_0.mobile()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'tenable.sc.analysis.AnalysisResultsIterator'

@pytest.mark.xfail(strict=True)
def test_case_7():
    none_type_0 = None
    analysis_results_iterator_0 = module_0.AnalysisResultsIterator(none_type_0)
    str_0 = '!C!_2{YOx}^riOt|T!j1'
    bytes_0 = b'N\x9c\xd6\x84\xde\xf0\x05cZk\xda\xc0N\xc3\xa88\xdc\x9d\x9aO'
    str_1 = 'tool'
    dict_0 = {str_0: bytes_0, str_1: analysis_results_iterator_0, str_0: str_1}
    analysis_a_p_i_0 = module_0.AnalysisAPI(analysis_results_iterator_0)
    analysis_a_p_i_0.mobile(**dict_0)