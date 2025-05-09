# Automatically generated by Pynguin.
import pytest
import bl.pwd as module_0

def test_case_0():
    var_0 = module_0.randpwd()
    assert module_0.UPPERCASE == ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    assert module_0.LOWERCASE == ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    assert module_0.NUMBERS == ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
    assert module_0.SYMBOLS == ['!', '"', '#', '$', '%', '&', "'", '(', ')', '*', '+', ',', '-', '.', '/']
    assert module_0.DEFAULT_CHARSETS == [['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'], ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'], ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']]
    assert module_0.DEFAULT_LENGTH == 8

def test_case_1():
    complex_0 = (-769-2365.64j)
    var_0 = module_0.randpwd(include_all_charsets=complex_0)
    assert module_0.UPPERCASE == ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    assert module_0.LOWERCASE == ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    assert module_0.NUMBERS == ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
    assert module_0.SYMBOLS == ['!', '"', '#', '$', '%', '&', "'", '(', ')', '*', '+', ',', '-', '.', '/']
    assert module_0.DEFAULT_CHARSETS == [['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'], ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'], ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']]
    assert module_0.DEFAULT_LENGTH == 8

def test_case_2():
    bool_0 = True
    var_0 = module_0.randpwd(include_all_charsets=bool_0)
    assert module_0.UPPERCASE == ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    assert module_0.LOWERCASE == ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    assert module_0.NUMBERS == ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
    assert module_0.SYMBOLS == ['!', '"', '#', '$', '%', '&', "'", '(', ')', '*', '+', ',', '-', '.', '/']
    assert module_0.DEFAULT_CHARSETS == [['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'], ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'], ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']]
    assert module_0.DEFAULT_LENGTH == 8
    str_0 = 'rLu^[S<:jwI>Z'
    with pytest.raises(AssertionError):
        module_0.randpwd(charsets=str_0)