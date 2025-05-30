/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 03:09:31 GMT 2022
 */

package org.jiucai.appframework.common.thread;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.jiucai.appframework.common.thread.TaskThreadFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TaskThreadFactory_ESTest extends TaskThreadFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TaskThreadFactory taskThreadFactory0 = new TaskThreadFactory();
      Thread thread0 = MockThread.currentThread();
      Thread thread1 = taskThreadFactory0.newThread(thread0);
      assertEquals(0, thread1.countStackFrames());
  }
}
