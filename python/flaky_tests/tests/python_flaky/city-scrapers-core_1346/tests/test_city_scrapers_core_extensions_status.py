# Automatically generated by Pynguin.
import pytest
import city_scrapers_core.extensions.status as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    azure_blob_status_extension_0 = module_0.AzureBlobStatusExtension(none_type_0)
    assert module_0.RUNNING == 'running'
    assert module_0.FAILING == 'failing'
    assert module_0.STATUS_COLOR_MAP == {'running': '#44cc11', 'failing': '#cb2431'}
    assert module_0.STATUS_ICON == '\n<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="144" height="20">\n    <linearGradient id="b" x2="0" y2="100%">\n        <stop offset="0" stop-color="#bbb" stop-opacity=".1"/>\n        <stop offset="1" stop-opacity=".1"/>\n    </linearGradient>\n    <clipPath id="a">\n        <rect width="144" height="20" rx="3" fill="#fff"/>\n    </clipPath>\n    <g clip-path="url(#a)">\n        <path fill="#555" d="M0 0h67v20H0z"/>\n        <path fill="{color}" d="M67 0h77v20H67z"/>\n        <path fill="url(#b)" d="M0 0h144v20H0z"/>\n    </g>\n    <g fill="#fff" text-anchor="middle" font-family="DejaVu Sans,Verdana,Geneva,sans-serif" font-size="110">\n        <text x="345" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{status}</text>\n        <text x="345" y="140" transform="scale(.1)">{status}</text>\n        <text x="1045" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{date}</text>\n        <text x="1045" y="140" transform="scale(.1)">{date}</text>\n    </g>\n</svg>\n'
    azure_blob_status_extension_0.spider_closed()

def test_case_1():
    int_0 = -320
    azure_blob_status_extension_0 = module_0.AzureBlobStatusExtension(int_0)
    assert module_0.RUNNING == 'running'
    assert module_0.FAILING == 'failing'
    assert module_0.STATUS_COLOR_MAP == {'running': '#44cc11', 'failing': '#cb2431'}
    assert module_0.STATUS_ICON == '\n<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="144" height="20">\n    <linearGradient id="b" x2="0" y2="100%">\n        <stop offset="0" stop-color="#bbb" stop-opacity=".1"/>\n        <stop offset="1" stop-opacity=".1"/>\n    </linearGradient>\n    <clipPath id="a">\n        <rect width="144" height="20" rx="3" fill="#fff"/>\n    </clipPath>\n    <g clip-path="url(#a)">\n        <path fill="#555" d="M0 0h67v20H0z"/>\n        <path fill="{color}" d="M67 0h77v20H67z"/>\n        <path fill="url(#b)" d="M0 0h144v20H0z"/>\n    </g>\n    <g fill="#fff" text-anchor="middle" font-family="DejaVu Sans,Verdana,Geneva,sans-serif" font-size="110">\n        <text x="345" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{status}</text>\n        <text x="345" y="140" transform="scale(.1)">{status}</text>\n        <text x="1045" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{date}</text>\n        <text x="1045" y="140" transform="scale(.1)">{date}</text>\n    </g>\n</svg>\n'

@pytest.mark.xfail(strict=True)
def test_case_2():
    bool_0 = False
    status_extension_0 = module_0.StatusExtension(bool_0)
    assert module_0.RUNNING == 'running'
    assert module_0.FAILING == 'failing'
    assert module_0.STATUS_COLOR_MAP == {'running': '#44cc11', 'failing': '#cb2431'}
    assert module_0.STATUS_ICON == '\n<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="144" height="20">\n    <linearGradient id="b" x2="0" y2="100%">\n        <stop offset="0" stop-color="#bbb" stop-opacity=".1"/>\n        <stop offset="1" stop-opacity=".1"/>\n    </linearGradient>\n    <clipPath id="a">\n        <rect width="144" height="20" rx="3" fill="#fff"/>\n    </clipPath>\n    <g clip-path="url(#a)">\n        <path fill="#555" d="M0 0h67v20H0z"/>\n        <path fill="{color}" d="M67 0h77v20H67z"/>\n        <path fill="url(#b)" d="M0 0h144v20H0z"/>\n    </g>\n    <g fill="#fff" text-anchor="middle" font-family="DejaVu Sans,Verdana,Geneva,sans-serif" font-size="110">\n        <text x="345" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{status}</text>\n        <text x="345" y="140" transform="scale(.1)">{status}</text>\n        <text x="1045" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{date}</text>\n        <text x="1045" y="140" transform="scale(.1)">{date}</text>\n    </g>\n</svg>\n'
    assert f'{type(module_0.StatusExtension.from_crawler).__module__}.{type(module_0.StatusExtension.from_crawler).__qualname__}' == 'builtins.method'
    status_extension_0.spider_error()

@pytest.mark.xfail(strict=True)
def test_case_3():
    bool_0 = True
    azure_blob_status_extension_0 = module_0.AzureBlobStatusExtension(bool_0)
    assert module_0.RUNNING == 'running'
    assert module_0.FAILING == 'failing'
    assert module_0.STATUS_COLOR_MAP == {'running': '#44cc11', 'failing': '#cb2431'}
    assert module_0.STATUS_ICON == '\n<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="144" height="20">\n    <linearGradient id="b" x2="0" y2="100%">\n        <stop offset="0" stop-color="#bbb" stop-opacity=".1"/>\n        <stop offset="1" stop-opacity=".1"/>\n    </linearGradient>\n    <clipPath id="a">\n        <rect width="144" height="20" rx="3" fill="#fff"/>\n    </clipPath>\n    <g clip-path="url(#a)">\n        <path fill="#555" d="M0 0h67v20H0z"/>\n        <path fill="{color}" d="M67 0h77v20H67z"/>\n        <path fill="url(#b)" d="M0 0h144v20H0z"/>\n    </g>\n    <g fill="#fff" text-anchor="middle" font-family="DejaVu Sans,Verdana,Geneva,sans-serif" font-size="110">\n        <text x="345" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{status}</text>\n        <text x="345" y="140" transform="scale(.1)">{status}</text>\n        <text x="1045" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{date}</text>\n        <text x="1045" y="140" transform="scale(.1)">{date}</text>\n    </g>\n</svg>\n'
    str_0 = 'n$A9z~n1L~P.;_etK8F7'
    azure_blob_status_extension_0.update_status_svg(bool_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    bool_0 = True
    s3_status_extension_0 = module_0.S3StatusExtension(bool_0)
    assert module_0.RUNNING == 'running'
    assert module_0.FAILING == 'failing'
    assert module_0.STATUS_COLOR_MAP == {'running': '#44cc11', 'failing': '#cb2431'}
    assert module_0.STATUS_ICON == '\n<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="144" height="20">\n    <linearGradient id="b" x2="0" y2="100%">\n        <stop offset="0" stop-color="#bbb" stop-opacity=".1"/>\n        <stop offset="1" stop-opacity=".1"/>\n    </linearGradient>\n    <clipPath id="a">\n        <rect width="144" height="20" rx="3" fill="#fff"/>\n    </clipPath>\n    <g clip-path="url(#a)">\n        <path fill="#555" d="M0 0h67v20H0z"/>\n        <path fill="{color}" d="M67 0h77v20H67z"/>\n        <path fill="url(#b)" d="M0 0h144v20H0z"/>\n    </g>\n    <g fill="#fff" text-anchor="middle" font-family="DejaVu Sans,Verdana,Geneva,sans-serif" font-size="110">\n        <text x="345" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{status}</text>\n        <text x="345" y="140" transform="scale(.1)">{status}</text>\n        <text x="1045" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{date}</text>\n        <text x="1045" y="140" transform="scale(.1)">{date}</text>\n    </g>\n</svg>\n'
    s3_status_extension_0.update_status_svg(bool_0, s3_status_extension_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    bool_0 = True
    azure_blob_status_extension_0 = module_0.AzureBlobStatusExtension(bool_0)
    assert module_0.RUNNING == 'running'
    assert module_0.FAILING == 'failing'
    assert module_0.STATUS_COLOR_MAP == {'running': '#44cc11', 'failing': '#cb2431'}
    assert module_0.STATUS_ICON == '\n<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="144" height="20">\n    <linearGradient id="b" x2="0" y2="100%">\n        <stop offset="0" stop-color="#bbb" stop-opacity=".1"/>\n        <stop offset="1" stop-opacity=".1"/>\n    </linearGradient>\n    <clipPath id="a">\n        <rect width="144" height="20" rx="3" fill="#fff"/>\n    </clipPath>\n    <g clip-path="url(#a)">\n        <path fill="#555" d="M0 0h67v20H0z"/>\n        <path fill="{color}" d="M67 0h77v20H67z"/>\n        <path fill="url(#b)" d="M0 0h144v20H0z"/>\n    </g>\n    <g fill="#fff" text-anchor="middle" font-family="DejaVu Sans,Verdana,Geneva,sans-serif" font-size="110">\n        <text x="345" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{status}</text>\n        <text x="345" y="140" transform="scale(.1)">{status}</text>\n        <text x="1045" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{date}</text>\n        <text x="1045" y="140" transform="scale(.1)">{date}</text>\n    </g>\n</svg>\n'
    str_0 = 'fu"`\n\'XV+o'
    azure_blob_status_extension_0.create_status_svg(bool_0, str_0)

def test_case_6():
    none_type_0 = None
    status_extension_0 = module_0.StatusExtension(none_type_0)
    assert module_0.RUNNING == 'running'
    assert module_0.FAILING == 'failing'
    assert module_0.STATUS_COLOR_MAP == {'running': '#44cc11', 'failing': '#cb2431'}
    assert module_0.STATUS_ICON == '\n<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="144" height="20">\n    <linearGradient id="b" x2="0" y2="100%">\n        <stop offset="0" stop-color="#bbb" stop-opacity=".1"/>\n        <stop offset="1" stop-opacity=".1"/>\n    </linearGradient>\n    <clipPath id="a">\n        <rect width="144" height="20" rx="3" fill="#fff"/>\n    </clipPath>\n    <g clip-path="url(#a)">\n        <path fill="#555" d="M0 0h67v20H0z"/>\n        <path fill="{color}" d="M67 0h77v20H67z"/>\n        <path fill="url(#b)" d="M0 0h144v20H0z"/>\n    </g>\n    <g fill="#fff" text-anchor="middle" font-family="DejaVu Sans,Verdana,Geneva,sans-serif" font-size="110">\n        <text x="345" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{status}</text>\n        <text x="345" y="140" transform="scale(.1)">{status}</text>\n        <text x="1045" y="150" fill="#010101" fill-opacity=".3" transform="scale(.1)">{date}</text>\n        <text x="1045" y="140" transform="scale(.1)">{date}</text>\n    </g>\n</svg>\n'
    assert f'{type(module_0.StatusExtension.from_crawler).__module__}.{type(module_0.StatusExtension.from_crawler).__qualname__}' == 'builtins.method'
    with pytest.raises(NotImplementedError):
        status_extension_0.update_status_svg(status_extension_0, status_extension_0)