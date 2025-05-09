/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 18:35:46 GMT 2022
 */

package com.github.unclecatmyself.core.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.unclecatmyself.core.utils.RemotingUtil;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RemotingUtil_ESTest extends RemotingUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      String string0 = RemotingUtil.normalizeHostAddress(inetAddress0);
      assertEquals("127.0.0.1", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        RemotingUtil.string2SocketAddress("92B:*ajgR");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"*ajgR\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        RemotingUtil.string2SocketAddress((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.unclecatmyself.core.utils.RemotingUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        RemotingUtil.string2SocketAddress("X{4r |{KL-");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("com.github.unclecatmyself.core.utils.RemotingUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        RemotingUtil.socketAddress2String((SocketAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.unclecatmyself.core.utils.RemotingUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(0);
          SocketChannel socketChannel0 = RemotingUtil.connect((SocketAddress) mockInetSocketAddress0, 974);
          assertNull(socketChannel0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        RemotingUtil.normalizeHostAddress((InetAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = RemotingUtil.getLocalAddress();
      assertNotNull(string0);
      assertEquals("192.168.1.42", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Selector selector0 = RemotingUtil.openSelector();
      assertNotNull(selector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockInetSocketAddress mockInetSocketAddress0 = (MockInetSocketAddress)RemotingUtil.string2SocketAddress("192.168.1.42:2974");
      assertEquals("192.168.1.42", mockInetSocketAddress0.getHostString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RemotingUtil remotingUtil0 = new RemotingUtil();
      assertFalse(remotingUtil0.isWindowsPlatform());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = RemotingUtil.isLinuxPlatform();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(2974);
          SocketChannel socketChannel0 = RemotingUtil.connect((SocketAddress) mockInetSocketAddress0);
          assertNull(socketChannel0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = RemotingUtil.isWindowsPlatform();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(2974);
      String string0 = RemotingUtil.socketAddress2String(mockInetSocketAddress0);
      assertEquals("192.168.1.42:2974", string0);
  }
}
