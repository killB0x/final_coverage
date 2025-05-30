# Automatically generated by Pynguin.
import pytest
import wolk_gateway_module.model.data_type as module_0
import wolk_gateway_module.model.reading_type as module_1
import wolk_gateway_module.model.reading_type_name as module_2
import wolk_gateway_module.model.reading_type_measurement_unit as module_3

def test_case_0():
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC

def test_case_1():
    with pytest.raises(ValueError):
        module_1.ReadingType()

def test_case_2():
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_MAGNETISM
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.RUTHERFORD
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=reading_type_measurement_unit_0)

def test_case_3():
    reading_type_name_0 = module_2.ReadingTypeName.SOUND_LEVEL
    str_0 = 'b+$r'
    reading_type_0 = module_1.ReadingType(name=str_0, unit=str_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == 'b+$r'
    assert reading_type_0.unit == 'b+$r'
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False

def test_case_4():
    data_type_0 = module_0.DataType.BOOLEAN
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_BOOLEAN
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.LUMINOUS_INTENSITY
    str_0 = reading_type_0.__repr__()
    assert str_0 == "ReadingType(name='ReadingTypeName.GENERIC_BOOLEAN', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False

def test_case_5():
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_RESISTANCE
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0)

def test_case_6():
    str_0 = "c]\t'yjnoynhoZ8\r<;"
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_ENERGY
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_0, unit=str_0)

def test_case_7():
    reading_type_name_0 = module_2.ReadingTypeName.GENERIC_BOOLEAN
    str_0 = "c]\t'djnoynoZ8\r<m"
    data_type_0 = module_0.DataType.BOOLEAN
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_BOOLEAN
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.GRAVITY
    with pytest.raises(ValueError):
        module_1.ReadingType(reading_type_measurement_unit_0)

def test_case_8():
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.KILOGRAM_FORCE
    with pytest.raises(ValueError):
        module_1.ReadingType(unit=reading_type_measurement_unit_0)

def test_case_9():
    str_0 = "c]\t'djnoynoZ8\r<m"
    data_type_0 = module_0.DataType.BOOLEAN
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_BOOLEAN
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.LUMINOUS_INTENSITY
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    bool_1 = reading_type_0.validate(str_0, reading_type_name_0)
    assert bool_1 is False
    with pytest.raises(ValueError):
        module_1.ReadingType()

def test_case_10():
    str_0 = "c]\t'djnoynoZ8\r<m"
    reading_type_name_0 = module_2.ReadingTypeName.GENERIC
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=str_0)

def test_case_11():
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_CAPACITY
    data_type_0 = module_0.DataType.STRING
    none_type_0 = None
    reading_type_0 = module_1.ReadingType(data_type_0, none_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    str_0 = reading_type_0.__repr__()
    assert str_0 == "ReadingType(name='ReadingTypeName.GENERIC_TEXT', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    with pytest.raises(ValueError):
        module_1.ReadingType(none_type_0, none_type_0)

def test_case_12():
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.CALORIES
    reading_type_name_0 = module_2.ReadingTypeName.GENERIC_BOOLEAN
    data_type_0 = module_0.DataType.NUMERIC
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    bool_0 = reading_type_0.validate(reading_type_name_0, reading_type_measurement_unit_0)
    assert bool_0 is False

def test_case_13():
    str_0 = "c]\t'yjnoynhoZ8\r<;"
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.MAGNETIC_FLUX
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False

@pytest.mark.xfail(strict=True)
def test_case_14():
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_CHARGE
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.RUTHERFORD
    module_1.ReadingType(name=reading_type_name_0, unit=reading_type_measurement_unit_0)

def test_case_15():
    reading_type_name_0 = module_2.ReadingTypeName.FLUID_VOLUME
    str_0 = "mP\t>1N(_:'']9"
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    with pytest.raises(ValueError):
        module_1.ReadingType()

def test_case_16():
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_RESISTANCE
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.METRES_PER_SQUARE_SECOND
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=reading_type_measurement_unit_0)

def test_case_17():
    reading_type_name_0 = module_2.ReadingTypeName.FLUID_VOLUME
    str_0 = "c]nO\t'djnoynToZ8\r<m"
    data_type_0 = module_0.DataType.NUMERIC
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.ROENTGEN
    with pytest.raises(AssertionError):
        reading_type_0.validate(str_0, reading_type_measurement_unit_0)

def test_case_18():
    data_type_0 = module_0.DataType.BOOLEAN
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_ENERGY
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_BOOLEAN
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    str_0 = 'B%OU\r_,_?.TNC%'
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False

def test_case_19():
    reading_type_name_0 = module_2.ReadingTypeName.ACCELEROMETER
    data_type_0 = module_0.DataType.NUMERIC
    str_0 = 'Y!|3I7tmluAb'
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    bool_1 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_1 is False
    reading_type_1 = module_1.ReadingType(name=str_0, unit=str_0)
    assert f'{type(reading_type_1).__module__}.{type(reading_type_1).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_1.name == 'Y!|3I7tmluAb'
    assert reading_type_1.unit == 'Y!|3I7tmluAb'
    reading_type_2 = module_1.ReadingType(data_type_0)
    assert reading_type_2.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_2.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC

def test_case_20():
    reading_type_name_0 = module_2.ReadingTypeName.BREATHING_RATE
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.ROENTGEN
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=reading_type_measurement_unit_0)

def test_case_21():
    data_type_0 = module_0.DataType.BOOLEAN
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_BOOLEAN
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    str_0 = reading_type_0.__repr__()
    assert str_0 == "ReadingType(name='ReadingTypeName.GENERIC_BOOLEAN', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    reading_type_name_0 = module_2.ReadingTypeName.LUMINOUS_FLUX
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False

def test_case_22():
    str_0 = 'b+$'
    reading_type_0 = module_1.ReadingType(name=str_0, unit=str_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == 'b+$'
    assert reading_type_0.unit == 'b+$'
    reading_type_name_0 = module_2.ReadingTypeName.MEASURE
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=str_0)

def test_case_23():
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.BATTERY_X1000
    data_type_0 = module_0.DataType.NUMERIC
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_CURRENT
    bool_0 = reading_type_0.validate(reading_type_name_0, reading_type_measurement_unit_0)
    assert bool_0 is False

def test_case_24():
    reading_type_name_0 = module_2.ReadingTypeName.FLOOR_POSITION
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.RADIATION_DOSE_EFFECTIVE
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=reading_type_measurement_unit_0)

def test_case_25():
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.BATTERY_X1000
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_INDUCTANCE
    bool_0 = reading_type_0.validate(reading_type_name_0, reading_type_measurement_unit_0)
    assert bool_0 is False
    reading_type_name_1 = module_2.ReadingTypeName.MOVEMENT
    bool_1 = reading_type_0.validate(reading_type_name_1, reading_type_measurement_unit_0)
    assert bool_1 is False
    with pytest.raises(ValueError):
        module_1.ReadingType()

def test_case_26():
    str_0 = "c]\t'djnoynoZ8\r<m"
    data_type_0 = module_0.DataType.BOOLEAN
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_BOOLEAN
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.BATTERY_VOLTAGE
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    with pytest.raises(ValueError):
        module_1.ReadingType()

def test_case_27():
    str_0 = "c]\t'djnoynoZ8\r<m"
    data_type_0 = module_0.DataType.BOOLEAN
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_BOOLEAN
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.RADIATION
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    reading_type_name_1 = module_2.ReadingTypeName.MOVEMENT
    bool_1 = reading_type_0.validate(reading_type_name_1, str_0)
    assert bool_1 is False

def test_case_28():
    str_0 = "c]\t'yjnoyn oZ8\r<;"
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.ELECTRIC_CONDUCTANCE
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False

def test_case_29():
    none_type_0 = None
    str_0 = 'fIx'
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    bool_0 = reading_type_0.validate(none_type_0, str_0)
    assert bool_0 is False
    str_1 = "c]\t'yjnoyn oZ8\r<;"
    data_type_1 = module_0.DataType.STRING
    reading_type_1 = module_1.ReadingType(data_type_1)
    assert reading_type_1.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_1.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.BATTERY_POWER
    bool_1 = reading_type_1.validate(str_1, bool_0)
    assert bool_1 is False
    str_2 = reading_type_0.__repr__()
    assert str_2 == "ReadingType(name='ReadingTypeName.GENERIC_TEXT', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    bool_2 = reading_type_1.validate(reading_type_name_0, str_0)
    assert bool_2 is False
    with pytest.raises(ValueError):
        module_1.ReadingType(none_type_0, unit=str_2)

def test_case_30():
    reading_type_name_0 = module_2.ReadingTypeName.LENGHT
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.RUTHERFORD
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=reading_type_measurement_unit_0)

def test_case_31():
    reading_type_name_0 = module_2.ReadingTypeName.MASS
    str_0 = "c]\t'yjnoynhoZ8\r<;"
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    with pytest.raises(ValueError):
        module_1.ReadingType()

def test_case_32():
    data_type_0 = module_0.DataType.NUMERIC
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.ILLUMINANCE
    str_0 = reading_type_0.__repr__()
    assert str_0 == "ReadingType(name='ReadingTypeName.GENERIC', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False

def test_case_33():
    data_type_0 = module_0.DataType.NUMERIC
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    str_0 = reading_type_0.__repr__()
    assert str_0 == "ReadingType(name='ReadingTypeName.GENERIC', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    str_1 = ''
    reading_type_name_0 = module_2.ReadingTypeName.CALORIES
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=str_1)

def test_case_34():
    reading_type_name_0 = module_2.ReadingTypeName.POWER
    str_0 = "c]\t'yjnoyn o-8\r<;"
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    str_1 = reading_type_0.__repr__()
    assert str_1 == "ReadingType(name='ReadingTypeName.GENERIC_TEXT', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    bool_1 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_1 is False
    bool_2 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_2 is False
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=str_0)

def test_case_35():
    data_type_0 = module_0.DataType.NUMERIC
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.PRESSURE
    str_0 = 'UJ'
    bool_0 = reading_type_0.validate(str_0, str_0)
    assert bool_0 is True
    bool_1 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_1 is False

def test_case_36():
    reading_type_name_0 = module_2.ReadingTypeName.BATTERY_VOLTAGE
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.CENTIVOLT
    reading_type_0 = module_1.ReadingType(name=reading_type_name_0, unit=reading_type_measurement_unit_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.BATTERY_VOLTAGE
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.CENTIVOLT
    bool_0 = reading_type_0.validate(reading_type_name_0, reading_type_measurement_unit_0)
    assert bool_0 is True
    with pytest.raises(ValueError):
        module_1.ReadingType()

def test_case_37():
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.BATTERY_X1000
    data_type_0 = module_0.DataType.NUMERIC
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.FORCE
    bool_0 = reading_type_0.validate(reading_type_name_0, reading_type_measurement_unit_0)
    assert bool_0 is False
    str_0 = reading_type_0.__repr__()
    assert str_0 == "ReadingType(name='ReadingTypeName.GENERIC', unit='ReadingTypeMeasurementUnit.NUMERIC')"

def test_case_38():
    data_type_0 = module_0.DataType.BOOLEAN
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_BOOLEAN
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.TEMPERATURE
    str_0 = 'UJ'
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    with pytest.raises(ValueError):
        module_1.ReadingType(name=str_0)

def test_case_39():
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.BATTERY_X1000
    data_type_0 = module_0.DataType.NUMERIC
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.HUMIDITY
    bool_0 = reading_type_0.validate(reading_type_name_0, reading_type_measurement_unit_0)
    assert bool_0 is False
    with pytest.raises(ValueError):
        module_1.ReadingType()

def test_case_40():
    str_0 = "c]\t'yjnoynhoZ8\r<;"
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    reading_type_name_0 = module_2.ReadingTypeName.FREQUENCY
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    bool_1 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_1 is False

def test_case_41():
    reading_type_name_0 = module_2.ReadingTypeName.GENERIC_TEXT
    str_0 = "c]\t'djnoynoZ8\r<m"
    data_type_0 = module_0.DataType.NUMERIC
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    reading_type_1 = module_1.ReadingType(data_type_0, reading_type_name_0)
    assert reading_type_1.name == module_2.ReadingTypeName.GENERIC
    assert reading_type_1.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    with pytest.raises(ValueError):
        module_1.ReadingType()

def test_case_42():
    reading_type_name_0 = module_2.ReadingTypeName.LENGHT
    str_0 = "c]\t'yjnoynhoZ8\r<;"
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0, unit=str_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    str_1 = reading_type_0.__repr__()
    assert str_1 == "ReadingType(name='ReadingTypeName.GENERIC_TEXT', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    reading_type_name_1 = module_2.ReadingTypeName.LIGHT
    bool_0 = reading_type_0.validate(reading_type_name_1, str_1)
    assert bool_0 is False
    reading_type_name_2 = module_2.ReadingTypeName.ELECTRIC_MAGNETISM
    bool_1 = reading_type_0.validate(bool_0, str_1)
    assert bool_1 is False
    reading_type_name_3 = module_2.ReadingTypeName.GENERIC
    bool_2 = reading_type_0.validate(reading_type_name_0, reading_type_name_2)
    str_2 = "c]nO\t'djnoynToZ8\r<m"
    bool_3 = reading_type_0.validate(str_1, str_2)
    assert bool_3 is True
    none_type_0 = None
    with pytest.raises(ValueError):
        module_1.ReadingType(none_type_0, reading_type_name_3)

def test_case_43():
    str_0 = "c]\t'yjnoyn oZ8\r<;"
    data_type_0 = module_0.DataType.STRING
    reading_type_0 = module_1.ReadingType(data_type_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.GENERIC_TEXT
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.NUMERIC
    str_1 = reading_type_0.__repr__()
    assert str_1 == "ReadingType(name='ReadingTypeName.GENERIC_TEXT', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    reading_type_name_0 = module_2.ReadingTypeName.TIME
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    bool_1 = reading_type_0.validate(str_0, str_0)
    assert bool_1 is True
    with pytest.raises(ValueError):
        module_1.ReadingType(unit=str_0)

def test_case_44():
    reading_type_name_0 = module_2.ReadingTypeName.MAGNETIC_FLUX
    reading_type_name_1 = module_2.ReadingTypeName.ELECTRIC_CONDUCTANCE
    reading_type_measurement_unit_0 = module_3.ReadingTypeMeasurementUnit.RUTHERFORD
    reading_type_measurement_unit_1 = module_3.ReadingTypeMeasurementUnit.MAXWELL
    reading_type_0 = module_1.ReadingType(name=reading_type_name_0, unit=reading_type_measurement_unit_1)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == module_2.ReadingTypeName.MAGNETIC_FLUX
    assert reading_type_0.unit == module_3.ReadingTypeMeasurementUnit.MAXWELL
    bool_0 = reading_type_0.validate(reading_type_name_1, reading_type_measurement_unit_0)
    assert bool_0 is False
    reading_type_name_2 = module_2.ReadingTypeName.LUMINOUS_FLUX
    bool_1 = reading_type_0.validate(reading_type_name_2, reading_type_measurement_unit_1)
    assert bool_1 is False

def test_case_45():
    reading_type_name_0 = module_2.ReadingTypeName.ANGLE
    str_0 = 'd2p/subdevice_status_update/'
    with pytest.raises(ValueError):
        module_1.ReadingType(name=reading_type_name_0, unit=str_0)

def test_case_46():
    reading_type_name_0 = module_2.ReadingTypeName.SPEED
    str_0 = "ReadingType(name='ReadingTypeName.GENERIC_TEXT', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    reading_type_0 = module_1.ReadingType(name=str_0, unit=str_0)
    assert f'{type(reading_type_0).__module__}.{type(reading_type_0).__qualname__}' == 'wolk_gateway_module.model.reading_type.ReadingType'
    assert reading_type_0.name == "ReadingType(name='ReadingTypeName.GENERIC_TEXT', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    assert reading_type_0.unit == "ReadingType(name='ReadingTypeName.GENERIC_TEXT', unit='ReadingTypeMeasurementUnit.NUMERIC')"
    bool_0 = reading_type_0.validate(reading_type_name_0, str_0)
    assert bool_0 is False
    with pytest.raises(ValueError):
        module_1.ReadingType()