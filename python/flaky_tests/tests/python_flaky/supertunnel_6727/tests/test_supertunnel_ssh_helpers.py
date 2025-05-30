# Automatically generated by Pynguin.
import pytest
import supertunnel.ssh.helpers as module_0
import click.termui as module_1
import inspect as module_2
import re as module_3
import tokenize as module_4
import gettext as module_5

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    str_0 = '\x0blBP#8b^f'
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor(str_0)
    none_type_1 = s_s_h_flag_0.callback(none_type_0, str_0, none_type_0)
    var_0 = s_s_h_multi_descriptor_0.__get__(none_type_1, s_s_h_flag_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHMultiDescriptor'
    assert var_0.name == '\x0blBP#8b^f'
    assert var_0.default is None
    s_s_h_flag_0.callback(var_0, var_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'dLhTI\tF |W\x0cPbb%$%>)q'
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor(str_0)
    assert f'{type(s_s_h_multi_descriptor_0).__module__}.{type(s_s_h_multi_descriptor_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHMultiDescriptor'
    assert s_s_h_multi_descriptor_0.name == 'dLhTI\tF |W\x0cPbb%$%>)q'
    assert s_s_h_multi_descriptor_0.default is None
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding()
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default is None
    assert s_s_h_port_forwarding_0.mode == 'local'
    s_s_h_port_forwarding_0.__get__(s_s_h_multi_descriptor_0, str_0)

def test_case_2():
    s_s_h_config_base_0 = module_0.SSHConfigBase()
    assert f'{type(s_s_h_config_base_0).__module__}.{type(s_s_h_config_base_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHConfigBase'

def test_case_3():
    s_s_h_option_0 = module_0.SSHOption()
    assert s_s_h_option_0.name is None
    assert s_s_h_option_0.default is None
    var_0 = s_s_h_option_0.option()
    none_type_0 = s_s_h_option_0.__set_name__(var_0, var_0)
    str_0 = var_0.__repr__()
    s_s_h_type_error_0 = module_0.SSHTypeError(none_type_0)
    assert f'{type(s_s_h_type_error_0).__module__}.{type(s_s_h_type_error_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHTypeError'
    assert s_s_h_type_error_0.type is None
    assert s_s_h_type_error_0.value is None

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = 'URE:'
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    none_type_1 = s_s_h_flag_0.__set_name__(none_type_0, none_type_0)
    s_s_h_options_0 = module_0.SSHOptions(none_type_1)
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding(default=str_0)
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default == 'URE:'
    assert s_s_h_port_forwarding_0.mode == 'local'
    s_s_h_type_error_0 = module_0.SSHTypeError(s_s_h_options_0)
    assert f'{type(s_s_h_type_error_0).__module__}.{type(s_s_h_type_error_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHTypeError'
    assert f'{type(s_s_h_type_error_0.type).__module__}.{type(s_s_h_type_error_0.type).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_type_error_0.type) == 0
    assert s_s_h_type_error_0.value is None
    none_type_2 = s_s_h_port_forwarding_0.callback(none_type_0, str_0, none_type_0)
    str_1 = s_s_h_port_forwarding_0.__repr__()
    assert str_1 == "SSHPortForwarding(None, type=<bound method ForwardingPort.parse of <class 'supertunnel.port.ForwardingPort'>>)"
    str_2 = s_s_h_type_error_0.__str__()
    none_type_3 = s_s_h_flag_0.callback(str_0, str_0, none_type_0)
    s_s_h_port_forwarding_0.callback(str_1, s_s_h_port_forwarding_0, str_1)

def test_case_5():
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor()
    assert s_s_h_multi_descriptor_0.name is None
    assert s_s_h_multi_descriptor_0.default is None

@pytest.mark.xfail(strict=True)
def test_case_6():
    s_s_h_option_0 = module_0.SSHOption()
    assert s_s_h_option_0.name is None
    assert s_s_h_option_0.default is None
    none_type_0 = s_s_h_option_0.__set_name__(s_s_h_option_0, s_s_h_option_0)
    assert f'{type(s_s_h_option_0.name).__module__}.{type(s_s_h_option_0.name).__qualname__}' == 'supertunnel.ssh.helpers.SSHOption'
    s_s_h_option_0.__repr__()

@pytest.mark.xfail(strict=True)
def test_case_7():
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor()
    assert s_s_h_multi_descriptor_0.name is None
    assert s_s_h_multi_descriptor_0.default is None
    var_0 = s_s_h_multi_descriptor_0.option()
    var_1 = s_s_h_multi_descriptor_0.option()
    s_s_h_descriptor_base_0 = module_0.SSHDescriptorBase()
    assert s_s_h_descriptor_base_0.name is None
    assert s_s_h_descriptor_base_0.default is None
    s_s_h_descriptor_base_0.__get__(s_s_h_descriptor_base_0, s_s_h_descriptor_base_0)

def test_case_8():
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    str_0 = '\x0blBP#8b^f'
    none_type_1 = s_s_h_flag_0.__set_name__(none_type_0, str_0)
    assert s_s_h_flag_0.name == '\x0blBP#8b^f'

def test_case_9():
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding()
    assert f'{type(s_s_h_port_forwarding_0).__module__}.{type(s_s_h_port_forwarding_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHPortForwarding'
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default is None
    assert s_s_h_port_forwarding_0.mode == 'local'

@pytest.mark.xfail(strict=True)
def test_case_10():
    none_type_0 = None
    s_s_h_options_0 = module_0.SSHOptions(none_type_0)
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    assert f'{type(module_0.SSHOptions.add).__module__}.{type(module_0.SSHOptions.add).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.SSHOptions.options).__module__}.{type(module_0.SSHOptions.options).__qualname__}' == 'builtins.method'
    s_s_h_options_0.__contains__(s_s_h_options_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = 'Vu+gX'
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor(str_0, str_0)
    assert f'{type(s_s_h_multi_descriptor_0).__module__}.{type(s_s_h_multi_descriptor_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHMultiDescriptor'
    assert s_s_h_multi_descriptor_0.name == 'Vu+gX'
    assert s_s_h_multi_descriptor_0.type == 'Vu+gX'
    assert s_s_h_multi_descriptor_0.default is None
    s_s_h_options_0 = module_0.SSHOptions()
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    assert f'{type(module_0.SSHOptions.add).__module__}.{type(module_0.SSHOptions.add).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.SSHOptions.options).__module__}.{type(module_0.SSHOptions.options).__qualname__}' == 'builtins.method'
    s_s_h_options_0.__setitem__(s_s_h_options_0, s_s_h_options_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    str_0 = 'URE:'
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    none_type_1 = s_s_h_flag_0.__set_name__(none_type_0, none_type_0)
    s_s_h_options_0 = module_0.SSHOptions(none_type_1)
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding(default=str_0)
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default == 'URE:'
    assert s_s_h_port_forwarding_0.mode == 'local'
    none_type_2 = s_s_h_port_forwarding_0.callback(none_type_0, str_0, none_type_0)
    str_1 = s_s_h_port_forwarding_0.__repr__()
    assert str_1 == "SSHPortForwarding(None, type=<bound method ForwardingPort.parse of <class 'supertunnel.port.ForwardingPort'>>)"
    none_type_3 = s_s_h_options_0.setdefault(str_1, none_type_0)
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor(none_type_3)
    none_type_4 = s_s_h_flag_0.callback(str_1, str_0, none_type_0)
    s_s_h_flag_0.callback(none_type_4, str_0, str_1)

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = 'URE:'
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding(default=str_0)
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default == 'URE:'
    assert s_s_h_port_forwarding_0.mode == 'local'
    none_type_1 = s_s_h_port_forwarding_0.callback(none_type_0, str_0, none_type_0)
    str_1 = s_s_h_port_forwarding_0.__repr__()
    assert str_1 == "SSHPortForwarding(None, type=<bound method ForwardingPort.parse of <class 'supertunnel.port.ForwardingPort'>>)"
    none_type_2 = s_s_h_flag_0.__set_name__(none_type_0, str_0)
    assert s_s_h_flag_0.name == 'URE:'
    none_type_3 = s_s_h_flag_0.callback(none_type_2, str_0, none_type_0)
    var_0 = s_s_h_flag_0.__get__(none_type_1, none_type_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert var_0.name == 'URE:'
    assert var_0.default is None
    assert var_0.flag is None
    str_2 = '*[]?$\x0b)Ue&V>#l@NUW;E'
    var_0.callback(var_0, str_2, str_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor()
    assert s_s_h_multi_descriptor_0.name is None
    assert s_s_h_multi_descriptor_0.default is None
    var_0 = s_s_h_multi_descriptor_0.option()
    s_s_h_config_base_0 = module_0.SSHConfigBase()
    assert f'{type(s_s_h_config_base_0).__module__}.{type(s_s_h_config_base_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHConfigBase'
    module_1.edit(s_s_h_multi_descriptor_0, require_save=var_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    str_0 = 'URE:'
    none_type_0 = None
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding(default=str_0)
    assert f'{type(s_s_h_port_forwarding_0).__module__}.{type(s_s_h_port_forwarding_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHPortForwarding'
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default == 'URE:'
    assert s_s_h_port_forwarding_0.mode == 'local'
    none_type_1 = s_s_h_port_forwarding_0.callback(none_type_0, str_0, none_type_0)
    s_s_h_port_forwarding_0.callback(str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    s_s_h_option_0 = module_0.SSHOption()
    assert s_s_h_option_0.name is None
    assert s_s_h_option_0.default is None
    var_0 = s_s_h_option_0.option()
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor()
    assert s_s_h_multi_descriptor_0.name is None
    assert s_s_h_multi_descriptor_0.default is None
    str_0 = s_s_h_multi_descriptor_0.__repr__()
    assert str_0 == "SSHMultiDescriptor(None, type=<class 'str'>)"
    str_1 = '0sL~@c6JL4\\6h$R]r]'
    s_s_h_options_0 = module_0.SSHOptions()
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    assert f'{type(module_0.SSHOptions.add).__module__}.{type(module_0.SSHOptions.add).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.SSHOptions.options).__module__}.{type(module_0.SSHOptions.options).__qualname__}' == 'builtins.method'
    s_s_h_options_0.get(str_1)

@pytest.mark.xfail(strict=True)
def test_case_17():
    s_s_h_descriptor_base_0 = module_0.SSHDescriptorBase()
    assert s_s_h_descriptor_base_0.name is None
    assert s_s_h_descriptor_base_0.default is None
    var_0 = module_2.isframe(s_s_h_descriptor_base_0)
    s_s_h_descriptor_base_0.callback(var_0, var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    s_s_h_options_0 = module_0.SSHOptions()
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    assert f'{type(module_0.SSHOptions.add).__module__}.{type(module_0.SSHOptions.add).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.SSHOptions.options).__module__}.{type(module_0.SSHOptions.options).__qualname__}' == 'builtins.method'
    var_0 = s_s_h_options_0.__iter__()
    var_1 = module_3.purge()
    s_s_h_options_0.get(var_1)

@pytest.mark.xfail(strict=True)
def test_case_19():
    str_0 = 'URE:'
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    none_type_1 = s_s_h_flag_0.__set_name__(none_type_0, none_type_0)
    s_s_h_options_0 = module_0.SSHOptions(none_type_1)
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding(default=str_0)
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default == 'URE:'
    assert s_s_h_port_forwarding_0.mode == 'local'
    str_1 = "gz850<mc$1k'/"
    var_0 = s_s_h_options_0.__len__()
    var_1 = s_s_h_options_0.get(str_1, str_1)
    assert var_1 == "gz850<mc$1k'/"
    str_2 = s_s_h_flag_0.__repr__()
    assert str_2 == "SSHFlag(None, type=<class 'bool'>)"
    none_type_2 = s_s_h_port_forwarding_0.callback(none_type_0, str_0, none_type_0)
    none_type_3 = s_s_h_flag_0.__set_name__(none_type_0, var_1)
    assert s_s_h_flag_0.name == "gz850<mc$1k'/"
    var_2 = module_4.maybe()
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor(var_2)
    none_type_4 = s_s_h_flag_0.callback(var_2, str_0, none_type_0)
    s_s_h_flag_0.callback(s_s_h_multi_descriptor_0, str_0, str_2)

@pytest.mark.xfail(strict=True)
def test_case_20():
    s_s_h_option_0 = module_0.SSHOption()
    assert s_s_h_option_0.name is None
    assert s_s_h_option_0.default is None
    s_s_h_config_base_0 = module_0.SSHConfigBase()
    assert f'{type(s_s_h_config_base_0).__module__}.{type(s_s_h_config_base_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHConfigBase'
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor()
    assert s_s_h_multi_descriptor_0.name is None
    assert s_s_h_multi_descriptor_0.default is None
    s_s_h_multi_descriptor_0.__set__(s_s_h_config_base_0, s_s_h_multi_descriptor_0)

def test_case_21():
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor()
    assert s_s_h_multi_descriptor_0.name is None
    assert s_s_h_multi_descriptor_0.default is None
    str_0 = '5zRAu"d+mriM'
    none_type_0 = s_s_h_multi_descriptor_0.__set_name__(s_s_h_multi_descriptor_0, str_0)
    assert s_s_h_multi_descriptor_0.name == '5zRAu"d+mriM'

@pytest.mark.xfail(strict=True)
def test_case_22():
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    var_0 = s_s_h_flag_0.option()
    none_type_1 = s_s_h_flag_0.__set_name__(var_0, none_type_0)
    s_s_h_options_0 = module_0.SSHOptions(none_type_0)
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding(default=none_type_0)
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default is None
    assert s_s_h_port_forwarding_0.mode == 'local'
    str_0 = '\x0blBP#8b^f'
    none_type_2 = s_s_h_port_forwarding_0.callback(none_type_0, str_0, none_type_0)
    var_1 = module_4.maybe()
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor(var_1)
    none_type_3 = s_s_h_multi_descriptor_0.__set_name__(var_1, str_0)
    none_type_4 = s_s_h_flag_0.callback(var_1, var_0, none_type_0)
    var_2 = var_0.__get__(none_type_4, s_s_h_flag_0)
    s_s_h_multi_descriptor_0.callback(var_0, var_2, var_2)

def test_case_23():
    s_s_h_options_0 = module_0.SSHOptions()
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    assert f'{type(module_0.SSHOptions.add).__module__}.{type(module_0.SSHOptions.add).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.SSHOptions.options).__module__}.{type(module_0.SSHOptions.options).__qualname__}' == 'builtins.method'
    s_s_h_options_1 = module_0.SSHOptions()
    assert len(s_s_h_options_1) == 0
    int_0 = s_s_h_options_0.__len__()
    assert int_0 == 0

@pytest.mark.xfail(strict=True)
def test_case_24():
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    none_type_1 = s_s_h_flag_0.__set_name__(none_type_0, none_type_0)
    s_s_h_options_0 = module_0.SSHOptions(none_type_1)
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    str_0 = '@${7zGZ'
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding(default=str_0)
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default == '@${7zGZ'
    assert s_s_h_port_forwarding_0.mode == 'local'
    dict_0 = {str_0: s_s_h_port_forwarding_0, str_0: str_0, str_0: none_type_0}
    none_type_2 = s_s_h_options_0.update(dict_0)
    str_1 = '\x0blBP#8b^f'
    none_type_3 = s_s_h_port_forwarding_0.callback(none_type_0, str_1, none_type_0)
    str_2 = s_s_h_port_forwarding_0.__repr__()
    assert str_2 == "SSHPortForwarding(None, type=<bound method ForwardingPort.parse of <class 'supertunnel.port.ForwardingPort'>>)"
    none_type_4 = s_s_h_flag_0.__set_name__(none_type_0, str_1)
    assert s_s_h_flag_0.name == '\x0blBP#8b^f'
    var_0 = module_4.maybe()
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor(var_0)
    str_3 = '%rPVi8#GG$\x0cC\x0b'
    none_type_5 = s_s_h_flag_0.callback(var_0, var_0, none_type_0)
    var_1 = s_s_h_multi_descriptor_0.__get__(none_type_5, s_s_h_flag_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'supertunnel.ssh.helpers.SSHMultiDescriptor'
    assert var_1.name == '()?'
    assert var_1.default is None
    s_s_h_multi_descriptor_0.callback(str_1, var_1, str_3)

@pytest.mark.xfail(strict=True)
def test_case_25():
    str_0 = 'URE:'
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    none_type_1 = s_s_h_flag_0.__set_name__(none_type_0, none_type_0)
    s_s_h_options_0 = module_0.SSHOptions(none_type_1)
    assert f'{type(s_s_h_options_0).__module__}.{type(s_s_h_options_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHOptions'
    assert len(s_s_h_options_0) == 0
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding(default=str_0)
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default == 'URE:'
    assert s_s_h_port_forwarding_0.mode == 'local'
    none_type_2 = s_s_h_port_forwarding_0.callback(none_type_0, str_0, none_type_0)
    str_1 = s_s_h_port_forwarding_0.__repr__()
    assert str_1 == "SSHPortForwarding(None, type=<bound method ForwardingPort.parse of <class 'supertunnel.port.ForwardingPort'>>)"
    none_type_3 = s_s_h_flag_0.__set_name__(none_type_0, str_1)
    assert s_s_h_flag_0.name == "SSHPortForwarding(None, type=<bound method ForwardingPort.parse of <class 'supertunnel.port.ForwardingPort'>>)"
    none_type_4 = s_s_h_flag_0.callback(none_type_3, str_0, none_type_0)
    var_0 = s_s_h_port_forwarding_0.__get__(none_type_4, s_s_h_flag_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHPortForwarding'
    assert var_0.name is None
    assert var_0.default == 'URE:'
    assert var_0.mode == 'local'
    s_s_h_port_forwarding_0.callback(var_0, var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    str_0 = 'URE:'
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    none_type_1 = module_5.ngettext(s_s_h_flag_0, str_0, str_0)
    module_0.SSHOptions(none_type_1)

@pytest.mark.xfail(strict=True)
def test_case_27():
    s_s_h_port_forwarding_0 = module_0.SSHPortForwarding()
    assert f'{type(s_s_h_port_forwarding_0).__module__}.{type(s_s_h_port_forwarding_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHPortForwarding'
    assert s_s_h_port_forwarding_0.name is None
    assert s_s_h_port_forwarding_0.default is None
    assert s_s_h_port_forwarding_0.mode == 'local'
    str_0 = ''
    dict_0 = {str_0: str_0}
    var_0 = s_s_h_port_forwarding_0.option(**dict_0)
    str_1 = '`9q1m[=V@m'
    s_s_h_port_forwarding_0.callback(str_1, str_1, str_1)

@pytest.mark.xfail(strict=True)
def test_case_28():
    s_s_h_option_0 = module_0.SSHOption()
    assert s_s_h_option_0.name is None
    assert s_s_h_option_0.default is None
    str_0 = '#%O>'
    str_1 = 'wj`^YQ#'
    str_2 = "MJ6V(,'cp"
    list_0 = [str_0, str_1, str_2, str_0]
    tuple_0 = (s_s_h_option_0, list_0)
    s_s_h_option_0.__set__(s_s_h_option_0, tuple_0)

@pytest.mark.xfail(strict=True)
def test_case_29():
    str_0 = 'URE:'
    none_type_0 = None
    s_s_h_flag_0 = module_0.SSHFlag(none_type_0)
    assert f'{type(s_s_h_flag_0).__module__}.{type(s_s_h_flag_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHFlag'
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag is None
    none_type_1 = s_s_h_flag_0.__set_name__(none_type_0, none_type_0)
    s_s_h_flag_0.__set__(str_0, none_type_1)

@pytest.mark.xfail(strict=True)
def test_case_30():
    s_s_h_config_base_0 = module_0.SSHConfigBase()
    assert f'{type(s_s_h_config_base_0).__module__}.{type(s_s_h_config_base_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHConfigBase'
    str_0 = 'o6H]*+?A\x0co:.'
    s_s_h_multi_descriptor_0 = module_0.SSHMultiDescriptor(str_0)
    assert f'{type(s_s_h_multi_descriptor_0).__module__}.{type(s_s_h_multi_descriptor_0).__qualname__}' == 'supertunnel.ssh.helpers.SSHMultiDescriptor'
    assert s_s_h_multi_descriptor_0.name == 'o6H]*+?A\x0co:.'
    assert s_s_h_multi_descriptor_0.default is None
    list_0 = s_s_h_multi_descriptor_0.values(s_s_h_config_base_0)
    s_s_h_flag_0 = module_0.SSHFlag(str_0)
    assert s_s_h_flag_0.name is None
    assert s_s_h_flag_0.default is None
    assert s_s_h_flag_0.flag == 'o6H]*+?A\x0co:.'
    str_1 = s_s_h_flag_0.__repr__()
    assert str_1 == "SSHFlag(None, type=<class 'bool'>)"
    s_s_h_multi_descriptor_0.__add__(str_0)