/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 17:36:58 GMT 2022
 */

package com.urbanairship.api.push.model.notification.wns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.urbanairship.api.push.model.notification.wns.WNSBadgeData;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WNSBadgeData_ESTest extends WNSBadgeData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      wNSBadgeData_Builder0.setValue((-793));
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder0.build();
      wNSBadgeData0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WNSBadgeData.Glyph wNSBadgeData_Glyph0 = WNSBadgeData.Glyph.get("ERROR");
      assertEquals(WNSBadgeData.Glyph.ERROR, wNSBadgeData_Glyph0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      WNSBadgeData.Builder wNSBadgeData_Builder1 = wNSBadgeData_Builder0.setValue((-1));
      WNSBadgeData.Glyph wNSBadgeData_Glyph0 = WNSBadgeData.Glyph.BUSY;
      WNSBadgeData.Builder wNSBadgeData_Builder2 = wNSBadgeData_Builder1.setGlyph(wNSBadgeData_Glyph0);
      // Undeclared exception!
      try { 
        wNSBadgeData_Builder2.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply one of 'value' or 'glyph', but not both.
         //
         verifyException("com.urbanairship.api.push.model.notification.wns.WNSBadgeData$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      // Undeclared exception!
      try { 
        wNSBadgeData_Builder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply one of 'value' or 'glyph'.
         //
         verifyException("com.urbanairship.api.push.model.notification.wns.WNSBadgeData$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      WNSBadgeData.Glyph wNSBadgeData_Glyph0 = WNSBadgeData.Glyph.UNAVAILABLE;
      wNSBadgeData_Builder0.setGlyph(wNSBadgeData_Glyph0);
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder0.build();
      wNSBadgeData0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      WNSBadgeData.Glyph wNSBadgeData_Glyph0 = WNSBadgeData.Glyph.NONE;
      wNSBadgeData_Builder0.setGlyph(wNSBadgeData_Glyph0);
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder0.build();
      WNSBadgeData.Glyph wNSBadgeData_Glyph1 = WNSBadgeData.Glyph.ACTIVITY;
      wNSBadgeData_Builder0.setGlyph(wNSBadgeData_Glyph1);
      WNSBadgeData wNSBadgeData1 = wNSBadgeData_Builder0.build();
      boolean boolean0 = wNSBadgeData0.equals(wNSBadgeData1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      WNSBadgeData.Builder wNSBadgeData_Builder1 = wNSBadgeData_Builder0.setValue(0);
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder1.build();
      wNSBadgeData_Builder1.setValue((-1614608448));
      WNSBadgeData wNSBadgeData1 = wNSBadgeData_Builder0.build();
      boolean boolean0 = wNSBadgeData0.equals(wNSBadgeData1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      WNSBadgeData.Glyph wNSBadgeData_Glyph0 = WNSBadgeData.Glyph.UNAVAILABLE;
      wNSBadgeData_Builder0.setGlyph(wNSBadgeData_Glyph0);
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder0.build();
      WNSBadgeData wNSBadgeData1 = wNSBadgeData_Builder0.build();
      boolean boolean0 = wNSBadgeData1.equals(wNSBadgeData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      wNSBadgeData_Builder0.setValue((-1995712965));
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder0.build();
      boolean boolean0 = wNSBadgeData0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      WNSBadgeData.Builder wNSBadgeData_Builder1 = wNSBadgeData_Builder0.setValue(1478);
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder1.build();
      boolean boolean0 = wNSBadgeData0.equals(wNSBadgeData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      WNSBadgeData.Glyph wNSBadgeData_Glyph0 = WNSBadgeData.Glyph.UNAVAILABLE;
      wNSBadgeData_Builder0.setGlyph(wNSBadgeData_Glyph0);
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder0.build();
      boolean boolean0 = wNSBadgeData0.equals(wNSBadgeData_Builder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WNSBadgeData.Glyph wNSBadgeData_Glyph0 = WNSBadgeData.Glyph.get("BUSY");
      assertEquals(WNSBadgeData.Glyph.BUSY, wNSBadgeData_Glyph0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WNSBadgeData.Glyph.get("");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      WNSBadgeData.Glyph wNSBadgeData_Glyph0 = WNSBadgeData.Glyph.UNAVAILABLE;
      wNSBadgeData_Builder0.setGlyph(wNSBadgeData_Glyph0);
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder0.build();
      Optional<Integer> optional0 = wNSBadgeData0.getValue();
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WNSBadgeData.Builder wNSBadgeData_Builder0 = WNSBadgeData.newBuilder();
      WNSBadgeData.Builder wNSBadgeData_Builder1 = wNSBadgeData_Builder0.setValue(0);
      WNSBadgeData wNSBadgeData0 = wNSBadgeData_Builder1.build();
      Optional<WNSBadgeData.Glyph> optional0 = wNSBadgeData0.getGlyph();
      assertNotNull(optional0);
  }
}
