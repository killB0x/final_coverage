/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 03:58:51 GMT 2022
 */

package org.dnal.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dnal.core.util.NameUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NameUtils_ESTest extends NameUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = NameUtils.completeName("T/B)w{-=q.,#tyF", "");
      assertEquals("T/B)w{-=q.,#tyF.", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = NameUtils.completeName("", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = NameUtils.isNullOrEmpty("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = NameUtils.isNullOrEmpty((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      boolean boolean0 = NameUtils.isNullOrEmpty("V{m~V");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = NameUtils.completeName("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NameUtils nameUtils0 = new NameUtils();
  }
}
