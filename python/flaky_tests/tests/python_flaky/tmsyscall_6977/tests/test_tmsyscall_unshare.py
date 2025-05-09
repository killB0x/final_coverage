# Automatically generated by Pynguin.
import pytest
import tmsyscall.unshare as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    set_0 = set()
    module_0.unshare(set_0)

def test_case_1():
    bool_0 = True
    with pytest.raises(OSError):
        module_0.unshare(bool_0)

def test_case_2():
    bool_0 = True
    with pytest.raises(OSError):
        module_0.setns(bool_0, bool_0)

def test_case_3():
    bool_0 = False
    var_0 = module_0.unshare(bool_0)
    assert module_0.CLONE_VM == 256
    assert module_0.CLONE_FS == 512
    assert module_0.CLONE_FILES == 1024
    assert module_0.CLONE_SIGHAND == 2048
    assert module_0.CLONE_PTRACE == 8192
    assert module_0.CLONE_VFORK == 16384
    assert module_0.CLONE_PARENT == 32768
    assert module_0.CLONE_THREAD == 65536
    assert module_0.CLONE_NEWNS == 131072
    assert module_0.CLONE_SYSVSEM == 262144
    assert module_0.CLONE_SETTLS == 524288
    assert module_0.CLONE_PARENT_SETTID == 1048576
    assert module_0.CLONE_CHILD_CLEARTID == 2097152
    assert module_0.CLONE_DETACHED == 4194304
    assert module_0.CLONE_UNTRACED == 8388608
    assert module_0.CLONE_CHILD_SETTID == 16777216
    assert module_0.CLONE_NEWUTS == 67108864
    assert module_0.CLONE_NEWIPC == 134217728
    assert module_0.CLONE_NEWUSER == 268435456
    assert module_0.CLONE_NEWPID == 536870912
    assert module_0.CLONE_NEWNET == 1073741824
    assert module_0.CLONE_IO == 2147483648