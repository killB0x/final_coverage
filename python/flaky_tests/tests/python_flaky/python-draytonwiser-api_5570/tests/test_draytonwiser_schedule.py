# Automatically generated by Pynguin.
import draytonwiser.schedule as module_0

def test_case_0():
    set_point_0 = module_0.SetPoint()

def test_case_1():
    schedule_0 = module_0.Schedule()
    assert schedule_0.id is None
    assert schedule_0.type is None
    assert schedule_0.monday is None
    assert schedule_0.tuesday is None
    assert schedule_0.wednesday is None
    assert schedule_0.thursday is None
    assert schedule_0.friday is None
    assert schedule_0.saturday is None
    assert schedule_0.api_secret == ''
    assert schedule_0.wiser_hub_ip == ''
    assert schedule_0.use_cache is True
    assert schedule_0.refresh_interval == 5
    var_0 = schedule_0.update_cache()