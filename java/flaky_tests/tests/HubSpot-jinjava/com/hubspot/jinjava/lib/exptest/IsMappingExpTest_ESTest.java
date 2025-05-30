/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 22:39:56 GMT 2022
 */

package com.hubspot.jinjava.lib.exptest;

import org.junit.Test;
import static org.junit.Assert.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.exptest.IsMappingExpTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IsMappingExpTest_ESTest extends IsMappingExpTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IsMappingExpTest isMappingExpTest0 = new IsMappingExpTest();
      Object[] objectArray0 = new Object[3];
      boolean boolean0 = isMappingExpTest0.evaluate(objectArray0[0], (JinjavaInterpreter) null, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IsMappingExpTest isMappingExpTest0 = new IsMappingExpTest();
      Object[] objectArray0 = new Object[3];
      boolean boolean0 = isMappingExpTest0.evaluateNegated("mapping", (JinjavaInterpreter) null, objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IsMappingExpTest isMappingExpTest0 = new IsMappingExpTest();
      String string0 = isMappingExpTest0.getName();
      assertEquals("mapping", string0);
  }
}
