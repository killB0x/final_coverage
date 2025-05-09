/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 22:22:06 GMT 2022
 */

package org.dynjs.runtime;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dynjs.runtime.CallContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CallContext_ESTest extends CallContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CallContext callContext0 = new CallContext();
      int int0 = callContext0.getPendingConstructorCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CallContext callContext0 = new CallContext();
      callContext0.incrementPendingConstructorCount();
      int int0 = callContext0.getPendingConstructorCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CallContext callContext0 = new CallContext();
      callContext0.decrementPendingConstructorCount();
      int int0 = callContext0.getPendingConstructorCount();
      assertEquals((-1), int0);
  }
}
