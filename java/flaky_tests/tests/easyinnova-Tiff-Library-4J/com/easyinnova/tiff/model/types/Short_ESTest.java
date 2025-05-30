/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 08:27:06 GMT 2022
 */

package com.easyinnova.tiff.model.types;

import org.junit.Test;
import static org.junit.Assert.*;
import com.easyinnova.tiff.model.types.Short;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Short_ESTest extends Short_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Short short0 = new Short(0);
      short0.setValue((short)359);
      int int0 = short0.getValue();
      assertEquals(359, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Short short0 = new Short(0);
      int int0 = short0.getValue();
      assertEquals(0, int0);
      assertEquals(2, short0.getTypeSize());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Short short0 = new Short(0);
      String string0 = short0.toString();
      assertEquals(2, short0.getTypeSize());
      assertEquals("0", string0);
  }
}
