# Automatically generated by Pynguin.
import typed_ast._ast3 as module_0
import py_backwards.transformers.metaclass as module_1


def test_case_0():
    pow_0 = module_0.Pow()
    metaclass_transformer_0 = module_1.MetaclassTransformer(pow_0)


def test_case_1():
    module_0 = module_0.Module()
    index_0 = module_0.Index()
    metaclass_transformer_0 = module_1.MetaclassTransformer(index_0)
    metaclass_transformer_0.visit_Module(module_0)


def test_case_2():
    str_0 = "v.^T28tM\x0b"
    dict_0 = {str_0: str_0}
    mat_mult_0 = module_0.MatMult(**dict_0)
    list_0 = [dict_0, str_0, mat_mult_0]
    class_def_0 = module_0.ClassDef(*list_0)
    metaclass_transformer_0 = module_1.MetaclassTransformer(mat_mult_0)
    metaclass_transformer_0.visit_ClassDef(class_def_0)


def test_case_3():
    none_type_0 = None
    metaclass_transformer_0 = module_1.MetaclassTransformer(none_type_0)
    bool_0 = False
    list_0 = [bool_0, bool_0, bool_0]
    dict_0 = {}
    class_def_0 = module_0.ClassDef(*list_0, **dict_0)
    num_0 = module_0.Num()
    metaclass_transformer_1 = module_1.MetaclassTransformer(class_def_0)
    class_def_1 = metaclass_transformer_1.visit_ClassDef(class_def_0)
