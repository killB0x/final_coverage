/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 08:10:54 GMT 2022
 */

package com.obdobion.algebrain.operator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.algebrain.EquPart;
import com.obdobion.algebrain.ValueStack;
import com.obdobion.algebrain.function.FuncStringEmpty;
import com.obdobion.algebrain.operator.OpCompareEqual;
import com.obdobion.algebrain.operator.OpCompareNotEqual;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OpCompareEqual_ESTest extends OpCompareEqual_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FuncStringEmpty funcStringEmpty0 = new FuncStringEmpty();
      OpCompareEqual opCompareEqual0 = new OpCompareEqual(funcStringEmpty0);
      assertEquals("op(compare equal)", opCompareEqual0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OpCompareEqual opCompareEqual0 = new OpCompareEqual();
      ValueStack valueStack0 = new ValueStack();
      valueStack0.setSize(399);
      try { 
        opCompareEqual0.resolve(valueStack0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.ValueStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OpCompareEqual opCompareEqual0 = null;
      try {
        opCompareEqual0 = new OpCompareEqual((EquPart) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.Operator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OpCompareEqual opCompareEqual0 = new OpCompareEqual();
      ValueStack valueStack0 = new ValueStack();
      try { 
        opCompareEqual0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operands for op(compare equal)
         //
         verifyException("com.obdobion.algebrain.operator.OpCompareEqual", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OpCompareNotEqual opCompareNotEqual0 = new OpCompareNotEqual();
      ValueStack valueStack0 = new ValueStack();
      Object object0 = new Object();
      valueStack0.add(object0);
      valueStack0.add(object0);
      opCompareNotEqual0.resolve(valueStack0);
      valueStack0.add(object0);
      try { 
        opCompareNotEqual0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // op(compare not equal); invalid type: Boolean
         //
         verifyException("com.obdobion.algebrain.operator.OpCompareEqual", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OpCompareNotEqual opCompareNotEqual0 = new OpCompareNotEqual();
      int int0 = opCompareNotEqual0.precedence();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OpCompareEqual opCompareEqual0 = new OpCompareEqual();
      String string0 = opCompareEqual0.toString();
      assertEquals("op(compare equal)", string0);
  }
}
