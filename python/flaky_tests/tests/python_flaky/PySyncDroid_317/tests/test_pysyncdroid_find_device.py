# Automatically generated by Pynguin.
import pytest
import pysyncdroid.find_device as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    module_0.lsusb()

@pytest.mark.xfail(strict=True)
def test_case_1():
    bytes_0 = b'\x1b'
    var_0 = module_0.get_mtp_details(bytes_0, bytes_0)
    assert module_0.MTP_URL_PATTERN == 'mtp://[usb:{b},{d}]/'
    assert module_0.MTP_GVFS_PATH_PATTERN == '/run/user/{u}/gvfs/mtp:host=%5Busb%3A{b}%2C{d}%5D'
    none_type_0 = None
    module_0.get_connection_details(bytes_0, none_type_0)