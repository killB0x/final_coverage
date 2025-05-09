/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 21:55:22 GMT 2022
 */

package org.openhim.mediator.engine.messages;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SendHeartbeatToCoreResponse_ESTest extends SendHeartbeatToCoreResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse(false, (String) null, hashMap0);
      boolean boolean0 = sendHeartbeatToCoreResponse0.requestSucceeded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse(false, (String) null, hashMap0);
      sendHeartbeatToCoreResponse0.getRawResponse();
      assertFalse(sendHeartbeatToCoreResponse0.requestSucceeded());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse("'w*R`cGG<m*N4", hashMap0);
      sendHeartbeatToCoreResponse0.getRawResponse();
      assertTrue(sendHeartbeatToCoreResponse0.requestSucceeded());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse("'w*R`cGG<m*N4", hashMap0);
      sendHeartbeatToCoreResponse0.getConfig();
      assertTrue(sendHeartbeatToCoreResponse0.requestSucceeded());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put((String) null, (Object) null);
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse(false, (String) null, hashMap0);
      sendHeartbeatToCoreResponse0.getConfig();
      assertFalse(sendHeartbeatToCoreResponse0.requestSucceeded());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse("'w*R`cGG<m*N4", hashMap0);
      boolean boolean0 = sendHeartbeatToCoreResponse0.receivedConfigUpdate();
      assertTrue(boolean0);
      assertTrue(sendHeartbeatToCoreResponse0.requestSucceeded());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse("");
      boolean boolean0 = sendHeartbeatToCoreResponse0.receivedConfigUpdate();
      assertFalse(boolean0);
      assertTrue(sendHeartbeatToCoreResponse0.requestSucceeded());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse("");
      sendHeartbeatToCoreResponse0.getConfig();
      assertTrue(sendHeartbeatToCoreResponse0.requestSucceeded());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse("");
      boolean boolean0 = sendHeartbeatToCoreResponse0.requestSucceeded();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse0 = new SendHeartbeatToCoreResponse("");
      sendHeartbeatToCoreResponse0.getRawResponse();
      assertTrue(sendHeartbeatToCoreResponse0.requestSucceeded());
  }
}
