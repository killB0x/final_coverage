/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 02:04:40 GMT 2022
 */

package ch.awae.netcode.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.awae.netcode.client.PromiseManager;
import java.util.concurrent.CompletableFuture;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PromiseManager_ESTest extends PromiseManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PromiseManager<Integer> promiseManager0 = new PromiseManager<Integer>();
      promiseManager0.createPromise((-1L));
      Integer integer0 = new Integer(51);
      promiseManager0.fulfill((-1L), integer0);
      Thread thread0 = MockThread.currentThread();
      assertEquals(18, thread0.countStackFrames());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PromiseManager<Object> promiseManager0 = new PromiseManager<Object>();
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        promiseManager0.fail(0L, mockThrowable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.awae.netcode.client.PromiseManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PromiseManager<Object> promiseManager0 = new PromiseManager<Object>();
      promiseManager0.nextCorrelationId();
      long long0 = 767L;
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PromiseManager<Object> promiseManager0 = new PromiseManager<Object>();
      CompletableFuture<Object> completableFuture0 = promiseManager0.createPromise(2769L);
      PromiseManager<CompletableFuture<Object>> promiseManager1 = new PromiseManager<CompletableFuture<Object>>();
      // Undeclared exception!
      try { 
        promiseManager1.fulfill(2769L, completableFuture0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ch.awae.netcode.client.PromiseManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PromiseManager<Object> promiseManager0 = new PromiseManager<Object>();
      promiseManager0.createPromise(2769L);
      MockThrowable mockThrowable0 = new MockThrowable();
      MockThrowable mockThrowable1 = new MockThrowable(mockThrowable0);
      promiseManager0.fail(2769L, mockThrowable1);
      int int0 = 0;
  }
}
