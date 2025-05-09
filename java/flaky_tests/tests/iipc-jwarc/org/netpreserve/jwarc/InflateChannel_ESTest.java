/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 01:35:26 GMT 2022
 */

package org.netpreserve.jwarc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.NonReadableChannelException;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.zip.ZipException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;
import org.netpreserve.jwarc.ChunkedBody;
import org.netpreserve.jwarc.InflateChannel;
import org.netpreserve.jwarc.LengthedBody;
import org.netpreserve.jwarc.MessageBody;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InflateChannel_ESTest extends InflateChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("T");
      InflateChannel inflateChannel0 = new InflateChannel((ReadableByteChannel) null, byteBuffer0);
      InflateChannel inflateChannel1 = new InflateChannel(inflateChannel0, byteBuffer0);
      inflateChannel1.read(byteBuffer0);
      int int0 = inflateChannel1.read(byteBuffer0);
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("C<LIM2U@ffL8D0)Zjk");
      LengthedBody lengthedBody0 = LengthedBody.create((ReadableByteChannel) null, byteBuffer0, 0L);
      InflateChannel inflateChannel0 = new InflateChannel(lengthedBody0, byteBuffer0);
      inflateChannel0.close();
      boolean boolean0 = inflateChannel0.isOpen();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      ChunkedBody chunkedBody0 = new ChunkedBody((ReadableByteChannel) null, byteBuffer0);
      ChunkedBody chunkedBody1 = chunkedBody0.strict();
      InflateChannel inflateChannel0 = new InflateChannel(chunkedBody1, byteBuffer0);
      inflateChannel0.read(byteBuffer0);
      try { 
        inflateChannel0.read(byteBuffer0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // chunked encoding at position 0: <-- HERE -->\\x00
         //
         verifyException("org.netpreserve.jwarc.ChunkedBody", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(203);
      InflateChannel inflateChannel0 = new InflateChannel((ReadableByteChannel) null, byteBuffer0);
      try { 
        inflateChannel0.read(byteBuffer0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // invalid stored block lengths
         //
         verifyException("org.netpreserve.jwarc.InflateChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
      SocketChannel socketChannel0 = SocketChannel.open();
      InflateChannel inflateChannel0 = new InflateChannel(socketChannel0, byteBuffer0);
      inflateChannel0.read(byteBuffer0);
      // Undeclared exception!
      try { 
        inflateChannel0.read(byteBuffer0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("*o{{(}(x7,!]");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      InflateChannel inflateChannel0 = new InflateChannel(fileChannel0, byteBuffer0);
      inflateChannel0.read(byteBuffer0);
      // Undeclared exception!
      try { 
        inflateChannel0.read(byteBuffer0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)1;
      byteArray0[0] = (byte)1;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      LengthedBody lengthedBody0 = LengthedBody.create(datagramChannel0, byteBuffer0, 3624L);
      ByteBuffer byteBuffer1 = lengthedBody0.buffer;
      InflateChannel inflateChannel0 = new InflateChannel(lengthedBody0, byteBuffer1);
      inflateChannel0.read(byteBuffer1);
      inflateChannel0.close();
      try { 
        inflateChannel0.read(byteBuffer0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.LengthedBody", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)1, (int) (byte)1);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      InflateChannel inflateChannel0 = new InflateChannel(socketChannel0, byteBuffer0);
      // Undeclared exception!
      try { 
        inflateChannel0.read(byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(307);
      InflateChannel inflateChannel0 = new InflateChannel((ReadableByteChannel) null, byteBuffer0);
      ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(307);
      // Undeclared exception!
      try { 
        inflateChannel0.read(byteBuffer1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      InflateChannel inflateChannel0 = new InflateChannel((ReadableByteChannel) null, byteBuffer0);
      // Undeclared exception!
      try { 
        inflateChannel0.read(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.InflateChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      LengthedBody lengthedBody0 = LengthedBody.create((ReadableByteChannel) null, byteBuffer0, 3890L);
      InflateChannel inflateChannel0 = new InflateChannel(lengthedBody0, byteBuffer0);
      // Undeclared exception!
      try { 
        inflateChannel0.read(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.LengthedBody", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      ChunkedBody chunkedBody0 = new ChunkedBody((ReadableByteChannel) null, byteBuffer0);
      InflateChannel inflateChannel0 = new InflateChannel(chunkedBody0, byteBuffer0);
      inflateChannel0.read(byteBuffer0);
      // Undeclared exception!
      try { 
        inflateChannel0.read(byteBuffer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The source buffer is this buffer
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      InflateChannel inflateChannel0 = new InflateChannel((ReadableByteChannel) null, byteBuffer0);
      // Undeclared exception!
      try { 
        inflateChannel0.isOpen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.InflateChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InflateChannel inflateChannel0 = null;
      try {
        inflateChannel0 = new InflateChannel((ReadableByteChannel) null, (ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.InflateChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      LengthedBody lengthedBody0 = LengthedBody.create(socketChannel0, byteBuffer0, 1576L);
      InflateChannel inflateChannel0 = new InflateChannel(lengthedBody0, byteBuffer0);
      // Undeclared exception!
      try { 
        inflateChannel0.read(byteBuffer0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("\"LEL.oCHg;w!ya");
      MessageBody messageBody0 = MessageBody.empty();
      InflateChannel inflateChannel0 = new InflateChannel(messageBody0, byteBuffer0);
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArray0);
      inflateChannel0.read(byteBuffer1);
      int int0 = inflateChannel0.read(byteBuffer1);
      assertEquals("java.nio.HeapByteBuffer[pos=3 lim=14 cap=14]", byteBuffer0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      InflateChannel inflateChannel0 = new InflateChannel((ReadableByteChannel) null, byteBuffer0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-37);
      ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArray0);
      InflateChannel inflateChannel1 = new InflateChannel(inflateChannel0, byteBuffer1);
      inflateChannel1.read(byteBuffer1);
      int int0 = inflateChannel1.read(byteBuffer1);
      assertArrayEquals(new byte[] {(byte) (-80), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)1, (int) (byte)1);
      InflateChannel inflateChannel0 = new InflateChannel(socketChannel0, byteBuffer0);
      int int0 = inflateChannel0.read(byteBuffer0);
      assertEquals(2, byteBuffer0.position());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      InflateChannel inflateChannel0 = null;
      try {
        inflateChannel0 = new InflateChannel((ReadableByteChannel) null, byteBuffer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ByteBuffer must be array-backed and writable
         //
         verifyException("org.netpreserve.jwarc.InflateChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("T");
      InflateChannel inflateChannel0 = new InflateChannel((ReadableByteChannel) null, byteBuffer0);
      // Undeclared exception!
      try { 
        inflateChannel0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.InflateChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)1, (int) (byte)1);
      InflateChannel inflateChannel0 = new InflateChannel(socketChannel0, byteBuffer0);
      boolean boolean0 = inflateChannel0.isOpen();
      assertTrue(boolean0);
  }
}
