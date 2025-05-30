/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:57:03 GMT 2022
 */

package jp.co.yahoo.yosegi.encryptor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData;
import jp.co.yahoo.yosegi.encryptor.Module;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdditionalAuthenticationData_ESTest extends AdditionalAuthenticationData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[3];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray1);
      assertEquals((short)0, additionalAuthenticationData0.getBlockOrdinal());
      assertEquals(0, additionalAuthenticationData0.getOrdinal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      additionalAuthenticationData0.getPrefix();
      assertEquals((short)0, additionalAuthenticationData0.getBlockOrdinal());
      assertEquals(0, additionalAuthenticationData0.getOrdinal());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      additionalAuthenticationData0.getIdentifier();
      assertEquals((short)0, additionalAuthenticationData0.getBlockOrdinal());
      assertEquals(0, additionalAuthenticationData0.getOrdinal());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      additionalAuthenticationData0.nextBlock();
      short short0 = additionalAuthenticationData0.getBlockOrdinal();
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0);
      additionalAuthenticationData0.setBlockOrdinal((short) (-100));
      short short0 = additionalAuthenticationData0.getBlockOrdinal();
      assertEquals((short) (-100), short0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0);
      // Undeclared exception!
      try { 
        additionalAuthenticationData0.create((Module) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdditionalAuthenticationData additionalAuthenticationData0 = null;
      try {
        additionalAuthenticationData0 = new AdditionalAuthenticationData((byte[]) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdditionalAuthenticationData additionalAuthenticationData0 = null;
      try {
        additionalAuthenticationData0 = new AdditionalAuthenticationData((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Module module0 = Module.COLUMN_DATA;
      byte byte0 = AdditionalAuthenticationData.typeToByte(module0);
      assertEquals((byte)12, byte0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Module module0 = Module.BLOCK_META;
      byte byte0 = AdditionalAuthenticationData.typeToByte(module0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)74);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 74
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Module module0 = AdditionalAuthenticationData.typeToByte((byte)11);
      assertEquals(Module.COLUMN_INDEX, module0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)9);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 9
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)8);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 8
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)7);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 7
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)6);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 6
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)5);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 5
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)4);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 4
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)3);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 3
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 2
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditionalAuthenticationData.typeToByte((byte)1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This byte is not supported : 1
         //
         verifyException("jp.co.yahoo.yosegi.encryptor.AdditionalAuthenticationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Module module0 = AdditionalAuthenticationData.typeToByte((byte)0);
      assertEquals(Module.BLOCK_META, module0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Module module0 = AdditionalAuthenticationData.typeToByte((byte) (-1));
      assertEquals(Module.KEYS, module0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Module module0 = Module.KEYS;
      byte byte0 = AdditionalAuthenticationData.typeToByte(module0);
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Module module0 = Module.COLUMN_INDEX;
      byte byte0 = AdditionalAuthenticationData.typeToByte(module0);
      assertEquals((byte)11, byte0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Module module0 = AdditionalAuthenticationData.typeToByte((byte)10);
      byte byte0 = AdditionalAuthenticationData.typeToByte(module0);
      assertEquals((byte)10, byte0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      Module module0 = Module.BLOCK_META;
      byte[] byteArray1 = additionalAuthenticationData0.create(module0);
      assertEquals(7, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      additionalAuthenticationData0.getIdentifier();
      assertEquals((short)0, additionalAuthenticationData0.getBlockOrdinal());
      assertEquals(0, additionalAuthenticationData0.getOrdinal());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0);
      int int0 = additionalAuthenticationData0.getOrdinal();
      assertEquals(0, int0);
      assertEquals((short)0, additionalAuthenticationData0.getBlockOrdinal());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0);
      additionalAuthenticationData0.setOrdinal((byte) (-1));
      int int0 = additionalAuthenticationData0.getOrdinal();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      Module module0 = AdditionalAuthenticationData.typeToByte((byte)12);
      byte[] byteArray1 = additionalAuthenticationData0.create(module0);
      assertEquals(7, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)12, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      additionalAuthenticationData0.nextOrdinal();
      int int0 = additionalAuthenticationData0.getOrdinal();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0);
      byte[] byteArray1 = additionalAuthenticationData0.getPrefix();
      assertEquals(0, additionalAuthenticationData0.getOrdinal());
      assertEquals(0, byteArray1.length);
      assertEquals((short)0, additionalAuthenticationData0.getBlockOrdinal());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      AdditionalAuthenticationData additionalAuthenticationData0 = new AdditionalAuthenticationData(byteArray0, byteArray0);
      short short0 = additionalAuthenticationData0.getBlockOrdinal();
      assertEquals((short)0, short0);
      assertEquals(0, additionalAuthenticationData0.getOrdinal());
  }
}
