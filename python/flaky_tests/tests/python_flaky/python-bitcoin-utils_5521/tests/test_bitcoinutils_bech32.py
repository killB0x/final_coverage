# Automatically generated by Pynguin.
import pytest
import bitcoinutils.bech32 as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = 'c%B{\tX;TEP9q=[\t\\!G;'
    module_0.bech32_polymod(str_0)

def test_case_1():
    bytes_0 = b'\x16^N\x9aL\r\nn\x88'
    var_0 = module_0.bech32_polymod(bytes_0)
    assert var_0 == 726599139
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

def test_case_2():
    str_0 = 'c%B{;TEP9H=[\t\\!G;'
    var_0 = module_0.bech32_hrp_expand(str_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

def test_case_3():
    bool_0 = False
    bytes_0 = b'=kH\xb9\xd3\x95\x1f\x9c\xb0M\r\x1b\x17\x8ez\xc0h'
    str_0 = 'pnop1q2ckgn89h1pjr6lppqcwes20'
    var_0 = module_0.encode(str_0, bool_0, bytes_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

def test_case_4():
    str_0 = 'c%B{;Tf.P9H([\t\\!G;'
    var_0 = module_0.bech32_decode(str_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

def test_case_5():
    str_0 = 'Ur\\\\ux"kw/w'
    var_0 = module_0.decode(str_0, str_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = 'Data too large. Cannot push into script'
    module_0.encode(str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    bytes_0 = b'\x16^N*L\r\n\x18\x88'
    module_0.encode(bytes_0, bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    none_type_0 = None
    module_0.bech32_decode(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    int_0 = 271
    module_0.bech32_verify_checksum(int_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    str_0 = 'c%B{;TEj9H=[\t\\!G;'
    module_0.bech32_encode(str_0, str_0)

def test_case_11():
    str_0 = 'V'
    var_0 = module_0.decode(str_0, str_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

def test_case_12():
    str_0 = ''
    var_0 = module_0.decode(str_0, str_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

def test_case_13():
    bool_0 = False
    bytes_0 = b'.\xc9\xb2\x81\xed<\xfd\xd1\x05k|*\xcf\x9f\x17k\xecnv8'
    str_0 = '&3yv^+h*jv,?#1qddytn5u4r7wtp3gdrvtcarwqdqwhyeht'
    var_0 = module_0.encode(str_0, bool_0, bytes_0)
    assert var_0 == '&3yv^+h*jv,?#1qddytn5u4r7wtp3gdrvtcarwqdqwhyeht1q9mym9q0d8n7azptt0s4vl8chd0kxua3c48kez9'
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

@pytest.mark.xfail(strict=True)
def test_case_14():
    float_0 = -1238.2204
    bool_0 = True
    int_0 = 456
    float_1 = -2764.31272
    dict_0 = {bool_0: float_0, float_0: int_0, float_1: float_0}
    module_0.encode(float_0, bool_0, dict_0)

def test_case_15():
    bool_0 = False
    bytes_0 = b'.\xc9\xb2\x81\xed<\xfd\xd1\x05k|*\xcf\x9f\x17k\xecnv'
    str_0 = '&3yv^+h*jv,?#1qddytn5u2r7wtp3gdrvtcarwqdqwhyeht'
    var_0 = module_0.encode(str_0, bool_0, bytes_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'
    var_1 = module_0.bech32_decode(str_0)

def test_case_16():
    str_0 = '[$eniqa1'
    var_0 = module_0.decode(str_0, str_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'
    bool_0 = False
    bytes_0 = b"s\xca\x12\x11}\xfa'\xcaU\x9eyz1;~\xd9J\x8ciL"
    var_1 = module_0.encode(str_0, bool_0, bytes_0)
    assert var_1 == '[$eniqa11qw09pyytalgnu54v709arzwm7m99gc62ve4wrag'

def test_case_17():
    bool_0 = False
    bytes_0 = b'.\xc9\xb2\x81\xed<\xfd\xd1\x05|*\xcf\x9f\x17k\xecn'
    str_0 = '&3yv^+h*jv,?#15ddytn5u2r7wtp3gdrvtcarwqdq-hyeht'
    var_0 = module_0.encode(str_0, bool_0, bytes_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'
    var_1 = module_0.bech32_decode(str_0)

def test_case_18():
    bool_0 = True
    bytes_0 = b'=kH\xb9\xd3\x95\x1f\x13\x9c\xb0M\r\x1b\x17\x8ez\xc0h'
    str_0 = 'pnop1q2ckgn89h1pjr6lppqcwes20'
    var_0 = module_0.encode(str_0, bool_0, bytes_0)
    assert var_0 == 'pnop1q2ckgn89h1pjr6lppqcwes201p84453wwnj503889sf5x3k9uw0tqxswyjljn'
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

def test_case_19():
    bool_0 = False
    bytes_0 = b'['
    str_0 = 'pnop1q2ckgn89h1pjr6lppqcwes20'
    var_0 = module_0.encode(str_0, bool_0, bytes_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'

@pytest.mark.xfail(strict=True)
def test_case_20():
    bool_0 = False
    bytes_0 = b'.k\xb2\xd0\xed<\xbf\xd1\xdeL6*\xcf\x0c\x17k\xec`\x1a'
    str_0 = '.'
    var_0 = module_0.encode(str_0, bool_0, bytes_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'
    int_0 = 1637
    tuple_0 = (int_0, bytes_0)
    module_0.encode(var_0, var_0, tuple_0)

def test_case_21():
    bool_0 = True
    bytes_0 = b'=kH\xb9\xd3\x95\x1f\x9c\xb0M\r\x1b\x17\x8ez\xc0h'
    str_0 = 'pnop1q2ckgn89h1pjr6lppqcwes20'
    var_0 = module_0.encode(str_0, bool_0, bytes_0)
    assert var_0 == 'pnop1q2ckgn89h1pjr6lppqcwes201p84453wwnj50eevzdp5d30rn6cp5q8e2nmk'
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'
    var_1 = module_0.encode(var_0, bool_0, bytes_0)

def test_case_22():
    bool_0 = False
    str_0 = '!'
    str_1 = '"z}n(]c3Vtf`mM:i[icU'
    var_0 = module_0.bech32_hrp_expand(str_1)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'
    var_1 = module_0.encode(str_0, bool_0, var_0)

def test_case_23():
    bytes_0 = b".\xa7\xb2\x81\xed<\xbf_\xde\xb56'\xd8\x0c\x17k\xec1|"
    str_0 = '!'
    int_0 = 23
    var_0 = module_0.encode(str_0, int_0, bytes_0)
    assert module_0.CHARSET == 'qpzry9x8gf2tvdw0s3jn54khce6mua7l'