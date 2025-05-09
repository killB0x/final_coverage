/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 05:34:11 GMT 2022
 */

package com.dinstone.photon.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import com.dinstone.photon.Connection;
import com.dinstone.photon.handler.DefaultMessageProcessor;
import com.dinstone.photon.message.Heartbeat;
import com.dinstone.photon.message.Notice;
import com.dinstone.photon.message.Request;
import com.dinstone.photon.message.Response;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultMessageProcessor_ESTest extends DefaultMessageProcessor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultMessageProcessor defaultMessageProcessor0 = new DefaultMessageProcessor();
      defaultMessageProcessor0.process((Connection) null, (Notice) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultMessageProcessor defaultMessageProcessor0 = new DefaultMessageProcessor();
      defaultMessageProcessor0.process((Connection) null, (Response) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultMessageProcessor defaultMessageProcessor0 = new DefaultMessageProcessor();
      defaultMessageProcessor0.process((Connection) null, (Request) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultMessageProcessor defaultMessageProcessor0 = new DefaultMessageProcessor();
      defaultMessageProcessor0.process((Connection) null, (Heartbeat) null);
  }
}
