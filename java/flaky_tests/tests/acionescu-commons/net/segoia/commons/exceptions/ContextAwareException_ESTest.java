/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:13:04 GMT 2022
 */

package net.segoia.commons.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.segoia.commons.exceptions.ContextAwareException;
import net.segoia.commons.exceptions.ExceptionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ContextAwareException_ESTest extends ContextAwareException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException("i.-=B-9UWo:", "");
      assertEquals(2, ContextAwareException.WARNING);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException((String) null);
      String string0 = contextAwareException0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException("");
      String string0 = contextAwareException0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      ContextAwareException contextAwareException0 = new ContextAwareException(mockThrowable0);
      int int0 = contextAwareException0.getLevel();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException((String) null, (-883));
      int int0 = contextAwareException0.getLevel();
      assertEquals((-883), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      ContextAwareException contextAwareException0 = new ContextAwareException(mockThrowable0);
      String string0 = contextAwareException0.createMessage();
      assertEquals("UNKNOWN_ERROR", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException("net.segoia.commons.exceptions.ContextAwareException", 0);
      ContextAwareException contextAwareException1 = contextAwareException0.addExceptionParameter("", "net.segoia.commons.exceptions.ContextAwareException");
      assertEquals(3, ContextAwareException.ERROR);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      ContextAwareException contextAwareException0 = new ContextAwareException(mockThrowable0);
      ExceptionContext exceptionContext0 = new ExceptionContext();
      contextAwareException0.exceptionContext = exceptionContext0;
      Object object0 = new Object();
      ContextAwareException contextAwareException1 = contextAwareException0.addExceptionParameter("k ", object0);
      ExceptionContext exceptionContext1 = contextAwareException1.getExceptionContext();
      assertSame(exceptionContext1, exceptionContext0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException("_oU1)PMUZ", (-2506));
      ContextAwareException contextAwareException1 = contextAwareException0.addExceptionParameter("_oU1)PMUZ", (Object) null);
      assertSame(contextAwareException1, contextAwareException0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException((String) null);
      // Undeclared exception!
      try { 
        contextAwareException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException((String) null);
      // Undeclared exception!
      try { 
        contextAwareException0.createMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      ContextAwareException contextAwareException0 = new ContextAwareException(mockThrowable0);
      String string0 = contextAwareException0.getMessage();
      assertEquals("UNKNOWN_ERROR", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException("UNKNOWN_ERROR", 0);
      contextAwareException0.getMessage();
      String string0 = contextAwareException0.getMessage();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      ContextAwareException contextAwareException0 = new ContextAwareException(mockThrowable0);
      ContextAwareException contextAwareException1 = new ContextAwareException("?aC|C<{yo =/;.~c8o", contextAwareException0);
      assertFalse(contextAwareException1.equals((Object)contextAwareException0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException("", "");
      String string0 = contextAwareException0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      ExceptionContext exceptionContext0 = new ExceptionContext();
      ContextAwareException contextAwareException0 = new ContextAwareException("T^:", mockThrowable0, exceptionContext0);
      ContextAwareException contextAwareException1 = new ContextAwareException("k,'_M4BD", contextAwareException0);
      ExceptionContext exceptionContext1 = contextAwareException1.getExceptionContext();
      assertNull(exceptionContext1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException("UNKNOWN_ERROR", 0);
      ExceptionContext exceptionContext0 = contextAwareException0.getExceptionContext();
      assertEquals(0, exceptionContext0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException("UNKNOWN_ERROR", 0);
      int int0 = contextAwareException0.getLevel();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      ContextAwareException contextAwareException0 = new ContextAwareException(mockThrowable0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        contextAwareException0.addExceptionParameter("k ", object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.segoia.commons.exceptions.ContextAwareException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExceptionContext exceptionContext0 = new ExceptionContext();
      ContextAwareException contextAwareException0 = new ContextAwareException("", exceptionContext0);
      ContextAwareException contextAwareException1 = new ContextAwareException("", contextAwareException0);
      String string0 = contextAwareException1.createMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ContextAwareException contextAwareException0 = new ContextAwareException("UNKNOWN_ERROR", 0);
      String string0 = contextAwareException0.getType();
      assertEquals("UNKNOWN_ERROR", string0);
  }
}
