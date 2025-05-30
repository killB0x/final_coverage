# Automatically generated by Pynguin.
import pytest
import rambutan3.check_args.file.RFilePathMatcher as module_0
import rambutan3.op_sys.RFileTypeEnum as module_1
import rambutan3.op_sys.RFileAccessEnum as module_2
import rambutan3.check_args.RCheckArgsError as module_3

@pytest.mark.xfail(strict=True)
def test_case_0():
    int_0 = 2209
    module_0.RFilePathMatcher(int_0)

def test_case_1():
    r_file_type_enum_0 = module_1.RFileTypeEnum.NAMED_PIPE
    r_file_access_enum_0 = module_2.RFileAccessEnum.READ
    list_0 = [r_file_access_enum_0]
    r_file_path_matcher_0 = module_0.RFilePathMatcher(r_file_type_enum_0, *list_0)
    assert f'{type(r_file_path_matcher_0).__module__}.{type(r_file_path_matcher_0).__qualname__}' == 'rambutan3.check_args.file.RFilePathMatcher.RFilePathMatcher'
    var_0 = r_file_path_matcher_0.__str__()
    assert var_0 == 'path to file of type NAMED_PIPE with modes: READ'
    bool_0 = r_file_path_matcher_0.matches(var_0)
    assert bool_0 is False

@pytest.mark.xfail(strict=True)
def test_case_2():
    r_file_type_enum_0 = module_1.RFileTypeEnum.REGULAR_FILE
    r_file_access_enum_0 = module_2.RFileAccessEnum.EXECUTE
    list_0 = [r_file_access_enum_0]
    r_file_path_matcher_0 = module_0.RFilePathMatcher(r_file_type_enum_0, *list_0)
    assert f'{type(r_file_path_matcher_0).__module__}.{type(r_file_path_matcher_0).__qualname__}' == 'rambutan3.check_args.file.RFilePathMatcher.RFilePathMatcher'
    bool_0 = r_file_path_matcher_0.__eq__(r_file_access_enum_0)
    assert bool_0 is False
    module_0.RFilePathMatcher(r_file_type_enum_0)

def test_case_3():
    r_file_type_enum_0 = module_1.RFileTypeEnum.NAMED_PIPE
    r_file_access_enum_0 = module_2.RFileAccessEnum.EXECUTE
    list_0 = [r_file_access_enum_0]
    r_file_path_matcher_0 = module_0.RFilePathMatcher(r_file_type_enum_0, *list_0)
    assert f'{type(r_file_path_matcher_0).__module__}.{type(r_file_path_matcher_0).__qualname__}' == 'rambutan3.check_args.file.RFilePathMatcher.RFilePathMatcher'
    str_0 = '//'
    with pytest.raises(module_3.RCheckArgsError):
        r_file_path_matcher_0.check_arg(str_0, str_0)

def test_case_4():
    r_file_type_enum_0 = module_1.RFileTypeEnum.REGULAR_FILE
    r_file_access_enum_0 = module_2.RFileAccessEnum.EXECUTE
    list_0 = [r_file_access_enum_0]
    r_file_path_matcher_0 = module_0.RFilePathMatcher(r_file_type_enum_0, *list_0)
    assert f'{type(r_file_path_matcher_0).__module__}.{type(r_file_path_matcher_0).__qualname__}' == 'rambutan3.check_args.file.RFilePathMatcher.RFilePathMatcher'
    bool_0 = r_file_path_matcher_0.__eq__(r_file_path_matcher_0)
    assert bool_0 is True

@pytest.mark.xfail(strict=True)
def test_case_5():
    r_file_type_enum_0 = module_1.RFileTypeEnum.REGULAR_FILE
    r_file_access_enum_0 = module_2.RFileAccessEnum.EXECUTE
    list_0 = [r_file_access_enum_0]
    r_file_path_matcher_0 = module_0.RFilePathMatcher(r_file_type_enum_0, *list_0)
    assert f'{type(r_file_path_matcher_0).__module__}.{type(r_file_path_matcher_0).__qualname__}' == 'rambutan3.check_args.file.RFilePathMatcher.RFilePathMatcher'
    r_file_path_matcher_0.check_arg(r_file_type_enum_0, r_file_access_enum_0)

def test_case_6():
    r_file_type_enum_0 = module_1.RFileTypeEnum.NAMED_PIPE
    r_file_access_enum_0 = module_2.RFileAccessEnum.EXECUTE
    list_0 = [r_file_access_enum_0]
    r_file_path_matcher_0 = module_0.RFilePathMatcher(r_file_type_enum_0, *list_0)
    assert f'{type(r_file_path_matcher_0).__module__}.{type(r_file_path_matcher_0).__qualname__}' == 'rambutan3.check_args.file.RFilePathMatcher.RFilePathMatcher'
    str_0 = '#'
    with pytest.raises(module_3.RCheckArgsError):
        r_file_path_matcher_0.check_arg(str_0, str_0)

def test_case_7():
    r_file_type_enum_0 = module_1.RFileTypeEnum.DIRECTORY
    r_file_access_enum_0 = module_2.RFileAccessEnum.EXECUTE
    list_0 = [r_file_access_enum_0]
    r_file_path_matcher_0 = module_0.RFilePathMatcher(r_file_type_enum_0, *list_0)
    assert f'{type(r_file_path_matcher_0).__module__}.{type(r_file_path_matcher_0).__qualname__}' == 'rambutan3.check_args.file.RFilePathMatcher.RFilePathMatcher'
    str_0 = '//'
    bool_0 = r_file_path_matcher_0.matches(str_0, str_0)
    assert bool_0 is True