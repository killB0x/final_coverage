/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 16:28:44 GMT 2022
 */

package com.mattunderscore.executors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mattunderscore.executors.RunnableWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RunnableWrapper_ESTest extends RunnableWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RunnableWrapper runnableWrapper0 = new RunnableWrapper((Runnable) null);
      // Undeclared exception!
      try { 
        runnableWrapper0.call();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mattunderscore.executors.RunnableWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThread mockThread0 = new MockThread("{,.#}2`0s)bjg=$r9:");
      RunnableWrapper runnableWrapper0 = new RunnableWrapper(mockThread0);
      boolean boolean0 = runnableWrapper0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThread mockThread0 = new MockThread("{,.#}2`0s)bjg=$r9:");
      RunnableWrapper runnableWrapper0 = new RunnableWrapper(mockThread0);
      runnableWrapper0.hashCode();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockThread mockThread0 = new MockThread("{,.#}2`0s)bjg=$r9:");
      RunnableWrapper runnableWrapper0 = new RunnableWrapper(mockThread0);
      runnableWrapper0.call();
  }
}
