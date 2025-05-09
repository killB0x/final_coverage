# Automatically generated by Pynguin.
import pytest
import systematic.tail as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    complex_0 = (1282.42+2379.201525j)
    tail_reader_0 = module_0.TailReader(fd=complex_0)
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    tail_reader_0.close()

@pytest.mark.xfail(strict=True)
def test_case_1():
    tail_reader_0 = module_0.TailReader()
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    var_0 = tail_reader_0.close()
    tail_reader_0.readline()

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = 'BVt-\r'
    tail_reader_0 = module_0.TailReader(fd=str_0)
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    tail_reader_0.load()

@pytest.mark.xfail(strict=True)
def test_case_3():
    tail_reader_0 = module_0.TailReader()
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    tail_reader_0.readline()

@pytest.mark.xfail(strict=True)
def test_case_4():
    tail_reader_0 = module_0.TailReader()
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    tail_reader_0.seek_to_end()

@pytest.mark.xfail(strict=True)
def test_case_5():
    float_0 = -250.945238
    tail_reader_0 = module_0.TailReader()
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    var_0 = tail_reader_0.__format_line__(float_0)
    tail_reader_1 = module_0.TailReader(fd=float_0)
    assert tail_reader_1.pos == 0
    tail_reader_1.seek_to_end()

@pytest.mark.xfail(strict=True)
def test_case_6():
    bytes_0 = b'\xf1~\x12\x94\xb9\x0e\x9dq\xa3\x86"\xbd\x107\xb6\xa1/\xe81'
    tail_reader_0 = module_0.TailReader(bytes_0, bytes_0)
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    tail_reader_0.readline()

def test_case_7():
    tail_reader_error_0 = module_0.TailReaderError()
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)

def test_case_8():
    tail_reader_0 = module_0.TailReader()
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)

@pytest.mark.xfail(strict=True)
def test_case_9():
    tail_reader_0 = module_0.TailReader()
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    var_0 = tail_reader_0.close()
    var_1 = tail_reader_0.__format_line__(var_0)
    tail_reader_0.next()

@pytest.mark.xfail(strict=True)
def test_case_10():
    bool_0 = False
    set_0 = {bool_0, bool_0}
    list_0 = [set_0, bool_0, set_0, set_0]
    tail_reader_0 = module_0.TailReader(list_0)
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    var_0 = tail_reader_0.__iter__()
    assert var_0.pos == 0
    var_1 = var_0.__iter__()
    assert var_1.pos == 0
    var_1.load()

@pytest.mark.xfail(strict=True)
def test_case_11():
    tail_reader_0 = module_0.TailReader()
    assert tail_reader_0.pos == 0
    assert module_0.INTERVAL == pytest.approx(0.01, abs=0.01, rel=0.01)
    assert module_0.OPEN_RETRY_INTERVAL == pytest.approx(0.2, abs=0.01, rel=0.01)
    tail_reader_0.next()