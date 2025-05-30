# Automatically generated by Pynguin.
import pytest
import rambutan3.check_args.base.traverse.RTypeMatcherError as module_0
import rambutan3.error.RIllegalStateError as module_1
import rambutan3.check_args.base.traverse.RTypeMatcherTraversePathStepEnum as module_2
import rambutan3.string.RMessageText as module_3
import builtins as module_4

def test_case_0():
    r_type_matcher_error_0 = module_0.RTypeMatcherError()
    assert f'{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__module__}.{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__qualname__}' == 'builtins.property'
    var_0 = r_type_matcher_error_0.add_failed_match(r_type_matcher_error_0, r_type_matcher_error_0)
    var_1 = r_type_matcher_error_0.add_failed_match(r_type_matcher_error_0, r_type_matcher_error_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    r_type_matcher_error_0 = module_0.RTypeMatcherError()
    assert f'{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__module__}.{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__qualname__}' == 'builtins.property'
    str_0 = '=Pc:X5\n@aDi#_~D^'
    str_1 = r_type_matcher_error_0.traverse_path_str()
    r_type_matcher_error_1 = module_0.RTypeMatcherError()
    r_type_matcher_error_0.add_failed_match(str_1, r_type_matcher_error_0, str_0)

def test_case_2():
    r_type_matcher_error_0 = module_0.RTypeMatcherError()
    assert f'{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__module__}.{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__qualname__}' == 'builtins.property'
    str_0 = r_type_matcher_error_0.traverse_path_str()

def test_case_3():
    r_type_matcher_error_0 = module_0.RTypeMatcherError()
    assert f'{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__module__}.{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__qualname__}' == 'builtins.property'

@pytest.mark.xfail(strict=True)
def test_case_4():
    r_type_matcher_error_0 = module_0.RTypeMatcherError()
    assert f'{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__module__}.{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__qualname__}' == 'builtins.property'
    str_0 = r_type_matcher_error_0.traverse_path_str()
    r_type_matcher_error_1 = module_0.RTypeMatcherError()
    var_0 = r_type_matcher_error_0.add_failed_match(str_0, str_0)
    var_1 = var_0.__str__()
    r_type_matcher_error_0.add_traverse_path_step(var_0, r_type_matcher_error_0)

def test_case_5():
    r_type_matcher_error_0 = module_0.RTypeMatcherError()
    assert f'{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__module__}.{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__qualname__}' == 'builtins.property'
    none_type_0 = None
    var_0 = r_type_matcher_error_0.add_failed_match(none_type_0, r_type_matcher_error_0)
    none_type_1 = None
    with pytest.raises(module_1.RIllegalStateError):
        r_type_matcher_error_0.add_failed_match(none_type_1, var_0)

def test_case_6():
    r_type_matcher_error_0 = module_0.RTypeMatcherError()
    assert f'{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__module__}.{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__qualname__}' == 'builtins.property'
    none_type_0 = None
    str_0 = '=Pc:X5\n@aDi#_~D^'
    r_type_matcher_traverse_path_step_enum_0 = module_2.RTypeMatcherTraversePathStepEnum.Key
    var_0 = r_type_matcher_error_0.add_traverse_path_step(r_type_matcher_traverse_path_step_enum_0, str_0)
    str_1 = r_type_matcher_error_0.traverse_path_str()
    none_type_1 = None
    var_1 = r_type_matcher_error_0.add_failed_match(none_type_1, str_1)
    with pytest.raises(module_1.RIllegalStateError):
        r_type_matcher_error_0.add_failed_match(none_type_0, r_type_matcher_error_0)

def test_case_7():
    r_type_matcher_error_0 = module_0.RTypeMatcherError()
    assert f'{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__module__}.{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__qualname__}' == 'builtins.property'
    str_0 = '??oaX:A.5R=4'
    r_message_text_0 = module_3.RMessageText(str_0)
    var_0 = r_type_matcher_error_0.add_failed_match(r_type_matcher_error_0, r_type_matcher_error_0, r_message_text_0)
    str_1 = r_type_matcher_error_0.traverse_path_str()
    str_2 = '(r>>_R?X9h/a*~Z7w'
    exception_0 = module_4.Exception()
    var_1 = r_type_matcher_error_0.add_failed_match(str_2, exception_0)
    with pytest.raises(module_1.RIllegalStateError):
        r_type_matcher_error_0.add_failed_match(r_type_matcher_error_0, r_type_matcher_error_0, var_1)

@pytest.mark.xfail(strict=True)
def test_case_8():
    r_type_matcher_error_0 = module_0.RTypeMatcherError()
    assert f'{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__module__}.{type(module_0.RTypeMatcherError.failed_match_tuple_set_view).__qualname__}' == 'builtins.property'
    str_0 = r_type_matcher_error_0.traverse_path_str()
    str_1 = '??oaX:A.5R=4'
    r_message_text_0 = module_3.RMessageText(str_1)
    var_0 = r_type_matcher_error_0.add_failed_match(r_type_matcher_error_0, r_type_matcher_error_0, r_message_text_0)
    str_2 = r_type_matcher_error_0.traverse_path_str()
    exception_0 = module_4.Exception()
    var_1 = r_type_matcher_error_0.add_failed_match(r_type_matcher_error_0, r_type_matcher_error_0, r_message_text_0)
    var_1.add_traverse_path_step(r_type_matcher_error_0, r_message_text_0)