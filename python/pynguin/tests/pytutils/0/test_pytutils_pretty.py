# Automatically generated by Pynguin.
import ast as module_0
import pytutils.pretty as module_1
import re as module_2


def test_case_0():
    not_in_0 = module_0.NotIn()
    none_type_0 = module_1.pp(not_in_0)


def test_case_1():
    regex_flag_0 = module_2.RegexFlag.VERBOSE
    str_0 = module_1.pf(regex_flag_0)


def test_case_2():
    none_type_0 = None
    precedence_0 = module_0._Precedence.POWER
    str_0 = module_1.pf(none_type_0)
    module_1.pp(none_type_0, precedence_0, outfile=str_0)


def test_case_3():
    delete_0 = module_0.Delete()
    module_1.pp(delete_0, outfile=delete_0)


def test_case_4():
    str_0 = ""
    dict_0 = {str_0: str_0, str_0: str_0}
    str_1 = module_1.pf(str_0)
    not_in_0 = module_0.NotIn(**dict_0)
    none_type_0 = module_1.pp(str_0, outfile=str_1)
    none_type_1 = module_1.pp(dict_0)
