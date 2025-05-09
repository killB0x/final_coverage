/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 00:42:34 GMT 2022
 */

package org.netpreserve.jwarc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.netpreserve.jwarc.MediaType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MediaType_ESTest extends MediaType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTTP_RESPONSE;
      mediaType0.hashCode();
      mediaType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTML_UTF8;
      mediaType0.hashCode();
      MediaType mediaType1 = MediaType.JSON;
      mediaType1.JSON.hashCode();
      boolean boolean0 = mediaType1.equals(mediaType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        MediaType.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.netpreserve.jwarc.MediaType", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTML_UTF8;
      mediaType0.hashCode();
      MediaType mediaType1 = MediaType.JSON;
      mediaType1.JSON.hashCode();
      boolean boolean0 = mediaType0.equals(mediaType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTML_UTF8;
      mediaType0.hashCode();
      mediaType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTTP_RESPONSE;
      MediaType mediaType1 = mediaType0.base();
      boolean boolean0 = mediaType0.equals(mediaType1);
      assertFalse(boolean0);
      assertEquals("application", mediaType1.type());
      assertEquals("http", mediaType1.subtype());
      assertFalse(mediaType1.equals((Object)mediaType0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTTP_RESPONSE;
      mediaType0.hashCode();
      MediaType mediaType1 = MediaType.JSON;
      boolean boolean0 = mediaType0.equals(mediaType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MediaType mediaType0 = MediaType.OCTET_STREAM;
      MediaType mediaType1 = mediaType0.base();
      mediaType1.hashCode();
      boolean boolean0 = mediaType1.equals(mediaType0);
      assertTrue(boolean0);
      assertTrue(mediaType0.equals((Object)mediaType1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTML_UTF8;
      Object object0 = new Object();
      boolean boolean0 = mediaType0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MediaType mediaType0 = MediaType.WARC_FIELDS;
      boolean boolean0 = mediaType0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTTP_RESPONSE;
      MediaType.OCTET_STREAM = mediaType0;
      boolean boolean0 = mediaType0.equals(MediaType.OCTET_STREAM);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MediaType mediaType0 = MediaType.parse("t$x|/html;charslt=utf08s");
      MediaType mediaType1 = MediaType.HTML;
      boolean boolean0 = mediaType1.equals(mediaType0);
      assertEquals("t$x|", mediaType0.type());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MediaType mediaType0 = MediaType.parse("application/http");
      assertEquals("application", mediaType0.type());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        MediaType.parse("Y(+-PR<fm");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // parse error at position 1: Y<-- HERE -->(+-PR<fm
         //
         verifyException("org.netpreserve.jwarc.MediaType", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        MediaType.parse("f/y+Hl0._z* I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // parse error at position 12: f/y+Hl0._z* <-- HERE -->I
         //
         verifyException("org.netpreserve.jwarc.MediaType", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        MediaType.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // parse error at position 0: <-- HERE -->
         //
         verifyException("org.netpreserve.jwarc.MediaType", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTTP_REQUEST;
      String string0 = mediaType0.type();
      assertEquals("application", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTTP_REQUEST;
      String string0 = mediaType0.subtype();
      assertEquals("http", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTML_UTF8;
      Map<String, String> map0 = mediaType0.parameters();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MediaType mediaType0 = MediaType.HTTP_RESPONSE;
      String string0 = mediaType0.toString();
      assertEquals("application/http;msgtype=response", string0);
  }
}
