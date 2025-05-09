/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 08:27:46 GMT 2022
 */

package com.easyinnova.tiff.model.types;

import org.junit.Test;
import static org.junit.Assert.*;
import com.easyinnova.tiff.model.types.SLong;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SLong_ESTest extends SLong_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SLong sLong0 = new SLong(0);
      int int0 = sLong0.getValue();
      assertEquals(4, sLong0.getTypeSize());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SLong sLong0 = new SLong((-2925));
      String string0 = sLong0.toString();
      assertEquals(4, sLong0.getTypeSize());
      assertEquals("-2925", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SLong sLong0 = new SLong((-359));
      int int0 = sLong0.getValue();
      assertEquals(4, sLong0.getTypeSize());
      assertEquals((-359), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SLong sLong0 = new SLong((-2925));
      sLong0.setValue(1);
      int int0 = sLong0.getValue();
      assertEquals(1, int0);
  }
}
