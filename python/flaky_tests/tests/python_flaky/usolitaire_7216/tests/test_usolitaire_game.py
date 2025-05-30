# Automatically generated by Pynguin.
import pytest
import usolitaire.game as module_0

def test_case_0():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}

def test_case_1():
    int_0 = 0
    var_0 = module_0.suit_color(int_0)
    assert var_0 == 'black'
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}

def test_case_2():
    complex_0 = (1615.308-484j)
    with pytest.raises(AssertionError):
        module_0.rank_diff(complex_0, complex_0)

def test_case_3():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.deal_from_stock()
    assert len(game_0.waste) == 1
    assert len(game_0.stock) == 23
    with pytest.raises(module_0.InvalidMove):
        game_0.move_to_foundation_from_waste()

def test_case_4():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.restore_stock()

def test_case_5():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    game_1 = module_0.Game()
    assert len(game_1.tableau) == 7
    assert len(game_1.stock) == 24
    with pytest.raises(AssertionError):
        game_1.move_from_waste_to_tableau(game_0)

def test_case_6():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    with pytest.raises(module_0.InvalidMove):
        game_0.move_tableau_pile(int_0, int_0)

def test_case_7():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.restore_stock()
    with pytest.raises(AssertionError):
        game_0.move_tableau_pile(game_0, game_0)

def test_case_8():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    with pytest.raises(module_0.InvalidMove):
        game_0.move_to_foundation_from_tableau(int_0)

def test_case_9():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    with pytest.raises(module_0.InvalidMove):
        game_0.move_to_foundation_from_waste()

def test_case_10():
    float_0 = -3057.6
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    with pytest.raises(AssertionError):
        game_0.move_to_foundation_from_tableau(float_0)

def test_case_11():
    invalid_move_0 = module_0.InvalidMove()
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    card_0 = module_0.Card(invalid_move_0, invalid_move_0)
    assert f'{type(module_0.Card.suit_symbol).__module__}.{type(module_0.Card.suit_symbol).__qualname__}' == 'builtins.property'
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    var_0 = card_0.__repr__()
    assert var_0 == 'Card(rank=InvalidMove(), suit=InvalidMove(), face_up=False)'
    bool_0 = True
    with pytest.raises(module_0.InvalidMove):
        game_0.move_tableau_pile(bool_0, int_0)

def test_case_12():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    deck_0 = module_0.Deck()
    assert len(deck_0) == 52
    assert module_0.Deck.ranks == ['A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K']
    var_0 = deck_0.__getitem__(int_0)
    assert var_0.rank == 'A'
    assert f'{type(module_0.Card.suit_symbol).__module__}.{type(module_0.Card.suit_symbol).__qualname__}' == 'builtins.property'
    with pytest.raises(module_0.InvalidMove):
        game_0.move_to_foundation_from_tableau(int_0)
    var_1 = game_0.move_tableau_pile(int_0, int_0)

def test_case_13():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = module_0.suit_color(game_0)
    assert var_0 == 'black'
    var_1 = module_0.suit_color(var_0)
    assert var_1 == 'black'
    with pytest.raises(AssertionError):
        game_0.move_tableau_pile(int_0, var_0)

def test_case_14():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    with pytest.raises(module_0.InvalidMove):
        game_0.move_from_waste_to_tableau(int_0)

@pytest.mark.xfail(strict=True)
def test_case_15():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.deal_from_stock()
    assert len(game_0.waste) == 1
    assert len(game_0.stock) == 23
    var_1 = game_0.restore_stock()
    var_1.move_to_foundation_from_waste()

def test_case_16():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.restore_stock()
    with pytest.raises(module_0.InvalidMove):
        game_0.deal_from_stock()

def test_case_17():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    game_0.move_to_foundation_from_tableau(int_0)

def test_case_18():
    str_0 = 'Q'
    var_0 = module_0.rank_diff(str_0, str_0)
    assert var_0 == 0
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}

def test_case_19():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    bool_0 = False
    bool_1 = True
    with pytest.raises(module_0.InvalidMove):
        game_0.move_tableau_pile(bool_0, bool_1)

def test_case_20():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.deal_from_stock()
    assert len(game_0.waste) == 1
    assert len(game_0.stock) == 23
    int_0 = 6
    with pytest.raises(module_0.InvalidMove):
        game_0.move_from_waste_to_tableau(int_0)

def test_case_21():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    bool_0 = True
    with pytest.raises(module_0.InvalidMove):
        game_0.move_tableau_pile(bool_0, int_0)

def test_case_22():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    bool_0 = True
    game_0.move_tableau_pile(bool_0, int_0)

def test_case_23():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    bool_0 = True
    with pytest.raises(module_0.InvalidMove):
        game_0.move_tableau_pile(bool_0, int_0)
    var_0 = bool_0.move_to_foundation_from_waste()

def test_case_24():
    str_0 = 'K'
    invalid_move_0 = module_0.InvalidMove()
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    with pytest.raises(AssertionError):
        module_0.rank_diff(str_0, invalid_move_0)

def test_case_25():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.deal_from_stock()
    assert len(game_0.waste) == 1
    assert len(game_0.stock) == 23
    int_0 = 6
    with pytest.raises(module_0.InvalidMove):
        game_0.move_from_waste_to_tableau(int_0)
    var_2 = var_1.move_tableau_pile(var_0, game_0)

def test_case_26():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.deal_from_stock()
    assert len(game_0.waste) == 1
    assert len(game_0.stock) == 23
    with pytest.raises(module_0.InvalidMove):
        game_0.move_to_foundation_from_waste()
    var_2 = var_1.move_to_foundation_from_waste()

def test_case_27():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    with pytest.raises(module_0.InvalidMove):
        var_0 = game_0.move_to_foundation_from_tableau(int_0)
    game_0.move_to_foundation_from_tableau(int_0)

def test_case_28():
    int_0 = 6
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    with pytest.raises(module_0.InvalidMove):
        game_0.move_to_foundation_from_tableau(int_0)
    var_0 = game_0.move_to_foundation_from_tableau(int_0)

def test_case_29():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.move_to_foundation_from_tableau(int_0)
    with pytest.raises(module_0.InvalidMove):
        game_0.move_from_waste_to_tableau(int_0)

def test_case_30():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    with pytest.raises(module_0.InvalidMove):
        game_0.move_to_foundation_from_tableau(int_0)
    var_0 = game_0.deal_from_stock()
    var_1 = game_0.move_to_foundation_from_waste()

def test_case_31():
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    var_0 = game_0.deal_from_stock()
    assert len(game_0.waste) == 1
    assert len(game_0.stock) == 23
    var_1 = game_0.deal_from_stock()
    assert len(game_0.stock) == 22
    game_0.move_to_foundation_from_waste()
    with pytest.raises(module_0.InvalidMove):
        var_2 = game_0.move_to_foundation_from_waste()

def test_case_32():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    bool_0 = True
    with pytest.raises(module_0.InvalidMove):
        game_0.move_to_foundation_from_tableau(int_0)
    var_0 = game_0.deal_from_stock()
    var_1 = game_0.move_tableau_pile(bool_0, int_0)

def test_case_33():
    int_0 = 0
    game_0 = module_0.Game()
    assert f'{type(game_0).__module__}.{type(game_0).__qualname__}' == 'usolitaire.game.Game'
    assert game_0.waste == []
    assert f'{type(game_0.tableau).__module__}.{type(game_0.tableau).__qualname__}' == 'builtins.list'
    assert len(game_0.tableau) == 7
    assert f'{type(game_0.stock).__module__}.{type(game_0.stock).__qualname__}' == 'builtins.list'
    assert len(game_0.stock) == 24
    assert game_0.foundations == [[], [], [], []]
    assert module_0.SUIT_SYMBOLS == {'spades': '♠', 'diamonds': '♦', 'clubs': '♣', 'hearts': '♥'}
    bool_0 = True
    with pytest.raises(module_0.InvalidMove):
        game_0.move_tableau_pile(bool_0, int_0)
    var_0 = game_0.move_tableau_pile(int_0, bool_0)