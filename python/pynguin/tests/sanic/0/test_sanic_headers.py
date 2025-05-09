# Automatically generated by Pynguin.
import sanic.headers as module_0
import re as module_1
import enum as module_2
import builtins as module_3


def test_case_0():
    str_0 = "I}j51gNK3LG%..P(|"
    tuple_0 = module_0.parse_content_header(str_0)


def test_case_1():
    bytes_0 = b"\x0b+"
    module_0.fwd_normalize(bytes_0)


def test_case_2():
    dict_0 = {}
    dict_1 = module_0.fwd_normalize(dict_0)


def test_case_3():
    str_0 = "D\t7\ryl,Q6}"
    str_1 = module_0.fwd_normalize_address(str_0)


def test_case_4():
    str_0 = "L&F*`,(ODu+_"
    tuple_0 = module_0.parse_host(str_0)


def test_case_5():
    regex_flag_0 = module_1.RegexFlag.DEBUG
    module_0.parse_xforwarded(regex_flag_0, regex_flag_0)


def test_case_6():
    str_0 = "J;A]J.><g|DN\tR@"
    str_1 = module_0.fwd_normalize_address(str_0)
    str_2 = "#"
    tuple_0 = module_0.parse_content_header(str_2)
    tuple_1 = module_0.parse_host(str_2)
    tuple_2 = module_0.parse_host(str_2)
    tuple_3 = module_0.parse_content_header(str_2)
    int_0 = 203
    none_type_0 = None
    float_0 = -432.0
    tuple_4 = ()
    tuple_5 = (none_type_0, float_0, tuple_2, tuple_4)
    module_0.format_http1_response(int_0, tuple_5)


def test_case_7():
    str_0 = "~p}zcM\x0c>F;C1~iEC\n\x0bJr"
    tuple_0 = module_0.parse_content_header(str_0)


def test_case_8():
    enum_dict_0 = module_2._EnumDict()
    int_0 = 410
    bytes_0 = module_0.format_http1_response(int_0, enum_dict_0)


def test_case_9():
    str_0 = "_I\\LE\x0c!Bi=\x0b"
    str_1 = module_0.fwd_normalize_address(str_0)


def test_case_10():
    str_0 = "SameSite"
    tuple_0 = module_0.parse_host(str_0)
    str_1 = "o["
    set_0 = {str_1, tuple_0, tuple_0, str_1}
    dict_0 = module_0.fwd_normalize(set_0)


def test_case_11():
    str_0 = "Mm"
    tuple_0 = module_0.parse_host(str_0)


def test_case_12():
    str_0 = ".p"
    dict_0 = {str_0: str_0}
    dict_1 = module_0.fwd_normalize(dict_0)


def test_case_13():
    str_0 = "FR:5"
    str_1 = module_0.fwd_normalize_address(str_0)
    tuple_0 = module_0.parse_content_header(str_0)
    set_0 = set()
    dict_0 = module_0.fwd_normalize(set_0)
    tuple_1 = module_0.parse_host(str_0)
    str_2 = "?U|TSE3iX"
    tuple_2 = module_0.parse_content_header(str_2)
    tuple_3 = module_0.parse_host(str_0)
    tuple_4 = module_0.parse_host(str_0)
    int_0 = 52
    none_type_0 = None
    module_0.format_http1_response(int_0, none_type_0)


def test_case_14():
    str_0 = ";S=!"
    tuple_0 = module_0.parse_content_header(str_0)


def test_case_15():
    str_0 = "unknown"
    tuple_0 = module_0.parse_content_header(str_0)
    module_0.fwd_normalize_address(str_0)


def test_case_16():
    none_type_0 = None
    tuple_0 = (none_type_0, none_type_0)
    list_0 = [tuple_0, tuple_0]
    exception_0 = module_3.Exception(*list_0)
    tuple_1 = (list_0, exception_0)
    list_1 = [tuple_1, none_type_0, tuple_0, tuple_1]
    module_0.fwd_normalize(list_1)


def test_case_17():
    str_0 = "SameS3ite"
    tuple_0 = module_0.parse_host(str_0)
    tuple_1 = module_0.parse_host(str_0)
    tuple_2 = module_0.parse_content_header(str_0)
    str_1 = "path"
    tuple_3 = module_0.parse_content_header(str_1)
    str_2 = "tU"
    str_3 = module_0.fwd_normalize_address(str_2)
    str_4 = "GP%"
    tuple_4 = module_0.parse_content_header(str_4)
    str_5 = module_0.fwd_normalize_address(str_0)
    tuple_5 = module_0.parse_content_header(str_4)
    list_0 = [str_2, tuple_3]
    module_0.fwd_normalize(list_0)


def test_case_18():
    str_0 = "port"
    tuple_0 = module_0.parse_content_header(str_0)
    str_1 = "tU"
    list_0 = [str_1, tuple_0]
    module_0.fwd_normalize(list_0)


def test_case_19():
    str_0 = "Parse content-type and content-disposition header values.\n\n    E.g. 'form-data; name=upload; filename=\"file.txt\"' to\n    ('form-data', {'name': 'upload', 'filename': 'file.txt'})\n\n    Mostly identical to cgi.parse_header and werkzeug.parse_options_header\n    but runs faster and handles special characters better. Unescapes quotes.\n    "
    tuple_0 = module_0.parse_content_header(str_0)
