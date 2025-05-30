# Automatically generated by Pynguin.
import pytest
import buttonwood.MarketObjects.OrderBooks.BasicOrderBook as module_0

def test_case_0():
    str_0 = ';eR?|I-)1'
    basic_order_book_0 = module_0.BasicOrderBook(str_0, str_0)

def test_case_1():
    bool_0 = False
    none_type_0 = None
    basic_order_book_0 = module_0.BasicOrderBook(bool_0, none_type_0)
    var_0 = basic_order_book_0.market()
    with pytest.raises(NotImplementedError):
        basic_order_book_0.name()

def test_case_2():
    str_0 = 'Y;eR1|I-)1'
    basic_order_book_0 = module_0.BasicOrderBook(str_0, str_0)
    with pytest.raises(NotImplementedError):
        basic_order_book_0.name()

def test_case_3():
    int_0 = 16
    basic_order_book_0 = module_0.BasicOrderBook(int_0, int_0)
    with pytest.raises(NotImplementedError):
        basic_order_book_0.last_update_time()

@pytest.mark.xfail(strict=True)
def test_case_4():
    str_0 = ';eR?|I-)1'
    basic_order_book_0 = module_0.BasicOrderBook(str_0, str_0)
    basic_order_book_0.bid_prices()

@pytest.mark.xfail(strict=True)
def test_case_5():
    int_0 = -1207
    basic_order_book_0 = module_0.BasicOrderBook(int_0, int_0)
    basic_order_book_0.best_bid_price()

@pytest.mark.xfail(strict=True)
def test_case_6():
    float_0 = 671.6
    basic_order_book_0 = module_0.BasicOrderBook(float_0, float_0)
    basic_order_book_0.price_is_ask(basic_order_book_0)

@pytest.mark.xfail(strict=True)
def test_case_7():
    none_type_0 = None
    basic_order_book_0 = module_0.BasicOrderBook(none_type_0, none_type_0)
    basic_order_book_0.best_bid_level()

@pytest.mark.xfail(strict=True)
def test_case_8():
    str_0 = 'VX'
    basic_order_book_0 = module_0.BasicOrderBook(str_0, str_0)
    basic_order_book_0.best_ask_level()

@pytest.mark.xfail(strict=True)
def test_case_9():
    str_0 = 'G4&go'
    bytes_0 = b'\x07\xa2Z\xc6\x94\xc2\x83>\xb1\x84\x93\x18\xe5\xe3/\xc9=\xd2'
    basic_order_book_0 = module_0.BasicOrderBook(bytes_0, str_0)
    bytes_1 = b'\xb85'
    basic_order_book_0.total_qty_at_price(bytes_1, basic_order_book_0)

def test_case_10():
    bool_0 = True
    basic_order_book_0 = module_0.BasicOrderBook(bool_0, bool_0)
    with pytest.raises(NotImplementedError):
        basic_order_book_0.hidden_qty_at_price(bool_0, bool_0)

def test_case_11():
    bool_0 = False
    tuple_0 = ()
    list_0 = [tuple_0]
    basic_order_book_0 = module_0.BasicOrderBook(list_0, list_0)
    with pytest.raises(NotImplementedError):
        basic_order_book_0.num_orders_at_price(bool_0, bool_0)

@pytest.mark.xfail(strict=True)
def test_case_12():
    int_0 = -1321
    basic_order_book_0 = module_0.BasicOrderBook(int_0, int_0)
    basic_order_book_0.ask_prices()