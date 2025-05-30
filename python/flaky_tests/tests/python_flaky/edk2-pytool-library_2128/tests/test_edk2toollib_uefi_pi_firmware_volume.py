# Automatically generated by Pynguin.
import pytest
import edk2toollib.uefi.pi_firmware_volume as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    efi_firmware_volume_header_0 = module_0.EfiFirmwareVolumeHeader()
    assert efi_firmware_volume_header_0.StructString == '=16s16sQ4sLHHHBBQQ'
    efi_firmware_volume_header_0.serialize()

def test_case_1():
    efi_firmware_volume_header_0 = module_0.EfiFirmwareVolumeHeader()
    assert efi_firmware_volume_header_0.StructString == '=16s16sQ4sLHHHBBQQ'

def test_case_2():
    efi_firmware_volume_ext_header_0 = module_0.EfiFirmwareVolumeExtHeader()
    assert efi_firmware_volume_ext_header_0.StructString == '=16sL'

@pytest.mark.xfail(strict=True)
def test_case_3():
    efi_firmware_volume_ext_header_0 = module_0.EfiFirmwareVolumeExtHeader()
    assert efi_firmware_volume_ext_header_0.StructString == '=16sL'
    efi_firmware_volume_ext_header_0.load_from_file(efi_firmware_volume_ext_header_0)