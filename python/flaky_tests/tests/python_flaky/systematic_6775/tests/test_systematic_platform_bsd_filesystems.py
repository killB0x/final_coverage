# Automatically generated by Pynguin.
import pytest
import systematic.platform.bsd.filesystems as module_0
import systematic.classes as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    module_0.load_mountpoints()

def test_case_1():
    none_type_0 = None
    float_0 = 0.1
    b_s_d_mount_point_0 = module_0.BSDMountPoint(none_type_0, none_type_0, none_type_0, float_0)
    assert f'{type(b_s_d_mount_point_0.log).__module__}.{type(b_s_d_mount_point_0.log).__qualname__}' == 'logging.Logger'
    assert b_s_d_mount_point_0.mountpoints is None
    assert b_s_d_mount_point_0.device is None
    assert b_s_d_mount_point_0.mountpoint is None
    assert b_s_d_mount_point_0.filesystem == pytest.approx(0.1, abs=0.01, rel=0.01)
    assert f'{type(b_s_d_mount_point_0.flags).__module__}.{type(b_s_d_mount_point_0.flags).__qualname__}' == 'systematic.classes.FileSystemFlags'
    assert len(b_s_d_mount_point_0.flags) == 0
    assert b_s_d_mount_point_0.usage == {}
    assert module_0.PSEUDO_FILESYSTEMS == ['procfs', 'devfs', 'fdescfs']
    assert f'{type(module_0.BSDMountPoint.is_virtual).__module__}.{type(module_0.BSDMountPoint.is_virtual).__qualname__}' == 'builtins.property'

def test_case_2():
    bool_0 = False
    b_s_d_mount_point_0 = module_0.BSDMountPoint(bool_0, bool_0, bool_0, bool_0)
    assert f'{type(b_s_d_mount_point_0.log).__module__}.{type(b_s_d_mount_point_0.log).__qualname__}' == 'logging.Logger'
    assert b_s_d_mount_point_0.mountpoints is False
    assert b_s_d_mount_point_0.device is False
    assert b_s_d_mount_point_0.mountpoint is False
    assert b_s_d_mount_point_0.filesystem is False
    assert f'{type(b_s_d_mount_point_0.flags).__module__}.{type(b_s_d_mount_point_0.flags).__qualname__}' == 'systematic.classes.FileSystemFlags'
    assert len(b_s_d_mount_point_0.flags) == 0
    assert b_s_d_mount_point_0.usage == {}
    assert module_0.PSEUDO_FILESYSTEMS == ['procfs', 'devfs', 'fdescfs']
    assert f'{type(module_0.BSDMountPoint.is_virtual).__module__}.{type(module_0.BSDMountPoint.is_virtual).__qualname__}' == 'builtins.property'
    with pytest.raises(module_1.FileSystemError):
        b_s_d_mount_point_0.update_usage()

@pytest.mark.xfail(strict=True)
def test_case_3():
    bool_0 = False
    b_s_d_mount_point_0 = module_0.BSDMountPoint(bool_0, bool_0, bool_0, bool_0)
    assert f'{type(b_s_d_mount_point_0.log).__module__}.{type(b_s_d_mount_point_0.log).__qualname__}' == 'logging.Logger'
    assert b_s_d_mount_point_0.mountpoints is False
    assert b_s_d_mount_point_0.device is False
    assert b_s_d_mount_point_0.mountpoint is False
    assert b_s_d_mount_point_0.filesystem is False
    assert f'{type(b_s_d_mount_point_0.flags).__module__}.{type(b_s_d_mount_point_0.flags).__qualname__}' == 'systematic.classes.FileSystemFlags'
    assert len(b_s_d_mount_point_0.flags) == 0
    assert b_s_d_mount_point_0.usage == {}
    assert module_0.PSEUDO_FILESYSTEMS == ['procfs', 'devfs', 'fdescfs']
    assert f'{type(module_0.BSDMountPoint.is_virtual).__module__}.{type(module_0.BSDMountPoint.is_virtual).__qualname__}' == 'builtins.property'
    b_s_d_mount_point_0.update_usage(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = 'd*fa'
    b_s_d_mount_point_0 = module_0.BSDMountPoint(str_0, str_0, str_0, str_0)
    assert f'{type(b_s_d_mount_point_0.log).__module__}.{type(b_s_d_mount_point_0.log).__qualname__}' == 'logging.Logger'
    assert b_s_d_mount_point_0.mountpoints == 'd*fa'
    assert b_s_d_mount_point_0.device == 'd*fa'
    assert b_s_d_mount_point_0.mountpoint == 'd*fa'
    assert b_s_d_mount_point_0.filesystem == 'd*fa'
    assert f'{type(b_s_d_mount_point_0.flags).__module__}.{type(b_s_d_mount_point_0.flags).__qualname__}' == 'systematic.classes.FileSystemFlags'
    assert len(b_s_d_mount_point_0.flags) == 0
    assert b_s_d_mount_point_0.usage == {}
    assert module_0.PSEUDO_FILESYSTEMS == ['procfs', 'devfs', 'fdescfs']
    assert f'{type(module_0.BSDMountPoint.is_virtual).__module__}.{type(module_0.BSDMountPoint.is_virtual).__qualname__}' == 'builtins.property'
    b_s_d_mount_point_0.update_usage(str_0)

def test_case_5():
    bool_0 = True
    str_0 = 'devfs'
    b_s_d_mount_point_0 = module_0.BSDMountPoint(str_0, bool_0, bool_0, str_0)
    assert f'{type(b_s_d_mount_point_0.log).__module__}.{type(b_s_d_mount_point_0.log).__qualname__}' == 'logging.Logger'
    assert b_s_d_mount_point_0.mountpoints == 'devfs'
    assert b_s_d_mount_point_0.device is True
    assert b_s_d_mount_point_0.mountpoint is True
    assert b_s_d_mount_point_0.filesystem == 'devfs'
    assert f'{type(b_s_d_mount_point_0.flags).__module__}.{type(b_s_d_mount_point_0.flags).__qualname__}' == 'systematic.classes.FileSystemFlags'
    assert len(b_s_d_mount_point_0.flags) == 0
    assert b_s_d_mount_point_0.usage == {}
    assert module_0.PSEUDO_FILESYSTEMS == ['procfs', 'devfs', 'fdescfs']
    assert f'{type(module_0.BSDMountPoint.is_virtual).__module__}.{type(module_0.BSDMountPoint.is_virtual).__qualname__}' == 'builtins.property'
    var_0 = b_s_d_mount_point_0.update_usage()
    var_1 = b_s_d_mount_point_0.update_usage()