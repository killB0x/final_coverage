/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 10:39:17 GMT 2022
 */

package com.ibanity.apis.client.products.xs2a.sandbox.models;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibanity.apis.client.products.xs2a.sandbox.models.FinancialInstitutionTransaction;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FinancialInstitutionTransaction_ESTest extends FinancialInstitutionTransaction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-2163));
      Clock clock0 = MockClock.tickSeconds(zoneOffset0);
      Instant instant0 = MockInstant.now(clock0);
      financialInstitutionTransaction0.setUpdatedAt(instant0);
      Instant instant1 = financialInstitutionTransaction0.getUpdatedAt();
      assertSame(instant1, instant0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Random.setNextRandom((-3006));
      FinancialInstitutionTransaction.FinancialInstitutionTransactionBuilder<?, ?> financialInstitutionTransaction_FinancialInstitutionTransactionBuilder0 = FinancialInstitutionTransaction.builder();
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction(financialInstitutionTransaction_FinancialInstitutionTransactionBuilder0);
      UUID uUID0 = MockUUID.randomUUID();
      financialInstitutionTransaction0.setFinancialInstitutionAccountId(uUID0);
      UUID uUID1 = financialInstitutionTransaction0.getFinancialInstitutionAccountId();
      assertEquals("be0b0000-bf0b-4000-800b-0000c10b0000", uUID1.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      UUID uUID0 = MockUUID.fromString("{transactionId}");
      financialInstitutionTransaction0.setFinancialInstitutionAccountId(uUID0);
      UUID uUID1 = financialInstitutionTransaction0.getFinancialInstitutionAccountId();
      assertEquals((-9079256848728588288L), uUID1.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      Instant instant0 = MockInstant.ofEpochMilli((-3881L));
      financialInstitutionTransaction0.setCreatedAt(instant0);
      Instant instant1 = financialInstitutionTransaction0.getCreatedAt();
      assertSame(instant1, instant0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      boolean boolean0 = financialInstitutionTransaction0.canEqual(financialInstitutionTransaction0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      Object object0 = new Object();
      boolean boolean0 = financialInstitutionTransaction0.canEqual(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      UUID uUID0 = financialInstitutionTransaction0.getFinancialInstitutionAccountId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      Instant instant0 = financialInstitutionTransaction0.getUpdatedAt();
      assertNull(instant0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      Instant instant0 = financialInstitutionTransaction0.getCreatedAt();
      assertNull(instant0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      financialInstitutionTransaction0.setUpdatedAt(instant0);
      assertFalse(financialInstitutionTransaction0.equals((Object)financialInstitutionTransaction1));
      
      financialInstitutionTransaction1.setUpdatedAt(instant0);
      boolean boolean0 = financialInstitutionTransaction1.equals(financialInstitutionTransaction0);
      assertTrue(financialInstitutionTransaction0.equals((Object)financialInstitutionTransaction1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      assertTrue(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      
      financialInstitutionTransaction1.setUpdatedAt(instant0);
      boolean boolean0 = financialInstitutionTransaction0.equals(financialInstitutionTransaction1);
      assertFalse(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      assertTrue(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      
      financialInstitutionTransaction1.setUpdatedAt(instant0);
      boolean boolean0 = financialInstitutionTransaction1.equals(financialInstitutionTransaction0);
      assertFalse(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      financialInstitutionTransaction0.setCreatedAt(instant0);
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      assertFalse(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      
      financialInstitutionTransaction1.setCreatedAt(instant0);
      boolean boolean0 = financialInstitutionTransaction0.equals(financialInstitutionTransaction1);
      assertTrue(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      Instant instant0 = MockInstant.now();
      financialInstitutionTransaction0.setCreatedAt(instant0);
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      boolean boolean0 = financialInstitutionTransaction1.equals(financialInstitutionTransaction0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      Instant instant0 = MockInstant.now();
      financialInstitutionTransaction0.setCreatedAt(instant0);
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      boolean boolean0 = financialInstitutionTransaction0.equals(financialInstitutionTransaction1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      UUID uUID0 = MockUUID.fromString("{transactionId}");
      financialInstitutionTransaction0.setFinancialInstitutionAccountId(uUID0);
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      assertFalse(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      
      financialInstitutionTransaction1.setFinancialInstitutionAccountId(uUID0);
      boolean boolean0 = financialInstitutionTransaction0.equals(financialInstitutionTransaction1);
      assertTrue(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      UUID uUID0 = MockUUID.fromString("{transactionId}");
      financialInstitutionTransaction0.setFinancialInstitutionAccountId(uUID0);
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      boolean boolean0 = financialInstitutionTransaction1.equals(financialInstitutionTransaction0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      UUID uUID0 = MockUUID.fromString("{transactionId}");
      financialInstitutionTransaction0.setFinancialInstitutionAccountId(uUID0);
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      boolean boolean0 = financialInstitutionTransaction0.equals(financialInstitutionTransaction1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      FinancialInstitutionTransaction financialInstitutionTransaction1 = new FinancialInstitutionTransaction();
      assertTrue(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      
      financialInstitutionTransaction1.setCardReference("financial-institution-transactions");
      boolean boolean0 = financialInstitutionTransaction0.equals(financialInstitutionTransaction1);
      assertFalse(financialInstitutionTransaction1.equals((Object)financialInstitutionTransaction0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      boolean boolean0 = financialInstitutionTransaction0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      boolean boolean0 = financialInstitutionTransaction0.equals(financialInstitutionTransaction0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-2163));
      Clock clock0 = MockClock.tickSeconds(zoneOffset0);
      Instant instant0 = MockInstant.now(clock0);
      financialInstitutionTransaction0.setUpdatedAt(instant0);
      financialInstitutionTransaction0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      UUID uUID0 = MockUUID.fromString("{transactionId}");
      financialInstitutionTransaction0.setFinancialInstitutionAccountId(uUID0);
      financialInstitutionTransaction0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      String string0 = financialInstitutionTransaction0.toString();
      assertEquals("FinancialInstitutionTransaction(super=Transaction(id=null, selfLink=null, requestId=null, amount=null, currency=null, valueDate=null, executionDate=null, description=null, remittanceInformationType=null, remittanceInformation=null, counterpartName=null, counterpartReference=null, bankTransactionCode=null, proprietaryBankTransactionCode=null, endToEndId=null, purposeCode=null, mandateId=null, creditorId=null, additionalInformation=null, digest=null, internalReference=null, fee=null, cardReference=null, cardReferenceType=null), financialInstitutionAccountId=null, createdAt=null, updatedAt=null)", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FinancialInstitutionTransaction financialInstitutionTransaction0 = new FinancialInstitutionTransaction();
      Instant instant0 = MockInstant.now();
      financialInstitutionTransaction0.setCreatedAt(instant0);
      financialInstitutionTransaction0.hashCode();
  }
}
