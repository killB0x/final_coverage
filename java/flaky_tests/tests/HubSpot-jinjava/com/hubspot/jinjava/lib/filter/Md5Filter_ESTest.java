/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 22:26:12 GMT 2022
 */

package com.hubspot.jinjava.lib.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.filter.Md5Filter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Md5Filter_ESTest extends Md5Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Md5Filter md5Filter0 = new Md5Filter();
      boolean boolean0 = md5Filter0.preserveSafeString();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Md5Filter md5Filter0 = new Md5Filter();
      String[] stringArray0 = new String[0];
      Object object0 = md5Filter0.filter((Object) null, (JinjavaInterpreter) null, stringArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Md5Filter md5Filter0 = new Md5Filter();
      Object object0 = new Object();
      String[] stringArray0 = new String[8];
      Object object1 = md5Filter0.filter(object0, (JinjavaInterpreter) null, stringArray0);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Md5Filter md5Filter0 = new Md5Filter();
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        md5Filter0.filter((Object) "md5", (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.lib.filter.Md5Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Md5Filter md5Filter0 = new Md5Filter();
      String string0 = md5Filter0.getName();
      assertEquals("md5", string0);
  }
}
