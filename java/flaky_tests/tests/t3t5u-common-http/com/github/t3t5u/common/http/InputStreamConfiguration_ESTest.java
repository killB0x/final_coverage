/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 13:50:32 GMT 2022
 */

package com.github.t3t5u.common.http;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.t3t5u.common.http.InputStreamConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InputStreamConfiguration_ESTest extends InputStreamConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InputStreamConfiguration inputStreamConfiguration0 = new InputStreamConfiguration((InputStreamConfiguration) null);
      assertEquals(90000, inputStreamConfiguration0.getReadTimeout());
  }
}
