/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 21:40:47 GMT 2022
 */

package org.gedcom4j.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.model.FamilyEvent;
import org.gedcom4j.model.StringWithCustomFacts;
import org.gedcom4j.model.enumerations.FamilyEventType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FamilyEvent_ESTest extends FamilyEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setWifeAge("");
      StringWithCustomFacts stringWithCustomFacts0 = familyEvent0.getWifeAge();
      assertEquals("", stringWithCustomFacts0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      FamilyEventType familyEventType0 = FamilyEventType.DIVORCE;
      familyEvent0.setType(familyEventType0);
      FamilyEventType familyEventType1 = familyEvent0.getType();
      assertEquals("Divorce", familyEventType1.getDisplay());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setHusbandAge("MARRIAGE_BANNER");
      StringWithCustomFacts stringWithCustomFacts0 = familyEvent0.getHusbandAge();
      assertEquals("MARRIAGE_BANNER", stringWithCustomFacts0.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FamilyEvent familyEvent0 = null;
      try {
        familyEvent0 = new FamilyEvent((FamilyEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gedcom4j.model.AbstractElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setWifeAge("FamilyEvent []");
      String string0 = familyEvent0.toString();
      assertEquals("FamilyEvent [wifeAge=FamilyEvent [], ]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      FamilyEventType familyEventType0 = FamilyEventType.MARRIAGE_LICENSE;
      familyEvent0.setType(familyEventType0);
      String string0 = familyEvent0.toString();
      assertEquals("FamilyEvent [type=Marriage license, ]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setHusbandAge("pR]OXW+}eJy{");
      String string0 = familyEvent0.toString();
      assertEquals("FamilyEvent [husbandAge=pR]OXW+}eJy{, ]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setWifeAge((String) null);
      assertNull(familyEvent0.getYNull());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setHusbandAge((String) null);
      assertNull(familyEvent0.getYNull());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setWifeAge("");
      familyEvent0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      FamilyEventType familyEventType0 = FamilyEventType.DIVORCE;
      familyEvent0.setType(familyEventType0);
      familyEvent0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setHusbandAge("");
      familyEvent0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setWifeAge("");
      FamilyEvent familyEvent1 = new FamilyEvent();
      boolean boolean0 = familyEvent0.equals(familyEvent1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      FamilyEvent familyEvent1 = new FamilyEvent(familyEvent0);
      assertTrue(familyEvent1.equals((Object)familyEvent0));
      
      familyEvent1.setWifeAge("%]W");
      boolean boolean0 = familyEvent0.equals(familyEvent1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      FamilyEvent familyEvent1 = new FamilyEvent(familyEvent0);
      assertTrue(familyEvent1.equals((Object)familyEvent0));
      
      FamilyEventType familyEventType0 = FamilyEventType.MARRIAGE_CONTRACT;
      familyEvent1.setType(familyEventType0);
      boolean boolean0 = familyEvent1.equals(familyEvent0);
      assertFalse(familyEvent1.equals((Object)familyEvent0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      FamilyEvent familyEvent1 = new FamilyEvent(familyEvent0);
      assertTrue(familyEvent1.equals((Object)familyEvent0));
      
      familyEvent1.setHusbandAge(";U2u|rZY");
      boolean boolean0 = familyEvent0.equals(familyEvent1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      FamilyEvent familyEvent1 = new FamilyEvent(familyEvent0);
      assertTrue(familyEvent1.equals((Object)familyEvent0));
      
      familyEvent1.setHusbandAge("org.gedcom4j.model.FamilyEvent");
      boolean boolean0 = familyEvent1.equals(familyEvent0);
      assertFalse(familyEvent1.equals((Object)familyEvent0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      boolean boolean0 = familyEvent0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      boolean boolean0 = familyEvent0.equals(familyEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setWifeAge("c! :rJAR");
      FamilyEvent familyEvent1 = new FamilyEvent(familyEvent0);
      boolean boolean0 = familyEvent0.equals(familyEvent1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setHusbandAge("ww5tmDKS=^OJ");
      FamilyEvent familyEvent1 = new FamilyEvent(familyEvent0);
      boolean boolean0 = familyEvent1.equals(familyEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      StringWithCustomFacts stringWithCustomFacts0 = new StringWithCustomFacts();
      familyEvent0.setWifeAge(stringWithCustomFacts0);
      assertNull(stringWithCustomFacts0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      StringWithCustomFacts stringWithCustomFacts0 = familyEvent0.getWifeAge();
      assertNull(stringWithCustomFacts0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.setHusbandAge((StringWithCustomFacts) null);
      assertNull(familyEvent0.getYNull());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      familyEvent0.getType();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FamilyEvent familyEvent0 = new FamilyEvent();
      StringWithCustomFacts stringWithCustomFacts0 = familyEvent0.getHusbandAge();
      assertNull(stringWithCustomFacts0);
  }
}
