# Automatically generated by Pynguin.
import aeneas.syncmap.smftxt as module_0

def test_case_0():
    bytes_0 = b"\xa4a\xdd\xcb\xab\x84'\xe5\xca\x97@\x94s\x9a\x9b"
    sync_map_format_t_x_t_0 = module_0.SyncMapFormatTXT(rconf=bytes_0, logger=bytes_0)
    assert f'{type(sync_map_format_t_x_t_0).__module__}.{type(sync_map_format_t_x_t_0).__qualname__}' == 'aeneas.syncmap.smftxt.SyncMapFormatTXT'
    assert sync_map_format_t_x_t_0.logger == b"\xa4a\xdd\xcb\xab\x84'\xe5\xca\x97@\x94s\x9a\x9b"
    assert sync_map_format_t_x_t_0.rconf == b"\xa4a\xdd\xcb\xab\x84'\xe5\xca\x97@\x94s\x9a\x9b"
    assert sync_map_format_t_x_t_0.variant == 'tabular'
    assert sync_map_format_t_x_t_0.parameters is None
    assert sync_map_format_t_x_t_0.write_template == '{identifier} {begin} {end} {text}'
    assert module_0.SyncMapFormatTXT.TAG == 'SyncMapFormatTXT'
    assert module_0.SyncMapFormatTXT.DEFAULT == 'txt'
    assert module_0.SyncMapFormatTXT.HUMAN == 'txth'
    assert module_0.SyncMapFormatTXT.MACHINE == 'txtm'
    assert module_0.SyncMapFormatTXT.MACHINE_ALIASES == ['txt', 'txtm']
    assert module_0.SyncMapFormatTXT.FIELD_DELIMITER == ' '
    assert module_0.SyncMapFormatTXT.FIELDS == {'identifier': 0, 'begin': 1, 'end': 2, 'text': 3}
    assert module_0.SyncMapFormatTXT.TEXT_DELIMITER == '"'
    str_0 = "<\x0b[{0+@ncKtx'"
    sync_map_format_t_x_t_1 = module_0.SyncMapFormatTXT(str_0, logger=str_0)
    assert sync_map_format_t_x_t_1.write_template == '{identifier} {begin} {end} {text}'
    sync_map_format_t_x_t_2 = module_0.SyncMapFormatTXT(logger=str_0)
    assert sync_map_format_t_x_t_2.write_template == '{identifier} {begin} {end} {text}'