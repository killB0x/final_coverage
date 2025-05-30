# Automatically generated by Pynguin.
import pytest
import mdutils.tools.Link as module_0
import builtins as module_1

def test_case_0():
    inline_0 = module_0.Inline()

def test_case_1():
    reference_0 = module_0.Reference()
    var_0 = reference_0.get_references_as_markdown()
    assert var_0 == ''

@pytest.mark.xfail(strict=True)
def test_case_2():
    reference_0 = module_0.Reference()
    reference_0.new_link(reference_0, reference_0, tooltip=reference_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    reference_0 = module_0.Reference()
    reference_0.new_link(reference_0, reference_0, reference_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    inline_0 = module_0.Inline()
    inline_0.new_link(inline_0, inline_0, inline_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    reference_0 = module_0.Reference()
    inline_0 = module_0.Inline()
    inline_0.new_link(inline_0)

def test_case_6():
    reference_0 = module_0.Reference()

@pytest.mark.xfail(strict=True)
def test_case_7():
    bytes_0 = b'B\xf0\xb5\x8f6p\x12^u*\xba'
    reference_0 = module_0.Reference()
    var_0 = reference_0.get_references_as_markdown()
    assert var_0 == ''
    var_1 = reference_0.get_references()
    var_1.new_link(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    inline_0 = module_0.Inline()
    inline_0.new_link(inline_0, inline_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    inline_0 = module_0.Inline()
    inline_0.new_link(inline_0, tooltip=inline_0)

def test_case_10():
    reference_0 = module_0.Reference()
    var_0 = reference_0.get_references_as_markdown()
    assert var_0 == ''
    var_1 = reference_0.new_link(var_0, var_0, tooltip=var_0)
    assert var_1 == '[]'
    assert reference_0.references == {'': " ''"}
    reference_1 = module_0.Reference()
    var_2 = reference_1.get_references_as_markdown()
    assert var_2 == ''
    inline_0 = module_0.Inline()
    reference_2 = module_0.Reference()
    var_3 = reference_0.new_link(var_1, var_0)
    assert var_3 == '[]'

@pytest.mark.xfail(strict=True)
def test_case_11():
    reference_0 = module_0.Reference()
    var_0 = reference_0.get_references_as_markdown()
    assert var_0 == ''
    var_1 = module_1.object()
    reference_1 = module_0.Reference()
    var_2 = reference_0.new_link(var_1, var_0)
    assert var_2 == '[]'
    assert len(reference_0.references) == 1
    reference_0.get_references_as_markdown()

@pytest.mark.xfail(strict=True)
def test_case_12():
    reference_0 = module_0.Reference()
    var_0 = reference_0.get_references_as_markdown()
    assert var_0 == ''
    object_0 = module_1.object()
    reference_1 = module_0.Reference()
    var_1 = reference_0.new_link(var_0, var_0, tooltip=reference_1)
    assert var_1 == '[]'
    var_2 = reference_0.new_link(object_0, var_0)
    assert var_2 == '[]'
    var_3 = reference_0.get_references_as_markdown()
    inline_0 = module_0.Inline()
    var_0.get_references_as_markdown()