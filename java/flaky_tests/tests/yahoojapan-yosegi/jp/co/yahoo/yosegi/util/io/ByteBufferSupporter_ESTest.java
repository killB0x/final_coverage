/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:55:41 GMT 2022
 */

package jp.co.yahoo.yosegi.util.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteOrder;
import jp.co.yahoo.yosegi.util.io.ByteBufferSupporter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ByteBufferSupporter_ESTest extends ByteBufferSupporter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)114;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)2, byteOrder0);
      short short0 = byteBufferSupporter0.getShort();
      assertEquals((short)114, short0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-1);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)2, (byte)2, byteOrder0);
      short short0 = byteBufferSupporter0.getShort();
      assertEquals((short) (-256), short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-99);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)8, byteOrder0);
      int int0 = byteBufferSupporter0.getInt();
      assertEquals(40192, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)1;
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)1, (byte)1, byteOrder0);
      byte byte0 = byteBufferSupporter0.getByte();
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-1);
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)1, byteOrder0);
      byte byte0 = byteBufferSupporter0.getByte();
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.putShort((byte)0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 0, 0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.putLong(0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 4, 4, byteOrder0);
      byteBufferSupporter0.getInt();
      // Undeclared exception!
      try { 
        byteBufferSupporter0.putInt((-1059));
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[7];
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.putFloat((byte)0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.putByte((byte)0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[20];
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.getShort();
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[7];
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.getLong();
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[7];
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.getInt();
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[15];
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.getFloat();
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = null;
      try {
        byteBufferSupporter0 = new ByteBufferSupporter((byte[]) null, 1, 1, byteOrder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = null;
      try {
        byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (-18), (-18), byteOrder0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 0, 17, byteOrder0);
      byteBufferSupporter0.putLong(0L);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)2, byteOrder0);
      short short0 = byteBufferSupporter0.getShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 4, 4, byteOrder0);
      byteBufferSupporter0.putFloat(4);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.getByte();
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)4, (byte)4, byteOrder0);
      byteBufferSupporter0.putShort((byte)4);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)4, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[6];
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)1, byteOrder0);
      byte byte0 = byteBufferSupporter0.getByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 4, 4, byteOrder0);
      byteBufferSupporter0.putInt((-1059));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 4, 4, byteOrder0);
      float float0 = byteBufferSupporter0.getFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 0, 11, byteOrder0);
      byteBufferSupporter0.putDouble(11);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.putDouble(2754.520972303969);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 0, 1, byteOrder0);
      byteBufferSupporter0.putByte((byte)0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[17];
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, (byte)0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.getDouble();
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 0, 17, byteOrder0);
      long long0 = byteBufferSupporter0.getLong();
      assertEquals(0L, long0);
  }
}
