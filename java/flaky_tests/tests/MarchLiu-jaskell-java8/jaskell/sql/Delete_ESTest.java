/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 12:26:10 GMT 2022
 */

package jaskell.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.script.Directive;
import jaskell.script.Parameter;
import jaskell.sql.Alias;
import jaskell.sql.And;
import jaskell.sql.Delete;
import jaskell.sql.Exists;
import jaskell.sql.Func;
import jaskell.sql.Having;
import jaskell.sql.Literal;
import jaskell.sql.Order;
import jaskell.sql.Predicate;
import jaskell.sql.Quot;
import jaskell.sql.Returning;
import jaskell.sql.Using;
import jaskell.sql.With;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Delete_ESTest extends Delete_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Quot quot0 = new Quot((String) null);
      Func func0 = Func.min(quot0);
      Delete.From delete_From0 = new Delete.From(func0);
      Delete.Where delete_Where0 = delete_From0.where(quot0);
      List<Parameter<?>> list0 = delete_Where0.parameters();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      With.Delete with_Delete0 = new With.Delete();
      Delete.From delete_From0 = with_Delete0.from("`dLm$gaz");
      String string0 = delete_From0.script();
      assertEquals("DELETE FROM `dLm$gaz", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Delete.From delete_From0 = new Delete.From("");
      List<Parameter<?>> list0 = delete_From0.parameters();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Delete delete0 = new Delete();
      Delete.From delete_From0 = delete0.from("|/Reh+=xj");
      String[] stringArray0 = new String[8];
      Using using0 = delete_From0.using(stringArray0);
      assertNotNull(using0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Delete.From delete_From0 = new Delete.From((String) null);
      Directive[] directiveArray0 = new Directive[6];
      Using using0 = delete_From0.using(directiveArray0);
      assertNotNull(using0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      With.Delete with_Delete0 = new With.Delete();
      Func func0 = Func.avg(with_Delete0);
      with_Delete0._prefix = (Directive) func0;
      // Undeclared exception!
      try { 
        with_Delete0.script();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      With.Delete with_Delete0 = new With.Delete();
      // Undeclared exception!
      try { 
        with_Delete0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.With$Delete", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      With.Delete with_Delete0 = new With.Delete();
      And and0 = new And();
      Having having0 = with_Delete0.having(and0);
      with_Delete0._prefix = (Directive) having0;
      // Undeclared exception!
      try { 
        with_Delete0.parameters();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      With.Delete with_Delete0 = new With.Delete();
      // Undeclared exception!
      try { 
        with_Delete0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.With$Delete", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Delete delete0 = new Delete();
      String string0 = delete0.script();
      assertEquals("DELETE", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Delete delete0 = new Delete();
      List<Parameter<?>> list0 = delete0.parameters();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Delete delete0 = new Delete();
      Delete.From delete_From0 = delete0.from("");
      Using using0 = delete_From0.using("2O10{");
      assertNotNull(using0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Delete delete0 = new Delete();
      Delete.From delete_From0 = delete0.from("%s");
      Delete.From delete_From1 = delete0.from((Directive) delete_From0);
      assertFalse(delete_From1.equals((Object)delete_From0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Order.By order_By0 = new Order.By("jaskell.sql.Delete$From");
      Quot quot0 = new Quot("/JNVf}=MT", "jaskell.sql.Delete$From", "jaskell.sql.Delete$From");
      Delete.Where delete_Where0 = new Delete.Where(order_By0, quot0);
      Returning returning0 = delete_Where0.returning("p");
      assertNotNull(returning0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Delete delete0 = new Delete();
      Delete.From delete_From0 = delete0.from("%s");
      Quot quot0 = new Quot("", "%s", "%s");
      Delete.Where delete_Where0 = new Delete.Where(delete_From0, quot0);
      Alias alias0 = delete_Where0.as("");
      assertNotNull(alias0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Delete delete0 = new Delete();
      Delete.From delete_From0 = new Delete.From(delete0);
      Exists exists0 = new Exists(delete_From0);
      Delete.Where delete_Where0 = delete_From0.where(exists0);
      Directive[] directiveArray0 = new Directive[0];
      Returning returning0 = delete_Where0.returning(directiveArray0);
      assertNotNull(returning0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Delete delete0 = new Delete();
      Delete.Where delete_Where0 = new Delete.Where(delete0, (Predicate) null);
      String[] stringArray0 = new String[0];
      Returning returning0 = delete_Where0.returning(stringArray0);
      assertNotNull(returning0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Delete delete0 = new Delete();
      Delete.From delete_From0 = new Delete.From(delete0);
      Literal literal0 = new Literal(delete0);
      Delete.Where delete_Where0 = delete_From0.where(literal0);
      delete_Where0.cache();
      assertEquals("DELETE", delete0.script());
  }
}
