/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 10:29:57 GMT 2022
 */

package com.ibanity.apis.client.products.ponto_connect.models.delete;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibanity.apis.client.products.ponto_connect.models.delete.PaymentDeleteQuery;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PaymentDeleteQuery_ESTest extends PaymentDeleteQuery_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Random.setNextRandom((-1958));
      UUID uUID0 = MockUUID.randomUUID();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("com.ibanity.apis.client.products.ponto_connect.models.delete.PaymentDeleteQuery$PaymentDeleteQueryBuilder", uUID0, uUID0, hashMap0);
      UUID uUID1 = paymentDeleteQuery0.getPaymentId();
      assertEquals("a6070000-a707-4000-a807-0000a9070000", uUID1.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("com.ibanity.apis.client.products.ponto_connect.models.delete.PaymentDeleteQuery");
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("", uUID0, uUID0, (Map<String, String>) null);
      UUID uUID1 = paymentDeleteQuery0.getPaymentId();
      assertEquals((-9079256848728588288L), uUID1.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("", uUID0, uUID0, hashMap0);
      Map<String, String> map0 = paymentDeleteQuery0.getAdditionalHeaders();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("nV10S0qYr0I7!", uUID0, uUID0, hashMap0);
      hashMap0.put("", "");
      Map<String, String> map0 = paymentDeleteQuery0.getAdditionalHeaders();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Random.setNextRandom((-1958));
      UUID uUID0 = MockUUID.randomUUID();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("com.ibanity.apis.client.products.ponto_connect.models.delete.PaymentDeleteQuery$PaymentDeleteQueryBuilder", uUID0, uUID0, hashMap0);
      UUID uUID1 = paymentDeleteQuery0.getAccountId();
      assertEquals((-6339097947664875520L), uUID1.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      UUID uUID0 = MockUUID.fromString("PaymentDeleteQuery(accessToken=");
      paymentDeleteQuery_PaymentDeleteQueryBuilder0.accountId(uUID0);
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      UUID uUID1 = paymentDeleteQuery0.getAccountId();
      assertSame(uUID1, uUID0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.accessToken("?$");
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder1.build();
      String string0 = paymentDeleteQuery0.getAccessToken();
      assertEquals("?$", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("com.ibanity.apis.client.products.ponto_connect.models.delete.PaymentDeleteQuery");
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("", uUID0, uUID0, (Map<String, String>) null);
      String string0 = paymentDeleteQuery0.getAccessToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = new PaymentDeleteQuery.PaymentDeleteQueryBuilder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      boolean boolean0 = paymentDeleteQuery0.canEqual(paymentDeleteQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      boolean boolean0 = paymentDeleteQuery0.canEqual("PaymentDeleteQuery(accessToken=PaymentDeleteQuery(accessToken=, accountId=null, paymentId=null, additionalHeaders={})");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      UUID uUID0 = paymentDeleteQuery0.getAccountId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      UUID uUID0 = paymentDeleteQuery0.getPaymentId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = new PaymentDeleteQuery.PaymentDeleteQueryBuilder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      String string0 = paymentDeleteQuery0.getAccessToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("ZE1SXlSN9#", uUID0, uUID0, (Map<String, String>) null);
      Map<String, String> map0 = paymentDeleteQuery0.getAdditionalHeaders();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = new PaymentDeleteQuery.PaymentDeleteQueryBuilder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      paymentDeleteQuery_PaymentDeleteQueryBuilder0.additionalHeaders((Map<String, String>) null);
      PaymentDeleteQuery paymentDeleteQuery1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      boolean boolean0 = paymentDeleteQuery0.equals(paymentDeleteQuery1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      paymentDeleteQuery_PaymentDeleteQueryBuilder0.additionalHeaders((Map<String, String>) null);
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder1 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery paymentDeleteQuery1 = paymentDeleteQuery_PaymentDeleteQueryBuilder1.build();
      boolean boolean0 = paymentDeleteQuery0.equals(paymentDeleteQuery1);
      assertFalse(paymentDeleteQuery1.equals((Object)paymentDeleteQuery0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = new PaymentDeleteQuery.PaymentDeleteQueryBuilder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      UUID uUID0 = MockUUID.randomUUID();
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.paymentId(uUID0);
      PaymentDeleteQuery paymentDeleteQuery1 = paymentDeleteQuery_PaymentDeleteQueryBuilder1.build();
      boolean boolean0 = paymentDeleteQuery1.equals(paymentDeleteQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      UUID uUID0 = MockUUID.randomUUID();
      paymentDeleteQuery_PaymentDeleteQueryBuilder0.paymentId(uUID0);
      PaymentDeleteQuery paymentDeleteQuery1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      boolean boolean0 = paymentDeleteQuery0.equals(paymentDeleteQuery1);
      assertFalse(boolean0);
      assertFalse(paymentDeleteQuery1.equals((Object)paymentDeleteQuery0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      UUID uUID0 = MockUUID.randomUUID();
      paymentDeleteQuery_PaymentDeleteQueryBuilder0.accountId(uUID0);
      PaymentDeleteQuery paymentDeleteQuery1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      boolean boolean0 = paymentDeleteQuery1.equals(paymentDeleteQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      UUID uUID0 = MockUUID.randomUUID();
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.accountId(uUID0);
      PaymentDeleteQuery paymentDeleteQuery1 = paymentDeleteQuery_PaymentDeleteQueryBuilder1.build();
      boolean boolean0 = paymentDeleteQuery0.equals(paymentDeleteQuery1);
      assertFalse(boolean0);
      assertFalse(paymentDeleteQuery1.equals((Object)paymentDeleteQuery0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery(", accountId=", uUID0, uUID0, (Map<String, String>) null);
      PaymentDeleteQuery paymentDeleteQuery1 = new PaymentDeleteQuery(", accountId=", uUID0, uUID0, (Map<String, String>) null);
      boolean boolean0 = paymentDeleteQuery0.equals(paymentDeleteQuery1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      paymentDeleteQuery_PaymentDeleteQueryBuilder0.accessToken("");
      PaymentDeleteQuery paymentDeleteQuery1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      boolean boolean0 = paymentDeleteQuery0.equals(paymentDeleteQuery1);
      assertFalse(boolean0);
      assertFalse(paymentDeleteQuery1.equals((Object)paymentDeleteQuery0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("ZE1SXlSN9#", uUID0, uUID0, (Map<String, String>) null);
      PaymentDeleteQuery paymentDeleteQuery1 = new PaymentDeleteQuery(", accountId=", uUID0, uUID0, (Map<String, String>) null);
      boolean boolean0 = paymentDeleteQuery1.equals(paymentDeleteQuery0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("ZE1SXlSN9#", uUID0, uUID0, (Map<String, String>) null);
      Object object0 = new Object();
      boolean boolean0 = paymentDeleteQuery0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      boolean boolean0 = paymentDeleteQuery0.equals(paymentDeleteQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = new PaymentDeleteQuery.PaymentDeleteQueryBuilder();
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.additionalHeaders((Map<String, String>) null);
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder1.build();
      paymentDeleteQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      UUID uUID0 = MockUUID.fromString("PaymentDeleteQuery(accessToken=");
      paymentDeleteQuery_PaymentDeleteQueryBuilder0.paymentId(uUID0);
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      paymentDeleteQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      UUID uUID0 = MockUUID.fromString("PaymentDeleteQuery(accessToken=");
      paymentDeleteQuery_PaymentDeleteQueryBuilder0.accountId(uUID0);
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      paymentDeleteQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = new PaymentDeleteQuery.PaymentDeleteQueryBuilder();
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.accessToken("");
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder1.build();
      paymentDeleteQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = PaymentDeleteQuery.builder();
      String string0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.toString();
      assertEquals("PaymentDeleteQuery.PaymentDeleteQueryBuilder(accessToken=null, accountId=null, paymentId=null, additionalHeaders$value=null)", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PaymentDeleteQuery.PaymentDeleteQueryBuilder paymentDeleteQuery_PaymentDeleteQueryBuilder0 = new PaymentDeleteQuery.PaymentDeleteQueryBuilder();
      UUID uUID0 = MockUUID.randomUUID();
      paymentDeleteQuery_PaymentDeleteQueryBuilder0.paymentId(uUID0);
      PaymentDeleteQuery paymentDeleteQuery0 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      PaymentDeleteQuery paymentDeleteQuery1 = paymentDeleteQuery_PaymentDeleteQueryBuilder0.build();
      boolean boolean0 = paymentDeleteQuery0.equals(paymentDeleteQuery1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      PaymentDeleteQuery paymentDeleteQuery0 = new PaymentDeleteQuery("ZE1SXlSN9#", uUID0, uUID0, (Map<String, String>) null);
      String string0 = paymentDeleteQuery0.toString();
      assertEquals("PaymentDeleteQuery(accessToken=ZE1SXlSN9#, accountId=00000000-0100-4000-8200-000003000000, paymentId=00000000-0100-4000-8200-000003000000, additionalHeaders=null)", string0);
  }
}
