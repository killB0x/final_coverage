/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 00:19:26 GMT 2022
 */

package jp.co.yahoo.yosegi.message.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jp.co.yahoo.yosegi.message.objects.ShortObj;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ShortObj_ESTest extends ShortObj_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)127);
      byte byte0 = shortObj0.getByte();
      assertEquals((byte)127, byte0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)9);
      short short0 = shortObj0.getShort();
      assertEquals((short)9, short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short) (-1));
      short short0 = shortObj0.getShort();
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)3);
      long long0 = shortObj0.getLong();
      assertEquals(3L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short) (-1));
      long long0 = shortObj0.getLong();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)9);
      int int0 = shortObj0.getInt();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short) (-128));
      int int0 = shortObj0.getInt();
      assertEquals((-128), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)3);
      float float0 = shortObj0.getFloat();
      assertEquals(3.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short) (-1));
      float float0 = shortObj0.getFloat();
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)9);
      double double0 = shortObj0.getDouble();
      assertEquals(9.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short) (-128));
      double double0 = shortObj0.getDouble();
      assertEquals((-128.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)3);
      byte byte0 = shortObj0.getByte();
      assertEquals((byte)3, byte0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short) (-128));
      byte byte0 = shortObj0.getByte();
      assertEquals((-128), shortObj0.getInt());
      assertEquals((byte) (-128), byte0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short) (-128));
      boolean boolean0 = shortObj0.getBoolean();
      assertTrue(boolean0);
      assertEquals((short) (-128), shortObj0.getShort());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      boolean boolean0 = shortObj0.getBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)930);
      // Undeclared exception!
      try { 
        shortObj0.getByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Can not down cast. long to byte. short value is 930
         //
         verifyException("jp.co.yahoo.yosegi.message.objects.ShortObj", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      byte byte0 = shortObj0.getByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short) (-1382));
      // Undeclared exception!
      try { 
        shortObj0.getByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Can not down cast. long to byte. short value is -1382
         //
         verifyException("jp.co.yahoo.yosegi.message.objects.ShortObj", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      int int0 = shortObj0.getInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      shortObj0.getPrimitiveType();
      assertEquals("0", shortObj0.getString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      long long0 = shortObj0.getLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      Object object0 = shortObj0.get();
      assertEquals((short)0, object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      short short0 = shortObj0.getShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      double double0 = shortObj0.getDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      int int0 = shortObj0.getObjectSize();
      assertEquals(2, int0);
      assertEquals(0L, shortObj0.getLong());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      String string0 = shortObj0.getString();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)127);
      byte[] byteArray0 = shortObj0.getBytes();
      assertArrayEquals(new byte[] {(byte)49, (byte)50, (byte)55}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ShortObj shortObj0 = new ShortObj((short)0);
      float float0 = shortObj0.getFloat();
      assertEquals(0.0F, float0, 0.01F);
  }
}
