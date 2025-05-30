/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 12:32:35 GMT 2022
 */

package net.imglib2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Supplier;
import net.imglib2.Localizable;
import net.imglib2.Point;
import net.imglib2.PointSample;
import net.imglib2.PointSampleList;
import net.imglib2.RealLocalizable;
import net.imglib2.RealPoint;
import net.imglib2.RealPointSample;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RealPoint_ESTest extends RealPoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(1);
      RealPoint realPoint0 = pointSampleList0.maxAsRealPoint();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2375.2905247621184);
      realPoint0.move(doubleArray0);
      assertArrayEquals(new double[] {(-2375.2905247621184), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealPoint realPoint0 = new RealPoint(doubleArray0);
      float[] floatArray0 = new float[3];
      floatArray0[0] = (float) 1399;
      realPoint0.move(floatArray0);
      assertEquals(1, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(3509);
      RealPoint realPoint0 = pointSampleList0.maxAsRealPoint();
      long[] longArray0 = new long[3];
      longArray0[0] = (long) 3509;
      // Undeclared exception!
      try { 
        realPoint0.move(longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3 out of bounds for length 3
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealPoint realPoint0 = new RealPoint(doubleArray0);
      int[] intArray0 = new int[4];
      intArray0[0] = 1399;
      realPoint0.move(intArray0);
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      float[] floatArray0 = new float[8];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      long[] longArray0 = new long[8];
      longArray0[0] = (-1L);
      Point point0 = Point.wrap(longArray0);
      realPoint0.move((Localizable) point0);
      assertEquals(8, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealPoint realPoint0 = new RealPoint(doubleArray0, true);
      realPoint0.move(969L, 0);
      assertEquals(6, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(938);
      realPoint0.move((-2300), 0);
      assertEquals(938, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(0);
      // Undeclared exception!
      try { 
        realPoint0.move((-1), 2505);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2505 out of bounds for length 0
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      float[] floatArray0 = new float[6];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      long[] longArray0 = new long[7];
      realPoint0.setPosition(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      realPoint0.setPosition((RealLocalizable) realPoint0);
      assertEquals(0, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Supplier<RealPoint> supplier0 = (Supplier<RealPoint>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      long[] longArray0 = new long[9];
      PointSample<RealPoint> pointSample0 = new PointSample<RealPoint>(supplier0, longArray0);
      Supplier<RealPoint> supplier1 = pointSample0.sampleSupplier;
      RealPointSample<RealPoint> realPointSample0 = new RealPointSample<RealPoint>(supplier1, pointSample0);
      RealPoint realPoint0 = new RealPoint(realPointSample0);
      assertEquals(9, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      float[] floatArray0 = new float[6];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      realPoint0.setPosition((double) 0.0F, 0);
      assertEquals(6, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealPoint realPoint0 = new RealPoint(doubleArray0, true);
      realPoint0.move((float) 1, 1);
      assertEquals(2, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(2287);
      realPoint0.move(872.049492, 0);
      assertEquals(2287, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      float[] floatArray0 = new float[8];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      realPoint0.fwd(1);
      assertEquals(8, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        RealPoint.wrap((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractRealLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      float[] floatArray0 = new float[11];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      // Undeclared exception!
      try { 
        realPoint0.setPosition((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(1689);
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        realPoint0.setPosition(longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        realPoint0.setPosition(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(1697);
      // Undeclared exception!
      try { 
        realPoint0.setPosition((float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealPoint realPoint0 = new RealPoint(doubleArray0);
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        realPoint0.setPosition(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      // Undeclared exception!
      try { 
        realPoint0.setPosition((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealPoint realPoint0 = new RealPoint(2634);
      // Undeclared exception!
      try { 
        realPoint0.setPosition(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 8 out of bounds for length 8
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      float[] floatArray0 = new float[6];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      // Undeclared exception!
      try { 
        realPoint0.setPosition((RealLocalizable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      RealPoint realPoint1 = new RealPoint(815);
      // Undeclared exception!
      try { 
        realPoint1.setPosition((RealLocalizable) realPoint0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(229);
      // Undeclared exception!
      try { 
        realPoint0.setPosition((Localizable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      long[] longArray0 = new long[2];
      Point point0 = Point.wrap(longArray0);
      // Undeclared exception!
      try { 
        realPoint0.setPosition((Localizable) point0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(1);
      RealPoint realPoint0 = pointSampleList0.maxAsRealPoint();
      // Undeclared exception!
      try { 
        realPoint0.setPosition((-1994L), (-1989));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1989 out of bounds for length 1
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(425);
      RealPoint realPoint0 = pointSampleList0.maxAsRealPoint();
      // Undeclared exception!
      try { 
        realPoint0.setPosition(425, 425);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 425 out of bounds for length 425
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        realPoint0.move(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      // Undeclared exception!
      try { 
        realPoint0.move((float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(1242);
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        realPoint0.move(floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      float[] floatArray0 = new float[1];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      // Undeclared exception!
      try { 
        realPoint0.move((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      float[] floatArray0 = new float[11];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        realPoint0.move(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(5641);
      // Undeclared exception!
      try { 
        realPoint0.move((RealLocalizable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      RealPoint realPoint1 = new RealPoint(1);
      // Undeclared exception!
      try { 
        realPoint1.move((RealLocalizable) realPoint0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(44);
      // Undeclared exception!
      try { 
        realPoint0.move((Localizable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      long[] longArray0 = new long[0];
      Point point0 = Point.wrap(longArray0);
      // Undeclared exception!
      try { 
        realPoint0.move((Localizable) point0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      // Undeclared exception!
      try { 
        realPoint0.move(1326L, 487);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 487 out of bounds for length 0
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(2);
      // Undeclared exception!
      try { 
        realPoint0.bck(1240);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1240 out of bounds for length 2
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RealPoint realPoint0 = null;
      try {
        realPoint0 = new RealPoint((float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RealPoint realPoint0 = null;
      try {
        realPoint0 = new RealPoint((double[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RealPoint realPoint0 = null;
      try {
        realPoint0 = new RealPoint((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(728);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      RealPoint realPoint0 = null;
      try {
        realPoint0 = new RealPoint(pointSampleList_PointSampleListCursor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.PointSampleList$PointSampleListCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RealPoint realPoint0 = null;
      try {
        realPoint0 = new RealPoint((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("net.imglib2.AbstractRealLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      float[] floatArray0 = new float[8];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      realPoint0.setPosition(floatArray0);
      assertEquals(8, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      float[] floatArray0 = new float[0];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      RealPoint realPoint1 = new RealPoint(927);
      boolean boolean0 = realPoint0.equals(realPoint1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      Object object0 = new Object();
      boolean boolean0 = realPoint0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      float[] floatArray0 = new float[0];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      boolean boolean0 = realPoint0.equals(realPoint0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      boolean boolean0 = realPoint0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      PointSampleList<RealPoint> pointSampleList0 = new PointSampleList<RealPoint>(989);
      RealPoint realPoint0 = pointSampleList0.minAsRealPoint();
      realPoint0.move((RealLocalizable) realPoint0);
      assertEquals(989, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      // Undeclared exception!
      try { 
        realPoint0.setPosition((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      realPoint0.setPosition((int[]) null);
      assertEquals(0, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Point point0 = new Point(1697);
      RealPoint realPoint0 = new RealPoint(1697);
      realPoint0.setPosition((Localizable) point0);
      assertEquals(1697, point0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      // Undeclared exception!
      try { 
        realPoint0.move((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      RealPoint realPoint0 = RealPoint.wrap(doubleArray0);
      long[] longArray0 = new long[0];
      realPoint0.move(longArray0);
      assertEquals(0, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      float[] floatArray0 = new float[11];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      // Undeclared exception!
      try { 
        realPoint0.move((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      PointSampleList<RealPoint> pointSampleList0 = new PointSampleList<RealPoint>(1);
      RealPoint realPoint0 = pointSampleList0.minAsRealPoint();
      // Undeclared exception!
      try { 
        realPoint0.move((double) 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      float[] floatArray0 = new float[11];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      // Undeclared exception!
      try { 
        realPoint0.move((-1.0F), (-279));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -279 out of bounds for length 11
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealPoint realPoint0 = new RealPoint(doubleArray0, false);
      realPoint0.setPosition(1797.0112F, 0);
      assertArrayEquals(new double[] {1797.01123046875, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealPoint realPoint0 = new RealPoint(doubleArray0, false);
      realPoint0.hashCode();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealPoint realPoint0 = new RealPoint(doubleArray0, true);
      // Undeclared exception!
      try { 
        realPoint0.setPosition(0.0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 2
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      PointSampleList<RealPoint> pointSampleList0 = new PointSampleList<RealPoint>(989);
      RealPoint realPoint0 = pointSampleList0.minAsRealPoint();
      realPoint0.setPosition((long) 0, 0);
      assertEquals(989, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealPoint realPoint0 = new RealPoint(doubleArray0);
      realPoint0.bck(1);
      assertEquals(4, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      float[] floatArray0 = new float[8];
      RealPoint realPoint0 = new RealPoint(floatArray0);
      realPoint0.setPosition(964, 0);
      assertEquals(8, realPoint0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(1638);
      // Undeclared exception!
      try { 
        realPoint0.fwd(1638);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1638 out of bounds for length 1638
         //
         verifyException("net.imglib2.RealPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealPoint realPoint0 = new RealPoint(doubleArray0);
      realPoint0.setPosition(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      RealPoint realPoint0 = new RealPoint(44);
      String string0 = realPoint0.toString();
      assertEquals("(0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0)", string0);
  }
}
