# Automatically generated by Pynguin.
import pytest
import aeneas.syncmap.smfttml as module_0
import platform as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    sync_map_format_t_t_m_l_0 = module_0.SyncMapFormatTTML()
    assert module_0.SyncMapFormatTTML.TAG == 'SyncMapFormatTTML'
    assert module_0.SyncMapFormatTTML.TTML == 'ttml'
    assert module_0.SyncMapFormatTTML.DFXP == 'dfxp'
    assert module_0.SyncMapFormatTTML.DEFAULT == 'ttml'
    sync_map_format_t_t_m_l_0.format(sync_map_format_t_t_m_l_0)

def test_case_1():
    sync_map_format_t_t_m_l_0 = module_0.SyncMapFormatTTML()
    assert module_0.SyncMapFormatTTML.TAG == 'SyncMapFormatTTML'
    assert module_0.SyncMapFormatTTML.TTML == 'ttml'
    assert module_0.SyncMapFormatTTML.DFXP == 'dfxp'
    assert module_0.SyncMapFormatTTML.DEFAULT == 'ttml'

@pytest.mark.xfail(strict=True)
def test_case_2():
    var_0 = module_1.uname()
    sync_map_format_t_t_m_l_0 = module_0.SyncMapFormatTTML(var_0, var_0, var_0)
    assert module_0.SyncMapFormatTTML.TAG == 'SyncMapFormatTTML'
    assert module_0.SyncMapFormatTTML.TTML == 'ttml'
    assert module_0.SyncMapFormatTTML.DFXP == 'dfxp'
    assert module_0.SyncMapFormatTTML.DEFAULT == 'ttml'
    sync_map_format_t_t_m_l_0.format(var_0)