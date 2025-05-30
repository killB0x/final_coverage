/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 07:47:14 GMT 2022
 */

package com.easyinnova.tiff.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.easyinnova.tiff.model.Tag;
import com.easyinnova.tiff.model.TiffTags;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TiffTags_ESTest extends TiffTags_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffTags tiffTags0 = null;
      try {
        tiffTags0 = new TiffTags();
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.model.TiffTags", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      try { 
        TiffTags.getTiffTags();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.model.TiffTags", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(13);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(12);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(11);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(9);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(8);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(7);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(6);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(5);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(4);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(10);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = TiffTags.getTypeSize(3);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Tag tag0 = TiffTags.getTag((-1));
      assertNull(tag0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = TiffTags.getTagId("com.easyinnova.tiff.model.Tag");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = TiffTags.getTagTypeName(2620);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = TiffTags.hasTag((-1447));
      assertFalse(boolean0);
  }
}
