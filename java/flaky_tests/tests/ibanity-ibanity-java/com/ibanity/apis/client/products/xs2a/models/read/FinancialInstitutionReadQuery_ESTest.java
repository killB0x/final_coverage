/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 11:08:13 GMT 2022
 */

package com.ibanity.apis.client.products.xs2a.models.read;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibanity.apis.client.products.xs2a.models.read.FinancialInstitutionReadQuery;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FinancialInstitutionReadQuery_ESTest extends FinancialInstitutionReadQuery_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = new FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      UUID uUID0 = financialInstitutionReadQuery0.getFinancialInstitutionId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      Random.setNextRandom(255);
      UUID uUID0 = MockUUID.fromString((String) null);
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder1 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.financialInstitutionId(uUID0);
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder1.build();
      UUID uUID1 = financialInstitutionReadQuery0.getFinancialInstitutionId();
      assertSame(uUID0, uUID1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("_Q/x$z2v");
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = new FinancialInstitutionReadQuery("ZWV1l(G", uUID0, (Map<String, String>) null);
      String string0 = financialInstitutionReadQuery0.getCustomerAccessToken();
      assertEquals("ZWV1l(G", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = new FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder();
      financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.customerAccessToken("");
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      String string0 = financialInstitutionReadQuery0.getCustomerAccessToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("_Q/x$z2v");
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = new FinancialInstitutionReadQuery("ZWV1l(G", uUID0, (Map<String, String>) null);
      Map<String, String> map0 = financialInstitutionReadQuery0.getAdditionalHeaders();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = new FinancialInstitutionReadQuery((String) null, uUID0, hashMap0);
      Map<String, String> map0 = financialInstitutionReadQuery0.getAdditionalHeaders();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = new FinancialInstitutionReadQuery((String) null, uUID0, hashMap0);
      hashMap0.put((String) null, (String) null);
      Map<String, String> map0 = financialInstitutionReadQuery0.getAdditionalHeaders();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = new FinancialInstitutionReadQuery((String) null, uUID0, hashMap0);
      UUID uUID1 = financialInstitutionReadQuery0.getFinancialInstitutionId();
      assertEquals("00000000-0100-4000-8200-000003000000", uUID1.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = new FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      String string0 = financialInstitutionReadQuery0.getCustomerAccessToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = new FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder();
      UUID uUID0 = MockUUID.fromString("com.ibanity.apis.client.products.xs2a.models.read.FinancialInstitutionReadQuery$FinancialInstitutionReadQueryBuilder");
      financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.customerAccessToken("");
      financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.financialInstitutionId(uUID0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(",YYk&xC<^\u0007xe{<", "nbdtxO>X7LA");
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      FinancialInstitutionReadQuery financialInstitutionReadQuery1 = new FinancialInstitutionReadQuery("", uUID0, hashMap0);
      boolean boolean0 = financialInstitutionReadQuery1.equals(financialInstitutionReadQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder1 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.additionalHeaders((Map<String, String>) null);
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder1.build();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FinancialInstitutionReadQuery financialInstitutionReadQuery1 = new FinancialInstitutionReadQuery((String) null, (UUID) null, hashMap0);
      boolean boolean0 = financialInstitutionReadQuery0.equals(financialInstitutionReadQuery1);
      assertFalse(boolean0);
      assertFalse(financialInstitutionReadQuery1.equals((Object)financialInstitutionReadQuery0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder1 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.additionalHeaders((Map<String, String>) null);
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder1.build();
      FinancialInstitutionReadQuery financialInstitutionReadQuery1 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder1.build();
      boolean boolean0 = financialInstitutionReadQuery1.equals(financialInstitutionReadQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = new FinancialInstitutionReadQuery((String) null, uUID0, hashMap0);
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = new FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder();
      FinancialInstitutionReadQuery financialInstitutionReadQuery1 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = financialInstitutionReadQuery0.equals(financialInstitutionReadQuery1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      UUID uUID0 = MockUUID.fromString("");
      financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.financialInstitutionId(uUID0);
      FinancialInstitutionReadQuery financialInstitutionReadQuery1 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = financialInstitutionReadQuery0.equals(financialInstitutionReadQuery1);
      assertFalse(financialInstitutionReadQuery1.equals((Object)financialInstitutionReadQuery0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      UUID uUID0 = MockUUID.fromString("");
      financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.financialInstitutionId(uUID0);
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      FinancialInstitutionReadQuery financialInstitutionReadQuery1 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = financialInstitutionReadQuery0.equals(financialInstitutionReadQuery1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      UUID uUID0 = MockUUID.fromString(".}2hoJ,");
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      Map<String, String> map0 = financialInstitutionReadQuery0.getAdditionalHeaders();
      assertNotNull(map0);
      
      FinancialInstitutionReadQuery financialInstitutionReadQuery1 = new FinancialInstitutionReadQuery(".}2hoJ,", uUID0, map0);
      boolean boolean0 = financialInstitutionReadQuery1.equals(financialInstitutionReadQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.customerAccessToken("T|1hZ+T_/(r80");
      FinancialInstitutionReadQuery financialInstitutionReadQuery1 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = financialInstitutionReadQuery0.equals(financialInstitutionReadQuery1);
      assertFalse(financialInstitutionReadQuery1.equals((Object)financialInstitutionReadQuery0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = financialInstitutionReadQuery0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = financialInstitutionReadQuery0.equals(financialInstitutionReadQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("@f(q1q");
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = new FinancialInstitutionReadQuery("@f(q1q", uUID0, (Map<String, String>) null);
      financialInstitutionReadQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      String string0 = hashMap0.remove((Object) financialInstitutionReadQuery0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      FinancialInstitutionReadQuery financialInstitutionReadQuery0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.build();
      String string0 = financialInstitutionReadQuery0.toString();
      assertEquals("FinancialInstitutionReadQuery(customerAccessToken=null, financialInstitutionId=null, additionalHeaders={})", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0 = FinancialInstitutionReadQuery.builder();
      String string0 = financialInstitutionReadQuery_FinancialInstitutionReadQueryBuilder0.toString();
      assertEquals("FinancialInstitutionReadQuery.FinancialInstitutionReadQueryBuilder(customerAccessToken=null, financialInstitutionId=null, additionalHeaders$value=null)", string0);
  }
}
