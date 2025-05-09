/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 13:40:30 GMT 2022
 */

package com.neovisionaries.ws.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.neovisionaries.ws.client.ProxyHandshaker;
import com.neovisionaries.ws.client.ProxySettings;
import com.neovisionaries.ws.client.WebSocketFactory;
import java.net.Socket;
import java.net.SocketException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProxyHandshaker_ESTest extends ProxyHandshaker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      ProxySettings proxySettings0 = new ProxySettings(webSocketFactory0);
      ProxyHandshaker proxyHandshaker0 = new ProxyHandshaker("?", (-3038), proxySettings0);
      String string0 = proxyHandshaker0.getProxiedHostname();
      assertEquals("?", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      ProxySettings proxySettings0 = new ProxySettings(webSocketFactory0);
      ProxyHandshaker proxyHandshaker0 = new ProxyHandshaker("", (-1850), proxySettings0);
      String string0 = proxyHandshaker0.getProxiedHostname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      ProxySettings proxySettings0 = webSocketFactory0.getProxySettings();
      proxySettings0.setCredentials(" +", " +");
      ProxyHandshaker proxyHandshaker0 = new ProxyHandshaker("(", 1396, proxySettings0);
      // Undeclared exception!
      try { 
        proxyHandshaker0.perform((Socket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.neovisionaries.ws.client.ProxyHandshaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      ProxySettings proxySettings0 = webSocketFactory0.getProxySettings();
      proxySettings0.setId("");
      ProxyHandshaker proxyHandshaker0 = new ProxyHandshaker("", 75, proxySettings0);
      // Undeclared exception!
      try { 
        proxyHandshaker0.perform((Socket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.neovisionaries.ws.client.ProxyHandshaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      ProxySettings proxySettings0 = new ProxySettings(webSocketFactory0);
      ProxySettings proxySettings1 = proxySettings0.setId("Authorization");
      ProxyHandshaker proxyHandshaker0 = new ProxyHandshaker((String) null, 3940, proxySettings1);
      // Undeclared exception!
      try { 
        proxyHandshaker0.perform((Socket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.neovisionaries.ws.client.ProxyHandshaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      ProxySettings proxySettings0 = webSocketFactory0.getProxySettings();
      MockSocket mockSocket0 = new MockSocket();
      ProxyHandshaker proxyHandshaker0 = new ProxyHandshaker("@|q=Uo8967+Y&#Y}", 0, proxySettings0);
      proxySettings0.addHeader("@|q=Uo8967+Y&#Y}", "$VALUES");
      try { 
        proxyHandshaker0.perform(mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is not connected
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      ProxySettings proxySettings0 = new ProxySettings(webSocketFactory0);
      ProxyHandshaker proxyHandshaker0 = new ProxyHandshaker((String) null, 3940, proxySettings0);
      proxySettings0.addHeader("Authorization", (String) null);
      // Undeclared exception!
      try { 
        proxyHandshaker0.perform((Socket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.neovisionaries.ws.client.ProxyHandshaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      ProxySettings proxySettings0 = new ProxySettings(webSocketFactory0);
      ProxyHandshaker proxyHandshaker0 = new ProxyHandshaker((String) null, (-1224), proxySettings0);
      String string0 = proxyHandshaker0.getProxiedHostname();
      assertNull(string0);
  }
}
