/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 27 19:33:45 GMT 2022
 */

package com.conversantmedia.util.collection.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.conversantmedia.util.collection.geometry.Point1d;
import com.conversantmedia.util.collection.geometry.Point2d;
import com.conversantmedia.util.collection.geometry.Point3d;
import com.conversantmedia.util.collection.spatial.HyperPoint;
import com.conversantmedia.util.collection.spatial.HyperRect;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Point2d_ESTest extends Point2d_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Point2d.Builder point2d_Builder0 = new Point2d.Builder();
      Point2d point2d0 = new Point2d(1.0, 1.0);
      Point2d point2d1 = new Point2d(1, 1);
      HyperRect hyperRect0 = point2d_Builder0.getMbr(point2d1, point2d0);
      assertEquals(0.0, hyperRect0.cost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point2d point2d0 = new Point2d((-1314.793346773), (-1.0));
      point2d0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Point2d point2d0 = new Point2d(1.0, 2247.43);
      Point2d point2d1 = new Point2d(1.0, 553.23596236218);
      boolean boolean0 = point2d0.equals(point2d1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Point2d point2d0 = new Point2d((-1.0), (-1.0));
      Point2d point2d1 = new Point2d((-1314.793346773), (-1.0));
      double double0 = point2d1.distance((HyperPoint) point2d0, 0);
      assertEquals(1313.793346773, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Point2d point2d0 = new Point2d((-1198.93), (-1198.93));
      Point2d point2d1 = new Point2d((-1198.93), 0);
      double double0 = point2d1.distance((HyperPoint) point2d0, 0);
      assertEquals(0.0, double0, 0.01);
      assertFalse(point2d1.equals((Object)point2d0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Point2d point2d0 = new Point2d((-1198.93), (-1198.93));
      Point2d point2d1 = new Point2d((-1198.93), 0);
      double double0 = point2d0.distance((HyperPoint) point2d1);
      assertEquals(1198.93, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Point2d point2d0 = new Point2d((-478.08), 0.0);
      double double0 = point2d0.distance((HyperPoint) point2d0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Point2d point2d0 = new Point2d(1.0, 2247.43);
      Double double0 = point2d0.getCoord(1);
      assertEquals(2247.43, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point2d point2d0 = new Point2d(1.0, 1.0);
      // Undeclared exception!
      try { 
        point2d0.getCoord((-1824));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid dimension
         //
         verifyException("com.conversantmedia.util.collection.geometry.Point2d", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point2d point2d0 = new Point2d(0.0, 2808.6113127);
      Double double0 = point2d0.getCoord(0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Point2d point2d0 = new Point2d(1.0, 0.0);
      Point2d point2d1 = new Point2d(0, (-1.0));
      double double0 = point2d0.distance((HyperPoint) point2d1, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Point2d point2d0 = new Point2d((-1.0), (-1.0));
      Point2d point2d1 = new Point2d((-1314.793346773), (-1.0));
      double double0 = point2d0.distance((HyperPoint) point2d1);
      assertEquals(1313.793346773, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Point2d point2d0 = new Point2d((-8.13850487933514), (-8.13850487933514));
      // Undeclared exception!
      try { 
        point2d0.distance((HyperPoint) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.conversantmedia.util.collection.geometry.Point2d", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point2d point2d0 = new Point2d(0.0, 0.0);
      Point3d point3d0 = new Point3d(0.0, 0, 0);
      // Undeclared exception!
      try { 
        point2d0.distance((HyperPoint) point3d0, 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.conversantmedia.util.collection.geometry.Point3d cannot be cast to class com.conversantmedia.util.collection.geometry.Point2d (com.conversantmedia.util.collection.geometry.Point3d and com.conversantmedia.util.collection.geometry.Point2d are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @2896ebd)
         //
         verifyException("com.conversantmedia.util.collection.geometry.Point2d", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Point2d point2d0 = new Point2d(0.0, 0.0);
      // Undeclared exception!
      try { 
        point2d0.distance((HyperPoint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.conversantmedia.util.collection.geometry.Point2d", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point2d point2d0 = new Point2d(0.0, 0.0);
      Point1d point1d0 = new Point1d(0);
      // Undeclared exception!
      try { 
        point2d0.distance((HyperPoint) point1d0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.conversantmedia.util.collection.geometry.Point1d cannot be cast to class com.conversantmedia.util.collection.geometry.Point2d (com.conversantmedia.util.collection.geometry.Point1d and com.conversantmedia.util.collection.geometry.Point2d are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @2896ebd)
         //
         verifyException("com.conversantmedia.util.collection.geometry.Point2d", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Point2d point2d0 = new Point2d(1.0, 1.0);
      Point2d point2d1 = new Point2d(1, 1);
      boolean boolean0 = point2d0.equals(point2d1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point2d point2d0 = new Point2d((-2099.4640233), (-2099.4640233));
      Object object0 = new Object();
      boolean boolean0 = point2d0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point2d point2d0 = new Point2d(1.0, 0.0);
      Point2d point2d1 = new Point2d(0, (-1.0));
      boolean boolean0 = point2d0.equals(point2d1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Point2d point2d0 = new Point2d(926.10762, 926.10762);
      boolean boolean0 = point2d0.equals(point2d0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Point2d point2d0 = new Point2d((-1198.93), (-1198.93));
      boolean boolean0 = point2d0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Point2d point2d0 = new Point2d(1.0, 0.0);
      // Undeclared exception!
      try { 
        point2d0.distance((HyperPoint) point2d0, (-393));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid dimension
         //
         verifyException("com.conversantmedia.util.collection.geometry.Point2d", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Point2d point2d0 = new Point2d((-1198.93), (-1198.93));
      double double0 = point2d0.distance((HyperPoint) point2d0, 1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Point2d point2d0 = new Point2d((-1198.93), (-1198.93));
      Double double0 = point2d0.getCoord(0);
      assertEquals((-1198.93), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Point2d point2d0 = new Point2d((-1198.93), (-1198.93));
      Point2d.Builder point2d_Builder0 = new Point2d.Builder();
      HyperRect hyperRect0 = point2d_Builder0.getBBox(point2d0);
      assertEquals(0.0, hyperRect0.cost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Point2d point2d0 = new Point2d(0.0, 0.0);
      int int0 = point2d0.getNDim();
      assertEquals(2, int0);
  }
}
