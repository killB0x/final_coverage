# Automatically generated by Pynguin.
import pytest
import systematic.platform.linux.stats as module_0

def test_case_0():
    linux_v_m_stats_0 = module_0.LinuxVMStats()
    assert module_0.VMSTAT_FIELD_MAP == {'process': {'r': 'runnable', 'b': 'blocked'}, 'memory': {'swpd': 'swapped', 'free': 'idle', 'buff': 'buffers', 'cache': 'caches', 'inact': 'inactive', 'active': 'active'}, 'swap': {'si': 'swapped_in', 'so': 'swapped_out'}, 'io': {'bi': 'blocks_in', 'bo': 'blocks_out'}, 'system': {'in': 'interrupts', 'cs': 'context_switches'}, 'cpu': {'us': 'user', 'sy': 'kernel', 'id': 'idle', 'wa': 'wait', 'st': 'stolen'}}
    assert module_0.VMSTAT_VM_MODE_FIELDS == ('r', 'b', 'swpd', 'free', 'inact', 'active', 'si', 'so', 'bi', 'bo', 'in', 'cs', 'us', 'sy', 'id', 'wa', 'st')
    assert module_0.VMSTAT_DISK_MODE_FIELDS == ('device', 'read_total', 'read_merged', 'read_sectors', 'read_ms', 'write_total', 'write_merged', 'write_sectors', 'write_ms', 'io_cur', 'io_sec')
    assert module_0.LinuxVMStats.name == 'vmstat'
    with pytest.raises(KeyError):
        linux_v_m_stats_0.__find_counter_group__(linux_v_m_stats_0)

def test_case_1():
    linux_system_stats_0 = module_0.LinuxSystemStats()
    assert f'{type(linux_system_stats_0.counters).__module__}.{type(linux_system_stats_0.counters).__qualname__}' == 'collections.OrderedDict'
    assert len(linux_system_stats_0.counters) == 0
    assert f'{type(linux_system_stats_0.vm_stats).__module__}.{type(linux_system_stats_0.vm_stats).__qualname__}' == 'systematic.platform.linux.stats.LinuxVMStats'
    assert f'{type(linux_system_stats_0.disk_stats).__module__}.{type(linux_system_stats_0.disk_stats).__qualname__}' == 'systematic.platform.linux.stats.LinuxDiskStats'
    assert module_0.VMSTAT_FIELD_MAP == {'process': {'r': 'runnable', 'b': 'blocked'}, 'memory': {'swpd': 'swapped', 'free': 'idle', 'buff': 'buffers', 'cache': 'caches', 'inact': 'inactive', 'active': 'active'}, 'swap': {'si': 'swapped_in', 'so': 'swapped_out'}, 'io': {'bi': 'blocks_in', 'bo': 'blocks_out'}, 'system': {'in': 'interrupts', 'cs': 'context_switches'}, 'cpu': {'us': 'user', 'sy': 'kernel', 'id': 'idle', 'wa': 'wait', 'st': 'stolen'}}
    assert module_0.VMSTAT_VM_MODE_FIELDS == ('r', 'b', 'swpd', 'free', 'inact', 'active', 'si', 'so', 'bi', 'bo', 'in', 'cs', 'us', 'sy', 'id', 'wa', 'st')
    assert module_0.VMSTAT_DISK_MODE_FIELDS == ('device', 'read_total', 'read_merged', 'read_sectors', 'read_ms', 'write_total', 'write_merged', 'write_sectors', 'write_ms', 'io_cur', 'io_sec')

@pytest.mark.xfail(strict=True)
def test_case_2():
    linux_system_stats_0 = module_0.LinuxSystemStats()
    assert f'{type(linux_system_stats_0.counters).__module__}.{type(linux_system_stats_0.counters).__qualname__}' == 'collections.OrderedDict'
    assert len(linux_system_stats_0.counters) == 0
    assert f'{type(linux_system_stats_0.vm_stats).__module__}.{type(linux_system_stats_0.vm_stats).__qualname__}' == 'systematic.platform.linux.stats.LinuxVMStats'
    assert f'{type(linux_system_stats_0.disk_stats).__module__}.{type(linux_system_stats_0.disk_stats).__qualname__}' == 'systematic.platform.linux.stats.LinuxDiskStats'
    assert module_0.VMSTAT_FIELD_MAP == {'process': {'r': 'runnable', 'b': 'blocked'}, 'memory': {'swpd': 'swapped', 'free': 'idle', 'buff': 'buffers', 'cache': 'caches', 'inact': 'inactive', 'active': 'active'}, 'swap': {'si': 'swapped_in', 'so': 'swapped_out'}, 'io': {'bi': 'blocks_in', 'bo': 'blocks_out'}, 'system': {'in': 'interrupts', 'cs': 'context_switches'}, 'cpu': {'us': 'user', 'sy': 'kernel', 'id': 'idle', 'wa': 'wait', 'st': 'stolen'}}
    assert module_0.VMSTAT_VM_MODE_FIELDS == ('r', 'b', 'swpd', 'free', 'inact', 'active', 'si', 'so', 'bi', 'bo', 'in', 'cs', 'us', 'sy', 'id', 'wa', 'st')
    assert module_0.VMSTAT_DISK_MODE_FIELDS == ('device', 'read_total', 'read_merged', 'read_sectors', 'read_ms', 'write_total', 'write_merged', 'write_sectors', 'write_ms', 'io_cur', 'io_sec')
    linux_system_stats_0.update()

def test_case_3():
    linux_system_stats_0 = module_0.LinuxSystemStats()
    assert f'{type(linux_system_stats_0.counters).__module__}.{type(linux_system_stats_0.counters).__qualname__}' == 'collections.OrderedDict'
    assert len(linux_system_stats_0.counters) == 0
    assert f'{type(linux_system_stats_0.vm_stats).__module__}.{type(linux_system_stats_0.vm_stats).__qualname__}' == 'systematic.platform.linux.stats.LinuxVMStats'
    assert f'{type(linux_system_stats_0.disk_stats).__module__}.{type(linux_system_stats_0.disk_stats).__qualname__}' == 'systematic.platform.linux.stats.LinuxDiskStats'
    assert module_0.VMSTAT_FIELD_MAP == {'process': {'r': 'runnable', 'b': 'blocked'}, 'memory': {'swpd': 'swapped', 'free': 'idle', 'buff': 'buffers', 'cache': 'caches', 'inact': 'inactive', 'active': 'active'}, 'swap': {'si': 'swapped_in', 'so': 'swapped_out'}, 'io': {'bi': 'blocks_in', 'bo': 'blocks_out'}, 'system': {'in': 'interrupts', 'cs': 'context_switches'}, 'cpu': {'us': 'user', 'sy': 'kernel', 'id': 'idle', 'wa': 'wait', 'st': 'stolen'}}
    assert module_0.VMSTAT_VM_MODE_FIELDS == ('r', 'b', 'swpd', 'free', 'inact', 'active', 'si', 'so', 'bi', 'bo', 'in', 'cs', 'us', 'sy', 'id', 'wa', 'st')
    assert module_0.VMSTAT_DISK_MODE_FIELDS == ('device', 'read_total', 'read_merged', 'read_sectors', 'read_ms', 'write_total', 'write_merged', 'write_sectors', 'write_ms', 'io_cur', 'io_sec')
    var_0 = linux_system_stats_0.to_json()
    assert var_0 == '{\n  "disk": {\n    "timestamp": null,\n    "counters": {}\n  },\n  "vm": {\n    "timestamp": null,\n    "counters": {}\n  }\n}'
    bool_0 = True
    linux_v_m_stats_0 = module_0.LinuxVMStats()
    assert module_0.LinuxVMStats.name == 'vmstat'
    with pytest.raises(KeyError):
        linux_v_m_stats_0.__find_counter_group__(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    linux_system_stats_0 = module_0.LinuxSystemStats()
    assert f'{type(linux_system_stats_0.counters).__module__}.{type(linux_system_stats_0.counters).__qualname__}' == 'collections.OrderedDict'
    assert len(linux_system_stats_0.counters) == 0
    assert f'{type(linux_system_stats_0.vm_stats).__module__}.{type(linux_system_stats_0.vm_stats).__qualname__}' == 'systematic.platform.linux.stats.LinuxVMStats'
    assert f'{type(linux_system_stats_0.disk_stats).__module__}.{type(linux_system_stats_0.disk_stats).__qualname__}' == 'systematic.platform.linux.stats.LinuxDiskStats'
    assert module_0.VMSTAT_FIELD_MAP == {'process': {'r': 'runnable', 'b': 'blocked'}, 'memory': {'swpd': 'swapped', 'free': 'idle', 'buff': 'buffers', 'cache': 'caches', 'inact': 'inactive', 'active': 'active'}, 'swap': {'si': 'swapped_in', 'so': 'swapped_out'}, 'io': {'bi': 'blocks_in', 'bo': 'blocks_out'}, 'system': {'in': 'interrupts', 'cs': 'context_switches'}, 'cpu': {'us': 'user', 'sy': 'kernel', 'id': 'idle', 'wa': 'wait', 'st': 'stolen'}}
    assert module_0.VMSTAT_VM_MODE_FIELDS == ('r', 'b', 'swpd', 'free', 'inact', 'active', 'si', 'so', 'bi', 'bo', 'in', 'cs', 'us', 'sy', 'id', 'wa', 'st')
    assert module_0.VMSTAT_DISK_MODE_FIELDS == ('device', 'read_total', 'read_merged', 'read_sectors', 'read_ms', 'write_total', 'write_merged', 'write_sectors', 'write_ms', 'io_cur', 'io_sec')
    var_0 = linux_system_stats_0.to_json(linux_system_stats_0)
    assert var_0 == '{\n  "disk": {\n    "timestamp": null,\n    "counters": {}\n  },\n  "vm": {\n    "timestamp": null,\n    "counters": {}\n  }\n}'
    linux_v_m_stats_0 = module_0.LinuxVMStats()
    assert module_0.LinuxVMStats.name == 'vmstat'
    str_0 = 'swpd'
    var_1 = linux_v_m_stats_0.__find_counter_group__(str_0)
    var_1.__find_counter_group__(linux_system_stats_0)