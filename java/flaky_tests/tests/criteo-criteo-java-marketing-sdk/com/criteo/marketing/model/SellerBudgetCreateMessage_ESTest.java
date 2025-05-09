/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:19:58 GMT 2022
 */

package com.criteo.marketing.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.criteo.marketing.model.SellerBudgetCreateMessage;
import java.time.OffsetDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockOffsetDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SellerBudgetCreateMessage_ESTest extends SellerBudgetCreateMessage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      sellerBudgetCreateMessage0.setSellerName("fXaI?h87!U");
      String string0 = sellerBudgetCreateMessage0.getSellerName();
      assertEquals("fXaI?h87!U", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      sellerBudgetCreateMessage0.setSellerName("");
      String string0 = sellerBudgetCreateMessage0.getSellerName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      sellerBudgetCreateMessage0.endDate(offsetDateTime0);
      OffsetDateTime offsetDateTime1 = sellerBudgetCreateMessage0.getEndDate();
      assertSame(offsetDateTime1, offsetDateTime0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      Double double0 = new Double(0.0);
      SellerBudgetCreateMessage sellerBudgetCreateMessage1 = sellerBudgetCreateMessage0.amount(double0);
      Double double1 = sellerBudgetCreateMessage1.getAmount();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      Double double0 = new Double(2896.8974288936);
      SellerBudgetCreateMessage sellerBudgetCreateMessage1 = sellerBudgetCreateMessage0.amount(double0);
      Double double1 = sellerBudgetCreateMessage1.getAmount();
      assertEquals(2896.8974288936, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      Double double0 = new Double((-259.505));
      SellerBudgetCreateMessage sellerBudgetCreateMessage1 = sellerBudgetCreateMessage0.amount(double0);
      Double double1 = sellerBudgetCreateMessage1.getAmount();
      assertEquals((-259.505), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      SellerBudgetCreateMessage sellerBudgetCreateMessage1 = sellerBudgetCreateMessage0.endDate(offsetDateTime0);
      String string0 = sellerBudgetCreateMessage1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      SellerBudgetCreateMessage sellerBudgetCreateMessage1 = new SellerBudgetCreateMessage();
      assertTrue(sellerBudgetCreateMessage1.equals((Object)sellerBudgetCreateMessage0));
      
      Double double0 = new Double((-1481));
      SellerBudgetCreateMessage sellerBudgetCreateMessage2 = sellerBudgetCreateMessage1.amount(double0);
      boolean boolean0 = sellerBudgetCreateMessage0.equals(sellerBudgetCreateMessage2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      sellerBudgetCreateMessage0.setSellerName("fXaI?h87!U");
      SellerBudgetCreateMessage sellerBudgetCreateMessage1 = new SellerBudgetCreateMessage();
      boolean boolean0 = sellerBudgetCreateMessage0.equals(sellerBudgetCreateMessage1);
      assertFalse(boolean0);
      assertEquals("fXaI?h87!U", sellerBudgetCreateMessage0.getSellerName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      SellerBudgetCreateMessage sellerBudgetCreateMessage1 = new SellerBudgetCreateMessage();
      boolean boolean0 = sellerBudgetCreateMessage0.equals(sellerBudgetCreateMessage1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      boolean boolean0 = sellerBudgetCreateMessage0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      boolean boolean0 = sellerBudgetCreateMessage0.equals(sellerBudgetCreateMessage0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      Object object0 = new Object();
      boolean boolean0 = sellerBudgetCreateMessage0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      OffsetDateTime offsetDateTime0 = sellerBudgetCreateMessage0.getEndDate();
      assertNull(offsetDateTime0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      SellerBudgetCreateMessage sellerBudgetCreateMessage1 = sellerBudgetCreateMessage0.sellerName("amount");
      assertEquals("amount", sellerBudgetCreateMessage1.getSellerName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      String string0 = sellerBudgetCreateMessage0.getSellerName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      sellerBudgetCreateMessage0.endDate(offsetDateTime0);
      SellerBudgetCreateMessage sellerBudgetCreateMessage1 = new SellerBudgetCreateMessage();
      boolean boolean0 = sellerBudgetCreateMessage0.equals(sellerBudgetCreateMessage1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      sellerBudgetCreateMessage0.hashCode();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      sellerBudgetCreateMessage0.setEndDate((OffsetDateTime) null);
      assertNull(sellerBudgetCreateMessage0.getAmount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      sellerBudgetCreateMessage0.setAmount((Double) null);
      assertNull(sellerBudgetCreateMessage0.getAmount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SellerBudgetCreateMessage sellerBudgetCreateMessage0 = new SellerBudgetCreateMessage();
      Double double0 = sellerBudgetCreateMessage0.getAmount();
      assertNull(double0);
  }
}
