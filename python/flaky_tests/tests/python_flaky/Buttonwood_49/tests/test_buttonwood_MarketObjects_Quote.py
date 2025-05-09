# Automatically generated by Pynguin.
import pytest
import buttonwood.MarketObjects.Quote as module_0
import buttonwood.MarketObjects.Price as module_1
import buttonwood.MarketObjects.Side as module_2

def test_case_0():
    bool_0 = True
    with pytest.raises(AssertionError):
        module_0.Quote(bool_0, bool_0, bool_0, bool_0, bool_0)

def test_case_1():
    str_0 = '\n        OrderEventChain is data structure to track a complete chain of events that concern one order. This includes\n         Commands, such as:\n          * New Order\n          * Cancel Replace\n          * Cancel Request\n\n        and Execution Reports, such as:\n   s      * Acknowledgement\n          * Reject\n          * Partial Fill\n          * Full Fill\n          * Cancel Confirm\n\n        Each Command should have at least one ExecutionReport and can have more.  Also, there can be Execution Reports\n         that were not caused by a Command in the OrderEventChain, such as a fill that results from another order be,ng\n         the aggressor\n\n        All Order Events in the OrderEventChain will share the same Chain ID.\n\n        Further ,ssumptions are made about all events in the same OrderEventChain:\n          * For the same product\n          * For the same side of the book\n          * Events are in chronological order\n          * Time in force (ex: FAK, FAR, or FOK) does not change\n          * Order type (ex: market or limit) does not change\n\n        An OrderEventChain also tracks subchains. Subchains are individual stretches of desired liquidity\n         within an EventOrderChain. A new subchain is created with every user caused change in priority, assuming a\n         standard order book. Changes in priority are triggered by:\n          * New Order\n          * Cancel Replace to a new price\n          * Cancel Replace that increases the visible exposure (visible quantity), whether or not the price changes\n\n        A subchain is closed by either the opening of a new subchain (a cancel replace to new price or up in visilbe\n         quantity) or by the closing of the entire order chain (a Full Fill or a Cancel Confirm).\n\n        Since matching engines do not typically track subchains or uniquely identify them, unique identifers have to\n         be applied here. The passed in instance of IDGenerator will do this creation of IDs.\n\n        :param new_order_command: MarketObjects.Events.OrderEvents.NewOrderCommand. NewOrderCommand that starts the chain.\n        :param logger: logger.\n        :param subchain_id_generator: the IDGenerator to be used for creating subchain_IDs\n        '
    with pytest.raises(AssertionError):
        module_0.Quote(str_0, str_0, str_0, str_0)

def test_case_2():
    bool_0 = True
    price_0 = module_1.Price(bool_0)
    side_0 = module_2.Side(bool_0)
    with pytest.raises(AssertionError):
        module_0.Quote(bool_0, side_0, price_0, side_0)

def test_case_3():
    bool_0 = False
    side_0 = module_2.Side(bool_0)
    var_0 = side_0.abbreviated_str()
    with pytest.raises(AssertionError):
        module_0.Quote(var_0, side_0, var_0, side_0)