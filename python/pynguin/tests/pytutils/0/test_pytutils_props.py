# Automatically generated by Pynguin.
import pytutils.props as module_0


def test_case_0():
    int_0 = -2523
    setterproperty_0 = module_0.setterproperty(int_0, int_0)


def test_case_1():
    int_0 = -2533
    setterproperty_0 = module_0.setterproperty(int_0)


def test_case_2():
    str_0 = "?_wh2Z~p:OHYCUhY"
    module_0.lazyclassproperty(str_0)


def test_case_3():
    str_0 = "#0wv5t\nE}#z\n4O"
    roclassproperty_0 = module_0.roclassproperty(str_0)


def test_case_4():
    bytes_0 = b"\x0e\xbe\xd6r\xe0\x8a%\x8f\xf1\xe6 \xa45\x96\xf4+\xd4"
    setterproperty_0 = module_0.setterproperty(bytes_0)
    roclassproperty_0 = module_0.roclassproperty(setterproperty_0)
    roclassproperty_1 = module_0.roclassproperty(roclassproperty_0)
    bytes_1 = b"\xe2\x06P\xa1\xd1#\x15\xb3d\xa4\x94\xbf\xfc9\x0c"
    roclassproperty_2 = module_0.roclassproperty(bytes_1)
    roclassproperty_2.__get__(roclassproperty_1, roclassproperty_0)


def test_case_5():
    none_type_0 = None
    roclassproperty_0 = module_0.lazyperclassproperty(none_type_0)
    setterproperty_0 = module_0.setterproperty(none_type_0)
    setterproperty_0.__set__(setterproperty_0, none_type_0)


def test_case_6():
    str_0 = "yLV,IERc'\\cLxz\x0bfQ40R"
    roclassproperty_0 = module_0.lazyperclassproperty(str_0)
