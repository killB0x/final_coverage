# Automatically generated by Pynguin.
import pytest
import identixone.api.sources.v1.sources as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    sources_0 = module_0.Sources(none_type_0)
    str_0 = '{RQ\\?}w[K9HkY@'
    dict_0 = {str_0: str_0}
    sources_0.list(**dict_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'z3YGSa$"b'
    bool_0 = True
    sources_0 = module_0.Sources(bool_0)
    sources_0.get(str_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    dict_0 = {}
    sources_0 = module_0.Sources(dict_0)
    bool_0 = False
    bool_1 = True
    none_type_0 = None
    sources_0.create(bool_0, dict_0, dict_0, auto_create_on_ha=dict_0, auto_check_face_angle=bool_1, auto_create_check_exp=dict_0, manual_create_liveness_only=none_type_0, manual_check_liveness=bool_1)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = 'T+X\n\\hTr\tf.CgEME\x0bC2'
    str_1 = '\x0b"k;#G5{h8/nV\n)\nTN|'
    str_2 = '/Gj*LW|@DY\x0c;\r`Y_7|N$'
    dict_0 = {str_1: str_1, str_2: str_0}
    str_3 = ')'
    sources_0 = module_0.Sources(str_3)
    sources_0.update(str_0, **dict_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = 'i=%Lgb&ZPN)"l!\x0c0Ne'
    sources_0 = module_0.Sources(str_0)
    sources_0.delete(str_0)