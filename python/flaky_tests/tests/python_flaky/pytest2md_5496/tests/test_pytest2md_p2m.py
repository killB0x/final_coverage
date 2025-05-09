# Automatically generated by Pynguin.
import pytest
import pytest2md.p2m as module_0
import uuid as module_1
import platform as module_2
import collections as module_3

def test_case_0():
    var_0 = module_0.details()
    assert var_0 == '\n<details><summary>details</summary>\n\nNone\n</details>\n'
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'

def test_case_1():
    str_0 = 'GEn9g$<wH|6BM}6'
    p2_m_0 = module_0.P2M(str_0, fn_target_md=str_0, md_sep=str_0)
    assert f'{type(p2_m_0).__module__}.{type(p2_m_0).__qualname__}' == 'pytest2md.p2m.P2M'
    assert p2_m_0.ctx == {'fn_test_file': '/pynguin/GEn9g$<wH|6BM}6', 'md_sep': 'GEn9g$<wH|6BM}6', 'd_test': '/pynguin', 'd_repo_base': '/pynguin', 'fn_target_md': '/pynguin/GEn9g$<wH|6BM}6', 'fn_target_md_tmpl': '/pynguin/GEn9g$<wH|6BM}6', 'name': 'GEn9g$<wH|6BM}6', 'd_assets': '/pynguin/assets', 'md': [], 'cmd_log': [], 'env_exports': {}}
    assert p2_m_0.src_link_templates == {'github': 'https://github.com/%(gh_repo_name)s/blob/%(git_rev)s/%(path)s%(line:#L%s)s', 'github_raw': 'https://raw.githubusercontent.com/%(gh_repo_name)s/%(git_rev)s/%(path)s%(line:#L%s)s', 'static': 'file://%(d_repo_base)s/%(path)s', 'static_raw': 'file://%(d_repo_base)s/%(path)s'}
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'

@pytest.mark.xfail(strict=True)
def test_case_2():
    float_0 = 884.0
    list_0 = []
    module_0.md(list_0, float_0, float_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    str_0 = 'GEn9g<wH|BiM}6'
    module_0.sh_file(str_0, summary=str_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    var_0 = module_1.SafeUUID.unknown
    module_0.bash_run(var_0, summary=var_0, pdb=var_0, expect=var_0)

def test_case_5():
    str_0 = ')ze0@h:'
    with pytest.raises(AttributeError):
        module_0.run_pyrun_funcs(str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    none_type_0 = None
    var_0 = module_0.as_json(none_type_0)
    assert var_0 == 'MARKDOWN:\n```javascript\nnull\n```'
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    module_0.bash_run(none_type_0, none_type_0, into_file=none_type_0, md_insert=none_type_0, pdb=none_type_0, retry_secs=none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    none_type_0 = None
    module_0.export(none_type_0, none_type_0, none_type_0)

def test_case_8():
    printed_0 = module_0.Printed()
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'

@pytest.mark.xfail(strict=True)
def test_case_9():
    printed_0 = module_0.Printed()
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    list_0 = [printed_0, printed_0]
    var_0 = printed_0.write(*list_0)
    util_0 = module_0.util()
    util_0.wait_for_port(util_0, util_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    int_0 = 4017
    module_0.dflt_target_md(int_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    none_type_0 = None
    module_0.inl_ansi_html(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    var_0 = module_0.details()
    assert var_0 == '\n<details><summary>details</summary>\n\nNone\n</details>\n'
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    module_0.sh_code(var_0, var_0)

def test_case_13():
    var_0 = module_2.version()
    p2_m_0 = module_0.P2M(var_0, var_0, var_0, fn_target_md_tmpl=var_0, frontmatter=var_0)
    assert f'{type(p2_m_0).__module__}.{type(p2_m_0).__qualname__}' == 'pytest2md.p2m.P2M'
    assert p2_m_0.ctx == {'fn_test_file': '/pynguin/#1 SMP Debian 5.10.140-1 (2022-09-02)', 'md_sep': '<!-- autogen tutorial -->', 'd_test': '/pynguin', 'd_repo_base': '/pynguin', 'frontmatter': '#1 SMP Debian 5.10.140-1 (2022-09-02)', 'fn_target_md': '/pynguin/#1 SMP Debian 5.10.140-1 (2022-09-02)', 'fn_target_md_tmpl': '#1 SMP Debian 5.10.140-1 (2022-09-02)', 'name': '#1 SMP Debian 5.10.140-1 (2022-09-02)', 'd_assets': '#1 SMP Debian 5.10.140-1 (2022-09-02)', 'md': [], 'cmd_log': [], 'env_exports': {}}
    assert p2_m_0.src_link_templates == {'github': 'https://github.com/%(gh_repo_name)s/blob/%(git_rev)s/%(path)s%(line:#L%s)s', 'github_raw': 'https://raw.githubusercontent.com/%(gh_repo_name)s/%(git_rev)s/%(path)s%(line:#L%s)s', 'static': 'file://%(d_repo_base)s/%(path)s', 'static_raw': 'file://%(d_repo_base)s/%(path)s'}
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'

@pytest.mark.xfail(strict=True)
def test_case_14():
    module_0.write_markdown()

def test_case_15():
    str_0 = '!V:SM(E>F;!b]XPxG,'
    p2_m_0 = module_0.P2M(str_0, md_sep=str_0)
    assert f'{type(p2_m_0).__module__}.{type(p2_m_0).__qualname__}' == 'pytest2md.p2m.P2M'
    assert p2_m_0.ctx == {'fn_test_file': '/pynguin/!V:SM(E>F;!b]XPxG,', 'md_sep': '!V:SM(E>F;!b]XPxG,', 'd_test': '/pynguin', 'd_repo_base': '/pynguin', 'fn_target_md': '/README.md', 'fn_target_md_tmpl': '/README.md', 'name': '!V:SM(E>F;!b]XPxG,', 'd_assets': '/pynguin/assets', 'md': [], 'cmd_log': [], 'env_exports': {}}
    assert p2_m_0.src_link_templates == {'github': 'https://github.com/%(gh_repo_name)s/blob/%(git_rev)s/%(path)s%(line:#L%s)s', 'github_raw': 'https://raw.githubusercontent.com/%(gh_repo_name)s/%(git_rev)s/%(path)s%(line:#L%s)s', 'static': 'file://%(d_repo_base)s/%(path)s', 'static_raw': 'file://%(d_repo_base)s/%(path)s'}
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    ordered_dict_keys_view_0 = module_3._OrderedDictKeysView(p2_m_0)
    var_0 = module_2.python_branch()
    var_1 = module_0.sh_file(str_0, summary=str_0, md_insert=var_0)
    var_2 = module_0.run_pyrun_funcs(var_0, var_0, ordered_dict_keys_view_0)
    with pytest.raises(AttributeError):
        module_0.run_pyrun_funcs(var_1, p2_m_0, ordered_dict_keys_view_0)

def test_case_16():
    util_0 = module_0.util()
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    var_0 = module_0.convert_to_staticmethods(util_0)

@pytest.mark.xfail(strict=True)
def test_case_17():
    str_0 = 'ce'
    module_0.bash_run(str_0, md_insert=str_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    util_0 = module_0.util()
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    util_0.wait_for_port(util_0, util_0)

@pytest.mark.xfail(strict=True)
def test_case_19():
    str_0 = 'GEn9g$<w4|6BM}6'
    p2_m_0 = module_0.P2M(str_0, fn_target_md=str_0, md_sep=str_0)
    assert f'{type(p2_m_0).__module__}.{type(p2_m_0).__qualname__}' == 'pytest2md.p2m.P2M'
    assert p2_m_0.ctx == {'fn_test_file': '/pynguin/GEn9g$<w4|6BM}6', 'md_sep': 'GEn9g$<w4|6BM}6', 'd_test': '/pynguin', 'd_repo_base': '/pynguin', 'fn_target_md': '/pynguin/GEn9g$<w4|6BM}6', 'fn_target_md_tmpl': '/pynguin/GEn9g$<w4|6BM}6', 'name': 'GEn9g$<w4|6BM}6', 'd_assets': '/pynguin/assets', 'md': [], 'cmd_log': [], 'env_exports': {}}
    assert p2_m_0.src_link_templates == {'github': 'https://github.com/%(gh_repo_name)s/blob/%(git_rev)s/%(path)s%(line:#L%s)s', 'github_raw': 'https://raw.githubusercontent.com/%(gh_repo_name)s/%(git_rev)s/%(path)s%(line:#L%s)s', 'static': 'file://%(d_repo_base)s/%(path)s', 'static_raw': 'file://%(d_repo_base)s/%(path)s'}
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    var_0 = p2_m_0.d_test()
    assert var_0 == '/pynguin'
    var_0.dispatch_call(var_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_20():
    str_0 = '^Ml.vm'
    module_0.export_add(str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    str_0 = '"""'
    module_0.sh_file(str_0, str_0, str_0, str_0)

def test_case_22():
    var_0 = module_0.details()
    assert var_0 == '\n<details><summary>details</summary>\n\nNone\n</details>\n'
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    with pytest.raises(Exception):
        module_0.sh_file(var_0, summary=var_0, as_link=var_0, md_insert=var_0)

@pytest.mark.xfail(strict=True)
def test_case_23():
    str_0 = 'GEn9g<wH|BiM}6'
    module_0.sh_file(str_0, content=str_0)

@pytest.mark.xfail(strict=True)
def test_case_24():
    str_0 = 'GEn9g$<wH|6BM}6'
    module_0.sh_file(str_0, summary=str_0, as_link=str_0)

def test_case_25():
    str_0 = '!V:SM(E>F;!b]XPxG,'
    var_0 = module_0.html_table(str_0, str_0)
    assert var_0 == 'MARKDOWN:\n<table>\n<tr><td>!</td><td>V</td><td>:</td><td>S</td><td>M</td><td>(</td><td>E</td><td>></td><td>F</td><td>;</td><td>!</td><td>b</td><td>]</td><td>X</td><td>P</td><td>x</td><td>G</td><td>,</td></tr>\n<tr><td>!</td></tr>\n<tr><td>V</td></tr>\n<tr><td>:</td></tr>\n<tr><td>S</td></tr>\n<tr><td>M</td></tr>\n<tr><td>(</td></tr>\n<tr><td>E</td></tr>\n<tr><td>></td></tr>\n<tr><td>F</td></tr>\n<tr><td>;</td></tr>\n<tr><td>!</td></tr>\n<tr><td>b</td></tr>\n<tr><td>]</td></tr>\n<tr><td>X</td></tr>\n<tr><td>P</td></tr>\n<tr><td>x</td></tr>\n<tr><td>G</td></tr>\n<tr><td>,</td></tr>\n</table>'
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    var_1 = module_0.as_json(var_0)
    assert var_1 == 'MARKDOWN:\n```javascript\nMARKDOWN:\n<table>\n<tr><td>!</td><td>V</td><td>:</td><td>S</td><td>M</td><td>(</td><td>E</td><td>></td><td>F</td><td>;</td><td>!</td><td>b</td><td>]</td><td>X</td><td>P</td><td>x</td><td>G</td><td>,</td></tr>\n<tr><td>!</td></tr>\n<tr><td>V</td></tr>\n<tr><td>:</td></tr>\n<tr><td>S</td></tr>\n<tr><td>M</td></tr>\n<tr><td>(</td></tr>\n<tr><td>E</td></tr>\n<tr><td>></td></tr>\n<tr><td>F</td></tr>\n<tr><td>;</td></tr>\n<tr><td>!</td></tr>\n<tr><td>b</td></tr>\n<tr><td>]</td></tr>\n<tr><td>X</td></tr>\n<tr><td>P</td></tr>\n<tr><td>x</td></tr>\n<tr><td>G</td></tr>\n<tr><td>,</td></tr>\n</table>\n```'
    with pytest.raises(AttributeError):
        module_0.run_pyrun_funcs(var_1, var_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    util_0 = module_0.util()
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    none_type_0 = None
    util_0.wait_for_port(none_type_0, timeout=util_0)

@pytest.mark.xfail(strict=True)
def test_case_27():
    int_0 = 233
    module_0.convert_to_staticmethods(int_0)

@pytest.mark.xfail(strict=True)
def test_case_28():
    str_0 = 'GE=Kn9$<wH|6BMS6'
    module_0.md(str_0, str_0, test_func_frame=str_0)

@pytest.mark.xfail(strict=True)
def test_case_29():
    str_0 = 'eQTvEA;!JP\n_Vzg,p'
    var_0 = module_0.html_table(str_0, str_0, str_0)
    assert var_0 == 'MARKDOWN:\n\n<details><summary>eQTvEA;!JP\n_Vzg,p</summary>\n\n<table>\n<tr><td>e</td><td>Q</td><td>T</td><td>v</td><td>E</td><td>A</td><td>;</td><td>!</td><td>J</td><td>P</td><td>\n</td><td>_</td><td>V</td><td>z</td><td>g</td><td>,</td><td>p</td></tr>\n<tr><td>e</td></tr>\n<tr><td>Q</td></tr>\n<tr><td>T</td></tr>\n<tr><td>v</td></tr>\n<tr><td>E</td></tr>\n<tr><td>A</td></tr>\n<tr><td>;</td></tr>\n<tr><td>!</td></tr>\n<tr><td>J</td></tr>\n<tr><td>P</td></tr>\n<tr><td>\n</td></tr>\n<tr><td>_</td></tr>\n<tr><td>V</td></tr>\n<tr><td>z</td></tr>\n<tr><td>g</td></tr>\n<tr><td>,</td></tr>\n<tr><td>p</td></tr>\n</table>\n</details>\n'
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    module_0.write_markdown(str_0)

@pytest.mark.xfail(strict=True)
def test_case_30():
    printed_0 = module_0.Printed()
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    var_0 = printed_0.write()
    var_1 = module_2.node()
    module_0.export_add(var_1, var_0, var_1, printed_0)

def test_case_31():
    str_0 = 'GEn9g<wH|BiM}6'
    p2_m_0 = module_0.P2M(str_0)
    assert f'{type(p2_m_0).__module__}.{type(p2_m_0).__qualname__}' == 'pytest2md.p2m.P2M'
    assert p2_m_0.ctx == {'fn_test_file': '/pynguin/GEn9g<wH|BiM}6', 'md_sep': '<!-- autogen tutorial -->', 'd_test': '/pynguin', 'd_repo_base': '/pynguin', 'fn_target_md': '/README.md', 'fn_target_md_tmpl': '/README.md', 'name': 'GEn9g<wH|BiM}6', 'd_assets': '/pynguin/assets', 'md': [], 'cmd_log': [], 'env_exports': {}}
    assert p2_m_0.src_link_templates == {'github': 'https://github.com/%(gh_repo_name)s/blob/%(git_rev)s/%(path)s%(line:#L%s)s', 'github_raw': 'https://raw.githubusercontent.com/%(gh_repo_name)s/%(git_rev)s/%(path)s%(line:#L%s)s', 'static': 'file://%(d_repo_base)s/%(path)s', 'static_raw': 'file://%(d_repo_base)s/%(path)s'}
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'

@pytest.mark.xfail(strict=True)
def test_case_32():
    str_0 = 'eQTvEA;!JP\n_Vg,p'
    module_0.bash_run(str_0, str_0, str_0, summary=str_0, md_insert=str_0, retry_secs=str_0)

@pytest.mark.xfail(strict=True)
def test_case_33():
    str_0 = '!V:SM(E>F;!b]XPxG,'
    var_0 = module_0.html_table(str_0, str_0)
    assert var_0 == 'MARKDOWN:\n<table>\n<tr><td>!</td><td>V</td><td>:</td><td>S</td><td>M</td><td>(</td><td>E</td><td>></td><td>F</td><td>;</td><td>!</td><td>b</td><td>]</td><td>X</td><td>P</td><td>x</td><td>G</td><td>,</td></tr>\n<tr><td>!</td></tr>\n<tr><td>V</td></tr>\n<tr><td>:</td></tr>\n<tr><td>S</td></tr>\n<tr><td>M</td></tr>\n<tr><td>(</td></tr>\n<tr><td>E</td></tr>\n<tr><td>></td></tr>\n<tr><td>F</td></tr>\n<tr><td>;</td></tr>\n<tr><td>!</td></tr>\n<tr><td>b</td></tr>\n<tr><td>]</td></tr>\n<tr><td>X</td></tr>\n<tr><td>P</td></tr>\n<tr><td>x</td></tr>\n<tr><td>G</td></tr>\n<tr><td>,</td></tr>\n</table>'
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    module_0.bash_run(var_0, str_0, pdb=var_0, expect=var_0)

@pytest.mark.xfail(strict=True)
def test_case_34():
    str_0 = 'GEn9g$<wH|6BM}6'
    module_0.md(str_0, str_0, test_func_frame=str_0, summary=str_0, no_sh_func_output=str_0)

@pytest.mark.xfail(strict=True)
def test_case_35():
    list_0 = []
    module_0.bash_run(list_0, ign_err=list_0, retry_secs=list_0, ctx=list_0)

@pytest.mark.xfail(strict=True)
def test_case_36():
    str_0 = "\ty/H^Wu#1\n=g'Ij.q0{?"
    p2_m_0 = module_0.P2M(str_0, str_0, fn_target_md_tmpl=str_0)
    assert f'{type(p2_m_0).__module__}.{type(p2_m_0).__qualname__}' == 'pytest2md.p2m.P2M'
    assert p2_m_0.ctx == {'fn_test_file': "/pynguin/\ty/H^Wu#1\n=g'Ij.q0{?", 'md_sep': '<!-- autogen tutorial -->', 'd_test': '/pynguin/\ty', 'd_repo_base': '/pynguin/\ty', 'fn_target_md': '/pynguin/README.md', 'fn_target_md_tmpl': "\ty/H^Wu#1\n=g'Ij.q0{?", 'name': "H^Wu#1\n=g'Ij.q0{?", 'd_assets': "\ty/H^Wu#1\n=g'Ij.q0{?", 'md': [], 'cmd_log': [], 'env_exports': {}}
    assert p2_m_0.src_link_templates == {'github': 'https://github.com/%(gh_repo_name)s/blob/%(git_rev)s/%(path)s%(line:#L%s)s', 'github_raw': 'https://raw.githubusercontent.com/%(gh_repo_name)s/%(git_rev)s/%(path)s%(line:#L%s)s', 'static': 'file://%(d_repo_base)s/%(path)s', 'static_raw': 'file://%(d_repo_base)s/%(path)s'}
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    var_0 = module_0.deindent(str_0)
    assert var_0 == "y/H^Wu#1\n=g'Ij.q0{?"
    module_0.sh_file(str_0, str_0, str_0)

def test_case_37():
    str_0 = 'GEn9g$<wH|6BM}6'
    p2_m_0 = module_0.P2M(str_0, fn_target_md=str_0, md_sep=str_0)
    assert f'{type(p2_m_0).__module__}.{type(p2_m_0).__qualname__}' == 'pytest2md.p2m.P2M'
    assert p2_m_0.ctx == {'fn_test_file': '/pynguin/GEn9g$<wH|6BM}6', 'md_sep': 'GEn9g$<wH|6BM}6', 'd_test': '/pynguin', 'd_repo_base': '/pynguin', 'fn_target_md': '/pynguin/GEn9g$<wH|6BM}6', 'fn_target_md_tmpl': '/pynguin/GEn9g$<wH|6BM}6', 'name': 'GEn9g$<wH|6BM}6', 'd_assets': '/pynguin/assets', 'md': [], 'cmd_log': [], 'env_exports': {}}
    assert p2_m_0.src_link_templates == {'github': 'https://github.com/%(gh_repo_name)s/blob/%(git_rev)s/%(path)s%(line:#L%s)s', 'github_raw': 'https://raw.githubusercontent.com/%(gh_repo_name)s/%(git_rev)s/%(path)s%(line:#L%s)s', 'static': 'file://%(d_repo_base)s/%(path)s', 'static_raw': 'file://%(d_repo_base)s/%(path)s'}
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'

@pytest.mark.xfail(strict=True)
def test_case_38():
    str_0 = '!V:SM(E>F;!b]XPxG,'
    module_0.sh_file(str_0, str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_39():
    str_0 = '!V:SM(E>F;!b]XPxG,'
    var_0 = module_0.html_table(str_0, str_0)
    assert var_0 == 'MARKDOWN:\n<table>\n<tr><td>!</td><td>V</td><td>:</td><td>S</td><td>M</td><td>(</td><td>E</td><td>></td><td>F</td><td>;</td><td>!</td><td>b</td><td>]</td><td>X</td><td>P</td><td>x</td><td>G</td><td>,</td></tr>\n<tr><td>!</td></tr>\n<tr><td>V</td></tr>\n<tr><td>:</td></tr>\n<tr><td>S</td></tr>\n<tr><td>M</td></tr>\n<tr><td>(</td></tr>\n<tr><td>E</td></tr>\n<tr><td>></td></tr>\n<tr><td>F</td></tr>\n<tr><td>;</td></tr>\n<tr><td>!</td></tr>\n<tr><td>b</td></tr>\n<tr><td>]</td></tr>\n<tr><td>X</td></tr>\n<tr><td>P</td></tr>\n<tr><td>x</td></tr>\n<tr><td>G</td></tr>\n<tr><td>,</td></tr>\n</table>'
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    module_0.sh_file(var_0, var_0)

def test_case_40():
    str_0 = 'GEn9g$<wH|6BM}6'
    none_type_0 = None
    module_0.sh_file(str_0, as_link=none_type_0, md_insert=none_type_0)
    assert var_0 == '\n```python\n$ cat "GEn9g$<wH|6BM}6"\n\n```python\n$ cat "GEn9g$<wH|6BM}6"\nGEn9g$<wH|6BM}6\n```\n```'
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'

@pytest.mark.xfail(strict=True)
def test_case_41():
    str_0 = '!V:SM(E>F;!b]XPxG,'
    p2_m_0 = module_0.P2M(str_0, fn_target_md_tmpl=str_0)
    assert f'{type(p2_m_0).__module__}.{type(p2_m_0).__qualname__}' == 'pytest2md.p2m.P2M'
    assert p2_m_0.ctx == {'fn_test_file': '/pynguin/!V:SM(E>F;!b]XPxG,', 'md_sep': '<!-- autogen tutorial -->', 'd_test': '/pynguin', 'd_repo_base': '/pynguin', 'fn_target_md': '/README.md', 'fn_target_md_tmpl': '!V:SM(E>F;!b]XPxG,', 'name': '!V:SM(E>F;!b]XPxG,', 'd_assets': '/pynguin/assets', 'md': [], 'cmd_log': [], 'env_exports': {}}
    assert p2_m_0.src_link_templates == {'github': 'https://github.com/%(gh_repo_name)s/blob/%(git_rev)s/%(path)s%(line:#L%s)s', 'github_raw': 'https://raw.githubusercontent.com/%(gh_repo_name)s/%(git_rev)s/%(path)s%(line:#L%s)s', 'static': 'file://%(d_repo_base)s/%(path)s', 'static_raw': 'file://%(d_repo_base)s/%(path)s'}
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    module_0.sh_file(str_0, content=p2_m_0, summary=p2_m_0, as_link=str_0, ctx=p2_m_0)

@pytest.mark.xfail(strict=True)
def test_case_42():
    list_0 = []
    var_0 = module_0.rpl(list_0)
    assert module_0.Ansi2HTMLConverter is None
    assert module_0.PY2 is False
    assert module_0.dflt_md_sep == '<!-- autogen tutorial -->'
    assert module_0.code == '\n```code\n%s\n```'
    list_1 = [list_0, list_0, list_0]
    module_0.rpl(list_0, *list_1)