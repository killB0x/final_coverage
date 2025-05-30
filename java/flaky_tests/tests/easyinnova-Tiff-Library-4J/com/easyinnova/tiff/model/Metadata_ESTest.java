/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 07:55:02 GMT 2022
 */

package com.easyinnova.tiff.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.easyinnova.tiff.model.Metadata;
import com.easyinnova.tiff.model.MetadataObject;
import com.easyinnova.tiff.model.TiffObject;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Metadata_ESTest extends Metadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("oev[ vo", tiffObject0, true, "oev[ vo");
      MetadataObject metadataObject0 = metadata0.getMetadataObject("oev[ vo");
      assertTrue(metadataObject0.isDublinCore());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      metadata0.add("", (TiffObject) null);
      MetadataObject metadataObject0 = metadata0.getMetadataObject("");
      assertNull(metadataObject0.getPath());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("{df%ng't6]d;y9//", tiffObject0);
      List<TiffObject> list0 = metadata0.getList("{df%ng't6]d;y9//");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add((String) null, tiffObject0, "", "G%}1");
      boolean boolean0 = metadata0.contains((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      metadata0.add("ly){qv,/g|)yh0", (TiffObject) null);
      // Undeclared exception!
      try { 
        metadata0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.model.Metadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      // Undeclared exception!
      try { 
        metadata0.addMetadata((Metadata) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.model.Metadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      boolean boolean0 = metadata0.contains((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      // Undeclared exception!
      try { 
        metadata0.getList("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.model.Metadata", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      MetadataObject metadataObject0 = metadata0.getMetadataObject("i/)%*wl<e-");
      assertNull(metadataObject0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      Set<String> set0 = metadata0.keySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      Metadata metadata1 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata1.add("vC?aW@Gavd6`T#v6$d", tiffObject0, true, ",Srd");
      metadata0.addMetadata(metadata1);
      assertFalse(metadata0.equals((Object)metadata1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      tiffObject0.setContainer("XMP");
      metadata0.add("XMP", tiffObject0);
      metadata0.add("XMP", tiffObject0);
      TiffObject tiffObject1 = metadata0.get("XMP");
      assertSame(tiffObject1, tiffObject0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("", tiffObject0);
      metadata0.add("", tiffObject0, true, "Q-xL$9mMJ_VB");
      tiffObject0.setContainer("EXIF");
      TiffObject tiffObject1 = metadata0.get("");
      assertEquals("EXIF", tiffObject1.getContainer());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffObject tiffObject0 = new TiffObject();
      TiffObject tiffObject1 = new TiffObject();
      tiffObject1.setContainer("XMP");
      Metadata metadata0 = new Metadata();
      metadata0.add("XMP", tiffObject0);
      metadata0.add("XMP", tiffObject1);
      TiffObject tiffObject2 = metadata0.get("XMP");
      assertNotNull(tiffObject2);
      assertNotSame(tiffObject2, tiffObject0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("", tiffObject0);
      metadata0.add("", tiffObject0, true, "Q-xL$9mMJ_VB");
      tiffObject0.setContainer("Q-xL$9mMJ_VB");
      TiffObject tiffObject1 = metadata0.get("");
      assertEquals("Q-xL$9mMJ_VB", tiffObject1.getContainer());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("creatortool", tiffObject0);
      TiffObject tiffObject1 = metadata0.get("creator");
      assertNull(tiffObject1.getContainer());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffObject tiffObject0 = new TiffObject();
      Metadata metadata0 = new Metadata();
      metadata0.add("1=;b_{0%ia!z/w;", tiffObject0);
      TiffObject tiffObject1 = metadata0.get("creator");
      assertNull(tiffObject1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TiffObject tiffObject0 = new TiffObject();
      Metadata metadata0 = new Metadata();
      metadata0.add("imagedescription", tiffObject0);
      TiffObject tiffObject1 = metadata0.get("description");
      assertSame(tiffObject1, tiffObject0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TiffObject tiffObject0 = new TiffObject();
      Metadata metadata0 = new Metadata();
      metadata0.add("1=;b_{0%ia!z/w;", tiffObject0);
      TiffObject tiffObject1 = metadata0.get("description");
      assertNull(tiffObject1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TiffObject tiffObject0 = new TiffObject();
      Metadata metadata0 = new Metadata();
      metadata0.add("nh\"D7k2]", tiffObject0);
      TiffObject tiffObject1 = metadata0.get("date");
      assertNull(tiffObject1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("datetime", tiffObject0);
      TiffObject tiffObject1 = metadata0.get("date");
      assertNull(tiffObject1.getContainer());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      metadata0.add("artist", (TiffObject) null);
      TiffObject tiffObject0 = metadata0.get("creator");
      assertNull(tiffObject0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      metadata0.add("V\"WZJbu]", (TiffObject) null);
      TiffObject tiffObject0 = metadata0.get("v\"wzjbu]");
      assertNull(tiffObject0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("creatordate", tiffObject0);
      TiffObject tiffObject1 = metadata0.get("date");
      assertNull(tiffObject1.getContainer());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("", tiffObject0);
      metadata0.add("", tiffObject0, true, "Q-xL$9mMJ_VB");
      TiffObject tiffObject1 = metadata0.get("");
      assertNull(tiffObject1.getContainer());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("", tiffObject0);
      metadata0.add("", (TiffObject) null, "j $fC`", "z88Ui_lSj");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TiffObject tiffObject0 = new TiffObject();
      Metadata metadata0 = new Metadata();
      metadata0.add("nh\"D7k2]", tiffObject0);
      TiffObject tiffObject1 = metadata0.get("nh\"D7k2]");
      assertSame(tiffObject1, tiffObject0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      TiffObject tiffObject0 = new TiffObject();
      metadata0.add("vC?aW@Gavd6`T#v6$d", tiffObject0, true, ",Srd");
      // Undeclared exception!
      try { 
        metadata0.addMetadata(metadata0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }
}
