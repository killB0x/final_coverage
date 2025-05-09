/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 05:20:35 GMT 2022
 */

package heros.solver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import heros.solver.CountingThreadPoolExecutor;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CountingThreadPoolExecutor_ESTest extends CountingThreadPoolExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      CountingThreadPoolExecutor countingThreadPoolExecutor0 = new CountingThreadPoolExecutor(250, 250, 250, timeUnit0, linkedTransferQueue0);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, (Runnable) null);
      MockThrowable mockThrowable0 = new MockThrowable();
      countingThreadPoolExecutor0.afterExecute(mockThread0, mockThrowable0);
      countingThreadPoolExecutor0.getException();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      CountingThreadPoolExecutor countingThreadPoolExecutor0 = new CountingThreadPoolExecutor(250, 250, 250, timeUnit0, linkedTransferQueue0);
      MockThread mockThread0 = new MockThread("qlz(::Z^*<X");
      MockThrowable mockThrowable0 = new MockThrowable("heros.util.SootThreadGroup");
      countingThreadPoolExecutor0.afterExecute(mockThread0, mockThrowable0);
      // Undeclared exception!
      try { 
        countingThreadPoolExecutor0.execute(mockThread0);
        fail("Expecting exception: RejectedExecutionException");
      
      } catch(RejectedExecutionException e) {
         //
         // Task Thread[qlz(::Z^*<X,5,Test_Execution_Group] rejected from heros.solver.CountingThreadPoolExecutor@13d0e144[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor$AbortPolicy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      CountingThreadPoolExecutor countingThreadPoolExecutor0 = new CountingThreadPoolExecutor(250, 250, 250, timeUnit0, linkedTransferQueue0);
      // Undeclared exception!
      try { 
        countingThreadPoolExecutor0.execute((Runnable) null);
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
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CountingThreadPoolExecutor countingThreadPoolExecutor0 = null;
      try {
        countingThreadPoolExecutor0 = new CountingThreadPoolExecutor(4605, 1, 4605, timeUnit0, linkedTransferQueue0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      SynchronousQueue<Runnable> synchronousQueue0 = new SynchronousQueue<Runnable>();
      CountingThreadPoolExecutor countingThreadPoolExecutor0 = new CountingThreadPoolExecutor(0, 1763, 0, timeUnit0, synchronousQueue0);
      MockThread mockThread0 = new MockThread("");
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      countingThreadPoolExecutor0.afterExecute(mockThread0, mockThrowable0);
      countingThreadPoolExecutor0.afterExecute(mockThread0, (Throwable) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      SynchronousQueue<Runnable> synchronousQueue0 = new SynchronousQueue<Runnable>();
      CountingThreadPoolExecutor countingThreadPoolExecutor0 = new CountingThreadPoolExecutor(0, 1763, 0, timeUnit0, synchronousQueue0);
      countingThreadPoolExecutor0.getException();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      SynchronousQueue<MockThread> synchronousQueue0 = new SynchronousQueue<MockThread>();
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>(synchronousQueue0);
      CountingThreadPoolExecutor countingThreadPoolExecutor0 = new CountingThreadPoolExecutor(1601, 1601, 1601, timeUnit0, linkedTransferQueue0);
      countingThreadPoolExecutor0.awaitCompletion(0L, timeUnit0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      CountingThreadPoolExecutor countingThreadPoolExecutor0 = new CountingThreadPoolExecutor(250, 250, 250, timeUnit0, linkedTransferQueue0);
      MockThread mockThread0 = new MockThread("qlz(::Z^*<X");
      countingThreadPoolExecutor0.execute(mockThread0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      CountingThreadPoolExecutor countingThreadPoolExecutor0 = new CountingThreadPoolExecutor(250, 250, 250, timeUnit0, linkedTransferQueue0);
      countingThreadPoolExecutor0.awaitCompletion();
  }
}
