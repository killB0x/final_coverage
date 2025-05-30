# Automatically generated by Pynguin.
import pytest
import json_schema_to_class as module_0
import re as module_1

def test_case_0():
    parser_0 = module_0.Parser()

def test_case_1():
    str_0 = 'zst'
    int_0 = -2968
    var_0 = module_0.indent_line(str_0, int_0)
    assert var_0 == 'zst'

def test_case_2():
    str_0 = 'JUw<mGeIM'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JUw<mGeIM'
    assert model_0.properties == []
    assert model_0.default == 'JUw<mGeIM'
    str_1 = model_0.to_class_code()
    assert str_1 == "class Juw<Mgeim:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JUw<mGeIM'"

def test_case_3():
    str_0 = 'v'
    array_0 = module_0.Array(str_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'v'
    assert array_0.properties == [None]
    assert array_0.default is None
    assert array_0.items is None

def test_case_4():
    str_0 = '@/E:'
    model_0 = module_0.Model(str_0)
    assert model_0.name == '@/E:'
    assert model_0.properties == []
    assert model_0.default == {}
    list_0 = model_0.inner_models()

def test_case_5():
    str_0 = ']!zarF$&?D/6K'
    definition_0 = module_0.Definition(str_0, str_0, str_0)
    assert f'{type(definition_0).__module__}.{type(definition_0).__qualname__}' == 'json_schema_to_class.Definition'
    assert definition_0.name == ']!zarF$&?D/6K'
    assert definition_0.path == ']!zarF$&?D/6K'
    assert definition_0.class_type == ']!zarF$&?D/6K'

def test_case_6():
    str_0 = 'JUw<mGeIM'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JUw<mGeIM'
    assert model_0.properties == []
    assert model_0.default == 'JUw<mGeIM'
    parser_0 = module_0.Parser()
    array_0 = module_0.Array(str_0, model_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'JUw<mGeIM'
    assert f'{type(array_0.properties).__module__}.{type(array_0.properties).__qualname__}' == 'builtins.list'
    assert len(array_0.properties) == 1
    assert array_0.default is None
    assert f'{type(array_0.items).__module__}.{type(array_0.items).__qualname__}' == 'json_schema_to_class.Model'
    str_1 = '$e'
    var_0 = array_0.to_init_code()
    assert var_0 == '        self.JUw<mGeIM = self.Juw<Mgeim(values=values.get("JUw<mGeIM"))'
    dict_0 = {str_1: str_1}
    str_2 = array_0.to_class_code()
    assert str_2 == "class Juw<Mgeim(list):\n    class Juw<Mgeim:\n        def __init__(self, values: dict = None):\n            values = values if values is not None else 'JUw<mGeIM'\n\n    def __init__(self, values: list = None):\n        super().__init__()\n        values = values if values is not None else []\n        self[:] = [self.Juw<Mgeim(value) for value in values]"
    str_3 = model_0.to_class_code()
    assert str_3 == "class Juw<Mgeim:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JUw<mGeIM'"
    str_4 = 'bi/Eljx2qn'
    model_1 = parser_0.parse_object(str_4, dict_0)
    assert model_1.default == {}
    with pytest.raises(ValueError):
        parser_0.parse_definition(str_3, dict_0)

def test_case_7():
    parser_0 = module_0.Parser()
    none_type_0 = None
    var_0 = module_0.indent_line(none_type_0, parser_0)
    assert var_0 == ''
    dict_0 = {}
    model_0 = parser_0.parse_object(parser_0, dict_0)
    assert f'{type(model_0.name).__module__}.{type(model_0.name).__qualname__}' == 'json_schema_to_class.Parser'
    assert model_0.properties == []
    assert model_0.default == {}
    list_0 = model_0.inner_models()

def test_case_8():
    str_0 = '__main__'
    definition_0 = module_0.Definition(str_0, str_0, str_0)
    assert f'{type(definition_0).__module__}.{type(definition_0).__qualname__}' == 'json_schema_to_class.Definition'
    assert definition_0.name == '__main__'
    assert definition_0.path == '__main__'
    assert definition_0.class_type == '__main__'
    int_0 = -470
    with pytest.raises(ValueError):
        definition_0.to_class_code(int_0)

def test_case_9():
    str_0 = ']!zarF$&?D/6K'
    definition_0 = module_0.Definition(str_0, str_0, str_0)
    assert f'{type(definition_0).__module__}.{type(definition_0).__qualname__}' == 'json_schema_to_class.Definition'
    assert definition_0.name == ']!zarF$&?D/6K'
    assert definition_0.path == ']!zarF$&?D/6K'
    assert definition_0.class_type == ']!zarF$&?D/6K'
    str_1 = definition_0.to_init_code()
    assert str_1 == '        self.]!zarF$&?D/6K = ]!Zarf$&?D/6K(values=values.get("]!zarF$&?D/6K"))'

def test_case_10():
    str_0 = 'JUw<mGeI'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JUw<mGeI'
    assert model_0.properties == []
    assert model_0.default == 'JUw<mGeI'
    parser_0 = module_0.Parser()
    str_1 = model_0.to_class_code()
    assert str_1 == "class Juw<Mgei:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JUw<mGeI'"
    array_0 = module_0.Array(str_0, model_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'JUw<mGeI'
    assert f'{type(array_0.properties).__module__}.{type(array_0.properties).__qualname__}' == 'builtins.list'
    assert len(array_0.properties) == 1
    assert array_0.default is None
    assert f'{type(array_0.items).__module__}.{type(array_0.items).__qualname__}' == 'json_schema_to_class.Model'
    assert module_0.Array.use_list is False
    str_2 = 'e'
    item_0 = module_0.Item(str_1)
    assert item_0.name == "class Juw<Mgei:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JUw<mGeI'"
    var_0 = module_1.findall(str_2, str_0)
    basic_0 = module_0.Basic(str_2, var_0)
    assert f'{type(basic_0).__module__}.{type(basic_0).__qualname__}' == 'json_schema_to_class.Basic'
    assert basic_0.name == 'e'
    assert basic_0.type == ['e']
    assert basic_0.default is None
    list_0 = array_0.inner_models()
    dict_0 = {str_2: str_2}
    var_1 = basic_0.is_inner_model()
    with pytest.raises(ValueError):
        parser_0.parse_definition(item_0, dict_0)

def test_case_11():
    str_0 = 'JUw<mGeIM'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JUw<mGeIM'
    assert model_0.properties == []
    assert model_0.default == 'JUw<mGeIM'
    array_0 = module_0.Array(str_0, model_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'JUw<mGeIM'
    assert f'{type(array_0.properties).__module__}.{type(array_0.properties).__qualname__}' == 'builtins.list'
    assert len(array_0.properties) == 1
    assert array_0.default is None
    assert f'{type(array_0.items).__module__}.{type(array_0.items).__qualname__}' == 'json_schema_to_class.Model'
    assert module_0.Array.use_list is False
    var_0 = module_1.findall(str_0, str_0)
    basic_0 = module_0.Basic(var_0, var_0)
    assert f'{type(basic_0).__module__}.{type(basic_0).__qualname__}' == 'json_schema_to_class.Basic'
    assert basic_0.name == ['JUw<mGeIM']
    assert basic_0.type == ['JUw<mGeIM']
    assert basic_0.default is None
    list_0 = array_0.inner_models()

def test_case_12():
    str_0 = '@/E:'
    model_0 = module_0.Model(str_0)
    assert model_0.name == '@/E:'
    assert model_0.properties == []
    assert model_0.default == {}
    str_1 = model_0.to_class_code()
    assert str_1 == 'class @/E::\n    def __init__(self, values: dict = None):\n        values = values if values is not None else {}'
    str_2 = model_0.to_init_code()
    assert str_2 == '        self.@/E: = self.@/E:(values=values.get("@/E:"))'

def test_case_13():
    str_0 = 'JUw<mGeIM'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JUw<mGeIM'
    assert model_0.properties == []
    assert model_0.default == 'JUw<mGeIM'
    array_0 = module_0.Array(str_0, model_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'JUw<mGeIM'
    assert f'{type(array_0.properties).__module__}.{type(array_0.properties).__qualname__}' == 'builtins.list'
    assert len(array_0.properties) == 1
    assert array_0.default is None
    assert f'{type(array_0.items).__module__}.{type(array_0.items).__qualname__}' == 'json_schema_to_class.Model'
    assert module_0.Array.use_list is False
    list_0 = array_0.inner_models()

def test_case_14():
    str_0 = 'v'
    array_0 = module_0.Array(str_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'v'
    assert array_0.properties == [None]
    assert array_0.default is None
    assert array_0.items is None
    assert module_0.Array.use_list is False
    str_1 = array_0.to_init_code()
    assert str_1 == '        self.v = self.V(values=values.get("v"))'

@pytest.mark.xfail(strict=True)
def test_case_15():
    str_0 = 'k\\\rE'
    array_0 = module_0.Array(str_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'k\\\rE'
    assert array_0.properties == [None]
    assert array_0.default is None
    assert array_0.items is None
    assert module_0.Array.use_list is False
    str_1 = '@/E:'
    model_0 = module_0.Model(str_1)
    assert model_0.name == '@/E:'
    assert model_0.default == {}
    module_0.generate_file(str_0, model_0)

def test_case_16():
    parser_0 = module_0.Parser()
    dict_0 = {parser_0: parser_0, parser_0: parser_0, parser_0: parser_0}
    model_0 = parser_0.parse_object(parser_0, dict_0)
    assert f'{type(model_0.name).__module__}.{type(model_0.name).__qualname__}' == 'json_schema_to_class.Parser'
    assert model_0.properties == []
    assert model_0.default == {}

def test_case_17():
    parser_0 = module_0.Parser()
    str_0 = 't$e'
    dict_0 = {str_0: parser_0, str_0: parser_0}
    with pytest.raises(ValueError):
        parser_0.parse_definition(parser_0, dict_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    parser_0 = module_0.Parser()
    dict_0 = {parser_0: parser_0, parser_0: parser_0, parser_0: parser_0, parser_0: parser_0}
    parser_0.parse(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_19():
    parser_0 = module_0.Parser()
    parser_0.generate()

@pytest.mark.xfail(strict=True)
def test_case_20():
    parser_0 = module_0.Parser()
    str_0 = 'ZC#4$KozIiH{hp $;F<X'
    basic_0 = module_0.Basic(str_0, str_0)
    assert f'{type(basic_0).__module__}.{type(basic_0).__qualname__}' == 'json_schema_to_class.Basic'
    assert basic_0.name == 'ZC#4$KozIiH{hp $;F<X'
    assert basic_0.type == 'ZC#4$KozIiH{hp $;F<X'
    assert basic_0.default is None
    basic_0.to_init_code()

def test_case_21():
    str_0 = 'JUw<mGeIM'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JUw<mGeIM'
    assert model_0.properties == []
    assert model_0.default == 'JUw<mGeIM'
    parser_0 = module_0.Parser()
    dict_0 = {}
    array_0 = module_0.Array(str_0, model_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'JUw<mGeIM'
    assert f'{type(array_0.properties).__module__}.{type(array_0.properties).__qualname__}' == 'builtins.list'
    assert len(array_0.properties) == 1
    assert array_0.default is None
    assert f'{type(array_0.items).__module__}.{type(array_0.items).__qualname__}' == 'json_schema_to_class.Model'
    str_1 = '$e'
    var_0 = array_0.to_init_code()
    assert var_0 == '        self.JUw<mGeIM = self.Juw<Mgeim(values=values.get("JUw<mGeIM"))'
    basic_0 = module_0.Basic(str_1, var_0)
    assert f'{type(basic_0).__module__}.{type(basic_0).__qualname__}' == 'json_schema_to_class.Basic'
    assert basic_0.name == '$e'
    assert basic_0.type == '        self.JUw<mGeIM = self.Juw<Mgeim(values=values.get("JUw<mGeIM"))'
    assert basic_0.default is None
    str_2 = basic_0.to_list_code()
    assert str_2 == '        self[:] = values'
    list_0 = array_0.inner_models()
    dict_1 = {str_1: str_1}
    str_3 = array_0.to_class_code()
    assert str_3 == "class Juw<Mgeim(list):\n    class Juw<Mgeim:\n        def __init__(self, values: dict = None):\n            values = values if values is not None else 'JUw<mGeIM'\n\n    def __init__(self, values: list = None):\n        super().__init__()\n        values = values if values is not None else []\n        self[:] = [self.Juw<Mgeim(value) for value in values]"
    str_4 = 'bi/Eljx2qn'
    model_1 = parser_0.parse_object(str_4, dict_0)
    assert model_1.default == {}
    with pytest.raises(ValueError):
        parser_0.parse_definition(str_1, dict_1)

@pytest.mark.xfail(strict=True)
def test_case_22():
    parser_0 = module_0.Parser()
    dict_0 = {parser_0: parser_0}
    model_0 = parser_0.parse_object(parser_0, dict_0)
    assert f'{type(model_0.name).__module__}.{type(model_0.name).__qualname__}' == 'json_schema_to_class.Parser'
    assert model_0.properties == []
    assert model_0.default == {}
    str_0 = '@'
    str_1 = '2:ZHb}D'
    parser_0.parse_array(str_1, str_0)

def test_case_23():
    str_0 = 'z~X\r[^!h'
    str_1 = ':&QaP<JQ!)HBDD'
    definition_0 = module_0.Definition(str_0, str_1, str_0)
    assert f'{type(definition_0).__module__}.{type(definition_0).__qualname__}' == 'json_schema_to_class.Definition'
    assert definition_0.name == 'z~X\r[^!h'
    assert definition_0.path == 'z~X\r[^!h'
    assert definition_0.class_type == ':&QaP<JQ!)HBDD'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'z~X\r[^!h'
    assert model_0.properties == []
    assert model_0.default == 'z~X\r[^!h'
    parser_0 = module_0.Parser()
    dict_0 = {model_0: model_0, model_0: model_0}
    array_0 = module_0.Array(str_1, model_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == ':&QaP<JQ!)HBDD'
    assert f'{type(array_0.properties).__module__}.{type(array_0.properties).__qualname__}' == 'builtins.list'
    assert len(array_0.properties) == 1
    assert array_0.default is None
    assert f'{type(array_0.items).__module__}.{type(array_0.items).__qualname__}' == 'json_schema_to_class.Model'
    assert module_0.Array.use_list is False
    str_2 = definition_0.to_list_code()
    assert str_2 == '        self[:] = [:&Qap<Jq!)Hbdd(value) for value in values]'
    str_3 = '$e'
    var_0 = array_0.to_init_code()
    assert var_0 == '        self.:&QaP<JQ!)HBDD = self.:&Qap<Jq!)Hbdd(values=values.get(":&QaP<JQ!)HBDD"))'
    list_0 = array_0.inner_models()
    dict_1 = {str_3: str_3}
    str_4 = array_0.to_class_code()
    assert str_4 == "class :&Qap<Jq!)Hbdd(list):\n    class Z~X\n    [^!H:\n        def __init__(self, values: dict = None):\n            values = values if values is not None else 'z~X\\r[^!h'\n\n    def __init__(self, values: list = None):\n        super().__init__()\n        values = values if values is not None else []\n        self[:] = [self.Z~X\n[^!H(value) for value in values]"
    model_1 = parser_0.parse_object(str_1, dict_0)
    assert model_1.default == {}
    with pytest.raises(ValueError):
        parser_0.parse_definition(str_2, dict_1)

def test_case_24():
    str_0 = 'json_schema_to_class'
    item_0 = module_0.Item(str_0)
    with pytest.raises(NotImplementedError):
        item_0.to_list_code()

@pytest.mark.xfail(strict=True)
def test_case_25():
    str_0 = 'JUw<mGeIM'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JUw<mGeIM'
    assert model_0.properties == []
    assert model_0.default == 'JUw<mGeIM'
    parser_0 = module_0.Parser()
    dict_0 = {}
    str_1 = model_0.to_class_code()
    assert str_1 == "class Juw<Mgeim:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JUw<mGeIM'"
    model_1 = parser_0.parse_object(parser_0, dict_0)
    assert model_1.default == {}
    str_2 = 't$e'
    var_0 = module_1.findall(str_2, str_0)
    basic_0 = module_0.Basic(str_2, var_0)
    assert f'{type(basic_0).__module__}.{type(basic_0).__qualname__}' == 'json_schema_to_class.Basic'
    assert basic_0.name == 't$e'
    assert basic_0.type == []
    assert basic_0.default is None
    list_0 = model_1.inner_models()
    bool_0 = True
    basic_0.to_class_code(bool_0)

def test_case_26():
    str_0 = 'json_schema_to_class'
    item_0 = module_0.Item(str_0)
    with pytest.raises(NotImplementedError):
        item_0.to_init_code()

def test_case_27():
    str_0 = 'JUw<mGeIM'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JUw<mGeIM'
    assert model_0.properties == []
    assert model_0.default == 'JUw<mGeIM'
    parser_0 = module_0.Parser()
    dict_0 = {}
    str_1 = model_0.to_class_code()
    assert str_1 == "class Juw<Mgeim:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JUw<mGeIM'"
    model_1 = parser_0.parse_object(parser_0, dict_0)
    assert model_1.default == {}
    str_2 = 'e'
    item_0 = module_0.Item(str_1)
    assert item_0.name == "class Juw<Mgeim:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JUw<mGeIM'"
    var_0 = module_1.findall(str_2, str_0)
    list_0 = model_1.inner_models()
    item_1 = module_0.Item(var_0)
    with pytest.raises(NotImplementedError):
        item_0.to_class_code(parser_0)

def test_case_28():
    str_0 = 'JVw<mGeIM'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JVw<mGeIM'
    assert model_0.properties == []
    assert model_0.default == 'JVw<mGeIM'
    parser_0 = module_0.Parser()
    str_1 = model_0.to_class_code()
    assert str_1 == "class Jvw<Mgeim:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JVw<mGeIM'"
    array_0 = module_0.Array(str_0, model_0, str_1)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'JVw<mGeIM'
    assert f'{type(array_0.properties).__module__}.{type(array_0.properties).__qualname__}' == 'builtins.list'
    assert len(array_0.properties) == 1
    assert array_0.default == "class Jvw<Mgeim:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JVw<mGeIM'"
    assert f'{type(array_0.items).__module__}.{type(array_0.items).__qualname__}' == 'json_schema_to_class.Model'
    assert module_0.Array.use_list is False
    var_0 = array_0.to_init_code()
    assert var_0 == '        self.JVw<mGeIM = self.Jvw<Mgeim(values=values.get("JVw<mGeIM"))'
    dict_0 = {str_1: str_1}
    str_2 = array_0.to_class_code()
    assert str_2 == 'class Jvw<Mgeim(list):\n    class Jvw<Mgeim:\n        def __init__(self, values: dict = None):\n            values = values if values is not None else \'JVw<mGeIM\'\n\n    def __init__(self, values: list = None):\n        super().__init__()\n        values = values if values is not None else "class Jvw<Mgeim:\\n    def __init__(self, values: dict = None):\\n        values = values if values is not None else \'JVw<mGeIM\'"\n        self[:] = [self.Jvw<Mgeim(value) for value in values]'
    model_1 = parser_0.parse_object(array_0, dict_0)
    assert model_1.default == {}
    with pytest.raises(ValueError):
        parser_0.parse_definition(var_0, dict_0)

@pytest.mark.xfail(strict=True)
def test_case_29():
    str_0 = 'JUw<cmGeIM'
    model_0 = module_0.Model(str_0, str_0)
    assert f'{type(model_0).__module__}.{type(model_0).__qualname__}' == 'json_schema_to_class.Model'
    assert model_0.name == 'JUw<cmGeIM'
    assert model_0.properties == []
    assert model_0.default == 'JUw<cmGeIM'
    var_0 = model_0.type_name()
    assert var_0 == 'Juw<Cmgeim'
    parser_0 = module_0.Parser()
    str_1 = 'hI0"yUwf~oJ'
    definition_0 = module_0.Definition(str_0, str_0, str_1)
    assert f'{type(definition_0).__module__}.{type(definition_0).__qualname__}' == 'json_schema_to_class.Definition'
    assert definition_0.name == 'JUw<cmGeIM'
    assert definition_0.path == 'hI0"yUwf~oJ'
    assert definition_0.class_type == 'JUw<cmGeIM'
    str_2 = model_0.to_class_code()
    assert str_2 == "class Juw<Cmgeim:\n    def __init__(self, values: dict = None):\n        values = values if values is not None else 'JUw<cmGeIM'"
    array_0 = module_0.Array(str_0, definition_0)
    assert f'{type(array_0).__module__}.{type(array_0).__qualname__}' == 'json_schema_to_class.Array'
    assert array_0.name == 'JUw<cmGeIM'
    assert f'{type(array_0.properties).__module__}.{type(array_0.properties).__qualname__}' == 'builtins.list'
    assert len(array_0.properties) == 1
    assert array_0.default is None
    assert f'{type(array_0.items).__module__}.{type(array_0.items).__qualname__}' == 'json_schema_to_class.Definition'
    assert module_0.Array.use_list is False
    str_3 = 'nre'
    var_1 = array_0.to_init_code()
    assert var_1 == '        self.JUw<cmGeIM = self.Juw<Cmgeim(values=values.get("JUw<cmGeIM"))'
    basic_0 = module_0.Basic(str_3, var_1)
    assert f'{type(basic_0).__module__}.{type(basic_0).__qualname__}' == 'json_schema_to_class.Basic'
    assert basic_0.name == 'nre'
    assert basic_0.type == '        self.JUw<cmGeIM = self.Juw<Cmgeim(values=values.get("JUw<cmGeIM"))'
    assert basic_0.default is None
    list_0 = array_0.inner_models()
    str_4 = array_0.to_class_code()
    assert str_4 == 'class Juw<Cmgeim(list):\n    def __init__(self, values: list = None):\n        super().__init__()\n        values = values if values is not None else []\n        self[:] = [Juw<Cmgeim(value) for value in values]'
    str_5 = 'v]k4gSX_<:MY__E]@Nz'
    parser_0.parse_object(str_5, var_1)