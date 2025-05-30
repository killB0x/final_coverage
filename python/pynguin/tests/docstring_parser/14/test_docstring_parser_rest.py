# Automatically generated by Pynguin.
import docstring_parser.rest as module_0
import docstring_parser.common as module_1


def test_case_0():
    str_0 = "Numpydoc section parser.\n\n    :param title: section title. For most sections, this is a heading like\n                  \"Parameters\" which appears on its own line, underlined by\n                  en-dashes ('-') on the following line.\n    :param key: meta key string. In the parsed ``DocstringMeta`` instance this\n                will be the first element of the ``args`` attribute list.\n    "
    docstring_0 = module_0.parse(str_0)


def test_case_1():
    str_0 = "Parse the numpy-style docstring into its components.\n\n        :returns: parsed docstring\n        "
    docstring_0 = module_0.parse(str_0)


def test_case_2():
    str_0 = "C;O!9B+{x~E^M'nm|"
    docstring_0 = module_0.parse(str_0)


def test_case_3():
    str_0 = ""
    docstring_0 = module_0.parse(str_0)
    str_1 = "XK<MC]h-<1Q$*!,G9{W"
    docstring_1 = module_0.parse(str_1)
    str_2 = "]\x0c$o>"
    docstring_2 = module_0.parse(str_2)


def test_case_4():
    str_0 = ":("
    module_0.parse(str_0)


def test_case_5():
    str_0 = 'P*rse th" docstring into its components.\n\n    :param tex\t: docstring texY to pars\n   :paam style: docstring style\n    :returns:parsed docstring representation\n    '
    docstring_0 = module_0.parse(str_0)


def test_case_6():
    str_0 = "Regular expression pattern matching this section's header.\n\n        This pattern will match this instance's ``title`` attribute in\n        an anonymous group.\n        "
    str_1 = "\n"
    str_2 = "Parse the docstring into its components.\n\n    :param text: docstring text to parse\n    :param style: docstring style\n    :returns: parsed docstring representation\n    "
    docstring_0 = module_0.parse(str_2)
    str_3 = "!bs[.M"
    str_4 = "?D/D{1\tI7,oIx"
    docstring_1 = module_0.parse(str_4)
    docstring_2 = module_0.parse(str_1)
    docstring_3 = module_1.Docstring()
    docstring_4 = module_0.parse(str_3)
    docstring_5 = module_0.parse(str_0)
    docstring_6 = module_1.Docstring()
    str_5 = 'Dab|/|@"a{-\n:xdmo46'
    module_0.parse(str_5)
