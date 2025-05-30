/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 21:44:33 GMT 2022
 */

package org.dynjs.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dynjs.exception.DynJSException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DynJSException_ESTest extends DynJSException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DynJSException dynJSException0 = new DynJSException("TkU*5=*z oB? 4k");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      DynJSException dynJSException0 = new DynJSException(mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DynJSException dynJSException0 = new DynJSException();
  }
}
