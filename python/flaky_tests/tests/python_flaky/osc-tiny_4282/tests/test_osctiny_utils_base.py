# Automatically generated by Pynguin.
import pytest
import osctiny.utils.base as module_0

def test_case_0():
    str_0 = '(\x0b\x0c^/\tM6\\=[p^2)E$'
    data_dir_0 = module_0.DataDir(str_0, str_0, str_0)
    assert f'{type(data_dir_0).__module__}.{type(data_dir_0).__qualname__}' == 'osctiny.utils.base.DataDir'
    assert data_dir_0.osc == '(\x0b\x0c^/\tM6\\=[p^2)E$'
    assert data_dir_0.path == '(\x0b\x0c^/\tM6\\=[p^2)E$/.osc'
    assert data_dir_0.project == '(\x0b\x0c^/\tM6\\=[p^2)E$'
    assert data_dir_0.package is None
    assert module_0.DataDir.data_dir == '.osc'
    assert module_0.DataDir.osclib_version_string == '1.0'

@pytest.mark.xfail(strict=True)
def test_case_1():
    bool_0 = True
    extension_base_0 = module_0.ExtensionBase(bool_0)
    extension_base_1 = module_0.ExtensionBase(extension_base_0)
    none_type_0 = None
    module_0.DataDir(extension_base_1, none_type_0, bool_0, overwrite=bool_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = '6>)"}*1yiM'
    data_dir_0 = module_0.DataDir(str_0, str_0, str_0, str_0)
    assert f'{type(data_dir_0).__module__}.{type(data_dir_0).__qualname__}' == 'osctiny.utils.base.DataDir'
    assert data_dir_0.osc == '6>)"}*1yiM'
    assert data_dir_0.path == '6>)"}*1yiM/.osc'
    assert data_dir_0.project == '6>)"}*1yiM'
    assert data_dir_0.package == '6>)"}*1yiM'
    assert module_0.DataDir.data_dir == '.osc'
    assert module_0.DataDir.osclib_version_string == '1.0'
    data_dir_0.write_dir_contents()

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = 'r(]|'
    module_0.DataDir(str_0, str_0, str_0, overwrite=str_0)