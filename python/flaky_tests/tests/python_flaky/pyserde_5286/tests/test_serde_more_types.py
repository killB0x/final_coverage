# Automatically generated by Pynguin.
import pytest
import decimal as module_0
import serde.more_types as module_1
import serde.core as module_2

def test_case_0():
    decimal_0 = module_0.Decimal()
    var_0 = module_1.serialize(decimal_0)
    assert var_0 == '0'

def test_case_1():
    none_type_0 = None
    with pytest.raises(module_2.SerdeError):
        module_1.serialize(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    bytes_0 = b'n\xee\x87\xa6$\x9eba\x8d\xdb\x08a\xfc\xf0@'
    module_1.deserialize(bytes_0, bytes_0)