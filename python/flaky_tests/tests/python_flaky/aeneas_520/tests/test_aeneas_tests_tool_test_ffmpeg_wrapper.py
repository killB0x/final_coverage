# Automatically generated by Pynguin.
import pytest
import aeneas.tests.tool_test_ffmpeg_wrapper as module_0

def test_case_0():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()

@pytest.mark.xfail(strict=True)
def test_case_1():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    var_0 = test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_cannot_write()
    var_0.test_convert_path()

@pytest.mark.xfail(strict=True)
def test_case_2():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    var_0 = test_f_f_m_p_e_g_wrapper_c_l_i_0.test_help()
    test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_44100()

@pytest.mark.xfail(strict=True)
def test_case_3():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert()

@pytest.mark.xfail(strict=True)
def test_case_4():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_mp3()

@pytest.mark.xfail(strict=True)
def test_case_5():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    var_0 = test_f_f_m_p_e_g_wrapper_c_l_i_0.assertNoLogs(test_f_f_m_p_e_g_wrapper_c_l_i_0)
    test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_16000()

@pytest.mark.xfail(strict=True)
def test_case_6():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    var_0 = test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_cannot_write()
    var_1 = test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_path()
    test_f_f_m_p_e_g_wrapper_c_l_i_1 = module_0.TestFFMPEGWrapperCLI()
    test_f_f_m_p_e_g_wrapper_c_l_i_1.test_convert_22050()

@pytest.mark.xfail(strict=True)
def test_case_7():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    var_0 = test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_cannot_read()
    none_type_0 = None
    var_1 = test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_path_bad()
    var_2 = test_f_f_m_p_e_g_wrapper_c_l_i_0.__eq__(none_type_0)
    var_1.__floordiv__(var_2)

def test_case_8():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    var_0 = test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_path()

@pytest.mark.xfail(strict=True)
def test_case_9():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    var_0 = test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_missing_1()
    var_1 = test_f_f_m_p_e_g_wrapper_c_l_i_0.assertNoLogs(test_f_f_m_p_e_g_wrapper_c_l_i_0)
    test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_16000()

@pytest.mark.xfail(strict=True)
def test_case_10():
    test_f_f_m_p_e_g_wrapper_c_l_i_0 = module_0.TestFFMPEGWrapperCLI()
    var_0 = test_f_f_m_p_e_g_wrapper_c_l_i_0.test_convert_missing_2()
    test_f_f_m_p_e_g_wrapper_c_l_i_0.deprecated_func(**var_0)