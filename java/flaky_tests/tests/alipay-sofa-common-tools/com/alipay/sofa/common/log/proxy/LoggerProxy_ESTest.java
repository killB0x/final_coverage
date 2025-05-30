/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 20:13:02 GMT 2022
 */

package com.alipay.sofa.common.log.proxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alipay.sofa.common.log.proxy.LoggerProxy;
import com.alipay.sofa.common.log.proxy.TemporaryILoggerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LoggerProxy_ESTest extends LoggerProxy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LoggerProxy loggerProxy0 = null;
      try {
        loggerProxy0 = new LoggerProxy((TemporaryILoggerFactory.LoggerSelector) null, "S~}`4+n=Lc<9>e~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // [Assertion failed] - this argument is required; it must not be null
         //
         verifyException("com.alipay.sofa.common.utils.AssertUtil", e);
      }
  }
}
