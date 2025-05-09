/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 15:40:29 GMT 2022
 */

package net.imglib2.type.numeric.integer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import net.imglib2.img.NativeImg;
import net.imglib2.img.basictypeaccess.LongAccess;
import net.imglib2.img.basictypeaccess.array.DirtyLongArray;
import net.imglib2.img.basictypeaccess.array.LongArray;
import net.imglib2.img.basictypeaccess.nio.LongBufferAccess;
import net.imglib2.img.basictypeaccess.volatiles.array.DirtyVolatileLongArray;
import net.imglib2.img.basictypeaccess.volatiles.array.VolatileLongArray;
import net.imglib2.img.sparse.LongNtree;
import net.imglib2.type.NativeTypeFactory;
import net.imglib2.type.PrimitiveType;
import net.imglib2.type.logic.BoolType;
import net.imglib2.type.numeric.integer.Unsigned12BitType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Unsigned12BitType_ESTest extends Unsigned12BitType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType();
      unsigned12BitType0.set(63L);
      assertEquals(0, unsigned12BitType0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(0L);
      assertEquals(0.0, unsigned12BitType0.getPhaseDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType();
      long long0 = unsigned12BitType0.get();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType();
      unsigned12BitType0.setReal(63.0);
      long long0 = unsigned12BitType0.get();
      assertEquals(63L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long[] longArray0 = new long[1];
      LongNtree longNtree0 = new LongNtree(longArray0, longArray0, (-1531L));
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(longNtree0);
      // Undeclared exception!
      unsigned12BitType0.set(255L);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeImg<BoolType, DirtyLongArray> nativeImg0 = (NativeImg<BoolType, DirtyLongArray>) mock(NativeImg.class, new ViolatedAssumptionAnswer());
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(nativeImg0);
      // Undeclared exception!
      try { 
        unsigned12BitType0.set(63L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.Unsigned12BitType", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LongBufferAccess longBufferAccess0 = new LongBufferAccess();
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(longBufferAccess0);
      // Undeclared exception!
      try { 
        unsigned12BitType0.set(12L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.LongBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      LongBufferAccess longBufferAccess0 = new LongBufferAccess(byteBuffer0, false);
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(longBufferAccess0);
      // Undeclared exception!
      try { 
        unsigned12BitType0.set((long) (byte) (-101));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DirtyVolatileLongArray dirtyVolatileLongArray0 = new DirtyVolatileLongArray(0, true);
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(dirtyVolatileLongArray0);
      // Undeclared exception!
      try { 
        unsigned12BitType0.set((long) 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      LongBufferAccess longBufferAccess0 = new LongBufferAccess(byteBuffer0, false);
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(longBufferAccess0);
      // Undeclared exception!
      try { 
        unsigned12BitType0.get();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long[] longArray0 = new long[1];
      LongArray longArray1 = new LongArray(longArray0);
      LongArray longArray2 = longArray1.createArray(0);
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(longArray2);
      // Undeclared exception!
      try { 
        unsigned12BitType0.get();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType((LongAccess) null);
      // Undeclared exception!
      try { 
        unsigned12BitType0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.Unsigned12BitType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      LongBufferAccess longBufferAccess0 = new LongBufferAccess(byteBuffer0);
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(longBufferAccess0);
      // Undeclared exception!
      try { 
        unsigned12BitType0.copy();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VolatileLongArray volatileLongArray0 = new VolatileLongArray(0, false);
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(volatileLongArray0);
      // Undeclared exception!
      try { 
        unsigned12BitType0.copy();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType();
      NativeTypeFactory<Unsigned12BitType, LongAccess> nativeTypeFactory0 = unsigned12BitType0.getNativeTypeFactory();
      assertEquals(PrimitiveType.LONG, nativeTypeFactory0.getPrimitiveType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType();
      Unsigned12BitType unsigned12BitType1 = unsigned12BitType0.copy();
      assertTrue(unsigned12BitType1.equals((Object)unsigned12BitType0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DirtyVolatileLongArray dirtyVolatileLongArray0 = new DirtyVolatileLongArray(0, true);
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType(dirtyVolatileLongArray0);
      Unsigned12BitType unsigned12BitType1 = unsigned12BitType0.createVariable();
      assertEquals(0.0F, unsigned12BitType1.getPhaseFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Unsigned12BitType unsigned12BitType0 = new Unsigned12BitType();
      Unsigned12BitType unsigned12BitType1 = unsigned12BitType0.duplicateTypeOnSameNativeImg();
      // Undeclared exception!
      try { 
        unsigned12BitType1.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.numeric.integer.Unsigned12BitType", e);
      }
  }
}
