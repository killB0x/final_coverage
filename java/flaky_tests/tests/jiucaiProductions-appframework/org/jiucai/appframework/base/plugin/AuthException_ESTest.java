/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 03:25:08 GMT 2022
 */

package org.jiucai.appframework.base.plugin;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jiucai.appframework.base.plugin.AuthException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AuthException_ESTest extends AuthException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AuthException authException0 = new AuthException();
  }
}
