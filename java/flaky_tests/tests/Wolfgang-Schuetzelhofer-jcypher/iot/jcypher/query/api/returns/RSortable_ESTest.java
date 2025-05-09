/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:47:34 GMT 2022
 */

package iot.jcypher.query.api.returns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.query.api.returns.RSortable;
import iot.jcypher.query.ast.returns.ReturnExpression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RSortable_ESTest extends RSortable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReturnExpression returnExpression0 = new ReturnExpression();
      RSortable rSortable0 = new RSortable(returnExpression0);
      RSortable rSortable1 = rSortable0.ORDER_BY_DESC("ye.wh'3i#68~JvXc");
      assertSame(rSortable1, rSortable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RSortable rSortable0 = new RSortable((ReturnExpression) null);
      // Undeclared exception!
      try { 
        rSortable0.ORDER_BY("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.api.returns.RSortable", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReturnExpression returnExpression0 = new ReturnExpression();
      RSortable rSortable0 = new RSortable(returnExpression0);
      RSortable rSortable1 = rSortable0.ORDER_BY("J2Q9&p]}g");
      assertSame(rSortable0, rSortable1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RSortable rSortable0 = new RSortable((ReturnExpression) null);
      // Undeclared exception!
      try { 
        rSortable0.ORDER_BY_DESC("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.api.returns.RSortable", e);
      }
  }
}
