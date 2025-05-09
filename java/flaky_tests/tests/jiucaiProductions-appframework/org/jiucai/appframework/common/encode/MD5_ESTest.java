/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 02:56:51 GMT 2022
 */

package org.jiucai.appframework.common.encode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jiucai.appframework.common.encode.MD5;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MD5_ESTest extends MD5_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = MD5.encode("3");
      assertEquals("eccbc87e4b5ce2fe28308fd9f2a7baf3", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        MD5.encode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jiucai.appframework.common.encode.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        MD5.encode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jiucai.appframework.common.encode.MD5", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = MD5.encode(byteArray0);
      assertEquals("93b885adfe0da089cdf634904fd59f71", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MD5 mD5_0 = new MD5();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = MD5.encode("~vy<*yr");
      assertEquals("28cad844464d96a8c88a00f01e86754c", string0);
  }
}
