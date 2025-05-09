/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 09:24:37 GMT 2022
 */

package com.mxw.crypto;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mxw.crypto.SecureRandomUtils;
import java.security.SecureRandom;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SecureRandomUtils_ESTest extends SecureRandomUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SecureRandomUtils.isAndroidRuntime();
      boolean boolean0 = SecureRandomUtils.isAndroidRuntime();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SecureRandom secureRandom0 = SecureRandomUtils.secureRandom();
      assertNotNull(secureRandom0);
  }
}
