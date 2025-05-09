/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 12:20:07 GMT 2022
 */

package net.imglib2.outofbounds;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Vector;
import net.imglib2.Localizable;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.img.basictypeaccess.volatiles.array.VolatileFloatArray;
import net.imglib2.img.list.ListImg;
import net.imglib2.outofbounds.OutOfBoundsPeriodic;
import net.imglib2.util.Grid;
import net.imglib2.view.IterableRandomAccessibleInterval;
import net.imglib2.view.StackView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OutOfBoundsPeriodic_ESTest extends OutOfBoundsPeriodic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long[] longArray0 = new long[15];
      ArrayList<Grid.CellIntervals> arrayList0 = new ArrayList<Grid.CellIntervals>();
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      
      ListImg<Grid.CellIntervals> listImg0 = new ListImg<Grid.CellIntervals>(arrayList0, longArray0);
      assertNotNull(listImg0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0L, listImg0.size());
      assertEquals(15, listImg0.numDimensions());
      assertEquals(15, longArray0.length);
      
      IterableRandomAccessibleInterval<Grid.CellIntervals> iterableRandomAccessibleInterval0 = new IterableRandomAccessibleInterval<Grid.CellIntervals>(listImg0);
      assertNotNull(iterableRandomAccessibleInterval0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0L, listImg0.size());
      assertEquals(15, listImg0.numDimensions());
      assertEquals(0L, iterableRandomAccessibleInterval0.size());
      assertEquals(15, longArray0.length);
      
      OutOfBoundsPeriodic<Grid.CellIntervals> outOfBoundsPeriodic0 = new OutOfBoundsPeriodic<Grid.CellIntervals>((RandomAccessibleInterval<Grid.CellIntervals>) iterableRandomAccessibleInterval0);
      assertNotNull(outOfBoundsPeriodic0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(0L, listImg0.size());
      assertEquals(15, listImg0.numDimensions());
      assertEquals(0L, iterableRandomAccessibleInterval0.size());
      assertFalse(outOfBoundsPeriodic0.isOutOfBounds());
      assertEquals(15, outOfBoundsPeriodic0.numDimensions());
      assertEquals(15, longArray0.length);
      
      // Undeclared exception!
      try { 
        outOfBoundsPeriodic0.setPosition(3110L, 2146293906);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2146293906 out of bounds for length 15
         //
         verifyException("net.imglib2.outofbounds.OutOfBoundsPeriodic", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long[] longArray0 = new long[1];
      Vector<Object> vector0 = new Vector<Object>();
      assertNotNull(vector0);
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      
      ListImg<Object> listImg0 = new ListImg<Object>(vector0, longArray0);
      assertNotNull(listImg0);
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(1, listImg0.numDimensions());
      assertEquals(0L, listImg0.size());
      assertArrayEquals(new long[] {0L}, longArray0);
      assertEquals(1, longArray0.length);
      
      OutOfBoundsPeriodic<Object> outOfBoundsPeriodic0 = new OutOfBoundsPeriodic<Object>((RandomAccessibleInterval<Object>) listImg0);
      assertNotNull(outOfBoundsPeriodic0);
      assertEquals(0, vector0.size());
      assertTrue(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(1, listImg0.numDimensions());
      assertEquals(0L, listImg0.size());
      assertFalse(outOfBoundsPeriodic0.isOutOfBounds());
      assertEquals(1, outOfBoundsPeriodic0.numDimensions());
      assertArrayEquals(new long[] {0L}, longArray0);
      assertEquals(1, longArray0.length);
      
      // Undeclared exception!
      try { 
        outOfBoundsPeriodic0.move(longArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("net.imglib2.outofbounds.OutOfBoundsPeriodic", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      
      long[] longArray0 = new long[8];
      ListImg<Object> listImg0 = new ListImg<Object>(arrayList0, longArray0);
      assertNotNull(listImg0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(8, listImg0.numDimensions());
      assertEquals(0L, listImg0.size());
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(8, longArray0.length);
      
      OutOfBoundsPeriodic<Object> outOfBoundsPeriodic0 = new OutOfBoundsPeriodic<Object>((RandomAccessibleInterval<Object>) listImg0);
      assertNotNull(outOfBoundsPeriodic0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(8, listImg0.numDimensions());
      assertEquals(0L, listImg0.size());
      assertFalse(outOfBoundsPeriodic0.isOutOfBounds());
      assertEquals(8, outOfBoundsPeriodic0.numDimensions());
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(8, longArray0.length);
      
      // Undeclared exception!
      try { 
        outOfBoundsPeriodic0.move((Localizable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.outofbounds.OutOfBoundsPeriodic", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      assertNotNull(arrayList0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      
      long[] longArray0 = new long[9];
      ListImg<Object> listImg0 = new ListImg<Object>(arrayList0, longArray0);
      assertNotNull(listImg0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals(0L, listImg0.size());
      assertEquals(9, listImg0.numDimensions());
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(9, longArray0.length);
      
      OutOfBoundsPeriodic<Object> outOfBoundsPeriodic0 = new OutOfBoundsPeriodic<Object>((RandomAccessibleInterval<Object>) listImg0);
      assertNotNull(outOfBoundsPeriodic0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals(0L, listImg0.size());
      assertEquals(9, listImg0.numDimensions());
      assertFalse(outOfBoundsPeriodic0.isOutOfBounds());
      assertEquals(9, outOfBoundsPeriodic0.numDimensions());
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(9, longArray0.length);
      
      // Undeclared exception!
      try { 
        outOfBoundsPeriodic0.move((Localizable) outOfBoundsPeriodic0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("net.imglib2.outofbounds.OutOfBoundsPeriodic", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      long[] longArray0 = new long[1];
      Vector<Object> vector0 = new Vector<Object>();
      assertNotNull(vector0);
      assertEquals(10, vector0.capacity());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      
      ListImg<Object> listImg0 = new ListImg<Object>(vector0, longArray0);
      assertNotNull(listImg0);
      assertEquals(10, vector0.capacity());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertEquals(0L, listImg0.size());
      assertEquals(1, listImg0.numDimensions());
      assertArrayEquals(new long[] {0L}, longArray0);
      assertEquals(1, longArray0.length);
      
      OutOfBoundsPeriodic<Object> outOfBoundsPeriodic0 = new OutOfBoundsPeriodic<Object>((RandomAccessibleInterval<Object>) listImg0);
      assertNotNull(outOfBoundsPeriodic0);
      assertEquals(10, vector0.capacity());
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertEquals(0L, listImg0.size());
      assertEquals(1, listImg0.numDimensions());
      assertEquals(1, outOfBoundsPeriodic0.numDimensions());
      assertFalse(outOfBoundsPeriodic0.isOutOfBounds());
      assertArrayEquals(new long[] {0L}, longArray0);
      assertEquals(1, longArray0.length);
      
      // Undeclared exception!
      try { 
        outOfBoundsPeriodic0.move(71L, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 1
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      
      long[] longArray0 = new long[9];
      ListImg<Object> listImg0 = new ListImg<Object>(arrayList0, longArray0);
      assertNotNull(listImg0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(9, listImg0.numDimensions());
      assertEquals(0L, listImg0.size());
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(9, longArray0.length);
      
      OutOfBoundsPeriodic<Object> outOfBoundsPeriodic0 = new OutOfBoundsPeriodic<Object>((RandomAccessibleInterval<Object>) listImg0);
      assertNotNull(outOfBoundsPeriodic0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertEquals(9, listImg0.numDimensions());
      assertEquals(0L, listImg0.size());
      assertEquals(9, outOfBoundsPeriodic0.numDimensions());
      assertFalse(outOfBoundsPeriodic0.isOutOfBounds());
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(9, longArray0.length);
      
      // Undeclared exception!
      try { 
        outOfBoundsPeriodic0.move(1284, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("net.imglib2.outofbounds.OutOfBoundsPeriodic", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OutOfBoundsPeriodic<StackView<VolatileFloatArray>> outOfBoundsPeriodic0 = null;
      try {
        outOfBoundsPeriodic0 = new OutOfBoundsPeriodic<StackView<VolatileFloatArray>>((OutOfBoundsPeriodic<StackView<VolatileFloatArray>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.outofbounds.OutOfBoundsPeriodic", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OutOfBoundsPeriodic<Object> outOfBoundsPeriodic0 = null;
      try {
        outOfBoundsPeriodic0 = new OutOfBoundsPeriodic<Object>((RandomAccessibleInterval<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.outofbounds.OutOfBoundsPeriodic", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      long[] longArray0 = new long[1];
      Vector<Object> vector0 = new Vector<Object>();
      ListImg<Object> listImg0 = new ListImg<Object>(vector0, longArray0);
      OutOfBoundsPeriodic<Object> outOfBoundsPeriodic0 = new OutOfBoundsPeriodic<Object>((RandomAccessibleInterval<Object>) listImg0);
      // Undeclared exception!
      try { 
        outOfBoundsPeriodic0.move((-2145508041), (-2145508041));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2145508041 out of bounds for length 1
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }
}
