/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 03:51:31 GMT 2022
 */

package net.goldolphin.cate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import net.goldolphin.cate.CollectTask;
import net.goldolphin.cate.ContextAction;
import net.goldolphin.cate.ContextCollectTask;
import net.goldolphin.cate.Environment;
import net.goldolphin.cate.Func1;
import net.goldolphin.cate.Func1Task;
import net.goldolphin.cate.IContinuation;
import net.goldolphin.cate.IScheduler;
import net.goldolphin.cate.ITask;
import net.goldolphin.cate.Task;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CollectTask_ESTest extends CollectTask_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Func1<Integer, Integer> func1_0 = (Func1<Integer, Integer>) mock(Func1.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(func1_0).apply(anyInt());
      Func1Task<Integer, Integer> func1Task0 = new Func1Task<Integer, Integer>(func1_0);
      IContinuation iContinuation0 = IContinuation.END_CONTINUATION;
      IContinuation iContinuation1 = func1Task0.buildContinuation(iContinuation0);
      CollectTask.IndexContinuation collectTask_IndexContinuation0 = new CollectTask.IndexContinuation(1, iContinuation1);
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Thread) null).when(threadFactory0).newThread(any(java.lang.Runnable.class));
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(3503, threadFactory0);
      MockThread mockThread0 = new MockThread();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      ScheduledFuture<?> scheduledFuture0 = scheduledThreadPoolExecutor0.scheduleWithFixedDelay(mockThread0, 1, 3503, timeUnit0);
      Environment environment0 = Environment.empty();
      collectTask_IndexContinuation0.apply(scheduledFuture0, environment0, (IScheduler) null);
      assertTrue(environment0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CollectTask.Counter collectTask_Counter0 = new CollectTask.Counter(172);
      CollectTask.Result collectTask_Result0 = new CollectTask.Result(0, (Object) null);
      collectTask_Counter0.record(collectTask_Result0);
      assertEquals(1, collectTask_Counter0.getComplete());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContextAction<CollectTask.Result, ForkJoinPool> contextAction0 = (ContextAction<CollectTask.Result, ForkJoinPool>) mock(ContextAction.class, new ViolatedAssumptionAnswer());
      ITask<Integer, ForkJoinPool>[] iTaskArray0 = (ITask<Integer, ForkJoinPool>[]) Array.newInstance(ITask.class, 3);
      CollectTask<Integer, ForkJoinPool> collectTask0 = Task.when((ContextAction<CollectTask.Result, ForkJoinPool>) contextAction0, (ITask<Integer, ?>[]) iTaskArray0);
      ITask<Integer, ?>[] iTaskArray1 = collectTask0.getTasks();
      assertEquals(3, iTaskArray1.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ITask<ForkJoinPool, Integer>[] iTaskArray0 = (ITask<ForkJoinPool, Integer>[]) Array.newInstance(ITask.class, 0);
      CollectTask<ForkJoinPool, Integer> collectTask0 = Task.when((ContextAction<CollectTask.Result, Integer>) null, (ITask<ForkJoinPool, ?>[]) iTaskArray0);
      ITask<ForkJoinPool, ?>[] iTaskArray1 = collectTask0.getTasks();
      assertEquals(0, iTaskArray1.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CollectTask.Counter collectTask_Counter0 = new CollectTask.Counter(0);
      CollectTask.Result collectTask_Result0 = new CollectTask.Result(0, (Object) null);
      // Undeclared exception!
      try { 
        collectTask_Counter0.record(collectTask_Result0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalid complete value: 1 exceeds 0
         //
         verifyException("net.goldolphin.cate.CollectTask$Counter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ContextAction<CollectTask.Result, ITask<Integer, Integer>> contextAction0 = (ContextAction<CollectTask.Result, ITask<Integer, Integer>>) mock(ContextAction.class, new ViolatedAssumptionAnswer());
      ContextCollectTask<Integer, ITask<Integer, Integer>> contextCollectTask0 = new ContextCollectTask<Integer, ITask<Integer, Integer>>(contextAction0, (ITask<Integer, ?>[]) null);
      ITask<Integer, ?>[] iTaskArray0 = contextCollectTask0.getTasks();
      assertNull(iTaskArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CollectTask.Counter collectTask_Counter0 = new CollectTask.Counter(2583);
      int int0 = collectTask_Counter0.getComplete();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CollectTask.Counter collectTask_Counter0 = new CollectTask.Counter(172);
      Object[] objectArray0 = collectTask_Counter0.getResults();
      assertEquals(172, objectArray0.length);
      assertEquals(0, collectTask_Counter0.getComplete());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CollectTask.Counter collectTask_Counter0 = new CollectTask.Counter(1);
      Object object0 = new Object();
      CollectTask.Result collectTask_Result0 = new CollectTask.Result(1, object0);
      // Undeclared exception!
      try { 
        collectTask_Counter0.record(collectTask_Result0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("net.goldolphin.cate.CollectTask$Counter", e);
      }
  }
}
