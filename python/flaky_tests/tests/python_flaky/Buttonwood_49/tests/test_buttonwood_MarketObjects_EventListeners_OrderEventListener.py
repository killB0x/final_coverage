# Automatically generated by Pynguin.
import buttonwood.MarketObjects.EventListeners.OrderEventListener as module_0

def test_case_0():
    float_0 = 2092.344751
    order_event_listener_0 = module_0.OrderEventListener(float_0)

def test_case_1():
    bool_0 = False
    bool_1 = False
    order_event_listener_0 = module_0.OrderEventListener(bool_1)
    var_0 = order_event_listener_0.handle_new_order_command(bool_1, bool_1)
    none_type_0 = None
    float_0 = -1541.70822
    var_1 = order_event_listener_0.handle_cancel_command(float_0, float_0)
    var_2 = order_event_listener_0.handle_acknowledgement_report(bool_1, none_type_0)
    var_3 = order_event_listener_0.clean_up(bool_0)
    order_event_listener_1 = module_0.OrderEventListener(order_event_listener_0)
    int_0 = 10
    var_4 = order_event_listener_0.handle_cancel_command(bool_1, int_0)
    var_3.handle_chain_close(order_event_listener_0)

def test_case_2():
    int_0 = 1948
    order_event_listener_0 = module_0.OrderEventListener(int_0)
    var_0 = order_event_listener_0.handle_cancel_replace_command(int_0, int_0)
    var_0.handle_full_fill_report(int_0, int_0)

def test_case_3():
    str_0 = '96)i.C)s_}s<M*XR'
    order_event_listener_0 = module_0.OrderEventListener(str_0)
    var_0 = order_event_listener_0.handle_cancel_command(str_0, str_0)

def test_case_4():
    int_0 = 1740
    list_0 = [int_0, int_0, int_0]
    bool_0 = True
    order_event_listener_0 = module_0.OrderEventListener(bool_0)
    str_0 = '&M:T!'
    order_event_listener_1 = module_0.OrderEventListener(str_0)
    var_0 = order_event_listener_1.handle_acknowledgement_report(bool_0, order_event_listener_0)
    var_0.handle_acknowledgement_report(list_0, int_0)

def test_case_5():
    bool_0 = False
    str_0 = '1LF'
    bool_1 = False
    order_event_listener_0 = module_0.OrderEventListener(bool_1)
    var_0 = order_event_listener_0.handle_partial_fill_report(str_0, str_0)
    var_0.handle_acknowledgement_report(bool_0, bool_0)

def test_case_6():
    none_type_0 = None
    str_0 = '\nf:'
    none_type_1 = None
    order_event_listener_0 = module_0.OrderEventListener(none_type_1)
    var_0 = order_event_listener_0.handle_acknowledgement_report(order_event_listener_0, none_type_1)
    var_1 = order_event_listener_0.handle_full_fill_report(str_0, str_0)
    var_1.handle_chain_close(none_type_0)

def test_case_7():
    none_type_0 = None
    bytes_0 = b'\x8e\xfaE\xa8\xc2\xdd\xf7\xe3\xbe\x86'
    order_event_listener_0 = module_0.OrderEventListener(bytes_0)
    var_0 = order_event_listener_0.clean_up(bytes_0)
    order_event_listener_1 = module_0.OrderEventListener(none_type_0)
    var_1 = order_event_listener_1.handle_cancel_report(none_type_0, none_type_0)
    var_1.handle_acknowledgement_report(bytes_0, bytes_0)

def test_case_8():
    float_0 = 1575.7148
    none_type_0 = None
    str_0 = '-{uH0DJbGj\rhE2#F\tN7'
    tuple_0 = (str_0,)
    order_event_listener_0 = module_0.OrderEventListener(float_0)
    var_0 = order_event_listener_0.handle_reject_report(tuple_0, none_type_0)
    var_0.handle_full_fill_report(float_0, float_0)

def test_case_9():
    bytes_0 = b'\xa3\xa5\x1f\x14\x17\x11\xff\xc2\xdaFH'
    list_0 = [bytes_0, bytes_0, bytes_0]
    order_event_listener_0 = module_0.OrderEventListener(list_0)
    var_0 = order_event_listener_0.handle_full_fill_report(order_event_listener_0, order_event_listener_0)
    str_0 = 'NO/#Mo:*7,S[`zbOv8'
    order_event_listener_1 = module_0.OrderEventListener(str_0)
    var_1 = order_event_listener_1.handle_chain_close(str_0)
    order_event_listener_2 = module_0.OrderEventListener(str_0)
    var_2 = order_event_listener_2.handle_acknowledgement_report(order_event_listener_1, order_event_listener_1)
    var_2.handle_cancel_report(order_event_listener_1, order_event_listener_2)

def test_case_10():
    none_type_0 = None
    bytes_0 = b'\xec\x89J\xe4\xc4^\xc5\xb1\t\xdbB{\x0b'
    bool_0 = True
    order_event_listener_0 = module_0.OrderEventListener(bool_0)
    var_0 = order_event_listener_0.clean_up(bytes_0)
    var_0.handle_chain_close(none_type_0)