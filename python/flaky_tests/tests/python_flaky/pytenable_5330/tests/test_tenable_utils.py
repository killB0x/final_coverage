# Automatically generated by Pynguin.
import pytest
import tenable.utils as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    str_0 = 'gEajb"*eoS'
    str_1 = 'g|<\x0bo'
    module_0.dict_merge(str_0, str_1)

@pytest.mark.xfail(strict=True)
def test_case_1():
    list_0 = []
    var_0 = module_0.dict_merge(list_0, list_0)
    str_0 = '\n        Re-imports an existing scan into the cumulative repository.\n\n        :sc-api:`scan-result: re-import <Scan-Result.html#ScanResultRESTReference-/scanResult/{id}/import>`\n\n        Args:\n            id (int):\n                The scan instance identifier.\n            auto_mitigation (int, optional):\n                How many days to hold on to data before mitigating it?  The\n                default value is 0.\n            host_tracking (bool, optional):\n                Should DHCP hdst tracking be enabled?  The default is False.\n        *   vhosts (bool, optional):\n                Should virtual host logic be enabled for the scan?  The default\n                is ``False``.\n\n        Returns:\n            :obj:`str`:\n                An empty string response.\n\n        Examples:\n            >>> sc.scan_instances.reimport_scan(1)\n        '
    module_0.policy_settings(str_0)

def test_case_2():
    bool_0 = True
    tuple_0 = (bool_0, bool_0, bool_0)
    dict_0 = {tuple_0: tuple_0, bool_0: bool_0}
    var_0 = module_0.policy_settings(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = '\n        Retrieves the details of a specified security manager within a\n        specified organization.\n\n        :sc-api:`organization-security-manager: details <Organization-Security-Manager.html#OrganizationSecurityManagerRESTReference-/organization/{orgID}/securityManager/{id}>`\n\n        Args:\n            org_id: (int):\n                The numeric identifier for the organization.\n            user_id: (int):\n                The numeric identifier for the user.\n            fields (list, optional):\n                The list of fields that are desired to be returned.  For details\n                on what fields are available, please refer to the details on the\n                request within the organization list API doc.\n\n        Returns:\n            :obj:`dict`:\n                The user resource record.\n\n        Examples:\n            >>> secmngr = sc.organizations.manager_details(1, 1)\n        '
    module_0.policy_settings(str_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = '\n        Re-imports an existing scan into the cumulative repository.\n\n        :sc-api:`scan-result: re-import <Scan-Result.html#ScanResultRESTReference-/scanResult/{id}/import>`\n\n        Args:\n            id (int):\n                The scan instance identifier.\n            auto_mitigation (int, optional):\n                How many days to hold on to data before mitigating it?  The\n                default value is 0.\n            host_tracking (bool, optional):\n                Should DHCP host tracking be enabled?  The default is False.\n            vhosts (bool, optional):\n                Should virtual host logic be enabled for the scan?  The default\n                is ``False``.\n\n        Returns:\n            :obj:`str`:\n                An empty string response.\n\n        Examples:\n            >>> sc.scan_instances.reimport_scan(1)\n        '
    var_0 = module_0.url_validator(str_0)
    module_0.policy_settings(str_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    bool_0 = True
    list_0 = [bool_0, bool_0, bool_0]
    var_0 = module_0.url_validator(bool_0)
    assert var_0 is False
    dict_0 = {var_0: var_0}
    var_1 = module_0.dict_merge(list_0, dict_0)
    str_0 = "\n        Creates a new access group\n\n        :devportal:`access-groups: create <access-groups-create>`\n\n        Args:\n            name (str):\n                The name of the access group to create.\n            rules (list):\n                a list of rule tuples.  Tuples are defined in the standardized\n                method of name, operator, value.  For example:\n\n                .. code-block:: python\n\n                    ('operating_system', 'eq', ['Windows NT'])\n\n          3     Rules will be validate against by the filters before being sent\n                to the API.  Note that the value field in this context is a list\n                of string values.\n            principals (list, optional):\n                A list of principal tuples.  Each tuple must contain both the\n                type and the ientifier for the principal.  The identifier can\n                be either a UUID associated to a user/group, or the name of the\n                user/group.  For example:\n\n                .. code-block: python\n\n                    ('user', '32a0c314-442b-4aed-bbf5-ba9cf5cafbf4')\n                    ('user', 'steve@company.tld')\n                    ('group', '32a0c314-442b-4aed-bbf5-ba9cf5cafbf4')\n\n            all_users (bool, optional):\n                f enabled, the access group will apply to all users and any\n                principals defined will be ignored.\n\n        Returns:\n            :obj:`dict`:\n                The resource record for the new access list.\n\n        Examples:\n            Allow all users to see 192.168.0.0/24:\n\n            >>> tio.access_groups.create('Example',\n            ...     [('ipv4', 'eq', ['192.168.0.0/24'])],\n            ...     all_users=True)B\n            Allow everyone in a specific group id to see specific hosts:\n\n            >>> tio.access_groups.create('Example',\n            ...     [('netbiosdname', 'eq', ['dc1.company.tld']),\n            ...      ('netbios_name', 'eq', ['dc2.company.tld'])],\n            ...     principals=[\n            ...         ('group', '32a0c314-442b-4aed-bbf5-ba9cf5cafbf4')\n            ... ])\n        "
    module_0.policy_settings(str_0)

def test_case_6():
    bytes_0 = b'wcfR\xeb\x9a\xd0\xda\x88\xb6\xb2X\xfeZ\x90\x1bw\x9e'
    bool_0 = True
    str_0 = 'gEajb"*eoS'
    dict_0 = {str_0: bool_0, bool_0: bytes_0, bool_0: bool_0, str_0: bool_0}
    var_0 = module_0.dict_merge(dict_0, dict_0)

def test_case_7():
    float_0 = 1344.2802475060253
    bytes_0 = b'wcfR\xeb\x9a\xd0\xda\x88\xb6\xb2X\xfeZ\x90\x1bw\x9e'
    bool_0 = False
    str_0 = ''
    dict_0 = {float_0: bytes_0, float_0: float_0, bool_0: str_0, str_0: float_0}
    var_0 = module_0.policy_settings(dict_0)
    var_1 = module_0.dict_merge(dict_0, var_0)
    var_2 = module_0.url_validator(bool_0)
    var_3 = module_0.dict_merge(var_1, dict_0)
    var_4 = module_0.url_validator(bytes_0)
    assert var_4 is False
    var_5 = module_0.url_validator(var_0)
    int_0 = 3681
    dict_1 = {int_0: var_3, str_0: var_0}
    var_6 = module_0.policy_settings(dict_1)

@pytest.mark.xfail(strict=True)
def test_case_8():
    bytes_0 = b'wcfR\xeb\x9a\xd0\xda\x88\xb6\xb2X\xfeZ\x90\x1bw\x9e'
    bool_0 = False
    str_0 = 'modes'
    dict_0 = {bool_0: bytes_0, bool_0: bool_0, bool_0: str_0, str_0: bool_0}
    var_0 = module_0.policy_settings(dict_0)
    var_1 = module_0.dict_merge(dict_0, var_0)
    var_2 = module_0.url_validator(bool_0)
    module_0.dict_merge(var_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    bytes_0 = b'\xc5<A\x1e2O\x99\xc6\xbbk\xe9'
    bool_0 = False
    str_0 = 'd'
    dict_0 = {bool_0: bytes_0, bool_0: bool_0, bool_0: str_0, str_0: bool_0}
    tuple_0 = (dict_0, bool_0, bytes_0, bytes_0)
    module_0.dict_merge(tuple_0, dict_0)

def test_case_10():
    bytes_0 = b'd'
    list_0 = [bytes_0, bytes_0, bytes_0, bytes_0]
    dict_0 = {bytes_0: bytes_0, bytes_0: list_0}
    var_0 = module_0.policy_settings(dict_0)
    var_1 = module_0.dict_merge(var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    str_0 = '\n        Re-imports an existing scan into the cumulative repository.\n\n        :sc-api:`scan-result: re-import <Scan-Result.html#ScanResultRESTReference-/scanResult/{id}/import>`\n\n        Args:\n            id (int):\n                The scan instance identifier.\n            auto_mitigation (int, optional):\n                How many days to hold on to data before mitigating it?  The\n                default value is 0.\n            host_tracking (bool, optional):\n                Should DHCP host tracking be enabled?  The default is False.\n            vhosts (bool, optional):\n                Should virtual host logic be enabled for the scan?  The default\n                is ``False``.\n\n        Returns:\n            :obj:`str`:\n                An empty string response.\n\n        Examples:\n            >>> sc.scan_instances.reimport_scan(1)\n        '
    module_0.policy_settings(str_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    dict_0 = {}
    var_0 = module_0.url_validator(dict_0)
    dict_1 = {var_0: dict_0}
    var_1 = module_0.dict_merge(dict_1, dict_1)
    bool_0 = False
    module_0.dict_merge(bool_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    bool_0 = False
    bool_1 = False
    var_0 = module_0.url_validator(bool_1)
    dict_0 = {bool_0: bool_0, bool_0: var_0, bool_0: var_0}
    var_1 = module_0.dict_merge(dict_0, dict_0)
    list_0 = [var_1, var_1, var_1, var_1]
    dict_1 = {var_0: var_0, var_0: list_0}
    var_2 = module_0.policy_settings(dict_1)
    module_0.dict_merge(var_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_14():
    bool_0 = False
    none_type_0 = None
    var_0 = module_0.url_validator(bool_0)
    var_1 = module_0.url_validator(none_type_0)
    var_2 = module_0.url_validator(bool_0)
    str_0 = 't1Q%S\x0cbjS'
    dict_0 = {bool_0: bool_0, bool_0: str_0, bool_0: str_0}
    var_3 = module_0.dict_merge(dict_0, dict_0)
    var_4 = module_0.url_validator(var_3)
    assert var_4 is False
    bytes_0 = b'h'
    list_0 = []
    dict_1 = {var_1: bytes_0, bytes_0: list_0}
    var_5 = module_0.url_validator(var_1)
    var_6 = module_0.policy_settings(dict_1)
    module_0.policy_settings(str_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    str_0 = "\n        Creates a new access group\n\n        :\x0cevportal:`access-groups: create <access-groups-create>`\n\n        Args:\n            name (str):\n                The name of the access group to create.\n            rules (list):\n                a list of rule tuples.  Tuples are defined in the standardized\n                method of name, operator, value.  For example:\n\n                .. code-block:: python\n\n                    ('operating_system', 'eq', ['Windows NT'])\n\n                Rules will be validate against by the filters before being sent\n                to the API.  Note that the value field in this context is a list\n                of string values.\n            principals (list, optional):\n                A list of principal tuples.  Each tuple must contain both the\n                type and the identifier for the principal.  The identifier can\n                be either a UUID associated to a user/group, or the name of the\n                user/group.  For example:\n\n                .. code-block:: python\n\n                    ('user', '32a0c314-442b-4aed-bbf5-ba9cf5cafbf4')\n                    ('user', 'steve@company.tld')\n                    ('group', '32a0c314-442b-4aed-bbf5-ba9cf5cafbf4')\n\n            all_users (bool, optional):\n                If enabled, the access group will apply to all users and any\n                principals defined will be ignored.\n\n        Returns:\n            :obj:`dict`:\n                The resource record for the new access list.\n\n        Examples:\n            Allow all users to see 192.168.0.0/24:\n\n            >>> tio.access_groups.create('Example',\n            ...     [('ipv4', 'eq', ['192.168.0.0/24'])],\n            ...     all_users=True)\n\n            Allow everyone in a specific group id to see specific hosts:\n\n            >>> tio.access_groups.create('Example',\n           ~...     [('netbios_name', 'eq', ['dc1.company.tld']),\n            ...      ('netbios_name', 'eq', ['dc2.company.tld'])],\n            ...     principals=[\n            ...         ('group', '32a0c314-442b-4aed-bbf5-ba9cf5cafbf4')\n            ... ])\n        "
    module_0.policy_settings(str_0)