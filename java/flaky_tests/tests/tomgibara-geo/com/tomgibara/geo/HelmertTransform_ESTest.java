/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 11:10:59 GMT 2022
 */

package com.tomgibara.geo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.tomgibara.geo.Cartesian;
import com.tomgibara.geo.HelmertTransform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HelmertTransform_ESTest extends HelmertTransform_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs((-317.4433881), 0.0, 4386.44669162, 0.0, (-1.0), (-317.4433881), 1.0);
      String string0 = helmertTransform0.toString();
      assertEquals("(-317.4433881,0.0,4386.44669162) 0.0[-4.84813681109536E-6,-0.0015390089752864407,4.84813681109536E-6]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0);
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      boolean boolean0 = helmertTransform0.equals(helmertTransform1);
      assertFalse(helmertTransform1.equals((Object)helmertTransform0));
      assertEquals(0.0, helmertTransform0.cx, 0.01);
      assertEquals(-0.0, helmertTransform1.cx, 0.01);
      assertEquals(0.0, helmertTransform0.ry, 0.01);
      assertEquals((-4.84813681109536E-6), helmertTransform1.rz, 0.01);
      assertEquals(-0.0, helmertTransform1.s, 0.01);
      assertEquals(-0.0, helmertTransform1.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.cz, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 0.0, 0.0, 1.903717853323218, 0.0);
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      boolean boolean0 = helmertTransform1.equals(helmertTransform0);
      assertEquals(-0.0, helmertTransform1.cy, 0.01);
      assertEquals(-0.0, helmertTransform1.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.cz, 0.01);
      assertEquals(-0.0, helmertTransform1.rz, 0.01);
      assertEquals(-0.0, helmertTransform1.s, 0.01);
      assertFalse(boolean0);
      assertEquals(-0.0, helmertTransform1.cx, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 1790.93569976453, 6378157.5, 0.0, 1.0);
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      HelmertTransform helmertTransform2 = helmertTransform1.getInverse();
      boolean boolean0 = helmertTransform2.equals(helmertTransform0);
      assertTrue(boolean0);
      assertEquals(4.84813681109536E-6, helmertTransform2.rz, 0.01);
      assertEquals(30.92218016271395, helmertTransform2.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.cx, 0.01);
      assertEquals(0.00179093569976453, helmertTransform2.s, 0.01);
      assertEquals(-0.0, helmertTransform1.ry, 0.01);
      assertEquals(-0.0, helmertTransform1.cz, 0.01);
      assertEquals(-0.0, helmertTransform1.cy, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 0.0, 2387.7059, 3068.04085313085, 0.0);
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      helmertTransform0.equals(helmertTransform1);
      assertEquals(-0.0, helmertTransform1.cy, 0.01);
      assertEquals(-0.0, helmertTransform1.cz, 0.01);
      assertEquals(-0.0, helmertTransform1.rz, 0.01);
      assertEquals((-0.011575924867859575), helmertTransform1.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.s, 0.01);
      assertEquals((-0.014874281798008085), helmertTransform1.ry, 0.01);
      assertEquals(-0.0, helmertTransform1.cx, 0.01);
      assertEquals(0.0, helmertTransform0.s, 0.01);
      assertEquals(0.014874281798008085, helmertTransform0.ry, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 1790.93569976453, 6378157.5, 0.0, 1.0);
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      boolean boolean0 = helmertTransform1.equals(helmertTransform0);
      assertEquals(-0.0, helmertTransform1.cy, 0.01);
      assertEquals(0.0, helmertTransform0.cx, 0.01);
      assertEquals((-30.92218016271395), helmertTransform1.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.cz, 0.01);
      assertEquals(0.0, helmertTransform0.cy, 0.01);
      assertEquals(0.0, helmertTransform0.cz, 0.01);
      assertEquals(30.92218016271395, helmertTransform0.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.cx, 0.01);
      assertEquals((-4.84813681109536E-6), helmertTransform1.rz, 0.01);
      assertEquals(4.84813681109536E-6, helmertTransform0.rz, 0.01);
      assertEquals((-0.00179093569976453), helmertTransform1.s, 0.01);
      assertEquals(-0.0, helmertTransform1.ry, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, (-404.0), (-404.0), (-481.5513961), 0.0, (-481.5513961));
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      boolean boolean0 = helmertTransform1.equals(helmertTransform0);
      assertEquals(0.0023346270498667723, helmertTransform1.rz, 0.01);
      assertEquals(404.0, helmertTransform1.cz, 0.01);
      assertEquals(4.04E-4, helmertTransform1.s, 0.01);
      assertEquals(-0.0, helmertTransform1.ry, 0.01);
      assertEquals(-0.0, helmertTransform1.cy, 0.01);
      assertEquals(0.0023346270498667723, helmertTransform1.rx, 0.01);
      assertEquals(0.0, helmertTransform0.cx, 0.01);
      assertEquals(-0.0, helmertTransform1.cx, 0.01);
      assertFalse(boolean0);
      assertEquals((-0.0023346270498667723), helmertTransform0.rz, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(1000000.0, (-950.65017), 0.0, (-758.0), 2074.77749, 455.59047001316, 455.59047001316);
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      HelmertTransform helmertTransform2 = helmertTransform1.getInverse();
      boolean boolean0 = helmertTransform0.equals(helmertTransform2);
      assertTrue(boolean0);
      assertEquals((-7.58E-4), helmertTransform2.s, 0.01);
      assertEquals(0.0022087649284550375, helmertTransform2.rz, 0.01);
      assertEquals(7.58E-4, helmertTransform1.s, 0.01);
      assertEquals((-0.010058805124101036), helmertTransform1.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.cz, 0.01);
      assertEquals(1000000.0, helmertTransform2.cx, 0.01);
      assertEquals((-950.65017), helmertTransform0.cy, 0.01);
      assertEquals(0.0022087649284550375, helmertTransform2.ry, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, (-1.0), (-1.0), 1733.003288, 6356034.447, (-721.58939666), (-1.0));
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      boolean boolean0 = helmertTransform0.equals(helmertTransform1);
      assertEquals(4.84813681109536E-6, helmertTransform1.rz, 0.01);
      assertFalse(boolean0);
      assertEquals((-4.84813681109536E-6), helmertTransform0.rz, 0.01);
      assertEquals((-0.001733003288), helmertTransform1.s, 0.01);
      assertEquals(0.0034983641164434373, helmertTransform1.ry, 0.01);
      assertEquals((-30.81492457509084), helmertTransform1.rx, 0.01);
      assertEquals(1.0, helmertTransform1.cz, 0.01);
      assertEquals(-0.0, helmertTransform1.cx, 0.01);
      assertEquals(0.0, helmertTransform0.cx, 0.01);
      assertEquals(1.0, helmertTransform1.cy, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(1000000.0, (-950.65017), 0.0, (-758.0), 2074.77749, 455.59047001316, 455.59047001316);
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      boolean boolean0 = helmertTransform0.equals(helmertTransform1);
      assertEquals((-1000000.0), helmertTransform1.cx, 0.01);
      assertEquals((-0.010058805124101036), helmertTransform1.rx, 0.01);
      assertEquals((-0.0022087649284550375), helmertTransform1.ry, 0.01);
      assertEquals(0.0022087649284550375, helmertTransform0.ry, 0.01);
      assertEquals(7.58E-4, helmertTransform1.s, 0.01);
      assertEquals(1000000.0, helmertTransform0.cx, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, helmertTransform0.cz, 0.01);
      assertEquals(950.65017, helmertTransform1.cy, 0.01);
      assertEquals(-0.0, helmertTransform1.cz, 0.01);
      assertEquals((-0.0022087649284550375), helmertTransform1.rz, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs((-950.65017), 0.0, 298.247167427, (-1.0), 14.0, 5040.0, (-100000.0));
      helmertTransform0.hashCode();
      assertEquals((-0.484813681109536), helmertTransform0.rz, 0.01);
      assertEquals((-1.0E-6), helmertTransform0.s, 0.01);
      assertEquals(0.0, helmertTransform0.cy, 0.01);
      assertEquals((-950.65017), helmertTransform0.cx, 0.01);
      assertEquals(298.247167427, helmertTransform0.cz, 0.01);
      assertEquals(0.024434609527920613, helmertTransform0.ry, 0.01);
      assertEquals(6.787391535533503E-5, helmertTransform0.rx, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 298.247167427, 0.0, (-4104.929), 0.0, 298.247167427, (-4104.929));
      helmertTransform0.hashCode();
      assertEquals(298.247167427, helmertTransform0.cy, 0.01);
      assertEquals(0.0014459430712077596, helmertTransform0.ry, 0.01);
      assertEquals(0.0, helmertTransform0.cx, 0.01);
      assertEquals((-0.019901257391832863), helmertTransform0.rz, 0.01);
      assertEquals((-0.004104929), helmertTransform0.s, 0.01);
      assertEquals(0.0, helmertTransform0.rx, 0.01);
      assertEquals(0.0, helmertTransform0.cz, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs((-1391.462390329534), (-1391.462390329534), (-1391.462390329534), (-1391.462390329534), (-1391.462390329534), (-1391.462390329534), (-1391.462390329534));
      Cartesian cartesian0 = Cartesian.inMeters((-1391.462390329534), (-1391.462390329534), (-1391.462390329534));
      Cartesian cartesian1 = helmertTransform0.transform(cartesian0);
      assertEquals((-2780.9886130753666), cartesian1.getZ(), 0.01);
      assertEquals((-2780.9886130753666), cartesian1.getX(), 0.01);
      assertEquals((-2780.9886130753666), cartesian1.getY(), 0.01);
      assertEquals((-0.0013914623903295339), helmertTransform0.s, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs((-317.4433881), 0.0, 4386.44669162, 0.0, (-1.0), (-317.4433881), 1.0);
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      Cartesian cartesian0 = Cartesian.inMeters(0.0, 0.0, (-0.0015390089752864407));
      Cartesian cartesian1 = helmertTransform1.transform(cartesian0);
      assertEquals((-4.84813681109536E-6), helmertTransform0.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.cy, 0.01);
      assertEquals((-4386.448230628976), cartesian1.getZ(), 0.01);
      assertEquals(317.4433857314514, cartesian1.getX(), 0.01);
      assertEquals((-4.84813681109536E-6), helmertTransform1.rz, 0.01);
      assertEquals(7.461326065692343E-9, cartesian1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 0.0, 0.0, (-2111.5125581233), 0.0);
      Cartesian cartesian0 = Cartesian.inMeters(0.0, 0.0, 0.0);
      Cartesian cartesian1 = helmertTransform0.transform(cartesian0);
      assertEquals((-0.010236901760127702), helmertTransform0.ry, 0.01);
      assertEquals(0.0, helmertTransform0.s, 0.01);
      assertTrue(cartesian1.equals((Object)cartesian0));
      assertEquals(0.0, helmertTransform0.cx, 0.01);
      assertEquals(0.0, helmertTransform0.rx, 0.01);
      assertEquals(0.0, helmertTransform0.cy, 0.01);
      assertEquals(0.0, helmertTransform0.rz, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      Cartesian cartesian0 = Cartesian.inMeters((-4453.2794293), 0.0, 1000000.0);
      Cartesian cartesian1 = helmertTransform0.transform(cartesian0);
      assertEquals(0.0, helmertTransform0.s, 0.01);
      assertTrue(cartesian1.equals((Object)cartesian0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs((-1390.3196837219637), (-1390.3196837219637), (-1390.3196837219637), (-1390.3196837219637), (-1390.3196837219637), (-1390.3196837219637), (-1390.3196837219637));
      // Undeclared exception!
      try { 
        helmertTransform0.transform((Cartesian) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.tomgibara.geo.HelmertTransform", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      HelmertTransform helmertTransform1 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, -0.0, 0.0, -0.0, 1609.8160211873442);
      boolean boolean0 = helmertTransform0.equals(helmertTransform1);
      assertFalse(boolean0);
      assertEquals(-0.0, helmertTransform1.s, 0.01);
      assertEquals(-0.0, helmertTransform1.ry, 0.01);
      assertEquals(0.0, helmertTransform1.cz, 0.01);
      assertFalse(helmertTransform1.equals((Object)helmertTransform0));
      assertEquals(0.0, helmertTransform1.rx, 0.01);
      assertEquals(0.0, helmertTransform1.cy, 0.01);
      assertEquals(0.0, helmertTransform0.rz, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(6397300.0, 6397300.0, 6397300.0, 6397300.0, 6397300.0, 6397300.0, 6397300.0);
      HelmertTransform helmertTransform1 = HelmertTransform.withMPpmArcSecs(6397300.0, 6397300.0, 6397300.0, 6397300.0, 6397300.0, 31.014985621620347, 31.014985621620347);
      boolean boolean0 = helmertTransform0.equals(helmertTransform1);
      assertFalse(boolean0);
      assertEquals(1.503648934877709E-4, helmertTransform1.ry, 0.01);
      assertEquals(31.014985621620347, helmertTransform1.rx, 0.01);
      assertEquals(6.3973, helmertTransform1.s, 0.01);
      assertEquals(6397300.0, helmertTransform1.cy, 0.01);
      assertEquals(6397300.0, helmertTransform1.cz, 0.01);
      assertEquals(1.503648934877709E-4, helmertTransform1.rz, 0.01);
      assertEquals(6397300.0, helmertTransform1.cx, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      HelmertTransform helmertTransform1 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, -0.0, 4498.9, (-714.0), 298.257223563);
      boolean boolean0 = helmertTransform0.equals(helmertTransform1);
      assertEquals(0.0, helmertTransform1.cy, 0.01);
      assertEquals((-0.003461569683122087), helmertTransform1.ry, 0.01);
      assertEquals(0.0, helmertTransform1.cx, 0.01);
      assertEquals(0.0, helmertTransform1.cz, 0.01);
      assertFalse(boolean0);
      assertEquals(-0.0, helmertTransform1.s, 0.01);
      assertEquals(0.0014459918247308786, helmertTransform1.rz, 0.01);
      assertEquals(0.021811282699436916, helmertTransform1.rx, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, (-34.76198008078363), 0.0, (-34.76198008078363), 0.0);
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      boolean boolean0 = helmertTransform1.equals(helmertTransform0);
      assertEquals(-0.0, helmertTransform1.cx, 0.01);
      assertFalse(boolean0);
      assertEquals(1.6853083525621078E-4, helmertTransform1.ry, 0.01);
      assertEquals(0.0, helmertTransform0.cx, 0.01);
      assertEquals(0.0, helmertTransform0.cy, 0.01);
      assertEquals((-1.6853083525621078E-4), helmertTransform0.ry, 0.01);
      assertEquals(-0.0, helmertTransform1.rz, 0.01);
      assertEquals(3.476198008078363E-5, helmertTransform1.s, 0.01);
      assertEquals(-0.0, helmertTransform1.cz, 0.01);
      assertEquals(-0.0, helmertTransform1.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.cy, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs((-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792));
      HelmertTransform helmertTransform1 = HelmertTransform.withMPpmArcSecs((-0.009163971849156792), (-0.009163971849156792), (-9.163971849156792E-9), (-4.4428189257738656E-8), (-9.163971849156792E-9), (-4.4428189257738656E-8), (-4.4428189257738656E-8));
      boolean boolean0 = helmertTransform0.equals(helmertTransform1);
      assertEquals((-0.009163971849156792), helmertTransform1.cy, 0.01);
      assertEquals((-4.442818925773866E-14), helmertTransform1.s, 0.01);
      assertEquals((-4.4428189257738656E-8), helmertTransform0.rx, 0.01);
      assertEquals((-9.163971849156792E-9), helmertTransform1.cz, 0.01);
      assertEquals((-2.153939397907542E-13), helmertTransform1.rz, 0.01);
      assertFalse(boolean0);
      assertEquals((-0.009163971849156792), helmertTransform1.cx, 0.01);
      assertEquals((-2.153939397907542E-13), helmertTransform1.ry, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, (-0.4235123020968779), 0.0, (-0.4235123020968779), (-0.4235123020968779), 0.0, (-0.4235123020968779));
      HelmertTransform helmertTransform1 = helmertTransform0.getInverse();
      boolean boolean0 = helmertTransform1.equals(helmertTransform0);
      assertEquals((-4.235123020968779E-7), helmertTransform0.s, 0.01);
      assertEquals(0.4235123020968779, helmertTransform1.cy, 0.01);
      assertEquals(2.053245581747612E-6, helmertTransform1.rx, 0.01);
      assertEquals(-0.0, helmertTransform1.cz, 0.01);
      assertEquals(-0.0, helmertTransform1.ry, 0.01);
      assertFalse(boolean0);
      assertEquals((-2.053245581747612E-6), helmertTransform0.rx, 0.01);
      assertEquals(2.053245581747612E-6, helmertTransform1.rz, 0.01);
      assertEquals((-2.053245581747612E-6), helmertTransform0.rz, 0.01);
      assertEquals(4.235123020968779E-7, helmertTransform1.s, 0.01);
      assertEquals(-0.0, helmertTransform1.cx, 0.01);
      assertEquals(0.0, helmertTransform0.cz, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs((-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792), (-0.009163971849156792));
      HelmertTransform helmertTransform1 = HelmertTransform.withMPpmArcSecs((-4.4428189257738656E-8), (-0.009163971849156792), (-9.163971849156792E-9), (-4.4428189257738656E-8), (-0.009163971849156792), (-4.4428189257738656E-8), (-4.4428189257738656E-8));
      helmertTransform0.equals(helmertTransform1);
      assertEquals((-2.153939397907542E-13), helmertTransform1.rz, 0.01);
      assertEquals((-4.442818925773866E-14), helmertTransform1.s, 0.01);
      assertEquals((-9.163971849156792E-9), helmertTransform1.cz, 0.01);
      assertEquals((-4.4428189257738656E-8), helmertTransform1.rx, 0.01);
      assertEquals((-0.009163971849156792), helmertTransform1.cy, 0.01);
      assertEquals((-4.4428189257738656E-8), helmertTransform1.cx, 0.01);
      assertEquals((-2.153939397907542E-13), helmertTransform1.ry, 0.01);
      assertEquals((-0.009163971849156792), helmertTransform0.cz, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 1790.93569976453, 6378157.5, 0.0, 1.0);
      Object object0 = new Object();
      boolean boolean0 = helmertTransform0.equals(object0);
      assertFalse(boolean0);
      assertEquals(30.92218016271395, helmertTransform0.rx, 0.01);
      assertEquals(0.0, helmertTransform0.ry, 0.01);
      assertEquals(0.0, helmertTransform0.cz, 0.01);
      assertEquals(0.0, helmertTransform0.cy, 0.01);
      assertEquals(0.0, helmertTransform0.cx, 0.01);
      assertEquals(0.00179093569976453, helmertTransform0.s, 0.01);
      assertEquals(4.84813681109536E-6, helmertTransform0.rz, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      boolean boolean0 = helmertTransform0.equals(helmertTransform0);
      assertTrue(boolean0);
      assertEquals(0.0, helmertTransform0.s, 0.01);
      assertEquals(0.0, helmertTransform0.cx, 0.01);
      assertEquals(0.0, helmertTransform0.ry, 0.01);
      assertEquals(0.0, helmertTransform0.cz, 0.01);
      assertEquals(0.0, helmertTransform0.cy, 0.01);
      assertEquals(0.0, helmertTransform0.rx, 0.01);
      assertEquals(0.0, helmertTransform0.rz, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 1790.93569976453, 6378157.5, 0.0, 1.0);
      Cartesian cartesian0 = Cartesian.inMeters(177.8, 4.84813681109536E-6, 1000000.0);
      Cartesian cartesian1 = helmertTransform0.transform(cartesian0);
      assertEquals(1001790.9358496795, cartesian1.getZ(), 0.01);
      assertEquals(0.0, helmertTransform0.ry, 0.01);
      assertEquals((-3.0922180161847092E7), cartesian1.getY(), 0.01);
      assertEquals(178.11842836739464, cartesian1.getX(), 0.01);
      assertEquals(0.00179093569976453, helmertTransform0.s, 0.01);
      assertEquals(0.0, helmertTransform0.cy, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HelmertTransform helmertTransform0 = HelmertTransform.withMPpmArcSecs(0.0, 0.0, 0.0, 1790.93569976453, 6378157.5, 0.0, 1.0);
      String string0 = helmertTransform0.toString();
      assertEquals("(0.0,0.0,0.0) 0.00179093569976453[30.92218016271395,0.0,4.84813681109536E-6]", string0);
  }
}
