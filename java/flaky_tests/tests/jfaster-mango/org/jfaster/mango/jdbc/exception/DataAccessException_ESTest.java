/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 01:34:52 GMT 2022
 */

package org.jfaster.mango.jdbc.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.jdbc.exception.DeadlockLoserDataAccessException;
import org.jfaster.mango.jdbc.exception.TransientDataAccessResourceException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DataAccessException_ESTest extends DataAccessException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransientDataAccessResourceException transientDataAccessResourceException0 = new TransientDataAccessResourceException("");
      DeadlockLoserDataAccessException deadlockLoserDataAccessException0 = new DeadlockLoserDataAccessException("", transientDataAccessResourceException0);
  }
}
