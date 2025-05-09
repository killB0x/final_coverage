/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 23 03:37:26 GMT 2022
 */

package io.teknek.datalayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.teknek.datalayer.WorkerDaoException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WorkerDaoException_ESTest extends WorkerDaoException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WorkerDaoException workerDaoException0 = new WorkerDaoException((Throwable) null);
      WorkerDaoException workerDaoException1 = new WorkerDaoException("", workerDaoException0);
      assertFalse(workerDaoException1.equals((Object)workerDaoException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WorkerDaoException workerDaoException0 = new WorkerDaoException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WorkerDaoException workerDaoException0 = new WorkerDaoException("TCvsC)");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      WorkerDaoException workerDaoException0 = new WorkerDaoException("f%_", mockThrowable0, true, true);
      WorkerDaoException workerDaoException1 = null;
      try {
        workerDaoException1 = new WorkerDaoException(")E%W", workerDaoException0, true, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockException", e);
      }
  }
}
