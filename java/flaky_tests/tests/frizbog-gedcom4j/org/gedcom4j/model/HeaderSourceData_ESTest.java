/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 21:30:44 GMT 2022
 */

package org.gedcom4j.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.model.HeaderSourceData;
import org.gedcom4j.model.StringWithCustomFacts;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HeaderSourceData_ESTest extends HeaderSourceData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.getCustomFacts(true);
      headerSourceData0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setPublishDate("HeaderSourceData [copyright=hx8=5u~, name=02} cD5whY@ig4CnTI, ]");
      StringWithCustomFacts stringWithCustomFacts0 = headerSourceData0.getPublishDate();
      assertEquals("HeaderSourceData [copyright=hx8=5u~, name=02} cD5whY@ig4CnTI, ]", stringWithCustomFacts0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setName((StringWithCustomFacts) null);
      StringWithCustomFacts stringWithCustomFacts0 = headerSourceData0.getName();
      assertNull(stringWithCustomFacts0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setCopyright("");
      StringWithCustomFacts stringWithCustomFacts0 = headerSourceData0.getCopyright();
      assertEquals("", stringWithCustomFacts0.getValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HeaderSourceData headerSourceData0 = null;
      try {
        headerSourceData0 = new HeaderSourceData((HeaderSourceData) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gedcom4j.model.AbstractElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.getCustomFacts(true);
      String string0 = headerSourceData0.toString();
      assertEquals("HeaderSourceData [name=UNSPECIFIED, customFacts=[]]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setPublishDate("D_HVCpkY>hps");
      String string0 = headerSourceData0.toString();
      assertEquals("HeaderSourceData [name=UNSPECIFIED, publishDate=D_HVCpkY>hps, ]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setName((StringWithCustomFacts) null);
      String string0 = headerSourceData0.toString();
      assertEquals("HeaderSourceData []", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setCopyright("hx8=5u~");
      String string0 = headerSourceData0.toString();
      assertEquals("HeaderSourceData [copyright=hx8=5u~, name=UNSPECIFIED, ]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setPublishDate((String) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setName((StringWithCustomFacts) null);
      headerSourceData0.setName("HeaderSourceData [name=UNSPECIFIED, ]");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setCopyright((String) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setPublishDate("HeaderSourceData [copyright=hx8=5u~, name=02} cD5whY@ig4CnTI, ]");
      headerSourceData0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setName((StringWithCustomFacts) null);
      headerSourceData0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setCopyright("");
      headerSourceData0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      HeaderSourceData headerSourceData1 = new HeaderSourceData(headerSourceData0);
      assertTrue(headerSourceData1.equals((Object)headerSourceData0));
      
      headerSourceData1.setPublishDate("Q");
      boolean boolean0 = headerSourceData1.equals(headerSourceData0);
      assertFalse(headerSourceData1.equals((Object)headerSourceData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      StringWithCustomFacts stringWithCustomFacts0 = headerSourceData0.getName();
      HeaderSourceData headerSourceData1 = new HeaderSourceData(headerSourceData0);
      assertTrue(headerSourceData1.equals((Object)headerSourceData0));
      
      headerSourceData1.setPublishDate(stringWithCustomFacts0);
      boolean boolean0 = headerSourceData0.equals(headerSourceData1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setName("<uH");
      HeaderSourceData headerSourceData1 = new HeaderSourceData();
      boolean boolean0 = headerSourceData0.equals(headerSourceData1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      HeaderSourceData headerSourceData1 = new HeaderSourceData(headerSourceData0);
      assertTrue(headerSourceData1.equals((Object)headerSourceData0));
      
      headerSourceData0.setName((StringWithCustomFacts) null);
      boolean boolean0 = headerSourceData0.equals(headerSourceData1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      HeaderSourceData headerSourceData1 = new HeaderSourceData(headerSourceData0);
      assertTrue(headerSourceData1.equals((Object)headerSourceData0));
      
      StringWithCustomFacts stringWithCustomFacts0 = headerSourceData0.getName();
      headerSourceData1.setCopyright(stringWithCustomFacts0);
      boolean boolean0 = headerSourceData0.equals(headerSourceData1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      HeaderSourceData headerSourceData1 = new HeaderSourceData(headerSourceData0);
      assertTrue(headerSourceData1.equals((Object)headerSourceData0));
      
      StringWithCustomFacts stringWithCustomFacts0 = new StringWithCustomFacts();
      headerSourceData1.setCopyright(stringWithCustomFacts0);
      boolean boolean0 = headerSourceData1.equals(headerSourceData0);
      assertFalse(headerSourceData1.equals((Object)headerSourceData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      boolean boolean0 = headerSourceData0.equals(headerSourceData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      Object object0 = new Object();
      boolean boolean0 = headerSourceData0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setCopyright("publishDate=");
      HeaderSourceData headerSourceData1 = new HeaderSourceData(headerSourceData0);
      boolean boolean0 = headerSourceData0.equals(headerSourceData1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      StringWithCustomFacts stringWithCustomFacts0 = headerSourceData0.getName();
      headerSourceData0.setPublishDate(stringWithCustomFacts0);
      assertEquals("UNSPECIFIED", stringWithCustomFacts0.getValue());
      
      HeaderSourceData headerSourceData1 = new HeaderSourceData(headerSourceData0);
      boolean boolean0 = headerSourceData1.equals(headerSourceData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      StringWithCustomFacts stringWithCustomFacts0 = headerSourceData0.getPublishDate();
      assertNull(stringWithCustomFacts0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      StringWithCustomFacts stringWithCustomFacts0 = headerSourceData0.getCopyright();
      assertNull(stringWithCustomFacts0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HeaderSourceData headerSourceData0 = new HeaderSourceData();
      headerSourceData0.setName((StringWithCustomFacts) null);
      HeaderSourceData headerSourceData1 = new HeaderSourceData(headerSourceData0);
      boolean boolean0 = headerSourceData0.equals(headerSourceData1);
      assertTrue(boolean0);
  }
}
