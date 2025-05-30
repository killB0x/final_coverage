/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:37:01 GMT 2022
 */

package net.imglib2.type.numeric.real;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import net.imglib2.img.basictypeaccess.DoubleAccess;
import net.imglib2.img.basictypeaccess.array.DirtyDoubleArray;
import net.imglib2.img.basictypeaccess.array.DoubleArray;
import net.imglib2.img.basictypeaccess.nio.DoubleBufferAccess;
import net.imglib2.img.basictypeaccess.nio.FloatBufferAccess;
import net.imglib2.img.basictypeaccess.volatiles.array.VolatileDoubleArray;
import net.imglib2.img.basictypeaccess.volatiles.array.VolatileFloatArray;
import net.imglib2.img.sparse.DoubleNtree;
import net.imglib2.type.numeric.real.DoubleType;
import net.imglib2.type.numeric.real.FloatType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractRealType_ESTest extends AbstractRealType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.setOne();
      doubleType0.mul(doubleType0);
      assertEquals(64, doubleType0.getBitsPerPixel());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType((-1875.897));
      doubleType0.div(doubleType0);
      assertEquals(64, doubleType0.getBitsPerPixel());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1063.0375915201;
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(doubleArray0);
      DoubleType doubleType0 = new DoubleType(dirtyDoubleArray0);
      doubleType0.add(doubleType0);
      assertArrayEquals(new double[] {2126.0751830402, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.mul(0.0);
      assertEquals(0.0, doubleType0.getPhaseDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.mul(0.0F);
      assertEquals(64, doubleType0.getBitsPerPixel());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType(32);
      doubleType0.setImaginary(1966.2128F);
      assertEquals(64, doubleType0.getBitsPerPixel());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = new DoubleType((-32768.0));
      boolean boolean0 = doubleType0.valueEquals(doubleType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      float float0 = doubleType0.getPowerFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FloatType floatType0 = new FloatType(2340.894F);
      floatType0.set((-3364.351F));
      float float0 = floatType0.getPowerFloat();
      assertEquals((-3364.351F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = new DoubleType((-32768.0));
      doubleType0.sub(doubleType1);
      double double0 = doubleType0.getPowerDouble();
      assertEquals(32768.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType((-1.0));
      double double0 = doubleType0.getPowerDouble();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.pow((-1481.9465535083943));
      DoubleType doubleType1 = new DoubleType();
      int int0 = doubleType1.compareTo(doubleType0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType0.valueEquals(doubleType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(0);
      DoubleType doubleType1 = new DoubleType(dirtyDoubleArray0);
      // Undeclared exception!
      try { 
        doubleType0.valueEquals(doubleType1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(0, false);
      doubleType0.dataAccess = (DoubleAccess) doubleBufferAccess0;
      // Undeclared exception!
      try { 
        doubleType0.toString();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DoubleArray doubleArray1 = new DoubleArray(doubleArray0);
      DoubleType doubleType0 = new DoubleType(doubleArray1);
      // Undeclared exception!
      try { 
        doubleType0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.sub(doubleType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      double[] doubleArray0 = new double[0];
      DoubleBuffer doubleBuffer0 = DoubleBuffer.wrap(doubleArray0);
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(doubleBuffer0, false);
      DoubleType doubleType1 = new DoubleType(doubleBufferAccess0);
      // Undeclared exception!
      try { 
        doubleType0.sub(doubleType1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(0);
      DoubleType doubleType0 = new DoubleType(dirtyDoubleArray0);
      // Undeclared exception!
      try { 
        doubleType0.sub(doubleType0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.setZero();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long[] longArray0 = new long[0];
      DoubleNtree doubleNtree0 = new DoubleNtree(longArray0, longArray0, 0.0);
      DoubleType doubleType0 = new DoubleType(doubleNtree0);
      // Undeclared exception!
      doubleType0.setOne();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.setOne();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(doubleArray0);
      DoubleType doubleType0 = new DoubleType(dirtyDoubleArray0);
      // Undeclared exception!
      try { 
        doubleType0.setOne();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.DirtyDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType0.set(doubleType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(0, false);
      DoubleType doubleType1 = new DoubleType(doubleBufferAccess0);
      // Undeclared exception!
      try { 
        doubleType0.set(doubleType1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DoubleArray doubleArray0 = new DoubleArray(0);
      DoubleType doubleType0 = new DoubleType(doubleArray0);
      // Undeclared exception!
      try { 
        doubleType0.set(doubleType0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType0.pow(doubleType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(byteBuffer0, false);
      DoubleType doubleType1 = new DoubleType(doubleBufferAccess0);
      // Undeclared exception!
      try { 
        doubleType0.pow(doubleType1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      double[] doubleArray0 = new double[0];
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(doubleArray0);
      DoubleType doubleType1 = new DoubleType(dirtyDoubleArray0);
      // Undeclared exception!
      try { 
        doubleType0.pow(doubleType1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FloatBufferAccess floatBufferAccess0 = new FloatBufferAccess(0);
      FloatType floatType0 = new FloatType(floatBufferAccess0);
      // Undeclared exception!
      try { 
        floatType0.pow((double) 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DoubleArray doubleArray0 = new DoubleArray(0);
      DoubleType doubleType0 = new DoubleType(doubleArray0);
      // Undeclared exception!
      try { 
        doubleType0.pow((double) 2059.9F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.mul(doubleType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(0);
      DoubleType doubleType1 = new DoubleType(doubleBufferAccess0);
      // Undeclared exception!
      try { 
        doubleType0.mul(doubleType1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      double[] doubleArray0 = new double[1];
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(doubleArray0);
      DirtyDoubleArray dirtyDoubleArray1 = dirtyDoubleArray0.createArray(0);
      DoubleType doubleType1 = new DoubleType(dirtyDoubleArray1);
      // Undeclared exception!
      try { 
        doubleType0.mul(doubleType1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess();
      DoubleType doubleType0 = new DoubleType(doubleBufferAccess0);
      // Undeclared exception!
      try { 
        doubleType0.mul(0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.DoubleBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2);
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(byteBuffer0);
      DoubleType doubleType0 = new DoubleType(doubleBufferAccess0);
      // Undeclared exception!
      try { 
        doubleType0.mul(0.0F);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.mul(4.9E-324);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.inc();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(0, false);
      DoubleType doubleType0 = new DoubleType(doubleBufferAccess0);
      // Undeclared exception!
      try { 
        doubleType0.inc();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(1);
      DirtyDoubleArray dirtyDoubleArray1 = dirtyDoubleArray0.createArray(0);
      DoubleType doubleType0 = new DoubleType(dirtyDoubleArray1);
      // Undeclared exception!
      try { 
        doubleType0.hashCode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.getPowerFloat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(0);
      DoubleType doubleType0 = new DoubleType(dirtyDoubleArray0);
      // Undeclared exception!
      try { 
        doubleType0.getPowerFloat();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.getPowerDouble();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FloatBufferAccess floatBufferAccess0 = new FloatBufferAccess(0, true);
      FloatType floatType0 = new FloatType(floatBufferAccess0);
      // Undeclared exception!
      try { 
        floatType0.getPowerDouble();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      float[] floatArray0 = new float[3];
      VolatileFloatArray volatileFloatArray0 = new VolatileFloatArray(floatArray0, true);
      VolatileFloatArray volatileFloatArray1 = volatileFloatArray0.createArray(0);
      FloatType floatType0 = new FloatType(volatileFloatArray1);
      // Undeclared exception!
      try { 
        floatType0.getPowerDouble();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractFloatArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.equals(doubleType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(1, true);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      DoubleBufferAccess doubleBufferAccess1 = doubleBufferAccess0.newInstance(byteBuffer0, true);
      doubleType0.dataAccess = (DoubleAccess) doubleBufferAccess1;
      // Undeclared exception!
      try { 
        doubleType0.equals(doubleType0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.copy();
      double[] doubleArray0 = new double[8];
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(doubleArray0);
      DirtyDoubleArray dirtyDoubleArray1 = dirtyDoubleArray0.createArray(0);
      doubleType1.dataAccess = (DoubleAccess) dirtyDoubleArray1;
      // Undeclared exception!
      try { 
        doubleType1.equals(doubleType0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType0.div(doubleType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      double[] doubleArray0 = new double[0];
      VolatileDoubleArray volatileDoubleArray0 = new VolatileDoubleArray(doubleArray0, true);
      DoubleType doubleType1 = new DoubleType(volatileDoubleArray0);
      // Undeclared exception!
      try { 
        doubleType0.div(doubleType1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType1.dec();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(0);
      DoubleType doubleType1 = new DoubleType(doubleBufferAccess0);
      // Undeclared exception!
      try { 
        doubleType1.compareTo(doubleType0);
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
      DoubleType doubleType0 = new DoubleType();
      DoubleArray doubleArray0 = new DoubleArray(0);
      doubleType0.dataAccess = (DoubleAccess) doubleArray0;
      // Undeclared exception!
      try { 
        doubleType0.compareTo(doubleType0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DoubleType doubleType1 = doubleType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        doubleType0.add(doubleType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(byteBuffer0);
      DoubleType doubleType1 = new DoubleType(doubleBufferAccess0);
      // Undeclared exception!
      try { 
        doubleType0.add(doubleType1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      DirtyDoubleArray dirtyDoubleArray0 = new DirtyDoubleArray(0);
      DoubleType doubleType1 = new DoubleType(dirtyDoubleArray0);
      // Undeclared exception!
      try { 
        doubleType0.add(doubleType1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      Object object0 = new Object();
      boolean boolean0 = doubleType0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      boolean boolean0 = doubleType0.equals(doubleType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.dec();
      assertEquals(0.0, doubleType0.getPhaseDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      boolean boolean0 = doubleType0.valueEquals(doubleType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.pow(doubleType0);
      assertEquals(0.0F, doubleType0.getPhaseFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      double double0 = doubleType0.getImaginaryDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FloatType floatType0 = new FloatType(2340.894F);
      float float0 = floatType0.getPowerFloat();
      assertEquals(2340.894F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      double double0 = doubleType0.getPhaseDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      float float0 = doubleType0.getImaginaryFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.set(doubleType0);
      assertEquals((-1.7976931348623157E308), doubleType0.getMinValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.inc();
      assertEquals((-1.7976931348623157E308), doubleType0.getMinValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      int int0 = doubleType0.compareTo(doubleType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.setZero();
      assertEquals(0.0F, doubleType0.getPhaseFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.setImaginary((double) 64);
      assertEquals(0.0, doubleType0.getImaginaryDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      String string0 = doubleType0.toString();
      assertEquals("0.0", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      float float0 = doubleType0.getPhaseFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType((DoubleAccess) null);
      // Undeclared exception!
      try { 
        doubleType0.pow(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.real.DoubleType", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.mul((-1.0F));
      assertEquals(0.0F, doubleType0.getImaginaryFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.mul(4.9E-324);
      assertEquals(64, doubleType0.getBitsPerPixel());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.setOne();
      DoubleType doubleType1 = doubleType0.createVariable();
      int int0 = doubleType0.compareTo(doubleType1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      double double0 = doubleType0.getPowerDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.mul(doubleType0);
      assertEquals(0.0F, doubleType0.getPhaseFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DoubleType doubleType0 = new DoubleType();
      doubleType0.hashCode();
  }
}
