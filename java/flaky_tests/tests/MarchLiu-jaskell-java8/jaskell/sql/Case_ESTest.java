/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 10:32:59 GMT 2022
 */

package jaskell.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.script.Directive;
import jaskell.script.Parameter;
import jaskell.sql.And;
import jaskell.sql.Brackets;
import jaskell.sql.Case;
import jaskell.sql.Literal;
import jaskell.sql.Name;
import jaskell.sql.Predicate;
import jaskell.sql.Quot;
import jaskell.sql.Sum;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Case_ESTest extends Case_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Case.End case_End0 = new Case.End();
      Quot quot0 = new Quot("", "k7Z$D{nR(p8HlZuIrfN", "");
      Case.Alias case_Alias0 = case_End0.as((Name) quot0);
      Case.When case_When0 = new Case.When(case_Alias0);
      Case.Then case_Then0 = case_When0.then(quot0);
      assertNotNull(case_Then0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Name name0 = new Name((String) null);
      Case.When case_When0 = new Case.When(name0);
      case_When0._prefix = (Directive) name0;
      Case.Then case_Then0 = case_When0.then(name0);
      Case.When case_When1 = case_Then0.when(name0);
      List<Parameter<?>> list0 = case_When1.parameters();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Case case0 = new Case();
      Case.When case_When0 = new Case.When(case0);
      Sum sum0 = new Sum("");
      Predicate predicate0 = sum0.or((Predicate) sum0);
      case_When0._prefix = (Directive) predicate0;
      String string0 = case_When0.script();
      assertEquals("SUM() OR SUM() WHEN CASE", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Name name0 = new Name((String) null);
      Case.When case_When0 = new Case.When(name0);
      case_When0._prefix = (Directive) name0;
      Case.Then case_Then0 = case_When0.then(name0);
      String string0 = case_Then0.script();
      assertEquals("null WHEN null THEN null", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Name name0 = new Name((String) null);
      Case.When case_When0 = new Case.When(name0);
      case_When0._prefix = (Directive) name0;
      Case.Then case_Then0 = case_When0.then(name0);
      Case.Else case_Else0 = case_Then0._else(case_When0._prefix);
      List<Parameter<?>> list0 = case_Else0.parameters();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Name name0 = new Name((String) null);
      Case.When case_When0 = new Case.When(name0);
      case_When0._prefix = (Directive) name0;
      Case.Then case_Then0 = case_When0.then(name0);
      Case.Else case_Else0 = case_Then0._else(case_When0._prefix);
      Case.End case_End0 = case_Else0.end();
      Case.Alias case_Alias0 = case_End0.as("");
      String string0 = case_Alias0.script();
      assertEquals("null WHEN null THEN null ELSE null END AS ", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Literal literal0 = new Literal(0);
      Integer integer0 = new Integer(0);
      Predicate predicate0 = literal0.lte(integer0);
      Case.Then case_Then0 = new Case.Then(predicate0);
      // Undeclared exception!
      try { 
        case_Then0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Case$Then", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Brackets brackets0 = new Brackets();
      Case.Else case_Else0 = new Case.Else(brackets0);
      Case.End case_End0 = case_Else0.end();
      // Undeclared exception!
      try { 
        case_End0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Case$Else", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Case.End case_End0 = new Case.End();
      // Undeclared exception!
      try { 
        case_End0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Case$End", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Case.Alias case_Alias0 = new Case.Alias("");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Name name0 = new Name((String) null);
      Case.When case_When0 = new Case.When(name0);
      case_When0._prefix = (Directive) name0;
      Case.Then case_Then0 = case_When0.then(name0);
      Case.Else case_Else0 = case_Then0._else(case_When0._prefix);
      Case.End case_End0 = case_Else0.end();
      Case.Alias case_Alias0 = case_End0.as("");
      List<Parameter<?>> list0 = case_Alias0.parameters();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Case case0 = new Case();
      Literal literal0 = new Literal(case0);
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Parameter<Object> parameter0 = new Parameter<Object>("OdW}|HqcATs.FL", object0, class0);
      Predicate predicate0 = literal0.gt((Object) parameter0);
      case0._argument = (Directive) predicate0;
      List<Parameter<?>> list0 = case0.parameters();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Case case0 = new Case();
      String string0 = case0.script();
      assertEquals("CASE", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Case case0 = new Case();
      Case.Then case_Then0 = new Case.Then(case0);
      Case.Else case_Else0 = case_Then0._else(case0);
      case0._argument = (Directive) case_Else0;
      // Undeclared exception!
      try { 
        case0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Case$Then", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Case case0 = new Case();
      List<Parameter<?>> list0 = case0.parameters();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Case case0 = new Case();
      Case.Else case_Else0 = new Case.Else(case0);
      case_Else0._prefix = (Directive) case0;
      String string0 = case_Else0.script();
      assertEquals("CASE ELSE CASE", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sum sum0 = new Sum();
      Case.Then case_Then0 = new Case.Then(sum0);
      Case.End case_End0 = case_Then0.end();
      Name name0 = new Name();
      Case.Alias case_Alias0 = case_End0.as(name0);
      assertNotNull(case_Alias0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Literal literal0 = new Literal(0L);
      Case.Alias case_Alias0 = new Case.Alias(literal0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Name name0 = new Name((String) null);
      Case.When case_When0 = new Case.When(name0);
      Case.Then case_Then0 = case_When0.then(name0);
      Case.Else case_Else0 = case_Then0._else(case_When0._prefix);
      Case.End case_End0 = case_Else0.end();
      Case.Alias case_Alias0 = case_End0.as("");
      // Undeclared exception!
      try { 
        case_Alias0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Case$When", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      And and0 = new And();
      Case case0 = new Case(and0);
      // Undeclared exception!
      try { 
        case0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Binary", e);
      }
  }
}
