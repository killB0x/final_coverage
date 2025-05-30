# Automatically generated by Pynguin.
import pytest
import kaldiio.python_wave as module_0
import struct as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    module_0.openfp(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'Q3tF'
    module_0.openfp(str_0)

def test_case_2():
    bytes_0 = b'\x11\xa2t '
    var_0 = module_0.Wave_write(bytes_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1

def test_case_3():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnchannels(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    bytes_0 = b''
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    wave_write_0.setsampwidth(wave_write_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = '@iQ'
    int_0 = -2473
    module_0.Wave_write(str_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.writeframes(int_0)

def test_case_6():
    bytes_0 = b'\xff'
    with pytest.raises(module_0.Error):
        module_0.open(bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    module_0._wave_params()

def test_case_8():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnchannels(bool_0)
    var_1 = wave_write_0.setsampwidth(bool_0)
    none_type_0 = None
    wave_write_1 = module_0.Wave_write(none_type_0)
    var_2 = wave_write_1.__del__()
    var_3 = wave_write_0.setnframes(var_0)
    var_4 = wave_write_1.setframerate(bool_0)
    with pytest.raises(module_0.Error):
        wave_write_1.getmark(wave_write_0)

def test_case_9():
    bool_0 = False
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.setsampwidth(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    bytes_0 = b''
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.getnframes()
    assert var_0 == 0
    var_1 = wave_write_0.__del__()
    wave_write_0.writeframesraw(bytes_0)

def test_case_11():
    bytes_0 = b'\x04'
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.getframerate()

def test_case_12():
    bytes_0 = b''
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.getnchannels()

@pytest.mark.xfail(strict=True)
def test_case_13():
    bytes_0 = b'\x01\x98\xc3\x91\x84|\xf7z\x01\xae\xe4\x84%'
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    wave_write_0.setframerate(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    bytes_0 = b''
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.__exit__()
    var_1 = wave_write_0.setnframes(var_0)
    var_2 = wave_write_0.getmarkers()
    module_0.open(var_0)

def test_case_15():
    bytes_0 = b'WAV\x0e'
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.getsampwidth()

@pytest.mark.xfail(strict=True)
def test_case_16():
    none_type_0 = None
    module_0.open(none_type_0)

def test_case_17():
    none_type_0 = None
    wave_write_0 = module_0.Wave_write(none_type_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.setmark(none_type_0, none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    bytes_0 = b''
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.__enter__()
    var_1 = wave_write_0.setnframes(wave_write_0)
    module_0.open(var_1)

@pytest.mark.xfail(strict=True)
def test_case_19():
    str_0 = '%9Fe\r$ H1zQV}X$wKP'
    module_0.open(str_0)

def test_case_20():
    bytes_0 = b''
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.tell()
    assert var_0 == 0
    var_1 = wave_write_0.__del__()
    with pytest.raises(module_0.Error):
        module_0.open(var_1, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    bytes_0 = b'\xff'
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    wave_write_0.writeframesraw(bytes_0)

def test_case_22():
    bytes_0 = b''
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.__exit__()

@pytest.mark.xfail(strict=True)
def test_case_23():
    bytes_0 = b'\xdeH'
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    wave_write_0.getcomptype()

@pytest.mark.xfail(strict=True)
def test_case_24():
    bytes_0 = b'U'
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    wave_write_0.getcompname()

def test_case_25():
    bytes_0 = b'\x04'
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.setcomptype(bytes_0, wave_write_0)

def test_case_26():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setsampwidth(bool_0)

def test_case_27():
    bytes_0 = b'\xc7\x08\xbb\x19\xf9l@vy\xe5'
    int_0 = 1521
    set_0 = {bytes_0, bytes_0, int_0}
    wave_write_0 = module_0.Wave_write(set_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.setsampwidth(int_0)

def test_case_28():
    bytes_0 = b''
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnframes(bytes_0)

def test_case_29():
    bytes_0 = b'fmt '
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.getparams()

def test_case_30():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1

def test_case_31():
    bytes_0 = b''
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.getnframes()
    assert var_0 == 0
    with pytest.raises(module_0.Error):
        wave_write_0.setframerate(var_0)

def test_case_32():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnframes(bool_0)
    var_1 = wave_write_0.setframerate(bool_0)
    var_2 = module_1.error()

def test_case_33():
    bool_0 = False
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.setnchannels(bool_0)

def test_case_34():
    bytes_0 = b'WAVE'
    wave_write_0 = module_0.Wave_write(bytes_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    with pytest.raises(module_0.Error):
        wave_write_0.getparams()

@pytest.mark.xfail(strict=True)
def test_case_35():
    bool_0 = True
    module_0.open(bool_0)

@pytest.mark.xfail(strict=True)
def test_case_36():
    bool_0 = True
    module_0.open(bool_0)

def test_case_37():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnchannels(bool_0)
    var_1 = wave_write_0.setsampwidth(bool_0)
    none_type_0 = None
    wave_write_1 = module_0.Wave_write(none_type_0)
    assert f'{type(wave_write_1).__module__}.{type(wave_write_1).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    var_2 = wave_write_1.__del__()
    var_3 = wave_write_0.setnframes(var_0)
    var_4 = wave_write_1.setframerate(bool_0)
    var_5 = wave_write_1.getframerate()
    assert var_5 == 1
    with pytest.raises(module_0.Error):
        module_0.open(var_4, var_5)

@pytest.mark.xfail(strict=True)
def test_case_38():
    bool_0 = True
    bool_1 = False
    wave_write_0 = module_0.Wave_write(bool_1)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setsampwidth(bool_0)
    var_1 = wave_write_0.__exit__()
    var_2 = wave_write_0.getsampwidth()
    assert var_2 is True
    var_0.__exit__()

@pytest.mark.xfail(strict=True)
def test_case_39():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnchannels(bool_0)
    var_1 = wave_write_0.setsampwidth(bool_0)
    none_type_0 = None
    wave_write_1 = module_0.Wave_write(none_type_0)
    assert f'{type(wave_write_1).__module__}.{type(wave_write_1).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    var_2 = wave_write_1.__del__()
    var_3 = wave_write_0.getnchannels()
    assert var_3 is True
    var_4 = wave_write_0.setnframes(var_0)
    var_5 = wave_write_1.setframerate(bool_0)
    module_0.open(var_1)

def test_case_40():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnchannels(bool_0)
    var_1 = wave_write_0.setsampwidth(bool_0)
    wave_write_1 = module_0.Wave_write(var_1)
    assert f'{type(wave_write_1).__module__}.{type(wave_write_1).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    with pytest.raises(module_0.Error):
        wave_write_0.getparams()

def test_case_41():
    bool_0 = True
    bool_1 = True
    wave_write_0 = module_0.Wave_write(bool_1)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnchannels(bool_0)
    with pytest.raises(module_0.Error):
        wave_write_0.getparams()

@pytest.mark.xfail(strict=True)
def test_case_42():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnchannels(bool_0)
    module_0.open(var_0)

@pytest.mark.xfail(strict=True)
def test_case_43():
    bool_0 = True
    wave_write_0 = module_0.Wave_write(bool_0)
    assert f'{type(wave_write_0).__module__}.{type(wave_write_0).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    assert module_0.WAVE_FORMAT_PCM == 1
    var_0 = wave_write_0.setnchannels(bool_0)
    var_1 = wave_write_0.setframerate(bool_0)
    var_2 = wave_write_0.setsampwidth(bool_0)
    wave_write_1 = module_0.Wave_write(var_2)
    assert f'{type(wave_write_1).__module__}.{type(wave_write_1).__qualname__}' == 'kaldiio.python_wave.Wave_write'
    var_3 = wave_write_1.__del__()
    wave_write_2 = module_0.Wave_write(bool_0)
    var_4 = wave_write_1.setnframes(wave_write_0)
    wave_write_0.getparams()