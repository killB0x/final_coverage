# Automatically generated by Pynguin.
import pymonet.validation as module_0
import builtins as module_1


def test_case_0():
    str_0 = "\n        Return monad value when is successfully.\n        Othercase return default_value argument.\n\n        :params default_value: value to return when monad is not successfully.\n        :type default_value: B\n        :returns: monad value\n        :rtype: A | B\n        "
    list_0 = [str_0]
    validation_0 = module_0.Validation(list_0, str_0)
    bytes_0 = b"\x1f?[\xc2\xb8\xe9xq,\xaf\xd6Zm\xd9oh]\x95\x1b\xfc"
    validation_1 = module_0.Validation(list_0, bytes_0)
    str_1 = validation_1.__str__()
    str_2 = " Z(E{axh:P{oEBN"
    validation_2 = module_0.Validation(validation_0, validation_0)
    validation_3 = module_0.Validation(str_0, list_0)
    maybe_0 = validation_0.to_maybe()
    bool_0 = validation_0.__eq__(validation_2)
    validation_4 = module_0.Validation(str_2, validation_2)
    validation_4.bind(bool_0)


def test_case_1():
    int_0 = -2011
    list_0 = []
    validation_0 = module_0.Validation(list_0, list_0)
    object_0 = module_1.object()
    bool_0 = validation_0.__eq__(object_0)
    validation_1 = module_0.Validation(validation_0, validation_0)
    validation_1.bind(int_0)


def test_case_2():
    bool_0 = False
    str_0 = '\rq\x0c"'
    validation_0 = module_0.Validation(bool_0, str_0)
    left_0 = validation_0.to_either()
    try_0 = validation_0.to_try()
    str_1 = ""
    left_1 = left_0.ap(str_0)
    validation_1 = module_0.Validation(str_1, str_1)
    str_2 = validation_1.__str__()
    str_3 = " Z(E{axh:P{oEBN"
    validation_2 = module_0.Validation(str_3, try_0)
    validation_3 = module_0.Validation(validation_1, str_1)
    bool_1 = validation_3.__eq__(validation_1)
    validation_4 = module_0.Validation(validation_1, str_1)
    str_2.bind(try_0)


def test_case_3():
    bytes_0 = b"!K\x1dz\xbb=\xef\x0cN-\xdb\x85\xba\x12Mg\xd5"
    validation_0 = module_0.Validation(bytes_0, bytes_0)
    str_0 = validation_0.__str__()


def test_case_4():
    str_0 = '\rq\x0c"'
    str_1 = ";|c"
    validation_0 = module_0.Validation(str_1, str_1)
    str_2 = validation_0.__str__()
    str_3 = "h"
    none_type_0 = None
    validation_1 = module_0.Validation(str_3, none_type_0)
    validation_2 = module_0.Validation(validation_0, str_1)
    left_0 = validation_0.to_either()
    validation_3 = module_0.Validation(str_0, str_2)
    str_2.to_box()


def test_case_5():
    str_0 = "D|1"
    validation_0 = module_0.Validation(str_0, str_0)
    maybe_0 = validation_0.to_maybe()


def test_case_6():
    str_0 = "D|1"
    validation_0 = module_0.Validation(str_0, str_0)


def test_case_7():
    float_0 = 666.4621
    str_0 = "W\n"
    validation_0 = module_0.Validation(float_0, str_0)
    bool_0 = validation_0.is_fail()


def test_case_8():
    str_0 = "1d0dG}qD(e#\x0c"
    int_0 = -1021
    validation_0 = module_0.Validation(int_0, int_0)
    validation_0.map(str_0)


def test_case_9():
    none_type_0 = None
    tuple_0 = ()
    validation_0 = module_0.Validation(tuple_0, tuple_0)
    validation_0.ap(none_type_0)


def test_case_10():
    float_0 = -353.8
    str_0 = "#GtWvIZ\x0cQ3V}0)P\r\x0cV"
    tuple_0 = (float_0, str_0, float_0)
    validation_0 = module_0.Validation(tuple_0, str_0)
    box_0 = validation_0.to_box()
    bool_0 = True
    tuple_1 = (bool_0,)
    validation_1 = module_0.Validation(tuple_1, bool_0)


def test_case_11():
    str_0 = "\n        Return monad value when is successfully.\n        Othercase return default_value argument.\n\n        :params default_value: value to return when monad is not successfully.\n        :type default_value: B\n        :returns: monad value\n        :rtype: A | B\n        "
    list_0 = [str_0]
    validation_0 = module_0.Validation(list_0, str_0)
    lazy_0 = validation_0.to_lazy()
    bytes_0 = b"\x1f?[\xc2\xb8\xe9xq,\xaf\xd6Zm\xd9oh]\x95\x1b\xfc"
    str_1 = "[3T"
    validation_1 = module_0.Validation(str_1, str_1)
    validation_1.ap(bytes_0)


def test_case_12():
    str_0 = "D2J,("
    validation_0 = module_0.Validation(str_0, str_0)
    try_0 = validation_0.to_try()
    bool_0 = validation_0.is_fail()
    try_0.to_either()


def test_case_13():
    bool_0 = False
    str_0 = '\rq\x0c"'
    validation_0 = module_0.Validation(bool_0, str_0)
    left_0 = validation_0.to_either()
    try_0 = validation_0.to_try()
    str_1 = ";|c"
    maybe_0 = validation_0.to_maybe()
    validation_1 = module_0.Validation(str_1, str_1)
    str_2 = validation_1.__str__()
    str_3 = " Z(E{axh:P{oEBN"
    none_type_0 = None
    validation_2 = module_0.Validation(str_3, none_type_0)
    validation_3 = module_0.Validation(validation_1, str_1)
    bool_1 = validation_3.__eq__(validation_1)
    validation_4 = module_0.Validation(validation_1, str_1)
    str_2.bind(try_0)


def test_case_14():
    none_type_0 = None
    str_0 = ""
    tuple_0 = (none_type_0, str_0)
    none_type_1 = None
    str_1 = "Hx}\t`8Vg4\\cU{z\rGwU"
    validation_0 = module_0.Validation(tuple_0, none_type_0)
    lazy_0 = validation_0.to_lazy()
    lazy_1 = lazy_0.bind(none_type_1)
    bool_0 = lazy_0.__eq__(str_0)
    validation_1 = module_0.Validation(bool_0, str_1)
    try_0 = lazy_1.to_try()
    validation_2 = module_0.Validation(none_type_0, none_type_0)
    bool_0.to_box()


def test_case_15():
    list_0 = []
    validation_0 = module_0.Validation(list_0, list_0)
    str_0 = validation_0.__str__()
    bool_0 = False
    str_1 = '\rq\x0c"'
    validation_1 = module_0.Validation(bool_0, str_1)
    left_0 = validation_1.to_either()
    maybe_0 = validation_0.to_maybe()
    validation_2 = module_0.Validation(str_0, validation_1)
    str_2 = validation_0.__str__()
    str_3 = maybe_0.__str__()
    str_4 = " Z(E{axh:P{oEBN"
    validation_3 = module_0.Validation(str_0, list_0)
    validation_4 = module_0.Validation(validation_2, str_4)
    bool_1 = validation_1.__eq__(str_2)
    validation_5 = module_0.Validation(list_0, validation_0)
    validation_6 = module_0.Validation(maybe_0, validation_4)
    validation_1.bind(validation_0)


def test_case_16():
    list_0 = []
    validation_0 = module_0.Validation(list_0, list_0)
    right_0 = validation_0.to_either()
    try_0 = right_0.to_try()
    try_0.to_maybe()
