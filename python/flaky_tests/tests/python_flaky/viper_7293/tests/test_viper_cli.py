# Automatically generated by Pynguin.
import pytest
import viper.cli as module_0

def test_case_0():
    str_0 = ' -> '
    with pytest.raises(ValueError):
        module_0.func(str_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    module_0.run()