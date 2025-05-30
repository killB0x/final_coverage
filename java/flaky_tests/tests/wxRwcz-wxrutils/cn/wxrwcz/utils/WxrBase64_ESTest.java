/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 21:38:41 GMT 2022
 */

package cn.wxrwcz.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import cn.wxrwcz.utils.WxrBase64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WxrBase64_ESTest extends WxrBase64_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("v7aYH@GBMD(l");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("fv{7tTp3!)h]g[*g");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("X7d=");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("Fw{,");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("aueTH8=R");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("AAAAAA==");
      assertEquals(4, byteArray0.length);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("J\"~Y");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("_0YT");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("OfU>m?S_");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode(";(u6QYRBoL)Cp7wJ");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-22);
      String string0 = WxrBase64.encode(byteArray0);
      assertEquals("AAAAAAAAAOo=", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[6] = (byte) (-128);
      String string0 = WxrBase64.encode(byteArray0);
      assertEquals("AAAAAAAAgAA=", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-32);
      String string0 = WxrBase64.encode(byteArray0);
      assertEquals("AAAA4A==", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = WxrBase64.encode(byteArray0);
      assertEquals("AAAAAA==", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("uu++");
      String string0 = WxrBase64.encode(byteArray0);
      assertEquals("uu++", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("");
      String string0 = WxrBase64.encode(byteArray0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = WxrBase64.encode((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("AAAAAAA=");
      assertNotNull(byteArray0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = WxrBase64.decode("\"&@) }.k>5qX");
      assertNull(byteArray0);
  }
}
