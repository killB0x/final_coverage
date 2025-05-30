/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 22:57:15 GMT 2022
 */

package org.gedcom4j.model.enumerations;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.model.enumerations.IndividualAttributeType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IndividualAttributeType_ESTest extends IndividualAttributeType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndividualAttributeType[] individualAttributeTypeArray0 = IndividualAttributeType.values();
      assertEquals(14, individualAttributeTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IndividualAttributeType individualAttributeType0 = IndividualAttributeType.valueOf("FACT");
      assertEquals("Fact", individualAttributeType0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IndividualAttributeType.getFromTag("");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IndividualAttributeType individualAttributeType0 = IndividualAttributeType.NATIONAL_OR_TRIBAL_ORIGIN;
      String string0 = individualAttributeType0.getDisplay();
      assertEquals("National or Tribal Origin", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      boolean boolean0 = IndividualAttributeType.isValidTag("TITL");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IndividualAttributeType individualAttributeType0 = IndividualAttributeType.getFromTag("OCCU");
      assertEquals(IndividualAttributeType.OCCUPATION, individualAttributeType0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      boolean boolean0 = IndividualAttributeType.isValidTag("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IndividualAttributeType individualAttributeType0 = IndividualAttributeType.NOBILITY_TYPE_TITLE;
      String string0 = individualAttributeType0.getTag();
      assertEquals("TITL", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IndividualAttributeType individualAttributeType0 = IndividualAttributeType.NOBILITY_TYPE_TITLE;
      String string0 = individualAttributeType0.toString();
      assertEquals("Title", string0);
  }
}
