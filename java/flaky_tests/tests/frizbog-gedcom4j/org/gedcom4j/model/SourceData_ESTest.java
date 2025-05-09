/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 21:39:33 GMT 2022
 */

package org.gedcom4j.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.model.EventRecorded;
import org.gedcom4j.model.SourceData;
import org.gedcom4j.model.StringWithCustomFacts;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SourceData_ESTest extends SourceData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      StringWithCustomFacts stringWithCustomFacts0 = new StringWithCustomFacts();
      sourceData0.setRespAgency(stringWithCustomFacts0);
      StringWithCustomFacts stringWithCustomFacts1 = sourceData0.getRespAgency();
      assertNull(stringWithCustomFacts1.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      sourceData0.getEventsRecorded(true);
      List<EventRecorded> list0 = sourceData0.getEventsRecorded();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SourceData sourceData0 = null;
      try {
        sourceData0 = new SourceData((SourceData) null);
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
      SourceData sourceData0 = new SourceData();
      List<EventRecorded> list0 = sourceData0.getEventsRecorded(false);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      sourceData0.getCustomFacts(true);
      String string0 = sourceData0.toString();
      assertEquals("SourceData [customFacts=[]]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      StringWithCustomFacts stringWithCustomFacts0 = new StringWithCustomFacts();
      sourceData0.setRespAgency(stringWithCustomFacts0);
      String string0 = sourceData0.toString();
      assertEquals("SourceData [respAgency=null, ]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      sourceData0.getNoteStructures(true);
      String string0 = sourceData0.toString();
      assertEquals("SourceData [noteStructures=[], ]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      List<EventRecorded> list0 = sourceData0.getEventsRecorded(true);
      assertNotNull(list0);
      
      String string0 = sourceData0.toString();
      assertEquals("SourceData [eventsRecorded=[], ]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      sourceData0.setRespAgency((String) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      StringWithCustomFacts stringWithCustomFacts0 = new StringWithCustomFacts();
      sourceData0.setRespAgency(stringWithCustomFacts0);
      sourceData0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      sourceData0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      sourceData0.getEventsRecorded(true);
      sourceData0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      List<EventRecorded> list0 = sourceData0.getEventsRecorded(true);
      List<EventRecorded> list1 = sourceData0.getEventsRecorded(true);
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      SourceData sourceData1 = new SourceData(sourceData0);
      assertTrue(sourceData1.equals((Object)sourceData0));
      
      sourceData1.setRespAgency("y6yAdDj,KKeB\"aS");
      boolean boolean0 = sourceData1.equals(sourceData0);
      assertFalse(sourceData1.equals((Object)sourceData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      SourceData sourceData1 = new SourceData(sourceData0);
      assertTrue(sourceData1.equals((Object)sourceData0));
      
      sourceData1.setRespAgency("");
      boolean boolean0 = sourceData0.equals(sourceData1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      SourceData sourceData1 = new SourceData(sourceData0);
      assertTrue(sourceData1.equals((Object)sourceData0));
      
      sourceData1.getEventsRecorded(true);
      boolean boolean0 = sourceData1.equals(sourceData0);
      assertFalse(sourceData1.equals((Object)sourceData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      SourceData sourceData1 = new SourceData(sourceData0);
      assertTrue(sourceData1.equals((Object)sourceData0));
      
      sourceData1.getEventsRecorded(true);
      boolean boolean0 = sourceData0.equals(sourceData1);
      assertFalse(sourceData1.equals((Object)sourceData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      boolean boolean0 = sourceData0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      boolean boolean0 = sourceData0.equals(sourceData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      sourceData0.setRespAgency("");
      SourceData sourceData1 = new SourceData(sourceData0);
      boolean boolean0 = sourceData1.equals(sourceData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      List<EventRecorded> list0 = sourceData0.getEventsRecorded(true);
      assertNotNull(list0);
      
      SourceData sourceData1 = new SourceData(sourceData0);
      boolean boolean0 = sourceData1.equals(sourceData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      StringWithCustomFacts stringWithCustomFacts0 = sourceData0.getRespAgency();
      assertNull(stringWithCustomFacts0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SourceData sourceData0 = new SourceData();
      List<EventRecorded> list0 = sourceData0.getEventsRecorded();
      assertNull(list0);
  }
}
