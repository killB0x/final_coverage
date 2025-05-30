/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:55:49 GMT 2022
 */

package com.contentful.java.cma.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.contentful.java.cma.model.CMALink;
import com.contentful.java.cma.model.CMALocale;
import com.contentful.java.cma.model.CMASystem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CMALocale_ESTest extends CMALocale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.optional = true;
      Integer integer0 = new Integer((-1));
      CMALocale cMALocale1 = cMALocale0.setVersion(integer0);
      assertFalse(cMALocale1.isPublished());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      Integer integer0 = new Integer(0);
      CMALocale cMALocale1 = cMALocale0.setVersion(integer0);
      cMALocale1.isDefault = true;
      CMALocale cMALocale2 = cMALocale0.setVersion(integer0);
      assertFalse(cMALocale2.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentManagementApi(true);
      Integer integer0 = new Integer((-1));
      cMALocale0.setVersion(integer0);
      assertTrue(cMALocale0.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentDeliveryApi(true);
      Integer integer0 = new Integer((-1));
      cMALocale1.setVersion(integer0);
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setOptional(true);
      CMASystem cMASystem0 = new CMASystem();
      cMALocale1.setSystem(cMASystem0);
      assertTrue(cMALocale0.isOptional());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setDefault(true);
      CMASystem cMASystem0 = new CMASystem();
      cMALocale1.setSystem(cMASystem0);
      assertTrue(cMALocale0.isDefault());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentManagementApi(true);
      CMASystem cMASystem0 = new CMASystem();
      cMALocale1.setSystem(cMASystem0);
      assertTrue(cMALocale0.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentDeliveryApi(true);
      CMASystem cMASystem0 = new CMASystem();
      cMALocale0.setSystem(cMASystem0);
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setOptional(true);
      cMALocale0.setSpaceId("");
      assertTrue(cMALocale0.isOptional());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setDefault(true);
      cMALocale0.setSpaceId(", ");
      assertTrue(cMALocale0.isDefault());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentManagementApi(true);
      cMALocale1.setSpaceId(", ");
      assertTrue(cMALocale0.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentDeliveryApi(true);
      cMALocale1.setSpaceId(", ");
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setDefault(true);
      cMALocale0.setOptional(true);
      assertTrue(cMALocale0.isDefault());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentManagementApi(true);
      cMALocale0.setOptional(true);
      assertTrue(cMALocale0.isOptional());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentDeliveryApi(true);
      cMALocale0.setOptional(false);
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setOptional(true);
      cMALocale0.setName("WebhookDefinition");
      assertTrue(cMALocale0.isOptional());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setDefault(true);
      cMALocale1.setName("WebhookDefinition");
      assertTrue(cMALocale0.isDefault());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentManagementApi(true);
      cMALocale1.setName("ktZe-U(");
      assertTrue(cMALocale0.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentDeliveryApi(true);
      cMALocale0.setName("WebhookDefinition");
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setOptional(true);
      cMALocale1.setId("Space");
      assertTrue(cMALocale0.isOptional());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setDefault(true);
      cMALocale0.setId("Space");
      assertTrue(cMALocale0.isDefault());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentManagementApi(true);
      cMALocale0.setId("");
      assertTrue(cMALocale0.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentDeliveryApi(true);
      cMALocale0.setId("");
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      Integer integer0 = new Integer((-1));
      CMALocale cMALocale1 = cMALocale0.setVersion(integer0);
      cMALocale1.optional = true;
      CMALocale cMALocale2 = cMALocale0.setFallbackCode(", name = ");
      assertFalse(cMALocale2.isPublished());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setDefault(true);
      cMALocale1.setFallbackCode("`sR!5nP");
      assertTrue(cMALocale0.isDefault());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentManagementApi(true);
      cMALocale1.setFallbackCode("o~g'g");
      assertTrue(cMALocale0.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentDeliveryApi(true);
      cMALocale1.setFallbackCode("`sR!5nP");
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentManagementApi(true);
      cMALocale0.setDefault(true);
      assertTrue(cMALocale0.isDefault());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentDeliveryApi(true);
      cMALocale1.setDefault(true);
      assertTrue(cMALocale1.isDefault());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.optional = true;
      cMALocale0.setContentManagementApi(true);
      assertTrue(cMALocale0.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setDefault(true);
      cMALocale1.setContentManagementApi(true);
      assertTrue(cMALocale0.isDefault());
      assertTrue(cMALocale0.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentManagementApi(false);
      assertFalse(cMALocale1.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentDeliveryApi(true);
      cMALocale0.setContentManagementApi(true);
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.optional = true;
      cMALocale0.setContentDeliveryApi(true);
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setDefault(true);
      cMALocale1.setContentDeliveryApi(false);
      assertTrue(cMALocale0.isDefault());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentManagementApi(true);
      cMALocale1.setContentDeliveryApi(true);
      assertTrue(cMALocale1.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.optional = true;
      CMALocale cMALocale1 = cMALocale0.setCode("");
      assertEquals("master", cMALocale1.getEnvironmentId());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      Integer integer0 = new Integer(0);
      CMALocale cMALocale1 = cMALocale0.setVersion(integer0);
      cMALocale1.isDefault = true;
      CMALocale cMALocale2 = cMALocale1.setCode("jh+A<?ZqPB^yZ]8M");
      assertEquals("jh+A<?ZqPB^yZ]8M", cMALocale2.getCode());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentManagementApi(true);
      cMALocale0.setCode("");
      assertTrue(cMALocale0.isContentManagementApi());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentDeliveryApi(true);
      cMALocale0.setCode("");
      assertTrue(cMALocale0.isContentDeliveryApi());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      Integer integer0 = new Integer((-1));
      CMALocale cMALocale1 = cMALocale0.setVersion(integer0);
      cMALocale1.optional = true;
      boolean boolean0 = cMALocale0.isOptional();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      Integer integer0 = new Integer(0);
      CMALocale cMALocale1 = cMALocale0.setVersion(integer0);
      cMALocale1.isDefault = true;
      boolean boolean0 = cMALocale1.isDefault();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setName("WebhookDefinition");
      String string0 = cMALocale0.getName();
      assertEquals("WebhookDefinition", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setFallbackCode("o~g'g");
      String string0 = cMALocale0.getFallbackCode();
      assertEquals("o~g'g", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setFallbackCode("");
      String string0 = cMALocale0.getFallbackCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setCode("d!s`MM1C}En+o)A1D@/");
      String string0 = cMALocale0.getCode();
      assertEquals("d!s`MM1C}En+o)A1D@/", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setId("K`6^|T");
      cMALocale1.code = "";
      String string0 = cMALocale1.getCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMASystem cMASystem0 = new CMASystem();
      CMALink cMALink0 = new CMALink();
      CMASystem cMASystem1 = cMASystem0.setContentType(cMALink0);
      cMALink0.setSystem(cMASystem1);
      cMALocale0.setSystem(cMASystem0);
      // Undeclared exception!
      cMALocale0.toString();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setSystem((CMASystem) null);
      Integer integer0 = new Integer((-702));
      // Undeclared exception!
      try { 
        cMALocale0.setVersion(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.CMAResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setSystem((CMASystem) null);
      // Undeclared exception!
      try { 
        cMALocale0.setSpaceId(";tvCX:6Mx");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.CMAResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setSystem((CMASystem) null);
      // Undeclared exception!
      try { 
        cMALocale0.setId("*yCf7\"+I@c");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.contentful.java.cma.model.CMAResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      String string0 = cMALocale0.getFallbackCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      boolean boolean0 = cMALocale0.isOptional();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      boolean boolean0 = cMALocale0.isContentDeliveryApi();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      boolean boolean0 = cMALocale0.isDefault();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      String string0 = cMALocale0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      boolean boolean0 = cMALocale0.isContentManagementApi();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      String string0 = cMALocale0.getCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setContentManagementApi(true);
      boolean boolean0 = cMALocale1.isContentManagementApi();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setName("");
      String string0 = cMALocale0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setContentDeliveryApi(true);
      boolean boolean0 = cMALocale0.isContentDeliveryApi();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      cMALocale0.setOptional(true);
      cMALocale0.setDefault(true);
      assertTrue(cMALocale0.isOptional());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      CMALocale cMALocale1 = cMALocale0.setDefault(false);
      assertFalse(cMALocale1.isDefault());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CMALocale cMALocale0 = new CMALocale();
      String string0 = cMALocale0.toString();
      assertEquals("CMALocale { CMAResource { system = CMASystem { type = Locale } } code = null, contentDeliveryApi = false, contentManagementApi = false, fallbackCode = null, isDefault = false, name = null, optional = false }", string0);
  }
}
