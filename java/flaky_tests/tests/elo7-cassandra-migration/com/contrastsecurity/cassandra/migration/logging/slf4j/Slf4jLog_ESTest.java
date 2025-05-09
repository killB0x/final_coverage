/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 20:48:44 GMT 2022
 */

package com.contrastsecurity.cassandra.migration.logging.slf4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.contrastsecurity.cassandra.migration.logging.slf4j.Slf4jLog;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;
import org.slf4j.Logger;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Slf4jLog_ESTest extends Slf4jLog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Slf4jLog slf4jLog0 = new Slf4jLog((Logger) null);
      // Undeclared exception!
      try { 
        slf4jLog0.warn("-_0$bMen");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contrastsecurity.cassandra.migration.logging.slf4j.Slf4jLog", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Slf4jLog slf4jLog0 = new Slf4jLog((Logger) null);
      // Undeclared exception!
      try { 
        slf4jLog0.error("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contrastsecurity.cassandra.migration.logging.slf4j.Slf4jLog", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Slf4jLog slf4jLog0 = new Slf4jLog(logger0);
      slf4jLog0.error("");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Slf4jLog slf4jLog0 = new Slf4jLog(logger0);
      slf4jLog0.warn("");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Slf4jLog slf4jLog0 = new Slf4jLog(logger0);
      MockException mockException0 = new MockException();
      slf4jLog0.error("", (Exception) mockException0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Slf4jLog slf4jLog0 = new Slf4jLog(logger0);
      slf4jLog0.debug("");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Slf4jLog slf4jLog0 = new Slf4jLog(logger0);
      slf4jLog0.info((String) null);
  }
}
