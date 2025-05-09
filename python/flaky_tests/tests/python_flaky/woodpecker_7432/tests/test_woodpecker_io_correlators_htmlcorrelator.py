# Automatically generated by Pynguin.
import pytest
import woodpecker.io.correlators.htmlcorrelator as module_0

def test_case_0():
    int_0 = 1032
    html_correlator_0 = module_0.HtmlCorrelator(int_0)
    assert f'{type(html_correlator_0.events).__module__}.{type(html_correlator_0.events).__qualname__}' == 'woodpecker.io.correlators.event.EventCollection'
    assert html_correlator_0.user_agent is None
    assert html_correlator_0.referers == {*()}
    assert html_correlator_0.redirects == {*()}
    assert html_correlator_0.wn_headers == {}
    assert module_0.HtmlCorrelator.resource_mime_types == ('text/css', 'application/x-javascript', 'application/javascript', 'image/png', 'image/jpeg', 'image/gif', 'image/tiff')
    assert module_0.HtmlCorrelator.excluded_headers == ('Host', 'Connection', 'Content-Length', 'X-Requested-With')

@pytest.mark.xfail(strict=True)
def test_case_1():
    bool_0 = True
    list_0 = [bool_0, bool_0, bool_0, bool_0]
    html_correlator_0 = module_0.HtmlCorrelator(list_0)
    assert f'{type(html_correlator_0.events).__module__}.{type(html_correlator_0.events).__qualname__}' == 'woodpecker.io.correlators.event.EventCollection'
    assert html_correlator_0.user_agent is None
    assert html_correlator_0.referers == {*()}
    assert html_correlator_0.redirects == {*()}
    assert html_correlator_0.wn_headers == {}
    assert module_0.HtmlCorrelator.resource_mime_types == ('text/css', 'application/x-javascript', 'application/javascript', 'image/png', 'image/jpeg', 'image/gif', 'image/tiff')
    assert module_0.HtmlCorrelator.excluded_headers == ('Host', 'Connection', 'Content-Length', 'X-Requested-With')
    html_correlator_0.correlate()

def test_case_2():
    dict_0 = {}
    html_correlator_0 = module_0.HtmlCorrelator(dict_0)
    assert f'{type(html_correlator_0.events).__module__}.{type(html_correlator_0.events).__qualname__}' == 'woodpecker.io.correlators.event.EventCollection'
    assert html_correlator_0.user_agent is None
    assert html_correlator_0.referers == {*()}
    assert html_correlator_0.redirects == {*()}
    assert html_correlator_0.wn_headers == {}
    assert module_0.HtmlCorrelator.resource_mime_types == ('text/css', 'application/x-javascript', 'application/javascript', 'image/png', 'image/jpeg', 'image/gif', 'image/tiff')
    assert module_0.HtmlCorrelator.excluded_headers == ('Host', 'Connection', 'Content-Length', 'X-Requested-With')
    var_0 = html_correlator_0.get_referers()

def test_case_3():
    dict_0 = {}
    html_correlator_0 = module_0.HtmlCorrelator(dict_0)
    assert f'{type(html_correlator_0.events).__module__}.{type(html_correlator_0.events).__qualname__}' == 'woodpecker.io.correlators.event.EventCollection'
    assert html_correlator_0.user_agent is None
    assert html_correlator_0.referers == {*()}
    assert html_correlator_0.redirects == {*()}
    assert html_correlator_0.wn_headers == {}
    assert module_0.HtmlCorrelator.resource_mime_types == ('text/css', 'application/x-javascript', 'application/javascript', 'image/png', 'image/jpeg', 'image/gif', 'image/tiff')
    assert module_0.HtmlCorrelator.excluded_headers == ('Host', 'Connection', 'Content-Length', 'X-Requested-With')
    var_0 = html_correlator_0.get_wn_headers()

def test_case_4():
    dict_0 = {}
    html_correlator_0 = module_0.HtmlCorrelator(dict_0)
    assert f'{type(html_correlator_0.events).__module__}.{type(html_correlator_0.events).__qualname__}' == 'woodpecker.io.correlators.event.EventCollection'
    assert html_correlator_0.user_agent is None
    assert html_correlator_0.referers == {*()}
    assert html_correlator_0.redirects == {*()}
    assert html_correlator_0.wn_headers == {}
    assert module_0.HtmlCorrelator.resource_mime_types == ('text/css', 'application/x-javascript', 'application/javascript', 'image/png', 'image/jpeg', 'image/gif', 'image/tiff')
    assert module_0.HtmlCorrelator.excluded_headers == ('Host', 'Connection', 'Content-Length', 'X-Requested-With')
    var_0 = html_correlator_0.get_redirects()

def test_case_5():
    dict_0 = {}
    html_correlator_0 = module_0.HtmlCorrelator(dict_0)
    assert f'{type(html_correlator_0.events).__module__}.{type(html_correlator_0.events).__qualname__}' == 'woodpecker.io.correlators.event.EventCollection'
    assert html_correlator_0.user_agent is None
    assert html_correlator_0.referers == {*()}
    assert html_correlator_0.redirects == {*()}
    assert html_correlator_0.wn_headers == {}
    assert module_0.HtmlCorrelator.resource_mime_types == ('text/css', 'application/x-javascript', 'application/javascript', 'image/png', 'image/jpeg', 'image/gif', 'image/tiff')
    assert module_0.HtmlCorrelator.excluded_headers == ('Host', 'Connection', 'Content-Length', 'X-Requested-With')
    var_0 = html_correlator_0.calculate_events(new_sequence_threshold=dict_0)