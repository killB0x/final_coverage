# Automatically generated by Pynguin.
import mimesis.exceptions as module_0
import builtins as module_1


def test_case_0():
    bytes_0 = b"\x90)\x04\xb0\xb5'\xe7\x07\xcc\t\xe5\x12"
    unacceptable_field_0 = module_0.UnacceptableField()
    bytes_1 = b"\xb5Z0"
    list_0 = [bytes_0, bytes_1, bytes_1, bytes_0]
    undefined_schema_0 = module_0.UndefinedSchema()
    undefined_schema_1 = module_0.UndefinedSchema(*list_0)
    undefined_schema_2 = module_0.UndefinedSchema(*list_0)
    unsupported_field_0 = module_0.UnsupportedField(undefined_schema_1)
    str_0 = undefined_schema_1.__str__()
    undefined_field_0 = module_0.UndefinedField()
    non_enumerable_error_0 = module_0.NonEnumerableError(list_0)
    str_1 = undefined_schema_1.__str__()
    str_2 = unsupported_field_0.__str__()


def test_case_1():
    none_type_0 = None
    unsupported_locale_0 = module_0.UnsupportedLocale(none_type_0)
    str_0 = unsupported_locale_0.__str__()
    non_enumerable_error_0 = module_0.NonEnumerableError(none_type_0)
    non_enumerable_error_0.__str__()


def test_case_2():
    undefined_schema_0 = module_0.UndefinedSchema()


def test_case_3():
    undefined_field_0 = module_0.UndefinedField()
    str_0 = undefined_field_0.__str__()
    unsupported_locale_0 = module_0.UnsupportedLocale()
    str_1 = unsupported_locale_0.__str__()


def test_case_4():
    undefined_schema_0 = module_0.UndefinedSchema()
    str_0 = undefined_schema_0.__str__()


def test_case_5():
    str_0 = "S1&S>E>lq{'S2s&KW@"
    unsupported_field_0 = module_0.UnsupportedField(str_0)


def test_case_6():
    attribute_error_0 = module_1.AttributeError()
    list_0 = [attribute_error_0]
    unsupported_algorithm_0 = module_0.UnsupportedAlgorithm(*list_0)
    list_1 = [
        attribute_error_0,
        attribute_error_0,
        attribute_error_0,
        attribute_error_0,
    ]
    undefined_schema_0 = module_0.UndefinedSchema(*list_1)
    unsupported_field_0 = module_0.UnsupportedField()
    str_0 = unsupported_field_0.__str__()


def test_case_7():
    unsupported_field_0 = module_0.UnsupportedField()
    str_0 = unsupported_field_0.__str__()
    undefined_schema_0 = module_0.UndefinedSchema()
    unacceptable_field_0 = module_0.UnacceptableField()
    unsupported_field_1 = module_0.UnsupportedField()
    str_1 = undefined_schema_0.__str__()
    str_2 = unsupported_field_1.__str__()
    str_3 = unacceptable_field_0.__str__()
