# Automatically generated by Pynguin.
import securenative.config.configuration_manager as module_0

def test_case_0():
    configuration_manager_0 = module_0.ConfigurationManager()
    assert module_0.ConfigurationManager.DEFAULT_CONFIG_FILE == 'securenative.ini'
    assert module_0.ConfigurationManager.CUSTOM_CONFIG_FILE_ENV_NAME == 'SECURENATIVE_COMFIG_FILE'
    assert f'{type(module_0.ConfigurationManager.read_resource_file).__module__}.{type(module_0.ConfigurationManager.read_resource_file).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.ConfigurationManager.load_config).__module__}.{type(module_0.ConfigurationManager.load_config).__qualname__}' == 'builtins.method'

def test_case_1():
    configuration_manager_0 = module_0.ConfigurationManager()
    assert module_0.ConfigurationManager.DEFAULT_CONFIG_FILE == 'securenative.ini'
    assert module_0.ConfigurationManager.CUSTOM_CONFIG_FILE_ENV_NAME == 'SECURENATIVE_COMFIG_FILE'
    assert f'{type(module_0.ConfigurationManager.read_resource_file).__module__}.{type(module_0.ConfigurationManager.read_resource_file).__qualname__}' == 'builtins.method'
    assert f'{type(module_0.ConfigurationManager.load_config).__module__}.{type(module_0.ConfigurationManager.load_config).__qualname__}' == 'builtins.method'
    var_0 = configuration_manager_0.config_builder()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'securenative.config.configuration_builder.ConfigurationBuilder'
    assert var_0.api_key is None
    assert var_0.api_url == 'https://api.securenative.com/collector/api/v1'
    assert var_0.interval == 1000
    assert var_0.max_events == 1000
    assert var_0.timeout == 1500
    assert var_0.auto_send is True
    assert var_0.disable is False
    assert var_0.log_level == 'CRITICAL'
    assert var_0.fail_over_strategy == 'fail-open'
    configuration_manager_1 = module_0.ConfigurationManager()