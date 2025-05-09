/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 15:12:01 GMT 2022
 */

package com.github.edgar615.util.loadbalance;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.edgar615.util.loadbalance.ProviderStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProviderStrategy_ESTest extends ProviderStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProviderStrategy providerStrategy0 = ProviderStrategy.roundRobin();
      assertNotNull(providerStrategy0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProviderStrategy providerStrategy0 = ProviderStrategy.weightRoundRobin();
      assertNotNull(providerStrategy0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProviderStrategy providerStrategy0 = ProviderStrategy.random();
      assertNotNull(providerStrategy0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ProviderStrategy providerStrategy0 = ProviderStrategy.sticky((ProviderStrategy) null);
      assertNotNull(providerStrategy0);
  }
}
