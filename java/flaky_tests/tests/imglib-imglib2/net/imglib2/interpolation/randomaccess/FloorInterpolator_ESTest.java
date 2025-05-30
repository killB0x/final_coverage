/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 18:54:43 GMT 2022
 */

package net.imglib2.interpolation.randomaccess;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.imglib2.Localizable;
import net.imglib2.PointSample;
import net.imglib2.RandomAccessible;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.converter.read.ConvertedRealRandomAccessibleRealInterval;
import net.imglib2.img.list.ListImg;
import net.imglib2.img.list.ListImgFactory;
import net.imglib2.interpolation.randomaccess.FloorInterpolator;
import net.imglib2.outofbounds.RealOutOfBounds;
import net.imglib2.outofbounds.RealOutOfBoundsFactory;
import net.imglib2.position.FunctionRandomAccessible;
import net.imglib2.type.logic.BitType;
import net.imglib2.view.ExtendedRealRandomAccessibleRealInterval;
import net.imglib2.view.IntervalView;
import net.imglib2.view.RandomAccessibleOnRealRandomAccessible;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FloorInterpolator_ESTest extends FloorInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BiConsumer<Localizable, Object> biConsumer0 = (BiConsumer<Localizable, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      BitType bitType0 = new BitType();
      Supplier<BitType> supplier0 = (Supplier<BitType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(bitType0, bitType0).when(supplier0).get();
      FunctionRandomAccessible<BitType> functionRandomAccessible0 = new FunctionRandomAccessible<BitType>(1, biConsumer0, supplier0);
      FloorInterpolator<BitType> floorInterpolator0 = new FloorInterpolator<BitType>(functionRandomAccessible0);
      FloorInterpolator<BitType> floorInterpolator1 = new FloorInterpolator<BitType>(floorInterpolator0);
      assertFalse(floorInterpolator1.equals((Object)floorInterpolator0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BiConsumer<Localizable, Object> biConsumer0 = (BiConsumer<Localizable, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      BitType bitType0 = new BitType();
      Supplier<BitType> supplier0 = (Supplier<BitType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(bitType0).when(supplier0).get();
      FunctionRandomAccessible<BitType> functionRandomAccessible0 = new FunctionRandomAccessible<BitType>(1, biConsumer0, supplier0);
      FloorInterpolator<BitType> floorInterpolator0 = new FloorInterpolator<BitType>(functionRandomAccessible0);
      BitType bitType1 = floorInterpolator0.get();
      assertEquals(1.0, bitType1.getMaxValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BiConsumer<Localizable, Object> biConsumer0 = (BiConsumer<Localizable, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(supplier0).get();
      FunctionRandomAccessible<Object> functionRandomAccessible0 = new FunctionRandomAccessible<Object>(0, biConsumer0, supplier0);
      FloorInterpolator<Object> floorInterpolator0 = new FloorInterpolator<Object>(functionRandomAccessible0);
      FloorInterpolator<Object> floorInterpolator1 = floorInterpolator0.copy();
      assertNotSame(floorInterpolator0, floorInterpolator1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long[] longArray0 = new long[3];
      Supplier<BitType> supplier0 = (Supplier<BitType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      FunctionRandomAccessible<BitType> functionRandomAccessible0 = new FunctionRandomAccessible<BitType>(2194, (BiConsumer<Localizable, ? super BitType>) null, supplier0);
      IntervalView<BitType> intervalView0 = new IntervalView<BitType>(functionRandomAccessible0, longArray0, longArray0);
      FloorInterpolator<BitType> floorInterpolator0 = new FloorInterpolator<BitType>(intervalView0);
      // Undeclared exception!
      try { 
        floorInterpolator0.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.position.FunctionRandomAccessible$FunctionRandomAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConvertedRealRandomAccessibleRealInterval<Integer, PointSample<Object>> convertedRealRandomAccessibleRealInterval0 = (ConvertedRealRandomAccessibleRealInterval<Integer, PointSample<Object>>) mock(ConvertedRealRandomAccessibleRealInterval.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(convertedRealRandomAccessibleRealInterval0).numDimensions();
      RealOutOfBoundsFactory<PointSample<Object>, Object> realOutOfBoundsFactory0 = (RealOutOfBoundsFactory<PointSample<Object>, Object>) mock(RealOutOfBoundsFactory.class, new ViolatedAssumptionAnswer());
      doReturn((RealOutOfBounds) null).when(realOutOfBoundsFactory0).create(any());
      ExtendedRealRandomAccessibleRealInterval<PointSample<Object>, ConvertedRealRandomAccessibleRealInterval<Integer, PointSample<Object>>> extendedRealRandomAccessibleRealInterval0 = new ExtendedRealRandomAccessibleRealInterval<PointSample<Object>, ConvertedRealRandomAccessibleRealInterval<Integer, PointSample<Object>>>(convertedRealRandomAccessibleRealInterval0, realOutOfBoundsFactory0);
      RandomAccessibleOnRealRandomAccessible<PointSample<Object>> randomAccessibleOnRealRandomAccessible0 = new RandomAccessibleOnRealRandomAccessible<PointSample<Object>>(extendedRealRandomAccessibleRealInterval0);
      FloorInterpolator<PointSample<Object>> floorInterpolator0 = new FloorInterpolator<PointSample<Object>>(randomAccessibleOnRealRandomAccessible0);
      // Undeclared exception!
      try { 
        floorInterpolator0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.outofbounds.RealOutOfBoundsRealRandomAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FloorInterpolator<RandomAccessibleInterval<Integer>> floorInterpolator0 = null;
      try {
        floorInterpolator0 = new FloorInterpolator<RandomAccessibleInterval<Integer>>((FloorInterpolator<RandomAccessibleInterval<Integer>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.randomaccess.FloorInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FloorInterpolator<PointSample<Integer>> floorInterpolator0 = null;
      try {
        floorInterpolator0 = new FloorInterpolator<PointSample<Integer>>((RandomAccessible<PointSample<Integer>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.randomaccess.FloorInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BiConsumer<Localizable, Object> biConsumer0 = (BiConsumer<Localizable, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      Supplier<PointSample<Object>> supplier0 = (Supplier<PointSample<Object>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      FunctionRandomAccessible<PointSample<Object>> functionRandomAccessible0 = new FunctionRandomAccessible<PointSample<Object>>((-542), biConsumer0, supplier0);
      FloorInterpolator<PointSample<Object>> floorInterpolator0 = null;
      try {
        floorInterpolator0 = new FloorInterpolator<PointSample<Object>>(functionRandomAccessible0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -542
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Integer integer0 = new Integer(2194);
      ListImgFactory<Integer> listImgFactory0 = new ListImgFactory<Integer>(integer0);
      int[] intArray0 = new int[1];
      intArray0[0] = 2194;
      ListImg<Integer> listImg0 = listImgFactory0.create(intArray0);
      FloorInterpolator<Integer> floorInterpolator0 = new FloorInterpolator<Integer>(listImg0);
      FloorInterpolator<Integer> floorInterpolator1 = floorInterpolator0.copy();
      assertFalse(floorInterpolator1.equals((Object)floorInterpolator0));
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Integer integer0 = new Integer(2194);
      ListImgFactory<Integer> listImgFactory0 = new ListImgFactory<Integer>(integer0);
      int[] intArray0 = new int[1];
      intArray0[0] = 2194;
      ListImg<Integer> listImg0 = listImgFactory0.create(intArray0);
      FloorInterpolator<Integer> floorInterpolator0 = new FloorInterpolator<Integer>(listImg0);
      Integer integer1 = floorInterpolator0.get();
      assertNull(integer1);
  }
}
