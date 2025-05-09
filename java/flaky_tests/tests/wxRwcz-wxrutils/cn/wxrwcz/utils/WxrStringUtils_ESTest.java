/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 21:42:10 GMT 2022
 */

package cn.wxrwcz.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cn.wxrwcz.utils.WxrStringUtils;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WxrStringUtils_ESTest extends WxrStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.getUrlParam("8uvjp`=?=k");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3 out of bounds for length 3
         //
         verifyException("cn.wxrwcz.utils.WxrStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.getUrlParam("&(fO6n8{^L");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("cn.wxrwcz.utils.WxrStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WxrStringUtils.MD5Code32("d41d8cd98f00b204e9800998ecf8427e");
      assertEquals("74be16979710d4c4e7c6647856088456", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = WxrStringUtils.MD5Code32((String) null);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WxrStringUtils.subString("-eU'$f_A\"", 1, 8);
      assertEquals("eU'$f_A", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = WxrStringUtils.strExtractNumber("q.6>{g");
      assertEquals(6, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Map<String, String> map0 = WxrStringUtils.getUrlParam("fj~EW(MA^QI;>9%=m");
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WxrStringUtils.deleteAllInvisibleCharacters("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.checkEmail("aD");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WxrStringUtils.captureName("c");
      assertEquals("C", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WxrStringUtils.MD5Encode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = WxrStringUtils.MD5Encode("", "k&kyxttzZe");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.subString((String) null, (-397), (-397));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.wxrwcz.utils.WxrStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.subString("5RA:wC0(>]bxK0%6kco", (-74));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.subString((String) null, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.wxrwcz.utils.WxrStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.strExtractNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.strExtractNumber((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.wxrwcz.utils.WxrStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.getUrlParam((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.wxrwcz.utils.WxrStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.deleteAllInvisibleCharacters((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.wxrwcz.utils.WxrStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.checkEmail((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.captureName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.wxrwcz.utils.WxrStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.isChinese('l');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WxrStringUtils.subString("Q[ 4w^\u0000M&)v[i~!", 0, 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.subString("", 6570, 3160);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Map<String, String> map0 = WxrStringUtils.getUrlParam("=");
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.isChinese("=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.isChinese((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.isChinese("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = WxrStringUtils.MD5Encode("|-2!B4SL_{<c!Z]", "`");
      assertEquals("|-2!B4SL_{<c!Z]", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WxrStringUtils.MD5Encode("j", (String) null);
      assertEquals("363b122c528f54df4a0446b6bab05515", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = WxrStringUtils.MD5Encode("", "");
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.isDouble("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.isDouble("00]");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = WxrStringUtils.subString("", 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.isInteger("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.isInteger("4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = WxrStringUtils.deleteAllInvisibleCharacters("?H'uIkn:leAJh&[Oa");
      assertEquals("?H'uIkn:leAJh&[Oa", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        WxrStringUtils.captureName("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("cn.wxrwcz.utils.WxrStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = WxrStringUtils.subString("{wpCmqsT;f`sJ", 487);
      assertEquals("{wpCmqsT;f`sJ", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Integer integer0 = WxrStringUtils.strExtractNumber("0 @0.aa");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = WxrStringUtils.checkEmail("0 @0.aa");
      assertTrue(boolean0);
  }
}
