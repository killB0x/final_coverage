# Automatically generated by Pynguin.
import pytest
import pdfebc_core.config_utils as module_0
import builtins as module_1
import collections as module_2

def test_case_0():
    dict_0 = {}
    var_0 = module_0.create_config(dict_0, dict_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'configparser.ConfigParser'
    assert len(var_0) == 1
    assert module_0.CONFIG_FILENAME == 'config.cnf'
    assert module_0.CONFIG_PATH == '/root/.config/pdfebc/config.cnf'
    assert module_0.EMAIL_SECTION_KEY == 'EMAIL'
    assert module_0.PASSWORD_KEY == 'pass'
    assert module_0.USER_KEY == 'user'
    assert module_0.RECEIVER_KEY == 'receiver'
    assert module_0.DEFAULT_SMTP_SERVER == 'smtp.gmail.com'
    assert module_0.DEFAULT_SMTP_PORT == 587
    assert module_0.SMTP_SERVER_KEY == 'smtp_server'
    assert module_0.SMTP_PORT_KEY == 'smtp_port'
    assert module_0.EMAIL_SECTION_KEYS == {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}
    assert module_0.DEFAULT_SECTION_KEY == 'DEFAULTS'
    assert module_0.GS_DEFAULT_BINARY_KEY == 'gs_binary'
    assert module_0.SRC_DEFAULT_DIR_KEY == 'src'
    assert module_0.OUT_DEFAULT_DIR_KEY == 'out'
    assert module_0.DEFAULT_SECTION_KEYS == {'out', 'gs_binary', 'src'}
    assert module_0.SECTION_KEYS == {'EMAIL': {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}, 'DEFAULTS': {'out', 'gs_binary', 'src'}}
    var_1 = module_0.config_to_string(var_0)
    assert var_1 == '[DEFAULT]'

@pytest.mark.xfail(strict=True)
def test_case_1():
    dict_0 = {}
    module_0.write_config(dict_0)

def test_case_2():
    dict_0 = {}
    var_0 = module_0.create_config(dict_0, dict_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'configparser.ConfigParser'
    assert len(var_0) == 1
    assert module_0.CONFIG_FILENAME == 'config.cnf'
    assert module_0.CONFIG_PATH == '/root/.config/pdfebc/config.cnf'
    assert module_0.EMAIL_SECTION_KEY == 'EMAIL'
    assert module_0.PASSWORD_KEY == 'pass'
    assert module_0.USER_KEY == 'user'
    assert module_0.RECEIVER_KEY == 'receiver'
    assert module_0.DEFAULT_SMTP_SERVER == 'smtp.gmail.com'
    assert module_0.DEFAULT_SMTP_PORT == 587
    assert module_0.SMTP_SERVER_KEY == 'smtp_server'
    assert module_0.SMTP_PORT_KEY == 'smtp_port'
    assert module_0.EMAIL_SECTION_KEYS == {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}
    assert module_0.DEFAULT_SECTION_KEY == 'DEFAULTS'
    assert module_0.GS_DEFAULT_BINARY_KEY == 'gs_binary'
    assert module_0.SRC_DEFAULT_DIR_KEY == 'src'
    assert module_0.OUT_DEFAULT_DIR_KEY == 'out'
    assert module_0.DEFAULT_SECTION_KEYS == {'out', 'gs_binary', 'src'}
    assert module_0.SECTION_KEYS == {'EMAIL': {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}, 'DEFAULTS': {'out', 'gs_binary', 'src'}}
    var_1 = module_0.config_to_string(var_0)
    assert var_1 == '[DEFAULT]'
    exception_0 = module_1.Exception()
    var_2 = module_0.valid_config_exists()
    assert var_2 is False
    module_0.write_config(var_1, var_2)

def test_case_3():
    var_0 = module_0.run_config_diagnostics()
    assert module_0.CONFIG_FILENAME == 'config.cnf'
    assert module_0.CONFIG_PATH == '/root/.config/pdfebc/config.cnf'
    assert module_0.EMAIL_SECTION_KEY == 'EMAIL'
    assert module_0.PASSWORD_KEY == 'pass'
    assert module_0.USER_KEY == 'user'
    assert module_0.RECEIVER_KEY == 'receiver'
    assert module_0.DEFAULT_SMTP_SERVER == 'smtp.gmail.com'
    assert module_0.DEFAULT_SMTP_PORT == 587
    assert module_0.SMTP_SERVER_KEY == 'smtp_server'
    assert module_0.SMTP_PORT_KEY == 'smtp_port'
    assert module_0.EMAIL_SECTION_KEYS == {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}
    assert module_0.DEFAULT_SECTION_KEY == 'DEFAULTS'
    assert module_0.GS_DEFAULT_BINARY_KEY == 'gs_binary'
    assert module_0.SRC_DEFAULT_DIR_KEY == 'src'
    assert module_0.OUT_DEFAULT_DIR_KEY == 'out'
    assert module_0.DEFAULT_SECTION_KEYS == {'out', 'gs_binary', 'src'}
    assert module_0.SECTION_KEYS == {'EMAIL': {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}, 'DEFAULTS': {'out', 'gs_binary', 'src'}}

def test_case_4():
    var_0 = module_0.read_config()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'collections.defaultdict'
    assert len(var_0) == 0
    assert module_0.CONFIG_FILENAME == 'config.cnf'
    assert module_0.CONFIG_PATH == '/root/.config/pdfebc/config.cnf'
    assert module_0.EMAIL_SECTION_KEY == 'EMAIL'
    assert module_0.PASSWORD_KEY == 'pass'
    assert module_0.USER_KEY == 'user'
    assert module_0.RECEIVER_KEY == 'receiver'
    assert module_0.DEFAULT_SMTP_SERVER == 'smtp.gmail.com'
    assert module_0.DEFAULT_SMTP_PORT == 587
    assert module_0.SMTP_SERVER_KEY == 'smtp_server'
    assert module_0.SMTP_PORT_KEY == 'smtp_port'
    assert module_0.EMAIL_SECTION_KEYS == {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}
    assert module_0.DEFAULT_SECTION_KEY == 'DEFAULTS'
    assert module_0.GS_DEFAULT_BINARY_KEY == 'gs_binary'
    assert module_0.SRC_DEFAULT_DIR_KEY == 'src'
    assert module_0.OUT_DEFAULT_DIR_KEY == 'out'
    assert module_0.DEFAULT_SECTION_KEYS == {'out', 'gs_binary', 'src'}
    assert module_0.SECTION_KEYS == {'EMAIL': {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}, 'DEFAULTS': {'out', 'gs_binary', 'src'}}

def test_case_5():
    var_0 = module_0.valid_config_exists()
    assert var_0 is False
    assert module_0.CONFIG_FILENAME == 'config.cnf'
    assert module_0.CONFIG_PATH == '/root/.config/pdfebc/config.cnf'
    assert module_0.EMAIL_SECTION_KEY == 'EMAIL'
    assert module_0.PASSWORD_KEY == 'pass'
    assert module_0.USER_KEY == 'user'
    assert module_0.RECEIVER_KEY == 'receiver'
    assert module_0.DEFAULT_SMTP_SERVER == 'smtp.gmail.com'
    assert module_0.DEFAULT_SMTP_PORT == 587
    assert module_0.SMTP_SERVER_KEY == 'smtp_server'
    assert module_0.SMTP_PORT_KEY == 'smtp_port'
    assert module_0.EMAIL_SECTION_KEYS == {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}
    assert module_0.DEFAULT_SECTION_KEY == 'DEFAULTS'
    assert module_0.GS_DEFAULT_BINARY_KEY == 'gs_binary'
    assert module_0.SRC_DEFAULT_DIR_KEY == 'src'
    assert module_0.OUT_DEFAULT_DIR_KEY == 'out'
    assert module_0.DEFAULT_SECTION_KEYS == {'out', 'gs_binary', 'src'}
    assert module_0.SECTION_KEYS == {'EMAIL': {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}, 'DEFAULTS': {'out', 'gs_binary', 'src'}}

@pytest.mark.xfail(strict=True)
def test_case_6():
    bytes_0 = b'$\xca'
    var_0 = module_0.run_config_diagnostics()
    assert module_0.CONFIG_FILENAME == 'config.cnf'
    assert module_0.CONFIG_PATH == '/root/.config/pdfebc/config.cnf'
    assert module_0.EMAIL_SECTION_KEY == 'EMAIL'
    assert module_0.PASSWORD_KEY == 'pass'
    assert module_0.USER_KEY == 'user'
    assert module_0.RECEIVER_KEY == 'receiver'
    assert module_0.DEFAULT_SMTP_SERVER == 'smtp.gmail.com'
    assert module_0.DEFAULT_SMTP_PORT == 587
    assert module_0.SMTP_SERVER_KEY == 'smtp_server'
    assert module_0.SMTP_PORT_KEY == 'smtp_port'
    assert module_0.EMAIL_SECTION_KEYS == {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}
    assert module_0.DEFAULT_SECTION_KEY == 'DEFAULTS'
    assert module_0.GS_DEFAULT_BINARY_KEY == 'gs_binary'
    assert module_0.SRC_DEFAULT_DIR_KEY == 'src'
    assert module_0.OUT_DEFAULT_DIR_KEY == 'out'
    assert module_0.DEFAULT_SECTION_KEYS == {'out', 'gs_binary', 'src'}
    assert module_0.SECTION_KEYS == {'EMAIL': {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}, 'DEFAULTS': {'out', 'gs_binary', 'src'}}
    module_0.create_config(bytes_0, bytes_0)

def test_case_7():
    var_0 = module_0.run_config_diagnostics()
    assert module_0.CONFIG_FILENAME == 'config.cnf'
    assert module_0.CONFIG_PATH == '/root/.config/pdfebc/config.cnf'
    assert module_0.EMAIL_SECTION_KEY == 'EMAIL'
    assert module_0.PASSWORD_KEY == 'pass'
    assert module_0.USER_KEY == 'user'
    assert module_0.RECEIVER_KEY == 'receiver'
    assert module_0.DEFAULT_SMTP_SERVER == 'smtp.gmail.com'
    assert module_0.DEFAULT_SMTP_PORT == 587
    assert module_0.SMTP_SERVER_KEY == 'smtp_server'
    assert module_0.SMTP_PORT_KEY == 'smtp_port'
    assert module_0.EMAIL_SECTION_KEYS == {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}
    assert module_0.DEFAULT_SECTION_KEY == 'DEFAULTS'
    assert module_0.GS_DEFAULT_BINARY_KEY == 'gs_binary'
    assert module_0.SRC_DEFAULT_DIR_KEY == 'src'
    assert module_0.OUT_DEFAULT_DIR_KEY == 'out'
    assert module_0.DEFAULT_SECTION_KEYS == {'out', 'gs_binary', 'src'}
    assert module_0.SECTION_KEYS == {'EMAIL': {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}, 'DEFAULTS': {'out', 'gs_binary', 'src'}}
    var_1 = var_0.__repr__()
    assert var_1 == "('/root/.config/pdfebc/config.cnf', {'EMAIL', 'DEFAULTS'}, defaultdict(<class 'set'>, {}))"
    bytes_0 = b'Cr\xcf`\x9d\xf5~8\xffG'
    with pytest.raises(ValueError):
        module_0.create_config(bytes_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    bool_0 = True
    dict_0 = {bool_0: bool_0}
    module_0.get_attribute_from_config(dict_0, bool_0, bool_0)

def test_case_9():
    bool_0 = False
    dict_0 = {bool_0: bool_0}
    with pytest.raises(module_0.ConfigurationError):
        module_0.get_attribute_from_config(dict_0, bool_0, bool_0)

def test_case_10():
    defaultdict_0 = module_2.defaultdict()
    var_0 = module_0.create_config(defaultdict_0, defaultdict_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'configparser.ConfigParser'
    assert len(var_0) == 1
    assert module_0.CONFIG_FILENAME == 'config.cnf'
    assert module_0.CONFIG_PATH == '/root/.config/pdfebc/config.cnf'
    assert module_0.EMAIL_SECTION_KEY == 'EMAIL'
    assert module_0.PASSWORD_KEY == 'pass'
    assert module_0.USER_KEY == 'user'
    assert module_0.RECEIVER_KEY == 'receiver'
    assert module_0.DEFAULT_SMTP_SERVER == 'smtp.gmail.com'
    assert module_0.DEFAULT_SMTP_PORT == 587
    assert module_0.SMTP_SERVER_KEY == 'smtp_server'
    assert module_0.SMTP_PORT_KEY == 'smtp_port'
    assert module_0.EMAIL_SECTION_KEYS == {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}
    assert module_0.DEFAULT_SECTION_KEY == 'DEFAULTS'
    assert module_0.GS_DEFAULT_BINARY_KEY == 'gs_binary'
    assert module_0.SRC_DEFAULT_DIR_KEY == 'src'
    assert module_0.OUT_DEFAULT_DIR_KEY == 'out'
    assert module_0.DEFAULT_SECTION_KEYS == {'out', 'gs_binary', 'src'}
    assert module_0.SECTION_KEYS == {'EMAIL': {'smtp_port', 'user', 'pass', 'smtp_server', 'receiver'}, 'DEFAULTS': {'out', 'gs_binary', 'src'}}
    var_1 = module_0.config_to_string(var_0)
    assert var_1 == '[DEFAULT]'
    var_2 = module_0.valid_config_exists(var_1)
    var_3 = module_0.run_config_diagnostics()
    var_4 = module_0.valid_config_exists()
    assert var_4 is False
    with pytest.raises(module_0.ConfigurationError):
        module_0.get_attribute_from_config(defaultdict_0, var_1, var_3)