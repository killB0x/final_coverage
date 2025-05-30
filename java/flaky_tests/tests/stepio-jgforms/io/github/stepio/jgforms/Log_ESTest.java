/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 04:13:20 GMT 2022
 */

package io.github.stepio.jgforms;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.stepio.jgforms.Log;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Log_ESTest extends Log_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.getLogger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.getLogger((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.stepio.jgforms.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Log log0 = Log.getLogger(class0);
      MockThrowable mockThrowable0 = new MockThrowable("-7eK(c*HsO9c3Jo");
      // Undeclared exception!
      try { 
        log0.error("", mockThrowable0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Log log0 = Log.getLogger("+");
      assertNotNull(log0);
  }
}
