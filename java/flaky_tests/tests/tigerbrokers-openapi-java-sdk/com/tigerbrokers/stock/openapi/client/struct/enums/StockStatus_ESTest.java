/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:19:43 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.struct.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.struct.enums.StockStatus;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StockStatus_ESTest extends StockStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StockStatus[] stockStatusArray0 = StockStatus.values();
      assertEquals(6, stockStatusArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StockStatus stockStatus0 = StockStatus.valueOf("NORMAL");
      Double double0 = stockStatus0.getValue();
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StockStatus stockStatus0 = StockStatus.UNKNOWN;
      Double double0 = stockStatus0.getValue();
      assertEquals((-1.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StockStatus stockStatus0 = StockStatus.valueOf("NORMAL");
      String string0 = stockStatus0.getDesc();
      assertEquals("\u6B63\u5E38", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StockStatus stockStatus0 = StockStatus.NEW;
      Double double0 = stockStatus0.getValue();
      assertEquals(7.0, (double)double0, 0.01);
  }
}
