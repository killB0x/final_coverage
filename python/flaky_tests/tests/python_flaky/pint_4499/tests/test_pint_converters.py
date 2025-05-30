# Automatically generated by Pynguin.
import pytest
import pint.converters as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = '<OkY_;\\cXp9{|A-r\nC\\0'
    none_type_0 = None
    scale_converter_0 = module_0.ScaleConverter(none_type_0)
    assert f'{type(scale_converter_0).__module__}.{type(scale_converter_0).__qualname__}' == 'pint.converters.ScaleConverter'
    assert scale_converter_0.scale is None
    scale_converter_0.to_reference(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    bytes_0 = b'\xf4\xaf9E\xc1\x91\x98M\x9eH<\x7f\x1dR\xf8\x9d'
    offset_converter_0 = module_0.OffsetConverter(bytes_0, bytes_0)
    assert f'{type(offset_converter_0).__module__}.{type(offset_converter_0).__qualname__}' == 'pint.converters.OffsetConverter'
    assert offset_converter_0.scale == b'\xf4\xaf9E\xc1\x91\x98M\x9eH<\x7f\x1dR\xf8\x9d'
    assert offset_converter_0.offset == b'\xf4\xaf9E\xc1\x91\x98M\x9eH<\x7f\x1dR\xf8\x9d'
    assert f'{type(module_0.OffsetConverter.is_multiplicative).__module__}.{type(module_0.OffsetConverter.is_multiplicative).__qualname__}' == 'builtins.property'
    scale_converter_0 = module_0.ScaleConverter(bytes_0)
    assert f'{type(scale_converter_0).__module__}.{type(scale_converter_0).__qualname__}' == 'pint.converters.ScaleConverter'
    assert scale_converter_0.scale == b'\xf4\xaf9E\xc1\x91\x98M\x9eH<\x7f\x1dR\xf8\x9d'
    scale_converter_0.to_reference(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    int_0 = -1603
    scale_converter_0 = module_0.ScaleConverter(int_0)
    assert f'{type(scale_converter_0).__module__}.{type(scale_converter_0).__qualname__}' == 'pint.converters.ScaleConverter'
    assert scale_converter_0.scale == -1603
    int_1 = -1894
    tuple_0 = (int_1,)
    bytes_0 = b'\xd8\xc4\x8a1`\xf5\xb6\x06=xs\x88F\x96$\xf3.*\xe2l'
    scale_converter_1 = module_0.ScaleConverter(bytes_0)
    scale_converter_1.from_reference(tuple_0, int_1)

@pytest.mark.xfail(strict=True)
def test_case_3():
    bool_0 = True
    scale_converter_0 = module_0.ScaleConverter(bool_0)
    assert f'{type(scale_converter_0).__module__}.{type(scale_converter_0).__qualname__}' == 'pint.converters.ScaleConverter'
    assert scale_converter_0.scale is True
    var_0 = scale_converter_0.from_reference(bool_0)
    var_0.from_reference(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    bytes_0 = b'\xe84}\xa9IH"~i\xadY\xb1{'
    str_0 = '1F@)?7Jb(s\x0b6C,'
    offset_converter_0 = module_0.OffsetConverter(bytes_0, bytes_0)
    assert f'{type(offset_converter_0).__module__}.{type(offset_converter_0).__qualname__}' == 'pint.converters.OffsetConverter'
    assert offset_converter_0.scale == b'\xe84}\xa9IH"~i\xadY\xb1{'
    assert offset_converter_0.offset == b'\xe84}\xa9IH"~i\xadY\xb1{'
    assert f'{type(module_0.OffsetConverter.is_multiplicative).__module__}.{type(module_0.OffsetConverter.is_multiplicative).__qualname__}' == 'builtins.property'
    offset_converter_0.to_reference(bytes_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    bool_0 = True
    bytes_0 = b'd\xb5\x12\xbaG\x05\x8f\xb1\xd8\xb9\xa9)'
    offset_converter_0 = module_0.OffsetConverter(bytes_0, bytes_0)
    assert f'{type(offset_converter_0).__module__}.{type(offset_converter_0).__qualname__}' == 'pint.converters.OffsetConverter'
    assert offset_converter_0.scale == b'd\xb5\x12\xbaG\x05\x8f\xb1\xd8\xb9\xa9)'
    assert offset_converter_0.offset == b'd\xb5\x12\xbaG\x05\x8f\xb1\xd8\xb9\xa9)'
    assert f'{type(module_0.OffsetConverter.is_multiplicative).__module__}.{type(module_0.OffsetConverter.is_multiplicative).__qualname__}' == 'builtins.property'
    var_0 = offset_converter_0.to_reference(bool_0)
    assert var_0 == b'd\xb5\x12\xbaG\x05\x8f\xb1\xd8\xb9\xa9)d\xb5\x12\xbaG\x05\x8f\xb1\xd8\xb9\xa9)'
    scale_converter_0 = module_0.ScaleConverter(var_0)
    assert f'{type(scale_converter_0).__module__}.{type(scale_converter_0).__qualname__}' == 'pint.converters.ScaleConverter'
    assert scale_converter_0.scale == b'd\xb5\x12\xbaG\x05\x8f\xb1\xd8\xb9\xa9)d\xb5\x12\xbaG\x05\x8f\xb1\xd8\xb9\xa9)'
    var_0.to_reference(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    converter_0 = module_0.Converter()
    bool_0 = True
    var_0 = converter_0.from_reference(converter_0, converter_0)
    var_1 = converter_0.from_reference(converter_0, bool_0)
    none_type_0 = None
    offset_converter_0 = module_0.OffsetConverter(none_type_0, bool_0)
    assert f'{type(offset_converter_0).__module__}.{type(offset_converter_0).__qualname__}' == 'pint.converters.OffsetConverter'
    assert offset_converter_0.scale is None
    assert offset_converter_0.offset is True
    assert f'{type(module_0.OffsetConverter.is_multiplicative).__module__}.{type(module_0.OffsetConverter.is_multiplicative).__qualname__}' == 'builtins.property'
    bytes_0 = b'_\xc4\xf7E\xa5'
    offset_converter_0.from_reference(var_1, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    none_type_0 = None
    int_0 = 130
    int_1 = -1479
    set_0 = {int_0, int_1, int_0, int_1}
    offset_converter_0 = module_0.OffsetConverter(none_type_0, set_0)
    assert f'{type(offset_converter_0).__module__}.{type(offset_converter_0).__qualname__}' == 'pint.converters.OffsetConverter'
    assert offset_converter_0.scale is None
    assert offset_converter_0.offset == {-1479, 130}
    assert f'{type(module_0.OffsetConverter.is_multiplicative).__module__}.{type(module_0.OffsetConverter.is_multiplicative).__qualname__}' == 'builtins.property'
    offset_converter_0.from_reference(int_1, none_type_0)

def test_case_8():
    converter_0 = module_0.Converter()

def test_case_9():
    converter_0 = module_0.Converter()
    var_0 = converter_0.from_reference(converter_0, converter_0)
    var_1 = converter_0.to_reference(converter_0)
    var_2 = converter_0.from_reference(var_1)
    var_3 = converter_0.from_reference(converter_0)
    var_4 = var_0.from_reference(var_3)
    var_5 = converter_0.from_reference(converter_0, var_3)
    scale_converter_0 = module_0.ScaleConverter(var_2)
    assert f'{type(scale_converter_0).__module__}.{type(scale_converter_0).__qualname__}' == 'pint.converters.ScaleConverter'
    assert f'{type(scale_converter_0.scale).__module__}.{type(scale_converter_0.scale).__qualname__}' == 'pint.converters.Converter'
    var_6 = var_5.to_reference(converter_0)

def test_case_10():
    int_0 = 45
    scale_converter_0 = module_0.ScaleConverter(int_0)
    assert f'{type(scale_converter_0).__module__}.{type(scale_converter_0).__qualname__}' == 'pint.converters.ScaleConverter'
    assert scale_converter_0.scale == 45

def test_case_11():
    bool_0 = True
    offset_converter_0 = module_0.OffsetConverter(bool_0, bool_0)
    assert f'{type(offset_converter_0).__module__}.{type(offset_converter_0).__qualname__}' == 'pint.converters.OffsetConverter'
    assert offset_converter_0.scale is True
    assert offset_converter_0.offset is True
    assert f'{type(module_0.OffsetConverter.is_multiplicative).__module__}.{type(module_0.OffsetConverter.is_multiplicative).__qualname__}' == 'builtins.property'