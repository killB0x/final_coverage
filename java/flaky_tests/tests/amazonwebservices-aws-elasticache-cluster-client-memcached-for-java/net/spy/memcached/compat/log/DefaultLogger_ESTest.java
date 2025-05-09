/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 13:50:32 GMT 2022
 */

package net.spy.memcached.compat.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.spy.memcached.compat.log.DefaultLogger;
import net.spy.memcached.compat.log.Level;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultLogger_ESTest extends DefaultLogger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger("ESz*?`Zr%gK.xO");
      Level level0 = Level.FATAL;
      Object object0 = new Object();
      MockThrowable mockThrowable0 = new MockThrowable("ESz*?`Zr%gK.xO");
      mockThrowable0.setOriginForDelegate((StackTraceElement) null);
      // Undeclared exception!
      try { 
        defaultLogger0.log(level0, object0, (Throwable) mockThrowable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockThrowable", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultLogger defaultLogger0 = null;
      try {
        defaultLogger0 = new DefaultLogger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Logger name may not be null.
         //
         verifyException("net.spy.memcached.compat.log.AbstractLogger", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger("");
      defaultLogger0.fatal((Object) defaultLogger0, (Throwable) null);
      assertFalse(defaultLogger0.isDebugEnabled());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger("");
      Object[] objectArray0 = new Object[4];
      defaultLogger0.error("", objectArray0);
      assertTrue(defaultLogger0.isInfoEnabled());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger("");
      Object object0 = new Object();
      MockThrowable mockThrowable0 = new MockThrowable();
      defaultLogger0.trace(object0, (Throwable) mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger("");
      Level level0 = Level.WARN;
      Object object0 = new Object();
      MockThrowable mockThrowable0 = new MockThrowable();
      defaultLogger0.log(level0, object0, (Throwable) mockThrowable0);
      assertEquals("", defaultLogger0.getName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger("");
      Object object0 = new Object();
      defaultLogger0.info(object0);
      assertFalse(defaultLogger0.isTraceEnabled());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger("");
      boolean boolean0 = defaultLogger0.isDebugEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger("");
      boolean boolean0 = defaultLogger0.isTraceEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DefaultLogger defaultLogger0 = new DefaultLogger("mo4+zY,c|{mz]o7");
      boolean boolean0 = defaultLogger0.isInfoEnabled();
      assertTrue(boolean0);
  }
}
