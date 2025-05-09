/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 11:29:12 GMT 2022
 */

package jaskell.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.script.Directive;
import jaskell.script.Parameter;
import jaskell.sql.Count;
import jaskell.sql.Delete;
import jaskell.sql.Func;
import jaskell.sql.Order;
import jaskell.sql.Predicate;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Order_ESTest extends Order_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        order0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Order order0 = new Order();
      Func func0 = Func.avg(order0);
      order0._prefix = (Directive) func0;
      // Undeclared exception!
      try { 
        order0.parameters();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        order0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        order0.by((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        order0.by((Directive[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        order0.by((List<Directive>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.By", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        order0.by((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.By", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Count count0 = new Count("{aG.fb??OweL*M0~|A");
      Predicate predicate0 = count0.isNull();
      Delete.Where delete_Where0 = new Delete.Where(predicate0, count0);
      Order order0 = delete_Where0.order();
      String string0 = order0.script();
      assertEquals("COUNT({aG.fb??OweL*M0~|A) IS NULL where COUNT({aG.fb??OweL*M0~|A) ORDER", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Count count0 = new Count("{aG.fb??OweL*M0~|A");
      Predicate predicate0 = count0.isNull();
      Delete.Where delete_Where0 = new Delete.Where(predicate0, count0);
      Order order0 = delete_Where0.order();
      List<Parameter<?>> list0 = order0.parameters();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Order order0 = new Order();
      LinkedList<Directive> linkedList0 = new LinkedList<Directive>();
      Order.By order_By0 = order0.by((List<Directive>) linkedList0);
      assertNotNull(order_By0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Count count0 = new Count("{aG.fb??OweL*M0~|A");
      Predicate predicate0 = count0.isNull();
      Delete.Where delete_Where0 = new Delete.Where(predicate0, count0);
      Order order0 = delete_Where0.order();
      Directive[] directiveArray0 = new Directive[4];
      Order.By order_By0 = order0.by(directiveArray0);
      assertNotNull(order_By0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Order order0 = new Order();
      String[] stringArray0 = new String[0];
      Order.By order_By0 = order0.by(stringArray0);
      assertNotNull(order_By0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Directive> linkedList0 = new LinkedList<Directive>();
      Order.By order_By0 = new Order.By(linkedList0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Order order0 = new Order();
      Order.By order_By0 = order0.by("");
      assertNotNull(order_By0);
  }
}
