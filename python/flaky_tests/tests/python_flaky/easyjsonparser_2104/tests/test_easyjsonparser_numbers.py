# Automatically generated by Pynguin.
import pytest
import easyjsonparser.numbers as module_0
import easyjsonparser.helper as module_1
import builtins as module_2

@pytest.mark.xfail(strict=True)
def test_case_0():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    bool_0 = False
    float_0 = module_0.Float(float_instance_0)
    assert f'{type(float_0).__module__}.{type(float_0).__qualname__}' == 'easyjsonparser.numbers.Float'
    float_instance_1 = module_0._FloatInstance(bool_0)
    assert f'{type(float_instance_1).__module__}.{type(float_instance_1).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    bool_1 = False
    var_0 = float_instance_0.check_and_sanitize_input(bool_0)
    integer_0 = module_0.Integer(bool_1)
    assert f'{type(integer_0).__module__}.{type(integer_0).__qualname__}' == 'easyjsonparser.numbers.Integer'
    module_0._BoolInstance(integer_0)

def test_case_1():
    integer_0 = module_0.Integer()
    assert f'{type(integer_0).__module__}.{type(integer_0).__qualname__}' == 'easyjsonparser.numbers.Integer'

def test_case_2():
    integer_instance_0 = module_0._IntegerInstance()
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    var_0 = integer_instance_0.compute_to_json()
    assert var_0 == 'None'

def test_case_3():
    float_0 = module_0.Float()

def test_case_4():
    float_0 = module_1.Empty()
    var_0 = module_0._BoolInstance()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'

@pytest.mark.xfail(strict=True)
def test_case_5():
    integer_instance_0 = module_0._IntegerInstance()
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    float_0 = module_0.Float()
    boolean_0 = module_0.Boolean()
    float_0.compute_to_json()

@pytest.mark.xfail(strict=True)
def test_case_6():
    bool_instance_0 = module_0._BoolInstance()
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    var_0 = bool_instance_0.compute_to_json()
    assert var_0 == 'true'
    var_0.compute_instance_type()

def test_case_7():
    bool_instance_0 = module_0._BoolInstance()
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'

@pytest.mark.xfail(strict=True)
def test_case_8():
    float_0 = module_0.Float()
    var_0 = float_0.compute_instance_type()
    integer_instance_0 = module_0._IntegerInstance()
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    var_1 = integer_instance_0.__repr__()
    assert var_1 == '<JSON Value _IntegerInstance: None>'
    var_0.compute_to_json()

@pytest.mark.xfail(strict=True)
def test_case_9():
    integer_0 = module_0.Integer()
    assert f'{type(integer_0).__module__}.{type(integer_0).__qualname__}' == 'easyjsonparser.numbers.Integer'
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    var_0 = module_1.Empty()
    float_0 = module_0.Float(optional=integer_0)
    boolean_0 = module_0.Boolean()
    var_1 = float_instance_0.compute_to_json()
    assert var_1 == 'None'
    var_1.compute_instance_type()

@pytest.mark.xfail(strict=True)
def test_case_10():
    bool_0 = False
    var_0 = module_0.Boolean(bool_0, bool_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'easyjsonparser.numbers.Boolean'
    bool_instance_0 = var_0.compute_instance_type()
    var_0.check_and_sanitize_input(bool_instance_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    bool_instance_0 = module_0._BoolInstance()
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    var_0 = bool_instance_0.check_and_sanitize_input(bool_instance_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'easyjsonparser.helper.PrivateEasyNoneHelper'
    var_0.compute_to_json()

@pytest.mark.xfail(strict=True)
def test_case_12():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    bool_0 = False
    float_0 = module_0.Float(float_instance_0)
    assert f'{type(float_0).__module__}.{type(float_0).__qualname__}' == 'easyjsonparser.numbers.Float'
    float_instance_1 = module_0._FloatInstance(bool_0)
    assert f'{type(float_instance_1).__module__}.{type(float_instance_1).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    var_0 = float_instance_0.__str__()
    assert var_0 == '<JSON Value _FloatInstance: None>'
    var_1 = float_instance_0.to_json()
    assert var_1 == 'None'
    bool_instance_0 = module_0._BoolInstance()
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    integer_instance_0 = module_0._IntegerInstance()
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    integer_0 = module_0.Integer()
    assert f'{type(integer_0).__module__}.{type(integer_0).__qualname__}' == 'easyjsonparser.numbers.Integer'
    var_2 = float_instance_1.__str__()
    var_1.find_all(var_2)

@pytest.mark.xfail(strict=True)
def test_case_13():
    bytes_0 = b'\xf2\xc1Q\xd83g\xbd'
    module_0._IntegerInstance(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    none_type_0 = None
    module_0._FloatInstance(none_type_0)

def test_case_15():
    bool_0 = False
    boolean_0 = module_0.Boolean(bool_0, bool_0)
    assert f'{type(boolean_0).__module__}.{type(boolean_0).__qualname__}' == 'easyjsonparser.numbers.Boolean'

@pytest.mark.xfail(strict=True)
def test_case_16():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    bool_0 = False
    float_0 = float_instance_0.check_and_sanitize_input(float_instance_0)
    var_0 = module_1.Empty()
    var_1 = float_instance_0.__str__()
    assert var_1 == '<JSON Value _FloatInstance: None>'
    var_2 = float_instance_0.to_json()
    assert var_2 == 'None'
    bool_instance_0 = module_0._BoolInstance()
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    integer_instance_0 = module_0._IntegerInstance()
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    var_3 = bool_instance_0.compute_to_json()
    assert var_3 == 'true'
    bool_1 = True
    integer_0 = module_0.Integer(optional=bool_1)
    assert f'{type(integer_0).__module__}.{type(integer_0).__qualname__}' == 'easyjsonparser.numbers.Integer'
    var_4 = bool_instance_0.__str__()
    assert var_4 == '<JSON Value _BoolInstance: <Empty value>>'
    bool_0.find_all(var_4)

@pytest.mark.xfail(strict=True)
def test_case_17():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    float_instance_1 = module_0._FloatInstance()
    bool_0 = False
    var_0 = float_instance_0.check_and_sanitize_input(bool_0)
    assert var_0 == pytest.approx(0.0, abs=0.01, rel=0.01)
    bool_1 = True
    integer_0 = module_0.Integer(optional=bool_1)
    assert f'{type(integer_0).__module__}.{type(integer_0).__qualname__}' == 'easyjsonparser.numbers.Integer'
    bool_instance_0 = module_0._BoolInstance(bool_0)
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    var_1 = module_1.Empty()
    var_1.compute_to_json()

@pytest.mark.xfail(strict=True)
def test_case_18():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    bool_0 = False
    float_0 = module_0.Float(float_instance_0, bool_0)
    assert f'{type(float_0).__module__}.{type(float_0).__qualname__}' == 'easyjsonparser.numbers.Float'
    float_instance_1 = module_0._FloatInstance()
    integer_instance_0 = module_0._IntegerInstance(bool_0)
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    var_0 = module_1.Empty()
    var_0.compute_to_json()

@pytest.mark.xfail(strict=True)
def test_case_19():
    bool_instance_0 = module_0._BoolInstance()
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    integer_instance_0 = module_0._IntegerInstance()
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    bool_0 = False
    integer_instance_1 = module_0._IntegerInstance()
    integer_0 = module_0.Integer(optional=bool_0)
    assert f'{type(integer_0).__module__}.{type(integer_0).__qualname__}' == 'easyjsonparser.numbers.Integer'
    var_0 = integer_instance_1.check_and_sanitize_input(integer_instance_0)
    var_0.compute_to_json()

@pytest.mark.xfail(strict=True)
def test_case_20():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    float_0 = float_instance_0.__str__()
    assert float_0 == '<JSON Value _FloatInstance: None>'
    float_1 = 1173.3
    float_instance_1 = module_0._FloatInstance(float_1)
    assert f'{type(float_instance_1).__module__}.{type(float_instance_1).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    var_0 = module_0._BoolInstance()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    var_1 = var_0.compute_to_json()
    assert var_1 == 'true'
    var_2 = module_0.Boolean()
    bool_instance_0 = module_0._BoolInstance()
    var_2.__call__(**var_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    var_0 = float_instance_0.__str__()
    assert var_0 == '<JSON Value _FloatInstance: None>'
    float_0 = 1173.3
    float_instance_1 = module_0._FloatInstance(float_0)
    assert f'{type(float_instance_1).__module__}.{type(float_instance_1).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    bool_instance_0 = module_0._BoolInstance()
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    var_1 = bool_instance_0.compute_to_json()
    assert var_1 == 'true'
    boolean_0 = module_0.Boolean()
    bool_instance_1 = module_0._BoolInstance()
    var_2 = bool_instance_1.check_and_sanitize_input(float_0)
    assert var_2 is True
    boolean_0.__call__(**bool_instance_0)

@pytest.mark.xfail(strict=True)
def test_case_22():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    bool_0 = False
    float_0 = module_0.Float(float_instance_0)
    assert f'{type(float_0).__module__}.{type(float_0).__qualname__}' == 'easyjsonparser.numbers.Float'
    var_0 = float_0.compute_instance_type()
    var_1 = float_instance_0.__str__()
    assert var_1 == '<JSON Value _FloatInstance: None>'
    var_2 = float_instance_0.to_json()
    assert var_2 == 'None'
    bool_instance_0 = module_0._BoolInstance()
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    integer_instance_0 = module_0._IntegerInstance()
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    var_3 = bool_instance_0.compute_to_json()
    assert var_3 == 'true'
    bool_1 = True
    integer_0 = module_0.Integer(optional=bool_1)
    assert f'{type(integer_0).__module__}.{type(integer_0).__qualname__}' == 'easyjsonparser.numbers.Integer'
    object_0 = module_2.object()
    float_1 = 92.356
    integer_1 = module_0.Integer(float_1, bool_1)
    assert f'{type(integer_1).__module__}.{type(integer_1).__qualname__}' == 'easyjsonparser.numbers.Integer'
    var_4 = float_instance_0.__str__()
    var_0.find_all(bool_0)

def test_case_23():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    bool_0 = False
    float_0 = module_0.Float(float_instance_0)
    assert f'{type(float_0).__module__}.{type(float_0).__qualname__}' == 'easyjsonparser.numbers.Float'
    var_0 = float_0.compute_instance_type()
    var_1 = float_instance_0.__str__()
    assert var_1 == '<JSON Value _FloatInstance: None>'
    bool_instance_0 = module_0._BoolInstance(bool_0)
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    bool_1 = False
    integer_instance_0 = module_0._IntegerInstance()
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    var_2 = bool_instance_0.compute_to_json()
    assert var_2 == 'false'
    bool_2 = True
    integer_0 = module_0.Integer(optional=bool_2)
    assert f'{type(integer_0).__module__}.{type(integer_0).__qualname__}' == 'easyjsonparser.numbers.Integer'
    object_0 = module_2.object()
    integer_1 = module_0.Integer(bool_1)
    assert f'{type(integer_1).__module__}.{type(integer_1).__qualname__}' == 'easyjsonparser.numbers.Integer'
    var_3 = bool_instance_0.compute_to_json()
    assert var_3 == 'false'
    with pytest.raises(RuntimeError):
        bool_instance_0.check_and_sanitize_input(float_instance_0)

@pytest.mark.xfail(strict=True)
def test_case_24():
    float_instance_0 = module_0._FloatInstance()
    assert f'{type(float_instance_0).__module__}.{type(float_instance_0).__qualname__}' == 'easyjsonparser.numbers._FloatInstance'
    bool_0 = False
    float_0 = module_0.Float()
    var_0 = float_0.compute_instance_type()
    var_1 = float_instance_0.check_and_sanitize_input(bool_0)
    assert var_1 == pytest.approx(0.0, abs=0.01, rel=0.01)
    var_2 = var_1.__str__()
    assert var_2 == '0.0'
    boolean_0 = module_0.Boolean()
    var_3 = float_instance_0.to_json()
    assert var_3 == 'None'
    bool_instance_0 = module_0._BoolInstance()
    assert f'{type(bool_instance_0).__module__}.{type(bool_instance_0).__qualname__}' == 'easyjsonparser.numbers._BoolInstance'
    integer_instance_0 = module_0._IntegerInstance(var_1)
    assert f'{type(integer_instance_0).__module__}.{type(integer_instance_0).__qualname__}' == 'easyjsonparser.numbers._IntegerInstance'
    var_3.compute_to_json()

def test_case_25():
    float_0 = 3301.55
    float_1 = module_0.Float(float_0)
    assert f'{type(float_1).__module__}.{type(float_1).__qualname__}' == 'easyjsonparser.numbers.Float'