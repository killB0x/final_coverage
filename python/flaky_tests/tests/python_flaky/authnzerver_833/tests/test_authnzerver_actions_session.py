# Automatically generated by Pynguin.
import pytest
import platform as module_0
import authnzerver.actions.session as module_1
import urllib.request as module_2
import io as module_3
import sqlalchemy.util.topological as module_4
import email.base64mime as module_5

def test_case_0():
    var_0 = module_0.python_implementation()
    var_1 = module_1.auth_session_new(var_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    bytes_0 = b'\xe0\x15%Q\x86u\xb5i\xe3\xfeo\xfcU}J\xda~'
    module_1.internal_edit_session(bytes_0, bytes_0, bytes_0, bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_2():
    none_type_0 = None
    module_1.auth_session_exists(none_type_0, raiseonfail=none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    none_type_0 = None
    module_1.auth_session_delete(none_type_0, none_type_0, none_type_0, none_type_0)

def test_case_4():
    var_0 = module_2.thishost()
    var_1 = module_1.auth_delete_sessions_userid(var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    module_1.auth_kill_old_sessions()

@pytest.mark.xfail(strict=True)
def test_case_6():
    var_0 = module_2.ftperrors()
    var_1 = module_1.auth_session_delete(var_0, config=var_0)
    var_2 = module_1.auth_delete_sessions_userid(var_0)
    var_3 = module_0.java_ver(var_2)
    var_2.get(timeout=var_2)

@pytest.mark.xfail(strict=True)
def test_case_7():
    var_0 = module_2.ftperrors()
    var_1 = module_1.internal_edit_session(var_0, var_0)
    module_1.auth_kill_old_sessions()

@pytest.mark.xfail(strict=True)
def test_case_8():
    var_0 = module_0.node()
    var_1 = var_0.__eq__(var_0)
    var_2 = module_1.internal_edit_session(var_0, var_0)
    var_3 = module_1.auth_session_delete(var_0, config=var_0)
    var_4 = module_1.auth_delete_sessions_userid(var_0)
    var_5 = module_1.auth_session_exists(var_2)
    var_6 = module_1.auth_session_new(var_2, var_4)
    module_1.auth_kill_old_sessions(override_authdb_path=var_1, raiseonfail=var_2, config=var_5)

@pytest.mark.xfail(strict=True)
def test_case_9():
    var_0 = module_2.ftperrors()
    var_1 = module_1.auth_session_new(var_0, config=var_0)
    var_2 = module_1.auth_session_exists(var_1)
    module_1.auth_kill_old_sessions(config=var_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    var_0 = module_2.ftperrors()
    var_1 = module_1.internal_edit_session(var_0, var_0)
    var_2 = module_1.auth_session_delete(var_0, config=var_0)
    var_3 = module_1.auth_delete_sessions_userid(var_0)
    var_4 = var_3.__repr__()
    assert var_4 == '{\'success\': False, \'failure_reason\': "invalid request: missing \'reqid\' in request", \'messages\': [\'Invalid session delete request.\']}'
    var_5 = module_1.auth_session_delete(var_4, var_1)
    var_3.get(timeout=var_3)

@pytest.mark.xfail(strict=True)
def test_case_11():
    var_0 = module_2.ftperrors()
    var_1 = module_1.internal_edit_session(var_0, var_0)
    var_2 = module_1.auth_session_exists(var_0)
    var_3 = module_1.auth_session_delete(var_0, config=var_0)
    var_4 = module_1.auth_delete_sessions_userid(var_0)
    var_5 = var_4.__repr__()
    assert var_5 == '{\'success\': False, \'failure_reason\': "invalid request: missing \'reqid\' in request", \'messages\': [\'Invalid session delete request.\']}'
    var_6 = module_1.auth_session_delete(var_5, var_1)
    var_7 = module_3.BufferedIOBase()
    var_8 = module_1.auth_session_exists(var_5)
    var_9 = module_4.sort(var_8, var_8)
    var_10 = module_1.auth_session_delete(var_0, raiseonfail=var_1)
    module_5.header_encode(var_1)

@pytest.mark.xfail(strict=True)
def test_case_12():
    var_0 = module_0.node()
    var_1 = var_0.__eq__(var_0)
    var_2 = module_1.auth_session_delete(var_0, var_0, var_0, var_0)
    var_3 = var_2.__repr__()
    assert var_3 == '{\'success\': False, \'failure_reason\': "invalid request: missing \'reqid\' in request", \'messages\': [\'Invalid session delete request.\']}'
    var_4 = var_2.__repr__()
    assert var_4 == '{\'success\': False, \'failure_reason\': "invalid request: missing \'reqid\' in request", \'messages\': [\'Invalid session delete request.\']}'
    var_5 = module_1.auth_session_new(var_4)
    module_1.auth_session_exists(var_1)