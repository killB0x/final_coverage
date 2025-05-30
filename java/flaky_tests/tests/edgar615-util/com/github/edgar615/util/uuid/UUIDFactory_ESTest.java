/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 15:11:21 GMT 2022
 */

package com.github.edgar615.util.uuid;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.edgar615.util.uuid.UUIDFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UUIDFactory_ESTest extends UUIDFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UUIDFactory uUIDFactory0 = UUIDFactory.defaultUUIDFactory();
      assertNotNull(uUIDFactory0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UUIDFactory uUIDFactory0 = UUIDFactory.concurrentUUIDFactory();
      assertNotNull(uUIDFactory0);
  }
}
