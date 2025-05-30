/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 11:02:02 GMT 2022
 */

package com.ibanity.apis.client.products.ponto_connect.models.read;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibanity.apis.client.products.ponto_connect.models.read.OrganizationFinancialInstitutionReadQuery;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OrganizationFinancialInstitutionReadQuery_ESTest extends OrganizationFinancialInstitutionReadQuery_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Random.setNextRandom(926);
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = new OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder();
      UUID uUID0 = MockUUID.randomUUID();
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.financialInstitutionId(uUID0);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1.build();
      UUID uUID1 = organizationFinancialInstitutionReadQuery0.getFinancialInstitutionId();
      assertEquals((-6916684600009621504L), uUID1.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = new OrganizationFinancialInstitutionReadQuery(uUID0, "", (Map<String, String>) null);
      UUID uUID1 = organizationFinancialInstitutionReadQuery0.getFinancialInstitutionId();
      assertEquals("00000000-0100-4000-8200-000003000000", uUID1.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = new OrganizationFinancialInstitutionReadQuery(uUID0, "", (Map<String, String>) null);
      Map<String, String> map0 = organizationFinancialInstitutionReadQuery0.getAdditionalHeaders();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.additionalHeaders(hashMap0);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1.build();
      Map<String, String> map0 = organizationFinancialInstitutionReadQuery0.getAdditionalHeaders();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.additionalHeaders(hashMap0);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1.build();
      hashMap0.put("OrganizationFinancialInstitutionReadQuery(financialInstitutionId=00000000-0100-4000-8200-000003000000, accessToken=, additionalHeaders={})", "OrganizationFinancialInstitutionReadQuery(financialInstitutionId=00000000-0100-4000-8200-000003000000, accessToken=, additionalHeaders={})");
      Map<String, String> map0 = organizationFinancialInstitutionReadQuery0.getAdditionalHeaders();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = new OrganizationFinancialInstitutionReadQuery(uUID0, "'?=*[}", hashMap0);
      String string0 = organizationFinancialInstitutionReadQuery0.getAccessToken();
      assertEquals("'?=*[}", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = new OrganizationFinancialInstitutionReadQuery(uUID0, "", (Map<String, String>) null);
      String string0 = organizationFinancialInstitutionReadQuery0.getAccessToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery0.canEqual(organizationFinancialInstitutionReadQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery0.canEqual(uUID0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      UUID uUID0 = organizationFinancialInstitutionReadQuery0.getFinancialInstitutionId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      String string0 = organizationFinancialInstitutionReadQuery0.getAccessToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.additionalHeaders((Map<String, String>) null);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery0.equals(organizationFinancialInstitutionReadQuery1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.additionalHeaders((Map<String, String>) null);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery1.equals(organizationFinancialInstitutionReadQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.additionalHeaders((Map<String, String>) null);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery1.equals(organizationFinancialInstitutionReadQuery0);
      assertFalse(boolean0);
      assertFalse(organizationFinancialInstitutionReadQuery0.equals((Object)organizationFinancialInstitutionReadQuery1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = new OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder();
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.accessToken("");
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder1.build();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery0.equals(organizationFinancialInstitutionReadQuery1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = new OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.accessToken("OrganizationFinancialInstitutionReadQuery(financialInstitutionId=null, accessToken=null, additionalHeaders={})");
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery0.equals(organizationFinancialInstitutionReadQuery1);
      assertFalse(boolean0);
      assertFalse(organizationFinancialInstitutionReadQuery1.equals((Object)organizationFinancialInstitutionReadQuery0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.accessToken("");
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery1.equals(organizationFinancialInstitutionReadQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      UUID uUID0 = MockUUID.randomUUID();
      organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.financialInstitutionId(uUID0);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery0.equals(organizationFinancialInstitutionReadQuery1);
      assertFalse(boolean0);
      assertFalse(organizationFinancialInstitutionReadQuery1.equals((Object)organizationFinancialInstitutionReadQuery0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      UUID uUID0 = MockUUID.randomUUID();
      organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.financialInstitutionId(uUID0);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery1.equals(organizationFinancialInstitutionReadQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery0.equals("0cWv@WdN6j");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = new OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery0.equals(organizationFinancialInstitutionReadQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = new OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      organizationFinancialInstitutionReadQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = new OrganizationFinancialInstitutionReadQuery(uUID0, "8pfg|p%1Sz*[", hashMap0);
      String string0 = hashMap0.remove((Object) organizationFinancialInstitutionReadQuery0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = new OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder();
      String string0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.toString();
      assertEquals("OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder(financialInstitutionId=null, accessToken=null, additionalHeaders$value=null)", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      UUID uUID0 = MockUUID.randomUUID();
      organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.financialInstitutionId(uUID0);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery1 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      boolean boolean0 = organizationFinancialInstitutionReadQuery0.equals(organizationFinancialInstitutionReadQuery1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = OrganizationFinancialInstitutionReadQuery.builder();
      organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.additionalHeaders((Map<String, String>) null);
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      organizationFinancialInstitutionReadQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0 = new OrganizationFinancialInstitutionReadQuery.OrganizationFinancialInstitutionReadQueryBuilder();
      OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery0 = organizationFinancialInstitutionReadQuery_OrganizationFinancialInstitutionReadQueryBuilder0.build();
      String string0 = organizationFinancialInstitutionReadQuery0.toString();
      assertEquals("OrganizationFinancialInstitutionReadQuery(financialInstitutionId=null, accessToken=null, additionalHeaders={})", string0);
  }
}
