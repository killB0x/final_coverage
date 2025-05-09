/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 14:08:23 GMT 2022
 */

package net.imglib2.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.function.BiPredicate;
import net.imglib2.FinalRealInterval;
import net.imglib2.Interval;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.RealInterval;
import net.imglib2.converter.RealUnsignedShortConverter;
import net.imglib2.img.list.ListImg;
import net.imglib2.img.sparse.BooleanNtree;
import net.imglib2.img.sparse.CharNtree;
import net.imglib2.img.sparse.FloatNtree;
import net.imglib2.img.sparse.NtreeImg;
import net.imglib2.test.ImgLib2Assert;
import net.imglib2.type.numeric.IntegerType;
import net.imglib2.type.numeric.RealType;
import net.imglib2.type.numeric.complex.ComplexFloatType;
import net.imglib2.type.numeric.integer.IntType;
import net.imglib2.type.numeric.integer.ShortType;
import net.imglib2.type.numeric.integer.UnsignedIntType;
import net.imglib2.type.numeric.integer.UnsignedShortType;
import net.imglib2.type.numeric.integer.UnsignedVariableBitLengthType;
import net.imglib2.type.volatiles.VolatileUnsignedShortType;
import net.imglib2.util.Fraction;
import net.imglib2.view.IterableRandomAccessibleInterval;
import net.imglib2.view.SubsampleIntervalView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ImgLib2Assert_ESTest extends ImgLib2Assert_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long[] longArray0 = new long[5];
      UnsignedShortType unsignedShortType0 = new UnsignedShortType(0);
      Fraction fraction0 = unsignedShortType0.getEntitiesPerPixel();
      NtreeImg<VolatileUnsignedShortType, CharNtree> ntreeImg0 = new NtreeImg<VolatileUnsignedShortType, CharNtree>((CharNtree) null, longArray0, fraction0);
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertImageEqualsRealType(ntreeImg0, (RandomAccessibleInterval<? extends RealType<?>>) null, (-4226.26));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.util.Intervals", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long[] longArray0 = new long[6];
      VolatileUnsignedShortType volatileUnsignedShortType0 = new VolatileUnsignedShortType();
      ListImg<VolatileUnsignedShortType> listImg0 = new ListImg<VolatileUnsignedShortType>(longArray0, volatileUnsignedShortType0);
      ImgLib2Assert.assertImageEqualsRealType(listImg0, listImg0, (-7389L));
      assertEquals(0L, listImg0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<IntType> linkedList0 = new LinkedList<IntType>();
      long[] longArray0 = new long[1];
      ListImg<IntType> listImg0 = new ListImg<IntType>(linkedList0, longArray0);
      ImgLib2Assert.assertImageEqualsIntegerType(listImg0, listImg0);
      assertEquals(0L, listImg0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ImgLib2Assert.intervalToString((Interval) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.util.Intervals", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      FinalRealInterval finalRealInterval0 = FinalRealInterval.createMinMax(doubleArray0);
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertIntervalEquals((RealInterval) finalRealInterval0, (RealInterval) null, (double) 31L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.util.Intervals", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertIntervalEquals((Interval) null, (Interval) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.util.Intervals", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<IntType> linkedList0 = new LinkedList<IntType>();
      long[] longArray0 = new long[1];
      longArray0[0] = 2890L;
      ListImg<IntType> listImg0 = new ListImg<IntType>(linkedList0, longArray0);
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertImageEqualsRealType(listImg0, listImg0, 9.869604401089358);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[0];
      long[] longArray1 = new long[5];
      BooleanNtree booleanNtree0 = new BooleanNtree(longArray1, longArray0, false);
      Fraction fraction0 = new Fraction((-1064L), 1611L);
      NtreeImg<UnsignedIntType, BooleanNtree> ntreeImg0 = new NtreeImg<UnsignedIntType, BooleanNtree>(booleanNtree0, longArray0, fraction0);
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertImageEqualsRealType(ntreeImg0, ntreeImg0, 0L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<IntType> linkedList0 = new LinkedList<IntType>();
      long[] longArray0 = new long[1];
      longArray0[0] = 2927L;
      ListImg<IntType> listImg0 = new ListImg<IntType>(linkedList0, longArray0);
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertImageEqualsIntegerType(listImg0, listImg0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long[] longArray0 = new long[0];
      long[] longArray1 = new long[4];
      ComplexFloatType complexFloatType0 = new ComplexFloatType();
      Fraction fraction0 = complexFloatType0.getEntitiesPerPixel();
      BooleanNtree booleanNtree0 = new BooleanNtree(longArray1, longArray1, true);
      NtreeImg<UnsignedVariableBitLengthType, BooleanNtree> ntreeImg0 = new NtreeImg<UnsignedVariableBitLengthType, BooleanNtree>(booleanNtree0, longArray0, fraction0);
      IterableRandomAccessibleInterval<UnsignedVariableBitLengthType> iterableRandomAccessibleInterval0 = IterableRandomAccessibleInterval.create((RandomAccessibleInterval<UnsignedVariableBitLengthType>) ntreeImg0);
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertImageEqualsIntegerType(iterableRandomAccessibleInterval0, ntreeImg0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BiPredicate<CharNtree, CharNtree> biPredicate0 = (BiPredicate<CharNtree, CharNtree>) mock(BiPredicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertImageEquals((RandomAccessibleInterval<? extends CharNtree>) null, (RandomAccessibleInterval<? extends CharNtree>) null, biPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.util.Intervals", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long[] longArray0 = new long[6];
      VolatileUnsignedShortType volatileUnsignedShortType0 = new VolatileUnsignedShortType();
      ListImg<VolatileUnsignedShortType> listImg0 = new ListImg<VolatileUnsignedShortType>(longArray0, volatileUnsignedShortType0);
      ImgLib2Assert.assertIntervalEquals((Interval) listImg0, (Interval) listImg0);
      assertEquals(0L, listImg0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      FinalRealInterval finalRealInterval0 = FinalRealInterval.createMinMax(doubleArray0);
      ImgLib2Assert.assertIntervalEquals((RealInterval) finalRealInterval0, (RealInterval) finalRealInterval0, 529.8397646212);
      assertEquals(2, finalRealInterval0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<IntType> linkedList0 = new LinkedList<IntType>();
      long[] longArray0 = new long[1];
      longArray0[0] = 2927L;
      RealUnsignedShortConverter<IntType> realUnsignedShortConverter0 = new RealUnsignedShortConverter<IntType>(2927L, 4.294967296E9);
      ListImg<RealUnsignedShortConverter<IntType>> listImg0 = new ListImg<RealUnsignedShortConverter<IntType>>(longArray0, realUnsignedShortConverter0);
      ListImg<RealUnsignedShortConverter<IntType>> listImg1 = listImg0.copy();
      IterableRandomAccessibleInterval<RealUnsignedShortConverter<IntType>> iterableRandomAccessibleInterval0 = IterableRandomAccessibleInterval.create((RandomAccessibleInterval<RealUnsignedShortConverter<IntType>>) listImg1);
      IterableRandomAccessibleInterval<RealUnsignedShortConverter<IntType>> iterableRandomAccessibleInterval1 = new IterableRandomAccessibleInterval<RealUnsignedShortConverter<IntType>>(iterableRandomAccessibleInterval0);
      BiPredicate<RealUnsignedShortConverter<IntType>, RealUnsignedShortConverter<IntType>> biPredicate0 = (BiPredicate<RealUnsignedShortConverter<IntType>, RealUnsignedShortConverter<IntType>>) mock(BiPredicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(biPredicate0).test(any(net.imglib2.converter.RealUnsignedShortConverter.class) , any(net.imglib2.converter.RealUnsignedShortConverter.class));
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertImageEquals((RandomAccessibleInterval<? extends RealUnsignedShortConverter<IntType>>) listImg0, (RandomAccessibleInterval<? extends RealUnsignedShortConverter<IntType>>) listImg1, biPredicate0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Pixel values differ on coordinate (0), expected: null actual: null
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[1] = 1603L;
      FloatNtree floatNtree0 = new FloatNtree(longArray0, (long[]) null, (-3381.574F));
      Fraction fraction0 = new Fraction(1435L, 2L);
      NtreeImg<ShortType, FloatNtree> ntreeImg0 = new NtreeImg<ShortType, FloatNtree>(floatNtree0, longArray0, fraction0);
      IterableRandomAccessibleInterval<ShortType> iterableRandomAccessibleInterval0 = IterableRandomAccessibleInterval.create((RandomAccessibleInterval<ShortType>) ntreeImg0);
      SubsampleIntervalView<ShortType> subsampleIntervalView0 = new SubsampleIntervalView<ShortType>(iterableRandomAccessibleInterval0, 473L);
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertIntervalEquals((RealInterval) subsampleIntervalView0, (RealInterval) iterableRandomAccessibleInterval0, (double) 473L);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // Intervals are different, expected: {min=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], max=[-1.0, 3.0, -1.0, -1.0, -1.0, -1.0, -1.0]}, actual: {min=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], max=[-1.0, 1602.0, -1.0, -1.0, -1.0, -1.0, -1.0]}
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ImgLib2Assert.assertImageEqualsIntegerType((RandomAccessibleInterval<? extends IntegerType<?>>) null, (RandomAccessibleInterval<? extends IntegerType<?>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.util.Intervals", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<IntType> linkedList0 = new LinkedList<IntType>();
      long[] longArray0 = new long[1];
      ListImg<IntType> listImg0 = new ListImg<IntType>(linkedList0, longArray0);
      String string0 = ImgLib2Assert.intervalToString(listImg0);
      assertEquals("{min=[0], max=[-1]}", string0);
  }
}
