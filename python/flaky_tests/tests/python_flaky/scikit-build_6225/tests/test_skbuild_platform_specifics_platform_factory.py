# Automatically generated by Pynguin.
import skbuild.platform_specifics.platform_factory as module_0

def test_case_0():
    var_0 = module_0.get_platform()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'skbuild.platform_specifics.linux.LinuxPlatform'