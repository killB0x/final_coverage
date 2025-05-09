# Automatically generated by Pynguin.
import pytest
import butter.mas.packets.packet_tcp as module_0
import butter.mas.utils.general_utils as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    float_0 = 1331.1905
    tcp_packet_0 = module_0.TcpPacket(float_0, float_0, float_0)
    assert f'{type(tcp_packet_0).__module__}.{type(tcp_packet_0).__qualname__}' == 'butter.mas.packets.packet_tcp.TcpPacket'
    assert tcp_packet_0.ip == pytest.approx(1331.1905, abs=0.01, rel=0.01)
    assert tcp_packet_0.port == pytest.approx(1331.1905, abs=0.01, rel=0.01)
    assert tcp_packet_0.query == pytest.approx(1331.1905, abs=0.01, rel=0.01)
    assert tcp_packet_0.bufferSize == 2048
    tcp_packet_0.send()

def test_case_1():
    bool_0 = False
    tcp_packet_0 = module_0.TcpPacket(bool_0, bool_0, bool_0)
    assert f'{type(tcp_packet_0).__module__}.{type(tcp_packet_0).__qualname__}' == 'butter.mas.packets.packet_tcp.TcpPacket'
    assert tcp_packet_0.ip is False
    assert tcp_packet_0.port is False
    assert tcp_packet_0.query is False
    assert tcp_packet_0.bufferSize == 2048
    var_0 = tcp_packet_0.__eq__(bool_0)
    assert var_0 is False
    var_1 = tcp_packet_0.__eq__(tcp_packet_0)
    assert var_1 is True
    tcp_packet_1 = module_0.TcpPacket(bool_0, bool_0, bool_0)
    assert tcp_packet_1.bufferSize == 2048
    tcp_packet_2 = module_0.TcpPacket(bool_0, tcp_packet_1, bool_0)
    assert tcp_packet_2.bufferSize == 2048

@pytest.mark.xfail(strict=True)
def test_case_2():
    var_0 = module_1.print_error()
    var_0.send()

def test_case_3():
    list_0 = []
    var_0 = module_1.print_error(*list_0)
    tcp_packet_0 = module_0.TcpPacket(var_0, list_0, list_0)
    assert f'{type(tcp_packet_0).__module__}.{type(tcp_packet_0).__qualname__}' == 'butter.mas.packets.packet_tcp.TcpPacket'
    assert tcp_packet_0.ip is None
    assert tcp_packet_0.port == []
    assert tcp_packet_0.query == []
    assert tcp_packet_0.bufferSize == 2048

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = ' Exposes Butter MAS Python API '
    none_type_0 = None
    tcp_packet_0 = module_0.TcpPacket(str_0, none_type_0, none_type_0)
    assert f'{type(tcp_packet_0).__module__}.{type(tcp_packet_0).__qualname__}' == 'butter.mas.packets.packet_tcp.TcpPacket'
    assert tcp_packet_0.ip == ' Exposes Butter MAS Python API '
    assert tcp_packet_0.port is None
    assert tcp_packet_0.query is None
    assert tcp_packet_0.bufferSize == 2048
    int_0 = -141
    tcp_packet_1 = module_0.TcpPacket(int_0, int_0, int_0)
    assert tcp_packet_1.ip == -141
    assert tcp_packet_1.port == -141
    assert tcp_packet_1.query == -141
    assert tcp_packet_1.bufferSize == 2048
    var_0 = tcp_packet_1.__eq__(tcp_packet_0)
    assert var_0 is False
    var_0.send(tcp_packet_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    set_0 = set()
    none_type_0 = None
    tcp_packet_0 = module_0.TcpPacket(set_0, set_0, none_type_0)
    assert f'{type(tcp_packet_0).__module__}.{type(tcp_packet_0).__qualname__}' == 'butter.mas.packets.packet_tcp.TcpPacket'
    assert tcp_packet_0.ip == {*()}
    assert tcp_packet_0.port == {*()}
    assert tcp_packet_0.query is None
    assert tcp_packet_0.bufferSize == 2048
    int_0 = 1
    tcp_packet_1 = module_0.TcpPacket(int_0, set_0, int_0)
    assert tcp_packet_1.ip == 1
    assert tcp_packet_1.port == {*()}
    assert tcp_packet_1.query == 1
    assert tcp_packet_1.bufferSize == 2048
    tcp_packet_2 = module_0.TcpPacket(int_0, int_0, int_0)
    assert tcp_packet_2.ip == 1
    assert tcp_packet_2.port == 1
    assert tcp_packet_2.query == 1
    assert tcp_packet_2.bufferSize == 2048
    var_0 = tcp_packet_2.__eq__(tcp_packet_2)
    assert var_0 is True
    var_1 = tcp_packet_2.__eq__(none_type_0)
    assert var_1 is False
    tcp_packet_3 = module_0.TcpPacket(var_0, var_1, int_0)
    assert tcp_packet_3.ip is True
    assert tcp_packet_3.bufferSize == 2048
    tcp_packet_4 = module_0.TcpPacket(tcp_packet_3, tcp_packet_2, tcp_packet_3)
    assert tcp_packet_4.bufferSize == 2048
    var_2 = var_0.__eq__(tcp_packet_4)
    tcp_packet_5 = module_0.TcpPacket(tcp_packet_4, tcp_packet_0, tcp_packet_4)
    assert tcp_packet_5.bufferSize == 2048
    var_3 = tcp_packet_3.__eq__(tcp_packet_2)
    tcp_packet_5.send()

@pytest.mark.xfail(strict=True)
def test_case_6():
    bool_0 = True
    bool_1 = False
    bytes_0 = b'\xef\xd6\xbe\xb6\x9e\xd6\xc84\xbd}5'
    var_0 = module_1.print_error()
    var_1 = var_0.__eq__(bool_1)
    none_type_0 = None
    tcp_packet_0 = module_0.TcpPacket(bytes_0, bool_1, none_type_0)
    assert f'{type(tcp_packet_0).__module__}.{type(tcp_packet_0).__qualname__}' == 'butter.mas.packets.packet_tcp.TcpPacket'
    assert tcp_packet_0.ip == b'\xef\xd6\xbe\xb6\x9e\xd6\xc84\xbd}5'
    assert tcp_packet_0.port is False
    assert tcp_packet_0.query is None
    assert tcp_packet_0.bufferSize == 2048
    tcp_packet_1 = module_0.TcpPacket(bool_1, bytes_0, bool_1)
    assert tcp_packet_1.ip is False
    assert tcp_packet_1.port == b'\xef\xd6\xbe\xb6\x9e\xd6\xc84\xbd}5'
    assert tcp_packet_1.query is False
    assert tcp_packet_1.bufferSize == 2048
    var_2 = tcp_packet_0.send()
    assert f'{type(var_2).__module__}.{type(var_2).__qualname__}' == 'requests.models.Response'
    assert var_2.status_code == 400
    assert f'{type(var_2.headers).__module__}.{type(var_2.headers).__qualname__}' == 'requests.structures.CaseInsensitiveDict'
    assert len(var_2.headers) == 0
    assert var_2.raw is None
    assert var_2.url is None
    assert var_2.encoding is None
    assert var_2.history == []
    assert var_2.reason is None
    assert f'{type(var_2.cookies).__module__}.{type(var_2.cookies).__qualname__}' == 'requests.cookies.RequestsCookieJar'
    assert len(var_2.cookies) == 0
    assert f'{type(var_2.elapsed).__module__}.{type(var_2.elapsed).__qualname__}' == 'datetime.timedelta'
    assert var_2.request is None
    assert var_2.code == 'expired'
    assert var_2.error_type == 'expired'
    var_3 = tcp_packet_1.__eq__(bool_0)
    assert var_3 is False
    var_3.send()

def test_case_7():
    bytes_0 = b''
    bool_0 = True
    tcp_packet_0 = module_0.TcpPacket(bytes_0, bool_0, bool_0)
    assert f'{type(tcp_packet_0).__module__}.{type(tcp_packet_0).__qualname__}' == 'butter.mas.packets.packet_tcp.TcpPacket'
    assert tcp_packet_0.ip == b''
    assert tcp_packet_0.port is True
    assert tcp_packet_0.query is True
    assert tcp_packet_0.bufferSize == 2048
    var_0 = tcp_packet_0.send()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'requests.models.Response'
    assert var_0.status_code == 400
    assert f'{type(var_0.headers).__module__}.{type(var_0.headers).__qualname__}' == 'requests.structures.CaseInsensitiveDict'
    assert len(var_0.headers) == 0
    assert var_0.raw is None
    assert var_0.url is None
    assert var_0.encoding is None
    assert var_0.history == []
    assert var_0.reason is None
    assert f'{type(var_0.cookies).__module__}.{type(var_0.cookies).__qualname__}' == 'requests.cookies.RequestsCookieJar'
    assert len(var_0.cookies) == 0
    assert f'{type(var_0.elapsed).__module__}.{type(var_0.elapsed).__qualname__}' == 'datetime.timedelta'
    assert var_0.request is None
    assert var_0.code == 'expired'
    assert var_0.error_type == 'expired'
    tcp_packet_1 = module_0.TcpPacket(bytes_0, bytes_0, var_0)
    assert f'{type(tcp_packet_1.query).__module__}.{type(tcp_packet_1.query).__qualname__}' == 'requests.models.Response'
    assert tcp_packet_1.bufferSize == 2048
    var_1 = tcp_packet_0.send()
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'requests.models.Response'
    assert var_1.status_code == 400
    assert f'{type(var_1.headers).__module__}.{type(var_1.headers).__qualname__}' == 'requests.structures.CaseInsensitiveDict'
    assert len(var_1.headers) == 0
    assert var_1.raw is None
    assert var_1.url is None
    assert var_1.encoding is None
    assert var_1.history == []
    assert var_1.reason is None
    assert f'{type(var_1.cookies).__module__}.{type(var_1.cookies).__qualname__}' == 'requests.cookies.RequestsCookieJar'
    assert len(var_1.cookies) == 0
    assert f'{type(var_1.elapsed).__module__}.{type(var_1.elapsed).__qualname__}' == 'datetime.timedelta'
    assert var_1.request is None
    assert var_1.code == 'expired'
    assert var_1.error_type == 'expired'