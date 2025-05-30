/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:59:21 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.response.quote;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.quote.item.RealTimeQuoteItem;
import com.tigerbrokers.stock.openapi.client.https.response.quote.QuoteRealTimeQuoteResponse;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuoteRealTimeQuoteResponse_ESTest extends QuoteRealTimeQuoteResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuoteRealTimeQuoteResponse quoteRealTimeQuoteResponse0 = new QuoteRealTimeQuoteResponse();
      LinkedList<RealTimeQuoteItem> linkedList0 = new LinkedList<RealTimeQuoteItem>();
      quoteRealTimeQuoteResponse0.setRealTimeQuoteItems(linkedList0);
      List<RealTimeQuoteItem> list0 = quoteRealTimeQuoteResponse0.getRealTimeQuoteItems();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuoteRealTimeQuoteResponse quoteRealTimeQuoteResponse0 = new QuoteRealTimeQuoteResponse();
      LinkedList<RealTimeQuoteItem> linkedList0 = new LinkedList<RealTimeQuoteItem>();
      RealTimeQuoteItem realTimeQuoteItem0 = new RealTimeQuoteItem();
      linkedList0.add(realTimeQuoteItem0);
      quoteRealTimeQuoteResponse0.setRealTimeQuoteItems(linkedList0);
      List<RealTimeQuoteItem> list0 = quoteRealTimeQuoteResponse0.getRealTimeQuoteItems();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuoteRealTimeQuoteResponse quoteRealTimeQuoteResponse0 = new QuoteRealTimeQuoteResponse();
      List<RealTimeQuoteItem> list0 = quoteRealTimeQuoteResponse0.getRealTimeQuoteItems();
      assertNull(list0);
  }
}
