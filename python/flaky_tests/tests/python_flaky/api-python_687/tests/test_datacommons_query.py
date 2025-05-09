# Automatically generated by Pynguin.
import pytest
import datacommons.query as module_0
import re as module_1
import codecs as module_2

def test_case_0():
    none_type_0 = None
    with pytest.raises(ValueError):
        module_0.query(none_type_0)

def test_case_1():
    str_0 = '\nSELECT  ?name ?dcid\nWHERE {\n  ?a typeOf Place .\n  ?a name ?name .\n  ?a dcid ("geoId/06" "geoId/21" "geoId/24") .\n  ?a dcid ?dcid\n}\n'
    var_0 = module_0.query(str_0)
    with pytest.raises(ValueError):
        module_0.query(var_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = '\nSELECT  ?name ?dcid\nWHERE {\n  ?a typeOf Place .\n  ?a name ?name .\n  ?a dcid ("geoId/06" "geoId/21" "geoId/24") .\n  ?a dcid ?dcid\n}\n'
    var_0 = module_1.escape(str_0)
    var_1 = module_2.BufferedIncrementalDecoder()
    module_0.query(str_0, var_0)