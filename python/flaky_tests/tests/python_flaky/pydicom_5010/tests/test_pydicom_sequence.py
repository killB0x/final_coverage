# Automatically generated by Pynguin.
import pytest
import pydicom.sequence as module_0
import pydicom.dataset as module_1

def test_case_0():
    none_type_0 = None
    with pytest.raises(TypeError):
        module_0.validate_dataset(none_type_0)

def test_case_1():
    sequence_0 = module_0.Sequence()
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'pydicom.sequence.Sequence'
    assert len(sequence_0) == 0
    assert f'{type(module_0.Sequence.parent).__module__}.{type(module_0.Sequence.parent).__qualname__}' == 'builtins.property'

def test_case_2():
    sequence_0 = module_0.Sequence()
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'pydicom.sequence.Sequence'
    assert len(sequence_0) == 0
    assert f'{type(module_0.Sequence.parent).__module__}.{type(module_0.Sequence.parent).__qualname__}' == 'builtins.property'
    var_0 = sequence_0.__str__()
    assert var_0 == '[]'

@pytest.mark.xfail(strict=True)
def test_case_3():
    sequence_0 = module_0.Sequence()
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'pydicom.sequence.Sequence'
    assert len(sequence_0) == 0
    assert f'{type(module_0.Sequence.parent).__module__}.{type(module_0.Sequence.parent).__qualname__}' == 'builtins.property'
    sequence_0.__setitem__(sequence_0, sequence_0)

def test_case_4():
    sequence_0 = module_0.Sequence()
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'pydicom.sequence.Sequence'
    assert len(sequence_0) == 0
    assert f'{type(module_0.Sequence.parent).__module__}.{type(module_0.Sequence.parent).__qualname__}' == 'builtins.property'
    var_0 = sequence_0.__repr__()
    assert var_0 == '<Sequence, length 0>'
    with pytest.raises(TypeError):
        module_0.validate_dataset(sequence_0)

def test_case_5():
    bool_0 = True
    with pytest.raises(TypeError):
        module_0.Sequence(bool_0)

def test_case_6():
    dataset_0 = module_1.Dataset()
    var_0 = dataset_0.to_json_dict()
    with pytest.raises(TypeError):
        module_0.Sequence(dataset_0)

def test_case_7():
    dataset_0 = module_1.Dataset()
    var_0 = module_0.validate_dataset(dataset_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'pydicom.dataset.Dataset'
    assert len(var_0) == 0
    bytes_0 = b'\xff\xd9'
    with pytest.raises(TypeError):
        module_0.validate_dataset(bytes_0)