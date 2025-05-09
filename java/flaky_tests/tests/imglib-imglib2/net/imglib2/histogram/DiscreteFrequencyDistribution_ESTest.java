/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:09:23 GMT 2022
 */

package net.imglib2.histogram;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Stack;
import java.util.function.Supplier;
import net.imglib2.Interval;
import net.imglib2.Point;
import net.imglib2.PointSample;
import net.imglib2.Positionable;
import net.imglib2.RandomAccessible;
import net.imglib2.RealInterval;
import net.imglib2.RealPoint;
import net.imglib2.RealPositionable;
import net.imglib2.histogram.BinMapper1d;
import net.imglib2.histogram.DiscreteFrequencyDistribution;
import net.imglib2.histogram.Histogram1d;
import net.imglib2.img.Img;
import net.imglib2.img.list.ListImg;
import net.imglib2.interpolation.randomaccess.NLinearInterpolator;
import net.imglib2.interpolation.randomaccess.NLinearInterpolatorFactory;
import net.imglib2.type.numeric.integer.LongType;
import net.imglib2.type.numeric.real.DoubleType;
import net.imglib2.view.composite.RealComposite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DiscreteFrequencyDistribution_ESTest extends DiscreteFrequencyDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 22L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.min(longArray0);
      discreteFrequencyDistribution0.increment(longArray0);
      discreteFrequencyDistribution0.increment(longArray0);
      double double0 = discreteFrequencyDistribution0.relativeFrequency(longArray0);
      assertEquals(2L, discreteFrequencyDistribution0.totalValues());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinMapper1d<Object> binMapper1d0 = (BinMapper1d<Object>) mock(BinMapper1d.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(binMapper1d0).getBinCount();
      Histogram1d<Object> histogram1d0 = new Histogram1d<Object>(binMapper1d0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = histogram1d0.dfd();
      long[] longArray0 = new long[2];
      discreteFrequencyDistribution0.increment(longArray0);
      discreteFrequencyDistribution0.setFrequency(longArray0, 2);
      assertEquals(2L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinMapper1d<Object> binMapper1d0 = (BinMapper1d<Object>) mock(BinMapper1d.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(binMapper1d0).getBinCount();
      Histogram1d<Object> histogram1d0 = new Histogram1d<Object>(binMapper1d0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = histogram1d0.dfd();
      long[] longArray0 = new long[1];
      discreteFrequencyDistribution0.setFrequency(longArray0, 0L);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinMapper1d<Object> binMapper1d0 = (BinMapper1d<Object>) mock(BinMapper1d.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(binMapper1d0).getBinCount();
      Histogram1d<Object> histogram1d0 = new Histogram1d<Object>(binMapper1d0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = histogram1d0.dfd();
      long[] longArray0 = new long[2];
      longArray0[0] = 1080L;
      long long0 = discreteFrequencyDistribution0.frequency(longArray0);
      assertEquals(0L, long0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (-15L);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = null;
      try {
        discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bin count (<= 0)
         //
         verifyException("net.imglib2.histogram.DiscreteFrequencyDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      double[] doubleArray0 = new double[5];
      discreteFrequencyDistribution0.realMin(doubleArray0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      NLinearInterpolatorFactory<LongType> nLinearInterpolatorFactory0 = new NLinearInterpolatorFactory<LongType>();
      NLinearInterpolator<LongType> nLinearInterpolator0 = nLinearInterpolatorFactory0.create((RandomAccessible<LongType>) discreteFrequencyDistribution0, (RealInterval) discreteFrequencyDistribution0);
      discreteFrequencyDistribution0.realMin((RealPositionable) nLinearInterpolator0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 33L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      Supplier<LongType> supplier0 = (Supplier<LongType>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      PointSample<LongType> pointSample0 = PointSample.wrapSupplier(supplier0, longArray0);
      RealComposite<LongType> realComposite0 = new RealComposite<LongType>(pointSample0, (-1071));
      discreteFrequencyDistribution0.realMax((RealPositionable) realComposite0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      Point point0 = discreteFrequencyDistribution0.dimensionsAsPoint();
      discreteFrequencyDistribution0.min((Positionable) point0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinMapper1d<Object> binMapper1d0 = (BinMapper1d<Object>) mock(BinMapper1d.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(binMapper1d0).getBinCount();
      Histogram1d<Object> histogram1d0 = new Histogram1d<Object>(binMapper1d0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = histogram1d0.dfd();
      Point point0 = discreteFrequencyDistribution0.dimensionsAsPoint();
      discreteFrequencyDistribution0.max((Positionable) point0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinMapper1d<Object> binMapper1d0 = (BinMapper1d<Object>) mock(BinMapper1d.class, new ViolatedAssumptionAnswer());
      doReturn(75L).when(binMapper1d0).getBinCount();
      Histogram1d<Object> histogram1d0 = new Histogram1d<Object>(binMapper1d0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = histogram1d0.dfd();
      discreteFrequencyDistribution0.resetCounters();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      double[] doubleArray0 = new double[2];
      discreteFrequencyDistribution0.realMax(doubleArray0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.max(longArray0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BinMapper1d<Object> binMapper1d0 = (BinMapper1d<Object>) mock(BinMapper1d.class, new ViolatedAssumptionAnswer());
      doReturn(733L).when(binMapper1d0).getBinCount();
      Histogram1d<Object> histogram1d0 = new Histogram1d<Object>(binMapper1d0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = histogram1d0.dfd();
      long[] longArray0 = new long[2];
      discreteFrequencyDistribution0.dimensions(longArray0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.min(longArray0);
      discreteFrequencyDistribution0.increment(longArray0);
      long long0 = discreteFrequencyDistribution0.totalValues();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.realMax(0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.numDimensions();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.max(0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.max(0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.iterator();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BinMapper1d<Object> binMapper1d0 = (BinMapper1d<Object>) mock(BinMapper1d.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(binMapper1d0).getBinCount();
      Histogram1d<Object> histogram1d0 = new Histogram1d<Object>(binMapper1d0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = histogram1d0.dfd();
      long[] longArray0 = new long[2];
      discreteFrequencyDistribution0.increment(longArray0);
      long long0 = discreteFrequencyDistribution0.frequency(longArray0);
      assertEquals(1L, discreteFrequencyDistribution0.totalValues());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 10L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.realMin((RealPositionable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.AbstractImg", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.realMax((RealPositionable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.AbstractImg", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      RealComposite<DoubleType> realComposite0 = DoubleType.createVector(1412);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.realMax((RealPositionable) realComposite0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("net.imglib2.view.composite.RealComposite", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.realMax((-2146034602));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2146034602 out of bounds for length 1
         //
         verifyException("net.imglib2.img.AbstractImg", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = 12L;
      longArray0[1] = 12L;
      longArray0[2] = 12L;
      longArray0[3] = 12L;
      longArray0[4] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      discreteFrequencyDistribution0.modePositions();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = 12L;
      longArray0[1] = 12L;
      longArray0[2] = 12L;
      longArray0[3] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      discreteFrequencyDistribution0.modeCount();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long[] longArray0 = new long[3];
      Stack<LongType> stack0 = new Stack<LongType>();
      ListImg<LongType> listImg0 = new ListImg<LongType>(stack0, longArray0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(listImg0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.modeCount();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.min((Positionable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.AbstractImg", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.max((Positionable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.AbstractImg", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      RealPoint realPoint0 = new RealPoint(17);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.max((Positionable) realPoint0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BinMapper1d<Object> binMapper1d0 = (BinMapper1d<Object>) mock(BinMapper1d.class, new ViolatedAssumptionAnswer());
      doReturn(1L).when(binMapper1d0).getBinCount();
      Histogram1d<Object> histogram1d0 = new Histogram1d<Object>(binMapper1d0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = histogram1d0.dfd();
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.increment((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.array.ArrayRandomAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.frequency((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.histogram.DiscreteFrequencyDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      long[] longArray1 = new long[0];
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.frequency(longArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.histogram.DiscreteFrequencyDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = 36L;
      longArray0[1] = 36L;
      longArray0[2] = 8L;
      longArray0[3] = 36L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      discreteFrequencyDistribution0.copy();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long[] longArray0 = new long[0];
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = null;
      try {
        discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Dimensions are zero length.
         //
         verifyException("net.imglib2.Dimensions", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[0] = 36L;
      longArray0[1] = 1L;
      longArray0[2] = 2147483639L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = null;
      try {
        discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Number of elements in ArrayImg too big, use for example CellImg instead: 77309411004 > 2147483647
         //
         verifyException("net.imglib2.img.array.ArrayImgFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = 12L;
      longArray0[1] = 3210L;
      longArray0[2] = 3210L;
      longArray0[3] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = null;
      try {
        discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.histogram.DiscreteFrequencyDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[0] = 36L;
      longArray0[1] = 36L;
      longArray0[2] = 36L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution1 = new DiscreteFrequencyDistribution(discreteFrequencyDistribution0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 36L;
      Stack<LongType> stack0 = new Stack<LongType>();
      ListImg<LongType> listImg0 = new ListImg<LongType>(stack0, longArray0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = null;
      try {
        discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(listImg0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.min(longArray0);
      discreteFrequencyDistribution0.increment(longArray0);
      discreteFrequencyDistribution0.modePositions();
      assertEquals(1L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 36L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      long long0 = discreteFrequencyDistribution0.frequency(longArray0);
      assertEquals(0L, long0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = null;
      try {
        discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution((Img<LongType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.histogram.DiscreteFrequencyDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.dimension(65);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.localizingCursor();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 22L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.min(longArray0);
      discreteFrequencyDistribution0.increment(longArray0);
      long long0 = discreteFrequencyDistribution0.modeCount();
      assertEquals(1L, discreteFrequencyDistribution0.totalValues());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      double double0 = discreteFrequencyDistribution0.relativeFrequency(longArray0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.setFrequency(longArray0, (-3113L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // frequency count must be >= 0
         //
         verifyException("net.imglib2.histogram.DiscreteFrequencyDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 11L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.setFrequency(longArray0, 11L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      long[] longArray1 = new long[3];
      longArray1[0] = (-2595L);
      long long0 = discreteFrequencyDistribution0.frequency(longArray1);
      assertEquals(0L, long0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      long[] longArray0 = new long[1];
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = null;
      try {
        discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bin count (<= 0)
         //
         verifyException("net.imglib2.histogram.DiscreteFrequencyDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.randomAccess();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.firstElement();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.randomAccess((Interval) null);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.min((-1344));
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.max(276);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 276 out of bounds for length 1
         //
         verifyException("net.imglib2.img.AbstractImg", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.size();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.realMax(0);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      long[] longArray1 = discreteFrequencyDistribution0.maxAsLongArray();
      discreteFrequencyDistribution0.decrement(longArray1);
      double double0 = discreteFrequencyDistribution0.relativeFrequency(longArray0);
      assertEquals((-1L), discreteFrequencyDistribution0.totalValues());
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      long long0 = discreteFrequencyDistribution0.totalValues();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.factory();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.cursor();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.decrement(longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.iterationOrder();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.realMin(40);
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 52L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.realMin((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.AbstractImg", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 12L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      discreteFrequencyDistribution0.modeCount();
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 22L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      // Undeclared exception!
      try { 
        discreteFrequencyDistribution0.increment(longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 1L;
      DiscreteFrequencyDistribution discreteFrequencyDistribution0 = new DiscreteFrequencyDistribution(longArray0);
      DiscreteFrequencyDistribution discreteFrequencyDistribution1 = discreteFrequencyDistribution0.copy();
      assertEquals(0L, discreteFrequencyDistribution1.totalValues());
      assertEquals(0L, discreteFrequencyDistribution0.totalValues());
  }
}
