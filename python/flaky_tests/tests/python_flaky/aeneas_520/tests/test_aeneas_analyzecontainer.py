# Automatically generated by Pynguin.
import pytest
import aeneas.analyzecontainer as module_0
import aeneas.globalfunctions as module_1

def test_case_0():
    none_type_0 = None
    with pytest.raises(TypeError):
        module_0.AnalyzeContainer(none_type_0)

def test_case_1():
    bytes_0 = b'!\xcb\xc8'
    with pytest.raises(TypeError):
        module_0.AnalyzeContainer(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    module_1.tmp_directory()
    var_1 = var_0.analyze()