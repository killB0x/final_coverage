/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 07:35:33 GMT 2022
 */

package org.jdbcdslog;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdbcdslog.LogMetaData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LogMetaData_ESTest extends LogMetaData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LogMetaData logMetaData0 = LogMetaData.create();
      String string0 = logMetaData0.getConnectionId();
      assertEquals("1", string0);
  }
}
