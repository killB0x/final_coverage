# Automatically generated by Pynguin.
import baybars.era as module_0

def test_case_0():
    var_0 = module_0.get_timestamp_in_string_format()
    assert var_0 == '20221012173744'
    assert module_0.DATETIME_FORMAT == '%Y%m%d%H%M%S'