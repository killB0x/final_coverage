/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:41:06 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.future.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.future.model.FutureTradingDateModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FutureTradingDateModel_ESTest extends FutureTradingDateModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Long long0 = new Long(0L);
      FutureTradingDateModel futureTradingDateModel0 = new FutureTradingDateModel("7tl.zGxS(oc3*:x9z", long0);
      Long long1 = new Long(600L);
      futureTradingDateModel0.setTradingDate(long1);
      Long long2 = futureTradingDateModel0.getTradingDate();
      assertFalse(long2.equals((Object)long0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Long long0 = new Long((-3984L));
      FutureTradingDateModel futureTradingDateModel0 = new FutureTradingDateModel("", long0);
      Long long1 = futureTradingDateModel0.getTradingDate();
      assertEquals((-3984L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Long long0 = new Long((-3984L));
      FutureTradingDateModel futureTradingDateModel0 = new FutureTradingDateModel("", long0);
      futureTradingDateModel0.setContractCode("com.tigerbrokers.stock.openapi.client.https.domain.ApiModel");
      String string0 = futureTradingDateModel0.getContractCode();
      assertEquals("com.tigerbrokers.stock.openapi.client.https.domain.ApiModel", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Long long0 = new Long((-3984L));
      FutureTradingDateModel futureTradingDateModel0 = new FutureTradingDateModel("", long0);
      String string0 = futureTradingDateModel0.getContractCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FutureTradingDateModel futureTradingDateModel0 = new FutureTradingDateModel("b3");
      Long long0 = new Long(0L);
      futureTradingDateModel0.setTradingDate(long0);
      Long long1 = futureTradingDateModel0.getTradingDate();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FutureTradingDateModel futureTradingDateModel0 = new FutureTradingDateModel();
      String string0 = futureTradingDateModel0.getContractCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FutureTradingDateModel futureTradingDateModel0 = new FutureTradingDateModel();
      Long long0 = futureTradingDateModel0.getTradingDate();
      assertNull(long0);
  }
}
