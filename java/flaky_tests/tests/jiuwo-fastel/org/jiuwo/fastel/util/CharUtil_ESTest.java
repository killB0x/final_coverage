/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 02:05:09 GMT 2022
 */

package org.jiuwo.fastel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jiuwo.fastel.util.CharUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharUtil_ESTest extends CharUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char char0 = CharUtil.sbc2Dbc(']');
      assertEquals(']', char0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char char0 = CharUtil.sbc2Dbc('6');
      assertEquals('6', char0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char char0 = CharUtil.sbc2Dbc('Z');
      assertEquals('Z', char0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharUtil charUtil0 = new CharUtil();
  }
}
