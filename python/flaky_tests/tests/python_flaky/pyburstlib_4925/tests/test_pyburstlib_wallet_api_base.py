# Automatically generated by Pynguin.
import json.scanner as module_0
import pyburstlib.wallet_api.base as module_1

def test_case_0():
    str_0 = '23456789ABCDEFGHJKLMNPQRSTUVWXYZ'
    module_0.py_make_scanner(str_0)

def test_case_1():
    none_type_0 = None
    base_api_0 = module_1.BaseApi(none_type_0)
    module_1.BaseRequest(*base_api_0)

def test_case_2():
    base_request_0 = module_1.BaseRequest()
    var_0 = base_request_0.as_payload()
    base_api_0 = module_1.BaseApi(base_request_0)
    var_1 = base_request_0.as_payload()
    var_2 = base_request_0.as_payload()
    var_3 = base_request_0.as_payload()
    var_0.readlines()

def test_case_3():
    base_request_0 = module_1.BaseRequest()
    base_request_1 = module_1.BaseRequest()
    var_0 = base_request_0.as_dict()