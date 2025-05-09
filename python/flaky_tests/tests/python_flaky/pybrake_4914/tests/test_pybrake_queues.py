# Automatically generated by Pynguin.
import pytest
import pybrake.queues as module_0

def test_case_0():
    queue_stats_0 = module_0.QueueStats()
    assert f'{type(queue_stats_0).__module__}.{type(queue_stats_0).__qualname__}' == 'pybrake.queues.QueueStats'
    assert module_0.QUEUE_HANDLER == 'queue.handler'

@pytest.mark.xfail(strict=True)
def test_case_1():
    queue_stats_0 = module_0.QueueStats()
    assert f'{type(queue_stats_0).__module__}.{type(queue_stats_0).__qualname__}' == 'pybrake.queues.QueueStats'
    assert module_0.QUEUE_HANDLER == 'queue.handler'
    queue_stats_0.notify(queue_stats_0)

def test_case_2():
    queue_metric_0 = module_0.QueueMetric()
    assert f'{type(queue_metric_0).__module__}.{type(queue_metric_0).__qualname__}' == 'pybrake.queues.QueueMetric'
    assert queue_metric_0.start_time == pytest.approx(1665638142.4289546, abs=0.01, rel=0.01)
    assert queue_metric_0.end_time is None
    assert queue_metric_0.queue == ''
    assert module_0.QUEUE_HANDLER == 'queue.handler'

def test_case_3():
    queue_metric_0 = module_0.QueueMetric()
    assert f'{type(queue_metric_0).__module__}.{type(queue_metric_0).__qualname__}' == 'pybrake.queues.QueueMetric'
    assert queue_metric_0.start_time == pytest.approx(1665638142.4294133, abs=0.01, rel=0.01)
    assert queue_metric_0.end_time is None
    assert queue_metric_0.queue == ''
    assert module_0.QUEUE_HANDLER == 'queue.handler'
    var_0 = queue_metric_0.end()
    assert queue_metric_0.end_time == pytest.approx(1665638142.4296393, abs=0.01, rel=0.01)
    queue_stats_0 = module_0.QueueStats(project_id=queue_metric_0, host=var_0)
    assert f'{type(queue_stats_0).__module__}.{type(queue_stats_0).__qualname__}' == 'pybrake.queues.QueueStats'
    var_1 = queue_stats_0.notify(queue_metric_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    module_0._QueueStat()

@pytest.mark.xfail(strict=True)
def test_case_5():
    queue_metric_0 = module_0.QueueMetric()
    assert f'{type(queue_metric_0).__module__}.{type(queue_metric_0).__qualname__}' == 'pybrake.queues.QueueMetric'
    assert queue_metric_0.start_time == pytest.approx(1665638142.4310215, abs=0.01, rel=0.01)
    assert queue_metric_0.end_time is None
    assert queue_metric_0.queue == ''
    assert module_0.QUEUE_HANDLER == 'queue.handler'
    var_0 = queue_metric_0.start_span(queue_metric_0)
    var_1 = queue_metric_0.end_span(queue_metric_0)
    var_2 = queue_metric_0.end()
    assert queue_metric_0.end_time == pytest.approx(1665638142.4317148, abs=0.01, rel=0.01)
    queue_stats_0 = module_0.QueueStats(project_id=queue_metric_0, host=var_2)
    assert f'{type(queue_stats_0).__module__}.{type(queue_stats_0).__qualname__}' == 'pybrake.queues.QueueStats'
    queue_stats_0.notify(queue_metric_0)