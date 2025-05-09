/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 16:23:54 GMT 2022
 */

package com.mattunderscore.rated.executor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mattunderscore.executors.ITaskResultProcessor;
import com.mattunderscore.executors.ITaskWrapper;
import com.mattunderscore.executors.TaskWrapperFactory;
import com.mattunderscore.rated.executor.TaskQueue;
import java.util.concurrent.Callable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TaskQueue_ESTest extends TaskQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      // Undeclared exception!
      try { 
        taskQueue0.add((ITaskWrapper) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.LinkedBlockingQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      TaskWrapperFactory taskWrapperFactory0 = new TaskWrapperFactory();
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ITaskWrapper iTaskWrapper0 = taskWrapperFactory0.newWrapper(callable0, (ITaskResultProcessor<Object>) null);
      taskQueue0.add(iTaskWrapper0);
      taskQueue0.poll();
      boolean boolean0 = taskQueue0.isCurrentTask(iTaskWrapper0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      // Undeclared exception!
      try { 
        taskQueue0.isCurrentTask((ITaskWrapper) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mattunderscore.rated.executor.TaskQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      TaskWrapperFactory taskWrapperFactory0 = new TaskWrapperFactory();
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ITaskWrapper iTaskWrapper0 = taskWrapperFactory0.newWrapper(callable0, (ITaskResultProcessor<Object>) null);
      boolean boolean0 = taskQueue0.isCurrentTask(iTaskWrapper0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      boolean boolean0 = taskQueue0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      TaskWrapperFactory taskWrapperFactory0 = new TaskWrapperFactory();
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ITaskWrapper iTaskWrapper0 = taskWrapperFactory0.newWrapper(callable0, (ITaskResultProcessor<Object>) null);
      taskQueue0.remove(iTaskWrapper0);
      assertTrue(taskQueue0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      assertTrue(taskQueue0.isEmpty());
      
      TaskWrapperFactory taskWrapperFactory0 = new TaskWrapperFactory();
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ITaskWrapper iTaskWrapper0 = taskWrapperFactory0.newWrapper(callable0, (ITaskResultProcessor<Object>) null);
      taskQueue0.add(iTaskWrapper0);
      boolean boolean0 = taskQueue0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      ITaskWrapper iTaskWrapper0 = taskQueue0.poll();
      assertNull(iTaskWrapper0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TaskQueue taskQueue0 = new TaskQueue();
      taskQueue0.clearCurrentTask();
      assertTrue(taskQueue0.isEmpty());
  }
}
