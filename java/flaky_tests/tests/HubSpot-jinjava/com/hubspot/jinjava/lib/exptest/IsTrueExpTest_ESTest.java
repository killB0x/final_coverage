/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 22:48:56 GMT 2022
 */

package com.hubspot.jinjava.lib.exptest;

import org.junit.Test;
import static org.junit.Assert.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.exptest.IsTrueExpTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IsTrueExpTest_ESTest extends IsTrueExpTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IsTrueExpTest isTrueExpTest0 = new IsTrueExpTest();
      Boolean boolean0 = Boolean.FALSE;
      Object[] objectArray0 = new Object[1];
      boolean boolean1 = isTrueExpTest0.evaluate(boolean0, (JinjavaInterpreter) null, objectArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IsTrueExpTest isTrueExpTest0 = new IsTrueExpTest();
      Boolean boolean0 = Boolean.TRUE;
      Object[] objectArray0 = new Object[7];
      boolean boolean1 = isTrueExpTest0.evaluate(boolean0, (JinjavaInterpreter) null, objectArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IsTrueExpTest isTrueExpTest0 = new IsTrueExpTest();
      Object[] objectArray0 = new Object[7];
      boolean boolean0 = isTrueExpTest0.evaluate(objectArray0[3], (JinjavaInterpreter) null, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IsTrueExpTest isTrueExpTest0 = new IsTrueExpTest();
      String string0 = isTrueExpTest0.getName();
      assertEquals("true", string0);
  }
}
