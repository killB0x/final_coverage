/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 06:19:33 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.request.quote;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.request.quote.QuoteMarketRequest;
import com.tigerbrokers.stock.openapi.client.struct.enums.Language;
import com.tigerbrokers.stock.openapi.client.struct.enums.Market;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuoteMarketRequest_ESTest extends QuoteMarketRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Market market0 = Market.CN;
      Language language0 = Language.zh_TW;
      QuoteMarketRequest quoteMarketRequest0 = QuoteMarketRequest.newRequest(market0, language0);
      assertEquals("2.0", quoteMarketRequest0.getApiVersion());
      assertEquals("market_state", quoteMarketRequest0.getApiMethodName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Market market0 = Market.CN;
      QuoteMarketRequest quoteMarketRequest0 = QuoteMarketRequest.newRequest(market0);
      assertEquals("market_state", quoteMarketRequest0.getApiMethodName());
      assertEquals("2.0", quoteMarketRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuoteMarketRequest quoteMarketRequest0 = new QuoteMarketRequest();
      quoteMarketRequest0.getResponseClass();
      assertEquals("market_state", quoteMarketRequest0.getApiMethodName());
      assertEquals("2.0", quoteMarketRequest0.getApiVersion());
  }
}
