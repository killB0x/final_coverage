/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 19:44:27 GMT 2022
 */

package org.sevensource.magnolia.responsivedam.focusarea;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sevensource.magnolia.responsivedam.configuration.DamVariation;
import org.sevensource.magnolia.responsivedam.configuration.DamVariationSet;
import org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet;
import org.sevensource.magnolia.responsivedam.focusarea.FocusAreas;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FocusAreas_ESTest extends FocusAreas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      DamVariationSet damVariationSet0 = new DamVariationSet("");
      focusAreas0.getOrCreateFocusAreaSet(damVariationSet0);
      List<FocusAreaSet> list0 = focusAreas0.getFocusAreaSets();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        FocusAreas.of((FocusAreas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sevensource.magnolia.responsivedam.focusarea.FocusAreas", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      // Undeclared exception!
      try { 
        focusAreas0.getOrCreateFocusAreaSet((DamVariationSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sevensource.magnolia.responsivedam.focusarea.FocusAreas", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      focusAreas0.addFocusAreaSet((FocusAreaSet) null);
      // Undeclared exception!
      try { 
        focusAreas0.getFocusAreaSet("=LHNAnRxPq.JQ1[");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sevensource.magnolia.responsivedam.focusarea.FocusAreas", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      FocusAreaSet focusAreaSet0 = new FocusAreaSet("");
      focusAreas0.addFocusAreaSet(focusAreaSet0);
      FocusAreaSet focusAreaSet1 = focusAreas0.getFocusAreaSet("");
      assertEquals("", focusAreaSet1.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      List<FocusAreaSet> list0 = focusAreas0.getFocusAreaSets();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      FocusAreas focusAreas1 = FocusAreas.of(focusAreas0);
      assertTrue(focusAreas1.equals((Object)focusAreas0));
      
      focusAreas1.addFocusAreaSet((FocusAreaSet) null);
      boolean boolean0 = focusAreas1.equals(focusAreas0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      Object object0 = new Object();
      boolean boolean0 = focusAreas0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      boolean boolean0 = focusAreas0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      boolean boolean0 = focusAreas0.equals(focusAreas0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      focusAreas0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      DamVariationSet damVariationSet0 = new DamVariationSet("org.sevensource.magnolia.responsivedam.focusarea.FocusArea");
      FocusAreaSet focusAreaSet0 = focusAreas0.getOrCreateFocusAreaSet(damVariationSet0);
      assertNotNull(focusAreaSet0);
      
      FocusAreas focusAreas1 = FocusAreas.of(focusAreas0);
      assertNotSame(focusAreas1, focusAreas0);
      assertTrue(focusAreas1.equals((Object)focusAreas0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      DamVariation damVariation0 = new DamVariation();
      // Undeclared exception!
      try { 
        focusAreas0.getFocusArea(damVariation0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.sevensource.magnolia.responsivedam.focusarea.FocusAreas", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      // Undeclared exception!
      try { 
        focusAreas0.getFocusArea((DamVariation) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DamVariation has no VariationSet
         //
         verifyException("org.sevensource.magnolia.responsivedam.focusarea.FocusAreas", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      DamVariationSet damVariationSet0 = new DamVariationSet("org.sevensource.magnolia.responsivedam.focusarea.FocusArea");
      FocusAreaSet focusAreaSet0 = focusAreas0.getOrCreateFocusAreaSet(damVariationSet0);
      FocusAreaSet focusAreaSet1 = focusAreas0.getOrCreateFocusAreaSet(damVariationSet0);
      assertSame(focusAreaSet1, focusAreaSet0);
      assertNotNull(focusAreaSet1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      FocusAreas focusAreas1 = FocusAreas.of(focusAreas0);
      boolean boolean0 = focusAreas1.equals(focusAreas0);
      assertNotSame(focusAreas1, focusAreas0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FocusAreas focusAreas0 = new FocusAreas();
      DamVariationSet damVariationSet0 = new DamVariationSet("org.sevensource.magnolia.responsivedam.focusarea.FocusArea");
      focusAreas0.getOrCreateFocusAreaSet(damVariationSet0);
      FocusAreaSet focusAreaSet0 = focusAreas0.getFocusAreaSet("org.sevensource.magnolia.responsivedam.focusarea.FocusAreas");
      assertNull(focusAreaSet0);
  }
}
