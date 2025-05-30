/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 05:32:26 GMT 2022
 */

package com.dinstone.photon.connection;

import org.junit.Test;
import static org.junit.Assert.*;
import com.dinstone.photon.connection.WrappedConnectException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WrappedConnectException_ESTest extends WrappedConnectException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(435);
      MockThrowable mockThrowable0 = new MockThrowable();
      WrappedConnectException wrappedConnectException0 = new WrappedConnectException(mockInetSocketAddress0, mockThrowable0);
      Throwable throwable0 = wrappedConnectException0.fillInStackTrace();
      assertSame(throwable0, wrappedConnectException0);
  }
}
