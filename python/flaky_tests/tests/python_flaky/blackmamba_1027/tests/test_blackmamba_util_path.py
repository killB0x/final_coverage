# Automatically generated by Pynguin.
import pytest
import blackmamba.util.path as module_0

def test_case_0():
    str_0 = 'ct8'
    var_0 = module_0.strip_documents_folder(str_0)
    assert var_0 == 'ct8'

@pytest.mark.xfail(strict=True)
def test_case_1():
    int_0 = -1106
    module_0.is_python_file(int_0)