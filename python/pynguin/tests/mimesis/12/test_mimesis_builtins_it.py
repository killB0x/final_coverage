# Automatically generated by Pynguin.
import mimesis.builtins.it as module_0
import mimesis.enums as module_1


def test_case_0():
    italy_spec_provider_0 = module_0.ItalySpecProvider()
    italy_spec_provider_1 = module_0.ItalySpecProvider()
    gender_0 = module_1.Gender.FEMALE
    str_0 = italy_spec_provider_1.fiscal_code(gender_0)
    str_1 = italy_spec_provider_1.fiscal_code(gender_0)


def test_case_1():
    italy_spec_provider_0 = module_0.ItalySpecProvider()
    str_0 = italy_spec_provider_0.fiscal_code()


def test_case_2():
    italy_spec_provider_0 = module_0.ItalySpecProvider()
