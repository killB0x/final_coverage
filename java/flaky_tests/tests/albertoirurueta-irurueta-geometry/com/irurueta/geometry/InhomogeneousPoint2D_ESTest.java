/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 06:56:02 GMT 2022
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
public class InhomogeneousPoint2D_ESTest extends InhomogeneousPoint2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setHomogeneousCoordinates((-1.0), 1.0E-10, 0.0);
      inhomogeneousPoint2D0.asArray();
      assertEquals(Double.NEGATIVE_INFINITY, inhomogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = inhomogeneousPoint2D0.toHomogeneous();
      double[] doubleArray0 = homogeneousPoint2D0.asArray();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.asArray(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setCoordinates(3308.1342, 3308.1342);
      boolean boolean0 = inhomogeneousPoint2D0.isAtInfinity();
      assertEquals(3308.1342, inhomogeneousPoint2D0.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      boolean boolean0 = inhomogeneousPoint2D0.equals((Point2D) inhomogeneousPoint2D0, 0.0);
      assertTrue(boolean0);
      assertEquals(0.0, inhomogeneousPoint2D0.getHomY(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setCoordinates(3308.1342, 3308.1342);
      Point2D point2D0 = Point2D.create();
      boolean boolean0 = inhomogeneousPoint2D0.equals(point2D0, 0.0);
      assertEquals(3308.1342, inhomogeneousPoint2D0.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      inhomogeneousPoint2D0.setInhomogeneousCoordinates((-2002.733607024566), 0.0);
      assertEquals((-2002.733607024566), inhomogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-1625.103), 821.88904, (-1219.547));
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(homogeneousPoint2D0);
      inhomogeneousPoint2D0.setHomogeneousCoordinates(2, 3, 3);
      assertEquals(0.6666666666666666, inhomogeneousPoint2D0.getHomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-1768.253998), 1902.129795569);
      inhomogeneousPoint2D0.setHomogeneousCoordinates(0.0, 1.0E-10, 1.0E-10);
      assertEquals(1.0, inhomogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setHomogeneousCoordinates((-1.0), 1.0E-10, 0.0);
      inhomogeneousPoint2D0.hashCode();
      assertEquals(Double.POSITIVE_INFINITY, inhomogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.setCoordinates(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(0.0, (-2002.733607024566));
      HomogeneousPoint2D homogeneousPoint2D0 = inhomogeneousPoint2D0.toHomogeneous();
      assertEquals((-2002.733607024566), homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(0.0, homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0E-10, 1.0E-10);
      HomogeneousPoint2D homogeneousPoint2D0 = inhomogeneousPoint2D0.toHomogeneous();
      assertEquals(1.0E-10, homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(1.0E-10, homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-1768.253998), 1902.129795569);
      HomogeneousPoint2D homogeneousPoint2D0 = inhomogeneousPoint2D0.toHomogeneous();
      assertEquals(1902.129795569, homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals((-1768.253998), homogeneousPoint2D0.getHomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      double double0 = inhomogeneousPoint2D0.getY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(58.657, 58.657);
      double double0 = inhomogeneousPoint2D0.getY();
      assertEquals(58.657, double0, 0.01);
      assertEquals(58.657, inhomogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setInhomY((-434.8));
      double double0 = inhomogeneousPoint2D0.getY();
      assertEquals((-434.8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(point2D0);
      double double0 = inhomogeneousPoint2D0.getX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(homogeneousPoint2D0);
      inhomogeneousPoint2D0.setX(360.0);
      double double0 = inhomogeneousPoint2D0.getX();
      assertEquals(360.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-0.5463182298834386), 1.0E-10, 1.0E-10);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      double double0 = inhomogeneousPoint2D0.getX();
      assertEquals((-5.463182298834386E9), double0, 0.01);
      assertEquals(1.0, inhomogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.getType();
      assertEquals(0.0, inhomogeneousPoint2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(0.0, 0.0);
      double double0 = inhomogeneousPoint2D0.getInhomY();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0E-10, 1.0E-10);
      double double0 = inhomogeneousPoint2D0.getInhomX();
      assertEquals(1.0E-10, double0, 0.01);
      assertEquals(1.0E-10, inhomogeneousPoint2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-1768.253998), 1902.129795569);
      double double0 = inhomogeneousPoint2D0.getInhomX();
      assertEquals(1902.129795569, inhomogeneousPoint2D0.getHomY(), 0.01);
      assertEquals((-1768.253998), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      double double0 = inhomogeneousPoint2D0.getHomY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0E-10, 1.0E-10);
      double double0 = inhomogeneousPoint2D0.getHomY();
      assertEquals(1.0E-10, double0, 0.01);
      assertEquals(1.0E-10, inhomogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setInhomY((-2664.1));
      double double0 = inhomogeneousPoint2D0.getHomY();
      assertEquals((-2664.1), inhomogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals((-2664.1), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      double double0 = inhomogeneousPoint2D0.getHomX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0E-10, 1.0E-10);
      double double0 = inhomogeneousPoint2D0.getHomX();
      assertEquals(1.0E-10, double0, 0.01);
      assertEquals(1.0E-10, inhomogeneousPoint2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-0.5463182298834386), 1.0E-10, 1.0E-10);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      double double0 = inhomogeneousPoint2D0.getHomX();
      assertEquals(1.0, inhomogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals((-5.463182298834386E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      boolean boolean0 = inhomogeneousPoint2D0.equals(inhomogeneousPoint2D0);
      assertTrue(boolean0);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D1 = new InhomogeneousPoint2D(786.2547701438567, (-2.771203796733391));
      boolean boolean0 = inhomogeneousPoint2D0.equals(inhomogeneousPoint2D1);
      assertEquals((-2.771203796733391), inhomogeneousPoint2D1.getHomY(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getHomY(), 0.01);
      assertEquals(786.2547701438567, inhomogeneousPoint2D1.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = inhomogeneousPoint2D0.toHomogeneous();
      boolean boolean0 = inhomogeneousPoint2D0.equals(homogeneousPoint2D0);
      assertTrue(boolean0);
      assertEquals(0.0, homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
      assertEquals(0.0, homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.setCoordinates((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.setCoordinates((Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.equals((Point2D) null, (double) 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.asArray((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = null;
      try {
        inhomogeneousPoint2D0 = new InhomogeneousPoint2D((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = null;
      try {
        inhomogeneousPoint2D0 = new InhomogeneousPoint2D((Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(0.0, 0.0);
      double[] doubleArray0 = inhomogeneousPoint2D0.asArray();
      inhomogeneousPoint2D0.asArray(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setInhomY(1821.17933330532);
      InhomogeneousPoint2D inhomogeneousPoint2D1 = new InhomogeneousPoint2D(786.2547701438567, (-2.771203796733391));
      inhomogeneousPoint2D1.setX(1.0E-10);
      boolean boolean0 = inhomogeneousPoint2D0.equals(inhomogeneousPoint2D1, (double) 3);
      assertEquals(1821.17933330532, inhomogeneousPoint2D0.getHomY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      boolean boolean0 = inhomogeneousPoint2D0.equals(inhomogeneousPoint2D0, (double) 3);
      assertTrue(boolean0);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D1 = new InhomogeneousPoint2D(786.2547701438567, (-2.771203796733391));
      boolean boolean0 = inhomogeneousPoint2D1.equals(inhomogeneousPoint2D0, 1.0E-10);
      assertFalse(boolean0);
      assertEquals(0.0, inhomogeneousPoint2D0.getX(), 0.01);
      assertEquals((-2.771203796733391), inhomogeneousPoint2D1.getHomY(), 0.01);
      assertEquals(786.2547701438567, inhomogeneousPoint2D1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.equals(inhomogeneousPoint2D0, (-1936.36));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.equals((InhomogeneousPoint2D) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(0.0, (-2002.733607024566));
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) 2;
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      boolean boolean0 = inhomogeneousPoint2D0.equals(homogeneousPoint2D0, 1.0E-10);
      assertFalse(boolean0);
      assertEquals((-2002.733607024566), inhomogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-2018.363), 3, 2);
      boolean boolean0 = inhomogeneousPoint2D0.equals(homogeneousPoint2D0, 1.0E-10);
      assertFalse(boolean0);
      assertEquals(0.0, inhomogeneousPoint2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(inhomogeneousPoint2D0);
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.equals(homogeneousPoint2D0, (-4755.262319));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.equals((HomogeneousPoint2D) null, (double) 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      Point2D point2D0 = Point2D.create();
      inhomogeneousPoint2D0.setCoordinates(point2D0);
      assertEquals(CoordinatesType.INHOMOGENEOUS_COORDINATES, inhomogeneousPoint2D0.getType());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(0.0, 0.0);
      inhomogeneousPoint2D0.setCoordinates((Point2D) inhomogeneousPoint2D0);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-0.09243159537462305), (-0.09243159537462305));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.setCoordinates(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(doubleArray0);
      inhomogeneousPoint2D0.setCoordinates(doubleArray0);
      assertEquals(CoordinatesType.INHOMOGENEOUS_COORDINATES, inhomogeneousPoint2D0.getType());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.asArray(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(343.8, 3, 0.0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(homogeneousPoint2D0);
      inhomogeneousPoint2D0.setInhomX((-800.6));
      boolean boolean0 = inhomogeneousPoint2D0.isAtInfinity();
      assertEquals((-800.6), inhomogeneousPoint2D0.getInhomX(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(3, 2, 0.0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      boolean boolean0 = inhomogeneousPoint2D0.isAtInfinity();
      assertTrue(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, inhomogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, inhomogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D1 = new InhomogeneousPoint2D(0.0, 2);
      boolean boolean0 = inhomogeneousPoint2D1.equals((Point2D) inhomogeneousPoint2D0, 1.0);
      assertFalse(boolean0);
      assertEquals(2.0, inhomogeneousPoint2D1.getHomY(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D1.getHomX(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.equals((Point2D) inhomogeneousPoint2D0, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setInhomY(1821.17933330532);
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      boolean boolean0 = inhomogeneousPoint2D0.equals(homogeneousPoint2D0);
      assertEquals(1821.17933330532, inhomogeneousPoint2D0.getHomY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(343.8, 3, 0.0);
      boolean boolean0 = inhomogeneousPoint2D0.equals((Point2D) homogeneousPoint2D0, 3311.346421125);
      assertFalse(boolean0);
      assertEquals(0.0, inhomogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      boolean boolean0 = inhomogeneousPoint2D0.equals((Object) inhomogeneousPoint2D0);
      assertTrue(boolean0);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      Object object0 = new Object();
      boolean boolean0 = inhomogeneousPoint2D0.equals(object0);
      assertEquals(0.0, inhomogeneousPoint2D0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      Point2D point2D0 = Point2D.create();
      boolean boolean0 = inhomogeneousPoint2D0.equals((Object) point2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D1 = new InhomogeneousPoint2D(inhomogeneousPoint2D0);
      assertEquals(0.0, inhomogeneousPoint2D0.getY(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomX(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      InhomogeneousPoint2D inhomogeneousPoint2D0 = null;
      try {
        inhomogeneousPoint2D0 = new InhomogeneousPoint2D(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setInhomY(2);
      double double0 = inhomogeneousPoint2D0.getInhomY();
      assertEquals(2.0, inhomogeneousPoint2D0.getY(), 0.01);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = (HomogeneousPoint2D)Point2D.create();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(homogeneousPoint2D0);
      boolean boolean0 = inhomogeneousPoint2D0.equals(homogeneousPoint2D0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setHomogeneousCoordinates(0.0, 1.0E-10, 0.0);
      boolean boolean0 = inhomogeneousPoint2D0.isAtInfinity();
      assertEquals(Double.POSITIVE_INFINITY, inhomogeneousPoint2D0.getHomY(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.equals((InhomogeneousPoint2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      double double0 = inhomogeneousPoint2D0.getInhomX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setY((-3809.0));
      assertEquals((-3809.0), inhomogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(0.0, (-2002.733607024566));
      double double0 = inhomogeneousPoint2D0.getInhomY();
      assertEquals((-2002.733607024566), double0, 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getHomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = inhomogeneousPoint2D0.toHomogeneous();
      double double0 = inhomogeneousPoint2D0.dotProduct(homogeneousPoint2D0);
      assertEquals(0.0, homogeneousPoint2D0.getInhomX(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getX(), 0.01);
      assertEquals(1.0, homogeneousPoint2D0.getW(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getHomY(), 0.01);
      assertEquals(0.0, homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(1.0, inhomogeneousPoint2D0.getHomW(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setInhomogeneousCoordinates(2, 2);
      assertEquals(2.0, inhomogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      double double0 = inhomogeneousPoint2D0.getHomW();
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      // Undeclared exception!
      try { 
        inhomogeneousPoint2D0.equals((HomogeneousPoint2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.InhomogeneousPoint2D", e);
      }
  }
}
