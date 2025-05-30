/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 06:54:37 GMT 2022
 */

package com.irurueta.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.irurueta.geometry.HomogeneousPoint2D;
import com.irurueta.geometry.InhomogeneousPoint2D;
import com.irurueta.geometry.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HomogeneousPoint2D_ESTest extends HomogeneousPoint2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.asArray(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(1.0E-12, 1.0E-12, 0.0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      HomogeneousPoint2D homogeneousPoint2D1 = inhomogeneousPoint2D0.toHomogeneous();
      homogeneousPoint2D0.setInhomY(1.0E-10);
      homogeneousPoint2D1.equals((Object) homogeneousPoint2D0);
      assertEquals(1.0, homogeneousPoint2D0.getHomX(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, inhomogeneousPoint2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, 0.0, 0.0);
      boolean boolean0 = homogeneousPoint2D0.isAtInfinity(0.0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(0.0, homogeneousPoint2D0.getHomX(), 0.01);
      assertEquals(0.0, homogeneousPoint2D0.getHomY(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, homogeneousPoint2D0.getHomW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, 0.0, 0.0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      homogeneousPoint2D0.setCoordinates((Point2D) inhomogeneousPoint2D0);
      homogeneousPoint2D0.equals(homogeneousPoint2D0);
      assertEquals(Double.NaN, homogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = (HomogeneousPoint2D)Point2D.create();
      assertFalse(homogeneousPoint2D0.isNormalized());
      
      HomogeneousPoint2D homogeneousPoint2D1 = new HomogeneousPoint2D((-3018.8319903229944), (-530.684024), 0.0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D1.toInhomogeneous();
      HomogeneousPoint2D homogeneousPoint2D2 = inhomogeneousPoint2D0.toHomogeneous();
      homogeneousPoint2D2.equals(homogeneousPoint2D0);
      assertTrue(homogeneousPoint2D0.isNormalized());
      assertEquals(Double.NEGATIVE_INFINITY, inhomogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      assertFalse(homogeneousPoint2D0.isNormalized());
      
      HomogeneousPoint2D homogeneousPoint2D1 = new HomogeneousPoint2D(3, 3, 0.0);
      boolean boolean0 = homogeneousPoint2D0.equals(homogeneousPoint2D1, 0.8533181919340092);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, (-1.0), (-1.0));
      boolean boolean0 = homogeneousPoint2D0.equals(homogeneousPoint2D0, 0.0);
      assertEquals((-0.7071067811865475), homogeneousPoint2D0.getHomW(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(5789.671047701245, 5789.671047701245, 0.22016158337418776);
      homogeneousPoint2D0.hashCode();
      assertEquals(26297.371952767484, homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(5789.671047701245, homogeneousPoint2D0.getX(), 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-1684.3543154318), (-1684.3543154318), (-1684.3543154318));
      homogeneousPoint2D0.setInhomogeneousCoordinates(0.0, 834.9359);
      assertEquals(1.0, homogeneousPoint2D0.getW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(1.0, 1.0, 1.0);
      homogeneousPoint2D0.setInhomogeneousCoordinates(1.0E-12, 1.0E-12);
      assertEquals(1.0E-12, homogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0, 1.0);
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(inhomogeneousPoint2D0);
      homogeneousPoint2D0.setW(2);
      homogeneousPoint2D0.setInhomY(73.3);
      assertEquals(146.6, homogeneousPoint2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-3018.8319903229944), (-530.684024), 0.0);
      homogeneousPoint2D0.setInhomX((-1823.2403958938105));
      assertEquals(-0.0, homogeneousPoint2D0.getHomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(1.0, 2348.941505324641, 1.0);
      homogeneousPoint2D0.setHomogeneousCoordinates(1761.2, (-272.648), 2348.941505324641);
      assertEquals((-272.648), homogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.setCoordinates(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-4231.25902166314), (-4231.25902166314), 1.0);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals((-4231.25902166314), inhomogeneousPoint2D0.getInhomX(), 0.01);
      assertEquals((-4231.25902166314), inhomogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(inhomogeneousPoint2D0);
      homogeneousPoint2D0.equals(homogeneousPoint2D0);
      boolean boolean0 = homogeneousPoint2D0.isNormalized();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      assertEquals(1.0, homogeneousPoint2D0.getW(), 0.01);
      
      homogeneousPoint2D0.setW(0.0);
      boolean boolean0 = homogeneousPoint2D0.isAtInfinity();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      double double0 = homogeneousPoint2D0.getY();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0, 1.0);
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(inhomogeneousPoint2D0);
      double double0 = homogeneousPoint2D0.getY();
      assertEquals(1.0, double0, 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = (HomogeneousPoint2D)Point2D.create();
      double double0 = homogeneousPoint2D0.getX();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, homogeneousPoint2D0.getW(), 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, 0.0, 0.0);
      homogeneousPoint2D0.setCoordinates(1.0, (-1.0), (-2629.297008724469));
      double double0 = homogeneousPoint2D0.getX();
      assertEquals((-1.0), homogeneousPoint2D0.getHomY(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-3018.8319903229944), (-530.684024), 0.0);
      double double0 = homogeneousPoint2D0.getW();
      assertEquals(0.0, double0, 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals((-530.684024), homogeneousPoint2D0.getY(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals((-3018.8319903229944), homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0, 1.0);
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(inhomogeneousPoint2D0);
      double double0 = homogeneousPoint2D0.getW();
      assertEquals(1.0, double0, 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      homogeneousPoint2D0.getType();
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(0.0, homogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      double double0 = homogeneousPoint2D0.getInhomY();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(2, 3, 0.0);
      double double0 = homogeneousPoint2D0.getInhomY();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(3.0, homogeneousPoint2D0.getY(), 0.01);
      assertEquals(2.0, homogeneousPoint2D0.getHomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-4231.25902166314), (-4231.25902166314), 1.0);
      double double0 = homogeneousPoint2D0.getInhomY();
      assertEquals((-4231.25902166314), double0, 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals((-4231.25902166314), homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(3, 0.0, 1.0E-10);
      double double0 = homogeneousPoint2D0.getInhomX();
      assertEquals(3.0E10, double0, 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(0.0, homogeneousPoint2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-4231.25902166314), (-4231.25902166314), 1.0);
      double double0 = homogeneousPoint2D0.getInhomX();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals((-4231.25902166314), double0, 0.01);
      assertEquals((-4231.25902166314), homogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(5789.671047701245, 5789.671047701245, 0.22016158337418776);
      double double0 = homogeneousPoint2D0.getHomY();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(26297.371952767484, homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals(5789.671047701245, double0, 0.01);
      assertEquals(5789.671047701245, homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-4231.25902166314), (-4231.25902166314), 1.0);
      double double0 = homogeneousPoint2D0.getHomY();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals((-4231.25902166314), homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals((-4231.25902166314), homogeneousPoint2D0.getX(), 0.01);
      assertEquals((-4231.25902166314), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0, 1.0);
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(inhomogeneousPoint2D0);
      double double0 = homogeneousPoint2D0.getHomX();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(2, 3, 0.0);
      double double0 = homogeneousPoint2D0.getHomW();
      assertEquals(3.0, homogeneousPoint2D0.getY(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, homogeneousPoint2D0.getInhomY(), 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(0.0, double0, 0.01);
      assertEquals(2.0, homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(1.0, 1.0);
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(inhomogeneousPoint2D0);
      double double0 = homogeneousPoint2D0.getHomW();
      assertEquals(1.0, double0, 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(563.2129, 563.2129, (-269.845191155377));
      double double0 = homogeneousPoint2D0.getHomW();
      assertEquals((-269.845191155377), double0, 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals((-2.0871704164470426), homogeneousPoint2D0.getInhomX(), 0.01);
      assertEquals(563.2129, homogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      boolean boolean0 = homogeneousPoint2D0.equals((Point2D) homogeneousPoint2D0, (double) 3);
      assertTrue(homogeneousPoint2D0.isNormalized());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-1.0), 1.0E-10, 1.0E-10);
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(homogeneousPoint2D0);
      assertEquals((-1.0E10), inhomogeneousPoint2D0.getX(), 0.01);
      
      inhomogeneousPoint2D0.setX(1.0);
      boolean boolean0 = homogeneousPoint2D0.equals(inhomogeneousPoint2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.setCoordinates((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.setCoordinates((Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.equals((Point2D) null, (double) 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.equals((InhomogeneousPoint2D) null, 1.0E-12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.equals((InhomogeneousPoint2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.equals((HomogeneousPoint2D) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.equals((HomogeneousPoint2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = null;
      try {
        homogeneousPoint2D0 = new HomogeneousPoint2D((double[]) null);
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
      HomogeneousPoint2D homogeneousPoint2D0 = null;
      try {
        homogeneousPoint2D0 = new HomogeneousPoint2D((Point2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-1.0), 1.0E-10, 1.0E-10);
      double[] doubleArray0 = homogeneousPoint2D0.asArray();
      homogeneousPoint2D0.asArray(doubleArray0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertArrayEquals(new double[] {(-1.0), 1.0E-10, 1.0E-10}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, 0.0, 0.0);
      homogeneousPoint2D0.normalize();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(0.0, homogeneousPoint2D0.getW(), 0.01);
      assertEquals(0.0, homogeneousPoint2D0.getHomY(), 0.01);
      assertEquals(0.0, homogeneousPoint2D0.getHomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(inhomogeneousPoint2D0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      
      homogeneousPoint2D0.normalize();
      homogeneousPoint2D0.normalize();
      assertTrue(homogeneousPoint2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = (HomogeneousPoint2D)Point2D.create();
      boolean boolean0 = homogeneousPoint2D0.isAtInfinity(1.0E-10);
      assertEquals(0.0, homogeneousPoint2D0.getInhomY(), 0.01);
      assertFalse(boolean0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(1.0, homogeneousPoint2D0.getW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-1684.3543154318), (-1684.3543154318), (-1684.3543154318));
      homogeneousPoint2D0.setCoordinates(0.0, 0.0, (-1072.3644329));
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      inhomogeneousPoint2D0.setY(3);
      boolean boolean0 = homogeneousPoint2D0.equals(inhomogeneousPoint2D0, 0.0);
      assertEquals((-1072.3644329), homogeneousPoint2D0.getW(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-1684.3543154318), (-1684.3543154318), (-1684.3543154318));
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      boolean boolean0 = homogeneousPoint2D0.equals(inhomogeneousPoint2D0, 0.0);
      assertFalse(boolean0);
      assertEquals(1.0, homogeneousPoint2D0.getInhomY(), 0.01);
      assertEquals((-1684.3543154318), homogeneousPoint2D0.getHomX(), 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(2496.43115612324, 0.0);
      boolean boolean0 = homogeneousPoint2D0.equals(inhomogeneousPoint2D0, 1.0);
      assertFalse(boolean0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
      assertEquals(0.0, homogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      boolean boolean0 = homogeneousPoint2D0.equals(inhomogeneousPoint2D0, 0.0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertTrue(boolean0);
      assertEquals(1.0, homogeneousPoint2D0.getW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.equals((InhomogeneousPoint2D) null, (-1834.86));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, 0.0, 0.0);
      homogeneousPoint2D0.equals(homogeneousPoint2D0, 1.0E-10);
      assertEquals(0.0, homogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.equals(homogeneousPoint2D0, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-4231.25902166314), (-4231.25902166314), 1.0);
      homogeneousPoint2D0.setCoordinates((Point2D) homogeneousPoint2D0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals((-4231.25902166314), homogeneousPoint2D0.getInhomX(), 0.01);
      assertEquals((-4231.25902166314), homogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      assertEquals(1.0, point2D0.getHomW(), 0.01);
      
      double[] doubleArray0 = new double[3];
      point2D0.setCoordinates(doubleArray0);
      assertFalse(point2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.setCoordinates(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D((-0.1989105909213131), (-1.0), (-1.0));
      double double0 = homogeneousPoint2D0.getY();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals((-1.0), double0, 0.01);
      assertEquals(0.1989105909213131, homogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, (-1.0), (-1.0));
      double double0 = homogeneousPoint2D0.getW();
      assertEquals(-0.0, homogeneousPoint2D0.getInhomX(), 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), homogeneousPoint2D0.getHomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D((-222.2052), (-222.2052));
      HomogeneousPoint2D homogeneousPoint2D0 = inhomogeneousPoint2D0.toHomogeneous();
      double double0 = homogeneousPoint2D0.getX();
      assertEquals((-222.2052), homogeneousPoint2D0.getHomY(), 0.01);
      assertEquals((-222.2052), homogeneousPoint2D0.getInhomX(), 0.01);
      assertEquals((-222.2052), double0, 0.01);
      assertFalse(homogeneousPoint2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.asArray(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      boolean boolean0 = homogeneousPoint2D0.equals(homogeneousPoint2D0, 1381.0);
      assertTrue(homogeneousPoint2D0.isNormalized());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.isAtInfinity((-2567.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(2, 3);
      boolean boolean0 = homogeneousPoint2D0.equals((Point2D) inhomogeneousPoint2D0, (double) 2);
      assertFalse(boolean0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(0.0, homogeneousPoint2D0.getHomY(), 0.01);
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      homogeneousPoint2D0.setX(3);
      boolean boolean0 = homogeneousPoint2D0.equals((Object) inhomogeneousPoint2D0);
      assertEquals(3.0, homogeneousPoint2D0.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = homogeneousPoint2D0.toInhomogeneous();
      // Undeclared exception!
      try { 
        homogeneousPoint2D0.equals((Point2D) inhomogeneousPoint2D0, (-4912.036155543072));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = (HomogeneousPoint2D)Point2D.create();
      HomogeneousPoint2D homogeneousPoint2D1 = new HomogeneousPoint2D(homogeneousPoint2D0);
      homogeneousPoint2D0.setCoordinates(1522.6997739459, 1303.145497985883, 1.0E-10);
      boolean boolean0 = homogeneousPoint2D1.equals(homogeneousPoint2D0, 0.9999983560629883);
      assertEquals(1.5226997739459E13, homogeneousPoint2D0.getInhomX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D1 = new HomogeneousPoint2D(0.0, 3, 2);
      boolean boolean0 = homogeneousPoint2D0.equals(homogeneousPoint2D1, 0.0);
      assertEquals(0.5547001962252291, homogeneousPoint2D1.getHomW(), 0.01);
      assertEquals(0.0, homogeneousPoint2D0.getInhomX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D();
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      boolean boolean0 = homogeneousPoint2D0.equals((Object) inhomogeneousPoint2D0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertTrue(boolean0);
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      Object object0 = new Object();
      boolean boolean0 = homogeneousPoint2D0.equals(object0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertFalse(boolean0);
      assertEquals(0.0, homogeneousPoint2D0.getInhomX(), 0.01);
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = (HomogeneousPoint2D)Point2D.create();
      boolean boolean0 = homogeneousPoint2D0.equals((Object) homogeneousPoint2D0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(1.0, homogeneousPoint2D0.getW(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, homogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HomogeneousPoint2D homogeneousPoint2D0 = null;
      try {
        homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.irurueta.geometry.HomogeneousPoint2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      homogeneousPoint2D0.setInhomX((-1823.2403958938105));
      assertEquals((-1823.2403958938105), homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      double double0 = homogeneousPoint2D0.getHomY();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = (HomogeneousPoint2D)Point2D.create();
      homogeneousPoint2D0.setX((-152.8048027));
      double double0 = homogeneousPoint2D0.getHomX();
      assertEquals((-152.8048027), homogeneousPoint2D0.getInhomX(), 0.01);
      assertEquals((-152.8048027), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      double[] doubleArray0 = point2D0.asArray();
      assertFalse(point2D0.isNormalized());
      
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(doubleArray0);
      assertTrue(point2D0.isNormalized());
      assertEquals(0.0, point2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = (HomogeneousPoint2D)Point2D.create();
      InhomogeneousPoint2D inhomogeneousPoint2D0 = new InhomogeneousPoint2D(homogeneousPoint2D0);
      boolean boolean0 = homogeneousPoint2D0.equals(inhomogeneousPoint2D0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(1.0, homogeneousPoint2D0.getW(), 0.01);
      assertEquals(0.0, inhomogeneousPoint2D0.getY(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, inhomogeneousPoint2D0.getInhomX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Point2D point2D0 = Point2D.create();
      double double0 = point2D0.getHomX();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, point2D0.getHomW(), 0.01);
      assertFalse(point2D0.isNormalized());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      homogeneousPoint2D0.setY(3);
      assertEquals(3.0, homogeneousPoint2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D(0.0, 0.0, 0.0);
      boolean boolean0 = homogeneousPoint2D0.isNormalized();
      assertEquals(0.0, homogeneousPoint2D0.getHomY(), 0.01);
      assertEquals(0.0, homogeneousPoint2D0.getHomW(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, homogeneousPoint2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      boolean boolean0 = homogeneousPoint2D0.isAtInfinity();
      assertEquals(1.0, homogeneousPoint2D0.getHomW(), 0.01);
      assertFalse(boolean0);
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(0.0, homogeneousPoint2D0.getInhomY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      HomogeneousPoint2D homogeneousPoint2D0 = new HomogeneousPoint2D();
      double double0 = homogeneousPoint2D0.getInhomX();
      assertFalse(homogeneousPoint2D0.isNormalized());
      assertEquals(1.0, homogeneousPoint2D0.getW(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }
}
