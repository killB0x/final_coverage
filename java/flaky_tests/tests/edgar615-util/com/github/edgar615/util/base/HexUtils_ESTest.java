/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 14:52:07 GMT 2022
 */

package com.github.edgar615.util.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.edgar615.util.base.HexUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HexUtils_ESTest extends HexUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = HexUtils.hexToByteArray("001D9985010000");
      assertArrayEquals(new byte[] {(byte)0, (byte)29, (byte) (-103), (byte) (-123), (byte)1, (byte)0, (byte)0}, byteArray0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = HexUtils.hexToByteArray("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte byte0 = HexUtils.hexToByte("00");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte byte0 = HexUtils.hexToByte("ff");
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = HexUtils.bytesToHexString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        HexUtils.hexToByteArray("\"");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0\"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        HexUtils.hexToByteArray((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.edgar615.util.base.HexUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        HexUtils.hexToByte((String) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        HexUtils.bytesToHexString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.edgar615.util.base.HexUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte byte0 = HexUtils.hexToByte("08");
      assertEquals((byte)8, byte0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = HexUtils.hexToByteArray("bb");
      String string0 = HexUtils.bytesToHexString(byteArray0);
      assertEquals("BB", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = HexUtils.bytesToHexString(byteArray0);
      assertEquals("000000", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = HexUtils.byteToHex((byte)8);
      assertEquals("08", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = HexUtils.byteToHex((byte) (-25));
      assertEquals("e7", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HexUtils hexUtils0 = new HexUtils();
  }
}
