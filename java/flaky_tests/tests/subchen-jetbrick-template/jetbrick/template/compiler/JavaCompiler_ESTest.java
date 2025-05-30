/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 11:38:13 GMT 2022
 */

package jetbrick.template.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import jetbrick.template.JetConfig;
import jetbrick.template.compiler.JavaCompiler;
import jetbrick.template.compiler.JavaSource;
import jetbrick.template.compiler.JdkCompiler;
import jetbrick.template.compiler.JetTemplateClassLoader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaCompiler_ESTest extends JavaCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JdkCompiler jdkCompiler0 = new JdkCompiler();
      MockFile mockFile0 = new MockFile("InputStream not found: ", "JetEngine version is {}");
      JavaSource javaSource0 = new JavaSource("w8*FZ)3VEwnR", "w8*FZ)3VEwnR", mockFile0);
      // Undeclared exception!
      try { 
        jdkCompiler0.compile(javaSource0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.compiler.JdkCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JdkCompiler jdkCompiler0 = new JdkCompiler();
      jdkCompiler0.debugEnabled = true;
      boolean boolean0 = jdkCompiler0.isDebugEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JdkCompiler jdkCompiler0 = new JdkCompiler();
      // Undeclared exception!
      try { 
        jdkCompiler0.initialize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.compiler.JdkCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JdkCompiler jdkCompiler0 = new JdkCompiler();
      MockFile mockFile0 = new MockFile("");
      JavaSource javaSource0 = new JavaSource("", "", mockFile0);
      // Undeclared exception!
      try { 
        jdkCompiler0.compile(javaSource0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("jetbrick.template.compiler.JavaCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JdkCompiler jdkCompiler0 = new JdkCompiler();
      boolean boolean0 = jdkCompiler0.isDebugEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JdkCompiler jdkCompiler0 = new JdkCompiler();
      // Undeclared exception!
      try { 
        jdkCompiler0.getOutputdir();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.compiler.JavaCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JetConfig jetConfig0 = new JetConfig();
      JetTemplateClassLoader jetTemplateClassLoader0 = new JetTemplateClassLoader(jetConfig0);
      // Undeclared exception!
      try { 
        JavaCompiler.create(jetTemplateClassLoader0, jetConfig0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("jetbrick.template.compiler.JavaCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JdkCompiler jdkCompiler0 = new JdkCompiler();
      JavaSource javaSource0 = new JavaSource("import.tags", (String) null, (File) null);
      // Undeclared exception!
      try { 
        jdkCompiler0.compile(javaSource0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jetbrick.template.compiler.JavaSource", e);
      }
  }
}
