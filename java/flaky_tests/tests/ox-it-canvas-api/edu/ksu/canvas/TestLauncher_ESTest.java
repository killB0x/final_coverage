/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 10:09:29 GMT 2022
 */

package edu.ksu.canvas;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.ksu.canvas.TestLauncher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TestLauncher_ESTest extends TestLauncher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        TestLauncher.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        TestLauncher.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.ksu.canvas.TestLauncher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[3] = "--canvas_url";
      // Undeclared exception!
      try { 
        TestLauncher.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4 out of bounds for length 4
         //
         verifyException("edu.ksu.canvas.TestLauncher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TestLauncher testLauncher0 = new TestLauncher("kI22=@", "kI22=@");
      // Undeclared exception!
      try { 
        testLauncher0.getOwnCourses();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // edu/ksu/canvas/net/SimpleRestClient
         //
         verifyException("edu.ksu.canvas.net.RefreshingRestClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TestLauncher testLauncher0 = new TestLauncher("1", "1");
      // Undeclared exception!
      try { 
        testLauncher0.getRootAccount();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // edu/ksu/canvas/net/SimpleRestClient
         //
         verifyException("edu.ksu.canvas.net.RefreshingRestClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TestLauncher testLauncher0 = new TestLauncher("!31[`D<}n@[", "");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[2] = "--canvas_url";
      stringArray0[3] = "/audit/authentication/logins/";
      // Undeclared exception!
      try { 
        TestLauncher.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        TestLauncher.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        TestLauncher.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[1] = "--token";
      stringArray0[2] = "--canvas_url";
      stringArray0[3] = "K/KA<*oJ\"l=GJl/}$8!";
      // Undeclared exception!
      try { 
        TestLauncher.main(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // edu/ksu/canvas/net/SimpleRestClient
         //
         verifyException("edu.ksu.canvas.net.RefreshingRestClient", e);
      }
  }
}
