/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 05:26:57 GMT 2022
 */

package au.com.anthonybruno.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import au.com.anthonybruno.utils.TextFile;
import java.io.File;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TextFile_ESTest extends TextFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      File file0 = MockFile.createTempFile("au.com.anthonybruno.utils.Lazy", "");
      TextFile textFile0 = new TextFile(file0);
      Writer writer0 = textFile0.getWriter();
      assertNotNull(writer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/au.com.anthonybruno.utils.Lazy0");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "au.com.anthonybruno.utils.Lazy");
      File file0 = MockFile.createTempFile("au.com.anthonybruno.utils.Lazy", "");
      TextFile textFile0 = new TextFile(file0);
      String string0 = textFile0.getText();
      assertEquals("au.com.anthonybruno.utils.Lazy\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = MockFile.createTempFile("F5VkXKN=", "F5VkXKN=");
      TextFile textFile0 = new TextFile(file0, (Charset) null);
      // Undeclared exception!
      try { 
        textFile0.getText();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.io.InputStreamReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      TextFile textFile0 = new TextFile(mockFile0);
      // Undeclared exception!
      try { 
        textFile0.getText();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.io.FileNotFoundException
         //
         verifyException("au.com.anthonybruno.utils.TextFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile("au.com.anthonybruno.utils.Lazy", "au.com.anthonybruno.utils.Lazy");
      FileSystemHandling.shouldAllThrowIOExceptions();
      Charset charset0 = Charset.defaultCharset();
      TextFile textFile0 = new TextFile(file0, charset0);
      // Undeclared exception!
      try { 
        textFile0.getText();
        fail("Expecting exception: UncheckedIOException");
      
      } catch(UncheckedIOException e) {
         //
         // java.io.IOException: Simulated IOException
         //
         verifyException("java.io.BufferedReader$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      TextFile textFile0 = null;
      try {
        textFile0 = new TextFile((File) null, charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("au.com.anthonybruno.utils.TextFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextFile textFile0 = null;
      try {
        textFile0 = new TextFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("au.com.anthonybruno.utils.TextFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("*c30_a/uoiTl`~");
      TextFile textFile0 = null;
      try {
        textFile0 = new TextFile(mockFile0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // *c30_a/uoiTl`~ does not exist.
         //
         verifyException("au.com.anthonybruno.utils.TextFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("au.com.anthonybruno.utils.Lazy");
      Charset charset0 = Charset.defaultCharset();
      TextFile textFile0 = null;
      try {
        textFile0 = new TextFile(mockFile0, charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // au.com.anthonybruno.utils.Lazy does not exist.
         //
         verifyException("au.com.anthonybruno.utils.TextFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = MockFile.createTempFile("au.com.anthonybruno.utils.Lazy", "");
      TextFile textFile0 = new TextFile(file0);
      String string0 = textFile0.getText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      TextFile textFile0 = new TextFile(mockFile0);
      // Undeclared exception!
      try { 
        textFile0.getWriter();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.FileNotFoundException
         //
         verifyException("au.com.anthonybruno.utils.TextFile", e);
      }
  }
}
