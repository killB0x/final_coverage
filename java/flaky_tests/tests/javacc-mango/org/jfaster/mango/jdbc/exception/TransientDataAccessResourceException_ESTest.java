/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:41:27 GMT 2022
 */

package org.jfaster.mango.jdbc.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.jdbc.exception.TransientDataAccessResourceException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TransientDataAccessResourceException_ESTest extends TransientDataAccessResourceException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransientDataAccessResourceException transientDataAccessResourceException0 = new TransientDataAccessResourceException("");
      TransientDataAccessResourceException transientDataAccessResourceException1 = new TransientDataAccessResourceException("org.jfaster.mango.jdbc.exception.TransientDataAccessResourceException", transientDataAccessResourceException0);
      assertFalse(transientDataAccessResourceException1.equals((Object)transientDataAccessResourceException0));
  }
}
