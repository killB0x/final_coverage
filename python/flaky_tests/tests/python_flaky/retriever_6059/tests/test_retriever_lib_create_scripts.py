# Automatically generated by Pynguin.
import pytest
import retriever.lib.create_scripts as module_0
import locale as module_1
import re as module_2
import retriever.lib.tools as module_3

def test_case_0():
    vector_pk_0 = module_0.VectorPk()
    assert vector_pk_0.name == 'fill'
    assert vector_pk_0.title == 'fill'
    assert vector_pk_0.description == 'fill'
    assert vector_pk_0.citation == 'fill'
    assert vector_pk_0.archived == 'fill or remove this field if not archived'
    assert vector_pk_0.homepage == 'fill'
    assert vector_pk_0.version == '1.0.0'
    assert vector_pk_0.retriever == 'True'
    assert vector_pk_0.retriever_minimum_version == '2.1.0'
    assert vector_pk_0.driver_name == 'ESRI Shapefile'
    assert vector_pk_0.spatial_ref == 'spatial_ref'
    assert vector_pk_0.extent == ''
    assert vector_pk_0.geom_type == ''
    assert module_0.VectorPk.pk_formats == ['.shp', 'shp']

def test_case_1():
    str_0 = 'LEz%V\tBYJ M]8-@w@@&5'
    dict_0 = {str_0: str_0, str_0: str_0}
    vector_pk_0 = module_0.VectorPk(**dict_0)
    assert vector_pk_0.name == 'fill'
    assert vector_pk_0.title == 'fill'
    assert vector_pk_0.description == 'fill'
    assert vector_pk_0.citation == 'fill'
    assert vector_pk_0.archived == 'fill or remove this field if not archived'
    assert vector_pk_0.homepage == 'fill'
    assert vector_pk_0.version == '1.0.0'
    assert vector_pk_0.retriever == 'True'
    assert vector_pk_0.retriever_minimum_version == '2.1.0'
    assert vector_pk_0.driver_name == 'ESRI Shapefile'
    assert vector_pk_0.spatial_ref == 'spatial_ref'
    assert vector_pk_0.extent == ''
    assert vector_pk_0.geom_type == ''
    assert module_0.VectorPk.pk_formats == ['.shp', 'shp']

@pytest.mark.xfail(strict=True)
def test_case_2():
    dict_0 = {}
    none_type_0 = None
    tabular_pk_0 = module_0.TabularPk(none_type_0, retriever=none_type_0, **dict_0)
    assert tabular_pk_0.title == 'fill'
    assert tabular_pk_0.description == 'fill'
    assert tabular_pk_0.citation == 'fill'
    assert tabular_pk_0.archived == 'fill or remove this field if not archived'
    assert tabular_pk_0.homepage == 'fill'
    assert tabular_pk_0.version == '1.0.0'
    assert tabular_pk_0.retriever_minimum_version == '2.1.0'
    vector_pk_0 = module_0.VectorPk(**dict_0)
    assert vector_pk_0.name == 'fill'
    assert vector_pk_0.title == 'fill'
    assert vector_pk_0.description == 'fill'
    assert vector_pk_0.citation == 'fill'
    assert vector_pk_0.archived == 'fill or remove this field if not archived'
    assert vector_pk_0.homepage == 'fill'
    assert vector_pk_0.version == '1.0.0'
    assert vector_pk_0.retriever == 'True'
    assert vector_pk_0.retriever_minimum_version == '2.1.0'
    assert vector_pk_0.driver_name == 'ESRI Shapefile'
    assert vector_pk_0.spatial_ref == 'spatial_ref'
    assert vector_pk_0.extent == ''
    assert vector_pk_0.geom_type == ''
    assert module_0.VectorPk.pk_formats == ['.shp', 'shp']
    str_0 = 'commit a dataset'
    var_0 = module_0.create_script_dict(tabular_pk_0, none_type_0, str_0, dict_0, vector_pk_0)
    str_1 = ';A?2}p :'
    module_0.create_vector_datapackage(var_0, str_1, var_0, dict_0)
    error_0 = module_1.Error(**dict_0)
    var_1 = module_0.clean_table_name(str_0)
    var_2 = module_0.create_vector_datapackage(error_0, str_0, var_1, var_1)
    dict_1 = {str_0: str_0, str_0: str_0, str_0: str_0, str_0: var_0}
    var_3 = var_1.isidentifier()
    var_5 = module_0.process_singles(dict_1, var_1, var_4, error_0, str_0)
    var_6 = var_0.clear()

@pytest.mark.xfail(strict=True)
def test_case_3():
    vector_pk_0 = module_0.VectorPk()
    assert vector_pk_0.name == 'fill'
    assert vector_pk_0.title == 'fill'
    assert vector_pk_0.description == 'fill'
    assert vector_pk_0.citation == 'fill'
    assert vector_pk_0.archived == 'fill or remove this field if not archived'
    assert vector_pk_0.homepage == 'fill'
    assert vector_pk_0.version == '1.0.0'
    assert vector_pk_0.retriever == 'True'
    assert vector_pk_0.retriever_minimum_version == '2.1.0'
    assert vector_pk_0.driver_name == 'ESRI Shapefile'
    assert vector_pk_0.spatial_ref == 'spatial_ref'
    assert vector_pk_0.extent == ''
    assert vector_pk_0.geom_type == ''
    assert module_0.VectorPk.pk_formats == ['.shp', 'shp']
    vector_pk_0.get_source(vector_pk_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    vector_pk_0 = module_0.VectorPk()
    assert vector_pk_0.name == 'fill'
    assert vector_pk_0.title == 'fill'
    assert vector_pk_0.description == 'fill'
    assert vector_pk_0.citation == 'fill'
    assert vector_pk_0.archived == 'fill or remove this field if not archived'
    assert vector_pk_0.homepage == 'fill'
    assert vector_pk_0.version == '1.0.0'
    assert vector_pk_0.retriever == 'True'
    assert vector_pk_0.retriever_minimum_version == '2.1.0'
    assert vector_pk_0.driver_name == 'ESRI Shapefile'
    assert vector_pk_0.spatial_ref == 'spatial_ref'
    assert vector_pk_0.extent == ''
    assert vector_pk_0.geom_type == ''
    assert module_0.VectorPk.pk_formats == ['.shp', 'shp']
    dict_0 = {}
    raster_pk_0 = module_0.RasterPk(**dict_0)
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    none_type_0 = None
    vector_pk_0.get_resources(none_type_0, none_type_0)

def test_case_5():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']

@pytest.mark.xfail(strict=True)
def test_case_6():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    raster_pk_0.get_source(raster_pk_0)

def test_case_7():
    str_0 = 'raster'
    var_0 = module_0.create_package(str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    set_0 = set()
    module_0.create_raster_datapackage(set_0, set_0, set_0, set_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    str_0 = 'raster'
    none_type_0 = None
    var_0 = module_0.process_dirs(str_0, str_0, str_0, none_type_0, str_0)
    raster_pk_0.create_raster_resources(str_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    raster_pk_0.set_global(raster_pk_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    str_0 = 'H0J7N8$'
    raster_pk_0.get_resources(str_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    bool_0 = False
    none_type_0 = None
    module_0.create_vector_datapackage(bool_0, none_type_0, none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = 'raCtLr'
    var_0 = module_0.clean_table_name(str_0)
    assert var_0 == 'raCtLr'
    var_1 = module_0.create_package(str_0, str_0, str_0)
    var_2 = module_1.Error()
    var_0.create_vector_resources(str_0, var_1)

@pytest.mark.xfail(strict=True)
def test_case_14():
    str_0 = 'pm%sE\\4)Ak'
    module_0.process_singles(str_0, str_0, str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    str_0 = 'raster'
    var_0 = module_0.create_package(str_0, str_0, str_0)
    module_0.create_tabular_datapackage(raster_pk_0, var_0, str_0, raster_pk_0, str_0, var_0)

def test_case_16():
    str_0 = '~wE@K,drU+'
    dict_0 = {str_0: str_0, str_0: str_0}
    raster_pk_0 = module_0.RasterPk(**dict_0)
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']

@pytest.mark.xfail(strict=True)
def test_case_17():
    str_0 = 'G9\x0ct'
    none_type_0 = None
    var_0 = module_0.create_package(str_0, str_0, str_0, none_type_0)
    var_1 = module_0.process_dirs(str_0, str_0, var_0, var_0, str_0)
    module_0.get_directory(var_0)

def test_case_18():
    str_0 = '*tdvk(|JG96vX'
    var_0 = module_0.get_directory(str_0)
    assert var_0 == '/pynguin/*tdvk(|JG96vX'

@pytest.mark.xfail(strict=True)
def test_case_19():
    str_0 = '*tdvk(|JG96vX'
    vector_pk_0 = module_0.VectorPk()
    assert vector_pk_0.name == 'fill'
    assert vector_pk_0.title == 'fill'
    assert vector_pk_0.description == 'fill'
    assert vector_pk_0.citation == 'fill'
    assert vector_pk_0.archived == 'fill or remove this field if not archived'
    assert vector_pk_0.homepage == 'fill'
    assert vector_pk_0.version == '1.0.0'
    assert vector_pk_0.retriever == 'True'
    assert vector_pk_0.retriever_minimum_version == '2.1.0'
    assert vector_pk_0.driver_name == 'ESRI Shapefile'
    assert vector_pk_0.spatial_ref == 'spatial_ref'
    assert vector_pk_0.extent == ''
    assert vector_pk_0.geom_type == ''
    assert module_0.VectorPk.pk_formats == ['.shp', 'shp']
    vector_pk_0.create_vector_resources(str_0, str_0)

def test_case_20():
    str_0 = 'raster'
    var_0 = module_0.write_out_scripts(str_0, str_0, str_0)
    vector_pk_0 = module_0.VectorPk()
    assert vector_pk_0.name == 'fill'
    assert vector_pk_0.title == 'fill'
    assert vector_pk_0.description == 'fill'
    assert vector_pk_0.citation == 'fill'
    assert vector_pk_0.archived == 'fill or remove this field if not archived'
    assert vector_pk_0.homepage == 'fill'
    assert vector_pk_0.version == '1.0.0'
    assert vector_pk_0.retriever == 'True'
    assert vector_pk_0.retriever_minimum_version == '2.1.0'
    assert vector_pk_0.driver_name == 'ESRI Shapefile'
    assert vector_pk_0.spatial_ref == 'spatial_ref'
    assert vector_pk_0.extent == ''
    assert vector_pk_0.geom_type == ''
    assert module_0.VectorPk.pk_formats == ['.shp', 'shp']

@pytest.mark.xfail(strict=True)
def test_case_21():
    dict_0 = {}
    vector_pk_0 = module_0.VectorPk(**dict_0)
    assert vector_pk_0.name == 'fill'
    assert vector_pk_0.title == 'fill'
    assert vector_pk_0.description == 'fill'
    assert vector_pk_0.citation == 'fill'
    assert vector_pk_0.archived == 'fill or remove this field if not archived'
    assert vector_pk_0.homepage == 'fill'
    assert vector_pk_0.version == '1.0.0'
    assert vector_pk_0.retriever == 'True'
    assert vector_pk_0.retriever_minimum_version == '2.1.0'
    assert vector_pk_0.driver_name == 'ESRI Shapefile'
    assert vector_pk_0.spatial_ref == 'spatial_ref'
    assert vector_pk_0.extent == ''
    assert vector_pk_0.geom_type == ''
    assert module_0.VectorPk.pk_formats == ['.shp', 'shp']
    none_type_0 = None
    vector_pk_0.get_resources(none_type_0, vector_pk_0)

@pytest.mark.xfail(strict=True)
def test_case_22():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    str_0 = 'raster'
    var_0 = module_0.create_package(str_0, str_0, str_0)
    var_1 = module_0.process_dirs(str_0, str_0, var_0, var_0, var_0)
    raster_pk_0.create_raster_resources(str_0)

@pytest.mark.xfail(strict=True)
def test_case_23():
    var_0 = module_2.purge()
    str_0 = 'aser'
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
    var_1 = module_0.write_out_scripts(dict_0, str_0, str_0)
    var_1.__delitem__(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_24():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    str_0 = 'G9\x0ct'
    none_type_0 = None
    module_0.create_package(str_0, none_type_0, raster_pk_0, skip_lines=raster_pk_0, encoding=raster_pk_0)

@pytest.mark.xfail(strict=True)
def test_case_25():
    str_0 = ''
    var_0 = module_0.get_directory(str_0)
    assert var_0 == '/pynguin'
    module_0.create_vector_datapackage(var_0, var_0, var_0, str_0)

def test_case_26():
    str_0 = ']^ster'
    bool_0 = False
    var_0 = module_0.create_package(str_0, str_0, str_0, str_0, encoding=bool_0)

@pytest.mark.xfail(strict=True)
def test_case_27():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    str_0 = 'raster'
    raster_pk_0.create_raster_resources(str_0)

@pytest.mark.xfail(strict=True)
def test_case_28():
    dict_0 = {}
    none_type_0 = None
    tabular_pk_0 = module_0.TabularPk(none_type_0, retriever=none_type_0, **dict_0)
    assert tabular_pk_0.title == 'fill'
    assert tabular_pk_0.description == 'fill'
    assert tabular_pk_0.citation == 'fill'
    assert tabular_pk_0.archived == 'fill or remove this field if not archived'
    assert tabular_pk_0.homepage == 'fill'
    assert tabular_pk_0.version == '1.0.0'
    assert tabular_pk_0.retriever_minimum_version == '2.1.0'
    str_0 = 'commit a dataset'
    error_0 = module_1.Error(**dict_0)
    var_0 = module_0.clean_table_name(str_0)
    assert var_0 == 'commit_a_dataset'
    var_1 = module_0.create_vector_datapackage(error_0, str_0, var_0, var_0)
    tabular_pk_0.get_resources(str_0, error_0)

@pytest.mark.xfail(strict=True)
def test_case_29():
    str_0 = ''
    var_0 = module_0.get_directory(str_0)
    assert var_0 == '/pynguin'
    module_0.create_vector_datapackage(var_0, var_0, str_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_30():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    str_0 = ''
    var_0 = module_0.get_directory(str_0)
    assert var_0 == '/pynguin'
    var_1 = module_0.create_vector_datapackage(raster_pk_0, var_0, var_0, str_0)
    module_0.process_source(str_0, var_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_31():
    vector_pk_0 = module_0.VectorPk()
    assert vector_pk_0.name == 'fill'
    assert vector_pk_0.title == 'fill'
    assert vector_pk_0.description == 'fill'
    assert vector_pk_0.citation == 'fill'
    assert vector_pk_0.archived == 'fill or remove this field if not archived'
    assert vector_pk_0.homepage == 'fill'
    assert vector_pk_0.version == '1.0.0'
    assert vector_pk_0.retriever == 'True'
    assert vector_pk_0.retriever_minimum_version == '2.1.0'
    assert vector_pk_0.driver_name == 'ESRI Shapefile'
    assert vector_pk_0.spatial_ref == 'spatial_ref'
    assert vector_pk_0.extent == ''
    assert vector_pk_0.geom_type == ''
    assert module_0.VectorPk.pk_formats == ['.shp', 'shp']
    str_0 = ''
    var_0 = module_0.get_directory(str_0)
    assert var_0 == '/pynguin'
    module_0.create_vector_datapackage(vector_pk_0, var_0, str_0, var_0)

@pytest.mark.xfail(strict=True)
def test_case_32():
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    str_0 = '/'
    none_type_0 = None
    module_0.create_tabular_datapackage(raster_pk_0, str_0, str_0, raster_pk_0, raster_pk_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_33():
    str_0 = '.'
    var_0 = module_0.create_raster_datapackage(str_0, str_0, str_0, str_0)
    raster_pk_0 = module_0.RasterPk()
    assert raster_pk_0.name == 'fill'
    assert raster_pk_0.title == 'fill'
    assert raster_pk_0.description == 'fill'
    assert raster_pk_0.citation == 'fill'
    assert raster_pk_0.archived == 'fill or remove this field if not archived'
    assert raster_pk_0.homepage == 'fill'
    assert raster_pk_0.version == '1.0.0'
    assert raster_pk_0.retriever == 'True'
    assert raster_pk_0.retriever_minimum_version == '2.1.0'
    assert raster_pk_0.driver == ''
    assert raster_pk_0.datum == '--Coordinate Reference System'
    assert raster_pk_0.projection == 'src_ds GetProjection()'
    assert raster_pk_0.file_size == '--size of file on disk'
    assert raster_pk_0.group_count == '--Number of groups in the dataset if applicable'
    assert raster_pk_0.dataset_count == '--The number of individual datasets'
    assert raster_pk_0.transform == ''
    assert module_0.RasterPk.pk_formats == ['gif', 'img', 'bil', 'jpg', 'tif', 'tiff', 'hdf', 'l1b', '.gif', '.img', '.bil', '.jpg', '.tif', '.tiff', '.hdf', '.l1b']
    assert module_0.RasterPk.multi_formats == ['hdf']
    var_1 = module_0.get_directory(str_0)
    assert var_1 == '/pynguin'
    module_3.open_fw(str_0)