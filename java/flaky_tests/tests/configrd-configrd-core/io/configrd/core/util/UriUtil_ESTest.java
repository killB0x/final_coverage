/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 03:05:01 GMT 2022
 */

package io.configrd.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.configrd.core.util.UriUtil;
import java.net.URI;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UriUtil_ESTest extends UriUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.buildURI("Gseb1VAA,Wuyq67W", "LCshsZv164VJpYFA", "b: L2)eBtsl:{naicf", 0, "Uri doesn't contain root uri to offset path from.", "J`dVMGi!", "j6`9JaMm");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in opaque part at index 2: b: L2)eBtsl:{naicf://Uri doesn't contain root uri to offset path from.J`dVMGi!/j6`9JaMm
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URI uRI0 = UriUtil.buildURI(".", "p/JS", "io.configrd.core.util.UriUtil", 1, "", "p/JS", "//");
      URI uRI1 = UriUtil.stripFile(uRI0);
      assertSame(uRI1, uRI0);
      assertEquals("io.configrd.core.util.UriUtil:p/JS////", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.relativize(uRI0, uRI0);
      URI uRI2 = UriUtil.stripFile(uRI1);
      assertNotSame(uRI0, uRI2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URI uRI0 = UriUtil.buildURI(">cyb!8~'YaJ,1|\")", "", "file", 1039, "io.configrd.core.util.StringUtils", "", "");
      URI uRI1 = UriUtil.stripFile(uRI0);
      assertEquals("file://io.configrd.core.util.StringUtils:1039", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = UriUtil.isURI("[yN%TrNVyDTAEF");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      boolean boolean0 = UriUtil.hasFile(uRI0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URI uRI0 = MockURI.URI((String) null, "", "xR8c|7>");
      boolean boolean0 = UriUtil.hasFile(uRI0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      String string0 = UriUtil.getUsername(uRI0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URI uRI0 = MockURI.URI("I", "m*H{{P0Iy<3", "IO w");
      URI uRI1 = UriUtil.getRoot(uRI0);
      assertEquals("I:m*H%7B%7BP0Iy%3C3#IO%20w", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      String string0 = UriUtil.getPathWihoutFile(uRI0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URI uRI0 = MockURI.URI("Inul.", "Inul.", "Inul.");
      URI uRI1 = MockURI.create("Inul.");
      String string0 = UriUtil.getPath(uRI0, uRI1);
      assertEquals(":#", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.relativize(uRI0, uRI0);
      String string0 = UriUtil.getPath(uRI1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URI uRI0 = UriUtil.buildURI(">cyb!8~'YaJ,1|\")", "", "file", 1039, "io.configrd.core.util.StringUtils", "", "");
      URI uRI1 = UriUtil.getRoot(uRI0);
      assertEquals("file://io.configrd.core.util.StringUtils:1039", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.validate("Uri doesn't contain root uri to offset path from.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 3: Uri doesn't contain root uri to offset path from.
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URI uRI0 = MockURI.URI("http://foo.bar", "http://foo.bar", "http://foo.bar");
      // Undeclared exception!
      try { 
        UriUtil.stripFile(uRI0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No value present
         //
         verifyException("java.util.Optional", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.stripFile((URI) null);
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
      URI uRI0 = MockURI.URI("o.configrd.core.util.SinUils", "o.configrd.core.util.SinUils", "o.configrd.core.util.SinUils");
      // Undeclared exception!
      try { 
        UriUtil.stripFile(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected scheme name at index 0: :#
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.hasFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.configrd.core.util.UriUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getUsername((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getRoot((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      // Undeclared exception!
      try { 
        UriUtil.getRoot(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected authority at index 7: file://
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getPathWihoutFile((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getPath((URI) null, (URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getPath((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getPassword((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getLastDirSegment((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getFileName((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getFileName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.configrd.core.util.UriUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.getDirSegements((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.buildURI((String) null, (String) null, (String) null, 2770, (String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = UriUtil.hasFile("/*/.");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = UriUtil.hasFile("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      Optional<String> optional0 = UriUtil.getFileName(uRI0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      Optional<String> optional0 = UriUtil.getFileName(uRI0);
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Optional<String> optional0 = UriUtil.getFileName("SKn}qI/B.\"Bm");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Optional<String> optional0 = UriUtil.getFileName(".#l]b9~8w0");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Optional<String> optional0 = UriUtil.getFileName("");
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = UriUtil.getDirSegements("X*O;^/0t6$RY");
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = UriUtil.getDirSegements("");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = UriUtil.getDirSegements("Uri doesn't contain root uri to offset path from.");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      URI uRI0 = MockURI.URI("Inul.", "Inul.", "Inul.");
      String string0 = UriUtil.getPath(uRI0);
      assertEquals("Inul.", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.hasFile((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate(uRI0);
      boolean boolean0 = uriUtil_UriValidator0.invalid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      UriUtil.UriValidator uriUtil_UriValidator0 = new UriUtil.UriValidator(uRI0);
      String[] stringArray0 = UriUtil.getDirSegements(uRI0);
      uriUtil_UriValidator0.isScheme(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate(uRI0);
      String[] stringArray0 = new String[1];
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.isScheme(stringArray0);
      boolean boolean0 = uriUtil_UriValidator1.valid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      URI uRI0 = MockURI.URI("G");
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate(uRI0);
      String[] stringArray0 = UriUtil.getDirSegements(uRI0);
      uriUtil_UriValidator0.isScheme(stringArray0);
      boolean boolean0 = uriUtil_UriValidator0.valid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate(uRI0);
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.isAbsolute();
      boolean boolean0 = uriUtil_UriValidator1.valid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      URI uRI0 = MockURI.URI("null", "W4l*hjWD38k7%x", "W4l*hjWD38k7%x");
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate(uRI0);
      uriUtil_UriValidator0.isAbsolute();
      boolean boolean0 = uriUtil_UriValidator0.valid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate("0");
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.isAbsolute();
      boolean boolean0 = uriUtil_UriValidator1.valid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate(uRI0);
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.hasScheme();
      boolean boolean0 = uriUtil_UriValidator1.valid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate("r");
      uriUtil_UriValidator0.hasScheme();
      boolean boolean0 = uriUtil_UriValidator0.valid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate((URI) null);
      boolean boolean0 = uriUtil_UriValidator0.invalid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      URI uRI0 = MockURI.URI("I", "I", "p/JS", 1, (String) null, (String) null, "I");
      String string0 = UriUtil.getUsername(uRI0);
      assertEquals("I", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      URI uRI0 = MockURI.URI("ftp", "G:G", "ftp", 632, (String) null, (String) null, (String) null);
      String string0 = UriUtil.getUsername(uRI0);
      assertEquals("G", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      URI uRI0 = MockURI.URI((String) null, "", "io.configrd.core.util.StringUtils/", 2245, "", "G:G:G:G", "");
      String string0 = UriUtil.getUsername(uRI0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      URI uRI0 = MockURI.URI("io.configrd.core.util.StringUtils", "io.configrd.core.util.StringUtils", "io.configrd.core.util.StringUtils", 2225, (String) null, "io.configrd.core.util.StringUtils", "io.configrd.core.util.StringUtils");
      String string0 = UriUtil.getPassword(uRI0);
      assertEquals("io.configrd.core.util.StringUtils", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      URI uRI0 = MockURI.URI((String) null, "G:G::G", "o.configrd.core.util.StringUils", 2225, (String) null, "W,=U/-<fhe_F", "W,=U/-<fhe_F");
      String string0 = UriUtil.getPassword(uRI0);
      assertEquals("G", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      URI uRI0 = UriUtil.buildURI("p/JS", "p/JS", "p/JS", 1, "p/JS", "p/JS", "p/JS");
      UriUtil.getPassword(uRI0);
      assertEquals("p/JS://p/JS:1p/JS/p/JS", uRI0.getRawPath());
      assertEquals("p/JS://p/JS:1p/JS/p/JS", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      URI uRI0 = MockURI.URI("ftp", "G:G", "ftp", 632, (String) null, (String) null, (String) null);
      // Undeclared exception!
      try { 
        UriUtil.getLastDirSegment(uRI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 0
         //
         verifyException("io.configrd.core.util.UriUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      URI uRI0 = MockURI.URI("null");
      URI uRI1 = UriUtil.getRoot(uRI0);
      assertEquals("null", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      URI uRI0 = MockURI.create("M1XmM8e:I]s");
      URI uRI1 = UriUtil.getRoot(uRI0);
      assertEquals("M1XmM8e:/", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      URI uRI0 = UriUtil.buildURI("[6/$]&_Zq;EP~9N", "file:", (String) null, 1, "X:0#0", ":", "//");
      URI uRI1 = UriUtil.getRoot(uRI0);
      assertEquals(0, uRI0.getPort());
      assertEquals("null://X:0#0:1:////", uRI1.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.aFTPURI;
      // Undeclared exception!
      try { 
        UriUtil.getPath(uRI1, uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Uri doesn't contain root uri to offset path from.
         //
         verifyException("io.configrd.core.util.UriUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      URI uRI0 = MockURI.URI("Inul.", "Inul.", "Inul.");
      String string0 = UriUtil.getPath(uRI0, uRI0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      URI uRI0 = UriUtil.buildURI("M{", "M{", (String) null, (-1484), "//", "//", ":");
      String string0 = UriUtil.getPathWihoutFile(uRI0);
      assertEquals("////:", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      UriUtil.UriValidator uriUtil_UriValidator0 = new UriUtil.UriValidator("p/JS");
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.hasUsername();
      assertSame(uriUtil_UriValidator1, uriUtil_UriValidator0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      UriUtil.UriValidator uriUtil_UriValidator0 = new UriUtil.UriValidator("X");
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.hasHost();
      assertSame(uriUtil_UriValidator0, uriUtil_UriValidator1);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate(uRI0);
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.hasPassword();
      assertSame(uriUtil_UriValidator1, uriUtil_UriValidator0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      URI uRI0 = MockURI.URI("null", "null", "w`/");
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate(uRI0);
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.hasScheme();
      boolean boolean0 = uriUtil_UriValidator1.valid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      UriUtil.UriValidator uriUtil_UriValidator0 = UriUtil.validate((URI) null);
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.hasFile();
      assertSame(uriUtil_UriValidator1, uriUtil_UriValidator0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      UriUtil.UriValidator uriUtil_UriValidator0 = new UriUtil.UriValidator("X");
      UriUtil.UriValidator uriUtil_UriValidator1 = uriUtil_UriValidator0.hasPath();
      assertSame(uriUtil_UriValidator1, uriUtil_UriValidator0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      // Undeclared exception!
      try { 
        UriUtil.validate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      UriUtil uriUtil0 = new UriUtil();
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      URI uRI0 = MockURI.URI("io.configrd.core.util.StringUtils", "io.configrd.core.util.StringUtils", "io.configrd.core.util.StringUtils");
      // Undeclared exception!
      try { 
        UriUtil.getPathWihoutFile(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected scheme name at index 0: :#
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      URI uRI0 = UriUtil.buildURI("HDt|]<9vaU>7gn'", "wa8,xRi.;O9O", "G:G:G:G", 2495, "+@croz_6JVYkV+v", "G:G:G:G", "io.configrd.core.util.StringUtils");
      String string0 = UriUtil.getLastDirSegment(uRI0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      boolean boolean0 = UriUtil.isURI("");
      assertTrue(boolean0);
  }
}
