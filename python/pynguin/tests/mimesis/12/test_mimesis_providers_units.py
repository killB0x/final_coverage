# Automatically generated by Pynguin.
import mimesis.providers.units as module_0


def test_case_0():
    unit_system_0 = module_0.UnitSystem()
    str_0 = unit_system_0.prefix()
    unit_system_1 = module_0.UnitSystem()
    str_1 = unit_system_1.unit(symbol=unit_system_1)


def test_case_1():
    none_type_0 = None
    unit_system_0 = module_0.UnitSystem()
    str_0 = unit_system_0.unit(symbol=none_type_0)


def test_case_2():
    bool_0 = True
    str_0 = "R,EmxSQ6i6Ve&Dvk"
    unit_system_0 = module_0.UnitSystem(str_0)
    str_1 = unit_system_0.prefix(symbol=bool_0)
    unit_system_1 = module_0.UnitSystem(bool_0)


def test_case_3():
    unit_system_0 = module_0.UnitSystem()
