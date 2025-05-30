/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 14:04:04 GMT 2022
 */

package com.neovisionaries.ws.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.neovisionaries.ws.client.Address;
import com.neovisionaries.ws.client.ProxySettings;
import com.neovisionaries.ws.client.SocketConnector;
import com.neovisionaries.ws.client.ThreadType;
import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketAdapter;
import com.neovisionaries.ws.client.WebSocketError;
import com.neovisionaries.ws.client.WebSocketException;
import com.neovisionaries.ws.client.WebSocketFactory;
import com.neovisionaries.ws.client.WebSocketFrame;
import com.neovisionaries.ws.client.WebSocketState;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WebSocketAdapter_ESTest extends WebSocketAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFrame webSocketFrame0 = new WebSocketFrame();
      webSocketAdapter0.onDisconnected((WebSocket) null, webSocketFrame0, webSocketFrame0, true);
      assertFalse(webSocketFrame0.getFin());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SocketFactory socketFactory0 = SocketFactory.getDefault();
      String[] stringArray0 = new String[4];
      SocketConnector socketConnector0 = new SocketConnector(socketFactory0, (Address) null, 0, stringArray0, (-1489));
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, true, "", "com.neovisionaries.ws.client.WebSocketOutputStream", "G", socketConnector0);
      WebSocketState webSocketState0 = WebSocketState.OPEN;
      webSocketAdapter0.onStateChanged(webSocket0, webSocketState0);
      assertTrue(webSocket0.isMissingCloseFrameAllowed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      byte[] byteArray0 = new byte[5];
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createBinaryFrame(byteArray0);
      webSocketAdapter0.onContinuationFrame((WebSocket) null, webSocketFrame0);
      assertFalse(webSocketFrame0.getRsv1());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocket webSocket0 = new WebSocket((WebSocketFactory) null, true, (String) null, "", "NA", (SocketConnector) null);
      ThreadType threadType0 = ThreadType.CONNECT_THREAD;
      MockThread mockThread0 = new MockThread();
      webSocketAdapter0.onThreadCreated(webSocket0, threadType0, mockThread0);
      assertFalse(webSocket0.isExtended());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketError webSocketError0 = WebSocketError.OPENING_HAHDSHAKE_REQUEST_FAILURE;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0, "dr:F/S^vQo; G)5E");
      webSocketAdapter0.handleCallbackError((WebSocket) null, webSocketException0);
      assertEquals(WebSocketError.OPENING_HAHDSHAKE_REQUEST_FAILURE, webSocketException0.getError());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocket webSocket0 = new WebSocket((WebSocketFactory) null, false, "+/<B*Z9h*1^wP", "+#0fQ20k@EMSV[", "", (SocketConnector) null);
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      ProxySettings proxySettings0 = webSocketFactory0.getProxySettings();
      Map<String, List<String>> map0 = proxySettings0.getHeaders();
      webSocketAdapter0.onConnected(webSocket0, map0);
      assertFalse(webSocket0.isOpen());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, false, "t", "https", "https", (SocketConnector) null);
      WebSocketError webSocketError0 = WebSocketError.UNEXPECTED_RESERVED_BIT;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0, "");
      byte[] byteArray0 = new byte[7];
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createPingFrame(byteArray0);
      webSocketAdapter0.onSendError(webSocket0, webSocketException0, webSocketFrame0);
      assertTrue(webSocketFrame0.isControlFrame());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createCloseFrame();
      webSocketAdapter0.onTextFrame((WebSocket) null, webSocketFrame0);
      assertFalse(webSocketFrame0.isTextFrame());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocket webSocket0 = new WebSocket((WebSocketFactory) null, false, "+/<B*Z9h*1^wP", "+#0fQ20k@EMSV[", "", (SocketConnector) null);
      WebSocketError webSocketError0 = WebSocketError.UNEXPECTED_SEC_WEBSOCKET_ACCEPT_HEADER;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0, (String) null);
      webSocketAdapter0.onMessageError(webSocket0, webSocketException0, (List<WebSocketFrame>) null);
      assertEquals(WebSocketState.CREATED, webSocket0.getState());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, false, "t", "https", "https", (SocketConnector) null);
      WebSocketError webSocketError0 = WebSocketError.UNEXPECTED_RESERVED_BIT;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0, "");
      webSocketAdapter0.onError(webSocket0, webSocketException0);
      assertFalse(webSocket0.isExtended());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFrame webSocketFrame0 = new WebSocketFrame();
      webSocketAdapter0.onBinaryFrame((WebSocket) null, webSocketFrame0);
      assertFalse(webSocketFrame0.hasPayload());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, false, "t", "https", "https", (SocketConnector) null);
      ThreadType threadType0 = ThreadType.READING_THREAD;
      webSocketAdapter0.onThreadStarted(webSocket0, threadType0, (Thread) null);
      assertTrue(webSocket0.isAutoFlush());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SocketFactory socketFactory0 = SocketFactory.getDefault();
      Address address0 = new Address("", 0);
      String[] stringArray0 = new String[8];
      SocketConnector socketConnector0 = new SocketConnector(socketFactory0, address0, (-2657), stringArray0, (-2657));
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, true, "N4", (String) null, ";1sW0H=", socketConnector0);
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createPongFrame();
      webSocketAdapter0.onFrameSent(webSocket0, webSocketFrame0);
      assertEquals(0, webSocket0.getMaxPayloadSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocket webSocket0 = new WebSocket((WebSocketFactory) null, false, "+/<B*Z9h*1^wP", "+#0fQ20k@EMSV[", "", (SocketConnector) null);
      WebSocketError webSocketError0 = WebSocketError.HOSTNAME_UNVERIFIED;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0, (String) null);
      webSocketAdapter0.onConnectError(webSocket0, webSocketException0);
      assertFalse(webSocket0.isExtended());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createPongFrame();
      webSocketAdapter0.onSendingFrame((WebSocket) null, webSocketFrame0);
      assertFalse(webSocketFrame0.isPingFrame());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      LinkedList<String[]> linkedList0 = new LinkedList<String[]>();
      webSocketAdapter0.onSendingHandshake((WebSocket) null, "", linkedList0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      webSocketAdapter0.onTextMessage((WebSocket) null, "");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      byte[] byteArray0 = new byte[7];
      webSocketAdapter0.onBinaryMessage((WebSocket) null, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SocketFactory socketFactory0 = SocketFactory.getDefault();
      String[] stringArray0 = new String[0];
      SocketConnector socketConnector0 = new SocketConnector(socketFactory0, (Address) null, 1728, stringArray0, 845);
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, true, "\">", "13", "13", socketConnector0);
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createContinuationFrame();
      webSocketAdapter0.onFrameUnsent(webSocket0, webSocketFrame0);
      assertFalse(webSocketFrame0.isControlFrame());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      byte[] byteArray0 = new byte[7];
      webSocketAdapter0.onTextMessage((WebSocket) null, byteArray0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SocketFactory socketFactory0 = SocketFactory.getDefault();
      Address address0 = new Address("B'r*a}03:jiaLQ2O", 221);
      SocketConnector socketConnector0 = new SocketConnector(socketFactory0, address0, 1, (String[]) null, (-430));
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, true, "VX\u0003;Up", "", "com.neovisionaries.ws.client.WebSocketAdapter", socketConnector0);
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createTextFrame("");
      webSocketAdapter0.onFrame(webSocket0, webSocketFrame0);
      assertFalse(webSocketFrame0.hasPayload());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SocketFactory socketFactory0 = SocketFactory.getDefault();
      String[] stringArray0 = new String[4];
      SocketConnector socketConnector0 = new SocketConnector(socketFactory0, (Address) null, 0, stringArray0, (-502));
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, true, "", "com.neovisionaries.ws.client.WebSocketOutputStream", "com.neovisionaries.ws.client.WebSocketOutputStream", socketConnector0);
      ThreadType threadType0 = ThreadType.CONNECT_THREAD;
      MockThread mockThread0 = new MockThread("com.neovisionaries.ws.client.WebSocketOutputStream");
      webSocketAdapter0.onThreadStopping(webSocket0, threadType0, mockThread0);
      assertTrue(webSocket0.isAutoFlush());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketError webSocketError0 = WebSocketError.UNEXPECTED_RESERVED_BIT;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0, "");
      webSocketAdapter0.onUnexpectedError((WebSocket) null, webSocketException0);
      assertEquals(WebSocketError.UNEXPECTED_RESERVED_BIT, webSocketException0.getError());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      byte[] byteArray0 = new byte[5];
      WebSocketError webSocketError0 = WebSocketError.FRAME_MASKED;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0);
      webSocketAdapter0.onTextMessageError((WebSocket) null, webSocketException0, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      byte[] byteArray0 = new byte[5];
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createBinaryFrame(byteArray0);
      WebSocketError webSocketError0 = WebSocketError.FRAME_MASKED;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0);
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SocketFactory socketFactory0 = SocketFactory.getDefault();
      Address address0 = new Address("", (-1));
      String[] stringArray0 = new String[0];
      SocketConnector socketConnector0 = new SocketConnector(socketFactory0, address0, 0, stringArray0, (byte)30);
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, true, "com.neovisionaries.ws.client.WebSocketFrame", "com.neovisionaries.ws.client.WebSocketFrame", "com.neovisionaries.ws.client.WebSocketFrame", socketConnector0);
      webSocketAdapter0.onFrameError(webSocket0, webSocketException0, webSocketFrame0);
      assertFalse(webSocketFrame0.isPingFrame());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createContinuationFrame();
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SocketFactory socketFactory0 = SocketFactory.getDefault();
      Address address0 = new Address("", (-1));
      String[] stringArray0 = new String[7];
      SocketConnector socketConnector0 = new SocketConnector(socketFactory0, address0, (-1), stringArray0, 0);
      WebSocket webSocket0 = new WebSocket(webSocketFactory0, true, "g6dhw", "", "g6dhw", socketConnector0);
      webSocketAdapter0.onCloseFrame(webSocket0, webSocketFrame0);
      assertFalse(webSocket0.isOpen());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createCloseFrame();
      webSocketAdapter0.onPongFrame((WebSocket) null, webSocketFrame0);
      assertFalse(webSocketFrame0.isContinuationFrame());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      byte[] byteArray0 = new byte[4];
      WebSocketFrame webSocketFrame0 = WebSocketFrame.createContinuationFrame(byteArray0);
      webSocketAdapter0.onPingFrame((WebSocket) null, webSocketFrame0);
      assertFalse(webSocketFrame0.isTextFrame());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      WebSocketAdapter webSocketAdapter0 = new WebSocketAdapter();
      byte[] byteArray0 = new byte[7];
      WebSocketError webSocketError0 = WebSocketError.TOO_LONG_CONTROL_FRAME_PAYLOAD;
      WebSocketException webSocketException0 = new WebSocketException(webSocketError0, "");
      webSocketAdapter0.onMessageDecompressionError((WebSocket) null, webSocketException0, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }
}
