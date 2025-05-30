# Automatically generated by Pynguin.
import pytest
import idstools.scripts.rulecat as module_0
import idstools.rulecat.extract as module_1
import enum as module_2

def test_case_0():
    var_0 = module_0.dump_sample_configs()

def test_case_1():
    bytes_0 = b'\xc2HG\xe1:\\3'
    var_0 = module_0.load_drop_filters(bytes_0)

def test_case_2():
    str_0 = 'u\x0cX\nB@7'
    group_matcher_0 = module_0.GroupMatcher(str_0)
    assert f'{type(group_matcher_0).__module__}.{type(group_matcher_0).__qualname__}' == 'idstools.scripts.rulecat.GroupMatcher'
    assert group_matcher_0.pattern == 'u\x0cX\nB@7'
    var_0 = group_matcher_0.match(str_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    bytes_0 = b'\xc2HG\xe1:\\3'
    module_0.write_yaml_fragment(bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    threshold_processor_0 = module_0.ThresholdProcessor()
    threshold_processor_0.replace(threshold_processor_0, threshold_processor_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    all_rule_matcher_0 = module_0.AllRuleMatcher()
    var_0 = all_rule_matcher_0.match(all_rule_matcher_0)
    assert var_0 is True
    none_type_0 = None
    var_1 = all_rule_matcher_0.match(none_type_0)
    var_2 = all_rule_matcher_0.match(none_type_0)
    complex_0 = (-2507.2481+2428.4j)
    module_0.resolve_flowbits(complex_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    bytes_0 = b'\xc2HG\xe1:\\3'
    id_rule_matcher_0 = module_0.IdRuleMatcher(bytes_0, bytes_0)
    assert f'{type(id_rule_matcher_0).__module__}.{type(id_rule_matcher_0).__qualname__}' == 'idstools.scripts.rulecat.IdRuleMatcher'
    assert id_rule_matcher_0.generatorId == b'\xc2HG\xe1:\\3'
    assert id_rule_matcher_0.signatureId == b'\xc2HG\xe1:\\3'
    module_0.write_sid_msg_map(bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = 'w3u\x0cX\nB@7'
    var_0 = module_0.ReRuleMatcher(str_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idstools.scripts.rulecat.ReRuleMatcher'
    assert var_0.pattern == 'w3u\x0cX\nB@7'
    module_0.write_yaml_fragment(str_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    bytes_0 = b'\xc2HG\xe1:\\3'
    var_0 = module_0.load_drop_filters(bytes_0)
    var_1 = module_0.build_report(var_0, var_0)
    fetch_0 = module_0.Fetch(var_1)
    module_0.write_sid_msg_map(bytes_0, bytes_0)

def test_case_9():
    var_0 = module_0.FileTracker()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'idstools.scripts.rulecat.FileTracker'
    assert var_0.hashes == {}

@pytest.mark.xfail(strict=True)
def test_case_10():
    none_type_0 = None
    module_0.resolve_etpro_url(none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    none_type_0 = None
    module_0.resolve_etopen_url(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    var_0 = module_0.dump_sample_configs()
    var_0.__reversed__(var_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    bool_0 = True
    module_0.load_drop_filters(bool_0)

def test_case_14():
    bytes_0 = b'\xc2HG\xe1:\\3'
    filename_matcher_0 = module_0.FilenameMatcher(bytes_0)
    assert f'{type(filename_matcher_0).__module__}.{type(filename_matcher_0).__qualname__}' == 'idstools.scripts.rulecat.FilenameMatcher'
    assert filename_matcher_0.filename == b'\xc2HG\xe1:\\3'
    var_0 = filename_matcher_0.match(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    str_0 = 'u\x0cX\nB@7'
    modify_rule_filter_0 = module_0.ModifyRuleFilter(str_0, str_0, str_0)
    assert f'{type(modify_rule_filter_0).__module__}.{type(modify_rule_filter_0).__qualname__}' == 'idstools.scripts.rulecat.ModifyRuleFilter'
    assert modify_rule_filter_0.matcher == 'u\x0cX\nB@7'
    assert modify_rule_filter_0.pattern == 'u\x0cX\nB@7'
    assert modify_rule_filter_0.repl == 'u\x0cX\nB@7'
    module_0.build_rule_map(str_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    str_0 = 'dsools.scripts.rulecat'
    module_0.load_local(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_17():
    str_0 = '/input/idstools/scripts/rulecat.py'
    drop_rule_filter_0 = module_0.DropRuleFilter(str_0)
    assert f'{type(drop_rule_filter_0).__module__}.{type(drop_rule_filter_0).__qualname__}' == 'idstools.scripts.rulecat.DropRuleFilter'
    assert drop_rule_filter_0.matcher == '/input/idstools/scripts/rulecat.py'
    module_0.load_local(str_0, drop_rule_filter_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    str_0 = "dso'ls.scripts.rulecat"
    module_0.load_local(str_0, str_0)

def test_case_19():
    bool_0 = False
    dict_0 = {}
    id_rule_matcher_0 = module_0.IdRuleMatcher(bool_0, dict_0)
    assert f'{type(id_rule_matcher_0).__module__}.{type(id_rule_matcher_0).__qualname__}' == 'idstools.scripts.rulecat.IdRuleMatcher'
    assert id_rule_matcher_0.generatorId is False
    assert id_rule_matcher_0.signatureId == {}
    all_rule_matcher_0 = module_0.AllRuleMatcher(**dict_0)
    fetch_0 = module_0.Fetch(bool_0)
    var_0 = fetch_0.check_checksum(bool_0, all_rule_matcher_0)
    module_0.write_yaml_fragment(bool_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_20():
    threshold_processor_0 = module_0.ThresholdProcessor()
    str_0 = 'u\x0cX\nB@'
    threshold_processor_0.process(str_0, threshold_processor_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    str_0 = 'u\x0cX\nB@7'
    var_0 = module_0.ignore_file(str_0, str_0)
    assert var_0 is False
    var_0.run()

@pytest.mark.xfail(strict=True)
def test_case_22():
    str_0 = 'f'
    module_0.build_rule_map(str_0)

@pytest.mark.xfail(strict=True)
def test_case_23():
    str_0 = '/input/idstools/scripts/rulecat.py'
    var_0 = module_0.load_drop_filters(str_0)
    module_0.load_local(str_0, var_0)

def test_case_24():
    str_0 = 'u\x0cXB@7'
    var_0 = module_0.write_yaml_fragment(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_25():
    file_tracker_0 = module_0.FileTracker()
    assert f'{type(file_tracker_0).__module__}.{type(file_tracker_0).__qualname__}' == 'idstools.scripts.rulecat.FileTracker'
    assert file_tracker_0.hashes == {}
    var_0 = file_tracker_0.any_modified()
    var_1 = file_tracker_0.add(var_0)
    module_0.load_filters(file_tracker_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    file_tracker_0 = module_0.FileTracker()
    assert f'{type(file_tracker_0).__module__}.{type(file_tracker_0).__qualname__}' == 'idstools.scripts.rulecat.FileTracker'
    assert file_tracker_0.hashes == {}
    var_0 = file_tracker_0.any_modified()
    module_0.load_drop_filters(var_0)

@pytest.mark.xfail(strict=True)
def test_case_27():
    str_0 = 'dsools.scripts.rulecat'
    module_0.build_report(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_28():
    str_0 = 'u\x0cX\n*B@7'
    var_0 = module_0.ignore_file(str_0, str_0)
    assert var_0 is True
    var_0.run()

@pytest.mark.xfail(strict=True)
def test_case_29():
    bytes_0 = b'\xc2HG\xe1:\x8a\\3'
    module_0.write_sid_msg_map(bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_30():
    bytes_0 = b'\xc2HG\xe1:\\3'
    var_0 = module_0.load_drop_filters(bytes_0)
    module_0.build_report(bytes_0, var_0)

def test_case_31():
    bytes_0 = b'\xc2HG\xe1:\\3'
    var_0 = module_0.load_drop_filters(bytes_0)
    var_1 = module_0.build_report(var_0, var_0)

def test_case_32():
    str_0 = 'u\x0cX\nB@7'
    var_0 = module_0.load_drop_filters(str_0)
    var_1 = module_0.load_filters(str_0)

def test_case_33():
    bytes_0 = b'\xc2HG\xe1:\\3'
    var_0 = module_0.load_filters(bytes_0)

def test_case_34():
    str_0 = ''
    var_0 = module_0.build_rule_map(str_0)

@pytest.mark.xfail(strict=True)
def test_case_35():
    bytes_0 = b'\xc2HG\xe1:\\3'
    fetch_0 = module_0.Fetch(bytes_0)
    assert f'{type(fetch_0).__module__}.{type(fetch_0).__qualname__}' == 'idstools.scripts.rulecat.Fetch'
    assert fetch_0.args == b'\xc2HG\xe1:\\3'
    fetch_0.progress_hook(bytes_0, bytes_0)

def test_case_36():
    bytes_0 = b'\xc2HG\xe1:\\3'
    var_0 = module_0.load_drop_filters(bytes_0)
    var_1 = module_0.build_report(var_0, var_0)
    var_2 = module_0.load_local(bytes_0, var_1)

@pytest.mark.xfail(strict=True)
def test_case_37():
    threshold_processor_0 = module_0.ThresholdProcessor()
    str_0 = 'u\x0cX\nB@'
    threshold_processor_0.replace(str_0, threshold_processor_0)

@pytest.mark.xfail(strict=True)
def test_case_38():
    bool_0 = False
    none_type_0 = None
    fetch_0 = module_0.Fetch(none_type_0)
    assert f'{type(fetch_0).__module__}.{type(fetch_0).__qualname__}' == 'idstools.scripts.rulecat.Fetch'
    assert fetch_0.args is None
    var_0 = module_1.try_extract(bool_0)
    fetch_0.url_basename(var_0)

def test_case_39():
    bytes_0 = b'\xc2HG\xe1:\\3'
    var_0 = module_0.load_drop_filters(bytes_0)
    var_1 = module_0.build_report(var_0, var_0)
    var_2 = module_0.write_sid_msg_map(bytes_0, var_1, var_0)

def test_case_40():
    str_0 = '/input/idstools/scripts/rulecat.py'
    var_0 = module_0.load_drop_filters(str_0)

@pytest.mark.xfail(strict=True)
def test_case_41():
    str_0 = '/input/idstools/scripts/rulecat.py'
    module_0.load_filters(str_0)

@pytest.mark.xfail(strict=True)
def test_case_42():
    enum_dict_0 = module_2._EnumDict()
    var_0 = module_0.resolve_flowbits(enum_dict_0, enum_dict_0)
    module_0.load_drop_filters(var_0)

@pytest.mark.xfail(strict=True)
def test_case_43():
    file_tracker_0 = module_0.FileTracker()
    assert f'{type(file_tracker_0).__module__}.{type(file_tracker_0).__qualname__}' == 'idstools.scripts.rulecat.FileTracker'
    assert file_tracker_0.hashes == {}
    str_0 = '/input/idstools/scripts/rulecat.py'
    var_0 = module_0.load_drop_filters(str_0)
    var_1 = file_tracker_0.md5(str_0)
    module_0.load_drop_filters(file_tracker_0)

@pytest.mark.xfail(strict=True)
def test_case_44():
    str_0 = 'u\x0cXFB@7'
    none_type_0 = None
    fetch_0 = module_0.Fetch(str_0)
    assert f'{type(fetch_0).__module__}.{type(fetch_0).__qualname__}' == 'idstools.scripts.rulecat.Fetch'
    assert fetch_0.args == 'u\x0cXFB@7'
    fetch_0.progress_hook(none_type_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_45():
    threshold_processor_0 = module_0.ThresholdProcessor()
    str_0 = '# "S8MO4Tm13Z_<'
    threshold_processor_0.process(str_0, threshold_processor_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_46():
    threshold_processor_0 = module_0.ThresholdProcessor()
    str_0 = '\x0cX\nB@'
    threshold_processor_0.process(str_0, threshold_processor_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_47():
    none_type_0 = None
    drop_rule_filter_0 = module_0.DropRuleFilter(none_type_0)
    assert f'{type(drop_rule_filter_0).__module__}.{type(drop_rule_filter_0).__qualname__}' == 'idstools.scripts.rulecat.DropRuleFilter'
    assert drop_rule_filter_0.matcher is None
    int_0 = 1938
    drop_rule_filter_0.filter(int_0)