# Automatically generated by Pynguin.
import pytest
import rambutan3.RArgs as module_0
import rambutan3.check_args.set.RSetMatcher as module_1

def test_case_0():
    bytes_0 = b'\x1a'
    str_0 = ' Gv%HF_X'
    with pytest.raises(TypeError):
        module_0.check_is_subclass(bytes_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    list_0 = []
    str_0 = 'i-t=Jx(hF}sK*'
    var_0 = module_0.check_not_none(list_0, str_0)
    str_1 = '_qD,X<ES;\x0c~]^p'
    tuple_0 = (list_0, var_0, str_1)
    module_1.RSetMatcher(tuple_0)