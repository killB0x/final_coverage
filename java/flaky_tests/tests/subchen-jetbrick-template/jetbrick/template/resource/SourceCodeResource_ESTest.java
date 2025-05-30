/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 11:42:41 GMT 2022
 */

package jetbrick.template.resource;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jetbrick.template.resource.SourceCodeResource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SourceCodeResource_ESTest extends SourceCodeResource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("]I2->=eiY`zTv");
      char[] charArray0 = sourceCodeResource0.getSource("]I2->=eiY`zTv");
      assertEquals(13, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("]I2->=eiY`zTv");
      char[] charArray0 = sourceCodeResource0.getSource();
      assertEquals(13, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("");
      sourceCodeResource0.getAbsolutePath();
      assertEquals("unknown.file_29", sourceCodeResource0.getQualifiedClassName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("");
      char[] charArray0 = sourceCodeResource0.getSource();
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("");
      sourceCodeResource0.getInputStream();
      assertEquals("/unknown/file.14", sourceCodeResource0.getName());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("");
      char[] charArray0 = sourceCodeResource0.getSource("");
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SourceCodeResource sourceCodeResource0 = new SourceCodeResource("/");
      long long0 = sourceCodeResource0.lastModified();
      assertEquals("/unknown/file.1", sourceCodeResource0.getName());
      assertEquals(0L, long0);
  }
}
