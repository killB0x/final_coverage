# Automatically generated by Pynguin.
import ns1.rest.rate_limiting as module_0

def test_case_0():
    var_0 = module_0.rate_limit_strategy_solo()

def test_case_1():
    var_0 = module_0.rate_limit_strategy_solo()
    none_type_0 = None
    var_1 = module_0.default_rate_limit_func(none_type_0)
    dict_0 = {var_0: var_0, var_0: var_0, var_0: var_0, var_0: var_0}
    var_2 = module_0.rate_limit_strategy_concurrent(dict_0)
    var_3 = module_0.rate_limit_strategy_solo()

def test_case_2():
    float_0 = 676.527854
    var_0 = module_0.default_rate_limit_func(float_0)