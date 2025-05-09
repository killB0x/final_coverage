/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 11:57:27 GMT 2022
 */

package com.j256.simplemagic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.j256.simplemagic.ContentType;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ContentType_ESTest extends ContentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContentType[] contentTypeArray0 = ContentType.values();
      assertEquals(768, contentTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContentType contentType0 = ContentType.valueOf("ARC");
      assertEquals("arc", contentType0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContentType contentType0 = ContentType.G3;
      String string0 = contentType0.getSimpleName();
      assertEquals("g3", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContentType contentType0 = ContentType.fromMimeType("h(");
      assertEquals(ContentType.OTHER, contentType0);
      
      contentType0.getFileExtensions();
      assertEquals("application/octet-stream", contentType0.getMimeType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ContentType.fromFileExtension((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.j256.simplemagic.ContentType", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContentType contentType0 = ContentType.GPH;
      List<String> list0 = contentType0.getReferenceUrls();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContentType contentType0 = ContentType.fromMimeType("h(");
      assertEquals(ContentType.OTHER, contentType0);
      
      List<String> list0 = contentType0.getReferenceUrls();
      assertNotNull(list0);
      assertEquals("application/octet-stream", contentType0.getMimeType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContentType contentType0 = ContentType.SNF;
      List<String> list0 = contentType0.getReferences();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContentType contentType0 = ContentType.fromMimeType("h(");
      assertEquals(ContentType.OTHER, contentType0);
      
      contentType0.getReferences();
      assertEquals("application/octet-stream", contentType0.getMimeType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContentType contentType0 = ContentType.fromFileExtension("");
      assertEquals(ContentType.OTHER, contentType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContentType contentType0 = ContentType.fromFileExtension("s3m");
      assertEquals(ContentType.S3M, contentType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContentType contentType0 = ContentType.fromMimeType("application/x-gzip");
      assertEquals(ContentType.GZIP, contentType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContentType contentType0 = ContentType.fromMimeType((String) null);
      assertEquals(ContentType.OTHER, contentType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContentType contentType0 = ContentType.ZAZ;
      String[] stringArray0 = contentType0.getFileExtensions();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ContentType contentType0 = ContentType.APPLE_QUICKTIME_IMAGE;
      String string0 = contentType0.getSimpleName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ContentType contentType0 = ContentType.PKCS12;
      String string0 = contentType0.getMimeType();
      assertEquals("application/x-pkcs12", string0);
  }
}
