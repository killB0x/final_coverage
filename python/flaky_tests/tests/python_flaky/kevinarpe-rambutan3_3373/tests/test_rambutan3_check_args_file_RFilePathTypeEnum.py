# Automatically generated by Pynguin.
import pytest
import rambutan3.check_args.file.RFilePathTypeEnum as module_0

def test_case_0():
    pass

@pytest.mark.xfail(strict=True)
def test_case_1():
    float_0 = -1404.909
    module_0.is_absolute_pathname(float_0)

def test_case_2():
    str_0 = 'Internal error: Do not call this constructor'
    bool_0 = module_0.is_relative_pathname(str_0)
    assert bool_0 is True