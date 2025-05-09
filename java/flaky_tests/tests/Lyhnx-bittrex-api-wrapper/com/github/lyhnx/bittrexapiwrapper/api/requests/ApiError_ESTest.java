/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 02:24:54 GMT 2022
 */

package com.github.lyhnx.bittrexapiwrapper.api.requests;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.lyhnx.bittrexapiwrapper.api.requests.ApiError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApiError_ESTest extends ApiError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApiError apiError0 = ApiError.byName("invalid_currency");
      assertEquals(ApiError.INVALID_CURRENCY, apiError0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ApiError[] apiErrorArray0 = ApiError.values();
      assertEquals(12, apiErrorArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ApiError apiError0 = ApiError.valueOf("INSUFFICIENT_FUNDS");
      assertEquals(ApiError.INSUFFICIENT_FUNDS, apiError0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ApiError apiError0 = ApiError.INSUFFICIENT_FUNDS;
      String string0 = apiError0.getName();
      assertEquals("INSUFFICIENT_FUNDS", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ApiError apiError0 = ApiError.byName("INSUFFICIENT_FUNDS");
      assertEquals(ApiError.INSUFFICIENT_FUNDS, apiError0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ApiError apiError0 = ApiError.INSUFFICIENT_FUNDS;
      String string0 = apiError0.getDescription();
      assertEquals("Your funds are insufficient", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ApiError apiError0 = ApiError.byName("");
      assertEquals(ApiError.DEFAULT, apiError0);
  }
}
