/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 12:13:55 GMT 2022
 */

package jaskell.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.script.Directive;
import jaskell.script.Parameter;
import jaskell.sql.CouldHaving;
import jaskell.sql.Count;
import jaskell.sql.Delete;
import jaskell.sql.Func;
import jaskell.sql.Having;
import jaskell.sql.Name;
import jaskell.sql.Order;
import jaskell.sql.Predicate;
import jaskell.sql.Quot;
import jaskell.sql.Select;
import jaskell.sql.With;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Having_ESTest extends Having_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Name name0 = new Name();
      Class<Integer> class0 = Integer.class;
      Parameter<Integer> parameter0 = new Parameter<Integer>("", name0, class0);
      Delete.Where delete_Where0 = new Delete.Where(parameter0, name0);
      Having having0 = delete_Where0.having(name0);
      String string0 = having0.script();
      assertEquals(" where null HAVING null", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Name name0 = new Name();
      Delete.Where delete_Where0 = new Delete.Where(name0, name0);
      Having having0 = delete_Where0.having(name0);
      List<Parameter<?>> list0 = having0.parameters();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Name name0 = new Name();
      Class<Integer> class0 = Integer.class;
      Parameter<Integer> parameter0 = new Parameter<Integer>("", name0, class0);
      Delete.Where delete_Where0 = new Delete.Where(parameter0, name0);
      Having having0 = delete_Where0.having(name0);
      List<Parameter<?>> list0 = having0.parameters();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Count count0 = new Count();
      Having having0 = new Having(count0);
      Directive[] directiveArray0 = new Directive[1];
      directiveArray0[0] = (Directive) having0;
      Select select0 = new Select(directiveArray0);
      having0._by = (CouldHaving) select0;
      // Undeclared exception!
      try { 
        having0.script();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Quot quot0 = new Quot("", "", "");
      With with0 = new With(quot0);
      Func func0 = Func.min(with0);
      Directive[] directiveArray0 = new Directive[7];
      directiveArray0[0] = (Directive) quot0;
      directiveArray0[1] = (Directive) quot0;
      directiveArray0[2] = (Directive) func0;
      Func func1 = func0.args(directiveArray0);
      Delete.Where delete_Where0 = new Delete.Where(func1, func0);
      Having having0 = delete_Where0.having(func0);
      // Undeclared exception!
      try { 
        having0.parameters();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Having having0 = new Having((Predicate) null);
      // Undeclared exception!
      try { 
        having0.parameters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Having", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Name name0 = new Name();
      Class<Integer> class0 = Integer.class;
      Parameter<Integer> parameter0 = new Parameter<Integer>("", name0, class0);
      Delete.Where delete_Where0 = new Delete.Where(parameter0, name0);
      Having having0 = delete_Where0.having(name0);
      Order order0 = having0.order();
      assertNotNull(order0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Count count0 = new Count();
      Having having0 = new Having(count0);
      // Undeclared exception!
      try { 
        having0.script();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.sql.Having", e);
      }
  }
}
