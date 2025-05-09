# Automatically generated by Pynguin.
import pytest
import penman._lexer as module_0
import enum as module_1
import builtins as module_2
import re as module_3

def test_case_0():
    str_0 = ':0Xp_Y'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}

@pytest.mark.xfail(strict=True)
def test_case_1():
    bytes_0 = b'}\x0e'
    module_0.lex(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = ':0IXp_'
    module_0.lex(str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = ']>{-wnoFuw'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    token_0 = token_iterator_0.peek()
    assert f'{type(token_0).__module__}.{type(token_0).__qualname__}' == 'penman._lexer.Token'
    assert len(token_0) == 5
    var_0 = token_iterator_0.accept()
    token_1 = token_iterator_0.next()
    assert f'{type(token_1).__module__}.{type(token_1).__qualname__}' == 'penman._lexer.Token'
    assert len(token_1) == 5
    token_iterator_1 = module_0.lex(token_iterator_0)
    assert f'{type(token_iterator_1).__module__}.{type(token_iterator_1).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_1.iterator).__module__}.{type(token_iterator_1.iterator).__qualname__}' == 'builtins.generator'
    var_1 = token_iterator_1.__bool__()
    assert var_1 is False
    var_0.accept()

def test_case_4():
    str_0 = '!\tQ^i4$/q!FnOUF]'
    token_iterator_0 = module_0.lex(str_0, str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}

def test_case_5():
    str_0 = ':0Xp_Y'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    token_0 = token_iterator_0.next()
    assert f'{type(token_0).__module__}.{type(token_0).__qualname__}' == 'penman._lexer.Token'
    assert len(token_0) == 5

@pytest.mark.xfail(strict=True)
def test_case_6():
    str_0 = ']>{-wnoFuw'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    var_0 = token_iterator_0.accept()
    var_1 = var_0.__bool__()
    assert var_1 is False
    var_2 = var_1.__bool__()
    var_3 = token_iterator_0.__iter__()
    str_1 = "?8`)-''7tI.-p\tHG\\R)"
    decode_error_0 = var_3.error(str_1)
    assert f'{type(decode_error_0).__module__}.{type(decode_error_0).__qualname__}' == 'penman.exceptions.DecodeError'
    assert decode_error_0.message == "?8`)-''7tI.-p\tHG\\R)"
    assert decode_error_0.filename is None
    assert decode_error_0.lineno == 0
    assert decode_error_0.offset == 0
    assert decode_error_0.text is None
    var_4 = token_iterator_0.accept(*var_3)
    var_2.__next__()

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = '!\tQ^i4$/q!FnOUF]'
    token_iterator_0 = module_0.lex(str_0, str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    token_iterator_0.expect()

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = ':0IXp_'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    module_1.EnumMeta(*token_iterator_0)

def test_case_9():
    str_0 = ':0IXp_'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    var_0 = token_iterator_0.__next__()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'penman._lexer.Token'
    assert len(var_0) == 5

@pytest.mark.xfail(strict=True)
def test_case_10():
    auto_0 = module_1.auto()
    module_0.lex(auto_0, auto_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = 's,NQUTmO~kIor'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    token_0 = token_iterator_0.peek()
    assert f'{type(token_0).__module__}.{type(token_0).__qualname__}' == 'penman._lexer.Token'
    assert len(token_0) == 5
    token_iterator_0.expect(*token_iterator_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    str_0 = ':0Xp_'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    token_iterator_0.expect()

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = '\n    An iterator of Tokens with L1 lookahead.\n    '
    token_iterator_0 = module_0.lex(str_0, str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    token_iterator_0.peek()

@pytest.mark.xfail(strict=True)
def test_case_14():
    str_0 = 's,NQUTmO~kIor'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    token_iterator_0.expect(*token_iterator_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    str_0 = ':prep-in-addition-to'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    var_0 = token_iterator_0.accept(*str_0)
    token_0 = token_iterator_0.peek()
    assert f'{type(token_0).__module__}.{type(token_0).__qualname__}' == 'penman._lexer.Token'
    assert len(token_0) == 5
    str_1 = 'f;'
    decode_error_0 = token_iterator_0.error(str_1)
    assert f'{type(decode_error_0).__module__}.{type(decode_error_0).__qualname__}' == 'penman.exceptions.DecodeError'
    assert decode_error_0.message == 'f;'
    assert decode_error_0.filename is None
    assert decode_error_0.lineno == 0
    assert decode_error_0.offset == 0
    assert decode_error_0.text is None
    var_1 = token_iterator_0.__bool__()
    var_2 = token_iterator_0.accept(*token_0)
    assert f'{type(var_2).__module__}.{type(var_2).__qualname__}' == 'penman._lexer.Token'
    assert len(var_2) == 5
    var_3 = module_2.object()
    var_4 = token_iterator_0.__iter__()
    var_3.error(token_iterator_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    str_0 = ':prep-in-addition-to'
    token_iterator_0 = module_0.lex(str_0)
    assert f'{type(token_iterator_0).__module__}.{type(token_iterator_0).__qualname__}' == 'penman._lexer.TokenIterator'
    assert f'{type(token_iterator_0.iterator).__module__}.{type(token_iterator_0.iterator).__qualname__}' == 'builtins.generator'
    assert module_0.PATTERNS == {'COMMENT': '\\#.*$', 'STRING': '"[^"\\\\]*(?:\\\\.[^"\\\\]*)*"', 'ALIGNMENT': '~(?:[a-z]\\.?)?[0-9]+(?:,[0-9]+)*', 'ROLE': ':[^\\s()\\/:~]*', 'SYMBOL': '[^\\s()\\/:~]+', 'LPAREN': '\\(', 'RPAREN': '\\)', 'SLASH': '\\/', 'UNEXPECTED': '[^\\s]'}
    var_0 = token_iterator_0.accept(*str_0)
    token_0 = token_iterator_0.peek()
    assert f'{type(token_0).__module__}.{type(token_0).__qualname__}' == 'penman._lexer.Token'
    assert len(token_0) == 5
    str_1 = 'f;'
    decode_error_0 = token_iterator_0.error(str_1)
    assert f'{type(decode_error_0).__module__}.{type(decode_error_0).__qualname__}' == 'penman.exceptions.DecodeError'
    assert decode_error_0.message == 'f;'
    assert decode_error_0.filename is None
    assert decode_error_0.lineno == 0
    assert decode_error_0.offset == 0
    assert decode_error_0.text is None
    var_1 = token_iterator_0.__bool__()
    var_2 = token_iterator_0.__iter__()
    var_3 = token_iterator_0.__iter__()
    var_4 = var_2.expect(*token_0)
    assert f'{type(var_4).__module__}.{type(var_4).__qualname__}' == 'penman._lexer.Token'
    assert len(var_4) == 5
    decode_error_1 = var_2.error(token_iterator_0)
    assert decode_error_1.lineno == 1
    assert decode_error_1.offset == 20
    assert decode_error_1.text == ':prep-in-addition-to'
    var_5 = module_3.purge()
    var_2.__next__()