/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 20:51:37 GMT 2022
 */

package com.contrastsecurity.cassandra.migration.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import com.contrastsecurity.cassandra.migration.utils.TimeFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeFormat_ESTest extends TimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = TimeFormat.format((-3952L));
      assertEquals("00:-3.-952s", string0);
  }
}
