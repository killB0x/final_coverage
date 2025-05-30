/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:11:39 GMT 2022
 */

package net.named_data.jndn.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.named_data.jndn.impl.DelayedCallTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DelayedCallTable_ESTest extends DelayedCallTable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DelayedCallTable delayedCallTable0 = new DelayedCallTable();
      MockThread mockThread0 = new MockThread("net.named_data.jndn.impl.DelayedCallTable");
      delayedCallTable0.callLater((-2899.217938), mockThread0);
      delayedCallTable0.callLater((-1182.74019), mockThread0);
      //  // Unstable assertion: assertFalse(mockThread0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DelayedCallTable delayedCallTable0 = new DelayedCallTable();
      MockThread mockThread0 = new MockThread("net.named_data.jndn.impl.DelayedCallTable");
      delayedCallTable0.callLater(0.0, mockThread0);
      delayedCallTable0.callLater((-1182.74019), mockThread0);
      delayedCallTable0.callLater((-1182.74019), mockThread0);
      assertEquals(0, mockThread0.countStackFrames());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DelayedCallTable delayedCallTable0 = new DelayedCallTable();
      delayedCallTable0.setNowOffsetMilliseconds_(301.75329989373);
      delayedCallTable0.callLater(212.4750241703, (Runnable) null);
      // Undeclared exception!
      try { 
        delayedCallTable0.callTimedOut();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.impl.DelayedCallTable$Entry", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DelayedCallTable delayedCallTable0 = new DelayedCallTable();
      MockThread mockThread0 = new MockThread();
      delayedCallTable0.callLater(1.0, mockThread0);
      delayedCallTable0.callTimedOut();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DelayedCallTable delayedCallTable0 = new DelayedCallTable();
      MockThread mockThread0 = new MockThread();
      delayedCallTable0.callLater(0.0, mockThread0);
      delayedCallTable0.callTimedOut();
  }
}
