# Automatically generated by Pynguin.
import pytest
import tests.test_extractors as module_0
import rtv.extractors.common as module_1

def test_case_0():
    extractor_tester_0 = module_0.ExtractorTester()

def test_case_1():
    extractor_tester_0 = module_0.ExtractorTester()
    extractor_0 = module_1.Extractor(extractor_tester_0)
    with pytest.raises(AssertionError):
        extractor_tester_0.test_videos_loaded(extractor_0)

def test_case_2():
    extractor_tester_0 = module_0.ExtractorTester()
    extractor_0 = module_1.Extractor(extractor_tester_0)
    var_0 = extractor_tester_0.test_all_videos_have_necessary_data(extractor_0)