/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 00:52:01 GMT 2022
 */

package jp.co.yahoo.yosegi.util.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.ByteOrder;
import jp.co.yahoo.yosegi.util.io.ByteBufferSupporter;
import jp.co.yahoo.yosegi.util.io.NumberToBinaryUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IWriteSupporter_ESTest extends IWriteSupporter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberToBinaryUtils.WriteSupporter0 numberToBinaryUtils_WriteSupporter0_0 = new NumberToBinaryUtils.WriteSupporter0();
      numberToBinaryUtils_WriteSupporter0_0.putInt(634);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, 2, byteOrder0);
      byteBufferSupporter0.putByte((byte)0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberToBinaryUtils.WriteSupporter0 numberToBinaryUtils_WriteSupporter0_0 = new NumberToBinaryUtils.WriteSupporter0();
      // Undeclared exception!
      try { 
        numberToBinaryUtils_WriteSupporter0_0.putShort((short)1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unsupported method putShort()
         //
         verifyException("jp.co.yahoo.yosegi.util.io.IWriteSupporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, (byte)0, 1, byteOrder0);
      byteBufferSupporter0.putBoolean(false);
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
  public void test04()  throws Throwable  {
      NumberToBinaryUtils.WriteSupporter0 numberToBinaryUtils_WriteSupporter0_0 = new NumberToBinaryUtils.WriteSupporter0();
      // Undeclared exception!
      try { 
        numberToBinaryUtils_WriteSupporter0_0.putByte((byte)0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unsupported method putByte()
         //
         verifyException("jp.co.yahoo.yosegi.util.io.IWriteSupporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberToBinaryUtils.WriteSupporter0 numberToBinaryUtils_WriteSupporter0_0 = new NumberToBinaryUtils.WriteSupporter0();
      // Undeclared exception!
      try { 
        numberToBinaryUtils_WriteSupporter0_0.putBoolean(false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unsupported method putByte()
         //
         verifyException("jp.co.yahoo.yosegi.util.io.IWriteSupporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteBufferSupporter byteBufferSupporter0 = new ByteBufferSupporter(byteArray0, 0, 0, byteOrder0);
      // Undeclared exception!
      try { 
        byteBufferSupporter0.putBoolean(true);
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
      NumberToBinaryUtils.WriteSupporter0 numberToBinaryUtils_WriteSupporter0_0 = new NumberToBinaryUtils.WriteSupporter0();
      // Undeclared exception!
      try { 
        numberToBinaryUtils_WriteSupporter0_0.putFloat(1601.14F);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unsupported method putFloat()
         //
         verifyException("jp.co.yahoo.yosegi.util.io.IWriteSupporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberToBinaryUtils.WriteSupporter0 numberToBinaryUtils_WriteSupporter0_0 = new NumberToBinaryUtils.WriteSupporter0();
      // Undeclared exception!
      try { 
        numberToBinaryUtils_WriteSupporter0_0.putDouble(0.0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unsupported method putDouble()
         //
         verifyException("jp.co.yahoo.yosegi.util.io.IWriteSupporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberToBinaryUtils.WriteSupporter0 numberToBinaryUtils_WriteSupporter0_0 = new NumberToBinaryUtils.WriteSupporter0();
      NumberToBinaryUtils.WriteSupporter6 numberToBinaryUtils_WriteSupporter6_0 = new NumberToBinaryUtils.WriteSupporter6(numberToBinaryUtils_WriteSupporter0_0, numberToBinaryUtils_WriteSupporter0_0);
      // Undeclared exception!
      try { 
        numberToBinaryUtils_WriteSupporter6_0.putLong(0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unsupported method putShort()
         //
         verifyException("jp.co.yahoo.yosegi.util.io.IWriteSupporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberToBinaryUtils.WriteSupporter0 numberToBinaryUtils_WriteSupporter0_0 = new NumberToBinaryUtils.WriteSupporter0();
      NumberToBinaryUtils.WriteSupporter6 numberToBinaryUtils_WriteSupporter6_0 = new NumberToBinaryUtils.WriteSupporter6(numberToBinaryUtils_WriteSupporter0_0, numberToBinaryUtils_WriteSupporter0_0);
      // Undeclared exception!
      try { 
        numberToBinaryUtils_WriteSupporter6_0.putInt(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Unsupported method putInt()
         //
         verifyException("jp.co.yahoo.yosegi.util.io.IWriteSupporter", e);
      }
  }
}
