/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 18:00:31 GMT 2022
 */

package com.rtfparserkit.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.rtfparserkit.utils.HexUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HexUtils_ESTest extends HexUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        HexUtils.parseHexDigit((-1157));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid hex digit -1157
         //
         verifyException("com.rtfparserkit.utils.HexUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = HexUtils.parseHexString("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = HexUtils.parseHexDigit(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        HexUtils.parseHexString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.rtfparserkit.utils.HexUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = HexUtils.parseHexDigit(48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        HexUtils.parseHexString("%ry$l9y93");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid hex string
         //
         verifyException("com.rtfparserkit.utils.HexUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        HexUtils.parseHexString("Invalid hex digit ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid hex digit 73
         //
         verifyException("com.rtfparserkit.utils.HexUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = HexUtils.parseHexString("AecD");
      assertArrayEquals(new byte[] {(byte) (-82), (byte) (-51)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HexUtils hexUtils0 = new HexUtils();
  }
}
