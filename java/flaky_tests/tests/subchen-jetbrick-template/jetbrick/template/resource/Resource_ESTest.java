/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 10:47:39 GMT 2022
 */

package jetbrick.template.resource;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import jetbrick.template.resource.CompiledClassResource;
import jetbrick.template.resource.FileSystemResource;
import jetbrick.template.resource.JarResource;
import jetbrick.template.resource.SourceCodeResource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Resource_ESTest extends Resource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("/z=IO.yvVv");
      assertEquals("utf-8", compiledClassResource0.getEncoding());
      assertEquals("z_003dIO_y_007fvVv", compiledClassResource0.getQualifiedClassName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("`ev{a/ZT");
      assertEquals("ZT", compiledClassResource0.getQualifiedClassName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("/");
      assertEquals("utf-8", compiledClassResource0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%4d: %s%n", "%4d: %s%n");
      JarResource jarResource0 = new JarResource("%4d: %s%n", mockFile0, "K-2", (String) null);
      jarResource0.lastModified();
      assertEquals("", jarResource0.getClassName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile("4L- $crBk-04Q", "4L- $crBk-04Q");
      JarResource jarResource0 = new JarResource("4L- $crBk-04Q", file0, (String) null, "getClassPath");
      jarResource0.lastModified();
      assertEquals("", jarResource0.getClassName());
      assertEquals("getClassPath", jarResource0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("fTQl&D3");
      sourceCodeResource0.getSource("]M#");
      assertEquals("/unknown/file.859", sourceCodeResource0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("");
      sourceCodeResource0.getSource("Z");
      assertEquals("file_782", sourceCodeResource0.getClassName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("utf-8");
      sourceCodeResource0.getSource();
      assertEquals("file_698", sourceCodeResource0.getClassName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("");
      sourceCodeResource0.getSource();
      assertEquals("file_614", sourceCodeResource0.getClassName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("");
      String string0 = sourceCodeResource0.getQualifiedClassName();
      assertEquals("unknown.file_527", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("4L- $crBk-04Q");
      String string0 = compiledClassResource0.getQualifiedClassName();
      assertEquals("utf-8", compiledClassResource0.getEncoding());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemResource fileSystemResource0 = new FileSystemResource("", (File) null, "Sf25hd<nj5Dg|6(");
      String string0 = fileSystemResource0.getName();
      assertEquals("", string0);
      assertEquals("Sf25hd<nj5Dg|6(", fileSystemResource0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("Kk<m9B(qzSHfbg3q");
      sourceCodeResource0.getInputStream();
      assertEquals("file_444", sourceCodeResource0.getClassName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = MockFile.createTempFile("k_002c_003ep_0021", "k_002c_003ep_0021");
      FileSystemResource fileSystemResource0 = new FileSystemResource("k_002c_003ep_0021", file0, (String) null);
      String string0 = fileSystemResource0.getEncoding();
      assertNull(string0);
      assertEquals("", fileSystemResource0.getClassName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%4d: %s%n", "%4d: %s%n");
      FileSystemResource fileSystemResource0 = new FileSystemResource("!/", mockFile0, "");
      String string0 = fileSystemResource0.getEncoding();
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals("", fileSystemResource0.getQualifiedClassName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = MockFile.createTempFile("KCbhz+`c_K", "");
      FileSystemResource fileSystemResource0 = new FileSystemResource("", file0, "");
      String string0 = fileSystemResource0.getAbsolutePath();
      assertEquals("/tmp/KCbhz+`c_K0", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemResource fileSystemResource0 = new FileSystemResource("Pr", (File) null, "Pr");
      // Undeclared exception!
      try { 
        fileSystemResource0.lastModified();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.resource.FileSystemResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("4L- $crBk-04Q");
      // Undeclared exception!
      try { 
        compiledClassResource0.getSource("4L- $crBk-04Q");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.resource.CompiledClassResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource((String) null);
      // Undeclared exception!
      try { 
        sourceCodeResource0.getSource((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.resource.SourceCodeResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JarResource jarResource0 = new JarResource("char", (File) null, "char", "char");
      // Undeclared exception!
      try { 
        jarResource0.getSource("char");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("4L- $crBk-04Q");
      // Undeclared exception!
      try { 
        compiledClassResource0.getSource();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.resource.CompiledClassResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource((String) null);
      // Undeclared exception!
      try { 
        sourceCodeResource0.getSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.resource.SourceCodeResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemResource fileSystemResource0 = new FileSystemResource("YMvSm_005c_0060", (File) null, "YMvSm_005c_0060");
      // Undeclared exception!
      try { 
        fileSystemResource0.getSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      File file0 = MockFile.createTempFile("-QWj ", "-QWj ");
      JarResource jarResource0 = new JarResource("-QWj ", file0, "-QWj ", "/");
      try { 
        jarResource0.getInputStream();
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("4L- $crBk-04Q");
      // Undeclared exception!
      try { 
        compiledClassResource0.getInputStream();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.resource.CompiledClassResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource((String) null);
      // Undeclared exception!
      try { 
        sourceCodeResource0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.resource.SourceCodeResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("je-bric.temxlate.utils.UnsaeCharArrayWriter", "je-bric.temxlate.utils.UnsaeCharArrayWriter");
      FileSystemResource fileSystemResource0 = new FileSystemResource("je-bric.temxlate.utils.UnsaeCharArrayWriter", mockFile0, "je-bric.temxlate.utils.UnsaeCharArrayWriter");
      try { 
        fileSystemResource0.getInputStream();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemResource fileSystemResource0 = new FileSystemResource("Pdar(`{Ng1_~OUm", (File) null, "Pdar(`{Ng1_~OUm");
      // Undeclared exception!
      try { 
        fileSystemResource0.getAbsolutePath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.resource.FileSystemResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      File file0 = MockFile.createTempFile("utf-8", "ZB|");
      FileSystemResource fileSystemResource0 = new FileSystemResource("utf-8", file0, (String) null);
      // Undeclared exception!
      try { 
        fileSystemResource0.getSource("unknown");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: unknown
         //
         verifyException("jetbrick.template.utils.IoUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("vtvB~!/java");
      assertEquals("java_", compiledClassResource0.getQualifiedClassName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockFile mockFile0 = new MockFile("jetbrick.template.utils.UnsafeByteArrayInputStream", "jetbrick.template.utils.UnsafeByteArrayInputStream");
      FileSystemResource fileSystemResource0 = new FileSystemResource("V!\"x/{Mv$", mockFile0, "V!\"x/{Mv$");
      assertEquals("__007bMv_0024", fileSystemResource0.getQualifiedClassName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("W{sgV!?/_");
      assertEquals("__005f", compiledClassResource0.getClassName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockFile mockFile0 = new MockFile("5H1", "5H1");
      JarResource jarResource0 = new JarResource("/home/user/5H1/5H1!/a0OSl", mockFile0, "5H1", "7#dCV[l?1MlDLeUz");
      assertEquals("home.user._5H1._5H1_0021.a0OSl", jarResource0.getQualifiedClassName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockFile mockFile0 = new MockFile("vtvB~");
      mockFile0.createNewFile();
      FileSystemResource fileSystemResource0 = new FileSystemResource("", mockFile0, "!/");
      // Undeclared exception!
      try { 
        fileSystemResource0.getSource();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: !/
         //
         verifyException("jetbrick.template.utils.IoUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockFile mockFile0 = new MockFile("vtvB~");
      JarResource jarResource0 = new JarResource("z", mockFile0, "java", "");
      String string0 = jarResource0.getClassName();
      assertEquals("", jarResource0.getEncoding());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("/home/user/c/A}/A}");
      String string0 = compiledClassResource0.getClassName();
      assertEquals("A_007d", string0);
      assertEquals("home.user.c.A_007d.A_007d", compiledClassResource0.getQualifiedClassName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("!/");
      String string0 = compiledClassResource0.getPackageName();
      assertEquals("", compiledClassResource0.getClassName());
      assertEquals("utf-8", compiledClassResource0.getEncoding());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CompiledClassResource compiledClassResource0 = new CompiledClassResource("/home/user/byte/byte");
      String string0 = compiledClassResource0.getPackageName();
      assertEquals("utf-8", compiledClassResource0.getEncoding());
      assertNotNull(string0);
      assertEquals("home.user.byte_", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("Kk<m9B(qzSHfbg3q");
      String string0 = sourceCodeResource0.getName();
      //  // Unstable assertion: assertEquals("/unknown/file.102", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("");
      sourceCodeResource0.getEncoding();
      assertEquals("file_1", sourceCodeResource0.getClassName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockFile mockFile0 = new MockFile("vtvB~");
      FileSystemResource fileSystemResource0 = new FileSystemResource("", mockFile0, "!/");
      // Undeclared exception!
      try { 
        fileSystemResource0.getSource();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.FileNotFoundException
         //
         verifyException("jetbrick.template.utils.ExceptionUtils", e);
      }
  }
}
