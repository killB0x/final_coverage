# Automatically generated by Pynguin.
import pytest
import aeneas.tools.ffprobe_wrapper as module_0
import platform as module_1

def test_case_0():
    f_f_p_r_o_b_e_wrapper_c_l_i_0 = module_0.FFPROBEWrapperCLI()

@pytest.mark.xfail(strict=True)
def test_case_1():
    f_f_p_r_o_b_e_wrapper_c_l_i_0 = module_0.FFPROBEWrapperCLI()
    f_f_p_r_o_b_e_wrapper_c_l_i_0.perform_command()

@pytest.mark.xfail(strict=True)
def test_case_2():
    f_f_p_r_o_b_e_wrapper_c_l_i_0 = module_0.FFPROBEWrapperCLI()
    var_0 = module_1.platform(terse=f_f_p_r_o_b_e_wrapper_c_l_i_0)
    f_f_p_r_o_b_e_wrapper_c_l_i_0.run(var_0, var_0)