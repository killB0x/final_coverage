# Automatically generated by Pynguin.
import pytest
import buttonwood.MarketMetrics.OrderLevelBookListeners.MarketOrderTicksFromCrossingListener as module_0

@pytest.mark.xfail(strict=True)
def test_case_0():
    none_type_0 = None
    market_order_ticks_from_crossing_0 = module_0.MarketOrderTicksFromCrossing(none_type_0)
    var_0 = market_order_ticks_from_crossing_0.handle_cancel_replace_command(none_type_0, market_order_ticks_from_crossing_0)
    var_1 = market_order_ticks_from_crossing_0.handle_reject_report(market_order_ticks_from_crossing_0, none_type_0)
    market_order_ticks_from_crossing_0.notify_book_update(none_type_0, var_1, market_order_ticks_from_crossing_0)

@pytest.mark.xfail(strict=True)
def test_case_1():
    bool_0 = False
    market_order_ticks_from_crossing_0 = module_0.MarketOrderTicksFromCrossing(bool_0)
    market_order_ticks_from_crossing_1 = module_0.MarketOrderTicksFromCrossing(bool_0)
    var_0 = market_order_ticks_from_crossing_1.handle_cancel_report(market_order_ticks_from_crossing_1, bool_0)
    var_1 = market_order_ticks_from_crossing_0.handle_reject_report(bool_0, bool_0)
    var_2 = market_order_ticks_from_crossing_0.notify_book_update(var_1, var_1, var_1)
    var_1.handle_new_order_command(bool_0, bool_0)

def test_case_2():
    dict_0 = {}
    market_order_ticks_from_crossing_0 = module_0.MarketOrderTicksFromCrossing(dict_0)

@pytest.mark.xfail(strict=True)
def test_case_3():
    none_type_0 = None
    list_0 = [none_type_0, none_type_0]
    bool_0 = False
    market_order_ticks_from_crossing_0 = module_0.MarketOrderTicksFromCrossing(bool_0)
    market_order_ticks_from_crossing_0.ticks_from_crossing(none_type_0, list_0)