/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 02:28:19 GMT 2022
 */

package com.github.lyhnx.bittrexapiwrapper.api.models;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.lyhnx.bittrexapiwrapper.api.models.Currency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Currency_ESTest extends Currency_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setTxFee(633.4235111903);
      double double0 = currency0.getTxFee();
      assertEquals(633.4235111903, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setNotice("");
      String string0 = currency0.getNotice();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setMinConfirmation((-1));
      int int0 = currency0.getMinConfirmation();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setCurrencyLong("W@/MiA1d50z0d");
      String string0 = currency0.getCurrencyLong();
      assertEquals("W@/MiA1d50z0d", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setCurrency("N{}DP]O'aqpQ!&;&Nh9");
      String string0 = currency0.getCurrency();
      assertEquals("N{}DP]O'aqpQ!&;&Nh9", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setCoinType("$bIVO0wC9");
      String string0 = currency0.getCoinType();
      assertEquals("$bIVO0wC9", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setCoinType("");
      String string0 = currency0.getCoinType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setBaseAddress("4|2*%pB?k.:VmB:|)9");
      String string0 = currency0.getBaseAddress();
      assertEquals("4|2*%pB?k.:VmB:|)9", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setBaseAddress("");
      String string0 = currency0.getBaseAddress();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Currency currency0 = new Currency();
      String string0 = currency0.getCurrency();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setTxFee((-1478));
      double double0 = currency0.getTxFee();
      assertEquals((-1478.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setCurrencyLong("");
      String string0 = currency0.getCurrencyLong();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setCurrency("");
      String string0 = currency0.getCurrency();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setNotice("Currency [currency=null, currencyLong=null, coinType=, baseAddress=null, notice=null, minConfirmation=-1478, txFee=-1478.0, active=false]");
      String string0 = currency0.getNotice();
      assertEquals("Currency [currency=null, currencyLong=null, coinType=, baseAddress=null, notice=null, minConfirmation=-1478, txFee=-1478.0, active=false]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Currency currency0 = new Currency();
      int int0 = currency0.getMinConfirmation();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Currency currency0 = new Currency();
      boolean boolean0 = currency0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Currency currency0 = new Currency();
      double double0 = currency0.getTxFee();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Currency currency0 = new Currency();
      String string0 = currency0.getCurrencyLong();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setActive(true);
      boolean boolean0 = currency0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Currency currency0 = new Currency();
      String string0 = currency0.getBaseAddress();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Currency currency0 = new Currency();
      String string0 = currency0.toString();
      assertEquals("Currency [currency=null, currencyLong=null, coinType=null, baseAddress=null, notice=null, minConfirmation=0, txFee=0.0, active=false]", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Currency currency0 = new Currency();
      String string0 = currency0.getCoinType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Currency currency0 = new Currency();
      String string0 = currency0.getNotice();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Currency currency0 = new Currency();
      currency0.setMinConfirmation(1);
      int int0 = currency0.getMinConfirmation();
      assertEquals(1, int0);
  }
}
