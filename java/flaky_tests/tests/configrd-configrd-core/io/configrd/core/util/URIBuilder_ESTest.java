/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 03:02:14 GMT 2022
 */

package io.configrd.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.configrd.core.util.URIBuilder;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class URIBuilder_ESTest extends URIBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      URIBuilder uRIBuilder1 = uRIBuilder0.setFileName("/");
      boolean boolean0 = uRIBuilder1.hasFileName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create();
      String string0 = uRIBuilder0.getFileName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create("");
      URIBuilder uRIBuilder1 = uRIBuilder0.setFileName("");
      String string0 = uRIBuilder1.getFileName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create();
      URIBuilder uRIBuilder1 = uRIBuilder0.setScheme("//");
      URI uRI0 = uRIBuilder1.build("//");
      assertEquals("//:/", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create("io.configrd.core.util.StringUtils");
      URI uRI0 = uRIBuilder0.build();
      assertEquals("null:io.configrd.core.util.StringUtils", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create();
      uRIBuilder0.setScheme("//");
      URI uRI0 = uRIBuilder0.build();
      assertEquals((-1), uRI0.getPort());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      URIBuilder uRIBuilder1 = uRIBuilder0.setPort(1);
      URI uRI1 = uRIBuilder1.build();
      assertEquals("http://foo.bar:1/", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create();
      uRIBuilder0.setHost(".");
      // Undeclared exception!
      try { 
        uRIBuilder0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      // Undeclared exception!
      try { 
        uRIBuilder0.setPath(".", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.configrd.core.util.URIBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create();
      // Undeclared exception!
      try { 
        uRIBuilder0.setPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.configrd.core.util.UriUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        URIBuilder.create((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        URIBuilder.create((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        URIBuilder.create(".76:}//");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in scheme name at index 0: .76:}//
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      URIBuilder uRIBuilder1 = uRIBuilder0.setHost("8w+&eaCJ^|5");
      // Undeclared exception!
      try { 
        uRIBuilder1.build("8w+&eaCJ^|5");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      URIBuilder uRIBuilder1 = uRIBuilder0.setPort(2197);
      // Undeclared exception!
      try { 
        uRIBuilder1.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URIBuilder uRIBuilder0 = null;
      try {
        uRIBuilder0 = new URIBuilder((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URI uRI0 = MockURI.URI("a", ":", "a", 3124, "////", ":", "/.:.:7P@/bmVgG<v@./@/");
      URIBuilder uRIBuilder0 = null;
      try {
        uRIBuilder0 = new URIBuilder(uRI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("io.configrd.core.util.UriUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create();
      String[] stringArray0 = new String[0];
      uRIBuilder0.setFragment(stringArray0);
      // Undeclared exception!
      try { 
        uRIBuilder0.build("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected scheme-specific part at index 5: null:
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      String[] stringArray0 = new String[3];
      stringArray0[2] = ".";
      uRIBuilder0.setPath("MSX_^8km0y", stringArray0);
      // Undeclared exception!
      try { 
        uRIBuilder0.build("/7/@/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in opaque part at index 9: null:MSX_^8km0y/7/@/.
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      uRIBuilder0.setHost("/");
      // Undeclared exception!
      try { 
        uRIBuilder0.build("./}P{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 10: null:///./}P{/
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      String[] stringArray0 = new String[9];
      stringArray0[1] = "#";
      URIBuilder uRIBuilder1 = uRIBuilder0.setPath(":", stringArray0);
      assertSame(uRIBuilder0, uRIBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "/";
      URIBuilder uRIBuilder1 = uRIBuilder0.setPath("J$=rk*ye7", stringArray0);
      assertSame(uRIBuilder1, uRIBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create();
      String[] stringArray0 = new String[0];
      uRIBuilder0.setFragment(stringArray0);
      // Undeclared exception!
      try { 
        uRIBuilder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected scheme-specific part at index 5: null:
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      String[] stringArray0 = new String[3];
      URIBuilder uRIBuilder1 = uRIBuilder0.setFragment(stringArray0);
      URI uRI1 = uRIBuilder1.build();
      assertEquals("http://foo.bar/#null,null,null", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      uRIBuilder0.setPath("/io.configrd.core.util.uriutil");
      URI uRI1 = uRIBuilder0.build();
      assertEquals("http://foo.bar/io.configrd.core.util.uriutil", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      String[] stringArray0 = new String[4];
      URIBuilder uRIBuilder1 = uRIBuilder0.setPath("J$=rk*ye7", stringArray0);
      uRIBuilder1.setFileName("/");
      URI uRI1 = uRIBuilder1.build("/");
      //  // Unstable assertion: assertEquals("ftp://foo.bar/J$=rk*ye7//", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create(".");
      URI uRI0 = uRIBuilder0.build(".");
      assertEquals("null:/.", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create();
      uRIBuilder0.setHost("/");
      String string0 = uRIBuilder0.toString();
      assertEquals("null:///", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      URIBuilder uRIBuilder1 = uRIBuilder0.setFileNameIfMissing("R");
      assertEquals("R", uRIBuilder1.getFileName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      URIBuilder uRIBuilder1 = uRIBuilder0.setFileName(":");
      URIBuilder uRIBuilder2 = uRIBuilder1.setFileNameIfMissing("./}P{");
      assertEquals(":", uRIBuilder2.getFileName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      uRIBuilder0.setPasswordIfMissing(".");
      uRIBuilder0.setUsername(".");
      String string0 = uRIBuilder0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      uRIBuilder0.setUsernameIfMissing("/");
      uRIBuilder0.setPath("/");
      URI uRI0 = uRIBuilder0.build("/");
      assertEquals("null:///@/", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      URIBuilder uRIBuilder1 = uRIBuilder0.setUsername(".");
      URIBuilder uRIBuilder2 = uRIBuilder0.setUsernameIfMissing("/://.:.@R:1/R");
      assertSame(uRIBuilder2, uRIBuilder1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      String[] stringArray0 = new String[7];
      uRIBuilder0.setFragment(stringArray0);
      URI uRI0 = uRIBuilder0.build("7vE&T.GqE!zT");
      assertEquals("null:/7vE&T.GqE!zT#null,null,null,null,null,null,null", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      URIBuilder uRIBuilder0 = new URIBuilder(uRI0);
      String string0 = uRIBuilder0.getFileName();
      assertEquals("foo.bar", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      URIBuilder uRIBuilder1 = uRIBuilder0.setPassword("/");
      assertSame(uRIBuilder1, uRIBuilder0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      URIBuilder uRIBuilder1 = uRIBuilder0.setPort(1663);
      URI uRI1 = uRIBuilder1.build("/");
      //  // Unstable assertion: assertEquals("ftp://foo.bar:1663/", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create(".@/");
      URI uRI0 = uRIBuilder0.build(".@/");
      assertEquals("null:.@/.@/", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      URIBuilder uRIBuilder0 = URIBuilder.create();
      URIBuilder uRIBuilder1 = uRIBuilder0.setPassword("io.configrd.core.util.StringUtils");
      URIBuilder uRIBuilder2 = uRIBuilder1.setPasswordIfMissing("io.configrd.core.util.StringUtils");
      assertSame(uRIBuilder2, uRIBuilder1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      // Undeclared exception!
      try { 
        uRIBuilder0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected scheme-specific part at index 5: null:
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URIBuilder uRIBuilder0 = URIBuilder.create(uRI0);
      uRIBuilder0.setFileName("/");
      URI uRI1 = uRIBuilder0.build("/");
      //  // Unstable assertion: assertEquals("ftp://foo.bar//", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      URIBuilder uRIBuilder0 = new URIBuilder();
      boolean boolean0 = uRIBuilder0.hasFileName();
      assertFalse(boolean0);
  }
}
