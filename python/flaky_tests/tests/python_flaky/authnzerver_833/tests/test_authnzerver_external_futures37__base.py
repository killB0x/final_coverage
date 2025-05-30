# Automatically generated by Pynguin.
import pytest
import authnzerver.external.futures37._base as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    all_completed_waiter_0 = module_0._AllCompletedWaiter(none_type_0, none_type_0)
    assert f'{type(all_completed_waiter_0).__module__}.{type(all_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._AllCompletedWaiter'
    assert all_completed_waiter_0.num_pending_calls is None
    assert all_completed_waiter_0.stop_on_exception is None
    assert f'{type(all_completed_waiter_0.lock).__module__}.{type(all_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    assert f'{type(all_completed_waiter_0.event).__module__}.{type(all_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert all_completed_waiter_0.finished_futures == []
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    all_completed_waiter_0.add_exception(all_completed_waiter_0)

def test_case_1():
    cancelled_error_0 = module_0.CancelledError()
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    executor_0 = module_0.Executor()
    var_0 = executor_0.map(cancelled_error_0)
    var_1 = executor_0.map(cancelled_error_0, *var_0, chunksize=cancelled_error_0)

def test_case_2():
    as_completed_waiter_0 = module_0._AsCompletedWaiter()
    assert f'{type(as_completed_waiter_0).__module__}.{type(as_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._AsCompletedWaiter'
    assert f'{type(as_completed_waiter_0.event).__module__}.{type(as_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert as_completed_waiter_0.finished_futures == []
    assert f'{type(as_completed_waiter_0.lock).__module__}.{type(as_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []

@pytest.mark.xfail(strict=True)
def test_case_3():
    set_0 = set()
    all_completed_waiter_0 = module_0._AllCompletedWaiter(set_0, set_0)
    assert f'{type(all_completed_waiter_0).__module__}.{type(all_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._AllCompletedWaiter'
    assert all_completed_waiter_0.num_pending_calls == {*()}
    assert all_completed_waiter_0.stop_on_exception == {*()}
    assert f'{type(all_completed_waiter_0.lock).__module__}.{type(all_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    assert f'{type(all_completed_waiter_0.event).__module__}.{type(all_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert all_completed_waiter_0.finished_futures == []
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    all_completed_waiter_0.add_result(all_completed_waiter_0)

@pytest.mark.xfail(strict=True)
def test_case_4():
    executor_0 = module_0.Executor()
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    all_completed_waiter_0 = module_0._AllCompletedWaiter(executor_0, executor_0)
    assert f'{type(all_completed_waiter_0).__module__}.{type(all_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._AllCompletedWaiter'
    assert f'{type(all_completed_waiter_0.num_pending_calls).__module__}.{type(all_completed_waiter_0.num_pending_calls).__qualname__}' == 'authnzerver.external.futures37._base.Executor'
    assert f'{type(all_completed_waiter_0.stop_on_exception).__module__}.{type(all_completed_waiter_0.stop_on_exception).__qualname__}' == 'authnzerver.external.futures37._base.Executor'
    assert f'{type(all_completed_waiter_0.lock).__module__}.{type(all_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    assert f'{type(all_completed_waiter_0.event).__module__}.{type(all_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert all_completed_waiter_0.finished_futures == []
    all_completed_waiter_0.add_cancelled(executor_0)

@pytest.mark.xfail(strict=True)
def test_case_5():
    first_completed_waiter_0 = module_0._FirstCompletedWaiter()
    assert f'{type(first_completed_waiter_0).__module__}.{type(first_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._FirstCompletedWaiter'
    assert f'{type(first_completed_waiter_0.event).__module__}.{type(first_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert first_completed_waiter_0.finished_futures == []
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    list_0 = []
    var_0 = first_completed_waiter_0.add_result(list_0)
    assert first_completed_waiter_0.finished_futures == [[]]
    var_1 = module_0.wait(list_0, list_0, var_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'authnzerver.external.futures37._base.DoneAndNotDoneFutures'
    assert len(var_1) == 2
    assert f'{type(module_0.DoneAndNotDoneFutures.done).__module__}.{type(module_0.DoneAndNotDoneFutures.done).__qualname__}' == '_collections._tuplegetter'
    assert f'{type(module_0.DoneAndNotDoneFutures.not_done).__module__}.{type(module_0.DoneAndNotDoneFutures.not_done).__qualname__}' == '_collections._tuplegetter'
    var_2 = module_0.as_completed(list_0)
    executor_0 = module_0.Executor()
    var_3 = executor_0.map(list_0, *var_2)
    module_0.wait(var_3)

@pytest.mark.xfail(strict=True)
def test_case_6():
    first_completed_waiter_0 = module_0._FirstCompletedWaiter()
    assert f'{type(first_completed_waiter_0).__module__}.{type(first_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._FirstCompletedWaiter'
    assert f'{type(first_completed_waiter_0.event).__module__}.{type(first_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert first_completed_waiter_0.finished_futures == []
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    list_0 = []
    var_0 = first_completed_waiter_0.add_result(list_0)
    assert first_completed_waiter_0.finished_futures == [[]]
    none_type_0 = None
    var_1 = module_0.wait(list_0, list_0, none_type_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'authnzerver.external.futures37._base.DoneAndNotDoneFutures'
    assert len(var_1) == 2
    assert f'{type(module_0.DoneAndNotDoneFutures.done).__module__}.{type(module_0.DoneAndNotDoneFutures.done).__qualname__}' == '_collections._tuplegetter'
    assert f'{type(module_0.DoneAndNotDoneFutures.not_done).__module__}.{type(module_0.DoneAndNotDoneFutures.not_done).__qualname__}' == '_collections._tuplegetter'
    var_2 = module_0.as_completed(list_0)
    executor_0 = module_0.Executor()
    var_3 = executor_0.map(list_0, *var_2)
    var_4 = first_completed_waiter_0.add_exception(first_completed_waiter_0)
    assert len(first_completed_waiter_0.finished_futures) == 2
    module_0.wait(var_3)

@pytest.mark.xfail(strict=True)
def test_case_7():
    first_completed_waiter_0 = module_0._FirstCompletedWaiter()
    assert f'{type(first_completed_waiter_0).__module__}.{type(first_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._FirstCompletedWaiter'
    assert f'{type(first_completed_waiter_0.event).__module__}.{type(first_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert first_completed_waiter_0.finished_futures == []
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    var_0 = first_completed_waiter_0.add_cancelled(first_completed_waiter_0)
    assert len(first_completed_waiter_0.finished_futures) == 1
    list_0 = []
    var_1 = first_completed_waiter_0.add_result(list_0)
    assert len(first_completed_waiter_0.finished_futures) == 2
    none_type_0 = None
    var_2 = module_0.wait(list_0, list_0, none_type_0)
    assert f'{type(var_2).__module__}.{type(var_2).__qualname__}' == 'authnzerver.external.futures37._base.DoneAndNotDoneFutures'
    assert len(var_2) == 2
    assert f'{type(module_0.DoneAndNotDoneFutures.done).__module__}.{type(module_0.DoneAndNotDoneFutures.done).__qualname__}' == '_collections._tuplegetter'
    assert f'{type(module_0.DoneAndNotDoneFutures.not_done).__module__}.{type(module_0.DoneAndNotDoneFutures.not_done).__qualname__}' == '_collections._tuplegetter'
    var_3 = module_0.as_completed(list_0)
    executor_0 = module_0.Executor()
    var_4 = executor_0.map(list_0, *var_3)
    module_0.wait(var_4)

@pytest.mark.xfail(strict=True)
def test_case_8():
    cancelled_error_0 = module_0.CancelledError()
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    module_0.wait(cancelled_error_0)

@pytest.mark.xfail(strict=True)
def test_case_9():
    executor_0 = module_0.Executor()
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    var_0 = executor_0.map(executor_0, chunksize=executor_0)
    var_1 = executor_0.shutdown(executor_0)
    var_1.add_exception(executor_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    executor_0 = module_0.Executor()
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    var_0 = executor_0.__enter__()
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'authnzerver.external.futures37._base.Executor'
    all_completed_waiter_0 = module_0._AllCompletedWaiter(executor_0, executor_0)
    assert f'{type(all_completed_waiter_0).__module__}.{type(all_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._AllCompletedWaiter'
    assert f'{type(all_completed_waiter_0.num_pending_calls).__module__}.{type(all_completed_waiter_0.num_pending_calls).__qualname__}' == 'authnzerver.external.futures37._base.Executor'
    assert f'{type(all_completed_waiter_0.stop_on_exception).__module__}.{type(all_completed_waiter_0.stop_on_exception).__qualname__}' == 'authnzerver.external.futures37._base.Executor'
    assert f'{type(all_completed_waiter_0.lock).__module__}.{type(all_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    assert f'{type(all_completed_waiter_0.event).__module__}.{type(all_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert all_completed_waiter_0.finished_futures == []
    var_1 = all_completed_waiter_0.__lt__(all_completed_waiter_0)
    all_completed_waiter_0.add_cancelled(executor_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    list_0 = []
    none_type_0 = None
    var_0 = module_0.wait(list_0, list_0, none_type_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'authnzerver.external.futures37._base.DoneAndNotDoneFutures'
    assert len(var_0) == 2
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    assert f'{type(module_0.DoneAndNotDoneFutures.done).__module__}.{type(module_0.DoneAndNotDoneFutures.done).__qualname__}' == '_collections._tuplegetter'
    assert f'{type(module_0.DoneAndNotDoneFutures.not_done).__module__}.{type(module_0.DoneAndNotDoneFutures.not_done).__qualname__}' == '_collections._tuplegetter'
    var_1 = module_0.as_completed(list_0)
    executor_0 = module_0.Executor()
    as_completed_waiter_0 = module_0._AsCompletedWaiter()
    assert f'{type(as_completed_waiter_0.event).__module__}.{type(as_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert as_completed_waiter_0.finished_futures == []
    assert f'{type(as_completed_waiter_0.lock).__module__}.{type(as_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    var_2 = executor_0.map(list_0, *var_1)
    var_3 = executor_0.__exit__(var_2, var_0, var_0)
    module_0.wait(var_2)

@pytest.mark.xfail(strict=True)
def test_case_12():
    waiter_0 = module_0._Waiter()
    assert f'{type(waiter_0).__module__}.{type(waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._Waiter'
    assert f'{type(waiter_0.event).__module__}.{type(waiter_0.event).__qualname__}' == 'threading.Event'
    assert waiter_0.finished_futures == []
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    all_completed_waiter_0 = module_0._AllCompletedWaiter(waiter_0, waiter_0)
    assert f'{type(all_completed_waiter_0).__module__}.{type(all_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._AllCompletedWaiter'
    assert f'{type(all_completed_waiter_0.num_pending_calls).__module__}.{type(all_completed_waiter_0.num_pending_calls).__qualname__}' == 'authnzerver.external.futures37._base._Waiter'
    assert f'{type(all_completed_waiter_0.stop_on_exception).__module__}.{type(all_completed_waiter_0.stop_on_exception).__qualname__}' == 'authnzerver.external.futures37._base._Waiter'
    assert f'{type(all_completed_waiter_0.lock).__module__}.{type(all_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    assert f'{type(all_completed_waiter_0.event).__module__}.{type(all_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert all_completed_waiter_0.finished_futures == []
    all_completed_waiter_1 = module_0._AllCompletedWaiter(waiter_0, all_completed_waiter_0)
    assert f'{type(all_completed_waiter_1.event).__module__}.{type(all_completed_waiter_1.event).__qualname__}' == 'threading.Event'
    assert all_completed_waiter_1.finished_futures == []
    var_0 = all_completed_waiter_0.add_exception(waiter_0)
    assert f'{type(all_completed_waiter_0.finished_futures).__module__}.{type(all_completed_waiter_0.finished_futures).__qualname__}' == 'builtins.list'
    assert len(all_completed_waiter_0.finished_futures) == 1
    error_0 = module_0.Error()
    executor_0 = module_0.Executor()
    var_0.add_result(waiter_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = '\nThis is the main file for the authnzerver frontend.\n\n'
    module_0.wait(str_0, str_0)

def test_case_14():
    list_0 = []
    var_0 = module_0.wait(list_0)
    assert f'{type(var_0).__module__}.{type(var_0).__qualname__}' == 'authnzerver.external.futures37._base.DoneAndNotDoneFutures'
    assert len(var_0) == 2
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    assert f'{type(module_0.DoneAndNotDoneFutures.done).__module__}.{type(module_0.DoneAndNotDoneFutures.done).__qualname__}' == '_collections._tuplegetter'
    assert f'{type(module_0.DoneAndNotDoneFutures.not_done).__module__}.{type(module_0.DoneAndNotDoneFutures.not_done).__qualname__}' == '_collections._tuplegetter'

@pytest.mark.xfail(strict=True)
def test_case_15():
    list_0 = []
    var_0 = module_0.as_completed(list_0)
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    module_0.wait(var_0, return_when=var_0)

@pytest.mark.xfail(strict=True)
def test_case_16():
    cancelled_error_0 = module_0.CancelledError()
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    list_0 = module_0.as_completed(cancelled_error_0, cancelled_error_0)
    executor_0 = module_0.Executor()
    var_0 = module_0.as_completed(executor_0)
    executor_1 = module_0.Executor()
    executor_0.map(cancelled_error_0, *list_0, chunksize=list_0)

def test_case_17():
    error_0 = module_0.Error()
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    executor_0 = module_0.Executor()
    with pytest.raises(NotImplementedError):
        executor_0.submit(executor_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    as_completed_waiter_0 = module_0._AsCompletedWaiter()
    assert f'{type(as_completed_waiter_0).__module__}.{type(as_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._AsCompletedWaiter'
    assert f'{type(as_completed_waiter_0.event).__module__}.{type(as_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert as_completed_waiter_0.finished_futures == []
    assert f'{type(as_completed_waiter_0.lock).__module__}.{type(as_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    executor_0 = module_0.Executor()
    var_0 = module_0.as_completed(executor_0)
    executor_1 = module_0.Executor()
    executor_1.map(as_completed_waiter_0, timeout=as_completed_waiter_0, chunksize=executor_1)

@pytest.mark.xfail(strict=True)
def test_case_19():
    bool_0 = True
    all_completed_waiter_0 = module_0._AllCompletedWaiter(bool_0, bool_0)
    assert f'{type(all_completed_waiter_0).__module__}.{type(all_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._AllCompletedWaiter'
    assert all_completed_waiter_0.num_pending_calls is True
    assert all_completed_waiter_0.stop_on_exception is True
    assert f'{type(all_completed_waiter_0.lock).__module__}.{type(all_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    assert f'{type(all_completed_waiter_0.event).__module__}.{type(all_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert all_completed_waiter_0.finished_futures == []
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    var_0 = all_completed_waiter_0.add_result(all_completed_waiter_0)
    assert all_completed_waiter_0.num_pending_calls == 0
    assert f'{type(all_completed_waiter_0.finished_futures).__module__}.{type(all_completed_waiter_0.finished_futures).__qualname__}' == 'builtins.list'
    assert len(all_completed_waiter_0.finished_futures) == 1
    var_0.__delitem__(all_completed_waiter_0)

@pytest.mark.xfail(strict=True)
def test_case_20():
    str_0 = '0o100600'
    acquire_futures_0 = module_0._AcquireFutures(str_0)
    assert f'{type(acquire_futures_0).__module__}.{type(acquire_futures_0).__qualname__}' == 'authnzerver.external.futures37._base._AcquireFutures'
    assert acquire_futures_0.futures == ['6', '0', '0', '0', '0', '0', 'o', '1']
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    acquire_futures_0.__exit__()

@pytest.mark.xfail(strict=True)
def test_case_21():
    first_completed_waiter_0 = module_0._FirstCompletedWaiter()
    assert f'{type(first_completed_waiter_0).__module__}.{type(first_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._FirstCompletedWaiter'
    assert f'{type(first_completed_waiter_0.event).__module__}.{type(first_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert first_completed_waiter_0.finished_futures == []
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    list_0 = []
    var_0 = first_completed_waiter_0.add_result(list_0)
    assert first_completed_waiter_0.finished_futures == [[]]
    var_1 = module_0.wait(list_0, list_0, var_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'authnzerver.external.futures37._base.DoneAndNotDoneFutures'
    assert len(var_1) == 2
    assert f'{type(module_0.DoneAndNotDoneFutures.done).__module__}.{type(module_0.DoneAndNotDoneFutures.done).__qualname__}' == '_collections._tuplegetter'
    assert f'{type(module_0.DoneAndNotDoneFutures.not_done).__module__}.{type(module_0.DoneAndNotDoneFutures.not_done).__qualname__}' == '_collections._tuplegetter'
    var_2 = var_0.__repr__()
    executor_0 = module_0.Executor()
    executor_0.map(list_0, *var_2)

@pytest.mark.xfail(strict=True)
def test_case_22():
    waiter_0 = module_0._Waiter()
    assert f'{type(waiter_0).__module__}.{type(waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._Waiter'
    assert f'{type(waiter_0.event).__module__}.{type(waiter_0.event).__qualname__}' == 'threading.Event'
    assert waiter_0.finished_futures == []
    assert module_0.FIRST_COMPLETED == 'FIRST_COMPLETED'
    assert module_0.FIRST_EXCEPTION == 'FIRST_EXCEPTION'
    assert module_0.ALL_COMPLETED == 'ALL_COMPLETED'
    assert module_0.PENDING == 'PENDING'
    assert module_0.RUNNING == 'RUNNING'
    assert module_0.CANCELLED == 'CANCELLED'
    assert module_0.CANCELLED_AND_NOTIFIED == 'CANCELLED_AND_NOTIFIED'
    assert module_0.FINISHED == 'FINISHED'
    assert f'{type(module_0.LOGGER).__module__}.{type(module_0.LOGGER).__qualname__}' == 'logging.Logger'
    assert module_0.LOGGER.name == 'futures37'
    assert module_0.LOGGER.level == 0
    assert f'{type(module_0.LOGGER.parent).__module__}.{type(module_0.LOGGER.parent).__qualname__}' == 'logging.RootLogger'
    assert module_0.LOGGER.handlers == []
    var_0 = waiter_0.add_result(waiter_0)
    var_1 = waiter_0.add_result(waiter_0)
    var_2 = waiter_0.add_exception(waiter_0)
    int_0 = -645
    all_completed_waiter_0 = module_0._AllCompletedWaiter(int_0, int_0)
    assert f'{type(all_completed_waiter_0).__module__}.{type(all_completed_waiter_0).__qualname__}' == 'authnzerver.external.futures37._base._AllCompletedWaiter'
    assert all_completed_waiter_0.num_pending_calls == -645
    assert all_completed_waiter_0.stop_on_exception == -645
    assert f'{type(all_completed_waiter_0.lock).__module__}.{type(all_completed_waiter_0.lock).__qualname__}' == '_thread.lock'
    assert f'{type(all_completed_waiter_0.event).__module__}.{type(all_completed_waiter_0.event).__qualname__}' == 'threading.Event'
    assert all_completed_waiter_0.finished_futures == []
    var_3 = all_completed_waiter_0.add_cancelled(all_completed_waiter_0)
    assert all_completed_waiter_0.num_pending_calls == -646
    assert f'{type(all_completed_waiter_0.finished_futures).__module__}.{type(all_completed_waiter_0.finished_futures).__qualname__}' == 'builtins.list'
    assert len(all_completed_waiter_0.finished_futures) == 1
    first_completed_waiter_0 = module_0._FirstCompletedWaiter()
    var_2.swapcase()