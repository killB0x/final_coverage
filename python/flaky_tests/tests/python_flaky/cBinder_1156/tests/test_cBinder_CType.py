# Automatically generated by Pynguin.
import cBinder.CType as module_0

def test_case_0():
    c_type_0 = module_0.CType.UNSIGNED_POINTER
    var_0 = module_0.get_c_type_for_type(c_type_0)

def test_case_1():
    pass

def test_case_2():
    c_type_0 = module_0.CType.SIGNED_LONG_INT
    var_0 = module_0.get_c_type_for_type(c_type_0)
    var_1 = module_0.get_c_type_for_type(c_type_0)
    c_type_1 = module_0.CType.INT
    var_2 = module_0.get_c_type_for_type(c_type_1)
    var_3 = module_0.get_c_type_for_type(var_2)
    none_type_0 = None
    c_type_2 = module_0.CType.CHAR
    var_4 = module_0.get_c_type_for_type(c_type_0)
    var_5 = module_0.get_c_type_for_type(var_0)
    var_6 = module_0.get_c_type_for_type(var_2)
    c_type_3 = module_0.CType.SIGNED_LONG_POINTER
    var_7 = module_0.get_c_type_for_type(none_type_0)
    var_8 = module_0.get_c_type_for_type(none_type_0)
    var_9 = module_0.get_c_type_for_type(c_type_1)
    var_10 = module_0.get_c_type_for_type(var_7)
    var_11 = module_0.get_c_type_for_type(c_type_3)
    var_12 = module_0.get_c_type_for_type(none_type_0)
    var_13 = module_0.get_c_type_for_type(c_type_2)
    str_0 = 'unsigned long long int'
    var_14 = module_0.get_c_type_for_type(str_0)
    assert var_14 == module_0.CType.UNSIGNED_LONG_LONG_INT