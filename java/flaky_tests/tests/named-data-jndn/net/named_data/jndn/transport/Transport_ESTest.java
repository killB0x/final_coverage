/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 01:18:40 GMT 2022
 */

package net.named_data.jndn.transport;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import net.named_data.jndn.Node;
import net.named_data.jndn.encoding.ElementListener;
import net.named_data.jndn.transport.AsyncTcpTransport;
import net.named_data.jndn.transport.TcpTransport;
import net.named_data.jndn.transport.Transport;
import net.named_data.jndn.transport.UdpTransport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Transport_ESTest extends Transport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThreadPoolExecutor.AbortPolicy threadPoolExecutor_AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadPoolExecutor_AbortPolicy0);
      AsyncTcpTransport asyncTcpTransport0 = new AsyncTcpTransport(scheduledThreadPoolExecutor0);
      boolean boolean0 = asyncTcpTransport0.isAsync();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UdpTransport udpTransport0 = new UdpTransport();
      boolean boolean0 = udpTransport0.isAsync();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TcpTransport tcpTransport0 = new TcpTransport();
      boolean boolean0 = tcpTransport0.getIsConnected();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TcpTransport tcpTransport0 = new TcpTransport();
      ByteBuffer byteBuffer0 = tcpTransport0.inputBuffer_;
      try { 
        tcpTransport0.send(byteBuffer0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot send because the socket is not open.  Use connect.
         //
         verifyException("net.named_data.jndn.transport.TcpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TcpTransport tcpTransport0 = new TcpTransport();
      Transport.ConnectionInfo transport_ConnectionInfo0 = new Transport.ConnectionInfo();
      // Undeclared exception!
      try { 
        tcpTransport0.isLocal(transport_ConnectionInfo0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.named_data.jndn.transport.Transport$ConnectionInfo cannot be cast to class net.named_data.jndn.transport.TcpTransport$ConnectionInfo (net.named_data.jndn.transport.Transport$ConnectionInfo and net.named_data.jndn.transport.TcpTransport$ConnectionInfo are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4ebe0a4c)
         //
         verifyException("net.named_data.jndn.transport.TcpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(6, threadFactory0, threadPoolExecutor_CallerRunsPolicy0);
      AsyncTcpTransport asyncTcpTransport0 = new AsyncTcpTransport(scheduledThreadPoolExecutor0);
      Transport.ConnectionInfo transport_ConnectionInfo0 = new Transport.ConnectionInfo();
      // Undeclared exception!
      try { 
        asyncTcpTransport0.isLocal(transport_ConnectionInfo0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.named_data.jndn.transport.Transport$ConnectionInfo cannot be cast to class net.named_data.jndn.transport.AsyncTcpTransport$ConnectionInfo (net.named_data.jndn.transport.Transport$ConnectionInfo and net.named_data.jndn.transport.AsyncTcpTransport$ConnectionInfo are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4ebe0a4c)
         //
         verifyException("net.named_data.jndn.transport.AsyncTcpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UdpTransport udpTransport0 = new UdpTransport();
      Transport.ConnectionInfo transport_ConnectionInfo0 = new Transport.ConnectionInfo();
      Thread thread0 = MockThread.currentThread();
      // Undeclared exception!
      try { 
        udpTransport0.connect(transport_ConnectionInfo0, (ElementListener) null, thread0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.named_data.jndn.transport.Transport$ConnectionInfo cannot be cast to class net.named_data.jndn.transport.UdpTransport$ConnectionInfo (net.named_data.jndn.transport.Transport$ConnectionInfo and net.named_data.jndn.transport.UdpTransport$ConnectionInfo are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4ebe0a4c)
         //
         verifyException("net.named_data.jndn.transport.UdpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1521, threadPoolExecutor_DiscardOldestPolicy0);
      AsyncTcpTransport asyncTcpTransport0 = new AsyncTcpTransport(scheduledThreadPoolExecutor0);
      Transport.ConnectionInfo transport_ConnectionInfo0 = new Transport.ConnectionInfo();
      Node node0 = new Node(asyncTcpTransport0, transport_ConnectionInfo0);
      Thread thread0 = MockThread.currentThread();
      // Undeclared exception!
      try { 
        asyncTcpTransport0.connect(transport_ConnectionInfo0, node0, thread0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.nio.channels.spi.AsynchronousChannelProvider$ProviderHolder
         //
         verifyException("java.nio.channels.spi.AsynchronousChannelProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TcpTransport tcpTransport0 = new TcpTransport();
      Transport.ConnectionInfo transport_ConnectionInfo0 = new Transport.ConnectionInfo();
      MockThread mockThread0 = new MockThread("");
      // Undeclared exception!
      try { 
        tcpTransport0.connect(transport_ConnectionInfo0, (ElementListener) null, mockThread0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.named_data.jndn.transport.Transport$ConnectionInfo cannot be cast to class net.named_data.jndn.transport.TcpTransport$ConnectionInfo (net.named_data.jndn.transport.Transport$ConnectionInfo and net.named_data.jndn.transport.TcpTransport$ConnectionInfo are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4ebe0a4c)
         //
         verifyException("net.named_data.jndn.transport.TcpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ThreadPoolExecutor.AbortPolicy threadPoolExecutor_AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, threadPoolExecutor_AbortPolicy0);
      AsyncTcpTransport asyncTcpTransport0 = new AsyncTcpTransport(scheduledThreadPoolExecutor0);
      asyncTcpTransport0.close();
      assertTrue(asyncTcpTransport0.isAsync());
  }
}
