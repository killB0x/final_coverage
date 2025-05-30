/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 14:17:30 GMT 2022
 */

package net.imglib2.iterator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.FinalInterval;
import net.imglib2.Interval;
import net.imglib2.iterator.LocalizingIntervalIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalizingIntervalIterator_ESTest extends LocalizingIntervalIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 5052L;
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0);
      localizingIntervalIterator0.jumpFwd(5052L);
      assertFalse(localizingIntervalIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 5052L;
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0);
      localizingIntervalIterator0.fwd();
      assertEquals(0L, localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long[] longArray0 = new long[5];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      double[] doubleArray0 = new double[8];
      localizingIntervalIterator0.localize(doubleArray0);
      assertArrayEquals(new double[] {(-1.0), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[6];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      localizingIntervalIterator0.getLongPosition(1);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[1] = 4562L;
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      long long0 = localizingIntervalIterator0.getLongPosition(1);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
      assertEquals(4562L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[1] = 815;
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0, intArray0);
      int int0 = localizingIntervalIterator0.getIntPosition(1);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
      assertEquals(815, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[5];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0, intArray0);
      int int0 = localizingIntervalIterator0.getIntPosition(0);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[1] = 4562L;
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      float float0 = localizingIntervalIterator0.getFloatPosition(1);
      assertEquals(4562.0F, float0, 0.01F);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[9];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      float float0 = localizingIntervalIterator0.getFloatPosition(0);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long[] longArray0 = new long[2];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0);
      localizingIntervalIterator0.fwd();
      double double0 = localizingIntervalIterator0.getDoublePosition(0);
      assertEquals(0L, localizingIntervalIterator0.getIndex());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = 615L;
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      double double0 = localizingIntervalIterator0.getDoublePosition(0);
      assertEquals(614.0, double0, 0.01);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.localize((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.localize(longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[12];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.localize((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.localize((float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[2];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.localize(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long[] longArray0 = new long[5];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.localize((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[2];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.localize(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[19];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.jumpFwd((-759L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("net.imglib2.util.IntervalIndexer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[2];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.getLongPosition(10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 10 out of bounds for length 2
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[2];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.getIntPosition(10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 10 out of bounds for length 2
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[2];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.getFloatPosition(1968);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1968 out of bounds for length 2
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[2];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.getDoublePosition(3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3 out of bounds for length 2
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator((long[]) null, (long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long[] longArray0 = new long[0];
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.iterator.IntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long[] longArray0 = new long[0];
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.iterator.IntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.util.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[0];
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.iterator.IntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.util.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[0];
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.iterator.IntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator((Interval) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long[] longArray0 = new long[0];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      LocalizingIntervalIterator localizingIntervalIterator0 = null;
      try {
        localizingIntervalIterator0 = new LocalizingIntervalIterator(finalInterval0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.iterator.IntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long[] longArray0 = new long[5];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      localizingIntervalIterator0.reset();
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long[] longArray0 = new long[3];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      localizingIntervalIterator0.localize(longArray0);
      assertArrayEquals(new long[] {(-1L), 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long[] longArray0 = new long[1];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0);
      int[] intArray0 = new int[3];
      localizingIntervalIterator0.localize(intArray0);
      assertArrayEquals(new int[] {(-1), 0, 0}, intArray0);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long[] longArray0 = new long[3];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      float[] floatArray0 = new float[4];
      localizingIntervalIterator0.localize(floatArray0);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
      assertArrayEquals(new float[] {(-1.0F), 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long[] longArray0 = new long[3];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      localizingIntervalIterator0.fwd();
      assertEquals(0L, localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long[] longArray0 = new long[5];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      double double0 = localizingIntervalIterator0.getDoublePosition(0);
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long[] longArray0 = new long[4];
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(finalInterval0);
      localizingIntervalIterator0.getIntPosition(3);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(intArray0);
      int[] intArray1 = new int[0];
      // Undeclared exception!
      try { 
        localizingIntervalIterator0.localize(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.iterator.LocalizingIntervalIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long[] longArray0 = new long[3];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      long long0 = localizingIntervalIterator0.getLongPosition(0);
      assertEquals((-1L), long0);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      long[] longArray0 = new long[1];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0);
      localizingIntervalIterator0.jumpFwd(5052L);
      localizingIntervalIterator0.fwd();
      assertEquals(5052L, localizingIntervalIterator0.getIndex());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      long[] longArray0 = new long[3];
      LocalizingIntervalIterator localizingIntervalIterator0 = new LocalizingIntervalIterator(longArray0, longArray0);
      float float0 = localizingIntervalIterator0.getFloatPosition(1);
      assertEquals((-1L), localizingIntervalIterator0.getIndex());
      assertEquals(0.0F, float0, 0.01F);
  }
}
