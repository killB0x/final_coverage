# Automatically generated by Pynguin.
import codetiming._timers as module_0


def test_case_0():
    timers_0 = module_0.Timers()


def test_case_1():
    str_0 = "\x0cGo_jB''`nT<d`wNr8"
    timers_0 = module_0.Timers()
    timers_0.max(str_0)


def test_case_2():
    str_0 = "Timer"
    timers_0 = module_0.Timers()
    timers_0.stdev(str_0)


def test_case_3():
    none_type_0 = None
    timers_0 = module_0.Timers()
    float_0 = -1974.606
    timers_0.add(none_type_0, float_0)
    float_1 = timers_0.max(none_type_0)


def test_case_4():
    dict_0 = {}
    timers_0 = module_0.Timers(**dict_0)
    timers_0.clear()


def test_case_5():
    str_0 = "Timer"
    float_0 = 477.7604
    timers_0 = module_0.Timers()
    timers_0.__setitem__(str_0, float_0)


def test_case_6():
    str_0 = "Definition of Timer\n\nSee help(codetiming) for quick instructions, and\nhttps://pypi.org/project/codetiming/ for more details.\n"
    timers_0 = module_0.Timers()
    timers_0.count(str_0)


def test_case_7():
    str_0 = ""
    timers_0 = module_0.Timers()
    timers_0.total(str_0)


def test_case_8():
    str_0 = "Definition of Timer\n\nSee help(codetiming) for quick instructions, and\nhttps://pypi.org/project/codetiming/ for more details.\n"
    timers_0 = module_0.Timers()
    timers_0.min(str_0)


def test_case_9():
    none_type_0 = None
    float_0 = 2300.334
    timers_0 = module_0.Timers()
    timers_0.add(none_type_0, float_0)
    float_1 = timers_0.mean(none_type_0)


def test_case_10():
    none_type_0 = None
    timers_0 = module_0.Timers()
    float_0 = -1984.382718365479
    timers_0.add(none_type_0, float_0)
    float_1 = timers_0.median(none_type_0)


def test_case_11():
    none_type_0 = None
    float_0 = 2300.334
    timers_0 = module_0.Timers()
    timers_0.add(none_type_0, float_0)
    float_1 = timers_0.mean(none_type_0)
    float_2 = timers_0.stdev(none_type_0)


def test_case_12():
    none_type_0 = None
    none_type_1 = None
    float_0 = -1269.934285578379
    list_0 = [none_type_0]
    timers_0 = module_0.Timers(*list_0)
    timers_0.add(none_type_1, float_0)
    float_1 = timers_0.max(none_type_0)
    float_2 = -1984.382718365479
    timers_0.add(none_type_0, float_2)
    timers_1 = module_0.Timers()
    none_type_2 = None
    float_3 = timers_0.stdev(none_type_2)
    timers_1.total(none_type_1)


def test_case_13():
    str_0 = "Definition of Timer\n\nSee help(codetiming) for quick instructions, and\nhttps://pypi.org/project/codetiming/ for more details.\n"
    timers_0 = module_0.Timers()
    float_0 = 1691.41
    timers_0.add(str_0, float_0)
    float_1 = timers_0.min(str_0)
