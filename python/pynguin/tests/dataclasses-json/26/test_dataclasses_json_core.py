# Automatically generated by Pynguin.
import dataclasses_json.core as module_0
import marshmallow.base as module_1
import re as module_2
import decimal as module_3


def test_case_0():
    none_type_0 = None
    extended_encoder_0 = module_0._ExtendedEncoder(
        ensure_ascii=none_type_0, sort_keys=none_type_0, default=none_type_0
    )
    list_0 = [none_type_0, none_type_0]
    extended_encoder_1 = module_0._ExtendedEncoder()
    bytes_0 = b"'\x10\xbd\x0e\x1d\xa8\xdc\x82\xaa\xb2\x10S"
    extended_encoder_2 = module_0._ExtendedEncoder(
        skipkeys=bytes_0,
        ensure_ascii=bytes_0,
        check_circular=none_type_0,
        allow_nan=none_type_0,
        indent=none_type_0,
        default=none_type_0,
    )
    list_1 = extended_encoder_1.default(list_0)
    extended_encoder_3 = module_0._ExtendedEncoder(
        skipkeys=list_1, ensure_ascii=extended_encoder_1
    )
    module_0.FieldOverride()


def test_case_1():
    extended_encoder_0 = module_0._ExtendedEncoder()
    extended_encoder_0.default(extended_encoder_0)


def test_case_2():
    module_0.FieldOverride()


def test_case_3():
    field_a_b_c_0 = module_1.FieldABC()
    extended_encoder_0 = module_0._ExtendedEncoder(skipkeys=field_a_b_c_0)
    dict_0 = {field_a_b_c_0: field_a_b_c_0}
    dict_1 = extended_encoder_0.default(dict_0)
    field_a_b_c_0.serialize(extended_encoder_0, dict_0, dict_0)


def test_case_4():
    regex_flag_0 = module_2.RegexFlag.ASCII
    extended_encoder_0 = module_0._ExtendedEncoder(
        ensure_ascii=regex_flag_0, check_circular=regex_flag_0, sort_keys=regex_flag_0
    )
    int_0 = extended_encoder_0.default(regex_flag_0)


def test_case_5():
    decimal_0 = module_3.Decimal()
    extended_encoder_0 = module_0._ExtendedEncoder()
    str_0 = "default"
    extended_encoder_1 = module_0._ExtendedEncoder()
    str_1 = extended_encoder_1.default(decimal_0)
    str_2 = "FlSXWp+r2ycJ&d2"
    str_3 = "s&"
    list_0 = [str_0, str_2, str_2, str_3]
    module_0.FieldOverride(*list_0)
