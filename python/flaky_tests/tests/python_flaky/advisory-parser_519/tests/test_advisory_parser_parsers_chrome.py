# Automatically generated by Pynguin.
import pytest
import advisory_parser.parsers.chrome as module_0
import advisory_parser.exceptions as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    module_0.parse_chrome_advisory(none_type_0)

def test_case_1():
    str_0 = '\nhttps://code.google.com/p/chromium/issues/detail?id='
    with pytest.raises(module_1.AdvisoryParserTextException):
        module_0.parse_chrome_advisory(str_0)