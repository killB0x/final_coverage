# Automatically generated by Pynguin.
import pytest
import bitcoinutils.transactions as module_0

def test_case_0():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'

def test_case_1():
    none_type_0 = None
    tx_input_0 = module_0.TxInput(none_type_0, none_type_0)
    assert f'{type(tx_input_0).__module__}.{type(tx_input_0).__qualname__}' == 'bitcoinutils.transactions.TxInput'
    assert tx_input_0.txid is None
    assert tx_input_0.txout_index is None
    assert f'{type(tx_input_0.script_sig).__module__}.{type(tx_input_0.script_sig).__qualname__}' == 'bitcoinutils.script.Script'
    assert tx_input_0.sequence == b'\xff\xff\xff\xff'
    assert f'{type(module_0.TxInput.copy).__module__}.{type(module_0.TxInput.copy).__qualname__}' == 'builtins.method'

def test_case_2():
    none_type_0 = None
    transaction_0 = module_0.Transaction(has_segwit=none_type_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is None
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.get_vsize()
    assert var_0 == 10
    sequence_0 = module_0.Sequence(var_0, var_0, transaction_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == 10
    assert sequence_0.value == 10
    assert f'{type(sequence_0.is_type_block).__module__}.{type(sequence_0.is_type_block).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    var_1 = sequence_0.for_script()
    assert var_1 == 10
    var_2 = sequence_0.for_input_sequence()
    tx_output_0 = module_0.TxOutput(var_0, var_0)
    assert f'{type(tx_output_0).__module__}.{type(tx_output_0).__qualname__}' == 'bitcoinutils.transactions.TxOutput'
    assert tx_output_0.amount == 10
    assert tx_output_0.script_pubkey == 10
    assert f'{type(module_0.TxOutput.copy).__module__}.{type(module_0.TxOutput.copy).__qualname__}' == 'builtins.method'

def test_case_3():
    none_type_0 = None
    with pytest.raises(TypeError):
        module_0.TxOutput(none_type_0, none_type_0)

def test_case_4():
    none_type_0 = None
    sequence_0 = module_0.Sequence(none_type_0, none_type_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type is None
    assert sequence_0.value is None
    assert sequence_0.is_type_block is True

def test_case_5():
    int_0 = 514
    sequence_0 = module_0.Sequence(int_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == 514
    assert sequence_0.value is None
    assert sequence_0.is_type_block is True
    var_0 = sequence_0.for_input_sequence()

def test_case_6():
    float_0 = 1003.17
    sequence_0 = module_0.Sequence(float_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == pytest.approx(1003.17, abs=0.01, rel=0.01)
    assert sequence_0.value is None
    assert sequence_0.is_type_block is True
    var_0 = sequence_0.for_script()

@pytest.mark.xfail(strict=True)
def test_case_7():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_transaction_digest(transaction_0, transaction_0)

@pytest.mark.xfail(strict=True)
def test_case_8():
    bytes_0 = b'\x18Bitcoin Signed Message:\n'
    transaction_0 = module_0.Transaction(bytes_0, witnesses=bytes_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == b'\x18Bitcoin Signed Message:\n'
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == b'\x18Bitcoin Signed Message:\n'
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_txid()

@pytest.mark.xfail(strict=True)
def test_case_9():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.get_size()
    assert var_0 == 10
    transaction_0.get_transaction_digest(transaction_0, transaction_0)

@pytest.mark.xfail(strict=True)
def test_case_10():
    none_type_0 = None
    transaction_0 = module_0.Transaction(has_segwit=none_type_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is None
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.get_vsize()
    assert var_0 == 10
    transaction_0.get_transaction_segwit_digest(var_0, none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_11():
    int_0 = 492
    tx_output_0 = module_0.TxOutput(int_0, int_0)
    assert f'{type(tx_output_0).__module__}.{type(tx_output_0).__qualname__}' == 'bitcoinutils.transactions.TxOutput'
    assert tx_output_0.amount == 492
    assert tx_output_0.script_pubkey == 492
    assert f'{type(module_0.TxOutput.copy).__module__}.{type(module_0.TxOutput.copy).__qualname__}' == 'builtins.method'
    tx_output_1 = module_0.TxOutput(int_0, tx_output_0)
    tx_output_1.stream()

def test_case_12():
    none_type_0 = None
    locktime_0 = module_0.Locktime(none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_13():
    str_0 = '6eMV3as&|}h'
    locktime_0 = module_0.Locktime(str_0)
    locktime_0.for_transaction()

@pytest.mark.xfail(strict=True)
def test_case_14():
    none_type_0 = None
    transaction_0 = module_0.Transaction(has_segwit=none_type_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is None
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.get_txid()
    assert var_0 == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'
    var_1 = transaction_0.get_vsize()
    assert var_1 == 10
    tx_input_0 = module_0.TxInput(none_type_0, var_1)
    assert f'{type(tx_input_0).__module__}.{type(tx_input_0).__qualname__}' == 'bitcoinutils.transactions.TxInput'
    assert tx_input_0.txid is None
    assert tx_input_0.txout_index == 10
    assert f'{type(tx_input_0.script_sig).__module__}.{type(tx_input_0.script_sig).__qualname__}' == 'bitcoinutils.script.Script'
    assert tx_input_0.sequence == b'\xff\xff\xff\xff'
    assert f'{type(module_0.TxInput.copy).__module__}.{type(module_0.TxInput.copy).__qualname__}' == 'builtins.method'
    sequence_0 = module_0.Sequence(var_1, var_1, transaction_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == 10
    assert sequence_0.value == 10
    assert f'{type(sequence_0.is_type_block).__module__}.{type(sequence_0.is_type_block).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    transaction_0.get_transaction_segwit_digest(var_1, none_type_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_wtxid()

def test_case_16():
    none_type_0 = None
    transaction_0 = module_0.Transaction(has_segwit=none_type_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is None
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.get_vsize()
    assert var_0 == 10
    tx_input_0 = transaction_0.get_hash()
    assert tx_input_0 == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'

@pytest.mark.xfail(strict=True)
def test_case_17():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    int_0 = 277
    sequence_0 = transaction_0.serialize()
    assert sequence_0 == '02000000000000000000'
    sequence_1 = module_0.Sequence(int_0, sequence_0)
    assert f'{type(sequence_1).__module__}.{type(sequence_1).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_1.seq_type == 277
    assert sequence_1.value == '02000000000000000000'
    assert sequence_1.is_type_block is True
    transaction_0.get_transaction_digest(sequence_1, sequence_0)

@pytest.mark.xfail(strict=True)
def test_case_18():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_transaction_segwit_digest(transaction_0, transaction_0, transaction_0)

@pytest.mark.xfail(strict=True)
def test_case_19():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.stream(transaction_0)
    assert var_0 == b'\x02\x00\x00\x00\x00\x00\x00\x00\x00\x00'
    transaction_0.get_transaction_digest(transaction_0, transaction_0)

@pytest.mark.xfail(strict=True)
def test_case_20():
    none_type_0 = None
    locktime_0 = module_0.Locktime(none_type_0)
    transaction_0 = module_0.Transaction(locktime=locktime_0, witnesses=locktime_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert f'{type(transaction_0.witnesses).__module__}.{type(transaction_0.witnesses).__qualname__}' == 'bitcoinutils.transactions.Locktime'
    assert f'{type(transaction_0.locktime).__module__}.{type(transaction_0.locktime).__qualname__}' == 'bitcoinutils.transactions.Locktime'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.stream(locktime_0)

@pytest.mark.xfail(strict=True)
def test_case_21():
    str_0 = '9'
    none_type_0 = None
    dict_0 = {str_0: none_type_0, str_0: none_type_0}
    transaction_0 = module_0.Transaction(witnesses=dict_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == {'9': None}
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_transaction_segwit_digest(none_type_0, dict_0, dict_0)

@pytest.mark.xfail(strict=True)
def test_case_22():
    list_0 = []
    none_type_0 = None
    tx_input_0 = module_0.TxInput(list_0, none_type_0)
    assert f'{type(tx_input_0).__module__}.{type(tx_input_0).__qualname__}' == 'bitcoinutils.transactions.TxInput'
    assert tx_input_0.txid == []
    assert tx_input_0.txout_index is None
    assert f'{type(tx_input_0.script_sig).__module__}.{type(tx_input_0.script_sig).__qualname__}' == 'bitcoinutils.script.Script'
    assert tx_input_0.sequence == b'\xff\xff\xff\xff'
    assert f'{type(module_0.TxInput.copy).__module__}.{type(module_0.TxInput.copy).__qualname__}' == 'builtins.method'
    tx_input_0.stream()

@pytest.mark.xfail(strict=True)
def test_case_23():
    bytes_0 = b'\x00\x0f:'
    transaction_0 = module_0.Transaction(bytes_0, witnesses=bytes_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == b'\x00\x0f:'
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == b'\x00\x0f:'
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    none_type_0 = None
    transaction_0.get_transaction_digest(transaction_0, transaction_0, none_type_0)

@pytest.mark.xfail(strict=True)
def test_case_24():
    bool_0 = True
    transaction_0 = module_0.Transaction(locktime=bool_0, version=bool_0, has_segwit=bool_0, witnesses=bool_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is True
    assert transaction_0.witnesses is True
    assert transaction_0.locktime is True
    assert transaction_0.version is True
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_vsize()

@pytest.mark.xfail(strict=True)
def test_case_25():
    str_0 = '*` +*Jj0<c&r\'" 0c~3'
    module_0.Transaction(str_0, str_0, str_0)

@pytest.mark.xfail(strict=True)
def test_case_26():
    str_0 = "Converts an address to it's hash equivalent\n\n\tThe size of the address determines between P2WPKH and P2WSH.\n        Then Bech32 decodes the address removing network prefix, checksum,\n        witness version.\n\n        Uses a segwit's python reference implementation for now. (TODO)\n\t"
    module_0.TxInput(str_0, str_0, sequence=str_0)

@pytest.mark.xfail(strict=True)
def test_case_27():
    bytes_0 = b'z\x18\xd8\xc4\x17S'
    transaction_0 = module_0.Transaction(outputs=bytes_0, has_segwit=bytes_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == b'z\x18\xd8\xc4\x17S'
    assert transaction_0.has_segwit == b'z\x18\xd8\xc4\x17S'
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_vsize()

@pytest.mark.xfail(strict=True)
def test_case_28():
    int_0 = 1346
    sequence_0 = module_0.Sequence(int_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == 1346
    assert sequence_0.value is None
    assert sequence_0.is_type_block is True
    var_0 = sequence_0.for_script()
    int_1 = 738
    transaction_0 = module_0.Transaction(int_1, has_segwit=int_1)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == 738
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit == 738
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_vsize()

@pytest.mark.xfail(strict=True)
def test_case_29():
    none_type_0 = None
    transaction_0 = module_0.Transaction(has_segwit=none_type_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is None
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.stream(none_type_0)
    assert var_0 == b'\x02\x00\x00\x00\x00\x00\x00\x00\x00\x00'
    transaction_1 = module_0.Transaction(locktime=none_type_0, has_segwit=var_0, witnesses=var_0)
    assert transaction_1.has_segwit == b'\x02\x00\x00\x00\x00\x00\x00\x00\x00\x00'
    assert transaction_1.witnesses == b'\x02\x00\x00\x00\x00\x00\x00\x00\x00\x00'
    transaction_1.get_vsize()

@pytest.mark.xfail(strict=True)
def test_case_30():
    bytes_0 = b'\x9c^\xb8=%\x91Qe\xae'
    transaction_0 = module_0.Transaction(has_segwit=bytes_0, witnesses=bytes_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit == b'\x9c^\xb8=%\x91Qe\xae'
    assert transaction_0.witnesses == b'\x9c^\xb8=%\x91Qe\xae'
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.stream(bytes_0)

@pytest.mark.xfail(strict=True)
def test_case_31():
    bytes_0 = b'\xe0\x9c\xd1\xc1\xaa\x80U8[\xf9\xa0\xaei5q\xf2'
    transaction_0 = module_0.Transaction(outputs=bytes_0, version=bytes_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == b'\xe0\x9c\xd1\xc1\xaa\x80U8[\xf9\xa0\xaei5q\xf2'
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\xe0\x9c\xd1\xc1\xaa\x80U8[\xf9\xa0\xaei5q\xf2'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_transaction_segwit_digest(bytes_0, bytes_0, bytes_0)

def test_case_32():
    int_0 = 769
    bool_0 = False
    sequence_0 = module_0.Sequence(int_0, bool_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == 769
    assert sequence_0.value is False
    assert sequence_0.is_type_block is True
    with pytest.raises(ValueError):
        sequence_0.for_script()

@pytest.mark.xfail(strict=True)
def test_case_33():
    int_0 = 257
    sequence_0 = module_0.Sequence(int_0, int_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == 257
    assert sequence_0.value == 257
    assert sequence_0.is_type_block is True
    var_0 = sequence_0.for_input_sequence()
    assert var_0 == b'\xfe\xff\xff\xff'
    var_0.get_size()

@pytest.mark.xfail(strict=True)
def test_case_34():
    int_0 = 769
    bool_0 = False
    sequence_0 = module_0.Sequence(int_0, bool_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == 769
    assert sequence_0.value is False
    assert sequence_0.is_type_block is True
    var_0 = sequence_0.for_input_sequence()
    assert var_0 == b'\x01\x00\x00\x00'
    var_0.get_hash()

@pytest.mark.xfail(strict=True)
def test_case_35():
    none_type_0 = None
    transaction_0 = module_0.Transaction(version=none_type_0, has_segwit=none_type_0)
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is None
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version is None
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    int_0 = 1932
    transaction_0.get_transaction_segwit_digest(none_type_0, none_type_0, none_type_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_36():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    int_0 = 291
    transaction_0.get_transaction_segwit_digest(transaction_0, transaction_0, transaction_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_37():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.get_hash()
    assert var_0 == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'
    var_1 = transaction_0.get_txid()
    assert var_1 == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'
    int_0 = 514
    sequence_0 = module_0.Sequence(int_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == 514
    assert sequence_0.value is None
    assert sequence_0.is_type_block is True
    tx_input_0 = module_0.TxInput(transaction_0, int_0, var_0)
    assert f'{type(tx_input_0).__module__}.{type(tx_input_0).__qualname__}' == 'bitcoinutils.transactions.TxInput'
    assert f'{type(tx_input_0.txid).__module__}.{type(tx_input_0.txid).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert tx_input_0.txout_index == 514
    assert tx_input_0.script_sig == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'
    assert tx_input_0.sequence == b'\xff\xff\xff\xff'
    assert f'{type(module_0.TxInput.copy).__module__}.{type(module_0.TxInput.copy).__qualname__}' == 'builtins.method'
    var_2 = sequence_0.for_script()
    tx_output_0 = module_0.TxOutput(int_0, var_1)
    assert f'{type(tx_output_0).__module__}.{type(tx_output_0).__qualname__}' == 'bitcoinutils.transactions.TxOutput'
    assert tx_output_0.amount == 514
    assert tx_output_0.script_pubkey == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'
    assert f'{type(module_0.TxOutput.copy).__module__}.{type(module_0.TxOutput.copy).__qualname__}' == 'builtins.method'
    var_3 = sequence_0.for_input_sequence()
    sequence_1 = module_0.Sequence(transaction_0)
    transaction_0.get_transaction_segwit_digest(var_3, transaction_0, transaction_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_38():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.get_hash()
    assert var_0 == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'
    locktime_0 = module_0.Locktime(var_0)
    assert locktime_0.value == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'
    int_0 = 355
    sequence_0 = module_0.Sequence(int_0)
    assert f'{type(sequence_0).__module__}.{type(sequence_0).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert sequence_0.seq_type == 355
    assert sequence_0.value is None
    assert sequence_0.is_type_block is True
    bool_0 = False
    var_1 = sequence_0.for_script()
    tx_output_0 = module_0.TxOutput(bool_0, bool_0)
    assert f'{type(tx_output_0).__module__}.{type(tx_output_0).__qualname__}' == 'bitcoinutils.transactions.TxOutput'
    assert tx_output_0.amount is False
    assert tx_output_0.script_pubkey is False
    assert f'{type(module_0.TxOutput.copy).__module__}.{type(module_0.TxOutput.copy).__qualname__}' == 'builtins.method'
    transaction_0.get_transaction_segwit_digest(int_0, transaction_0, transaction_0, int_0)

@pytest.mark.xfail(strict=True)
def test_case_39():
    transaction_0 = module_0.Transaction()
    assert f'{type(transaction_0).__module__}.{type(transaction_0).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert transaction_0.inputs == []
    assert transaction_0.outputs == []
    assert transaction_0.has_segwit is False
    assert transaction_0.witnesses == []
    assert transaction_0.locktime == b'\x00\x00\x00\x00'
    assert transaction_0.version == b'\x02\x00\x00\x00'
    assert f'{type(module_0.Transaction.copy).__module__}.{type(module_0.Transaction.copy).__qualname__}' == 'builtins.method'
    var_0 = transaction_0.get_hash()
    assert var_0 == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'
    var_1 = module_0.Sequence(transaction_0)
    assert f'{type(var_1).__module__}.{type(var_1).__qualname__}' == 'bitcoinutils.transactions.Sequence'
    assert f'{type(var_1.seq_type).__module__}.{type(var_1.seq_type).__qualname__}' == 'bitcoinutils.transactions.Transaction'
    assert var_1.value is None
    assert var_1.is_type_block is True
    var_2 = transaction_0.get_txid()
    assert var_2 == '4ebd325a4b394cff8c57e8317ccf5a8d0e2bdf1b8526f8aad6c8e43d8240621a'
    int_0 = 513
    module_0.Sequence(int_0)