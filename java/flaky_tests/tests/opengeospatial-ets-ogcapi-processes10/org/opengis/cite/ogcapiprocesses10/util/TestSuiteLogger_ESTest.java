/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 22:16:08 GMT 2022
 */

package org.opengis.cite.ogcapiprocesses10.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.logging.Level;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.opengis.cite.ogcapiprocesses10.util.TestSuiteLogger;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TestSuiteLogger_ESTest extends TestSuiteLogger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Level level0 = Level.INFO;
      boolean boolean0 = TestSuiteLogger.isLoggable(level0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Level level0 = Level.CONFIG;
      boolean boolean0 = TestSuiteLogger.isLoggable(level0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        TestSuiteLogger.log((Level) null, "", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.logging.Logger", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockException mockException0 = new MockException();
      // Undeclared exception!
      try { 
        TestSuiteLogger.log((Level) null, "ALL", (Exception) mockException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.logging.Logger", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        TestSuiteLogger.log((Level) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.logging.Logger", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Level level0 = Level.SEVERE;
      // Undeclared exception!
      try { 
        TestSuiteLogger.log(level0, "sZ 0t$?oM(3)qRk");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Level level0 = Level.CONFIG;
      TestSuiteLogger.log(level0, "4\">:Ll!ZB5edY>[4)@<");
      assertEquals("CONFIG", level0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Level level0 = Level.INFO;
      MockThrowable mockThrowable0 = new MockThrowable("");
      MockException mockException0 = new MockException("", mockThrowable0);
      // Undeclared exception!
      try { 
        TestSuiteLogger.log(level0, "", (Exception) mockException0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Level level0 = Level.FINER;
      MockException mockException0 = new MockException("");
      TestSuiteLogger.log(level0, "0Z) %fi?s/Rox", (Exception) mockException0);
      assertEquals("FINER", level0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Level level0 = Level.INFO;
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        TestSuiteLogger.log(level0, "", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Level level0 = Level.FINER;
      Object[] objectArray0 = new Object[1];
      TestSuiteLogger.log(level0, "5", objectArray0);
      assertEquals("FINER", level0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        TestSuiteLogger.isLoggable((Level) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.logging.Logger", e);
      }
  }
}
