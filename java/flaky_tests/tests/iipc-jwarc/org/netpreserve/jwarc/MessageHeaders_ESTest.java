/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 01:12:30 GMT 2022
 */

package org.netpreserve.jwarc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.NonReadableChannelException;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SocketChannel;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;
import org.netpreserve.jwarc.ChunkedBody;
import org.netpreserve.jwarc.LengthedBody;
import org.netpreserve.jwarc.MessageBody;
import org.netpreserve.jwarc.MessageHeaders;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MessageHeaders_ESTest extends MessageHeaders_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("2v}ub,k)u");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("2v}ub,k)u", linkedList0);
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      boolean boolean0 = messageHeaders0.contains("2v}ub,k)u", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      hashMap0.put("", (List<String>) null);
      List<String> list0 = messageHeaders0.all("");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("");
      hashMap0.put("", linkedList0);
      List<String> list0 = messageHeaders0.all("");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = new Locale("~?JE=Zz%QuqmU8X/~", "");
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      hashMap0.put("~?JE=Zz%QuqmU8X/~", list0);
      List<String> list1 = messageHeaders0.all("~?JE=Zz%QuqmU8X/~");
      assertTrue(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      hashMap0.put("", (List<String>) null);
      // Undeclared exception!
      try { 
        messageHeaders0.sole("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.MessageHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      ChunkedBody chunkedBody0 = new ChunkedBody(socketChannel0, byteBuffer0);
      // Undeclared exception!
      try { 
        MessageHeaders.parse(chunkedBody0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("M(sj'yx$YSyS!6Wb_#P");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      // Undeclared exception!
      try { 
        MessageHeaders.parse(fileChannel0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessageBody messageBody0 = MessageBody.empty();
      ((LengthedBody) messageBody0).close();
      try { 
        MessageHeaders.parse(messageBody0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.LengthedBody", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        MessageHeaders.parse((ReadableByteChannel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.MessageHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      LengthedBody lengthedBody0 = LengthedBody.create((ReadableByteChannel) null, byteBuffer0, 17L);
      // Undeclared exception!
      try { 
        MessageHeaders.parse(lengthedBody0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.LengthedBody", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)67;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      LengthedBody lengthedBody0 = LengthedBody.create((ReadableByteChannel) null, byteBuffer0, (byte)67);
      ChunkedBody chunkedBody0 = new ChunkedBody(lengthedBody0, byteBuffer0);
      // Undeclared exception!
      try { 
        MessageHeaders.parse(chunkedBody0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The source buffer is this buffer
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = mockFileInputStream0.getChannel();
      try { 
        MessageHeaders.parse(fileChannel0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        MessageHeaders.format((Map<String, List<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.MessageHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      hashMap0.put("", (List<String>) null);
      // Undeclared exception!
      try { 
        messageHeaders0.first("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.MessageHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast((String) null);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("D<.Uqt\"", linkedList0);
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      // Undeclared exception!
      try { 
        messageHeaders0.contains("D<.Uqt\"", "D<.Uqt\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("2v}ub,k)u");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("HU CE(6$0R~i;h2!-", linkedList0);
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "HU CE(6$0R~i;h2!-");
      // Undeclared exception!
      try { 
        messageHeaders0.appendTo(charBuffer0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("2v}ub,k)u");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("2v}ub,k)u", linkedList0);
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        messageHeaders0.appendTo(charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("2v}ub,k)u");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("2v}ub,k)u", linkedList0);
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      // Undeclared exception!
      try { 
        messageHeaders0.appendTo((Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.MessageHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageHeaders messageHeaders0 = null;
      try {
        messageHeaders0 = new MessageHeaders((Map<String, List<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.MessageHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MessageBody messageBody0 = MessageBody.empty();
      MessageHeaders messageHeaders0 = MessageHeaders.parse(messageBody0);
      List<String> list0 = messageHeaders0.all("~?JE=Zz%QuqmU8X/~");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("`QU9@&~h\"t'e._7H");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("WARC-Segment-Number", linkedList0);
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      StringWriter stringWriter0 = new StringWriter(241);
      messageHeaders0.appendTo(stringWriter0);
      assertEquals("WARC-Segment-Number: `QU9@&~h\"t'e._7H\r\n", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("2v}ub,k)u");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("2v}ub,k)u", linkedList0);
      String string0 = MessageHeaders.format(hashMap0);
      assertEquals("2v}ub,k)u: 2v}ub,k)u\r\n", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("2v}ub,k)u", linkedList0);
      String string0 = MessageHeaders.format(hashMap0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageBody messageBody0 = MessageBody.empty();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)67;
      byteArray0[1] = (byte)67;
      byteArray0[2] = (byte)67;
      byteArray0[3] = (byte)67;
      byteArray0[4] = (byte)67;
      byteArray0[5] = (byte)67;
      byteArray0[6] = (byte)67;
      byteArray0[7] = (byte)67;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      LengthedBody lengthedBody0 = LengthedBody.create(messageBody0, byteBuffer0, (byte)67);
      try { 
        MessageHeaders.parse(lengthedBody0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // expected 59 more bytes in file
         //
         verifyException("org.netpreserve.jwarc.LengthedBody", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MessageBody messageBody0 = MessageBody.empty();
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      LengthedBody lengthedBody0 = LengthedBody.create(messageBody0, byteBuffer0, (byte)67);
      try { 
        MessageHeaders.parse(lengthedBody0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid WARC fields
         //
         verifyException("org.netpreserve.jwarc.MessageHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("2v}ubk");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("2v}ubk", linkedList0);
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      boolean boolean0 = messageHeaders0.contains("2v}ubk", "2v}ubk");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("\"hco1&q]g_me");
      linkedList0.offerLast("2Qv.}ub,k)u");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("2Qv.}ub,k)u", linkedList0);
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      // Undeclared exception!
      try { 
        messageHeaders0.sole("2Qv.}ub,k)u");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // record has 2 2Qv.}ub,k)u headers
         //
         verifyException("org.netpreserve.jwarc.MessageHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MessageBody messageBody0 = MessageBody.empty();
      MessageHeaders messageHeaders0 = MessageHeaders.parse(messageBody0);
      Optional<String> optional0 = messageHeaders0.sole("~?JE=Zz%QuqmU8X/~");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      MessageHeaders messageHeaders0 = new MessageHeaders(hashMap0);
      String string0 = messageHeaders0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MessageBody messageBody0 = MessageBody.empty();
      MessageHeaders messageHeaders0 = MessageHeaders.parse(messageBody0);
      Map<String, List<String>> map0 = messageHeaders0.map();
      MessageHeaders messageHeaders1 = null;
      try {
        messageHeaders1 = new MessageHeaders(map0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MessageBody messageBody0 = MessageBody.empty();
      MessageHeaders messageHeaders0 = MessageHeaders.parse(messageBody0);
      Optional<String> optional0 = messageHeaders0.first("Jnx[w[QV3$");
      assertNotNull(optional0);
  }
}
