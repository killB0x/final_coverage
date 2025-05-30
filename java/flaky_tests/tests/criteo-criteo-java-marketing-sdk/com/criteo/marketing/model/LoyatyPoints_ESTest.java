/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:17:49 GMT 2022
 */

package com.criteo.marketing.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.criteo.marketing.model.LoyatyPoints;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LoyatyPoints_ESTest extends LoyatyPoints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Double double0 = new Double(0.0);
      loyatyPoints0.setRatio(double0);
      Double double1 = loyatyPoints0.getRatio();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Double double0 = new Double(2096.8900924);
      loyatyPoints0.setRatio(double0);
      Double double1 = loyatyPoints0.getRatio();
      assertEquals(2096.8900924, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Double double0 = new Double((-179.4));
      loyatyPoints0.ratio(double0);
      Double double1 = loyatyPoints0.getRatio();
      assertEquals((-179.4), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Long long0 = new Long(0L);
      loyatyPoints0.setPointsValue(long0);
      Long long1 = loyatyPoints0.getPointsValue();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Long long0 = new Long(1537L);
      loyatyPoints0.setPointsValue(long0);
      Long long1 = loyatyPoints0.getPointsValue();
      assertEquals(1537L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Long long0 = new Long((-2665L));
      loyatyPoints0.pointsValue(long0);
      Long long1 = loyatyPoints0.getPointsValue();
      assertEquals((-2665L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      loyatyPoints0.name("K");
      String string0 = loyatyPoints0.getName();
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      LoyatyPoints loyatyPoints1 = loyatyPoints0.name("");
      String string0 = loyatyPoints1.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      loyatyPoints0.setName("");
      loyatyPoints0.toString();
      assertEquals("", loyatyPoints0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      LoyatyPoints loyatyPoints1 = new LoyatyPoints();
      assertTrue(loyatyPoints1.equals((Object)loyatyPoints0));
      
      Long long0 = new Long(1200L);
      loyatyPoints1.setPointsValue(long0);
      boolean boolean0 = loyatyPoints0.equals(loyatyPoints1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      LoyatyPoints loyatyPoints1 = new LoyatyPoints();
      assertTrue(loyatyPoints1.equals((Object)loyatyPoints0));
      
      loyatyPoints1.setName("ratio");
      boolean boolean0 = loyatyPoints0.equals(loyatyPoints1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      LoyatyPoints loyatyPoints1 = new LoyatyPoints();
      boolean boolean0 = loyatyPoints0.equals(loyatyPoints1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      boolean boolean0 = loyatyPoints0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      boolean boolean0 = loyatyPoints0.equals(loyatyPoints0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Object object0 = new Object();
      boolean boolean0 = loyatyPoints0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      loyatyPoints0.hashCode();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      String string0 = loyatyPoints0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Double double0 = loyatyPoints0.getRatio();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Long long0 = new Long(0L);
      loyatyPoints0.setPointsValue(long0);
      Double double0 = new Double(0L);
      LoyatyPoints loyatyPoints1 = loyatyPoints0.ratio(double0);
      LoyatyPoints loyatyPoints2 = new LoyatyPoints();
      LoyatyPoints loyatyPoints3 = loyatyPoints2.pointsValue(long0);
      boolean boolean0 = loyatyPoints1.equals(loyatyPoints3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LoyatyPoints loyatyPoints0 = new LoyatyPoints();
      Long long0 = loyatyPoints0.getPointsValue();
      assertNull(long0);
  }
}
