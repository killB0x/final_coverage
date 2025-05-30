# Automatically generated by Pynguin.
import pytest
import twitchbot.arena as module_0

def test_case_0():
    int_0 = -132
    arena_0 = module_0.Arena(int_0)
    assert arena_0.entry_fee == 30
    assert arena_0.min_users == 2
    assert module_0.ARENA_WAIT_TIME == 30
    assert module_0.ARENA_DEFAULT_ENTRY_FEE == 30
    assert module_0.VICTORY_MESSAGES == ['{winner} fought long and hard, and won {winnings} {currency}', '{winner} has won the FFA, and walked away with {winnings} {currency}!']
    var_0 = arena_0.add_user(arena_0)
    assert var_0 is False

def test_case_1():
    int_0 = -118
    arena_0 = module_0.Arena(int_0)
    assert arena_0.entry_fee == 30
    assert arena_0.min_users == 2
    assert module_0.ARENA_WAIT_TIME == 30
    assert module_0.ARENA_DEFAULT_ENTRY_FEE == 30
    assert module_0.VICTORY_MESSAGES == ['{winner} fought long and hard, and won {winnings} {currency}', '{winner} has won the FFA, and walked away with {winnings} {currency}!']

@pytest.mark.xfail(strict=True)
def test_case_2():
    int_0 = -118
    arena_0 = module_0.Arena(int_0)
    assert arena_0.entry_fee == 30
    assert arena_0.min_users == 2
    assert module_0.ARENA_WAIT_TIME == 30
    assert module_0.ARENA_DEFAULT_ENTRY_FEE == 30
    assert module_0.VICTORY_MESSAGES == ['{winner} fought long and hard, and won {winnings} {currency}', '{winner} has won the FFA, and walked away with {winnings} {currency}!']
    arena_1 = module_0.Arena(arena_0, on_arena_ended_func=int_0)
    assert arena_1.entry_fee == 30
    assert arena_1.min_users == 2
    arena_0.start()