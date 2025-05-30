/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 23:59:22 GMT 2022
 */

package jstestdriver.coveage.report;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import jstestdriver.coveage.report.DefaultFileHelper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultFileHelper_ESTest extends DefaultFileHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultFileHelper defaultFileHelper0 = new DefaultFileHelper();
      String[] stringArray0 = new String[0];
      try { 
        defaultFileHelper0.WriteFile("jstestdriver.coveage.report.DefaultFileHelper", stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 0
         //
         verifyException("jstestdriver.coveage.report.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      DefaultFileHelper defaultFileHelper0 = new DefaultFileHelper();
      String[] stringArray0 = new String[1];
      try { 
        defaultFileHelper0.WriteFile("+k)OB", stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultFileHelper defaultFileHelper0 = new DefaultFileHelper();
      String[] stringArray0 = new String[2];
      try { 
        defaultFileHelper0.WriteFile("", stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultFileHelper defaultFileHelper0 = new DefaultFileHelper();
      try { 
        defaultFileHelper0.ReadLines((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      DefaultFileHelper defaultFileHelper0 = new DefaultFileHelper();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("+k)OB");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "+k)OB");
      try { 
        defaultFileHelper0.ReadLines("+k)OB");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultFileHelper defaultFileHelper0 = new DefaultFileHelper();
      try { 
        defaultFileHelper0.ReadLines("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultFileHelper defaultFileHelper0 = new DefaultFileHelper();
      String[] stringArray0 = new String[1];
      defaultFileHelper0.WriteFile("UTF-8", stringArray0);
      String[] stringArray1 = defaultFileHelper0.ReadLines("UTF-8");
      assertEquals(1, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultFileHelper defaultFileHelper0 = new DefaultFileHelper();
      String[] stringArray0 = defaultFileHelper0.ReadLines("UTF-8");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultFileHelper defaultFileHelper0 = new DefaultFileHelper();
      try { 
        defaultFileHelper0.WriteFile("", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jstestdriver.coveage.report.StringUtils", e);
      }
  }
}
