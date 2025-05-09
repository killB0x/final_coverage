/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 18:12:57 GMT 2022
 */

package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.net.QCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QCodec_ESTest extends QCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)113;
      byteArray0[4] = (byte)95;
      byte[] byteArray1 = qCodec0.doDecoding(byteArray0);
      assertFalse(qCodec0.isEncodeBlanks());
      assertArrayEquals(new byte[] {(byte)0, (byte)113, (byte)0, (byte)0, (byte)32, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      assertFalse(qCodec0.isEncodeBlanks());
      
      qCodec0.setEncodeBlanks(true);
      boolean boolean0 = qCodec0.isEncodeBlanks();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QCodec qCodec0 = new QCodec((Charset) null);
      qCodec0.getCharset();
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = qCodec0.encode("", charset0);
      assertNotNull(string0);
      assertEquals("=?US-ASCII?Q??=", string0);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.encode("UTF-8", "UTF-8");
      assertFalse(qCodec0.isEncodeBlanks());
      assertEquals("=?UTF-8?Q?UTF-8?=", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = qCodec0.doEncoding(byteArray0);
      assertFalse(qCodec0.isEncodeBlanks());
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      byte[] byteArray0 = new byte[0];
      qCodec0.doDecoding(byteArray0);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      String string0 = qCodec0.decode("=?US-ASCII?Q?%z=5FPJf;|f>x?=");
      assertFalse(qCodec0.isEncodeBlanks());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QCodec qCodec0 = new QCodec((Charset) null);
      // Undeclared exception!
      try { 
        qCodec0.getDefaultCharset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.net.QCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encode("S", "S");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // S
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encode("RFC 1522 violation: charset token not found", "RFC 1522 violation: charset token not found");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // RFC 1522 violation: charset token not found
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QCodec qCodec0 = new QCodec((Charset) null);
      // Undeclared exception!
      try { 
        qCodec0.encode("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QCodec qCodec0 = new QCodec((Charset) null);
      // Undeclared exception!
      try { 
        qCodec0.encode((Object) ",@_!.%1yK/KPWe");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)61;
      try { 
        qCodec0.doDecoding(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid quoted-printable encoding
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decode("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: malformed encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QCodec qCodec0 = null;
      try {
        qCodec0 = new QCodec("?=");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ?=
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QCodec qCodec0 = null;
      try {
        qCodec0 = new QCodec((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.decode("=?US-ASCII?Q??=");
      assertNotNull(string0);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encode("Objects of type ", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QCodec qCodec0 = new QCodec("UTF-8");
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Object object0 = new Object();
      try { 
        qCodec0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be decoded using Q codec
         //
         verifyException("org.apache.commons.codec.net.QCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.decode((Object) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Object object0 = new Object();
      try { 
        qCodec0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be encoded using Q codec
         //
         verifyException("org.apache.commons.codec.net.QCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.encode((Object) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.decode((String) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Object object0 = qCodec0.decode((Object) "=?UTF-8?Q?UTF-8?=");
      assertFalse(qCodec0.isEncodeBlanks());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.encode((String) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.encode((String) null, (String) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encode("", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Charset charset0 = qCodec0.getCharset();
      qCodec0.encode((String) null, charset0);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.doDecoding((byte[]) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      assertFalse(qCodec0.isEncodeBlanks());
      
      qCodec0.setEncodeBlanks(true);
      qCodec0.encode(" cannot b enoe gsig Q coec");
      assertTrue(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.doEncoding((byte[]) null);
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Object object0 = qCodec0.encode((Object) "UTF-8");
      assertNotNull(object0);
      assertFalse(qCodec0.isEncodeBlanks());
      assertEquals("=?UTF-8?Q?UTF-8?=", object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      assertFalse(qCodec0.isEncodeBlanks());
      
      qCodec0.setEncodeBlanks(true);
      byte[] byteArray0 = new byte[2];
      qCodec0.doEncoding(byteArray0);
      assertTrue(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      boolean boolean0 = qCodec0.isEncodeBlanks();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.getDefaultCharset();
      assertFalse(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QCodec qCodec0 = null;
      try {
        qCodec0 = new QCodec("org.apache.commons.codec.net.QCodec");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.net.QCodec
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.getEncoding();
      assertFalse(qCodec0.isEncodeBlanks());
      assertEquals("Q", string0);
  }
}
