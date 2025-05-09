/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 15:18:38 GMT 2022
 */

package net.imglib2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.imglib2.Dimensions;
import net.imglib2.FinalInterval;
import net.imglib2.Interval;
import net.imglib2.Point;
import net.imglib2.PointSampleList;
import net.imglib2.Positionable;
import net.imglib2.RealPoint;
import net.imglib2.RealPointSample;
import net.imglib2.RealPointSampleList;
import net.imglib2.RealPositionable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Interval_ESTest extends Interval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = (-1L);
      longArray0[1] = 932L;
      longArray0[2] = 0L;
      longArray0[3] = 1L;
      FinalInterval finalInterval0 = FinalInterval.createMinMax(longArray0);
      Point point0 = finalInterval0.minAsPoint();
      finalInterval0.maxAsDoubleArray();
      FinalInterval finalInterval1 = FinalInterval.wrap(longArray0, longArray0);
      long[] longArray1 = finalInterval0.minAsLongArray();
      finalInterval0.dimension(0);
      FinalInterval.createMinSize(longArray0, longArray0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0L;
      doubleArray0[1] = (double) 2L;
      doubleArray0[2] = (double) 932L;
      doubleArray0[3] = (double) 932L;
      doubleArray0[4] = (double) 1L;
      doubleArray0[5] = (double) 2L;
      doubleArray0[6] = (double) (-1L);
      FinalInterval.createMinSize(longArray1, longArray1);
      finalInterval1.realMax(doubleArray0);
      FinalInterval.wrap(longArray0, longArray0);
      FinalInterval finalInterval2 = FinalInterval.createMinMax(longArray0);
      finalInterval2.numDimensions();
      finalInterval1.maxAsPoint();
      finalInterval2.maxAsLongArray();
      double double0 = finalInterval2.realMax(0);
      finalInterval1.min((Positionable) point0);
      double double1 = finalInterval2.realMin(0);
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long[] longArray0 = new long[2];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.maxAsLongArray();
      // Undeclared exception!
      try { 
        finalInterval0.min((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = 1746L;
      longArray0[1] = 0L;
      longArray0[2] = (-3373L);
      longArray0[3] = (-1621L);
      FinalInterval finalInterval0 = FinalInterval.createMinSize(longArray0);
      FinalInterval finalInterval1 = new FinalInterval((Interval) finalInterval0);
      finalInterval1.minAsLongArray();
      long long0 = finalInterval0.dimension(0);
      assertEquals((-3373L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 0L;
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      FinalInterval finalInterval1 = new FinalInterval((Interval) finalInterval0);
      Point point0 = finalInterval1.minAsPoint();
      FinalInterval.createMinSize(longArray0, longArray0);
      finalInterval0.min((Positionable) point0);
      finalInterval0.dimension(0);
      FinalInterval.wrap(longArray0, longArray0);
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(0);
      pointSampleList0.iterator();
      long[] longArray1 = new long[2];
      longArray1[0] = 0L;
      longArray1[1] = 0L;
      FinalInterval.wrap(longArray0, longArray1);
      finalInterval1.maxAsPoint();
      FinalInterval.createMinSize(longArray0, longArray0);
      long[] longArray2 = new long[6];
      longArray2[0] = 0L;
      longArray2[1] = 0L;
      longArray2[2] = 0L;
      longArray2[3] = 0L;
      longArray2[4] = (long) 0;
      longArray2[5] = 0L;
      FinalInterval finalInterval2 = FinalInterval.createMinMax(longArray2);
      assertEquals(3, finalInterval2.numDimensions());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long[] longArray0 = new long[20];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, (long[]) null);
      // Undeclared exception!
      try { 
        finalInterval0.maxAsLongArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[] longArray0 = new long[5];
      FinalInterval finalInterval0 = FinalInterval.createMinSize(longArray0, longArray0);
      finalInterval0.minAsLongArray();
      // Undeclared exception!
      try { 
        finalInterval0.max((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[6];
      long[] longArray1 = new long[0];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray1);
      // Undeclared exception!
      try { 
        finalInterval0.maxAsLongArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[13];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.maxAsPoint();
      finalInterval0.minAsLongArray();
      finalInterval0.maxAsLongArray();
      long[] longArray1 = new long[0];
      // Undeclared exception!
      try { 
        finalInterval0.min(longArray1);
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
      long[] longArray0 = new long[4];
      longArray0[0] = 672L;
      longArray0[1] = 3533L;
      longArray0[2] = 0L;
      longArray0[3] = (-1L);
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      Point point0 = finalInterval0.minAsPoint();
      point0.positionAsDoubleArray();
      Point point1 = finalInterval0.minAsPoint();
      point1.localize((Positionable) point0);
      finalInterval0.equals(point1);
      finalInterval0.max(longArray0);
      double double0 = new Integer(0);
      FinalInterval finalInterval1 = FinalInterval.createMinSize(longArray0);
      double double1 = finalInterval1.realMin(0);
      assertEquals(671.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long[] longArray0 = new long[7];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.minAsLongArray();
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(434);
      pointSampleList0.min(40);
      PointSampleList pointSampleList1 = (PointSampleList)pointSampleList0.iterationOrder();
      assertEquals(434, pointSampleList1.numDimensions());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = 672L;
      longArray0[1] = 3533L;
      longArray0[2] = 0L;
      longArray0[3] = (-1L);
      FinalInterval finalInterval0 = new FinalInterval(longArray0);
      Point point0 = finalInterval0.minAsPoint();
      point0.positionAsDoubleArray();
      Point point1 = finalInterval0.minAsPoint();
      point1.localize((Positionable) point0);
      finalInterval0.equals(point1);
      finalInterval0.max(longArray0);
      double double0 = finalInterval0.realMax(0);
      assertEquals(671.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long[] longArray0 = new long[1];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.min(0);
      finalInterval0.minAsLongArray();
      double double0 = finalInterval0.realMax(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long[] longArray0 = new long[1];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.minAsLongArray();
      // Undeclared exception!
      try { 
        finalInterval0.max((Positionable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long[] longArray0 = new long[1];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      long[] longArray1 = finalInterval0.minAsLongArray();
      finalInterval0.realMin(0);
      FinalInterval finalInterval1 = new FinalInterval(longArray0, longArray1, false);
      RealPoint realPoint0 = finalInterval1.maxAsRealPoint();
      finalInterval0.min((Positionable) realPoint0);
      assertTrue(finalInterval1.equals((Object)finalInterval0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long[] longArray0 = new long[10];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.minAsLongArray();
      // Undeclared exception!
      try { 
        finalInterval0.min((Positionable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long[] longArray0 = new long[7];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.minAsLongArray();
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      // Undeclared exception!
      try { 
        pointSampleList0.min((-799));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -799 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long[] longArray0 = new long[2];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      FinalInterval finalInterval1 = FinalInterval.createMinMax(longArray0);
      Point point0 = finalInterval0.maxAsPoint();
      // Undeclared exception!
      try { 
        finalInterval1.min((Positionable) point0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("net.imglib2.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long[] longArray0 = new long[7];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.minAsLongArray();
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(2087);
      pointSampleList0.size();
      Point point0 = pointSampleList0.minAsPoint();
      // Undeclared exception!
      try { 
        finalInterval0.max((Positionable) point0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("net.imglib2.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[0] = 599L;
      longArray0[1] = (-673L);
      longArray0[2] = 1L;
      longArray0[3] = 0L;
      longArray0[4] = (-139L);
      longArray0[5] = (-2230L);
      FinalInterval finalInterval0 = FinalInterval.createMinSize(longArray0);
      double[] doubleArray0 = new double[1];
      finalInterval0.maxAsLongArray();
      finalInterval0.realMin(0);
      doubleArray0[0] = (double) (-139L);
      RealPoint realPoint0 = new RealPoint(doubleArray0, true);
      Supplier<Integer> supplier0 = (Supplier<Integer>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      float[] floatArray0 = new float[3];
      realPoint0.positionAsDoubleArray();
      floatArray0[0] = (float) 1L;
      floatArray0[1] = (float) (-673L);
      floatArray0[2] = (float) (-673L);
      RealPointSample<Integer> realPointSample0 = new RealPointSample<Integer>(supplier0, floatArray0);
      Supplier<Integer> supplier1 = realPointSample0.sampleSupplier;
      RealPointSample<Integer> realPointSample1 = new RealPointSample<Integer>(supplier1, doubleArray0);
      realPoint0.localize((RealPositionable) realPointSample1);
      finalInterval0.realMax((RealPositionable) realPoint0);
      FinalInterval finalInterval1 = new FinalInterval((Dimensions) finalInterval0);
      long[] longArray1 = new long[3];
      longArray1[0] = 599L;
      longArray1[1] = 599L;
      longArray1[2] = 0L;
      finalInterval1.max(longArray1);
      finalInterval0.max(longArray1);
      double double0 = finalInterval1.realMax(0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long[] longArray0 = new long[1];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.maxAsLongArray();
      long[] longArray1 = new long[0];
      // Undeclared exception!
      try { 
        finalInterval0.max(longArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long[] longArray0 = new long[0];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      long[] longArray1 = finalInterval0.minAsLongArray();
      assertArrayEquals(new long[] {}, longArray1);
      
      // Undeclared exception!
      try { 
        finalInterval0.dimension(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long[] longArray0 = new long[4];
      long[] longArray1 = new long[3];
      longArray1[0] = (-49L);
      longArray1[1] = 0L;
      longArray1[2] = (-2588L);
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray1);
      // Undeclared exception!
      try { 
        finalInterval0.maxAsPoint();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3 out of bounds for length 3
         //
         verifyException("net.imglib2.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long[] longArray0 = new long[1];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.minAsLongArray();
      // Undeclared exception!
      try { 
        finalInterval0.realMin(2419);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2419 out of bounds for length 1
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(1214);
      pointSampleList0.maxAsPoint();
      int int0 = 4705;
      PointSampleList<Object> pointSampleList1 = new PointSampleList<Object>(4705);
      long[] longArray0 = new long[1];
      longArray0[0] = (long) 4705;
      pointSampleList0.localizingCursor();
      // Undeclared exception!
      pointSampleList1.maxAsLongArray();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[0] = 0L;
      longArray0[1] = 0L;
      longArray0[2] = 0L;
      longArray0[3] = (-1L);
      longArray0[4] = (-1L);
      longArray0[5] = (-4347L);
      longArray0[6] = 0L;
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.minAsLongArray();
      long long0 = finalInterval0.dimension(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      Point point0 = pointSampleList0.maxAsPoint();
      Integer integer0 = new Integer(0);
      pointSampleList0.add(point0, integer0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      pointSampleList0.realMin(doubleArray0);
      PointSampleList<Point> pointSampleList1 = new PointSampleList<Point>(0);
      pointSampleList1.add(point0, point0);
      pointSampleList1.localizingCursor();
      PointSampleList<Object> pointSampleList2 = null;
      try {
        pointSampleList2 = new PointSampleList<Object>((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("net.imglib2.PointSampleList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(0);
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      pointSampleList0.iterator();
      pointSampleList0.toString();
      intArray0[1] = 0;
      pointSampleList0.maxAsLongArray();
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      pointSampleList0.minAsLongArray();
      intArray0[6] = 0;
      intArray0[7] = 0;
      try { 
        Dimensions.verify(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected only positive dimensions but got: [0, 0, 0, 0, 0, 0, 0, 0]
         //
         verifyException("net.imglib2.Dimensions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (-1385L);
      longArray0[1] = 1586L;
      longArray0[2] = (-1160L);
      longArray0[3] = 0L;
      longArray0[4] = 9223372036854775807L;
      longArray0[5] = (-1L);
      longArray0[6] = 1L;
      longArray0[7] = 0L;
      Point point0 = Point.wrap(longArray0);
      FinalInterval finalInterval0 = new FinalInterval(point0, point0);
      FinalInterval finalInterval1 = new FinalInterval((Dimensions) finalInterval0);
      Point point1 = finalInterval1.minAsPoint();
      assertFalse(point1.equals((Object)point0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[0] = 1L;
      longArray0[1] = 1L;
      longArray0[2] = (-2318L);
      longArray0[3] = 0L;
      longArray0[4] = (-3430L);
      longArray0[5] = (-2079L);
      longArray0[6] = 1L;
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      FinalInterval finalInterval1 = new FinalInterval((Interval) finalInterval0);
      long[] longArray1 = finalInterval1.minAsLongArray();
      assertFalse(longArray1.equals((Object)longArray0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      long[] longArray0 = new long[0];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.minAsPoint();
      int int0 = 175;
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(175);
      pointSampleList0.cursor();
      pointSampleList0.cursor();
      // Undeclared exception!
      try { 
        pointSampleList0.max(175);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 175 out of bounds for length 175
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = (-1334L);
      longArray0[1] = 0L;
      longArray0[2] = (-555L);
      longArray0[3] = (-1727L);
      longArray0[4] = 0L;
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      int[] intArray0 = new int[1];
      FinalInterval.createMinSize(longArray0);
      intArray0[0] = 814;
      Dimensions.verifyAllPositive(intArray0);
      finalInterval0.maxAsPoint();
      finalInterval0.maxAsLongArray();
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(814);
      pointSampleList0.cursor();
      pointSampleList0.cursor();
      // Undeclared exception!
      try { 
        pointSampleList0.max(814);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 814 out of bounds for length 814
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      long[] longArray0 = new long[7];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      Point point0 = finalInterval0.maxAsPoint();
      assertEquals(7, point0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long[] longArray0 = new long[0];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      Point point0 = finalInterval0.minAsPoint();
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(175);
      PointSampleList<Integer> pointSampleList1 = new PointSampleList<Integer>(819);
      Object object0 = pointSampleList1.iterationOrder();
      // Undeclared exception!
      try { 
        pointSampleList0.add(point0, object0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long[] longArray0 = new long[1];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      Point point0 = finalInterval0.minAsPoint();
      assertEquals(1, point0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long[] longArray0 = new long[2];
      FinalInterval finalInterval0 = FinalInterval.createMinSize(longArray0, longArray0);
      long[] longArray1 = finalInterval0.maxAsLongArray();
      assertNotSame(longArray0, longArray1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[0] = 599L;
      longArray0[1] = (-673L);
      longArray0[2] = 1L;
      longArray0[3] = 0L;
      longArray0[4] = (-139L);
      longArray0[5] = (-2230L);
      FinalInterval finalInterval0 = FinalInterval.createMinSize(longArray0);
      double[] doubleArray0 = new double[1];
      finalInterval0.maxAsLongArray();
      finalInterval0.realMin(0);
      doubleArray0[0] = (double) (-139L);
      RealPoint realPoint0 = new RealPoint(doubleArray0, true);
      Supplier<Integer> supplier0 = (Supplier<Integer>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      float[] floatArray0 = new float[3];
      floatArray0[0] = (float) 1L;
      floatArray0[1] = (float) (-673L);
      floatArray0[2] = (float) (-673L);
      RealPointSample<Integer> realPointSample0 = new RealPointSample<Integer>(supplier0, floatArray0);
      Supplier<Integer> supplier1 = realPointSample0.sampleSupplier;
      RealPointSample<Integer> realPointSample1 = new RealPointSample<Integer>(supplier1, doubleArray0);
      realPoint0.localize((RealPositionable) realPointSample1);
      finalInterval0.realMax((RealPositionable) realPoint0);
      FinalInterval finalInterval1 = new FinalInterval((Dimensions) finalInterval0);
      long[] longArray1 = new long[3];
      longArray1[0] = 599L;
      longArray1[1] = 599L;
      longArray1[2] = 0L;
      finalInterval1.max(longArray1);
      finalInterval0.max(longArray1);
      assertEquals(3, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long[] longArray0 = new long[20];
      FinalInterval finalInterval0 = FinalInterval.wrap(longArray0, longArray0);
      finalInterval0.minAsLongArray();
      // Undeclared exception!
      try { 
        finalInterval0.realMax((-2172));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2172 out of bounds for length 20
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = 0;
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      pointSampleList0.minAsDoubleArray();
      pointSampleList0.minAsLongArray();
      pointSampleList0.cursor();
      // Undeclared exception!
      try { 
        pointSampleList0.realMax(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractInterval", e);
      }
  }
}
