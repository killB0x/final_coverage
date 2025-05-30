# Automatically generated by Pynguin.
import pytest
import litefeel.pycommon.color as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = 'P}SV'
    module_0.parse_hex_color(str_0)

def test_case_1():
    str_0 = 'EF1'
    color_0 = module_0.parse_color(str_0)
    assert f'{type(color_0).__module__}.{type(color_0).__qualname__}' == 'litefeel.pycommon.color.Color'
    assert color_0.r == pytest.approx(0.9333333333333333, abs=0.01, rel=0.01)
    assert color_0.g == pytest.approx(1.0, abs=0.01, rel=0.01)
    assert color_0.b == pytest.approx(0.06666666666666667, abs=0.01, rel=0.01)
    assert color_0.a == pytest.approx(1.0, abs=0.01, rel=0.01)
    assert f'{type(module_0.Color.rgba).__module__}.{type(module_0.Color.rgba).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.Color.html_rgba).__module__}.{type(module_0.Color.html_rgba).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.Color.color32).__module__}.{type(module_0.Color.color32).__qualname__}' == 'builtins.property'
    str_1 = color_0.__str__()
    assert str_1 == '{Color r: 0.933333, g: 1.000000, b: 0.066667, a: 1.000000}'

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = '3hLi1;'
    module_0.parse_color32(str_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = '#_%bK34kSGOF8o)-'
    module_0.parse_color(str_0)

def test_case_4():
    color32_0 = module_0.Color32()
    assert color32_0.r == 255
    assert color32_0.g == 255
    assert color32_0.b == 255
    assert color32_0.a == 255
    assert f'{type(module_0.Color32.rgba).__module__}.{type(module_0.Color32.rgba).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.Color32.html_rgba).__module__}.{type(module_0.Color32.html_rgba).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.Color32.color).__module__}.{type(module_0.Color32.color).__qualname__}' == 'builtins.property'

def test_case_5():
    color_0 = module_0.Color()
    assert color_0.r == 1
    assert color_0.g == 1
    assert color_0.b == 1
    assert color_0.a == 1
    assert f'{type(module_0.Color.rgba).__module__}.{type(module_0.Color.rgba).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.Color.html_rgba).__module__}.{type(module_0.Color.html_rgba).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.Color.color32).__module__}.{type(module_0.Color.color32).__qualname__}' == 'builtins.property'

def test_case_6():
    int_0 = -3078
    color32_0 = module_0.Color32(a=int_0)
    assert color32_0.r == 255
    assert color32_0.g == 255
    assert color32_0.b == 255
    assert f'{type(module_0.Color32.rgba).__module__}.{type(module_0.Color32.rgba).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.Color32.html_rgba).__module__}.{type(module_0.Color32.html_rgba).__qualname__}' == 'builtins.property'
    assert f'{type(module_0.Color32.color).__module__}.{type(module_0.Color32.color).__qualname__}' == 'builtins.property'
    str_0 = color32_0.__str__()
    assert str_0 == '{Color32 r: 255, g: 255, b: 255, a: -3078}'

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = ']sG0U{X-AB-Wz"['
    module_0.parse_color(str_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = ';SKajT0f'
    module_0.parse_color(str_0)