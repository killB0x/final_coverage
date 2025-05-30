/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 16:19:38 GMT 2022
 */

package com.mattunderscore.rated.executor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mattunderscore.executors.ITaskWrapper;
import com.mattunderscore.executors.TaskWrapperFactory;
import com.mattunderscore.rated.executor.RatedExecutorThreadFactory;
import com.mattunderscore.rated.executor.ScheduledInternalExecutor;
import com.mattunderscore.rated.executor.TaskQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ScheduledInternalExecutor_ESTest extends ScheduledInternalExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      RatedExecutorThreadFactory ratedExecutorThreadFactory0 = new RatedExecutorThreadFactory();
      TaskWrapperFactory taskWrapperFactory0 = new TaskWrapperFactory();
      ITaskWrapper iTaskWrapper0 = taskWrapperFactory0.newWrapper((Callable<Object>) null);
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      ScheduledInternalExecutor scheduledInternalExecutor0 = new ScheduledInternalExecutor(taskQueue0, (-1L), timeUnit0, ratedExecutorThreadFactory0);
      // Undeclared exception!
      try { 
        scheduledInternalExecutor0.submit(iTaskWrapper0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ScheduledThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      RatedExecutorThreadFactory ratedExecutorThreadFactory0 = new RatedExecutorThreadFactory();
      ScheduledInternalExecutor scheduledInternalExecutor0 = new ScheduledInternalExecutor((TaskQueue) null, (-2525L), timeUnit0, ratedExecutorThreadFactory0);
      // Undeclared exception!
      try { 
        scheduledInternalExecutor0.requestStop();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mattunderscore.rated.executor.ScheduledInternalExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      ScheduledInternalExecutor scheduledInternalExecutor0 = null;
      try {
        scheduledInternalExecutor0 = new ScheduledInternalExecutor(taskQueue0, (-3784L), timeUnit0, (ThreadFactory) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      RatedExecutorThreadFactory ratedExecutorThreadFactory0 = new RatedExecutorThreadFactory();
      ScheduledInternalExecutor scheduledInternalExecutor0 = new ScheduledInternalExecutor(taskQueue0, 0L, timeUnit0, ratedExecutorThreadFactory0);
      scheduledInternalExecutor0.stop();
      assertFalse(scheduledInternalExecutor0.interrupt());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      TaskWrapperFactory taskWrapperFactory0 = new TaskWrapperFactory();
      MockThread mockThread0 = new MockThread((Runnable) null, "");
      ITaskWrapper iTaskWrapper0 = taskWrapperFactory0.newWrapper((Runnable) mockThread0);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      RatedExecutorThreadFactory ratedExecutorThreadFactory0 = new RatedExecutorThreadFactory();
      ScheduledInternalExecutor scheduledInternalExecutor0 = new ScheduledInternalExecutor(taskQueue0, 5488L, timeUnit0, ratedExecutorThreadFactory0);
      scheduledInternalExecutor0.submit(iTaskWrapper0);
      scheduledInternalExecutor0.stop();
      assertFalse(scheduledInternalExecutor0.interrupt());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      RatedExecutorThreadFactory ratedExecutorThreadFactory0 = new RatedExecutorThreadFactory();
      TaskWrapperFactory taskWrapperFactory0 = new TaskWrapperFactory();
      ITaskWrapper iTaskWrapper0 = taskWrapperFactory0.newWrapper((Callable<Object>) null);
      taskQueue0.add(iTaskWrapper0);
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      ScheduledInternalExecutor scheduledInternalExecutor0 = new ScheduledInternalExecutor(taskQueue0, 0L, timeUnit0, ratedExecutorThreadFactory0);
      scheduledInternalExecutor0.requestStop();
      assertFalse(scheduledInternalExecutor0.interrupt());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      RatedExecutorThreadFactory ratedExecutorThreadFactory0 = new RatedExecutorThreadFactory();
      ScheduledInternalExecutor scheduledInternalExecutor0 = new ScheduledInternalExecutor(taskQueue0, 1L, timeUnit0, ratedExecutorThreadFactory0);
      TaskWrapperFactory taskWrapperFactory0 = new TaskWrapperFactory();
      ITaskWrapper iTaskWrapper0 = taskWrapperFactory0.newWrapper((Callable<Object>) null);
      scheduledInternalExecutor0.submit(iTaskWrapper0);
      scheduledInternalExecutor0.submit(iTaskWrapper0);
      assertFalse(scheduledInternalExecutor0.interrupt());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      RatedExecutorThreadFactory ratedExecutorThreadFactory0 = new RatedExecutorThreadFactory();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      ScheduledInternalExecutor scheduledInternalExecutor0 = new ScheduledInternalExecutor(taskQueue0, 987L, timeUnit0, ratedExecutorThreadFactory0);
      scheduledInternalExecutor0.requestStop();
      // Undeclared exception!
      try { 
        scheduledInternalExecutor0.submit((ITaskWrapper) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.LinkedBlockingQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      RatedExecutorThreadFactory ratedExecutorThreadFactory0 = new RatedExecutorThreadFactory();
      ScheduledInternalExecutor scheduledInternalExecutor0 = new ScheduledInternalExecutor(taskQueue0, 2298L, timeUnit0, ratedExecutorThreadFactory0);
      boolean boolean0 = scheduledInternalExecutor0.interrupt();
      assertFalse(boolean0);
  }
}
