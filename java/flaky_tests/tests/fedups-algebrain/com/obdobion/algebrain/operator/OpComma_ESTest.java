/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 08:24:19 GMT 2022
 */

package com.obdobion.algebrain.operator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.algebrain.ValueStack;
import com.obdobion.algebrain.function.FuncRadsToDegrees;
import com.obdobion.algebrain.operator.OpComma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OpComma_ESTest extends OpComma_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OpComma opComma0 = new OpComma();
      String string0 = opComma0.toString();
      assertEquals("op(comma)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FuncRadsToDegrees funcRadsToDegrees0 = new FuncRadsToDegrees();
      OpComma opComma0 = new OpComma(funcRadsToDegrees0);
      int int0 = opComma0.precedence();
      assertEquals(999, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OpComma opComma0 = new OpComma();
      boolean boolean0 = opComma0.includeInRpn();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OpComma opComma0 = new OpComma();
      try { 
        opComma0.resolve((ValueStack) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // WHAT! op(comma)
         //
         verifyException("com.obdobion.algebrain.operator.OpComma", e);
      }
  }
}
