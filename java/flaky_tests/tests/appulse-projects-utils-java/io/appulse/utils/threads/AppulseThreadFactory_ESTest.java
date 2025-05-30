/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 05:45:38 GMT 2022
 */

package io.appulse.utils.threads;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.appulse.utils.threads.AppulseThreadFactory;
import java.util.concurrent.ThreadFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AppulseThreadFactory_ESTest extends AppulseThreadFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = AppulseThreadFactory.builder();
      Boolean boolean0 = Boolean.valueOf(true);
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder1 = appulseThreadFactory_AppulseThreadFactoryBuilder0.daemon(boolean0);
      ThreadGroup threadGroup0 = (ThreadGroup)MockThread.getDefaultUncaughtExceptionHandler();
      AppulseThreadFactory appulseThreadFactory0 = appulseThreadFactory_AppulseThreadFactoryBuilder1.build();
      MockThread mockThread0 = new MockThread(threadGroup0, "");
      Thread thread0 = appulseThreadFactory0.newThread(mockThread0);
      assertTrue(thread0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = AppulseThreadFactory.builder();
      Thread thread0 = MockThread.currentThread();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      doReturn("AppulseThreadFactory.AppulseThreadFactoryBuilder(name=").when(threadFactory0).toString();
      doReturn(thread0).when(threadFactory0).newThread(any(java.lang.Runnable.class));
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder1 = appulseThreadFactory_AppulseThreadFactoryBuilder0.parent(threadFactory0);
      AppulseThreadFactory appulseThreadFactory0 = appulseThreadFactory_AppulseThreadFactoryBuilder1.build();
      Thread thread1 = appulseThreadFactory0.newThread(thread0);
      assertFalse(thread1.isDaemon());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = AppulseThreadFactory.builder();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(threadFactory0).toString();
      doReturn((Thread) null).when(threadFactory0).newThread(any(java.lang.Runnable.class));
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder1 = appulseThreadFactory_AppulseThreadFactoryBuilder0.parent(threadFactory0);
      AppulseThreadFactory appulseThreadFactory0 = appulseThreadFactory_AppulseThreadFactoryBuilder1.build();
      MockThread mockThread0 = new MockThread();
      // Undeclared exception!
      try { 
        appulseThreadFactory0.newThread(mockThread0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.appulse.utils.threads.AppulseThreadFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = AppulseThreadFactory.builder();
      Thread thread0 = MockThread.currentThread();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      doReturn("AppulseThreadFactory.AppulseThreadFactoryBuilder(name=").when(threadFactory0).toString();
      doReturn(thread0).when(threadFactory0).newThread(any(java.lang.Runnable.class));
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder1 = appulseThreadFactory_AppulseThreadFactoryBuilder0.parent(threadFactory0);
      AppulseThreadFactory appulseThreadFactory0 = appulseThreadFactory_AppulseThreadFactoryBuilder1.build();
      MockThread mockThread0 = new MockThread();
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = mockThread0.getUncaughtExceptionHandler();
      AppulseThreadFactory appulseThreadFactory1 = new AppulseThreadFactory("AppulseThreadFactory.AppulseThreadFactoryBuilder(name=", boolean0, (Integer) null, appulseThreadFactory0, thread_UncaughtExceptionHandler0);
      // Undeclared exception!
      try { 
        appulseThreadFactory1.newThread(mockThread0);
        fail("Expecting exception: IllegalThreadStateException");
      
      } catch(IllegalThreadStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = AppulseThreadFactory.builder();
      Boolean boolean0 = Boolean.valueOf(true);
      Integer integer0 = new Integer(0);
      AppulseThreadFactory appulseThreadFactory0 = appulseThreadFactory_AppulseThreadFactoryBuilder0.build();
      ThreadGroup threadGroup0 = (ThreadGroup)MockThread.getDefaultUncaughtExceptionHandler();
      AppulseThreadFactory appulseThreadFactory1 = new AppulseThreadFactory(", parent=", boolean0, integer0, appulseThreadFactory0, threadGroup0);
      MockThread mockThread0 = new MockThread(threadGroup0, ", parent=");
      // Undeclared exception!
      try { 
        appulseThreadFactory1.newThread(mockThread0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = AppulseThreadFactory.builder();
      AppulseThreadFactory appulseThreadFactory0 = appulseThreadFactory_AppulseThreadFactoryBuilder0.build();
      // Undeclared exception!
      try { 
        appulseThreadFactory0.newThread((Runnable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // runnable is marked non-null but is null
         //
         verifyException("io.appulse.utils.threads.AppulseThreadFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = new AppulseThreadFactory.AppulseThreadFactoryBuilder();
      String string0 = appulseThreadFactory_AppulseThreadFactoryBuilder0.toString();
      assertEquals("AppulseThreadFactory.AppulseThreadFactoryBuilder(name=null, daemon=null, priority=null, parent=null, uncaughtExceptionHandler=null)", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = AppulseThreadFactory.builder();
      Integer integer0 = new Integer((-1));
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder1 = appulseThreadFactory_AppulseThreadFactoryBuilder0.priority(integer0);
      assertSame(appulseThreadFactory_AppulseThreadFactoryBuilder0, appulseThreadFactory_AppulseThreadFactoryBuilder1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = AppulseThreadFactory.builder();
      appulseThreadFactory_AppulseThreadFactoryBuilder0.name("%d");
      AppulseThreadFactory appulseThreadFactory0 = appulseThreadFactory_AppulseThreadFactoryBuilder0.build();
      ThreadGroup threadGroup0 = (ThreadGroup)MockThread.getDefaultUncaughtExceptionHandler();
      MockThread mockThread0 = new MockThread(threadGroup0, ", parent=");
      Thread thread0 = appulseThreadFactory0.newThread(mockThread0);
      assertEquals(0, thread0.countStackFrames());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder0 = new AppulseThreadFactory.AppulseThreadFactoryBuilder();
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = MockThread.getDefaultUncaughtExceptionHandler();
      AppulseThreadFactory.AppulseThreadFactoryBuilder appulseThreadFactory_AppulseThreadFactoryBuilder1 = appulseThreadFactory_AppulseThreadFactoryBuilder0.uncaughtExceptionHandler(thread_UncaughtExceptionHandler0);
      assertSame(appulseThreadFactory_AppulseThreadFactoryBuilder0, appulseThreadFactory_AppulseThreadFactoryBuilder1);
  }
}
