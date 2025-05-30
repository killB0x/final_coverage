/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 20:02:08 GMT 2022
 */

package com.alipay.sofa.common.thread;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alipay.sofa.common.thread.ExecutingRunnable;
import com.alipay.sofa.common.thread.NamedThreadFactory;
import com.alipay.sofa.common.thread.SofaThreadPoolExecutor;
import com.alipay.sofa.common.thread.TimeWaitRejectedExecutionHandler;
import com.alipay.sofa.common.utils.TimeWaitRunner;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeWaitRejectedExecutionHandler_ESTest extends TimeWaitRejectedExecutionHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SynchronousQueue<Runnable> synchronousQueue0 = new SynchronousQueue<Runnable>();
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      NamedThreadFactory namedThreadFactory0 = new NamedThreadFactory("");
      ThreadGroup threadGroup0 = namedThreadFactory0.group;
      MockThread mockThread0 = new MockThread("J(^4]dTz<V|v)$uh*");
      MockThread mockThread1 = new MockThread(threadGroup0, mockThread0, "({#f!:earW2+gB:zH!");
      namedThreadFactory0.newThread(mockThread1);
      MockThread mockThread2 = new MockThread(mockThread1, "");
      MockThread mockThread3 = new MockThread(threadGroup0, mockThread2, "u d", 853);
      MockThread mockThread4 = new MockThread(threadGroup0, mockThread1, "");
      mockThread1.getContextClassLoader();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(525, 853, 525, timeUnit0, synchronousQueue0, namedThreadFactory0, threadPoolExecutor_DiscardOldestPolicy0, "");
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, 188L, timeUnit1);
      timeWaitRejectedExecutionHandler0.rejectedExecution(mockThread1, sofaThreadPoolExecutor0);
      timeWaitRejectedExecutionHandler0.getDelegate();
      RejectedExecutionHandler rejectedExecutionHandler0 = timeWaitRejectedExecutionHandler0.getDelegate();
      TimeWaitRunner timeWaitRunner0 = new TimeWaitRunner(1563L);
      timeWaitRejectedExecutionHandler0.setTimeWaitRunner(timeWaitRunner0);
      TimeUnit timeUnit2 = TimeUnit.MINUTES;
      LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>();
      TimeUnit timeUnit3 = TimeUnit.DAYS;
      SofaThreadPoolExecutor sofaThreadPoolExecutor1 = new SofaThreadPoolExecutor(853, 2669, 2669, timeUnit2, linkedBlockingQueue0, namedThreadFactory0, rejectedExecutionHandler0, "", 1563L, 1L, timeUnit3);
      timeWaitRejectedExecutionHandler0.rejectedExecution(mockThread1, sofaThreadPoolExecutor1);
      timeWaitRejectedExecutionHandler0.getDelegate();
      System.setCurrentTimeMillis(525);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      LinkedBlockingDeque<Runnable> linkedBlockingDeque0 = new LinkedBlockingDeque<Runnable>();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(1, 1, 1, timeUnit0, linkedBlockingDeque0, "", (String) null);
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, 1, timeUnit0);
      MockThread mockThread0 = new MockThread("");
      RejectedExecutionHandler rejectedExecutionHandler0 = timeWaitRejectedExecutionHandler0.getDelegate();
      timeWaitRejectedExecutionHandler0.setDelegate(rejectedExecutionHandler0);
      timeWaitRejectedExecutionHandler0.setDelegate(rejectedExecutionHandler0);
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler1 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, (-13L), timeUnit0);
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      timeWaitRejectedExecutionHandler1.setDelegate(threadPoolExecutor_DiscardPolicy0);
      long long0 = 652L;
      TimeUnit timeUnit1 = TimeUnit.MINUTES;
      NamedThreadFactory namedThreadFactory0 = new NamedThreadFactory("", true);
      SofaThreadPoolExecutor sofaThreadPoolExecutor1 = null;
      try {
        sofaThreadPoolExecutor1 = new SofaThreadPoolExecutor(1, 1, 652L, timeUnit1, linkedBlockingDeque0, namedThreadFactory0, (RejectedExecutionHandler) null, (String) null, "4k;?a )RiAsO@&|5~7{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      NamedThreadFactory namedThreadFactory0 = new NamedThreadFactory("*~I+SW!XtEjA^>LT\"S", false);
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(0, 2610, 0, timeUnit0, linkedTransferQueue0, namedThreadFactory0, threadPoolExecutor_DiscardPolicy0, "log");
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, 2610, timeUnit0);
      timeWaitRejectedExecutionHandler0.setDelegate(threadPoolExecutor_DiscardPolicy0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      LinkedBlockingDeque<Runnable> linkedBlockingDeque0 = new LinkedBlockingDeque<Runnable>();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(32, 1359, 32, timeUnit0, linkedBlockingDeque0);
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, 32, timeUnit0);
      timeWaitRejectedExecutionHandler0.setThreadPoolExecutor(sofaThreadPoolExecutor0);
      NamedThreadFactory namedThreadFactory0 = new NamedThreadFactory((String) null, false);
      ThreadGroup threadGroup0 = namedThreadFactory0.group;
      MockThread mockThread0 = null;
      try {
        mockThread0 = new MockThread((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name cannot be null
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      SynchronousQueue<Runnable> synchronousQueue0 = new SynchronousQueue<Runnable>();
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(853, 853, 853, timeUnit0, synchronousQueue0, threadPoolExecutor_CallerRunsPolicy0);
      TimeUnit timeUnit1 = TimeUnit.DAYS;
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, 955L, timeUnit1);
      timeWaitRejectedExecutionHandler0.setThreadPoolExecutor(sofaThreadPoolExecutor0);
      assertEquals("SofaThreadPoolExecutor0000001e", sofaThreadPoolExecutor0.getThreadPoolName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      SynchronousQueue<Runnable> synchronousQueue0 = new SynchronousQueue<Runnable>();
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(853, 853, 853, timeUnit0, synchronousQueue0, threadPoolExecutor_CallerRunsPolicy0);
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, 853, timeUnit0);
      MockThread mockThread0 = new MockThread((Runnable) null);
      synchronousQueue0.peek();
      timeWaitRejectedExecutionHandler0.setDelegate(threadPoolExecutor_CallerRunsPolicy0);
      timeWaitRejectedExecutionHandler0.setThreadPoolExecutor(sofaThreadPoolExecutor0);
      timeWaitRejectedExecutionHandler0.getDelegate();
      assertEquals("SofaThreadPoolExecutor0000001c", sofaThreadPoolExecutor0.getThreadPoolName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      SynchronousQueue<Runnable> synchronousQueue0 = new SynchronousQueue<Runnable>();
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(853, 853, 853, timeUnit0, synchronousQueue0, threadPoolExecutor_CallerRunsPolicy0);
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, 853, timeUnit0);
      MockThread mockThread0 = new MockThread((Runnable) null);
      ExecutingRunnable executingRunnable0 = new ExecutingRunnable(mockThread0);
      Thread thread0 = executingRunnable0.thread;
      // Undeclared exception!
      try { 
        timeWaitRejectedExecutionHandler0.rejectedExecution((Runnable) null, sofaThreadPoolExecutor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      LinkedBlockingDeque<Runnable> linkedBlockingDeque0 = new LinkedBlockingDeque<Runnable>();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(1, 1, 1, timeUnit0, linkedBlockingDeque0, "", (String) null);
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, 1, timeUnit0);
      MockThread mockThread0 = new MockThread("");
      MockThread mockThread1 = new MockThread((ThreadGroup) null, mockThread0, "sofa.middleware.log.%s.console.level", 0L);
      ExecutingRunnable executingRunnable0 = new ExecutingRunnable(mockThread1);
      // Undeclared exception!
      try { 
        timeWaitRejectedExecutionHandler0.rejectedExecution(executingRunnable0, sofaThreadPoolExecutor0);
        fail("Expecting exception: RejectedExecutionException");
      
      } catch(RejectedExecutionException e) {
         //
         // Task org.evosuite.runtime.mock.java.lang.MockThread@0000000010 rejected from com.alipay.sofa.common.thread.SofaThreadPoolExecutor@22681081[Running, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor$AbortPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      SynchronousQueue<Runnable> synchronousQueue0 = new SynchronousQueue<Runnable>();
      NamedThreadFactory namedThreadFactory0 = new NamedThreadFactory("uSb", true);
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(890, 890, 890, timeUnit0, synchronousQueue0, namedThreadFactory0, threadPoolExecutor_DiscardOldestPolicy0, "uSb", "uSb", 890, 1677L, timeUnit0);
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, (-1L), timeUnit0);
      TimeWaitRunner timeWaitRunner0 = new TimeWaitRunner(0L, true);
      timeWaitRejectedExecutionHandler0.setTimeWaitRunner(timeWaitRunner0);
      MockThread.currentThread();
      SofaThreadPoolExecutor sofaThreadPoolExecutor1 = null;
      try {
        sofaThreadPoolExecutor1 = new SofaThreadPoolExecutor(4978, 0, 0L, timeUnit0, synchronousQueue0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = null;
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = null;
      try {
        timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler((SofaThreadPoolExecutor) null, 472L, timeUnit0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alipay.sofa.common.thread.TimeWaitRejectedExecutionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>();
      SofaThreadPoolExecutor sofaThreadPoolExecutor0 = new SofaThreadPoolExecutor(4, 4, 0L, timeUnit0, linkedBlockingQueue0);
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      TimeWaitRejectedExecutionHandler timeWaitRejectedExecutionHandler0 = new TimeWaitRejectedExecutionHandler(sofaThreadPoolExecutor0, (-523L), timeUnit1);
      assertEquals("SofaThreadPoolExecutor00000000", sofaThreadPoolExecutor0.getThreadPoolName());
  }
}
