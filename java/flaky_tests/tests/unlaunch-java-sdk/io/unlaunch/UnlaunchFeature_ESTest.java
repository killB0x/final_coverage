/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 08:34:59 GMT 2022
 */

package io.unlaunch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.unlaunch.UnlaunchFeature;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnlaunchFeature_ESTest extends UnlaunchFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create("$'<[", (String) null, (Map<String, String>) hashMap0, "$'<[");
      String string0 = unlaunchFeature0.getVariation();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create("gPkoe?*Y&^S*X", "7.Yo8ArXIF,H{A", (Map<String, String>) hashMap0, "gPkoe?*Y&^S*X");
      String string0 = unlaunchFeature0.getVariation();
      assertEquals("gPkoe?*Y&^S*X", unlaunchFeature0.getFlag());
      assertEquals("gPkoe?*Y&^S*X", unlaunchFeature0.getEvaluationReason());
      assertEquals("7.Yo8ArXIF,H{A", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create((String) null, "io.unlaunch.UnlaunchFeature", (Map<String, String>) hashMap0);
      String string0 = unlaunchFeature0.getFlag();
      assertNull(string0);
      assertEquals("", unlaunchFeature0.getEvaluationReason());
      assertEquals("io.unlaunch.UnlaunchFeature", unlaunchFeature0.getVariation());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create("", "", (Map<String, String>) null, "");
      String string0 = unlaunchFeature0.getFlag();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create("gPkoe?*Y&^S*X", "7.Yo8ArXIF,H{A", (Map<String, String>) hashMap0, "gPkoe?*Y&^S*X");
      String string0 = unlaunchFeature0.getEvaluationReason();
      assertEquals("7.Yo8ArXIF,H{A", unlaunchFeature0.getVariation());
      assertEquals("gPkoe?*Y&^S*X", string0);
      assertEquals("gPkoe?*Y&^S*X", unlaunchFeature0.getFlag());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create(">\">fLO", "", (Map<String, String>) hashMap0);
      hashMap0.put("", ">\">fLO");
      unlaunchFeature0.getVariationConfig();
      assertEquals(">\">fLO", unlaunchFeature0.getFlag());
      assertEquals("", unlaunchFeature0.getVariation());
      assertEquals("", unlaunchFeature0.getEvaluationReason());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create(">\">fLO", "", (Map<String, String>) hashMap0);
      unlaunchFeature0.getVariationConfig();
      assertEquals("", unlaunchFeature0.getVariation());
      assertEquals("", unlaunchFeature0.getEvaluationReason());
      assertEquals(">\">fLO", unlaunchFeature0.getFlag());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create("", "|8", (Map<String, String>) null);
      // Undeclared exception!
      try { 
        unlaunchFeature0.getVariationConfig();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("c@#4;'!a=#5Q<R{6`?#", (String) null);
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create("io.unlaunch.UnlaunchFeature", "", (Map<String, String>) hashMap0);
      Map<String, String> map0 = unlaunchFeature0.getVariationConfigAsMap();
      assertEquals("", unlaunchFeature0.getEvaluationReason());
      assertEquals("", unlaunchFeature0.getVariation());
      assertEquals("io.unlaunch.UnlaunchFeature", unlaunchFeature0.getFlag());
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create(">\">fLO", "", (Map<String, String>) hashMap0);
      unlaunchFeature0.getVariationConfigAsMap();
      assertEquals("", unlaunchFeature0.getEvaluationReason());
      assertEquals(">\">fLO", unlaunchFeature0.getFlag());
      assertEquals("", unlaunchFeature0.getVariation());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create("", "", (Map<String, String>) null, "");
      Map<String, String> map0 = unlaunchFeature0.getVariationConfigAsMap();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create("gPkoe?*Y&^S*X", "7.Yo8ArXIF,H{A", (Map<String, String>) hashMap0, "gPkoe?*Y&^S*X");
      String string0 = unlaunchFeature0.getFlag();
      assertEquals("7.Yo8ArXIF,H{A", unlaunchFeature0.getVariation());
      assertEquals("gPkoe?*Y&^S*X", unlaunchFeature0.getEvaluationReason());
      assertEquals("gPkoe?*Y&^S*X", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create(">\">fLO", "", (Map<String, String>) hashMap0);
      String string0 = unlaunchFeature0.getEvaluationReason();
      assertEquals(">\">fLO", unlaunchFeature0.getFlag());
      assertEquals("", unlaunchFeature0.getVariation());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create(">\">fLO", "", (Map<String, String>) hashMap0);
      String string0 = unlaunchFeature0.getVariation();
      assertEquals(">\">fLO", unlaunchFeature0.getFlag());
      assertEquals("", string0);
      assertEquals("", unlaunchFeature0.getEvaluationReason());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UnlaunchFeature unlaunchFeature0 = UnlaunchFeature.create("", "!kGnE|.yU\"d", (Map<String, String>) hashMap0, (String) null);
      String string0 = unlaunchFeature0.getEvaluationReason();
      assertEquals("", unlaunchFeature0.getFlag());
      assertEquals("!kGnE|.yU\"d", unlaunchFeature0.getVariation());
      assertNull(string0);
  }
}
