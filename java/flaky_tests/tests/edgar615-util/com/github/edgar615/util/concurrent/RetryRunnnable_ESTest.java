/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 15:04:08 GMT 2022
 */

package com.github.edgar615.util.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.edgar615.util.concurrent.RetryRunnnable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RetryRunnnable_ESTest extends RetryRunnnable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
      Class<Exception> class0 = Exception.class;
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      RetryRunnnable<Exception> retryRunnnable0 = null;
      try {
        retryRunnnable0 = new RetryRunnnable<Exception>((Runnable) null, scheduledThreadPoolExecutor0, 0, class0, 0, timeUnit0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.github.edgar615.util.concurrent.RetryRunnnable", e);
      }
  }
}
