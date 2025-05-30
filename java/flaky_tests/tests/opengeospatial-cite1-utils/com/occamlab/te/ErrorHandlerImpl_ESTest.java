/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 08:01:45 GMT 2022
 */

package com.occamlab.te;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.occamlab.te.ErrorHandlerImpl;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.LocatorImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ErrorHandlerImpl_ESTest extends ErrorHandlerImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("<moSXv69_(=j`X<-");
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl("<moSXv69_(=j`X<-", mockPrintWriter0);
      assertEquals(0, errorHandlerImpl0.getErrorCount());
      assertEquals(0, errorHandlerImpl0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      SAXParseException sAXParseException0 = new SAXParseException("", (Locator) null);
      errorHandlerImpl0.warning(sAXParseException0);
      int int0 = errorHandlerImpl0.getWarningCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      SAXParseException sAXParseException0 = new SAXParseException("", (Locator) null);
      errorHandlerImpl0.error(sAXParseException0);
      int int0 = errorHandlerImpl0.getErrorCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      // Undeclared exception!
      try { 
        errorHandlerImpl0.warning((SAXParseException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.occamlab.te.ErrorHandlerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      Locator2Impl locator2Impl0 = new Locator2Impl();
      SAXParseException sAXParseException0 = new SAXParseException((String) null, locator2Impl0);
      SAXParseException sAXParseException1 = new SAXParseException((String) null, locator2Impl0, sAXParseException0);
      sAXParseException0.initCause(sAXParseException1);
      // Undeclared exception!
      try { 
        errorHandlerImpl0.fatalError(sAXParseException0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      Locator2Impl locator2Impl0 = new Locator2Impl();
      SAXParseException sAXParseException0 = new SAXParseException((String) null, locator2Impl0);
      SAXParseException sAXParseException1 = new SAXParseException((String) null, (String) null, (String) null, 1, 1, sAXParseException0);
      sAXParseException0.initCause(sAXParseException1);
      // Undeclared exception!
      try { 
        errorHandlerImpl0.error(sAXParseException0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      errorHandlerImpl0.setRole((String) null);
      assertEquals(0, errorHandlerImpl0.getErrorCount());
      assertEquals(0, errorHandlerImpl0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      errorHandlerImpl0.setLogger((PrintWriter) null);
      assertEquals(0, errorHandlerImpl0.getErrorCount());
      assertEquals(0, errorHandlerImpl0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      SAXParseException sAXParseException0 = new SAXParseException((String) null, (Locator) null);
      errorHandlerImpl0.fatalError(sAXParseException0);
      assertEquals(1, errorHandlerImpl0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      SAXParseException sAXParseException0 = new SAXParseException("", "", "", 1, 1);
      errorHandlerImpl0.warning(sAXParseException0);
      assertEquals(1, errorHandlerImpl0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      SAXParseException sAXParseException0 = new SAXParseException((String) null, (String) null, (String) null, 1096, (-765));
      errorHandlerImpl0.warning(sAXParseException0);
      assertEquals(1, errorHandlerImpl0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      SAXParseException sAXParseException0 = new SAXParseException("", "", "", (-3810), (-3810));
      errorHandlerImpl0.warning(sAXParseException0);
      errorHandlerImpl0.warning(sAXParseException0);
      errorHandlerImpl0.getErrorCounts();
      assertEquals(2, errorHandlerImpl0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      LocatorImpl locatorImpl0 = new LocatorImpl();
      SAXParseException sAXParseException0 = new SAXParseException("^'?+B- o2Cv_>[", locatorImpl0);
      errorHandlerImpl0.warning(sAXParseException0);
      errorHandlerImpl0.fatalError(sAXParseException0);
      errorHandlerImpl0.getErrorCounts();
      assertEquals(1, errorHandlerImpl0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      Locator2Impl locator2Impl0 = new Locator2Impl();
      SAXParseException sAXParseException0 = new SAXParseException("^5\"/6`sf", locator2Impl0);
      errorHandlerImpl0.fatalError(sAXParseException0);
      errorHandlerImpl0.error(sAXParseException0);
      errorHandlerImpl0.getErrorCounts();
      assertEquals(2, errorHandlerImpl0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      String string0 = errorHandlerImpl0.getErrorCounts();
      assertEquals("No errors or warnings detected.", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      errorHandlerImpl0.setRole("");
      assertEquals(0, errorHandlerImpl0.getErrorCount());
      assertEquals(0, errorHandlerImpl0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      // Undeclared exception!
      try { 
        errorHandlerImpl0.fatalError((SAXParseException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.occamlab.te.ErrorHandlerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      int int0 = errorHandlerImpl0.getWarningCount();
      assertEquals(0, errorHandlerImpl0.getErrorCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      // Undeclared exception!
      try { 
        errorHandlerImpl0.error((SAXParseException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.occamlab.te.ErrorHandlerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ErrorHandlerImpl errorHandlerImpl0 = new ErrorHandlerImpl();
      int int0 = errorHandlerImpl0.getErrorCount();
      assertEquals(0, errorHandlerImpl0.getWarningCount());
      assertEquals(0, int0);
  }
}
