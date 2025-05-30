/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:28:55 GMT 2022
 */

package org.jfaster.mango.util.logging;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.util.logging.StringUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringUtil_ESTest extends StringUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = StringUtil.split("org.jfaster.mango.util.logging.StringUtil", 'l');
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtil.split((String) null, 'N');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.util.logging.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtil.simpleClassName((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.util.logging.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtil.simpleClassName((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.util.logging.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = StringUtil.simpleClassName(class0);
      assertEquals("String", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = StringUtil.split("Object", 't');
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = StringUtil.split("5#y{Xb\u0000%WFU", '%');
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = StringUtil.split("aD$~=ql]", 'i');
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = StringUtil.split("i", 'i');
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String string0 = StringUtil.simpleClassName((Object) "org.jfaster.mango.util.logging.StringUtil");
      assertEquals("String", string0);
  }
}
