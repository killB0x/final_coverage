# Automatically generated by Pynguin.
import pytest
import osmnx.utils as module_0
import datetime as module_1

def test_case_0():
    var_0 = module_0.citation()
    with pytest.raises(ValueError):
        module_0.ts(var_0)

def test_case_1():
    bool_0 = True
    var_0 = module_0.log(bool_0)
    var_1 = module_0.ts()
    assert var_1 == '2022-10-13 02:07:26'
    var_2 = module_0.ts(var_1, var_1)
    assert var_2 == '2022-10-13 02:07:26'
    var_3 = module_0.citation()
    var_4 = module_0.ts()
    assert var_4 == '2022-10-13 02:07:26'
    var_5 = module_0.log(var_2, var_2, var_3, var_3)
    var_6 = module_0.ts()
    assert var_6 == '2022-10-13 02:07:26'

def test_case_2():
    int_0 = 324
    var_0 = module_0.citation()
    var_1 = module_0.log(int_0, int_0)
    var_2 = module_0.config(use_cache=var_1, log_file=int_0, log_filename=var_0, useful_tags_node=var_0, osm_xml_way_tags=int_0, nominatim_key=var_1, all_oneway=var_1)
    bool_0 = False
    var_3 = module_0.config(imgs_folder=var_1, cache_folder=var_1, use_cache=var_0, log_file=int_0, log_console=int_0, useful_tags_node=var_1, useful_tags_way=var_1, osm_xml_node_attrs=int_0, osm_xml_way_attrs=int_0, overpass_settings=var_2, default_access=bool_0)
    var_4 = module_0.ts(template=var_1)
    assert var_4 == '2022-10-13 02:07:26'

def test_case_3():
    list_0 = []
    var_0 = module_0.citation()
    bool_0 = True
    var_1 = module_0.config(log_file=list_0, osm_xml_node_attrs=var_0, overpass_settings=bool_0, timeout=list_0, max_query_area_size=list_0, default_user_agent=var_0, default_accept_language=list_0, nominatim_key=var_0, overpass_endpoint=list_0)

def test_case_4():
    int_0 = 324
    var_0 = module_0.log(int_0, name=int_0)

def test_case_5():
    str_0 = 'C_J:"0xE^?y]'
    var_0 = module_0.log(str_0, name=str_0)
    timedelta_0 = module_1.timedelta()
    var_1 = module_0.log(timedelta_0, filename=timedelta_0)

def test_case_6():
    str_0 = 'F3GQW%cGg?'
    none_type_0 = None
    var_0 = module_0.log(none_type_0, str_0)
    none_type_1 = None
    var_1 = module_0.citation()
    var_2 = module_0.citation()
    var_3 = module_0.config(log_file=str_0, log_filename=str_0, osm_xml_node_attrs=str_0, memory=str_0, default_referer=none_type_1, default_accept_language=none_type_1, overpass_endpoint=none_type_1)
    var_4 = module_0.ts()
    assert var_4 == '2022-10-13 02:07:26'
    var_5 = module_0.ts()
    assert var_5 == '2022-10-13 02:07:26'
    bytes_0 = b'\xb85'
    var_6 = module_0.config(str_0, none_type_1, use_cache=none_type_1, log_level=none_type_1, osm_xml_node_attrs=none_type_1, osm_xml_way_attrs=str_0, memory=none_type_1, max_query_area_size=var_3, default_access=var_5, default_crs=bytes_0)

def test_case_7():
    var_0 = module_0.citation()
    var_1 = module_0.config(logs_folder=var_0, imgs_folder=var_0, cache_folder=var_0, use_cache=var_0, log_file=var_0, log_filename=var_0, max_query_area_size=var_0, nominatim_key=var_0, overpass_endpoint=var_0, elevation_provider=var_0)
    bytes_0 = b'}\x83U\x9c\x90m\x04!\xd7\n\n\xb6\xe0g?\x11K'
    var_2 = module_0.log(bytes_0)
    var_3 = module_0.ts()
    assert var_3 == '2022-10-13 02:07:26'

def test_case_8():
    var_0 = module_0.citation()
    bool_0 = True
    none_type_0 = None
    var_1 = module_0.log(none_type_0, bool_0, filename=bool_0)
    var_2 = module_0.config(logs_folder=bool_0, use_cache=var_1, log_file=var_1, log_level=none_type_0, log_filename=bool_0, overpass_settings=var_1, max_query_area_size=var_1, default_user_agent=none_type_0, nominatim_key=none_type_0, overpass_endpoint=var_1, elevation_provider=none_type_0)
    var_3 = module_0.log(bool_0, none_type_0, none_type_0)
    str_0 = 'z~f,97ql/RpUYNxo$ o\\'
    module_0.config(use_cache=var_3, log_console=bool_0, log_name=str_0, useful_tags_node=var_2, useful_tags_way=var_3, osm_xml_way_attrs=var_3, timeout=var_2, default_access=bool_0, nominatim_key=var_1)
    with pytest.raises(ValueError):
        var_4 = module_0.ts(var_1, var_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    bool_0 = True
    var_0 = module_0.ts()
    assert var_0 == '2022-10-13 02:07:26'
    var_1 = module_0.config(logs_folder=bool_0, use_cache=var_0, log_file=var_0, log_level=var_0, log_filename=bool_0, overpass_settings=var_0, max_query_area_size=var_0, default_user_agent=var_0, nominatim_key=var_0, overpass_endpoint=var_0, elevation_provider=var_0)
    var_2 = module_0.config(use_cache=var_1, log_file=bool_0, log_name=var_1, useful_tags_way=var_1, osm_xml_node_attrs=bool_0, timeout=bool_0, overpass_endpoint=bool_0, all_oneway=var_0, elevation_provider=bool_0)
    module_0.log(bool_0, var_0, var_0)

def test_case_10():
    bool_0 = True
    var_0 = module_0.citation()
    none_type_0 = None
    var_1 = module_0.log(none_type_0, bool_0, filename=bool_0)
    var_2 = module_0.config(logs_folder=bool_0, use_cache=bool_0, log_file=var_1, log_level=none_type_0, log_filename=bool_0, overpass_settings=var_1, max_query_area_size=var_1, default_user_agent=none_type_0, nominatim_key=none_type_0, overpass_endpoint=bool_0, elevation_provider=none_type_0)
    str_0 = 'Begin plotting the graph...'
    var_3 = module_0.citation()
    bytes_0 = b'\\\t#\xa8\x92\xd7\xf9\xc9@'
    var_4 = module_0.citation()
    var_5 = module_0.log(bytes_0, filename=bool_0)
    var_6 = module_0.config(logs_folder=none_type_0, imgs_folder=var_5, log_file=str_0, log_console=var_2, useful_tags_way=var_2, osm_xml_way_attrs=var_5, timeout=var_5, default_crs=var_1, default_user_agent=var_2, default_accept_language=var_2, nominatim_key=var_4, all_oneway=var_2)
    var_7 = module_0.log(var_5, name=str_0)
    dict_0 = {bytes_0: bytes_0, var_1: var_1, var_1: var_7}
    var_8 = module_0.config(log_file=dict_0, log_level=var_2, useful_tags_way=str_0, overpass_settings=bytes_0, max_query_area_size=none_type_0, default_access=none_type_0, default_crs=str_0, default_referer=dict_0, default_accept_language=var_1, elevation_provider=bool_0)
    with pytest.raises(ValueError):
        module_0.ts(bool_0)

def test_case_11():
    bytes_0 = b'\xfc\x87\x1d\x0c%/\xa0'
    var_0 = module_0.config(bytes_0, log_file=bytes_0, useful_tags_node=bytes_0, osm_xml_node_tags=bytes_0, osm_xml_way_tags=bytes_0, overpass_settings=bytes_0, timeout=bytes_0, default_access=bytes_0, default_accept_language=bytes_0, overpass_endpoint=bytes_0)
    var_1 = module_0.log(var_0, filename=var_0)
    bool_0 = True
    var_2 = module_0.ts()
    assert var_2 == '2022-10-13 02:07:26'
    none_type_0 = None
    var_3 = module_0.log(var_2, bool_0, filename=bool_0)
    int_0 = 30
    var_4 = module_0.config(var_0, cache_folder=var_1, log_file=bytes_0, log_level=int_0, log_name=var_0, useful_tags_way=int_0, osm_xml_node_attrs=bool_0, osm_xml_node_tags=var_1, osm_xml_way_tags=int_0, default_crs=none_type_0)
    var_5 = module_0.citation()
    var_6 = module_0.config(imgs_folder=var_4, use_cache=var_0, log_file=var_3, osm_xml_node_tags=var_1, default_referer=var_2, default_accept_language=var_5, overpass_endpoint=var_3)
    var_7 = module_0.log(var_4, name=var_6)
    var_8 = module_0.log(var_5)
    str_0 = 'Begin plotting the graph...'
    var_9 = module_0.citation()
    var_10 = module_0.ts(template=var_8)
    assert var_10 == '2022-10-13 02:07:26'
    bytes_1 = b'\\\t#\xa8\x92\xd7\xf9\xc9@\xf0'
    var_11 = module_0.log(bool_0, name=var_6, filename=str_0)
    var_12 = module_0.citation()
    var_13 = module_0.config(var_10, var_9, var_1, str_0, log_console=var_0, osm_xml_node_tags=var_10, overpass_settings=var_11, timeout=bytes_0, nominatim_key=var_10)
    var_14 = module_0.citation()
    var_15 = module_0.citation()
    var_16 = module_0.log(bytes_1, name=var_7)
    var_17 = module_0.citation()
    str_1 = 'tpm'
    dict_0 = {var_8: var_4}
    var_18 = module_0.config(cache_folder=var_10, log_file=str_0, log_console=var_16, log_level=var_8, osm_xml_node_attrs=bytes_0, osm_xml_node_tags=var_5, memory=var_0, default_user_agent=str_1, default_referer=dict_0, nominatim_endpoint=bytes_0, nominatim_key=bytes_1)
    var_19 = module_0.citation()
    var_20 = module_0.ts()
    assert var_20 == '2022-10-13 02:07:26'
    var_21 = module_0.ts()
    assert var_21 == '2022-10-13 02:07:26'