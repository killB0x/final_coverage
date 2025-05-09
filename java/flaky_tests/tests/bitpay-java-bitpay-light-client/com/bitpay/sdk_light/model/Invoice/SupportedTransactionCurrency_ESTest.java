/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 16:04:20 GMT 2022
 */

package com.bitpay.sdk_light.model.Invoice;

import org.junit.Test;
import static org.junit.Assert.*;
import com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SupportedTransactionCurrency_ESTest extends SupportedTransactionCurrency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportedTransactionCurrency supportedTransactionCurrency0 = new SupportedTransactionCurrency();
      supportedTransactionCurrency0.setReason("5({h4]S?'Ga");
      String string0 = supportedTransactionCurrency0.getReason();
      assertEquals("5({h4]S?'Ga", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportedTransactionCurrency supportedTransactionCurrency0 = new SupportedTransactionCurrency();
      supportedTransactionCurrency0.setEnabled(true);
      boolean boolean0 = supportedTransactionCurrency0.getEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportedTransactionCurrency supportedTransactionCurrency0 = new SupportedTransactionCurrency();
      String string0 = supportedTransactionCurrency0.getReason();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportedTransactionCurrency supportedTransactionCurrency0 = new SupportedTransactionCurrency();
      boolean boolean0 = supportedTransactionCurrency0.getEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportedTransactionCurrency supportedTransactionCurrency0 = new SupportedTransactionCurrency();
      supportedTransactionCurrency0.setReason("");
      String string0 = supportedTransactionCurrency0.getReason();
      assertEquals("", string0);
  }
}
