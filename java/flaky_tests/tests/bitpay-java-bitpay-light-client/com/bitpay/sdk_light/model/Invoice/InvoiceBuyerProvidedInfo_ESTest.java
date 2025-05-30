/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 16:05:02 GMT 2022
 */

package com.bitpay.sdk_light.model.Invoice;

import org.junit.Test;
import static org.junit.Assert.*;
import com.bitpay.sdk_light.model.Invoice.InvoiceBuyerProvidedInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InvoiceBuyerProvidedInfo_ESTest extends InvoiceBuyerProvidedInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setSelectedWallet("");
      String string0 = invoiceBuyerProvidedInfo0.getSelectedWallet();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setSelectedTransactionCurrency("cd6m");
      String string0 = invoiceBuyerProvidedInfo0.getSelectedTransactionCurrency();
      assertEquals("cd6m", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setPhoneNumber("*kbqkg0TDEp5}");
      String string0 = invoiceBuyerProvidedInfo0.getPhoneNumber();
      assertEquals("*kbqkg0TDEp5}", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setName("XFzb0/d");
      String string0 = invoiceBuyerProvidedInfo0.getName();
      assertEquals("XFzb0/d", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setName("");
      String string0 = invoiceBuyerProvidedInfo0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setEmailAddress("");
      String string0 = invoiceBuyerProvidedInfo0.getEmailAddress();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      String string0 = invoiceBuyerProvidedInfo0.getEmailAddress();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setEmailAddress("A|9sS");
      String string0 = invoiceBuyerProvidedInfo0.getEmailAddress();
      assertEquals("A|9sS", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      String string0 = invoiceBuyerProvidedInfo0.getSelectedWallet();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setSelectedWallet("A|9sS");
      String string0 = invoiceBuyerProvidedInfo0.getSelectedWallet();
      assertEquals("A|9sS", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setSelectedTransactionCurrency("");
      String string0 = invoiceBuyerProvidedInfo0.getSelectedTransactionCurrency();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      String string0 = invoiceBuyerProvidedInfo0.getSelectedTransactionCurrency();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      String string0 = invoiceBuyerProvidedInfo0.getPhoneNumber();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      String string0 = invoiceBuyerProvidedInfo0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new InvoiceBuyerProvidedInfo();
      invoiceBuyerProvidedInfo0.setPhoneNumber("");
      String string0 = invoiceBuyerProvidedInfo0.getPhoneNumber();
      assertEquals("", string0);
  }
}
