/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 13:51:23 GMT 2022
 */

package com.neovisionaries.ws.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.neovisionaries.ws.client.SNIHelper;
import java.net.Socket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SNIHelper_ESTest extends SNIHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SNIHelper.setServerNames((Socket) null, (String[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = SNIHelper.getAndroidSDKVersion();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SNIHelper sNIHelper0 = new SNIHelper();
  }
}
