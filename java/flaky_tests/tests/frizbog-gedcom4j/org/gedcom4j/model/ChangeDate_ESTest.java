/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 21:44:19 GMT 2022
 */

package org.gedcom4j.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.model.ChangeDate;
import org.gedcom4j.model.StringWithCustomFacts;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ChangeDate_ESTest extends ChangeDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setTime("j&+{N_-$cd%ev");
      StringWithCustomFacts stringWithCustomFacts0 = changeDate0.getTime();
      assertEquals("j&+{N_-$cd%ev", stringWithCustomFacts0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setDate("");
      StringWithCustomFacts stringWithCustomFacts0 = changeDate0.getDate();
      assertEquals("", stringWithCustomFacts0.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChangeDate changeDate0 = null;
      try {
        changeDate0 = new ChangeDate((ChangeDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gedcom4j.model.AbstractElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      StringWithCustomFacts stringWithCustomFacts0 = changeDate0.getDate();
      assertNull(stringWithCustomFacts0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      StringWithCustomFacts stringWithCustomFacts0 = changeDate0.getTime();
      assertNull(stringWithCustomFacts0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.getCustomFacts(true);
      String string0 = changeDate0.toString();
      assertEquals("ChangeDate [customFacts=[]]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setTime("ChangeDate []");
      String string0 = changeDate0.toString();
      assertEquals("ChangeDate [time=ChangeDate [], ]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.getNoteStructures(true);
      String string0 = changeDate0.toString();
      assertEquals("ChangeDate [noteStructures=[], ]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setDate("");
      String string0 = changeDate0.toString();
      assertEquals("ChangeDate [date=, ]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setTime((String) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setDate((String) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setTime("O");
      changeDate0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setDate("6ox({FY");
      changeDate0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setTime("$jPJWC:6[;R,");
      ChangeDate changeDate1 = new ChangeDate();
      boolean boolean0 = changeDate0.equals(changeDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      ChangeDate changeDate1 = new ChangeDate(changeDate0);
      assertTrue(changeDate1.equals((Object)changeDate0));
      
      changeDate1.setTime(":q1XR&mQYKY~irZ");
      boolean boolean0 = changeDate0.equals(changeDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      ChangeDate changeDate1 = new ChangeDate(changeDate0);
      assertTrue(changeDate1.equals((Object)changeDate0));
      
      changeDate1.setDate("date=");
      boolean boolean0 = changeDate1.equals(changeDate0);
      assertFalse(changeDate1.equals((Object)changeDate0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      ChangeDate changeDate1 = new ChangeDate(changeDate0);
      assertTrue(changeDate1.equals((Object)changeDate0));
      
      changeDate1.setDate("\"?[v#D!|+Bg=^S");
      boolean boolean0 = changeDate0.equals(changeDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      Object object0 = new Object();
      boolean boolean0 = changeDate0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      boolean boolean0 = changeDate0.equals(changeDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      changeDate0.setTime("Cannot set a note reference when there are lines of text. Clear the lines of text or set the lines property to null first.");
      ChangeDate changeDate1 = new ChangeDate(changeDate0);
      boolean boolean0 = changeDate1.equals(changeDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      StringWithCustomFacts stringWithCustomFacts0 = new StringWithCustomFacts();
      changeDate0.setDate(stringWithCustomFacts0);
      ChangeDate changeDate1 = new ChangeDate(changeDate0);
      boolean boolean0 = changeDate0.equals(changeDate1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ChangeDate changeDate0 = new ChangeDate();
      StringWithCustomFacts stringWithCustomFacts0 = new StringWithCustomFacts();
      changeDate0.setTime(stringWithCustomFacts0);
      assertNull(stringWithCustomFacts0.getValue());
  }
}
