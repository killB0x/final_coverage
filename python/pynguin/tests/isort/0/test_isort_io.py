# Automatically generated by Pynguin.
import isort.io as module_0
import builtins as module_1
import collections as module_2


def test_case_0():
    empty_i_o_0 = module_0._EmptyIO()


def test_case_1():
    none_type_0 = None
    exception_0 = module_1.Exception()
    counter_0 = module_2.Counter()
    str_0 = "J'.ArA)O"
    file_0 = module_0.File(exception_0, counter_0, str_0)
    file_0.from_contents(none_type_0, none_type_0)


def test_case_2():
    empty_i_o_0 = module_0._EmptyIO()
    none_type_0 = empty_i_o_0.write()
    file_0 = module_0.File(none_type_0, none_type_0, none_type_0)
    file_0.detect_encoding(none_type_0, none_type_0)


def test_case_3():
    empty_i_o_0 = module_0._EmptyIO()
    file_0 = module_0.File(empty_i_o_0, empty_i_o_0, empty_i_o_0)
    file_0.detect_encoding(empty_i_o_0, empty_i_o_0)
