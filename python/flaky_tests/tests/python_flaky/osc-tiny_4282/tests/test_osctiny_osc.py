# Automatically generated by Pynguin.
import pytest
import osctiny.osc as module_0
import osctiny.extensions.packages as module_1
import osctiny.extensions.comments as module_2

def test_case_0():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5

def test_case_1():
    str_0 = '\n        Create files with default content in ``.osc`` sub-directory\n        '
    osc_0 = module_0.Osc(str_0, verify=str_0, cache=str_0)
    assert f'{type(osc_0).__module__}.{type(osc_0).__qualname__}' == 'osctiny.osc.Osc'
    assert osc_0.url == '\n        Create files with default content in ``.osc`` sub-directory\n        '
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert f'{type(osc_0.parser).__module__}.{type(osc_0.parser).__qualname__}' == 'lxml.etree.XMLParser'
    assert f'{type(osc_0.build).__module__}.{type(osc_0.build).__qualname__}' == 'osctiny.extensions.buildresults.Build'
    assert f'{type(osc_0.comments).__module__}.{type(osc_0.comments).__qualname__}' == 'osctiny.extensions.comments.Comment'
    assert f'{type(osc_0.distributions).__module__}.{type(osc_0.distributions).__qualname__}' == 'osctiny.extensions.distributions.Distribution'
    assert f'{type(osc_0.groups).__module__}.{type(osc_0.groups).__qualname__}' == 'osctiny.extensions.users.Group'
    assert f'{type(osc_0.issues).__module__}.{type(osc_0.issues).__qualname__}' == 'osctiny.extensions.issues.Issue'
    assert f'{type(osc_0.packages).__module__}.{type(osc_0.packages).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert f'{type(osc_0.projects).__module__}.{type(osc_0.projects).__qualname__}' == 'osctiny.extensions.projects.Project'
    assert f'{type(osc_0.requests).__module__}.{type(osc_0.requests).__qualname__}' == 'osctiny.extensions.bs_requests.Request'
    assert f'{type(osc_0.search).__module__}.{type(osc_0.search).__qualname__}' == 'osctiny.extensions.search.Search'
    assert f'{type(osc_0.users).__module__}.{type(osc_0.users).__qualname__}' == 'osctiny.extensions.users.Person'
    assert f'{type(osc_0.session).__module__}.{type(osc_0.session).__qualname__}' == 'requests.sessions.Session'
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5

@pytest.mark.xfail(strict=True)
def test_case_2():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    none_type_0 = None
    osc_1 = module_0.Osc(username=osc_0, password=none_type_0)
    assert osc_1.url == 'https://api.opensuse.org'
    assert f'{type(osc_1.username).__module__}.{type(osc_1.username).__qualname__}' == 'osctiny.osc.Osc'
    assert osc_1.password == ''
    osc_0.get_objectified_xml(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    package_0 = module_1.Package(osc_0)
    osc_1 = module_0.Osc(cache=package_0)
    assert f'{type(osc_1).__module__}.{type(osc_1).__qualname__}' == 'osctiny.osc.Osc'
    assert osc_1.url == 'https://api.opensuse.org'
    assert osc_1.username == ''
    assert osc_1.password == ''
    assert f'{type(osc_1.parser).__module__}.{type(osc_1.parser).__qualname__}' == 'lxml.etree.XMLParser'
    assert f'{type(osc_1.build).__module__}.{type(osc_1.build).__qualname__}' == 'osctiny.extensions.buildresults.Build'
    assert f'{type(osc_1.comments).__module__}.{type(osc_1.comments).__qualname__}' == 'osctiny.extensions.comments.Comment'
    assert f'{type(osc_1.distributions).__module__}.{type(osc_1.distributions).__qualname__}' == 'osctiny.extensions.distributions.Distribution'
    assert f'{type(osc_1.groups).__module__}.{type(osc_1.groups).__qualname__}' == 'osctiny.extensions.users.Group'
    assert f'{type(osc_1.issues).__module__}.{type(osc_1.issues).__qualname__}' == 'osctiny.extensions.issues.Issue'
    assert f'{type(osc_1.packages).__module__}.{type(osc_1.packages).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert f'{type(osc_1.projects).__module__}.{type(osc_1.projects).__qualname__}' == 'osctiny.extensions.projects.Project'
    assert f'{type(osc_1.requests).__module__}.{type(osc_1.requests).__qualname__}' == 'osctiny.extensions.bs_requests.Request'
    assert f'{type(osc_1.search).__module__}.{type(osc_1.search).__qualname__}' == 'osctiny.extensions.search.Search'
    assert f'{type(osc_1.users).__module__}.{type(osc_1.users).__qualname__}' == 'osctiny.extensions.users.Person'
    assert f'{type(osc_1.session).__module__}.{type(osc_1.session).__qualname__}' == 'requests.sessions.Session'
    osc_2 = module_0.Osc(package_0, package_0, osc_0)
    assert f'{type(osc_2.url).__module__}.{type(osc_2.url).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert f'{type(osc_2.username).__module__}.{type(osc_2.username).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert f'{type(osc_2.password).__module__}.{type(osc_2.password).__qualname__}' == 'osctiny.osc.Osc'
    package_0.add_comment(osc_0, osc_0, osc_0, osc_2)

@pytest.mark.xfail(strict=True)
def test_case_4():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    osc_0.request(osc_0, raise_for_status=osc_0, timeout=osc_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    bool_0 = True
    dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0}
    osc_0 = module_0.Osc(dict_0, verify=bool_0, cache=bool_0)
    assert f'{type(osc_0).__module__}.{type(osc_0).__qualname__}' == 'osctiny.osc.Osc'
    assert osc_0.url == {True: True}
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert f'{type(osc_0.parser).__module__}.{type(osc_0.parser).__qualname__}' == 'lxml.etree.XMLParser'
    assert f'{type(osc_0.build).__module__}.{type(osc_0.build).__qualname__}' == 'osctiny.extensions.buildresults.Build'
    assert f'{type(osc_0.comments).__module__}.{type(osc_0.comments).__qualname__}' == 'osctiny.extensions.comments.Comment'
    assert f'{type(osc_0.distributions).__module__}.{type(osc_0.distributions).__qualname__}' == 'osctiny.extensions.distributions.Distribution'
    assert f'{type(osc_0.groups).__module__}.{type(osc_0.groups).__qualname__}' == 'osctiny.extensions.users.Group'
    assert f'{type(osc_0.issues).__module__}.{type(osc_0.issues).__qualname__}' == 'osctiny.extensions.issues.Issue'
    assert f'{type(osc_0.packages).__module__}.{type(osc_0.packages).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert f'{type(osc_0.projects).__module__}.{type(osc_0.projects).__qualname__}' == 'osctiny.extensions.projects.Project'
    assert f'{type(osc_0.requests).__module__}.{type(osc_0.requests).__qualname__}' == 'osctiny.extensions.bs_requests.Request'
    assert f'{type(osc_0.search).__module__}.{type(osc_0.search).__qualname__}' == 'osctiny.extensions.search.Search'
    assert f'{type(osc_0.users).__module__}.{type(osc_0.users).__qualname__}' == 'osctiny.extensions.users.Person'
    assert f'{type(osc_0.session).__module__}.{type(osc_0.session).__qualname__}' == 'requests.sessions.Session'
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    osc_0.request(dict_0, data=osc_0, raise_for_status=bool_0)

def test_case_6():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    var_0 = osc_0.handle_params(osc_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    osc_0.get_objectified_xml(osc_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    osc_0.request(osc_0, timeout=osc_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    str_0 = '\n    Compatibility layer for the ``.osc`` data directory used by the ``osc`` CLI\n    '
    none_type_0 = None
    osc_0 = module_0.Osc(str_0, none_type_0, str_0, str_0)
    assert osc_0.url == '\n    Compatibility layer for the ``.osc`` data directory used by the ``osc`` CLI\n    '
    assert osc_0.username == ''
    assert osc_0.password == '\n    Compatibility layer for the ``.osc`` data directory used by the ``osc`` CLI\n    '
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    comment_0 = module_2.Comment(str_0)
    tuple_0 = (comment_0,)
    osc_1 = module_0.Osc(tuple_0, password=str_0, cache=comment_0)
    assert f'{type(osc_1).__module__}.{type(osc_1).__qualname__}' == 'osctiny.osc.Osc'
    assert f'{type(osc_1.url).__module__}.{type(osc_1.url).__qualname__}' == 'builtins.tuple'
    assert len(osc_1.url) == 1
    assert osc_1.username == ''
    assert osc_1.password == '\n    Compatibility layer for the ``.osc`` data directory used by the ``osc`` CLI\n    '
    assert f'{type(osc_1.parser).__module__}.{type(osc_1.parser).__qualname__}' == 'lxml.etree.XMLParser'
    assert f'{type(osc_1.build).__module__}.{type(osc_1.build).__qualname__}' == 'osctiny.extensions.buildresults.Build'
    assert f'{type(osc_1.comments).__module__}.{type(osc_1.comments).__qualname__}' == 'osctiny.extensions.comments.Comment'
    assert f'{type(osc_1.distributions).__module__}.{type(osc_1.distributions).__qualname__}' == 'osctiny.extensions.distributions.Distribution'
    assert f'{type(osc_1.groups).__module__}.{type(osc_1.groups).__qualname__}' == 'osctiny.extensions.users.Group'
    assert f'{type(osc_1.issues).__module__}.{type(osc_1.issues).__qualname__}' == 'osctiny.extensions.issues.Issue'
    assert f'{type(osc_1.packages).__module__}.{type(osc_1.packages).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert f'{type(osc_1.projects).__module__}.{type(osc_1.projects).__qualname__}' == 'osctiny.extensions.projects.Project'
    assert f'{type(osc_1.requests).__module__}.{type(osc_1.requests).__qualname__}' == 'osctiny.extensions.bs_requests.Request'
    assert f'{type(osc_1.search).__module__}.{type(osc_1.search).__qualname__}' == 'osctiny.extensions.search.Search'
    assert f'{type(osc_1.users).__module__}.{type(osc_1.users).__qualname__}' == 'osctiny.extensions.users.Person'
    assert f'{type(osc_1.session).__module__}.{type(osc_1.session).__qualname__}' == 'requests.sessions.Session'
    str_1 = '{}/{}/{}/{}'
    var_0 = osc_1.__del__()
    var_1 = osc_1.handle_params(str_1)
    assert var_1 == b'{}/{}/{}/{}'
    osc_1.get_objectified_xml(osc_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    str_0 = '\n    Compatibility layer for the ``.osc`` data directory used by the ``osc`` CLI\n    '
    none_type_0 = None
    osc_0 = module_0.Osc(str_0, none_type_0, str_0, str_0)
    assert osc_0.url == '\n    Compatibility layer for the ``.osc`` data directory used by the ``osc`` CLI\n    '
    assert osc_0.username == ''
    assert osc_0.password == '\n    Compatibility layer for the ``.osc`` data directory used by the ``osc`` CLI\n    '
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    comment_0 = module_2.Comment(str_0)
    osc_0.request(comment_0, stream=osc_0, data=comment_0, raise_for_status=none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    bool_0 = True
    dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0}
    osc_0 = module_0.Osc(cache=bool_0)
    assert f'{type(osc_0).__module__}.{type(osc_0).__qualname__}' == 'osctiny.osc.Osc'
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert f'{type(osc_0.parser).__module__}.{type(osc_0.parser).__qualname__}' == 'lxml.etree.XMLParser'
    assert f'{type(osc_0.build).__module__}.{type(osc_0.build).__qualname__}' == 'osctiny.extensions.buildresults.Build'
    assert f'{type(osc_0.comments).__module__}.{type(osc_0.comments).__qualname__}' == 'osctiny.extensions.comments.Comment'
    assert f'{type(osc_0.distributions).__module__}.{type(osc_0.distributions).__qualname__}' == 'osctiny.extensions.distributions.Distribution'
    assert f'{type(osc_0.groups).__module__}.{type(osc_0.groups).__qualname__}' == 'osctiny.extensions.users.Group'
    assert f'{type(osc_0.issues).__module__}.{type(osc_0.issues).__qualname__}' == 'osctiny.extensions.issues.Issue'
    assert f'{type(osc_0.packages).__module__}.{type(osc_0.packages).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert f'{type(osc_0.projects).__module__}.{type(osc_0.projects).__qualname__}' == 'osctiny.extensions.projects.Project'
    assert f'{type(osc_0.requests).__module__}.{type(osc_0.requests).__qualname__}' == 'osctiny.extensions.bs_requests.Request'
    assert f'{type(osc_0.search).__module__}.{type(osc_0.search).__qualname__}' == 'osctiny.extensions.search.Search'
    assert f'{type(osc_0.users).__module__}.{type(osc_0.users).__qualname__}' == 'osctiny.extensions.users.Person'
    assert f'{type(osc_0.session).__module__}.{type(osc_0.session).__qualname__}' == 'requests.sessions.Session'
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    osc_0.request(bool_0, bool_0, data=bool_0, params=dict_0, raise_for_status=dict_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    package_0 = module_1.Package(osc_0)
    package_0.add_comment(osc_0, osc_0, osc_0, osc_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    package_0 = module_1.Package(osc_0)
    osc_1 = module_0.Osc(username=package_0, cache=osc_0)
    assert f'{type(osc_1).__module__}.{type(osc_1).__qualname__}' == 'osctiny.osc.Osc'
    assert osc_1.url == 'https://api.opensuse.org'
    assert f'{type(osc_1.username).__module__}.{type(osc_1.username).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert osc_1.password == ''
    assert f'{type(osc_1.parser).__module__}.{type(osc_1.parser).__qualname__}' == 'lxml.etree.XMLParser'
    assert f'{type(osc_1.build).__module__}.{type(osc_1.build).__qualname__}' == 'osctiny.extensions.buildresults.Build'
    assert f'{type(osc_1.comments).__module__}.{type(osc_1.comments).__qualname__}' == 'osctiny.extensions.comments.Comment'
    assert f'{type(osc_1.distributions).__module__}.{type(osc_1.distributions).__qualname__}' == 'osctiny.extensions.distributions.Distribution'
    assert f'{type(osc_1.groups).__module__}.{type(osc_1.groups).__qualname__}' == 'osctiny.extensions.users.Group'
    assert f'{type(osc_1.issues).__module__}.{type(osc_1.issues).__qualname__}' == 'osctiny.extensions.issues.Issue'
    assert f'{type(osc_1.packages).__module__}.{type(osc_1.packages).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert f'{type(osc_1.projects).__module__}.{type(osc_1.projects).__qualname__}' == 'osctiny.extensions.projects.Project'
    assert f'{type(osc_1.requests).__module__}.{type(osc_1.requests).__qualname__}' == 'osctiny.extensions.bs_requests.Request'
    assert f'{type(osc_1.search).__module__}.{type(osc_1.search).__qualname__}' == 'osctiny.extensions.search.Search'
    assert f'{type(osc_1.users).__module__}.{type(osc_1.users).__qualname__}' == 'osctiny.extensions.users.Person'
    assert f'{type(osc_1.session).__module__}.{type(osc_1.session).__qualname__}' == 'requests.sessions.Session'
    package_1 = module_1.Package(osc_0)
    none_type_0 = None
    osc_2 = module_0.Osc(none_type_0)
    assert osc_2.url == 'https://api.opensuse.org'
    assert osc_2.username == ''
    assert osc_2.password == ''
    package_1.get_list(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    bool_0 = True
    dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_0: bool_0, bool_0: bool_0}
    osc_0 = module_0.Osc(dict_0, verify=bool_0, cache=bool_0)
    assert f'{type(osc_0).__module__}.{type(osc_0).__qualname__}' == 'osctiny.osc.Osc'
    assert osc_0.url == {True: True}
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert f'{type(osc_0.parser).__module__}.{type(osc_0.parser).__qualname__}' == 'lxml.etree.XMLParser'
    assert f'{type(osc_0.build).__module__}.{type(osc_0.build).__qualname__}' == 'osctiny.extensions.buildresults.Build'
    assert f'{type(osc_0.comments).__module__}.{type(osc_0.comments).__qualname__}' == 'osctiny.extensions.comments.Comment'
    assert f'{type(osc_0.distributions).__module__}.{type(osc_0.distributions).__qualname__}' == 'osctiny.extensions.distributions.Distribution'
    assert f'{type(osc_0.groups).__module__}.{type(osc_0.groups).__qualname__}' == 'osctiny.extensions.users.Group'
    assert f'{type(osc_0.issues).__module__}.{type(osc_0.issues).__qualname__}' == 'osctiny.extensions.issues.Issue'
    assert f'{type(osc_0.packages).__module__}.{type(osc_0.packages).__qualname__}' == 'osctiny.extensions.packages.Package'
    assert f'{type(osc_0.projects).__module__}.{type(osc_0.projects).__qualname__}' == 'osctiny.extensions.projects.Project'
    assert f'{type(osc_0.requests).__module__}.{type(osc_0.requests).__qualname__}' == 'osctiny.extensions.bs_requests.Request'
    assert f'{type(osc_0.search).__module__}.{type(osc_0.search).__qualname__}' == 'osctiny.extensions.search.Search'
    assert f'{type(osc_0.users).__module__}.{type(osc_0.users).__qualname__}' == 'osctiny.extensions.users.Person'
    assert f'{type(osc_0.session).__module__}.{type(osc_0.session).__qualname__}' == 'requests.sessions.Session'
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    osc_1 = module_0.Osc()
    assert osc_1.url == 'https://api.opensuse.org'
    assert osc_1.username == ''
    assert osc_1.password == ''
    var_0 = osc_0.__del__()
    osc_2 = module_0.Osc(username=osc_0, verify=osc_0)
    assert osc_2.url == 'https://api.opensuse.org'
    assert f'{type(osc_2.username).__module__}.{type(osc_2.username).__qualname__}' == 'osctiny.osc.Osc'
    assert osc_2.password == ''
    bytes_0 = b'\xee\x0c\xd6\x97Q'
    osc_2.request(dict_0, data=bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    osc_0 = module_0.Osc()
    assert osc_0.url == 'https://api.opensuse.org'
    assert osc_0.username == ''
    assert osc_0.password == ''
    assert module_0.CacheControl is None
    assert module_0.Osc.url == 'https://api.opensuse.org'
    assert module_0.Osc.username == ''
    assert module_0.Osc.password == ''
    assert module_0.Osc.default_timeout == (60, 300)
    assert module_0.Osc.default_connection_retries == 5
    assert module_0.Osc.default_retry_timeout == 5
    package_0 = module_1.Package(osc_0)
    none_type_0 = None
    package_0.get_list(osc_0, none_type_0)