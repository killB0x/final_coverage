/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 13:59:57 GMT 2022
 */

package com.neovisionaries.ws.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.neovisionaries.ws.client.WebSocketError;
import com.neovisionaries.ws.client.WebSocketException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WebSocketException_ESTest extends WebSocketException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WebSocketError webSocketError0 = WebSocketError.NO_SEC_WEBSOCKET_ACCEPT_HEADER;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0);
      WebSocketException webSocketException1 = new WebSocketException(webSocketError0, "4aQxcL70OI)\"n0Tr~", webSocketException0);
      assertFalse(webSocketException1.equals((Object)webSocketException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WebSocketError webSocketError0 = WebSocketError.FRAGMENTED_CONTROL_FRAME;
      WebSocketException webSocketException0 = new WebSocketException((WebSocketError) null);
      MockThrowable mockThrowable0 = new MockThrowable("INTERRUPTED_IN_READING", webSocketException0);
      WebSocketException webSocketException1 = new WebSocketException(webSocketError0, mockThrowable0);
      WebSocketError webSocketError1 = webSocketException1.getError();
      assertSame(webSocketError1, webSocketError0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WebSocketException webSocketException0 = new WebSocketException((WebSocketError) null);
      webSocketException0.getError();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WebSocketError webSocketError0 = WebSocketError.CONTINUATION_NOT_CLOSED;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0, (String) null);
  }
}
