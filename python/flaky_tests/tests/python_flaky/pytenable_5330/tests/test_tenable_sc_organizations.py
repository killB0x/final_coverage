# Automatically generated by Pynguin.
import pytest
import tenable.sc.organizations as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = 'C\\- sfp\t+jmKvd/-'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    organization_a_p_i_0.create(str_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    bytes_0 = b'd\xc5'
    organization_a_p_i_0 = module_0.OrganizationAPI(bytes_0)
    organization_a_p_i_0.edit(organization_a_p_i_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = ']o'
    str_1 = 'cL3,TGkrwu@]Pd$'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    organization_a_p_i_0.list(str_1)

@pytest.mark.xfail(strict=True)
def test_case_3():
    bytes_0 = b'\\\x01\x02\xdb\x93%\x99\xbf\xe7J:\xafP\x1eF\x90'
    organization_a_p_i_0 = module_0.OrganizationAPI(bytes_0)
    organization_a_p_i_0.list()

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = 'u\t97V;YU^!* \x0c\r0'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    organization_a_p_i_0.details(str_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = 'c>)\x0b\x0cx1sH) "J4/4'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    organization_a_p_i_0.accept_risk_rules(str_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = 'uF7\x0cSC#S]s9KOS]PK\r#'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    organization_a_p_i_0.recast_risk_rules(str_0, port=str_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    bool_0 = False
    list_0 = []
    organization_a_p_i_0 = module_0.OrganizationAPI(bool_0)
    organization_a_p_i_0.recast_risk_rules(list_0, port=list_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    int_0 = 1000
    organization_a_p_i_0 = module_0.OrganizationAPI(int_0)
    str_0 = 'user'
    organization_a_p_i_1 = module_0.OrganizationAPI(str_0)
    organization_a_p_i_1.recast_risk_rules(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    none_type_0 = None
    str_0 = '\n.. autoclass:: NessusReportv2\n'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    organization_a_p_i_0.managers_list(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    none_type_0 = None
    none_type_1 = None
    organization_a_p_i_0 = module_0.OrganizationAPI(none_type_1)
    organization_a_p_i_0.manager_details(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = 'o5^+/4::NrIb3^Iv'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    organization_a_p_i_0.manager_delete(organization_a_p_i_0, organization_a_p_i_0)

def test_case_12():
    dict_0 = {}
    organization_a_p_i_0 = module_0.OrganizationAPI(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    bool_0 = False
    organization_a_p_i_0 = module_0.OrganizationAPI(bool_0)
    organization_a_p_i_0.delete(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    bool_0 = False
    dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0}
    none_type_0 = None
    int_0 = 12
    list_0 = [int_0, int_0, int_0, int_0]
    list_1 = [int_0, int_0, list_0, list_0]
    organization_a_p_i_0 = module_0.OrganizationAPI(list_1)
    organization_a_p_i_0.manager_create(bool_0, bool_0, dict_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    int_0 = 2228
    dict_0 = {int_0: int_0, int_0: int_0}
    bool_0 = True
    organization_a_p_i_0 = module_0.OrganizationAPI(bool_0)
    organization_a_p_i_0.manager_edit(dict_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    bytes_0 = b'd\xc5'
    organization_a_p_i_0 = module_0.OrganizationAPI(bytes_0)
    str_0 = 'p{\\<Q1oWk\tP^\x0b!'
    organization_a_p_i_0.managers_list(organization_a_p_i_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_17():
    str_0 = ''
    list_0 = [str_0, str_0]
    organization_a_p_i_0 = module_0.OrganizationAPI(list_0)
    organization_a_p_i_0.accept_risk_rules(list_0, list_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    bool_0 = True
    bool_1 = True
    str_0 = '1OQm9'
    dict_0 = {str_0: bool_0, str_0: bool_1, str_0: bool_1}
    organization_a_p_i_0 = module_0.OrganizationAPI(dict_0)
    organization_a_p_i_0.manager_details(bool_1, dict_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_19():
    bool_0 = True
    list_0 = [bool_0, bool_0, bool_0]
    organization_a_p_i_0 = module_0.OrganizationAPI(bool_0)
    organization_a_p_i_0.accept_risk_rules(bool_0, plugin=list_0)

@pytest.mark.xfail(strict=True)
def test_case_20():
    bytes_0 = b'd\xc5'
    organization_a_p_i_0 = module_0.OrganizationAPI(bytes_0)
    organization_a_p_i_0.details(organization_a_p_i_0, organization_a_p_i_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    str_0 = '2LQD%y6/{.'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    none_type_0 = None
    organization_a_p_i_0.accept_risk_rules(none_type_0, port=str_0)

@pytest.mark.xfail(strict=True)
def test_case_22():
    bytes_0 = b"[\xa5'5\x99\xf4"
    organization_a_p_i_0 = module_0.OrganizationAPI(bytes_0)
    organization_a_p_i_1 = module_0.OrganizationAPI(organization_a_p_i_0)
    organization_a_p_i_0.recast_risk_rules(organization_a_p_i_0, plugin=organization_a_p_i_1)

@pytest.mark.xfail(strict=True)
def test_case_23():
    str_0 = 'uF7\x0cSC#S]s9KOS]PK\r#'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    str_1 = 'H'
    organization_a_p_i_0.details(organization_a_p_i_0, str_1)

@pytest.mark.xfail(strict=True)
def test_case_24():
    str_0 = 'LY!~G'
    bool_0 = False
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    organization_a_p_i_0.manager_delete(bool_0, bool_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_25():
    str_0 = 'vuln_score_low'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    str_1 = 'nesssManageOrs'
    dict_0 = {str_1: organization_a_p_i_0, str_0: str_1}
    organization_a_p_i_0.create(str_1, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    int_0 = 1646
    list_0 = [int_0]
    none_type_0 = None
    organization_a_p_i_0 = module_0.OrganizationAPI(none_type_0)
    organization_a_p_i_0.recast_risk_rules(list_0, list_0)

@pytest.mark.xfail(strict=True)
def test_case_27():
    str_0 = 'vuln_scoreg_low'
    str_1 = '\\L(WZ'
    str_2 = ''
    str_3 = 'country'
    set_0 = {str_2}
    bool_0 = False
    tuple_0 = (set_0, bool_0, bool_0, str_1)
    dict_0 = {str_1: str_0, str_0: str_0, str_2: str_0, str_3: tuple_0}
    none_type_0 = None
    organization_a_p_i_0 = module_0.OrganizationAPI(none_type_0)
    organization_a_p_i_0.create(str_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_28():
    str_0 = 'vuln_scoreg9r_low'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    none_type_0 = None
    str_1 = 'os%\x0bc7k$*#zdt*'
    str_2 = 'pub_sites'
    dict_0 = {str_0: none_type_0, str_1: str_0, str_2: str_0}
    organization_a_p_i_0.edit(none_type_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_29():
    bool_0 = True
    str_0 = 'score'
    str_1 = 'vuln_score_critical'
    dict_0 = {str_0: str_0, str_0: bool_0, str_1: str_0}
    bytes_0 = b'q\xe3\xb3\x9aD\xde9\xcf*\xf6p\xc9p3U\xe4\xed\xf4\xf3\x8c'
    organization_a_p_i_0 = module_0.OrganizationAPI(bytes_0)
    organization_a_p_i_0.edit(bool_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_30():
    bool_0 = False
    list_0 = [bool_0]
    bytes_0 = b'r\xcd\xd8SsO\xe3\xa4\xa2\xb7\\\xb0\xd9\x89e(\x89dT'
    organization_a_p_i_0 = module_0.OrganizationAPI(bytes_0)
    organization_a_p_i_0.accept_risk_rules(list_0, list_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_31():
    str_0 = 'ldap_ids'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_0: organization_a_p_i_0, str_0: organization_a_p_i_0}
    organization_a_p_i_0.create(str_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_32():
    str_0 = 'lad_ids'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    str_1 = ',5(\nF][)(\r'
    str_2 = 'restricted_ips'
    dict_0 = {str_1: str_1, str_1: str_1, str_0: organization_a_p_i_0, str_2: organization_a_p_i_0}
    organization_a_p_i_0.edit(str_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_33():
    str_0 = 'vuln_score_high'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    dict_0 = {str_0: organization_a_p_i_0, str_0: organization_a_p_i_0, str_0: organization_a_p_i_0, str_0: organization_a_p_i_0, str_0: str_0, str_0: organization_a_p_i_0, str_0: str_0, str_0: organization_a_p_i_0, str_0: organization_a_p_i_0, str_0: organization_a_p_i_0, str_0: organization_a_p_i_0, str_0: organization_a_p_i_0, str_0: organization_a_p_i_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: organization_a_p_i_0, str_0: str_0}
    organization_a_p_i_0.create(str_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_34():
    str_0 = 'phone'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    none_type_0 = None
    dict_0 = {str_0: str_0, str_0: none_type_0}
    organization_a_p_i_0.create(none_type_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_35():
    str_0 = 'vuln_score_dbw'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    none_type_0 = None
    str_1 = 'city'
    dict_0 = {str_0: str_0, str_1: str_1, str_1: none_type_0, str_0: none_type_0, str_1: none_type_0}
    organization_a_p_i_0.create(str_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_36():
    str_0 = 'state'
    organization_a_p_i_0 = module_0.OrganizationAPI(str_0)
    str_1 = 'nessManagers'
    dict_0 = {str_1: organization_a_p_i_0, str_0: str_1}
    organization_a_p_i_0.create(str_1, **dict_0)