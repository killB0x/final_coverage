/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 03:22:43 GMT 2022
 */

package org.jiucai.appframework.common.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jiucai.appframework.common.util.SwfInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SwfInfo_ESTest extends SwfInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setCompressed(true);
      boolean boolean0 = swfInfo0.isCompressed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setWidth(2457);
      int int0 = swfInfo0.getWidth();
      assertEquals(2457, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setWidth((-5449));
      int int0 = swfInfo0.getWidth();
      assertEquals((-5449), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setVersion(182);
      int int0 = swfInfo0.getVersion();
      assertEquals(182, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setVersion((-1767));
      int int0 = swfInfo0.getVersion();
      assertEquals((-1767), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setSize(1148L);
      long long0 = swfInfo0.getSize();
      assertEquals(1148L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setSize((-696L));
      long long0 = swfInfo0.getSize();
      assertEquals((-696L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setHeight(453);
      int int0 = swfInfo0.getHeight();
      assertEquals(453, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setHeight((-1173));
      int int0 = swfInfo0.getHeight();
      assertEquals((-1173), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setFrameCount(182);
      int int0 = swfInfo0.getFrameCount();
      assertEquals(182, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setFrameCount((-2004));
      int int0 = swfInfo0.getFrameCount();
      assertEquals((-2004), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setFps(210.18F);
      float float0 = swfInfo0.getFps();
      assertEquals(210.18F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      int int0 = swfInfo0.getFrameCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      swfInfo0.setFps((-1173));
      float float0 = swfInfo0.getFps();
      assertEquals((-1173.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      float float0 = swfInfo0.getFps();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      int int0 = swfInfo0.getVersion();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      int int0 = swfInfo0.getWidth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      boolean boolean0 = swfInfo0.isCompressed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      long long0 = swfInfo0.getSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      String string0 = swfInfo0.toString();
      assertEquals("SwfInfo [isCompressed=false, version=0, size=0, width=0, height=0, fps=0.0, frameCount=0]", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SwfInfo swfInfo0 = new SwfInfo();
      int int0 = swfInfo0.getHeight();
      assertEquals(0, int0);
  }
}
