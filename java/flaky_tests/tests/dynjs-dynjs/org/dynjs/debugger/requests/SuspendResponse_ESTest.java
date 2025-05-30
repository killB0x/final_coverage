/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 22:08:09 GMT 2022
 */

package org.dynjs.debugger.requests;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dynjs.debugger.requests.SuspendRequest;
import org.dynjs.debugger.requests.SuspendResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SuspendResponse_ESTest extends SuspendResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SuspendRequest suspendRequest0 = new SuspendRequest();
      SuspendResponse suspendResponse0 = new SuspendResponse(suspendRequest0, false, false);
      assertEquals("suspend", suspendResponse0.getCommand());
  }
}
