/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 14:58:34 GMT 2022
 */

package net.imglib2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Supplier;
import net.imglib2.Cursor;
import net.imglib2.KDTree;
import net.imglib2.Point;
import net.imglib2.PointSample;
import net.imglib2.PointSampleList;
import net.imglib2.Positionable;
import net.imglib2.RealPointSample;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Localizable_ESTest extends Localizable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(14);
      Point point0 = pointSampleList0.dimensionsAsPoint();
      double[] doubleArray0 = new double[9];
      RealPointSample<Object> realPointSample0 = RealPointSample.wrap((Object) null, doubleArray0);
      // Undeclared exception!
      try { 
        point0.localize((Positionable) realPointSample0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long[] longArray0 = new long[5];
      PointSample<Object> pointSample0 = PointSample.wrap((Object) null, longArray0);
      pointSample0.localize(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long[] longArray0 = new long[5];
      PointSample<Object> pointSample0 = PointSample.wrap((Object) null, longArray0);
      Supplier<Object> supplier0 = pointSample0.sampleSupplier;
      int[] intArray0 = new int[0];
      PointSample<Object> pointSample1 = new PointSample<Object>(supplier0, intArray0);
      Point point0 = pointSample1.positionAsPoint();
      assertEquals(0, point0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long[] longArray0 = new long[0];
      Point point0 = Point.wrap(longArray0);
      long[] longArray1 = point0.positionAsLongArray();
      assertArrayEquals(new long[] {}, longArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Point point0 = new Point(1639);
      long[] longArray0 = point0.positionAsLongArray();
      PointSample<Integer> pointSample0 = new PointSample<Integer>((Supplier<Integer>) null, longArray0, false);
      long long0 = pointSample0.getLongPosition(533);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(3522);
      Point point0 = pointSampleList0.maxAsPoint();
      long[] longArray0 = point0.positionAsLongArray();
      Supplier<Integer> supplier0 = (Supplier<Integer>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      PointSample<Integer> pointSample0 = new PointSample<Integer>(supplier0, longArray0, false);
      long long0 = pointSample0.getLongPosition(2708);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(2682);
      Point point0 = pointSampleList0.maxAsPoint();
      int int0 = point0.getIntPosition(512);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(277);
      Point point0 = pointSampleList0.dimensionsAsPoint();
      int int0 = point0.getIntPosition(0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[1];
      PointSample<Object> pointSample0 = new PointSample<Object>(supplier0, intArray0);
      Supplier<Object> supplier1 = pointSample0.sampleSupplier;
      PointSample<Object> pointSample1 = new PointSample<Object>(supplier1, 2741);
      float float0 = pointSample1.getFloatPosition(2721);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(561);
      Point point0 = pointSampleList0.dimensionsAsPoint();
      float float0 = point0.getFloatPosition(0);
      assertEquals(2.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Point point0 = new Point(554);
      double double0 = point0.getDoublePosition(2);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(3522);
      Point point0 = pointSampleList0.maxAsPoint();
      long[] longArray0 = point0.positionAsLongArray();
      Supplier<Integer> supplier0 = (Supplier<Integer>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      PointSample<Integer> pointSample0 = new PointSample<Integer>(supplier0, longArray0, false);
      Supplier<Integer> supplier1 = pointSample0.sampleSupplier;
      int[] intArray0 = new int[2];
      intArray0[0] = 3522;
      PointSample<Integer> pointSample1 = new PointSample<Integer>(supplier1, intArray0);
      double double0 = pointSample1.getDoublePosition(0);
      assertEquals(3522.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(18);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      // Undeclared exception!
      try { 
        pointSampleList_PointSampleListCursor0.positionAsPoint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.PointSampleList$PointSampleListCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PointSampleList<KDTree.KDTreeCursor> pointSampleList0 = new PointSampleList<KDTree.KDTreeCursor>(2347);
      Cursor<KDTree.KDTreeCursor> cursor0 = pointSampleList0.cursor();
      // Undeclared exception!
      try { 
        cursor0.positionAsLongArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.PointSampleList$PointSampleListCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(561);
      Point point0 = pointSampleList0.dimensionsAsPoint();
      // Undeclared exception!
      try { 
        point0.localize((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point point0 = new Point(2075);
      long[] longArray0 = new long[1];
      // Undeclared exception!
      try { 
        point0.localize(longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(1015);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      // Undeclared exception!
      try { 
        pointSampleList_PointSampleListCursor0.localize((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.PointSampleList$PointSampleListCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point point0 = new Point(1639);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        point0.localize(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point point0 = new Point(652);
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(2627);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      // Undeclared exception!
      try { 
        pointSampleList_PointSampleListCursor0.localize((Positionable) point0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.PointSampleList$PointSampleListCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      // Undeclared exception!
      try { 
        pointSampleList_PointSampleListCursor0.getLongPosition(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.PointSampleList$PointSampleListCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PointSample<Integer> pointSample0 = new PointSample<Integer>((Supplier<Integer>) null, 533);
      // Undeclared exception!
      try { 
        pointSample0.getLongPosition(533);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(0);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      // Undeclared exception!
      try { 
        pointSampleList_PointSampleListCursor0.getIntPosition(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.PointSampleList$PointSampleListCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Point point0 = new Point(1437);
      // Undeclared exception!
      try { 
        point0.getIntPosition((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 1437
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      // Undeclared exception!
      try { 
        pointSampleList_PointSampleListCursor0.getFloatPosition(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.PointSampleList$PointSampleListCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Point point0 = new Point(556);
      // Undeclared exception!
      try { 
        point0.getFloatPosition(556);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 556 out of bounds for length 556
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      // Undeclared exception!
      try { 
        pointSampleList_PointSampleListCursor0.getDoublePosition(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.PointSampleList$PointSampleListCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Point point0 = new Point(1027);
      // Undeclared exception!
      try { 
        point0.getDoublePosition(1027);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1027 out of bounds for length 1027
         //
         verifyException("net.imglib2.AbstractLocalizable", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(0);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      Point point0 = pointSampleList0.dimensionsAsPoint();
      pointSampleList_PointSampleListCursor0.localize((Positionable) point0);
      assertEquals(0, point0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Point point0 = new Point(2058);
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      PointSampleList.PointSampleListCursor pointSampleList_PointSampleListCursor0 = pointSampleList0.new PointSampleListCursor();
      pointSampleList_PointSampleListCursor0.localize((Positionable) point0);
      assertFalse(pointSampleList_PointSampleListCursor0.hasNext());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(2682);
      Point point0 = pointSampleList0.maxAsPoint();
      Point point1 = point0.positionAsPoint();
      assertNotSame(point0, point1);
  }
}
