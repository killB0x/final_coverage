# Automatically generated by Pynguin.
import pytest
import docci.zip as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = '{;TEP9H=['
    module_0.list_zip_files(str_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = '3Nv'
    module_0.zip_files(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = 'Kf"Z9-<"R})U4p4]\x0b*S'
    bytes_0 = b''
    file_attachment_0 = module_0.zip_files(bytes_0, str_0)
    assert f'{type(file_attachment_0).__module__}.{type(file_attachment_0).__qualname__}' == 'docci.file.FileAttachment'
    assert file_attachment_0.name == 'KfZ9-R})U4p4]\x0bS'
    assert file_attachment_0.content == b'PK\x05\x06\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'
    module_0.zip_dirs(file_attachment_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    int_0 = -3285
    module_0.zip_files(int_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = 'zH8I'
    module_0.zip_dirs(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    bool_0 = True
    module_0.zip_dirs(bool_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    bytes_0 = b'\xa3O-\xe0\x13s\xe8u\xc4\x0e1\xc8'
    module_0.raw_to_zip(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    bool_0 = True
    module_0.list_zip_files(bool_0)

def test_case_8():
    list_0 = []
    str_0 = "_BZ]C[B%VFbU|iqS'"
    file_attachment_0 = module_0.zip_dirs(list_0, str_0)
    assert f'{type(file_attachment_0).__module__}.{type(file_attachment_0).__qualname__}' == 'docci.file.FileAttachment'
    assert file_attachment_0.name == "_BZ]C[B%VFbUiqS'"
    assert file_attachment_0.content == b'PK\x05\x06\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'

@pytest.mark.xfail(strict=True)
def test_case_9():
    str_0 = '+K'
    list_0 = [str_0, str_0]
    module_0.zip_dirs(list_0, list_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    str_0 = 'Kf"Z9-<"R})U4p4]\x0b*S'
    bytes_0 = b''
    file_attachment_0 = module_0.zip_files(bytes_0, str_0)
    assert f'{type(file_attachment_0).__module__}.{type(file_attachment_0).__qualname__}' == 'docci.file.FileAttachment'
    assert file_attachment_0.name == 'KfZ9-R})U4p4]\x0bS'
    assert file_attachment_0.content == b'PK\x05\x06\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'
    sequence_0 = module_0.list_zip_files(file_attachment_0)
    module_0.zip_dirs(file_attachment_0, str_0)

def test_case_11():
    str_0 = '\nr# u\\'
    sequence_0 = module_0.list_zip_files(str_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    str_0 = 'Fq.l^K;#t|7#g'
    set_0 = set()
    tuple_0 = (set_0, set_0)
    tuple_1 = (tuple_0, str_0)
    module_0.zip_dirs(tuple_1, set_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = 'Kf"Z9-<"R})U4p4]\x0b*S'
    zip_file_0 = module_0.raw_to_zip(str_0)
    assert f'{type(zip_file_0).__module__}.{type(zip_file_0).__qualname__}' == 'zipfile.ZipFile'
    assert zip_file_0.debug == 0
    assert zip_file_0.NameToInfo == {}
    assert zip_file_0.filelist == []
    assert zip_file_0.compression == 0
    assert zip_file_0.compresslevel is None
    assert zip_file_0.mode == 'r'
    assert zip_file_0.pwd is None
    assert zip_file_0.filename == 'Kf"Z9-<"R})U4p4]\x0b*S'
    assert f'{type(zip_file_0.fp).__module__}.{type(zip_file_0.fp).__qualname__}' == '_io.BufferedReader'
    assert zip_file_0.start_dir == 0
    zip_file_1 = module_0.raw_to_zip(zip_file_0)
    assert f'{type(zip_file_1).__module__}.{type(zip_file_1).__qualname__}' == 'zipfile.ZipFile'
    assert zip_file_1.debug == 0
    assert zip_file_1.NameToInfo == {}
    assert zip_file_1.filelist == []
    assert zip_file_1.compression == 0
    assert zip_file_1.compresslevel is None
    assert zip_file_1.mode == 'r'
    assert zip_file_1.pwd is None
    assert zip_file_1.filename == 'Kf"Z9-<"R})U4p4]\x0b*S'
    assert f'{type(zip_file_1.fp).__module__}.{type(zip_file_1.fp).__qualname__}' == '_io.BufferedReader'
    assert zip_file_1.start_dir == 0
    module_0.zip_dirs(zip_file_1, zip_file_1)

@pytest.mark.xfail(strict=True)
def test_case_14():
    str_0 = 'Kf"Z9-<"R})U4p4]\x0b*S'
    sequence_0 = module_0.list_zip_files(str_0)
    bool_0 = True
    str_1 = 'bY279VC*gkGd"V'
    module_0.zip_dirs(bool_0, str_1)