# Automatically generated by Pynguin.
import pytest
import inspect as module_0
import yaml_resume.resume.experience as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    var_0 = module_0.stack()
    var_0.ask()

def test_case_1():
    float_0 = 1577.59
    experience_0 = module_1.Experience(float_0, float_0, float_0, float_0, float_0, float_0, float_0)
    assert f'{type(experience_0).__module__}.{type(experience_0).__qualname__}' == 'yaml_resume.resume.experience.Experience'
    assert experience_0.company == pytest.approx(1577.59, abs=0.01, rel=0.01)
    assert experience_0.position == pytest.approx(1577.59, abs=0.01, rel=0.01)
    assert experience_0.start_date == pytest.approx(1577.59, abs=0.01, rel=0.01)
    assert experience_0.end_date == pytest.approx(1577.59, abs=0.01, rel=0.01)
    assert experience_0.summary == pytest.approx(1577.59, abs=0.01, rel=0.01)
    assert experience_0.tags == pytest.approx(1577.59, abs=0.01, rel=0.01)
    assert experience_0.website == pytest.approx(1577.59, abs=0.01, rel=0.01)
    assert module_1.Experience.yaml_tag == 'Experience'