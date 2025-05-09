# Automatically generated by Pynguin.
import pytest
import pint.numpy_func as module_0
import pint.errors as module_1

def test_case_0():
    var_0 = module_0.convert_to_consistent_units()
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']

@pytest.mark.xfail(strict=True)
def test_case_1():
    float_0 = 3998.6
    module_0.convert_arg(float_0, float_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    var_0 = module_0.unwrap_and_wrap_consistent_units()
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    module_0.convert_arg(var_0, var_0)

def test_case_3():
    none_type_0 = None
    var_0 = module_0.convert_arg(none_type_0, none_type_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']

def test_case_4():
    str_0 = 'D;g^Vg+I-!)[tqrz'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
    var_0 = module_0.convert_to_consistent_units(**dict_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    str_1 = 'size'
    var_1 = module_0.convert_to_consistent_units(*str_1)
    int_0 = 6378
    var_2 = module_0.implements(var_1, int_0)
    var_3 = var_1.__str__()
    var_4 = module_0.implement_single_dimensionless_argument_func(str_1)
    with pytest.raises(ValueError):
        module_0.get_op_output_unit(str_1, var_4)

def test_case_5():
    var_0 = module_0.unwrap_and_wrap_consistent_units()
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']

def test_case_6():
    bytes_0 = b'\xa5a]\xa1M&2\xb4z\xfcY\x19\xd8\xe7\xcb\xc1\xf5N'
    var_0 = module_0.unwrap_and_wrap_consistent_units(*bytes_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']

def test_case_7():
    str_0 = 'slso'
    with pytest.raises(ValueError):
        module_0.get_op_output_unit(str_0, str_0, str_0, str_0)

def test_case_8():
    dict_0 = {}
    with pytest.raises(ValueError):
        module_0.get_op_output_unit(dict_0, dict_0)

def test_case_9():
    str_0 = 'lnH'
    with pytest.raises(ValueError):
        module_0.numpy_wrap(str_0, str_0, str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    str_0 = 'iz'
    module_0.convert_arg(str_0, str_0)

def test_case_11():
    str_0 = 'slso'
    var_0 = module_0.convert_to_consistent_units(*str_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    var_1 = module_0.unwrap_and_wrap_consistent_units(*str_0)
    var_2 = module_0.implement_atleast_nd(var_0)
    var_3 = module_0.convert_arg(var_2, var_1)
    with pytest.raises(ValueError):
        module_0.get_op_output_unit(str_0, var_3)

def test_case_12():
    str_0 = 'slso'
    var_0 = module_0.convert_to_consistent_units(*str_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = 'square'
    module_0.get_op_output_unit(str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    str_0 = 'sum'
    list_0 = [str_0, str_0, str_0]
    var_0 = module_0.convert_to_consistent_units(*list_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    var_1 = module_0.unwrap_and_wrap_consistent_units(*str_0)
    var_2 = module_0.implement_func(var_1, var_1, var_1)
    var_3 = var_1.__str__()
    var_4 = module_0.convert_arg(var_2, var_1)
    var_5 = module_0.convert_arg(var_2, var_4)
    module_0.get_op_output_unit(str_0, var_4)

@pytest.mark.xfail(strict=True)
def test_case_15():
    unit_stripped_warning_0 = module_1.UnitStrippedWarning()
    set_0 = {unit_stripped_warning_0, unit_stripped_warning_0}
    var_0 = module_0.implement_func(set_0, set_0, output_unit=set_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    var_1 = module_0.implement_consistent_units_by_argument(var_0, unit_stripped_warning_0)
    var_2 = module_0.implement_consistent_units_by_argument(var_1, var_0, var_1)
    var_3 = var_2.__str__()
    float_0 = -615.99
    none_type_0 = None
    var_4 = module_0.implement_func(var_3, float_0, output_unit=none_type_0)
    str_0 = 'reciprocal'
    module_0.get_op_output_unit(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    str_0 = 'variance'
    none_type_0 = None
    var_0 = module_0.implement_func(str_0, none_type_0, none_type_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    str_1 = 'slw'
    none_type_1 = None
    var_1 = module_0.convert_arg(none_type_0, none_type_1)
    var_2 = module_0.implements(str_1, none_type_1)
    var_3 = module_1.PintTypeError()
    var_4 = module_0.implement_atleast_nd(var_0)
    var_5 = module_0.implements(var_2, none_type_1)
    dict_0 = {str_0: var_0}
    var_6 = module_0.convert_arg(none_type_0, dict_0)
    var_7 = module_0.convert_to_consistent_units()
    module_0.get_op_output_unit(str_0, var_3)

@pytest.mark.xfail(strict=True)
def test_case_17():
    str_0 = 'cbrt'
    module_0.get_op_output_unit(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    str_0 = 'function'
    list_0 = [str_0, str_0]
    module_0.numpy_wrap(str_0, str_0, str_0, list_0, list_0)

def test_case_19():
    str_0 = 'size'
    with pytest.raises(ValueError):
        module_0.get_op_output_unit(str_0, str_0, str_0)

def test_case_20():
    str_0 = 'sl,w'
    var_0 = module_0.unwrap_and_wrap_consistent_units()
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    var_1 = module_0.convert_to_consistent_units(*var_0)
    int_0 = 6378
    var_2 = module_0.implements(var_0, int_0)
    var_3 = var_1.__str__()
    var_4 = module_0.unwrap_and_wrap_consistent_units(*str_0)
    var_5 = module_0.implement_atleast_nd(var_1)
    var_6 = module_0.convert_arg(int_0, var_5)
    var_7 = var_6.__str__()
    str_1 = 'sqrt'
    var_8 = module_0.get_op_output_unit(str_1, var_6, int_0)
    assert var_8 == pytest.approx(79.86238163240563, abs=0.01, rel=0.01)

@pytest.mark.xfail(strict=True)
def test_case_21():
    str_0 = 'D;g^Vg+I-!)[tqrz'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
    var_0 = module_0.convert_to_consistent_units(**dict_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    var_1 = module_0.unwrap_and_wrap_consistent_units()
    str_1 = 'size'
    var_2 = module_0.convert_to_consistent_units(*str_1)
    int_0 = 6378
    var_3 = var_0.__str__()
    var_4 = module_0.unwrap_and_wrap_consistent_units(*var_3)
    var_5 = module_0.implement_single_dimensionless_argument_func(var_4)
    var_6 = module_0.implement_atleast_nd(dict_0)
    var_7 = module_0.convert_arg(var_5, dict_0)
    var_8 = var_5.__str__()
    module_0.get_op_output_unit(str_1, str_0, size=int_0)

@pytest.mark.xfail(strict=True)
def test_case_22():
    str_0 = 'delta,div'
    module_0.get_op_output_unit(str_0, str_0, size=str_0)

@pytest.mark.xfail(strict=True)
def test_case_23():
    str_0 = 'div'
    module_0.get_op_output_unit(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_24():
    str_0 = 'delta'
    none_type_0 = None
    dimensionality_error_0 = module_1.DimensionalityError(none_type_0, str_0)
    var_0 = module_0.convert_to_consistent_units()
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    var_1 = module_0.unwrap_and_wrap_consistent_units()
    var_2 = module_0.implement_single_dimensionless_argument_func(dimensionality_error_0)
    var_3 = module_0.implement_atleast_nd(none_type_0)
    var_4 = module_0.implement_func(var_3, var_0)
    var_5 = module_0.convert_arg(str_0, var_2)
    assert var_5 == 'delta'
    var_6 = module_0.implements(var_3, none_type_0)
    var_7 = module_0.convert_arg(var_2, dimensionality_error_0)
    module_0.get_op_output_unit(var_5, str_0)

@pytest.mark.xfail(strict=True)
def test_case_25():
    pint_type_error_0 = module_1.PintTypeError()
    str_0 = 'mul'
    module_0.get_op_output_unit(str_0, pint_type_error_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    str_0 = 'ufunc'
    var_0 = module_0.implement_atleast_nd(str_0)
    assert len(module_0.HANDLED_UFUNCS) == 5
    assert len(module_0.HANDLED_FUNCTIONS) == 14
    assert module_0.strip_unit_input_output_ufuncs == ['isnan', 'isinf', 'isfinite', 'signbit']
    assert module_0.matching_input_bare_output_ufuncs == ['equal', 'greater', 'greater_equal', 'less', 'less_equal', 'not_equal']
    assert module_0.matching_input_set_units_output_ufuncs == {'arctan2': 'radian'}
    assert module_0.set_units_ufuncs == {'cumprod': ('', ''), 'arccos': ('', 'radian'), 'arcsin': ('', 'radian'), 'arctan': ('', 'radian'), 'arccosh': ('', 'radian'), 'arcsinh': ('', 'radian'), 'arctanh': ('', 'radian'), 'exp': ('', ''), 'expm1': ('', ''), 'exp2': ('', ''), 'log': ('', ''), 'log10': ('', ''), 'log1p': ('', ''), 'log2': ('', ''), 'sin': ('radian', ''), 'cos': ('radian', ''), 'tan': ('radian', ''), 'sinh': ('radian', ''), 'cosh': ('radian', ''), 'tanh': ('radian', ''), 'radians': ('degree', 'radian'), 'degrees': ('radian', 'degree'), 'deg2rad': ('degree', 'radian'), 'rad2deg': ('radian', 'degree'), 'logaddexp': ('', ''), 'logaddexp2': ('', '')}
    assert module_0.matching_input_copy_units_output_ufuncs == ['compress', 'conj', 'conjugate', 'copy', 'diagonal', 'max', 'mean', 'min', 'ptp', 'ravel', 'repeat', 'reshape', 'round', 'squeeze', 'swapaxes', 'take', 'trace', 'transpose', 'ceil', 'floor', 'hypot', 'rint', 'copysign', 'nextafter', 'trunc', 'absolute', 'negative', 'maximum', 'minimum', 'fabs']
    assert module_0.copy_units_output_ufuncs == ['ldexp', 'fmod', 'mod', 'remainder']
    assert module_0.op_units_output_ufuncs == {'var': 'square', 'multiply': 'mul', 'true_divide': 'div', 'divide': 'div', 'floor_divide': 'div', 'sqrt': 'sqrt', 'cbrt': 'cbrt', 'square': 'square', 'reciprocal': 'reciprocal', 'std': 'sum', 'sum': 'sum', 'cumsum': 'sum', 'matmul': 'mul'}
    assert module_0.ufunc_str == 'matmul'
    assert module_0.out_unit == ''
    assert module_0.in_unit == ''
    assert module_0.unit_op == 'mul'
    assert module_0.func_str == 'nanvar'
    assert module_0.unit_arguments == ['ar1', 'ar2']
    list_0 = [str_0, str_0]
    var_1 = module_0.implements(str_0, list_0)
    var_2 = module_0.unwrap_and_wrap_consistent_units()
    var_3 = module_0.implement_atleast_nd(list_0)
    var_4 = module_0.convert_arg(var_3, list_0)
    var_5 = module_0.convert_to_consistent_units(*list_0)
    module_0.numpy_wrap(str_0, str_0, str_0, var_2, list_0)