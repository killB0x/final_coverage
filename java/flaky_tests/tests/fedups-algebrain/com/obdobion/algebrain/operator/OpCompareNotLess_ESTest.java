/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 08:20:54 GMT 2022
 */

package com.obdobion.algebrain.operator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.algebrain.EquPart;
import com.obdobion.algebrain.ValueStack;
import com.obdobion.algebrain.function.FuncAtan;
import com.obdobion.algebrain.operator.OpCompareNotLess;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OpCompareNotLess_ESTest extends OpCompareNotLess_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OpCompareNotLess opCompareNotLess0 = new OpCompareNotLess();
      try { 
        opCompareNotLess0.resolve((ValueStack) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.operator.OpCompareLess", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OpCompareNotLess opCompareNotLess0 = null;
      try {
        opCompareNotLess0 = new OpCompareNotLess((EquPart) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.Operator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OpCompareNotLess opCompareNotLess0 = new OpCompareNotLess();
      String string0 = opCompareNotLess0.toString();
      assertEquals("op(compare not less)", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FuncAtan funcAtan0 = new FuncAtan();
      OpCompareNotLess opCompareNotLess0 = new OpCompareNotLess(funcAtan0);
      assertTrue(opCompareNotLess0.includeInRpn());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OpCompareNotLess opCompareNotLess0 = new OpCompareNotLess();
      ValueStack valueStack0 = new ValueStack();
      try { 
        opCompareNotLess0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operands for op(compare not less)
         //
         verifyException("com.obdobion.algebrain.operator.OpCompareLess", e);
      }
  }
}
