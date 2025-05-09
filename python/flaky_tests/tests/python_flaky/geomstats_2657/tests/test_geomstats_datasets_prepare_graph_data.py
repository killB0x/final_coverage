# Automatically generated by Pynguin.
import pytest
import autograd.tracer as module_0
import geomstats.datasets.prepare_graph_data as module_1

@pytest.mark.xfail(strict=True)
def test_case_0():
    module_0.clip()

def test_case_1():
    hyperbolic_embedding_0 = module_1.HyperbolicEmbedding()
    assert hyperbolic_embedding_0.max_epochs == 100
    assert hyperbolic_embedding_0.lr == pytest.approx(0.05, abs=0.01, rel=0.01)
    assert hyperbolic_embedding_0.n_context == 1
    assert hyperbolic_embedding_0.n_negative == 2

@pytest.mark.xfail(strict=True)
def test_case_2():
    str_0 = '0U{X-AB-Wz'
    bool_0 = True
    module_1.Graph(bool_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    hyperbolic_embedding_0 = module_1.HyperbolicEmbedding()
    assert hyperbolic_embedding_0.max_epochs == 100
    assert hyperbolic_embedding_0.lr == pytest.approx(0.05, abs=0.01, rel=0.01)
    assert hyperbolic_embedding_0.n_context == 1
    assert hyperbolic_embedding_0.n_negative == 2
    str_0 = '6~1%Uu'
    hyperbolic_embedding_0.grad_log_sigmoid(str_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    none_type_0 = None
    hyperbolic_embedding_0 = module_1.HyperbolicEmbedding(max_epochs=none_type_0)
    assert hyperbolic_embedding_0.lr == pytest.approx(0.05, abs=0.01, rel=0.01)
    assert hyperbolic_embedding_0.n_context == 1
    assert hyperbolic_embedding_0.n_negative == 2
    hyperbolic_embedding_0.log_sigmoid(hyperbolic_embedding_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    none_type_0 = None
    hyperbolic_embedding_0 = module_1.HyperbolicEmbedding(none_type_0, none_type_0)
    assert hyperbolic_embedding_0.lr == pytest.approx(0.05, abs=0.01, rel=0.01)
    assert hyperbolic_embedding_0.n_context == 1
    assert hyperbolic_embedding_0.n_negative == 2
    hyperbolic_embedding_0.loss(none_type_0, none_type_0, hyperbolic_embedding_0)

@pytest.mark.xfail(strict=True)
def test_case_6():
    hyperbolic_embedding_0 = module_1.HyperbolicEmbedding()
    assert hyperbolic_embedding_0.max_epochs == 100
    assert hyperbolic_embedding_0.lr == pytest.approx(0.05, abs=0.01, rel=0.01)
    assert hyperbolic_embedding_0.n_context == 1
    assert hyperbolic_embedding_0.n_negative == 2
    hyperbolic_embedding_0.grad_squared_distance(hyperbolic_embedding_0, hyperbolic_embedding_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    str_0 = '0U{X-ABWz'
    bool_0 = False
    hyperbolic_embedding_0 = module_1.HyperbolicEmbedding()
    assert hyperbolic_embedding_0.max_epochs == 100
    assert hyperbolic_embedding_0.lr == pytest.approx(0.05, abs=0.01, rel=0.01)
    assert hyperbolic_embedding_0.n_context == 1
    assert hyperbolic_embedding_0.n_negative == 2
    module_1.Graph(bool_0, str_0)