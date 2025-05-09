/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 13:56:33 GMT 2022
 */

package com.neovisionaries.ws.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.neovisionaries.ws.client.StateManager;
import com.neovisionaries.ws.client.WebSocketState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StateManager_ESTest extends StateManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StateManager stateManager0 = new StateManager();
      StateManager.CloseInitiator stateManager_CloseInitiator0 = StateManager.CloseInitiator.SERVER;
      stateManager0.changeToClosing(stateManager_CloseInitiator0);
      boolean boolean0 = stateManager0.getClosedByServer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StateManager stateManager0 = new StateManager();
      boolean boolean0 = stateManager0.getClosedByServer();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StateManager stateManager0 = new StateManager();
      StateManager.CloseInitiator stateManager_CloseInitiator0 = StateManager.CloseInitiator.SERVER;
      stateManager0.changeToClosing(stateManager_CloseInitiator0);
      stateManager0.changeToClosing(stateManager_CloseInitiator0);
      assertTrue(stateManager0.getClosedByServer());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StateManager stateManager0 = new StateManager();
      WebSocketState webSocketState0 = stateManager0.getState();
      assertEquals(WebSocketState.CREATED, webSocketState0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StateManager stateManager0 = new StateManager();
      WebSocketState webSocketState0 = WebSocketState.CLOSING;
      stateManager0.setState(webSocketState0);
      assertFalse(stateManager0.getClosedByServer());
  }
}
