/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 07:01:46 GMT 2022
 */

package com.irurueta.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.irurueta.geometry.CoordinatesType;
import com.irurueta.geometry.HomogeneousPoint2D;
import com.irurueta.geometry.InhomogeneousPoint2D;
import com.irurueta.geometry.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Point2D_ESTest extends Point2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      homogeneousPoint2D0.setW(1831.68836);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      boolean boolean0 = inhomogeneousPoint2D0.isBetween((Point2D) homogeneousPoint2D0, (Point2D) homogeneousPoint2D0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      boolean boolean0 = homogeneousPoint2D0.isBetween((Point2D) homogeneousPoint2D0, (Point2D) homogeneousPoint2D0, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(483.9879813887968, 2);
      boolean boolean0 = homogeneousPoint2D0.isBetween((Point2D) inhomogeneousPoint2D0, (Point2D) homogeneousPoint2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(483.9879813887968, 2);
      double double0 = inhomogeneousPoint2D0.dotProduct(homogeneousPoint2D0);
      assertEquals(0.0020661449581581004, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      homogeneousPoint2D0.setInhomogeneousCoordinate(0, 0.0);
      assertEquals(0.0, homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.getInhomogeneousCoordinate(2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      point2D0.setCoordinates(point2D0);
      assertEquals(0.0, Point2D.MIN_THRESHOLD, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      point2D0.setInhomY(0.0);
      assertEquals(1.0E-10, Point2D.DEFAULT_COMPARISON_THRESHOLD, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      point2D0.setInhomX(2347.1455);
      assertEquals(0.0, point2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      double double0 = point2D0.sqrDistanceTo(point2D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = inhomogeneousPoint2D0.toHomogeneous();
      homogeneousPoint2D0.setHomogeneousCoordinates(1.0E-10, (-520.959630180745), (-251.79324098));
      double double0 = inhomogeneousPoint2D0.sqrDistanceTo((Point2D) homogeneousPoint2D0);
      assertEquals(4.280751379359358, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      boolean boolean0 = homogeneousPoint2D0.isNormalized();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(homogeneousPoint2D0);
      boolean boolean0 = inhomogeneousPoint2D0.isBetween((Point2D) homogeneousPoint2D0, (Point2D) homogeneousPoint2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      boolean boolean0 = inhomogeneousPoint2D0.isAtInfinity();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Point2D point2D0 = Point2D.create(doubleArray0);
      CoordinatesType coordinatesType0 = point2D0.getType();
      assertEquals(CoordinatesType.HOMOGENEOUS_COORDINATES, coordinatesType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.2712547436499357;
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      double double0 = homogeneousPoint2D0.getInhomogeneousCoordinate(0);
      assertEquals(2, homogeneousPoint2D0.getDimensions());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-1313.300996891), 1.0E-10, 0.0);
      double double0 = homogeneousPoint2D0.getInhomogeneousCoordinate(0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(2, homogeneousPoint2D0.getDimensions());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      double double0 = point2D0.getInhomY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setY(90.980713095065);
      double double0 = inhomogeneousPoint2D0.getInhomY();
      assertEquals(90.980713095065, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      homogeneousPoint2D0.setInhomY((-1783.5494));
      double double0 = homogeneousPoint2D0.getInhomY();
      assertEquals((-1783.5494), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      double double0 = inhomogeneousPoint2D0.getInhomX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1633.167, 2444.96083897);
      double double0 = inhomogeneousPoint2D0.getInhomX();
      assertEquals(1633.167, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1587.0);
      Point2D point2D0 = Point2D.create(doubleArray0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(point2D0);
      double double0 = inhomogeneousPoint2D0.getInhomX();
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      double double0 = homogeneousPoint2D0.getHomY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 1.0E-10;
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      double double0 = homogeneousPoint2D0.getHomY();
      assertEquals(1.0E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      homogeneousPoint2D0.setHomogeneousCoordinates(3, (-76.8047423166489), (-1035.125));
      double double0 = homogeneousPoint2D0.getHomY();
      assertEquals((-76.8047423166489), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(189.6, 0.0, 0.0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      inhomogeneousPoint2D0.setX(0.0);
      double double0 = inhomogeneousPoint2D0.getHomX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(189.6, 0.0, 0.0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      double double0 = inhomogeneousPoint2D0.getHomX();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-2509.820636396136), (-529.482865442), 303.0);
      double double0 = homogeneousPoint2D0.getHomX();
      assertEquals((-2509.820636396136), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      double double0 = homogeneousPoint2D0.getHomW();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-1410.49668237), (-1410.49668237));
      double double0 = inhomogeneousPoint2D0.getHomW();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (-1586.6728210123113);
      Point2D point2D0 = Point2D.create(doubleArray0);
      double double0 = point2D0.getHomW();
      assertEquals((-1586.6728210123113), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      boolean boolean0 = homogeneousPoint2D0.equals((Object) homogeneousPoint2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(0.0, 0.0);
      Object object0 = new Object();
      boolean boolean0 = inhomogeneousPoint2D0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(point2D0);
      boolean boolean0 = point2D0.equals((Point2D) inhomogeneousPoint2D0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = inhomogeneousPoint2D0.toHomogeneous();
      homogeneousPoint2D0.setHomogeneousCoordinates(1.0E-10, (-520.959630180745), (-251.79324098));
      boolean boolean0 = inhomogeneousPoint2D0.equals((Point2D) homogeneousPoint2D0, 1.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-1410.49668237), (-1410.49668237));
      boolean boolean0 = inhomogeneousPoint2D0.equals((Point2D) inhomogeneousPoint2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1633.167, 2444.96083897);
      InhomogeneousPoint2D inhomogeneousPoint2D1 = new InhomogeneousPoint2D(1633.167, 0.0);
      boolean boolean0 = inhomogeneousPoint2D0.equals((Point2D) inhomogeneousPoint2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.2712547436499357;
      Point2D point2D0 = Point2D.create(doubleArray0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      double double0 = inhomogeneousPoint2D0.dotProduct(point2D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-1410.49668237), (-1410.49668237));
      double double0 = inhomogeneousPoint2D0.dotProduct(inhomogeneousPoint2D0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-1410.49668237), (-1410.49668237));
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(1.0E-10, 3, 0.0);
      double double0 = inhomogeneousPoint2D0.dotProduct(homogeneousPoint2D0);
      assertEquals((-0.7071066923553389), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0, 1.0);
      Point2D point2D0 = Point2D.create(inhomogeneousPoint2D0.DEFAULT_COORDINATES_TYPE);
      double double0 = inhomogeneousPoint2D0.distanceTo(point2D0);
      assertEquals(1.4142135623730951, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CoordinatesType coordinatesType0 = CoordinatesType.INHOMOGENEOUS_COORDINATES;
      double[] doubleArray0 = new double[2];
      Point2D point2D0 = Point2D.create(coordinatesType0, doubleArray0);
      assertEquals(0.0, point2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Point2D point2D0 = Point2D.create();
      Point2D point2D1 = Point2D.create(point2D0.DEFAULT_COORDINATES_TYPE, doubleArray0);
      boolean boolean0 = point2D1.isAtInfinity();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(232.316, 232.316);
      double[] doubleArray0 = inhomogeneousPoint2D0.asArray();
      assertArrayEquals(new double[] {232.316, 232.316}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      // Undeclared exception!
      try { 
        point2D0.setCoordinates((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        point2D0.setCoordinates(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      // Undeclared exception!
      try { 
        point2D0.setCoordinates((Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      // Undeclared exception!
      try { 
        point2D0.isBetween((Point2D) null, (Point2D) null, (double) 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      // Undeclared exception!
      try { 
        point2D0.isBetween((Point2D) null, (Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      // Undeclared exception!
      try { 
        point2D0.equals((Point2D) null, (-2341.3117845));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      // Undeclared exception!
      try { 
        point2D0.equals(point2D0, (-2341.3117845));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      // Undeclared exception!
      try { 
        point2D0.equals((Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.dotProduct((Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.distanceTo((Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        Point2D.create((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        Point2D.create(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        Point2D.create((CoordinatesType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.asArray((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        point2D0.asArray(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      // Undeclared exception!
      try { 
        Point2D.create(point2D0.DEFAULT_COORDINATES_TYPE, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      double double0 = homogeneousPoint2D0.distanceTo((Point2D) homogeneousPoint2D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.sqrDistanceTo((Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      int int0 = point2D0.getDimensions();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(2, (-1431.872));
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.isBetween(point2D0, point2D0, (-1431.872));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      homogeneousPoint2D0.setInhomogeneousCoordinate(1, 2);
      assertEquals(2.0, homogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      // Undeclared exception!
      try { 
        point2D0.setInhomogeneousCoordinate(3, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      homogeneousPoint2D0.setInhomogeneousCoordinate(0, 1.0E-10);
      assertEquals(1.0E-10, homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.getInhomogeneousCoordinate(0);
      assertEquals(2, inhomogeneousPoint2D0.getDimensions());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.getInhomogeneousCoordinate(3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.getInhomogeneousCoordinate((-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.Point2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CoordinatesType coordinatesType0 = CoordinatesType.INHOMOGENEOUS_COORDINATES;
      Point2D point2D0 = Point2D.create(coordinatesType0);
      assertEquals(1.0, point2D0.getHomW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      CoordinatesType coordinatesType0 = CoordinatesType.INHOMOGENEOUS_COORDINATES;
      // Undeclared exception!
      try { 
        Point2D.create(coordinatesType0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.normalize();
      assertEquals(2, inhomogeneousPoint2D0.getDimensions());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      point2D0.getInhomogeneousCoordinate(1);
      assertEquals(2, point2D0.getDimensions());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      boolean boolean0 = homogeneousPoint2D0.isBetween((Point2D) homogeneousPoint2D0, (Point2D) homogeneousPoint2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(homogeneousPoint2D0);
      double double0 = homogeneousPoint2D0.dotProduct(inhomogeneousPoint2D0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-3603.6936530972284), (-1336.489045832675));
      boolean boolean0 = inhomogeneousPoint2D0.isNormalized();
      assertTrue(boolean0);
  }
}
