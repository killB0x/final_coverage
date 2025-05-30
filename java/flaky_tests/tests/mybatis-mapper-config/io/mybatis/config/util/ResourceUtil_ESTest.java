/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:35:46 GMT 2022
 */

package io.mybatis.config.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.mybatis.config.util.ResourceUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResourceUtil_ESTest extends ResourceUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = ResourceUtil.replace("(_I@,.GWO9GJBOQa-", "(_I@,.GWO9GJBOQa-", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URL uRL0 = MockURL.URL("file", "", "file");
      URI uRI0 = ResourceUtil.toURI(uRL0);
      assertTrue(uRI0.isOpaque());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URI uRI0 = ResourceUtil.toURI("classpath:(8h");
      assertTrue(uRI0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ResourceUtil.replace((String) null, "0K", "0K");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URL uRL0 = ResourceUtil.getResource("");
      URI uRI0 = ResourceUtil.toURI(uRL0);
      assertEquals("/home/user/volume/projects/mybatis-mapper-config/target/classes/../../target/classes/", uRI0.getRawPath());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/some/fake/but/wellformed/url");
      FileSystemHandling.createFolder(evoSuiteFile0);
      URL uRL0 = MockURL.getFileExample();
      File file0 = ResourceUtil.getFile(uRL0, (String) null);
      assertTrue(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URL uRL0 = MockURL.URL("file", "rBJ{cp", "rBJ{cp");
      File file0 = ResourceUtil.getFile(uRL0, "O");
      assertEquals("rBJ{cp", file0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/some/fake/but/wellformed/url");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      URL uRL0 = MockURL.getFileExample();
      File file0 = ResourceUtil.getFile(uRL0, "Resource URL must not be null");
      assertEquals(1L, file0.length());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/some/fake/but/wellformed/url");
      FileSystemHandling.createFolder(evoSuiteFile0);
      URL uRL0 = MockURL.getFileExample();
      File file0 = ResourceUtil.getFile(uRL0);
      assertEquals("/some/fake/but/wellformed/url", file0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/some/fake/but/wellformed/url");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      URL uRL0 = MockURL.getFileExample();
      File file0 = ResourceUtil.getFile(uRL0);
      assertTrue(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/foo.bar");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "(ib7'P%e,wuc");
      URI uRI0 = MockURI.aFileURI;
      File file0 = ResourceUtil.getFile(uRI0, "");
      assertEquals(13L, file0.length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.resolve(uRI0, "");
      File file0 = ResourceUtil.getFile(uRI1, "C7HwCqh&tlyvKj/0f");
      assertTrue(file0.canWrite());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/foo.bar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      URI uRI0 = MockURI.aFileURI;
      File file0 = ResourceUtil.getFile(uRI0);
      assertTrue(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URI uRI0 = MockURI.URI("file", (String) null, "", "file", "");
      File file0 = ResourceUtil.getFile(uRI0);
      assertEquals("?file", file0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/foo.bar");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "(ib7'P%e,wuc");
      URI uRI0 = MockURI.aFileURI;
      File file0 = ResourceUtil.getFile(uRI0);
      assertEquals(0L, file0.getUsableSpace());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("iG&#:xr)n*");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "!)gD");
      File file0 = ResourceUtil.getFile("iG&#:xr)n*");
      assertEquals("iG&#:xr)n*", file0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File file0 = ResourceUtil.getFile(".X2]g-bt!)<QohJm#(:");
      assertTrue(file0.isHidden());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File file0 = ResourceUtil.getFile("");
      assertTrue(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("volume/projects/mybatis-mapper-config/target/classes/../../target/classes");
      byte[] byteArray0 = new byte[8];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = ResourceUtil.getClasspathFile("classpath:");
      assertTrue(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("volume/projects/mybatis-mapper-config/target/classes/../../target/classes");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = ResourceUtil.getClasspathFile("");
      assertEquals("/home/user/volume/projects/mybatis-mapper-config/target/classes/../../target/classes", file0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      URL uRL1 = MockURL.URL(uRL0, "tDpU>myPb6n=Y6;*w");
      try { 
        ResourceUtil.toURI(uRL1);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in path at index 43: ftp://ftp.someFakeButWellFormedURL.org/tDpU>myPb6n=Y6;*w
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        ResourceUtil.toURI("}");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in path at index 0: }
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtil.toURI((String) null);
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
        ResourceUtil.getResources((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtil.getResource((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "", uRLStreamHandler0);
      // Undeclared exception!
      try { 
        ResourceUtil.getFile(uRL1, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "4aK1MLlh$PS~", uRLStreamHandler0);
      // Undeclared exception!
      try { 
        ResourceUtil.getFile(uRL1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtil.getFile((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Resource URL must not be null
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      try { 
        ResourceUtil.getFile(uRL0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // URL cannot be resolved to absolute file path because it does not reside in the file system: http://www.someFakeButWellFormedURL.org/fooExample
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtil.getFile((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Resource URI must not be null
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      try { 
        ResourceUtil.getFile(uRI0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // URI cannot be resolved to absolute file path because it does not reside in the file system: http://foo.bar
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ResourceUtil.hasLength(":59%JB1");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = ResourceUtil.hasLength("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = ResourceUtil.hasLength((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = ResourceUtil.replace("classpath:}", "}", "o1r-c`");
      assertEquals("classpath:o1r-c`", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = ResourceUtil.replace("\"|0cRn~V", "w", "");
      assertEquals("\"|0cRn~V", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      URI uRI0 = MockURI.URI("file", "file", "file");
      File file0 = ResourceUtil.getFile(uRI0, "file");
      assertEquals("file", file0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      File file0 = ResourceUtil.getFile("classpath:");
      assertTrue(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      try { 
        ResourceUtil.getFile("classpath:classpath:pk2{3@_R!-s");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // class path resource [classpath:pk2{3@_R!-s] cannot be resolved to absolute file path because it does not exist
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassLoader classLoader0 = ResourceUtil.getDefaultClassLoader();
      assertNotNull(classLoader0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtil.toURI((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      URL uRL0 = ResourceUtil.getResource("classpath:cl)sspawh:");
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = ResourceUtil.replace("URL", "URL", "URL");
      assertEquals("URL", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      URL uRL0 = MockURL.URL("file", "file", (-1), "classpath:] *.L)QoP<-z");
      File file0 = ResourceUtil.getFile(uRL0);
      assertFalse(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = ResourceUtil.replace("classpath:classpath:io.mybatis.config.util.ResourceUtil", "classpath:classpath:io.mybatis.config.util.ResourceUtil", (String) null);
      assertEquals("classpath:classpath:io.mybatis.config.util.ResourceUtil", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = ResourceUtil.replace("HZg^\"_", (String) null, (String) null);
      assertEquals("HZg^\"_", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      URI uRI0 = ResourceUtil.toURI("");
      assertEquals("", uRI0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      try { 
        ResourceUtil.getFile(uRI0, (String) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // null cannot be resolved to absolute file path because it does not reside in the file system: http://foo.bar
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtil.getFile((URI) null, "classpath:classpath:classpath:6&wnjh)~|Y$*:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Resource URI must not be null
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URL uRL0 = MockURI.toURL(uRI0);
      try { 
        ResourceUtil.getFile(uRL0, "Z}s:\u0004:M/2");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Z}s:\u0004:M/2 cannot be resolved to absolute file path because it does not reside in the file system: http://foo.bar
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtil.getFile((URL) null, "classpath:cl)sspawh:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Resource URL must not be null
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        ResourceUtil.getClasspathFile("clas:s#paw");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // class path resource [clas:s#paw] cannot be resolved to absolute file path because it does not exist
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtil.getFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Resource location must not be null
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      File file0 = ResourceUtil.getClasspathFile("classpath:");
      assertTrue(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResourceUtil.getClasspathFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Resource location must not be null
         //
         verifyException("io.mybatis.config.util.ResourceUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ResourceUtil resourceUtil0 = new ResourceUtil();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Enumeration<URL> enumeration0 = ResourceUtil.getResources("");
      assertNotNull(enumeration0);
  }
}
