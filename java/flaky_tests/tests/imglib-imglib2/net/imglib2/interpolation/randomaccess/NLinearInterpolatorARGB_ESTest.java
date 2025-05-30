/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 15:24:02 GMT 2022
 */

package net.imglib2.interpolation.randomaccess;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import net.imglib2.Dimensions;
import net.imglib2.FinalDimensions;
import net.imglib2.RandomAccessible;
import net.imglib2.img.array.ArrayImg;
import net.imglib2.img.array.ArrayImgFactory;
import net.imglib2.img.basictypeaccess.nio.IntBufferAccess;
import net.imglib2.img.list.ListImg;
import net.imglib2.img.sparse.NtreeImg;
import net.imglib2.img.sparse.NtreeImgFactory;
import net.imglib2.interpolation.randomaccess.NLinearInterpolatorARGB;
import net.imglib2.interpolation.randomaccess.NLinearInterpolatorARGBFactory;
import net.imglib2.type.numeric.ARGBType;
import net.imglib2.view.IntervalView;
import net.imglib2.view.SubsampleIntervalView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NLinearInterpolatorARGB_ESTest extends NLinearInterpolatorARGB_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ARGBType aRGBType0 = new ARGBType(1246);
      NtreeImgFactory<ARGBType> ntreeImgFactory0 = new NtreeImgFactory<ARGBType>(aRGBType0);
      long[] longArray0 = new long[8];
      longArray0[0] = (long) 1246;
      longArray0[1] = (long) 1246;
      longArray0[2] = (long) 1246;
      longArray0[3] = (long) 1246;
      longArray0[4] = (long) 1246;
      longArray0[5] = (long) 1246;
      longArray0[6] = (long) 1246;
      longArray0[7] = (long) 1246;
      FinalDimensions finalDimensions0 = FinalDimensions.wrap(longArray0);
      NtreeImg<ARGBType, ?> ntreeImg0 = ntreeImgFactory0.create((Dimensions) finalDimensions0);
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = new NLinearInterpolatorARGB(ntreeImg0);
      nLinearInterpolatorARGB0.get();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ARGBType aRGBType0 = new ARGBType();
      NtreeImgFactory<ARGBType> ntreeImgFactory0 = new NtreeImgFactory<ARGBType>(aRGBType0);
      long[] longArray0 = new long[1];
      longArray0[0] = (long) 1246;
      FinalDimensions finalDimensions0 = FinalDimensions.wrap(longArray0);
      NtreeImg<ARGBType, ?> ntreeImg0 = ntreeImgFactory0.create((Dimensions) finalDimensions0);
      NLinearInterpolatorARGBFactory nLinearInterpolatorARGBFactory0 = new NLinearInterpolatorARGBFactory();
      IntervalView<ARGBType> intervalView0 = new IntervalView<ARGBType>(ntreeImg0, longArray0, longArray0);
      SubsampleIntervalView<ARGBType> subsampleIntervalView0 = new SubsampleIntervalView<ARGBType>(intervalView0, 1246);
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = nLinearInterpolatorARGBFactory0.create((RandomAccessible<ARGBType>) subsampleIntervalView0);
      ARGBType aRGBType1 = nLinearInterpolatorARGB0.get();
      assertTrue(aRGBType1.equals((Object)aRGBType0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ARGBType aRGBType0 = new ARGBType(1246);
      NtreeImgFactory<ARGBType> ntreeImgFactory0 = new NtreeImgFactory<ARGBType>(aRGBType0);
      long[] longArray0 = new long[2];
      longArray0[0] = (long) 1246;
      longArray0[1] = (long) 1246;
      FinalDimensions finalDimensions0 = FinalDimensions.wrap(longArray0);
      NtreeImg<ARGBType, ?> ntreeImg0 = ntreeImgFactory0.create((Dimensions) finalDimensions0);
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = new NLinearInterpolatorARGB(ntreeImg0);
      NLinearInterpolatorARGB nLinearInterpolatorARGB1 = new NLinearInterpolatorARGB(nLinearInterpolatorARGB0);
      assertEquals(2, nLinearInterpolatorARGB1.numDimensions());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ARGBType aRGBType0 = new ARGBType(1254);
      long[] longArray0 = new long[1];
      LinkedList<ARGBType> linkedList0 = new LinkedList<ARGBType>();
      ListImg<ARGBType> listImg0 = new ListImg<ARGBType>(linkedList0, longArray0);
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = new NLinearInterpolatorARGB(listImg0, aRGBType0);
      // Undeclared exception!
      try { 
        nLinearInterpolatorARGB0.get();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NLinearInterpolatorARGBFactory nLinearInterpolatorARGBFactory0 = new NLinearInterpolatorARGBFactory();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      IntBufferAccess intBufferAccess0 = new IntBufferAccess(byteBuffer0);
      ARGBType aRGBType0 = new ARGBType(intBufferAccess0);
      ArrayImgFactory<ARGBType> arrayImgFactory0 = new ArrayImgFactory<ARGBType>(aRGBType0);
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = 1;
      intArray0[5] = 1;
      ArrayImg<ARGBType, ?> arrayImg0 = arrayImgFactory0.create(intArray0);
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = nLinearInterpolatorARGBFactory0.create((RandomAccessible<ARGBType>) arrayImg0);
      // Undeclared exception!
      try { 
        nLinearInterpolatorARGB0.get();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractIntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ARGBType aRGBType0 = new ARGBType(1246);
      NtreeImgFactory<ARGBType> ntreeImgFactory0 = new NtreeImgFactory<ARGBType>(aRGBType0);
      long[] longArray0 = new long[1];
      longArray0[0] = (long) 1246;
      FinalDimensions finalDimensions0 = FinalDimensions.wrap(longArray0);
      NtreeImg<ARGBType, ?> ntreeImg0 = ntreeImgFactory0.create((Dimensions) finalDimensions0);
      SubsampleIntervalView<ARGBType> subsampleIntervalView0 = new SubsampleIntervalView<ARGBType>(ntreeImg0, 0L);
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = new NLinearInterpolatorARGB(subsampleIntervalView0, aRGBType0);
      // Undeclared exception!
      try { 
        nLinearInterpolatorARGB0.get();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("net.imglib2.view.SubsampleView$SubsampleRandomAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ARGBType aRGBType0 = new ARGBType();
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = null;
      try {
        nLinearInterpolatorARGB0 = new NLinearInterpolatorARGB((RandomAccessible<ARGBType>) null, aRGBType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.randomaccess.NLinearInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = null;
      try {
        nLinearInterpolatorARGB0 = new NLinearInterpolatorARGB((RandomAccessible<ARGBType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.randomaccess.NLinearInterpolatorARGB", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ARGBType aRGBType0 = new ARGBType();
      NtreeImgFactory<ARGBType> ntreeImgFactory0 = new NtreeImgFactory<ARGBType>(aRGBType0);
      long[] longArray0 = new long[3];
      longArray0[0] = (long) 1250;
      longArray0[1] = (long) 1250;
      longArray0[2] = (long) 1250;
      FinalDimensions finalDimensions0 = FinalDimensions.wrap(longArray0);
      NtreeImg<ARGBType, ?> ntreeImg0 = ntreeImgFactory0.create((Dimensions) finalDimensions0);
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = new NLinearInterpolatorARGB(ntreeImg0);
      ARGBType aRGBType1 = nLinearInterpolatorARGB0.get();
      assertTrue(aRGBType1.equals((Object)aRGBType0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ARGBType aRGBType0 = new ARGBType(1246);
      NtreeImgFactory<ARGBType> ntreeImgFactory0 = new NtreeImgFactory<ARGBType>(aRGBType0);
      long[] longArray0 = new long[2];
      longArray0[0] = (long) 1246;
      longArray0[1] = (long) 1246;
      FinalDimensions finalDimensions0 = FinalDimensions.wrap(longArray0);
      NtreeImg<ARGBType, ?> ntreeImg0 = ntreeImgFactory0.create((Dimensions) finalDimensions0);
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = new NLinearInterpolatorARGB(ntreeImg0);
      NLinearInterpolatorARGB nLinearInterpolatorARGB1 = nLinearInterpolatorARGB0.copy();
      assertNotSame(nLinearInterpolatorARGB1, nLinearInterpolatorARGB0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ARGBType aRGBType0 = new ARGBType(1246);
      NtreeImgFactory<ARGBType> ntreeImgFactory0 = new NtreeImgFactory<ARGBType>(aRGBType0);
      long[] longArray0 = new long[2];
      longArray0[0] = (long) 1246;
      longArray0[1] = (long) 1246;
      FinalDimensions finalDimensions0 = FinalDimensions.wrap(longArray0);
      NtreeImg<ARGBType, ?> ntreeImg0 = ntreeImgFactory0.create((Dimensions) finalDimensions0);
      NLinearInterpolatorARGB nLinearInterpolatorARGB0 = new NLinearInterpolatorARGB(ntreeImg0);
      nLinearInterpolatorARGB0.get();
      ARGBType aRGBType1 = nLinearInterpolatorARGB0.get();
      assertEquals(0, aRGBType1.getIndex());
  }
}
