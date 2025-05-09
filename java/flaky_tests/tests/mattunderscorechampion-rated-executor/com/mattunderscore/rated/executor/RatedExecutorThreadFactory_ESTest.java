/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 16:32:39 GMT 2022
 */

package com.mattunderscore.rated.executor;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mattunderscore.rated.executor.RatedExecutorThreadFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RatedExecutorThreadFactory_ESTest extends RatedExecutorThreadFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RatedExecutorThreadFactory ratedExecutorThreadFactory0 = new RatedExecutorThreadFactory();
      Thread thread0 = MockThread.currentThread();
      Thread thread1 = ratedExecutorThreadFactory0.newThread(thread0);
      assertEquals(0, thread1.countStackFrames());
  }
}
