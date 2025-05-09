/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:41:28 GMT 2022
 */

package com.contentful.java.cma.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.contentful.java.cma.model.CMAWebhookRequest;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CMAWebhookRequest_ESTest extends CMAWebhookRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      cMAWebhookRequest0.url = "CMAWebhookRequest { body = null, headers = null, method = null, url = null }";
      String string0 = cMAWebhookRequest0.getUrl();
      assertEquals("CMAWebhookRequest { body = null, headers = null, method = null, url = null }", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      cMAWebhookRequest0.url = "1S-30^9, ";
      cMAWebhookRequest0.url = " eL";
      cMAWebhookRequest0.url = "";
      String string0 = cMAWebhookRequest0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      cMAWebhookRequest0.method = ">fm]nqbY*ZXpXRZ";
      String string0 = cMAWebhookRequest0.getMethod();
      assertEquals(">fm]nqbY*ZXpXRZ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      cMAWebhookRequest0.method = "";
      String string0 = cMAWebhookRequest0.getMethod();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      cMAWebhookRequest0.body = "";
      cMAWebhookRequest0.body = "^s9%+Iv}H+OWL(4G2";
      String string0 = cMAWebhookRequest0.getJSONBody();
      assertEquals("^s9%+Iv}H+OWL(4G2", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      cMAWebhookRequest0.body = "";
      String string0 = cMAWebhookRequest0.getJSONBody();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      cMAWebhookRequest0.headers = (Map<String, String>) hashMap0;
      Map<String, String> map0 = cMAWebhookRequest0.getHeaders();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      cMAWebhookRequest0.headers = (Map<String, String>) hashMap0;
      hashMap0.put("", "19(#e1Z#{io9");
      Map<String, String> map0 = cMAWebhookRequest0.getHeaders();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      String string0 = cMAWebhookRequest0.getJSONBody();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      String string0 = cMAWebhookRequest0.getMethod();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      Map<String, String> map0 = cMAWebhookRequest0.getHeaders();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      String string0 = cMAWebhookRequest0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CMAWebhookRequest cMAWebhookRequest0 = new CMAWebhookRequest();
      String string0 = cMAWebhookRequest0.toString();
      assertEquals("CMAWebhookRequest { body = null, headers = null, method = null, url = null }", string0);
  }
}
