# Automatically generated by Pynguin.
import ledger.immutable_store as module_0

def test_case_0():
    bytes_0 = b'@\x08\x97'
    module_0.ImmutableStore(*bytes_0, **bytes_0)

def test_case_1():
    immutable_store_0 = module_0.ImmutableStore()
    immutable_store_0.start(immutable_store_0)

def test_case_2():
    immutable_store_0 = module_0.ImmutableStore()
    immutable_store_0.stop()

def test_case_3():
    bytes_0 = b'f\x8e\xea\xd3\x16\xba\xf3\xd7\x9du\x96,\x92\xe7T%\x14l'
    immutable_store_0 = module_0.ImmutableStore()
    immutable_store_0.append(bytes_0)

def test_case_4():
    complex_0 = (512.4+1181.99j)
    float_0 = 455.0121
    immutable_store_0 = module_0.ImmutableStore()
    immutable_store_0.get(complex_0, float_0)

def test_case_5():
    immutable_store_0 = module_0.ImmutableStore()
    immutable_store_0.size()