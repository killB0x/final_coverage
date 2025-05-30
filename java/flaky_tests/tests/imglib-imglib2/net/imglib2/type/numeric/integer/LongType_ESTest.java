/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 18:58:31 GMT 2022
 */

package net.imglib2.type.numeric.integer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import net.imglib2.img.basictypeaccess.LongAccess;
import net.imglib2.img.basictypeaccess.array.LongArray;
import net.imglib2.img.basictypeaccess.nio.LongBufferAccess;
import net.imglib2.type.NativeTypeFactory;
import net.imglib2.type.PrimitiveType;
import net.imglib2.type.numeric.integer.LongType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LongType_ESTest extends LongType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LongType longType0 = new LongType();
      longType0.setInteger(0);
      assertEquals(0.0, longType0.getPhaseDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LongType longType0 = new LongType();
      long long0 = longType0.getIntegerLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LongType longType0 = new LongType();
      longType0.pow(longType0);
      long long0 = longType0.getIntegerLong();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LongType longType0 = new LongType(0L);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      longType0.setBigInteger(bigInteger0);
      long long0 = longType0.getIntegerLong();
      assertEquals((-65536L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LongType longType0 = new LongType(78L);
      int int0 = longType0.getInteger();
      assertEquals(78, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LongType longType0 = new LongType();
      longType0.set((-2275L));
      int int0 = longType0.getInteger();
      assertEquals((-2275), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LongType longType0 = new LongType((-957L));
      BigInteger bigInteger0 = longType0.getBigInteger();
      assertEquals((short) (-957), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LongType longType0 = new LongType(0L);
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-1);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      longType0.setBigInteger(bigInteger0);
      BigInteger bigInteger1 = longType0.getBigInteger();
      assertEquals((byte) (-1), bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LongType longType0 = new LongType();
      longType0.setReal(126.8F);
      long long0 = longType0.get();
      assertEquals(127L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LongType longType0 = new LongType();
      longType0.setReal((-956.816565));
      long long0 = longType0.get();
      assertEquals((-957L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LongType longType0 = new LongType();
      LongType longType1 = longType0.copy();
      assertEquals((-9.223372036854776E18), longType1.getMinValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LongType longType0 = new LongType((-1690L));
      LongType longType1 = longType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        longType1.setReal((float) (-1690L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.LongType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LongArray longArray0 = new LongArray(0);
      LongType longType0 = new LongType(longArray0);
      // Undeclared exception!
      try { 
        longType0.setReal(0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LongType longType0 = new LongType((LongAccess) null);
      // Undeclared exception!
      try { 
        longType0.setInteger(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.LongType", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LongType longType0 = new LongType();
      long[] longArray0 = new long[1];
      LongArray longArray1 = new LongArray(longArray0);
      LongArray longArray2 = longArray1.createArray(0);
      longType0.dataAccess = (LongAccess) longArray2;
      // Undeclared exception!
      try { 
        longType0.setInteger(2147483639L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LongType longType0 = new LongType(0L);
      LongType longType1 = longType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        longType1.getIntegerLong();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericLongType", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LongBufferAccess longBufferAccess0 = new LongBufferAccess(0);
      LongType longType0 = new LongType(longBufferAccess0);
      // Undeclared exception!
      try { 
        longType0.getIntegerLong();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LongType longType0 = new LongType(1913L);
      LongType longType1 = longType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        longType1.getInteger();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericLongType", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LongBufferAccess longBufferAccess0 = new LongBufferAccess();
      LongType longType0 = new LongType(longBufferAccess0);
      // Undeclared exception!
      try { 
        longType0.getBigInteger();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.LongBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LongBufferAccess longBufferAccess0 = new LongBufferAccess(0);
      LongType longType0 = new LongType(longBufferAccess0);
      // Undeclared exception!
      try { 
        longType0.getBigInteger();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LongArray longArray0 = new LongArray(0);
      LongType longType0 = new LongType(longArray0);
      // Undeclared exception!
      try { 
        longType0.getBigInteger();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LongBufferAccess longBufferAccess0 = new LongBufferAccess();
      LongType longType0 = new LongType(longBufferAccess0);
      // Undeclared exception!
      try { 
        longType0.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.LongBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LongType longType0 = new LongType();
      LongBufferAccess longBufferAccess0 = new LongBufferAccess(0);
      longType0.dataAccess = (LongAccess) longBufferAccess0;
      // Undeclared exception!
      try { 
        longType0.get();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LongArray longArray0 = new LongArray(0);
      LongType longType0 = new LongType(longArray0);
      // Undeclared exception!
      try { 
        longType0.get();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LongBufferAccess longBufferAccess0 = new LongBufferAccess(0);
      LongType longType0 = new LongType(longBufferAccess0);
      // Undeclared exception!
      try { 
        longType0.copy();
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
      long[] longArray0 = new long[0];
      LongArray longArray1 = new LongArray(longArray0);
      LongType longType0 = new LongType(longArray1);
      // Undeclared exception!
      try { 
        longType0.copy();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LongType longType0 = new LongType();
      long long0 = longType0.get();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LongType longType0 = new LongType((LongAccess) null);
      // Undeclared exception!
      try { 
        longType0.set(2830L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.LongType", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LongType longType0 = new LongType();
      BigInteger bigInteger0 = longType0.getBigInteger();
      assertEquals((byte)0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LongType longType0 = new LongType((LongAccess) null);
      // Undeclared exception!
      try { 
        longType0.setInteger((-58));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.LongType", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LongType longType0 = new LongType();
      int int0 = longType0.getInteger();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LongType longType0 = new LongType();
      double double0 = longType0.getMaxValue();
      assertEquals(9.223372036854776E18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LongType longType0 = new LongType();
      LongType longType1 = longType0.createVariable();
      assertTrue(longType1.equals((Object)longType0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LongType longType0 = new LongType((-1017L));
      longType0.setInteger(1L);
      assertEquals((-9.223372036854776E18), longType0.getMinValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LongType longType0 = new LongType();
      // Undeclared exception!
      try { 
        longType0.setBigInteger((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.LongType", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LongType longType0 = new LongType();
      NativeTypeFactory<LongType, LongAccess> nativeTypeFactory0 = longType0.getNativeTypeFactory();
      assertEquals(PrimitiveType.LONG, nativeTypeFactory0.getPrimitiveType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LongType longType0 = new LongType();
      double double0 = longType0.getMinValue();
      assertEquals((-9.223372036854776E18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LongType longType0 = new LongType((LongAccess) null);
      // Undeclared exception!
      try { 
        longType0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.GenericLongType", e);
      }
  }
}
