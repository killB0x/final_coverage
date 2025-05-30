# Automatically generated by Pynguin.
import pytest
import tenable.sc.scans as module_0
import tenable.errors as module_1
import tenable.base as module_2
import tenable.utils as module_3

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = 'R&XzVuE'
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    scan_a_p_i_0.edit(str_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    none_type_0 = None
    scan_a_p_i_0 = module_0.ScanAPI(none_type_0)
    scan_a_p_i_0.create(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    bytes_0 = b'\xbc\x8a\xbf\xe30\x91'
    scan_a_p_i_0 = module_0.ScanAPI(bytes_0)
    scan_a_p_i_0.create(bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    none_type_0 = None
    scan_a_p_i_0 = module_0.ScanAPI(none_type_0)
    var_0 = module_1.UnexpectedValueError(scan_a_p_i_0)
    scan_a_p_i_0.list()

@pytest.mark.xfail(strict=True)
def test_case_4():
    bool_0 = False
    bytes_0 = b'\xbc\xcc\tS\xcb\x88\xd7\xaa\xe1ve'
    scan_a_p_i_0 = module_0.ScanAPI(bool_0)
    scan_a_p_i_0.details(bool_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    dict_0 = {}
    int_0 = -1024
    scan_a_p_i_0 = module_0.ScanAPI(int_0)
    scan_a_p_i_0.details(dict_0, dict_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = 'C#S]s9KOS]PK\r'
    none_type_0 = None
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    scan_a_p_i_0.details(none_type_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    bytes_0 = b'\x93Y\x89\x90\x99\x9a7 t\xfa\xe55\xf4\xac<'
    scan_a_p_i_0 = module_0.ScanAPI(bytes_0)
    scan_a_p_i_0.launch(bytes_0)

def test_case_8():
    set_0 = set()
    scan_a_p_i_0 = module_0.ScanAPI(set_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    bool_0 = True
    scan_a_p_i_0 = module_0.ScanAPI(bool_0)
    scan_a_p_i_0.delete(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    bool_0 = False
    scan_a_p_i_0 = module_0.ScanAPI(bool_0)
    scan_a_p_i_0.copy(bool_0, bool_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = '\tz`I%.ilY'
    dict_0 = {}
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    a_p_i_endpoint_0 = module_2.APIEndpoint(scan_a_p_i_0)
    var_0 = module_3.dict_merge(scan_a_p_i_0, dict_0)
    var_0.launch(str_0, scan_a_p_i_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    str_0 = 'R&XzVuE'
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    str_1 = 'x|TQz@['
    list_0 = [str_1]
    scan_a_p_i_0.launch(str_0, str_1, list_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    none_type_0 = None
    scan_a_p_i_0 = module_0.ScanAPI(none_type_0)
    str_0 = 'epzYo-'
    scan_a_p_i_0.list(str_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    str_0 = 'host_tracking'
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    none_type_0 = None
    str_1 = '[oit/'
    dict_0 = {str_0: scan_a_p_i_0, str_1: str_0, str_1: str_0, str_0: str_1, str_0: scan_a_p_i_0}
    scan_a_p_i_0.create(str_0, none_type_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    bool_0 = True
    str_0 = '2j'
    str_1 = 'description'
    dict_0 = {str_0: bool_0, str_1: str_0}
    scan_a_p_i_0 = module_0.ScanAPI(bool_0)
    scan_a_p_i_0.edit(bool_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    str_0 = '(l[aun'
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    none_type_0 = None
    str_1 = 'asset_lists'
    dict_0 = {str_0: none_type_0, str_0: str_1, str_0: scan_a_p_i_0, str_0: str_0, str_0: str_1, str_1: scan_a_p_i_0, str_0: none_type_0, str_0: str_0, str_0: scan_a_p_i_0}
    scan_a_p_i_0.create(none_type_0, none_type_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_17():
    str_0 = 'scan_zone'
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    none_type_0 = None
    str_1 = 'report?'
    dict_0 = {str_0: none_type_0, str_0: str_1, str_0: scan_a_p_i_0, str_0: str_0, str_0: str_1, str_1: scan_a_p_i_0, str_0: none_type_0, str_0: str_0, str_0: scan_a_p_i_0}
    scan_a_p_i_0.create(str_0, none_type_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    str_0 = 'targets'
    none_type_0 = None
    dict_0 = {str_0: str_0, str_0: none_type_0, str_0: none_type_0, str_0: none_type_0, str_0: none_type_0, str_0: str_0, str_0: none_type_0}
    scan_a_p_i_0 = module_0.ScanAPI(none_type_0)
    scan_a_p_i_0.create(none_type_0, none_type_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_19():
    str_0 = 'max_time'
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    float_0 = -4020.1598746463847
    none_type_0 = None
    dict_0 = {str_0: scan_a_p_i_0, str_0: str_0, str_0: float_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: none_type_0, str_0: scan_a_p_i_0, str_0: none_type_0}
    scan_a_p_i_0.create(str_0, none_type_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_20():
    str_0 = 'scn_ne'
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    none_type_0 = None
    str_1 = 'reprt?'
    str_2 = '$)hQ/'
    str_3 = 'email_launch'
    dict_0 = {str_3: scan_a_p_i_0, str_2: str_0, str_2: str_2, str_3: str_3}
    dict_1 = {str_0: none_type_0, str_0: str_1, str_0: scan_a_p_i_0, str_0: str_0, str_3: dict_0, str_0: str_1, str_1: scan_a_p_i_0, str_0: none_type_0, str_3: none_type_0, str_0: str_0, str_0: scan_a_p_i_0}
    scan_a_p_i_0.create(str_0, none_type_0, **dict_1)

@pytest.mark.xfail(strict=True)
def test_case_21():
    str_0 = 'cd_ne'
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    none_type_0 = None
    str_1 = 'plugin_id'
    dict_0 = {str_1: scan_a_p_i_0, str_0: str_0, str_0: str_0, str_1: str_1}
    scan_a_p_i_0.create(str_0, none_type_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_22():
    str_0 = 'schedule'
    scan_a_p_i_0 = module_0.ScanAPI(str_0)
    none_type_0 = None
    str_1 = 'reprt?'
    str_2 = 'plugi_id'
    dict_0 = {str_1: none_type_0, str_2: scan_a_p_i_0, str_2: str_0, str_2: str_2, str_2: str_2}
    dict_1 = {str_0: none_type_0, str_0: str_1, str_0: scan_a_p_i_0, str_0: str_0, str_2: dict_0, str_0: str_1, str_1: scan_a_p_i_0, str_0: str_0, str_0: scan_a_p_i_0}
    scan_a_p_i_0.create(str_0, none_type_0, **dict_1)