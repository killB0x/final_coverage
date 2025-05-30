# Automatically generated by Pynguin.
import pytest
import atlasclient.utils as module_0
import binascii as module_1
import base64 as module_2

def test_case_0():
    bool_0 = True
    with pytest.raises(ValueError):
        module_0.version_tuple(bool_0)

def test_case_1():
    str_0 = '7SO+l5[2a8nbY'
    var_0 = module_0.version_str(str_0)
    assert var_0 == '7SO+l5[2a8nbY'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_2():
    error_0 = module_1.Error()
    with pytest.raises(ValueError):
        module_0.version_str(error_0)

def test_case_3():
    bool_0 = True
    var_0 = module_0.make_table_qualified_name(bool_0, db=bool_0)
    assert var_0 == 'True.True'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_4():
    bool_0 = True
    var_0 = module_0.make_table_qualified_name(bool_0)
    assert var_0 is True
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = '/M3d)tb9sW'
    module_0.extract_entities(str_0)

def test_case_6():
    str_0 = ' \raH[Qn'
    var_0 = module_0.normalize_underscore_case(str_0)
    assert var_0 == ' \rah[qn'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

@pytest.mark.xfail(strict=True)
def test_case_7():
    bool_0 = True
    module_0.normalize_camel_case(bool_0)

def test_case_8():
    int_0 = -951
    var_0 = module_0.generate_http_basic_token(int_0, int_0)
    assert var_0 == 'LTk1MTotOTUx'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

@pytest.mark.xfail(strict=True)
def test_case_9():
    none_type_0 = None
    module_0.parse_table_qualified_name(none_type_0)

def test_case_10():
    str_0 = ' \ra[n'
    with pytest.raises(ValueError):
        module_0.version_tuple(str_0)

def test_case_11():
    str_0 = 'Wj[ou-\t'
    var_0 = module_0.make_table_qualified_name(str_0, str_0)
    assert var_0 == 'Wj[ou-\t@Wj[ou-\t'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_12():
    str_0 = 'SO+l5[2a8nbY'
    with pytest.raises(ValueError):
        module_0.generate_base_url(str_0, port=str_0)

def test_case_13():
    str_0 = 'jCou-\t'
    var_0 = module_0.generate_base_url(str_0)
    assert var_0 == 'http://jCou-\t:80'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_14():
    str_0 = 'vU6>'
    var_0 = module_0.normalize_camel_case(str_0)
    assert var_0 == 'V U6>'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_15():
    str_0 = 'k@+l5[2a8nb"'
    with pytest.raises(ValueError):
        module_0.generate_base_url(str_0, str_0)

def test_case_16():
    str_0 = ' \raH[Qyn'
    var_0 = module_0.parse_table_qualified_name(str_0)
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_17():
    str_0 = 'http://Adding a new resource\rto the collection :80'
    var_0 = module_0.generate_base_url(str_0, port=str_0)
    assert var_0 == 'http://Adding a new resource\rto the collection :80'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_18():
    str_0 = 'HTTP request failed for %s %s: %s %s: %s'
    with pytest.raises(ValueError):
        module_0.generate_base_url(str_0, port=str_0)

def test_case_19():
    str_0 = 'fE(S@y*Ggc2g-A\t*RS)'
    var_0 = module_0.parse_table_qualified_name(str_0)
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_20():
    str_0 = 'w{7(]"\x0b.M6i }_8Fd7-'
    var_0 = module_0.parse_table_qualified_name(str_0)
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_21():
    str_0 = ' \rWjaH[Qn'
    var_0 = module_0.make_table_qualified_name(str_0, str_0, str_0)
    assert var_0 == ' \rWjaH[Qn. \rWjaH[Qn@ \rWjaH[Qn'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'
    var_1 = module_0.generate_http_basic_token(var_0, var_0)
    assert var_1 == 'IA1XamFIW1FuLiANV2phSFtRbkAgDVdqYUhbUW46IA1XamFIW1FuLiANV2phSFtRbkAgDVdqYUhbUW4='
    var_2 = module_0.version_str(var_0)
    assert var_2 == ' \rWjaH[Qn. \rWjaH[Qn@ \rWjaH[Qn'
    var_3 = module_0.parse_table_qualified_name(var_2)
    float_0 = 1752.9988
    with pytest.raises(ValueError):
        module_0.generate_base_url(var_0, float_0)

def test_case_22():
    str_0 = 'w{~(]"\x0b.M6i }_8Fd7-'
    var_0 = module_0.normalize_underscore_case(str_0)
    assert var_0 == 'W{~(]"\x0b.m6i } 8fd7-'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_23():
    tuple_0 = ()
    var_0 = module_0.version_tuple(tuple_0)
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

@pytest.mark.xfail(strict=True)
def test_case_24():
    tuple_0 = ()
    var_0 = module_0.version_str(tuple_0)
    assert var_0 == ''
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'
    complex_0 = (-764.2+957.68j)
    module_2.b64encode(complex_0)

def test_case_25():
    list_0 = []
    var_0 = module_0.extract_entities(list_0)
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'

def test_case_26():
    str_0 = 'Wj[ou-\t'
    var_0 = module_0.make_table_qualified_name(str_0, str_0, str_0)
    assert var_0 == 'Wj[ou-\t.Wj[ou-\t@Wj[ou-\t'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'
    var_1 = module_0.parse_table_qualified_name(var_0)
    var_2 = module_0.normalize_camel_case(var_0)
    assert var_2 == 'Wj[ou-\t.Wj[ou-\t@Wj[ou-\t'
    var_3 = module_0.generate_base_url(str_0)
    assert var_3 == 'http://Wj[ou-\t:80'
    var_4 = module_0.normalize_camel_case(var_3)
    assert var_4 == 'Http://Wj[ou-\t:80'
    tuple_0 = (var_4,)
    with pytest.raises(ValueError):
        module_0.version_str(tuple_0)

@pytest.mark.xfail(strict=True)
def test_case_27():
    str_0 = 'default'
    var_0 = module_0.make_table_qualified_name(str_0, str_0, str_0)
    assert var_0 == 'default'
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'
    none_type_0 = None
    module_0.parse_table_qualified_name(none_type_0)

def test_case_28():
    str_0 = '8'
    var_0 = module_0.version_tuple(str_0)
    assert module_0.DEFAULT_PORTS == {'http': 80, 'https': 443}
    assert module_0.DEFAULT_DB_CLUSTER == 'default'