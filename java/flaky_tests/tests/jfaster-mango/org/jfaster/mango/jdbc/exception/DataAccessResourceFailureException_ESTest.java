/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 01:32:18 GMT 2022
 */

package org.jfaster.mango.jdbc.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.jfaster.mango.jdbc.exception.DataAccessResourceFailureException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DataAccessResourceFailureException_ESTest extends DataAccessResourceFailureException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataAccessResourceFailureException dataAccessResourceFailureException0 = new DataAccessResourceFailureException("<v Y5w\u0001");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      DataAccessResourceFailureException dataAccessResourceFailureException0 = new DataAccessResourceFailureException("", mockThrowable0);
  }
}
