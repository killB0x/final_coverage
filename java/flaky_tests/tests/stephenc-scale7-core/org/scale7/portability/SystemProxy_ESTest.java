/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 11:18:44 GMT 2022
 */

package org.scale7.portability;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.scale7.portability.ILoggerFactory;
import org.scale7.portability.SystemProxy;
import org.slf4j.Logger;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SystemProxy_ESTest extends SystemProxy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ILoggerFactory iLoggerFactory0 = mock(ILoggerFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Logger) null).when(iLoggerFactory0).getLogger(any(java.lang.Class.class));
      SystemProxy.setLoggerFactory(iLoggerFactory0);
      Logger logger0 = SystemProxy.getLoggerFromFactory(class0);
      assertNull(logger0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemProxy.getLoggerFromFactory((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.slf4j.LoggerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SystemProxy systemProxy0 = new SystemProxy();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Logger logger0 = SystemProxy.getLoggerFromFactory(class0);
      assertNotNull(logger0);
  }
}
