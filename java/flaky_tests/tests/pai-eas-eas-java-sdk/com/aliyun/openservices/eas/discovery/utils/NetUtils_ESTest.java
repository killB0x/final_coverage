/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 08:25:53 GMT 2022
 */

package com.aliyun.openservices.eas.discovery.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import com.aliyun.openservices.eas.discovery.utils.NetUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NetUtils_ESTest extends NetUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NetUtils.localIP();
      String string0 = NetUtils.localIP();
      assertEquals("192.168.1.42", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NetUtils netUtils0 = new NetUtils();
  }
}
