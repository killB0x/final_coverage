# Automatically generated by Pynguin.
import pytest
import symspellpy.helpers as module_0
import re as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = 'c&B6UZAA(Lncg)7T'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'c&B6UZAA(Lncg)7T'
    var_1 = module_0.prefix_suffix_prep(var_0, var_0)
    var_2 = module_1.purge()
    module_0.null_distance_results(var_2, var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    str_0 = 'J(%b^by[D?/3'
    none_type_0 = None
    module_0.null_distance_results(str_0, str_0, none_type_0)

def test_case_2():
    str_0 = 'L'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'L'
    var_1 = module_0.prefix_suffix_prep(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    int_0 = 2276
    var_0 = module_0.to_similarity(int_0, int_0)
    assert var_0 == pytest.approx(0.0, abs=0.01, rel=0.01)
    list_0 = [int_0, int_0, int_0, int_0]
    module_0.try_parse_int64(list_0)

def test_case_4():
    str_0 = 'c&B6UZAA(Lncg)7T'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'c&B6UZAA(Lncg)7T'
    var_1 = module_0.try_parse_int64(var_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    str_0 = 'R,\x0b.p?CcR?F+I|'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'R,\x0b.p?cCr?F+I|'
    var_1 = module_0.prefix_suffix_prep(var_0, var_0)
    var_2 = module_0.transfer_casing_for_similar_text(var_0, str_0)
    assert var_2 == 'R,\x0b.p?ccR?F+I|'
    module_0.try_parse_int64(var_1)

def test_case_6():
    bool_0 = False
    var_0 = module_0.try_parse_int64(bool_0)
    assert var_0 == 0

def test_case_7():
    str_0 = 'c&B6UZAA(\x0cLncg)7T'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'c&B6UZAA(\x0cLncg)7T'
    var_1 = module_0.parse_words(var_0)

def test_case_8():
    str_0 = 'c&B6UZAA(Lncg)7T'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'c&B6UZAA(Lncg)7T'

def test_case_9():
    str_0 = 'c&B6UZAA(Lncg)7T'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'c&B6UZAA(Lncg)7T'
    var_1 = module_0.is_acronym(var_0)
    assert var_1 is False

def test_case_10():
    str_0 = 'ap+?Q)Om>,P";}a'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'ap+?Q)Om>,P";}a'
    var_1 = module_1.purge()
    none_type_0 = None
    var_2 = module_0.null_distance_results(none_type_0, none_type_0, var_0)
    assert var_2 == 0

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = 'c&B6UZAA(Lncg)7T'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'c&B6UZAA(Lncg)7T'
    var_1 = module_0.prefix_suffix_prep(var_0, var_0)
    module_0.null_distance_results(str_0, var_1, var_1)

def test_case_12():
    str_0 = '&B6UZAA(ncg)7T'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == '&B6UZAA(ncg)7T'
    none_type_0 = None
    var_1 = module_0.transfer_casing_for_similar_text(str_0, none_type_0)
    var_2 = module_0.parse_words(str_0)

def test_case_13():
    str_0 = 'c&B6UZAA(Lncg)7T'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'c&B6UZAA(Lncg)7T'
    var_1 = module_0.transfer_casing_for_matching_text(var_0, str_0)
    assert var_1 == 'c&B6UZAA(Lncg)7T'

@pytest.mark.xfail(strict=True)
def test_case_14():
    str_0 = 'L'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'L'
    var_1 = module_0.prefix_suffix_prep(var_0, var_0)
    var_2 = module_0.prefix_suffix_prep(var_1, str_0)
    module_0.null_distance_results(var_1, var_2, str_0)

def test_case_15():
    str_0 = 'c&B6UZAA(Lncg)7T'
    str_1 = "We need 'text_w_casing' to know what casing to transfer!"
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_1)
    assert var_0 == "we need 'text_w_cASING' TO KNOW WHAt CASIng TO TRANSFER!"

def test_case_16():
    str_0 = 'c\\&B6SYZA(Lcg)'
    str_1 = "We need 'text_w_caslng' to now what casing to transfer!"
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_1)
    assert var_0 == "we need 'text_w_caSLNG' TO NOW WHAt casing to transfer!"

@pytest.mark.xfail(strict=True)
def test_case_17():
    str_0 = 'c&B6UZAA(Lncg)7T'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'c&B6UZAA(Lncg)7T'
    var_1 = module_0.parse_words(var_0, str_0)
    module_0.null_distance_results(var_1, var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    str_0 = '@'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == '@'
    var_1 = module_0.prefix_suffix_prep(str_0, str_0)
    var_2 = module_0.parse_words(var_0, var_0)
    var_3 = module_0.prefix_suffix_prep(var_2, var_0)
    module_0.null_distance_results(var_2, var_1, var_1)

@pytest.mark.xfail(strict=True)
def test_case_19():
    str_0 = 'R,\x0b.p?CcR?F+I|'
    var_0 = module_0.parse_words(str_0)
    var_1 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_1 == 'R,\x0b.p?cCr?F+I|'
    var_2 = module_0.prefix_suffix_prep(var_1, var_1)
    var_3 = module_0.transfer_casing_for_similar_text(var_1, var_0)
    assert var_3 == 'RpccrFI'
    bool_0 = True
    var_4 = module_0.try_parse_int64(var_3)
    var_5 = module_0.null_distance_results(var_4, str_0, bool_0)
    assert var_5 == -1
    var_6 = module_0.try_parse_int64(var_5)
    assert var_6 == -1
    var_7 = module_0.to_similarity(var_5, var_3)
    assert var_7 == -1
    var_7.set_seq1(var_4)

def test_case_20():
    str_0 = 'c&B6UZAA(Lncg)7T'
    none_type_0 = None
    with pytest.raises(ValueError):
        module_0.transfer_casing_for_similar_text(none_type_0, str_0)

def test_case_21():
    str_0 = 'B'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'B'
    var_1 = module_0.prefix_suffix_prep(str_0, str_0)
    var_2 = module_0.parse_words(str_0, str_0)
    none_type_0 = None
    int_0 = 103
    var_3 = module_0.null_distance_results(var_1, none_type_0, int_0)
    assert var_3 == 3

@pytest.mark.xfail(strict=True)
def test_case_22():
    str_0 = 'ap+?Q)Om>,P";}a'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'ap+?Q)Om>,P";}a'
    var_1 = module_0.prefix_suffix_prep(str_0, var_0)
    var_2 = module_0.parse_words(str_0)
    var_3 = module_0.prefix_suffix_prep(var_0, var_2)
    module_0.null_distance_results(var_0, var_3, var_1)

@pytest.mark.xfail(strict=True)
def test_case_23():
    str_0 = 'c&B6U\tAA(%rLncGgT'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'c&B6U\tAA(%rLncgGt'
    var_1 = module_0.prefix_suffix_prep(var_0, str_0)
    var_2 = module_0.parse_words(var_0)
    var_3 = module_0.prefix_suffix_prep(var_1, var_0)
    module_1.search(str_0, var_3, var_1)

def test_case_24():
    str_0 = 'c&B6UZAA(Lncg)7T'
    var_0 = module_0.prefix_suffix_prep(str_0, str_0)
    list_0 = [str_0, var_0, str_0]
    var_1 = module_0.prefix_suffix_prep(list_0, var_0)
    bool_0 = True
    var_2 = module_0.try_parse_int64(bool_0)
    assert var_2 == 1
    var_3 = module_0.null_distance_results(var_0, var_1, bool_0)
    assert var_3 == -1

def test_case_25():
    str_0 = 'c\\&B6UZA(Lcg)T'
    str_1 = "We need 'text_w_casing' to now what casing to transfer!"
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_1)
    assert var_0 == "we need 'text_w_cAsING' TO NOW WHAT casing TO TRANSFER!"

def test_case_26():
    str_0 = 'R\x0b.p?C$cR?F+I|'
    var_0 = module_0.parse_words(str_0)
    var_1 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_1 == 'R\x0b.p?C$cR?F+I|'
    var_2 = module_0.prefix_suffix_prep(var_1, var_1)
    bool_0 = True
    var_3 = module_0.try_parse_int64(str_0)
    var_4 = module_0.try_parse_int64(str_0)
    var_5 = module_0.null_distance_results(var_3, str_0, bool_0)
    assert var_5 == -1

@pytest.mark.xfail(strict=True)
def test_case_27():
    str_0 = 'L'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'L'
    var_1 = module_0.prefix_suffix_prep(var_0, var_0)
    var_2 = module_0.transfer_casing_for_similar_text(var_0, var_1)
    assert var_2 == ''
    var_3 = module_0.transfer_casing_for_similar_text(var_1, var_2)
    assert var_3 == ''
    module_0.try_parse_int64(var_1)

def test_case_28():
    str_0 = 'R\x0b.p?C$cR?F+I|'
    var_0 = module_0.parse_words(str_0)
    list_0 = [str_0]
    with pytest.raises(ValueError):
        module_0.transfer_casing_for_matching_text(list_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_29():
    str_0 = 'C'
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_0 == 'C'
    var_1 = module_0.parse_words(str_0)
    var_2 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_2 == 'C'
    var_3 = module_0.prefix_suffix_prep(var_2, var_2)
    var_4 = module_0.transfer_casing_for_similar_text(var_2, var_1)
    assert var_4 == 'C'
    bool_0 = True
    var_5 = module_0.try_parse_int64(var_4)
    var_6 = module_0.null_distance_results(var_5, str_0, bool_0)
    assert var_6 == 1
    var_3.set_seq1(bool_0)

def test_case_30():
    str_0 = 'WB6UZA@(Ln\tg)7T'
    str_1 = "We need 'text_w_casing' to know what casing to transfer!"
    var_0 = module_0.transfer_casing_for_similar_text(str_0, str_1)
    assert var_0 == "WE NEED 'TEXT_W_cAsing' TO KNOW WHAT CASING TO TRANSFER!"

@pytest.mark.xfail(strict=True)
def test_case_31():
    str_0 = 'Converts the string representation of a number to its 64-bit\n    signed integer equivalent.\n\n    Parameters\n    ----------\n    string : str\n        string representation of a number\n\n    Returns\n    -------\n    int or None\n        The 64-bit signed integer equivalent, or None if conversion\n        failed or if the number is less than the min value or greater\n        than the max value of a 64-bit signed integer.\n    '
    var_0 = module_0.parse_words(str_0)
    var_1 = module_0.prefix_suffix_prep(str_0, str_0)
    var_2 = module_0.transfer_casing_for_similar_text(str_0, str_0)
    assert var_2 == 'Converts the string representation of a number to its 64-bit\n    signed integer equivalent.\n\n    PARAMETERS\n    ----------\n    STRING : STR\n        STRING REPresentation of a number\n\n    returns\n    -------\n    int or none\n        the 64-bit signed integer equivalent, or None if conversion\n        failed or if the number is less than the min value or greater\n        than the max value of a 64-bit signed integer.\n    '
    module_0.try_parse_int64(var_0)

@pytest.mark.xfail(strict=True)
def test_case_32():
    str_0 = '/P\n.}5^1'
    str_1 = '/'
    var_0 = module_0.transfer_casing_for_similar_text(str_1, str_1)
    assert var_0 == '/'
    var_1 = module_0.transfer_casing_for_similar_text(str_0, str_1)
    assert var_1 == '/'
    var_2 = module_0.prefix_suffix_prep(var_1, str_0)
    var_3 = module_0.transfer_casing_for_similar_text(var_1, str_0)
    assert var_3 == '/p\n.}5^1'
    var_4 = module_0.prefix_suffix_prep(var_3, str_0)
    bool_0 = False
    var_5 = module_0.try_parse_int64(bool_0)
    assert var_5 == 0
    var_6 = module_0.null_distance_results(str_1, var_1, bool_0)
    assert var_6 == -1
    var_7 = module_0.try_parse_int64(var_1)
    var_8 = module_0.is_acronym(str_1)
    assert var_8 is False
    bool_1 = True
    module_0.null_distance_results(bool_1, var_3, str_0)

@pytest.mark.xfail(strict=True)
def test_case_33():
    int_0 = 18446744073709551616
    var_0 = module_0.try_parse_int64(int_0)
    var_0.set_seqs(int_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_34():
    str_0 = '/P\n.}5^1'
    var_0 = module_0.parse_words(str_0, str_0)
    var_1 = module_0.prefix_suffix_prep(var_0, var_0)
    int_0 = -18446744073709551630
    var_2 = module_0.try_parse_int64(int_0)
    var_3 = module_0.try_parse_int64(str_0)
    str_1 = 'Calculate a similarity measure from an edit distance.\n\n    Parameters\n    ----------\n    distance : int\n        The edit distance between two strings.\n    length : int\n        The length of the longer of the two strings the edit distance\n        is from.\n\n    Returns\n    -------\n    float\n        A similarity value from 0 to 1.0 (1 - (length / distance)),\n        -1 if distance is negative\n    '
    var_3.__contains__(var_2, str_1)