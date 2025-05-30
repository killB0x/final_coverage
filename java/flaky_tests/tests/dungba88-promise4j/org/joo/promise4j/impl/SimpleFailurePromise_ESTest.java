/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 15:48:02 GMT 2022
 */

package org.joo.promise4j.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Delayed;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.joo.promise4j.AlwaysCallback;
import org.joo.promise4j.DeferredStatus;
import org.joo.promise4j.DoneCallback;
import org.joo.promise4j.FailCallback;
import org.joo.promise4j.Promise;
import org.joo.promise4j.impl.SimpleFailurePromise;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleFailurePromise_ESTest extends SimpleFailurePromise_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      SimpleFailurePromise<Object, Throwable> simpleFailurePromise0 = new SimpleFailurePromise<Object, Throwable>(mockThrowable0);
      DeferredStatus deferredStatus0 = simpleFailurePromise0.getStatus();
      assertEquals(DeferredStatus.REJECTED, deferredStatus0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      SimpleFailurePromise<Object, Throwable> simpleFailurePromise0 = new SimpleFailurePromise<Object, Throwable>(mockThrowable0);
      FailCallback<Throwable> failCallback0 = (FailCallback<Throwable>) mock(FailCallback.class, new ViolatedAssumptionAnswer());
      Promise<Object, Throwable> promise0 = simpleFailurePromise0.fail(failCallback0);
      assertNotNull(promise0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      SimpleFailurePromise<Delayed, Throwable> simpleFailurePromise0 = new SimpleFailurePromise<Delayed, Throwable>(mockThrowable0);
      Promise<Delayed, Throwable> promise0 = simpleFailurePromise0.done((DoneCallback<Delayed>) null);
      assertNotNull(promise0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("e=FV%.fZVJ");
      SimpleFailurePromise<Object, Throwable> simpleFailurePromise0 = new SimpleFailurePromise<Object, Throwable>(mockThrowable0);
      // Undeclared exception!
      try { 
        simpleFailurePromise0.fail((FailCallback<Throwable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joo.promise4j.impl.AbstractPromise", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      SimpleFailurePromise<Object, Throwable> simpleFailurePromise0 = new SimpleFailurePromise<Object, Throwable>(mockThrowable0);
      // Undeclared exception!
      try { 
        simpleFailurePromise0.always((AlwaysCallback<Object, Throwable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joo.promise4j.impl.AbstractPromise", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      SimpleFailurePromise<Throwable, Throwable> simpleFailurePromise0 = new SimpleFailurePromise<Throwable, Throwable>(mockThrowable0);
      try { 
        simpleFailurePromise0.get();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: 
         //
         verifyException("org.joo.promise4j.impl.SimpleFailurePromise", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      SimpleFailurePromise<ForkJoinTask<Object>, Throwable> simpleFailurePromise0 = new SimpleFailurePromise<ForkJoinTask<Object>, Throwable>(mockThrowable0);
      try { 
        simpleFailurePromise0.get((-1824L), timeUnit0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable
         //
         verifyException("org.joo.promise4j.impl.SimpleFailurePromise", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      MockFileWriter mockFileWriter0 = new MockFileWriter("U'o");
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      SimpleFailurePromise<ForkJoinTask<Object>, Throwable> simpleFailurePromise0 = new SimpleFailurePromise<ForkJoinTask<Object>, Throwable>(mockThrowable0);
      simpleFailurePromise0.timeoutAfter(800L, timeUnit0, (Supplier<Throwable>) null);
      SimpleFailurePromise<Throwable, Throwable> simpleFailurePromise1 = new SimpleFailurePromise<Throwable, Throwable>(mockThrowable0);
      assertEquals(DeferredStatus.REJECTED, simpleFailurePromise1.getStatus());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      SimpleFailurePromise<Object, Throwable> simpleFailurePromise0 = new SimpleFailurePromise<Object, Throwable>(mockThrowable0);
      AlwaysCallback<Object, Throwable> alwaysCallback0 = (AlwaysCallback<Object, Throwable>) mock(AlwaysCallback.class, new ViolatedAssumptionAnswer());
      Promise<Object, Throwable> promise0 = simpleFailurePromise0.always(alwaysCallback0);
      assertNotNull(promise0);
  }
}
