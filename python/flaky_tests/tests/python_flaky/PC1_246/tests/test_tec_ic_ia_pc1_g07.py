# Automatically generated by Pynguin.
import pytest
import tec.ic.ia.pc1.g07 as module_0
import builtins as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    bool_0 = False
    module_0.generar_muestra_pais(bool_0)

def test_case_1():
    bytes_0 = b'\xb5'
    var_0 = module_0.generar_muestra_pais(bytes_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_2():
    bytes_0 = b'\x16M\xcc\xe0\xfdX\x1a\x1b\x84'
    var_0 = module_0.generar_aleatorio_x_celdas(bytes_0, bytes_0, bytes_0, bytes_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_3():
    bytes_0 = b'\x16M\xcc\xe0\xfdX\x1a\x1b\x84'
    var_0 = module_0.generar_aleatorio_x_celdas(bytes_0, bytes_0, bytes_0, bytes_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_4():
    complex_0 = (706.334+1661.6j)
    var_0 = module_0.encontrar_datos_canton(complex_0, complex_0, complex_0, complex_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    assert module_0.semilla == 'no encontrado'

def test_case_5():
    bytes_0 = b'\xd9\xcd\x10\xbcH G\xd2kmJ\xce'
    var_0 = module_0.encontrar_votos_junta(bytes_0, bytes_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_6():
    str_0 = '<H$SgQPf|('
    var_0 = module_0.encontrar_votos_junta(str_0, str_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_7():
    int_0 = 1201
    var_0 = module_0.encontrar_votos_junta(int_0, int_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_8():
    bytes_0 = b'\xab'
    var_0 = module_0.obtener_indices_provincias(bytes_0, bytes_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    assert module_0.semilla == 'no encontrado'

def test_case_9():
    list_0 = []
    var_0 = module_0.obtener_indices_provincias(list_0, list_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_10():
    list_0 = []
    var_0 = module_0.generar_muestra_aux(list_0, list_0, list_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_11():
    list_0 = []
    var_0 = module_0.generar_muestra_aux(list_0, list_0, list_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_12():
    complex_0 = (706.334+1661.6j)
    var_0 = module_0.generar_muestra_aux(complex_0, complex_0, complex_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    assert module_0.semilla == 'no encontrado'

@pytest.mark.xfail(strict=True)
def test_case_13():
    none_type_0 = None
    var_0 = module_0.generar_muestra_aux(none_type_0, none_type_0, none_type_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    var_1 = module_0.generar_aleatorio_x_celdas(none_type_0, none_type_0, none_type_0, none_type_0)
    assert var_1 == 'no encontrado'
    dict_0 = {var_1: none_type_0, var_1: var_1}
    module_0.generar_muestra_aux(var_1, dict_0, none_type_0)

def test_case_14():
    str_0 = '<H$SgQPf|('
    var_0 = module_0.set_semilla(str_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_15():
    str_0 = '<H$SgQPf|('
    var_0 = module_0.generar_muestra_aux(str_0, str_0, str_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_16():
    bytes_0 = b'\x16M\xcc\xe0\xfdX\x1a\x1b\x84'
    var_0 = module_0.generar_aleatorio_x_celdas(bytes_0, bytes_0, bytes_0, bytes_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_17():
    bytes_0 = b'\x16M\xcc\xe0\xfdX\x1a\x1b\x84'
    var_0 = module_0.generar_muestra_pais(bytes_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    var_1 = module_0.generar_aleatorio_x_celdas(var_0, var_0, var_0, bytes_0)
    assert var_1 == 'no encontrado'

def test_case_18():
    str_0 = 'x'
    var_0 = module_0.encontrar_votos_junta(str_0, str_0)
    assert var_0 == 'x'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'

def test_case_19():
    dict_0 = {}
    var_0 = module_0.generar_aleatorio_x_celdas(dict_0, dict_0, dict_0, dict_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    var_1 = module_0.generar_muestra_aux(dict_0, var_0, var_0)
    var_2 = module_0.generar_muestra_pais(var_0)
    none_type_0 = None
    var_3 = module_0.generar_muestra_pais(var_2)
    int_0 = 1323
    var_4 = module_0.encontrar_votos_junta(var_1, var_1)
    assert var_4 == 'no encontrado'
    dict_1 = {none_type_0: var_0, var_4: var_4, none_type_0: int_0}
    var_5 = module_0.encontrar_votos_junta(var_1, var_0)
    assert var_5 == 'no encontrado'
    var_6 = module_0.generar_muestra_pais(dict_1)
    list_0 = [var_0, var_2, var_6, var_2]
    var_7 = module_0.encontrar_datos_canton(var_2, none_type_0, list_0, var_5)
    assert var_7 == 'no encontrado'

def test_case_20():
    bool_0 = False
    var_0 = module_0.encontrar_votos_junta(bool_0, bool_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    var_1 = module_0.set_semilla(var_0)
    assert module_0.semilla == 'no encontrado'
    var_2 = module_0.encontrar_votos_junta(bool_0, var_0)
    assert var_2 == 'no encontrado'
    var_3 = module_0.obtener_indices_provincias(var_0, bool_0)
    assert var_3 == 'no encontrado'
    var_4 = module_0.generar_aleatorio_x_celdas(bool_0, var_1, bool_0, var_2)
    assert var_4 == 'no encontrado'

@pytest.mark.xfail(strict=True)
def test_case_21():
    dict_0 = {}
    var_0 = module_0.generar_aleatorio_x_celdas(dict_0, dict_0, dict_0, dict_0)
    assert var_0 == 'no encontrado'
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    var_1 = module_0.generar_aleatorio_x_celdas(var_0, var_0, var_0, var_0)
    assert var_1 == 'no encontrado'
    var_2 = module_0.generar_muestra_aux(var_1, var_1, var_1)
    int_0 = 1323
    var_3 = module_0.encontrar_datos_canton(int_0, var_2, var_0, dict_0)
    assert var_3 == 'no encontrado'
    var_4 = module_0.generar_muestra_aux(var_2, var_3, var_3)
    object_0 = module_1.object()
    var_5 = module_0.encontrar_datos_canton(var_4, var_4, var_1, var_3)
    assert var_5 == 'no encontrado'
    dict_1 = {}
    var_6 = module_0.generar_muestra_aux(var_3, var_5, dict_1)
    var_7 = module_0.generar_muestra_pais(var_0)
    module_0.generar_muestra_pais(int_0)

def test_case_22():
    bool_0 = False
    var_0 = module_0.set_semilla(bool_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    str_0 = 'n/a'
    var_1 = module_0.generar_aleatorio_x_celdas(str_0, var_0, var_0, str_0)
    assert var_1 == 'no encontrado'

@pytest.mark.xfail(strict=True)
def test_case_23():
    dict_0 = {}
    str_0 = '\'?d"RIiI=$mj\'{y'
    var_0 = module_0.generar_muestra_aux(dict_0, str_0, str_0)
    assert module_0.Indicadores_x_Canton == 'Indicadores_x_Canton.csv'
    assert module_0.Juntas == 'Juntas.csv'
    assert module_0.VotosxPartidoxJunta == 'VotosxPartidoxJunta.csv'
    var_1 = module_0.set_semilla(var_0)
    var_2 = module_0.generar_muestra_aux(dict_0, dict_0, str_0)
    var_3 = module_0.generar_aleatorio_x_celdas(dict_0, var_2, var_0, var_2)
    assert var_3 == 'no encontrado'
    none_type_0 = None
    var_4 = module_0.generar_aleatorio_x_celdas(var_3, var_0, var_2, var_0)
    assert var_4 == 'no encontrado'
    var_5 = module_0.obtener_indices_provincias(dict_0, var_2)
    var_6 = module_0.generar_aleatorio_x_celdas(none_type_0, var_0, var_2, var_5)
    assert var_6 == 'no encontrado'
    var_7 = module_0.generar_aleatorio_x_celdas(var_6, var_2, var_0, var_3)
    assert var_7 == 'no encontrado'
    int_0 = 1323
    var_8 = module_0.encontrar_votos_junta(var_2, var_0)
    assert var_8 == 'no encontrado'
    var_9 = module_0.encontrar_votos_junta(var_7, var_6)
    assert var_9 == 'no encontrado'
    var_10 = module_0.generar_aleatorio_x_celdas(var_6, var_9, none_type_0, int_0)
    assert var_10 == 'no encontrado'
    var_11 = module_0.encontrar_datos_canton(var_4, none_type_0, var_3, var_7)
    assert var_11 == 'no encontrado'
    var_12 = module_0.encontrar_datos_canton(var_3, var_0, var_3, none_type_0)
    assert var_12 == 'no encontrado'
    dict_1 = {var_7: none_type_0}
    var_13 = module_0.encontrar_datos_canton(dict_1, var_3, int_0, int_0)
    assert var_13 == 'no encontrado'
    int_1 = 1475
    var_14 = module_0.generar_aleatorio_x_celdas(int_1, var_5, int_1, dict_0)
    assert var_14 == 'no encontrado'
    list_0 = [var_11, var_4, dict_1, var_6]
    var_15 = module_0.set_semilla(var_7)
    assert module_0.semilla == 'no encontrado'
    var_16 = module_0.encontrar_datos_canton(var_0, var_0, list_0, var_10)
    assert var_16 == 'no encontrado'
    bool_0 = False
    var_17 = module_0.set_semilla(bool_0)
    var_18 = module_0.generar_muestra_pais(var_3)
    str_1 = 'n/a'
    bool_1 = False
    var_19 = module_0.generar_aleatorio_x_celdas(str_1, var_1, bool_1, str_1)
    assert var_19 == 'no encontrado'
    var_20 = module_0.generar_muestra_aux(var_1, str_0, var_11)
    var_21 = module_0.generar_muestra_aux(var_15, str_0, var_0)
    var_22 = module_0.generar_muestra_aux(var_14, var_7, var_6)
    module_0.generar_muestra_provincia(int_0, var_14)