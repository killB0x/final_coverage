# Automatically generated by Pynguin.
import yaml_resume.resume.degree as module_0

def test_case_0():
    str_0 = '3Hc'
    degree_0 = module_0.Degree(str_0, str_0, str_0, str_0, str_0)
    assert f'{type(degree_0).__module__}.{type(degree_0).__qualname__}' == 'yaml_resume.resume.degree.Degree'
    assert degree_0.institution == '3Hc'
    assert degree_0.degree == '3Hc'
    assert degree_0.start_date == '3Hc'
    assert degree_0.end_date == '3Hc'
    assert degree_0.website == '3Hc'
    assert module_0.Degree.yaml_tag == 'Degree'