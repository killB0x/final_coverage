/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 09:54:49 GMT 2022
 */

package org.nlab.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.nlab.exception.UncheckedExecutionException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UncheckedExecutionException_ESTest extends UncheckedExecutionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      UncheckedExecutionException uncheckedExecutionException0 = new UncheckedExecutionException(mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UncheckedExecutionException uncheckedExecutionException0 = new UncheckedExecutionException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UncheckedExecutionException uncheckedExecutionException0 = new UncheckedExecutionException("");
      UncheckedExecutionException uncheckedExecutionException1 = new UncheckedExecutionException((String) null, uncheckedExecutionException0);
      assertFalse(uncheckedExecutionException1.equals((Object)uncheckedExecutionException0));
  }
}
