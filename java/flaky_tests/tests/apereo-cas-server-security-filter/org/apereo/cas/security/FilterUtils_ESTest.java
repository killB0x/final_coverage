/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 02:51:18 GMT 2022
 */

package org.apereo.cas.security;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.MemoryHandler;
import java.util.logging.StreamHandler;
import org.apereo.cas.security.FilterUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.util.logging.MockFileHandler;
import org.evosuite.runtime.mock.java.util.logging.MockLogRecord;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FilterUtils_ESTest extends FilterUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      StreamHandler streamHandler0 = new StreamHandler();
      MockException mockException0 = new MockException();
      FilterUtils.logException(logger0, mockException0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      Logger.getGlobal();
      StreamHandler streamHandler0 = new StreamHandler();
      FilterUtils.configureLogging((Handler) streamHandler0, logger0);
      MockThrowable mockThrowable0 = new MockThrowable("?`5%");
      MockException mockException0 = new MockException("?`5%", mockThrowable0);
      FilterUtils.logException(logger0, mockException0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Logger logger0 = null;
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        FilterUtils.configureLogging((Handler) null, (Logger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apereo.cas.security.FilterUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "sezFLgryCqr");
      Logger logger0 = Logger.getGlobal();
      FilterUtils.configureLogging((Handler) null, logger0);
      assertNull(logger0.getResourceBundleName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FilterUtils.parseStringToBooleanDefaultingToFalse("true");
      MockException mockException0 = new MockException();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConsoleHandler consoleHandler0 = new ConsoleHandler();
      Level level0 = Level.INFO;
      MemoryHandler memoryHandler0 = new MemoryHandler(consoleHandler0, 1, level0);
      Logger logger0 = Logger.getLogger("y0:B+W2C|>0:0b2=A");
      FilterUtils.configureLogging((Handler) memoryHandler0, logger0);
      FilterUtils.configureLogging((Handler) consoleHandler0, logger0);
      System.setCurrentTimeMillis(243L);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FilterUtils.logException((Logger) null, (Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apereo.cas.security.FilterUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FilterUtils.setThrowOnErrors(true);
      boolean boolean0 = FilterUtils.parseStringToBooleanDefaultingToFalse((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = null;
      FilterUtils.parseStringToBooleanDefaultingToFalse((String) null);
      MockFileHandler mockFileHandler0 = null;
      try {
        mockFileHandler0 = new MockFileHandler((String) null, 0, (-4913), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.util.logging.MockFileHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StreamHandler streamHandler0 = new StreamHandler();
      Logger logger0 = Logger.getAnonymousLogger();
      ConsoleHandler consoleHandler0 = new ConsoleHandler();
      Level level0 = consoleHandler0.getLevel();
      MockLogRecord mockLogRecord0 = new MockLogRecord(level0, "");
      mockLogRecord0.getThrown();
      logger0.logp(level0, "Disallowed character [", "Disallowed character [", "Disallowed character [", (Throwable) null);
      FilterUtils.configureLogging((Handler) streamHandler0, logger0);
      FilterUtils.setThrowOnErrors(false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConsoleHandler consoleHandler0 = new ConsoleHandler();
      Logger logger0 = Logger.getGlobal();
      FilterUtils.configureLogging((Handler) consoleHandler0, logger0);
      assertNull(consoleHandler0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConsoleHandler consoleHandler0 = new ConsoleHandler();
      Logger logger0 = Logger.getGlobal();
      FilterUtils.configureLogging((String) null, logger0);
      assertNull(logger0.getResourceBundleName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      MockThrowable mockThrowable0 = new MockThrowable("zz-|*bM(P(");
      logger0.throwing((String) null, "(+mfxiz>#", mockThrowable0);
      FilterUtils.configureLogging((String) null, logger0);
      FilterUtils.setThrowOnErrors(true);
      FilterUtils.configureLogging((String) null, logger0);
      // Undeclared exception!
      try { 
        FilterUtils.configureLogging("", logger0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apereo/cas/security/RequestParameterPolicyEnforcementFilter
         //
         verifyException("org.apereo.cas.security.FilterUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Logger logger0 = Logger.getGlobal();
      // Undeclared exception!
      try { 
        FilterUtils.configureLogging("Error parsing request parameter charactersToForbid with value [", logger0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apereo/cas/security/RequestParameterPolicyEnforcementFilter
         //
         verifyException("org.apereo.cas.security.FilterUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FilterUtils.setThrowOnErrors(false);
      boolean boolean0 = FilterUtils.parseStringToBooleanDefaultingToFalse("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FilterUtils.parseStringToBooleanDefaultingToFalse("uals(");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FilterUtils.parseStringToBooleanDefaultingToFalse("Cq@:wt]Yz5zA1qIx,g");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Logger logger0 = Logger.getLogger("false");
      MockException mockException0 = new MockException();
      // Undeclared exception!
      try { 
        FilterUtils.logException(logger0, mockException0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      MockException mockException0 = new MockException();
      // Undeclared exception!
      try { 
        FilterUtils.logException(logger0, mockException0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }
}
