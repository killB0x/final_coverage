/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:31:22 GMT 2022
 */

package com.criteo.marketing.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.criteo.marketing.model.SellerBidInfoMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SellerBidInfoMessage_ESTest extends SellerBidInfoMessage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      SellerBidInfoMessage sellerBidInfoMessage1 = sellerBidInfoMessage0.sellerName("tS2Q?gw8a");
      String string0 = sellerBidInfoMessage1.getSellerName();
      assertEquals("tS2Q?gw8a", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      Double double0 = new Double(0.0);
      SellerBidInfoMessage sellerBidInfoMessage1 = sellerBidInfoMessage0.bid(double0);
      Double double1 = sellerBidInfoMessage1.getBid();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      Double double0 = new Double(898.203162476);
      sellerBidInfoMessage0.bid(double0);
      Double double1 = sellerBidInfoMessage0.getBid();
      assertEquals(898.203162476, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      Double double0 = new Double((-5.3901322034));
      SellerBidInfoMessage sellerBidInfoMessage1 = sellerBidInfoMessage0.bid(double0);
      Double double1 = sellerBidInfoMessage1.getBid();
      assertEquals((-5.3901322034), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      SellerBidInfoMessage sellerBidInfoMessage1 = new SellerBidInfoMessage();
      assertTrue(sellerBidInfoMessage1.equals((Object)sellerBidInfoMessage0));
      
      sellerBidInfoMessage0.setSellerName("sellerName");
      boolean boolean0 = sellerBidInfoMessage0.equals(sellerBidInfoMessage1);
      assertFalse(sellerBidInfoMessage1.equals((Object)sellerBidInfoMessage0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      SellerBidInfoMessage sellerBidInfoMessage1 = new SellerBidInfoMessage();
      boolean boolean0 = sellerBidInfoMessage1.equals(sellerBidInfoMessage0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      boolean boolean0 = sellerBidInfoMessage0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      boolean boolean0 = sellerBidInfoMessage0.equals(sellerBidInfoMessage0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      Object object0 = new Object();
      boolean boolean0 = sellerBidInfoMessage0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      Double double0 = new Double(0.0);
      SellerBidInfoMessage sellerBidInfoMessage1 = sellerBidInfoMessage0.bid(double0);
      String string0 = sellerBidInfoMessage1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      sellerBidInfoMessage0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      Double double0 = new Double(0.0);
      sellerBidInfoMessage0.setBid(double0);
      SellerBidInfoMessage sellerBidInfoMessage1 = new SellerBidInfoMessage();
      sellerBidInfoMessage0.setSellerName("sellerName");
      sellerBidInfoMessage1.setSellerName("sellerName");
      boolean boolean0 = sellerBidInfoMessage1.equals(sellerBidInfoMessage0);
      assertFalse(boolean0);
      assertEquals("sellerName", sellerBidInfoMessage1.getSellerName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      sellerBidInfoMessage0.setSellerName("");
      String string0 = sellerBidInfoMessage0.getSellerName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      Double double0 = sellerBidInfoMessage0.getBid();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SellerBidInfoMessage sellerBidInfoMessage0 = new SellerBidInfoMessage();
      String string0 = sellerBidInfoMessage0.getSellerName();
      assertNull(string0);
  }
}
