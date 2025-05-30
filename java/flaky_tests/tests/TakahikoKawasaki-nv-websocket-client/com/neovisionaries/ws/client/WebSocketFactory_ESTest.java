/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 13:36:03 GMT 2022
 */

package com.neovisionaries.ws.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.neovisionaries.ws.client.DualStackMode;
import com.neovisionaries.ws.client.WebSocketFactory;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WebSocketFactory_ESTest extends WebSocketFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URL uRL0 = MockURL.URL("http", "http", "u}rv|&|C?B1");
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket(uRL0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Failed to convert the given URL into a URI.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setVerifyHostname(true);
      assertEquals(250, webSocketFactory1.getDualStackFallbackDelay());
      assertTrue(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setSocketTimeout(80);
      webSocketFactory0.setVerifyHostname(false);
      assertEquals(80, webSocketFactory0.getSocketTimeout());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      
      webSocketFactory0.setDualStackFallbackDelay(0);
      webSocketFactory0.setVerifyHostname(false);
      assertFalse(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setConnectionTimeout(970);
      webSocketFactory1.setVerifyHostname(false);
      assertEquals(970, webSocketFactory0.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setVerifyHostname(false);
      webSocketFactory1.setSocketTimeout(500);
      assertEquals(500, webSocketFactory1.getSocketTimeout());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setSocketTimeout(0);
      assertEquals(0, webSocketFactory1.getSocketTimeout());
      assertEquals(250, webSocketFactory1.getDualStackFallbackDelay());
      assertTrue(webSocketFactory1.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setDualStackFallbackDelay(0);
      webSocketFactory0.setSocketTimeout(443);
      assertEquals(443, webSocketFactory0.getSocketTimeout());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setConnectionTimeout(1);
      webSocketFactory1.setSocketTimeout(80);
      assertEquals(80, webSocketFactory1.getSocketTimeout());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setVerifyHostname(false);
      webSocketFactory1.setSocketFactory((SocketFactory) null);
      assertFalse(webSocketFactory0.getVerifyHostname());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setSocketTimeout(443);
      webSocketFactory0.setSocketFactory((SocketFactory) null);
      assertEquals(443, webSocketFactory0.getSocketTimeout());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setDualStackFallbackDelay(0);
      webSocketFactory1.setSocketFactory((SocketFactory) null);
      assertEquals(0, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setConnectionTimeout(443);
      webSocketFactory0.setSocketFactory((SocketFactory) null);
      assertEquals(443, webSocketFactory0.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setVerifyHostname(false);
      String[] stringArray0 = new String[4];
      webSocketFactory1.setServerNames(stringArray0);
      assertFalse(webSocketFactory0.getVerifyHostname());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setSocketTimeout(80);
      String[] stringArray0 = new String[8];
      webSocketFactory1.setServerNames(stringArray0);
      assertEquals(80, webSocketFactory0.getSocketTimeout());
      assertTrue(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setDualStackFallbackDelay(0);
      String[] stringArray0 = new String[7];
      webSocketFactory1.setServerNames(stringArray0);
      assertEquals(0, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setConnectionTimeout(9);
      String[] stringArray0 = new String[5];
      webSocketFactory1.setServerNames(stringArray0);
      assertEquals(9, webSocketFactory0.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setVerifyHostname(false);
      webSocketFactory1.setServerName("Ge7");
      assertFalse(webSocketFactory0.getVerifyHostname());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setSocketTimeout(80);
      webSocketFactory0.setServerName("Y9>DSheNpC>dF w.Cc");
      assertEquals(80, webSocketFactory0.getSocketTimeout());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setDualStackFallbackDelay(0);
      webSocketFactory1.setServerName((String) null);
      assertEquals(0, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setConnectionTimeout(443);
      webSocketFactory0.setServerName("");
      assertEquals(443, webSocketFactory0.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      
      webSocketFactory0.setVerifyHostname(false);
      webSocketFactory0.setSSLSocketFactory((SSLSocketFactory) null);
      assertFalse(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setSocketTimeout(80);
      webSocketFactory0.setSSLSocketFactory((SSLSocketFactory) null);
      assertEquals(80, webSocketFactory0.getSocketTimeout());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setVerifyHostname(false);
      SSLContext sSLContext0 = SSLContext.getDefault();
      webSocketFactory1.setSSLContext(sSLContext0);
      assertFalse(webSocketFactory0.getVerifyHostname());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setSocketTimeout(80);
      SSLContext sSLContext0 = SSLContext.getDefault();
      webSocketFactory1.setSSLContext(sSLContext0);
      assertEquals(80, webSocketFactory0.getSocketTimeout());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setDualStackFallbackDelay(0);
      webSocketFactory1.setSSLContext((SSLContext) null);
      assertEquals(0, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setConnectionTimeout(9);
      SSLContext sSLContext0 = SSLContext.getDefault();
      webSocketFactory0.setSSLContext(sSLContext0);
      assertEquals(9, webSocketFactory0.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      
      webSocketFactory0.setVerifyHostname(false);
      DualStackMode dualStackMode0 = DualStackMode.IPV6_ONLY;
      webSocketFactory0.setDualStackMode(dualStackMode0);
      assertFalse(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setSocketTimeout(80);
      DualStackMode dualStackMode0 = DualStackMode.BOTH;
      webSocketFactory0.setDualStackMode(dualStackMode0);
      assertEquals(80, webSocketFactory0.getSocketTimeout());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      
      webSocketFactory0.setDualStackFallbackDelay(0);
      DualStackMode dualStackMode0 = DualStackMode.BOTH;
      webSocketFactory0.setDualStackMode(dualStackMode0);
      assertTrue(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setConnectionTimeout(70);
      DualStackMode dualStackMode0 = DualStackMode.IPV6_ONLY;
      webSocketFactory0.setDualStackMode(dualStackMode0);
      assertEquals(70, webSocketFactory0.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setVerifyHostname(false);
      webSocketFactory1.setDualStackFallbackDelay(1858);
      assertEquals(1858, webSocketFactory1.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setSocketTimeout(80);
      webSocketFactory1.setDualStackFallbackDelay(80);
      assertEquals(80, webSocketFactory1.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setConnectionTimeout(250);
      webSocketFactory1.setDualStackFallbackDelay(1005);
      assertEquals(1005, webSocketFactory1.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setVerifyHostname(false);
      webSocketFactory0.setConnectionTimeout(7);
      assertEquals(7, webSocketFactory0.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setSocketTimeout(80);
      webSocketFactory1.setConnectionTimeout(1109);
      assertEquals(80, webSocketFactory0.getSocketTimeout());
      assertEquals(1109, webSocketFactory0.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setDualStackFallbackDelay(0);
      webSocketFactory1.setConnectionTimeout(447);
      assertEquals(447, webSocketFactory1.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setConnectionTimeout(0);
      assertEquals(0, webSocketFactory1.getConnectionTimeout());
      assertEquals(250, webSocketFactory1.getDualStackFallbackDelay());
      assertTrue(webSocketFactory1.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setSocketTimeout(443);
      int int0 = webSocketFactory0.getSocketTimeout();
      assertEquals(443, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      String[] stringArray0 = new String[8];
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setServerNames(stringArray0);
      webSocketFactory1.getServerNames();
      assertTrue(webSocketFactory1.getVerifyHostname());
      assertEquals(250, webSocketFactory1.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SSLContext sSLContext0 = SSLContext.getDefault();
      SSLSocketFactory sSLSocketFactory0 = sSLContext0.getSocketFactory();
      webSocketFactory0.setSSLSocketFactory(sSLSocketFactory0);
      webSocketFactory0.getSSLSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SSLContext sSLContext0 = SSLContext.getDefault();
      webSocketFactory0.setSSLContext(sSLContext0);
      webSocketFactory0.getSSLContext();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      assertTrue(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setConnectionTimeout(443);
      int int0 = webSocketFactory1.getConnectionTimeout();
      assertEquals(443, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URL uRL0 = MockURL.getHttpExample();
      URI uRI0 = MockURL.toURI(uRL0);
      webSocketFactory0.createSocket(uRI0, 0);
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URL uRL0 = MockURL.getHttpExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "com.neovisionaries.ws.client.address", uRLStreamHandler0);
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket(uRL1, 1000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URL uRL0 = MockURL.getFtpExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "wU$*[K?olv=qG9x3*", uRLStreamHandler0);
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket(uRL1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket("c&e_2Rx&-%)vgY0W>", 250);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed escape pair at index 9: c&e_2Rx&-%)vgY0W>
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URI uRI0 = MockURI.URI("com.neovisionaries.ws.client.WebSocket", "com.neovisionaries.ws.client.WebSocket", (String) null, "'key' is not a valid token.");
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket(uRI0, 443);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad scheme: com.neovisionaries.ws.client.WebSocket
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket((URI) null, 21);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given URI is null.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URL uRL0 = MockURL.getHttpExample();
      webSocketFactory0.createSocket(uRL0, 1000);
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket((URL) null, (-3901));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given URL is null.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket((String) null, (-1999));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given URI is null.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      int int0 = webSocketFactory0.getConnectionTimeout();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      assertTrue(webSocketFactory0.getVerifyHostname());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      String[] stringArray0 = new String[0];
      webSocketFactory0.setServerNames(stringArray0);
      webSocketFactory0.getServerNames();
      assertTrue(webSocketFactory0.getVerifyHostname());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URI uRI1 = MockURI.resolve(uRI0, "1_Z?a");
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.createSocket(uRI1);
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertEquals(0, webSocketFactory0.getConnectionTimeout());
      
      URL uRL0 = MockURL.getHttpExample();
      webSocketFactory0.createSocket(uRL0);
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URI uRI0 = MockURI.URI("ws", "ws", "ws");
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The host part is empty.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URI uRI0 = MockURI.URI("wss", "jrt", "jrt");
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The host part is empty.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket("", 443);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The scheme part is empty.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URI uRI0 = MockURI.aFileURI;
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket(uRI0, (-72));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given timeout value is negative.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URL uRL0 = MockURL.getHttpExample();
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket(uRL0, (-3861));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given timeout value is negative.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket("wss", (-548));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given timeout value is negative.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given URI is null.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.setDualStackFallbackDelay((-1821));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // delay value cannot be negative.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      
      webSocketFactory0.setDualStackFallbackDelay(0);
      int int0 = webSocketFactory0.getDualStackFallbackDelay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.setSocketTimeout((-374));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value cannot be negative.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.setConnectionTimeout((-165));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value cannot be negative.
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setConnectionTimeout(1);
      webSocketFactory0.setSSLSocketFactory((SSLSocketFactory) null);
      assertEquals(1, webSocketFactory0.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.setServerName((String) null);
      WebSocketFactory webSocketFactory1 = new WebSocketFactory(webSocketFactory0);
      assertEquals(0, webSocketFactory1.getSocketTimeout());
      assertEquals(250, webSocketFactory1.getDualStackFallbackDelay());
      assertEquals(0, webSocketFactory1.getConnectionTimeout());
      assertTrue(webSocketFactory1.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = null;
      try {
        webSocketFactory0 = new WebSocketFactory((WebSocketFactory) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given WebSocketFactory is null
         //
         verifyException("com.neovisionaries.ws.client.WebSocketFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      WebSocketFactory webSocketFactory1 = new WebSocketFactory(webSocketFactory0);
      assertEquals(0, webSocketFactory1.getSocketTimeout());
      assertEquals(250, webSocketFactory1.getDualStackFallbackDelay());
      assertEquals(0, webSocketFactory1.getConnectionTimeout());
      assertTrue(webSocketFactory1.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      URI uRI0 = MockURI.URI("https", "//com.neovisionaries.ws.client.PingSender", "st");
      webSocketFactory0.createSocket(uRI0);
      assertEquals(0, webSocketFactory0.getConnectionTimeout());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      // Undeclared exception!
      try { 
        webSocketFactory0.createSocket("c&e_2Rx&-%)vgY0W>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed escape pair at index 9: c&e_2Rx&-%)vgY0W>
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.getServerNames();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      assertTrue(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      boolean boolean0 = webSocketFactory0.getVerifyHostname();
      assertTrue(boolean0);
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      SocketFactory socketFactory0 = SocketFactory.getDefault();
      WebSocketFactory webSocketFactory1 = webSocketFactory0.setSocketFactory(socketFactory0);
      webSocketFactory1.getSocketFactory();
      assertTrue(webSocketFactory1.getVerifyHostname());
      assertEquals(250, webSocketFactory1.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.getProxySettings();
      assertTrue(webSocketFactory0.getVerifyHostname());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.getSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.getSSLContext();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      assertTrue(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.getSSLSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      int int0 = webSocketFactory0.getDualStackFallbackDelay();
      assertEquals(250, int0);
      assertTrue(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      webSocketFactory0.getDualStackMode();
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      assertTrue(webSocketFactory0.getVerifyHostname());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      assertTrue(webSocketFactory0.getVerifyHostname());
      
      webSocketFactory0.setVerifyHostname(false);
      boolean boolean0 = webSocketFactory0.getVerifyHostname();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      WebSocketFactory webSocketFactory0 = new WebSocketFactory();
      int int0 = webSocketFactory0.getSocketTimeout();
      assertEquals(0, int0);
      assertEquals(250, webSocketFactory0.getDualStackFallbackDelay());
      assertTrue(webSocketFactory0.getVerifyHostname());
  }
}
