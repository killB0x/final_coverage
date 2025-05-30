/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 06:24:26 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.request.quote;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.request.quote.QuoteContractRequest;
import com.tigerbrokers.stock.openapi.client.struct.enums.Language;
import com.tigerbrokers.stock.openapi.client.struct.enums.SecType;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuoteContractRequest_ESTest extends QuoteContractRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SecType secType0 = SecType.WAR;
      QuoteContractRequest quoteContractRequest0 = QuoteContractRequest.newRequest((List<String>) null, secType0);
      assertEquals("2.0", quoteContractRequest0.getApiVersion());
      assertEquals("quote_contract", quoteContractRequest0.getApiMethodName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SecType secType0 = SecType.WAR;
      Language language0 = Language.en_US;
      QuoteContractRequest quoteContractRequest0 = QuoteContractRequest.newRequest((List<String>) null, secType0, language0);
      assertEquals("quote_contract", quoteContractRequest0.getApiMethodName());
      assertEquals("2.0", quoteContractRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuoteContractRequest quoteContractRequest0 = new QuoteContractRequest();
      quoteContractRequest0.getResponseClass();
      assertEquals("quote_contract", quoteContractRequest0.getApiMethodName());
      assertEquals("2.0", quoteContractRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SecType secType0 = SecType.WAR;
      QuoteContractRequest quoteContractRequest0 = QuoteContractRequest.newRequest((List<String>) null, secType0, "2.0");
      assertEquals("2.0", quoteContractRequest0.getApiVersion());
      assertEquals("quote_contract", quoteContractRequest0.getApiMethodName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuoteContractRequest quoteContractRequest0 = QuoteContractRequest.newRequest((List<String>) null);
      assertEquals("quote_contract", quoteContractRequest0.getApiMethodName());
      assertEquals("2.0", quoteContractRequest0.getApiVersion());
  }
}
