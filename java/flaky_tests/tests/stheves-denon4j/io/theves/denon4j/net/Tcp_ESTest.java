/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 15:46:08 GMT 2022
 */

package io.theves.denon4j.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.theves.denon4j.DenonReceiver;
import io.theves.denon4j.net.Command;
import io.theves.denon4j.net.Event;
import io.theves.denon4j.net.Tcp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Tcp_ESTest extends Tcp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(664);
      Tcp tcp0 = new Tcp("", integer0);
      try { 
        tcp0.establishConnection((byte)0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot establishConnection to host/ip  on port 664
         //
         verifyException("io.theves.denon4j.net.Tcp", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("127.0.0.1", 23);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Tcp tcp0 = new Tcp((String) null, (Integer) null);
      tcp0.establishConnection(255);
      Command command0 = Command.createCommand((String) null, "P%I(4K*Txo5>'_)@jM");
      tcp0.send(command0);
      assertEquals("P%I(4K*Txo5>'_)@jM", command0.getParameter());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tcp tcp0 = new Tcp((String) null, (Integer) null);
      DenonReceiver denonReceiver0 = new DenonReceiver(tcp0);
      // Undeclared exception!
      try { 
        tcp0.received((Event) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Tcp tcp0 = new Tcp("/QOnh6!hL9] E", (Integer) null);
      // Undeclared exception!
      try { 
        tcp0.establishConnection((-1997));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // connect: timeout can't be negative
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("127.0.0.1", 23);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Tcp tcp0 = new Tcp((String) null, (Integer) null);
      tcp0.establishConnection(255);
      boolean boolean0 = tcp0.isConnected();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(664);
      Tcp tcp0 = new Tcp("", integer0);
      boolean boolean0 = tcp0.isConnected();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(664);
      Tcp tcp0 = new Tcp("", integer0);
      tcp0.disconnect();
      assertFalse(tcp0.isConnected());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 23);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Tcp tcp0 = new Tcp("/.", (Integer) null);
      assertFalse(tcp0.isConnected());
      
      tcp0.establishConnection(760);
      tcp0.disconnect();
      assertTrue(tcp0.isConnected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 23);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Tcp tcp0 = new Tcp(".", (Integer) null);
      tcp0.establishConnection(760);
      try { 
        tcp0.establishConnection(760);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Already connected.
         //
         verifyException("io.theves.denon4j.net.Tcp", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Tcp tcp0 = new Tcp((String) null, (Integer) null);
      byte[] byteArray0 = new byte[4];
      Event event0 = Event.create(byteArray0);
      DenonReceiver denonReceiver0 = new DenonReceiver((String) null, (byte)10);
      tcp0.setDispatcher(denonReceiver0);
      tcp0.received(event0);
      assertEquals("\u0000\u0000\u0000\u0000", event0.asciiValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 23);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Tcp tcp0 = new Tcp("/.", (Integer) null);
      tcp0.establishConnection(760);
      // Undeclared exception!
      try { 
        tcp0.send((Command) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Communication failure.
         //
         verifyException("io.theves.denon4j.net.Tcp", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Tcp tcp0 = new Tcp("/.", (Integer) null);
      // Undeclared exception!
      try { 
        tcp0.send((Command) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not connected.
         //
         verifyException("io.theves.denon4j.net.Tcp", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(664);
      Tcp tcp0 = new Tcp("", integer0);
      byte[] byteArray0 = new byte[6];
      Event event0 = Event.create(byteArray0);
      tcp0.received(event0);
      assertFalse(tcp0.isConnected());
  }
}
