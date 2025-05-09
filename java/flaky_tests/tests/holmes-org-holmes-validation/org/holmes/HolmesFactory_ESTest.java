/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 13:54:53 GMT 2022
 */

package org.holmes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.holmes.HolmesEngine;
import org.holmes.HolmesFactory;
import org.holmes.OperationMode;
import org.holmes.resolver.SimpleMessageResolver;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HolmesFactory_ESTest extends HolmesFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HolmesFactory holmesFactory0 = new HolmesFactory();
      HolmesEngine holmesEngine0 = holmesFactory0.createEngine();
      assertNotNull(holmesEngine0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HolmesFactory holmesFactory0 = new HolmesFactory();
      HolmesFactory holmesFactory1 = holmesFactory0.withDefaultViolationDescriptor("T=ps");
      assertSame(holmesFactory0, holmesFactory1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HolmesFactory holmesFactory0 = new HolmesFactory();
      OperationMode operationMode0 = OperationMode.GREEDY;
      HolmesFactory holmesFactory1 = holmesFactory0.withOperationMode(operationMode0);
      assertSame(holmesFactory1, holmesFactory0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HolmesFactory holmesFactory0 = new HolmesFactory();
      SimpleMessageResolver simpleMessageResolver0 = new SimpleMessageResolver();
      HolmesFactory holmesFactory1 = holmesFactory0.withMessageResolver(simpleMessageResolver0);
      assertSame(holmesFactory0, holmesFactory1);
  }
}
