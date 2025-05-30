/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:32:05 GMT 2022
 */

package com.hubspot.jinjava.interpret;

import org.junit.Test;
import static org.junit.Assert.*;
import com.hubspot.jinjava.interpret.DisabledException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DisabledException_ESTest extends DisabledException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DisabledException disabledException0 = new DisabledException((String) null);
      String string0 = disabledException0.getToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DisabledException disabledException0 = new DisabledException("com.hubspot.jinjava.interpret.DisabledException");
      String string0 = disabledException0.getToken();
      assertEquals("com.hubspot.jinjava.interpret.DisabledException", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DisabledException disabledException0 = new DisabledException("");
      String string0 = disabledException0.getToken();
      assertEquals("", string0);
  }
}
