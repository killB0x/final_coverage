/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:17:16 GMT 2022
 */

package net.imglib2.type.numeric.integer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import net.imglib2.img.NativeImg;
import net.imglib2.img.basictypeaccess.ByteAccess;
import net.imglib2.img.basictypeaccess.array.ByteArray;
import net.imglib2.img.basictypeaccess.array.DirtyByteArray;
import net.imglib2.img.basictypeaccess.nio.ByteBufferAccess;
import net.imglib2.img.basictypeaccess.volatiles.array.DirtyVolatileByteArray;
import net.imglib2.img.basictypeaccess.volatiles.array.VolatileByteArray;
import net.imglib2.type.NativeTypeFactory;
import net.imglib2.type.PrimitiveType;
import net.imglib2.type.numeric.integer.ByteType;
import net.imglib2.type.numeric.integer.UnsignedByteType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnsignedByteType_ESTest extends UnsignedByteType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.setReal((-2468.794653894048));
      unsignedByteType0.sub(unsignedByteType0);
      assertEquals(0.0, unsignedByteType0.getPhaseDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      MockRandom mockRandom0 = new MockRandom();
      BigInteger bigInteger0 = new BigInteger(1813, 1813, mockRandom0);
      unsignedByteType0.setBigInteger(bigInteger0);
      unsignedByteType0.mul(unsignedByteType0);
      assertEquals(0.0, unsignedByteType0.getImaginaryDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType((-1913));
      unsignedByteType0.add(unsignedByteType0);
      assertEquals(1.0, unsignedByteType0.getMinIncrement(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.mul(0.0);
      assertEquals(0.0, unsignedByteType0.getPhaseDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.mul((float) 0);
      assertEquals(0.0, unsignedByteType0.getPhaseDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte byte0 = UnsignedByteType.getCodedSignedByteChecked(0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.setInteger((-1139));
      unsignedByteType0.div(unsignedByteType0);
      assertEquals(1.0, unsignedByteType0.getMinIncrement(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = UnsignedByteType.getUnsignedByte((byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      long long0 = unsignedByteType0.getIntegerLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.setInteger(1078L);
      long long0 = unsignedByteType0.getIntegerLong();
      assertEquals(54L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.setByte((byte) (-1));
      int int0 = unsignedByteType0.getInteger();
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte byte0 = UnsignedByteType.getCodedSignedByteChecked(1);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte byte0 = UnsignedByteType.getCodedSignedByte(0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte byte0 = UnsignedByteType.getCodedSignedByte(4372);
      assertEquals((byte)20, byte0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte byte0 = UnsignedByteType.getCodedSignedByte(738);
      assertEquals((byte) (-30), byte0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      BigInteger bigInteger0 = unsignedByteType0.getBigInteger();
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType((-264));
      unsignedByteType0.setOne();
      BigInteger bigInteger0 = unsignedByteType0.getBigInteger();
      assertEquals((byte)1, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.setByte((byte) (-1));
      BigInteger bigInteger0 = unsignedByteType0.getBigInteger();
      assertEquals((short)255, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      int int0 = unsignedByteType0.get();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(255);
      int int0 = unsignedByteType0.get();
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(255);
      int int0 = unsignedByteType0.compareTo(unsignedByteType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(255);
      byte[] byteArray0 = new byte[7];
      DirtyVolatileByteArray dirtyVolatileByteArray0 = new DirtyVolatileByteArray(byteArray0, true);
      UnsignedByteType unsignedByteType1 = new UnsignedByteType(dirtyVolatileByteArray0);
      int int0 = unsignedByteType0.compareTo(unsignedByteType1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType((-1913));
      UnsignedByteType unsignedByteType1 = new UnsignedByteType(0);
      int int0 = unsignedByteType1.compareTo(unsignedByteType0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(0, false);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(byteBufferAccess0);
      // Undeclared exception!
      try { 
        unsignedByteType0.toString();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      VolatileByteArray volatileByteArray0 = new VolatileByteArray(byteArray0, false);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(volatileByteArray0);
      // Undeclared exception!
      try { 
        unsignedByteType0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractByteArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType0.sub(unsignedByteType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      ByteArray byteArray0 = new ByteArray((byte[]) null);
      ByteArray byteArray1 = byteArray0.createArray(0);
      UnsignedByteType unsignedByteType1 = new UnsignedByteType(byteArray1);
      // Undeclared exception!
      try { 
        unsignedByteType0.sub(unsignedByteType1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractByteArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType((ByteAccess) null);
      // Undeclared exception!
      try { 
        unsignedByteType0.setInteger(564L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType((ByteAccess) null);
      // Undeclared exception!
      try { 
        unsignedByteType0.setInteger((-287));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      // Undeclared exception!
      try { 
        unsignedByteType0.setBigInteger((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.UnsignedByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(0, true);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(byteBufferAccess0);
      ByteType byteType0 = new ByteType();
      BigInteger bigInteger0 = byteType0.getBigInteger();
      // Undeclared exception!
      try { 
        unsignedByteType0.setBigInteger(bigInteger0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType1.set((-1007));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DirtyVolatileByteArray dirtyVolatileByteArray0 = new DirtyVolatileByteArray(byteArray0, true);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(dirtyVolatileByteArray0);
      // Undeclared exception!
      try { 
        unsignedByteType0.set(762);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.volatiles.array.DirtyVolatileByteArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType0.mul(unsignedByteType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType1.mul(1527.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VolatileByteArray volatileByteArray0 = new VolatileByteArray(0, false);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(volatileByteArray0);
      // Undeclared exception!
      try { 
        unsignedByteType0.mul((-3527.323F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractByteArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess();
      unsignedByteType0.dataAccess = (ByteAccess) byteBufferAccess0;
      // Undeclared exception!
      try { 
        unsignedByteType0.mul((-0.0461151520969));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.ByteBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, 0);
      ByteBufferAccess byteBufferAccess0 = ByteBufferAccess.fromByteBuffer(byteBuffer0, false);
      unsignedByteType1.dataAccess = (ByteAccess) byteBufferAccess0;
      // Undeclared exception!
      try { 
        unsignedByteType1.mul(1.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType1.getIntegerLong();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArray byteArray1 = new ByteArray(byteArray0);
      ByteArray byteArray2 = byteArray1.createArray((byte)0);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(byteArray2);
      // Undeclared exception!
      try { 
        unsignedByteType0.getIntegerLong();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractByteArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType1.getInteger();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      byte[] byteArray0 = new byte[0];
      DirtyVolatileByteArray dirtyVolatileByteArray0 = new DirtyVolatileByteArray(byteArray0, false);
      unsignedByteType0.dataAccess = (ByteAccess) dirtyVolatileByteArray0;
      // Undeclared exception!
      try { 
        unsignedByteType0.getInteger();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractByteArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(0);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(byteBufferAccess0);
      // Undeclared exception!
      try { 
        unsignedByteType0.getBigInteger();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType1.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DirtyByteArray dirtyByteArray0 = new DirtyByteArray(876);
      DirtyByteArray dirtyByteArray1 = dirtyByteArray0.createArray(0);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(dirtyByteArray1);
      // Undeclared exception!
      try { 
        unsignedByteType0.get();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractByteArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType0.div(unsignedByteType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(0);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(byteBufferAccess0);
      // Undeclared exception!
      try { 
        unsignedByteType0.copy();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArray byteArray1 = new ByteArray(byteArray0);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(byteArray1);
      // Undeclared exception!
      try { 
        unsignedByteType0.copy();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractByteArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(0);
      DirtyByteArray dirtyByteArray0 = new DirtyByteArray(0);
      UnsignedByteType unsignedByteType1 = new UnsignedByteType(dirtyByteArray0);
      // Undeclared exception!
      try { 
        unsignedByteType0.compareTo(unsignedByteType1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractByteArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      ByteBufferAccess byteBufferAccess0 = ByteBufferAccess.fromByteBuffer(byteBuffer0, true);
      UnsignedByteType unsignedByteType1 = new UnsignedByteType(byteBufferAccess0);
      // Undeclared exception!
      try { 
        unsignedByteType0.add(unsignedByteType1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.set((-1007));
      assertEquals(0.0, unsignedByteType0.getPhaseDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType((NativeImg<?, ? extends ByteAccess>) null);
      assertEquals(0.0F, unsignedByteType0.getPhaseFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(0, false);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(byteBufferAccess0);
      // Undeclared exception!
      try { 
        unsignedByteType0.get();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = UnsignedByteType.getUnsignedByte((byte) (-92));
      assertEquals(164, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte byte0 = UnsignedByteType.getCodedSignedByteChecked(3270);
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte byte0 = UnsignedByteType.getCodedSignedByteChecked((-6655));
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte byte0 = UnsignedByteType.getCodedSignedByteChecked(255);
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      String string0 = unsignedByteType0.toString();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(0, false);
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(byteBufferAccess0);
      // Undeclared exception!
      try { 
        unsignedByteType0.setInteger(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      double double0 = unsignedByteType0.getMinValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType((ByteAccess) null);
      UnsignedByteType unsignedByteType1 = unsignedByteType0.createVariable();
      assertEquals(0.0F, unsignedByteType1.getPhaseFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      double double0 = unsignedByteType0.getMaxValue();
      assertEquals(255.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsignedByteType1.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      UnsignedByteType unsignedByteType1 = unsignedByteType0.copy();
      assertTrue(unsignedByteType1.equals((Object)unsignedByteType0));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      // Undeclared exception!
      try { 
        unsignedByteType0.div(unsignedByteType0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("net.imglib2.type.numeric.integer.UnsignedByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType(0);
      int int0 = unsignedByteType0.getInteger();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      NativeTypeFactory<UnsignedByteType, ByteAccess> nativeTypeFactory0 = unsignedByteType0.getNativeTypeFactory();
      assertEquals(PrimitiveType.BYTE, nativeTypeFactory0.getPrimitiveType());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.mul(1.0);
      assertEquals(0.0, unsignedByteType0.getPhaseDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.mul(1685.0F);
      assertEquals(0.0, unsignedByteType0.getMinValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType((ByteAccess) null);
      // Undeclared exception!
      try { 
        unsignedByteType0.getBigInteger();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      // Undeclared exception!
      try { 
        unsignedByteType0.compareTo((UnsignedByteType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.UnsignedByteType", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      unsignedByteType0.sub(unsignedByteType0);
      assertEquals(1.0, unsignedByteType0.getMinIncrement(), 0.01);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      UnsignedByteType unsignedByteType0 = new UnsignedByteType();
      // Undeclared exception!
      try { 
        unsignedByteType0.add((UnsignedByteType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.UnsignedByteType", e);
      }
  }
}
