# Automatically generated by Pynguin.
import pytest
import pyecore.innerutils as module_0

def test_case_0():
    str_0 = 'IS'
    with pytest.raises(ValueError):
        module_0.parse_date(str_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    none_type_0 = None
    module_0.parse_date(none_type_0)