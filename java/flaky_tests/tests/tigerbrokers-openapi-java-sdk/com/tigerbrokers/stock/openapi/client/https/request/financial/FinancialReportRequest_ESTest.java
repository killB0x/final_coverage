/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:18:46 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.request.financial;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.request.financial.FinancialReportRequest;
import com.tigerbrokers.stock.openapi.client.struct.enums.FinancialPeriodType;
import com.tigerbrokers.stock.openapi.client.struct.enums.Market;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FinancialReportRequest_ESTest extends FinancialReportRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FinancialPeriodType financialPeriodType0 = FinancialPeriodType.Quarterly;
      LinkedList<String> linkedList1 = new LinkedList<String>();
      FinancialReportRequest financialReportRequest0 = FinancialReportRequest.newRequest((List<String>) linkedList0, (List<String>) linkedList1, financialPeriodType0);
      assertEquals("2.0", financialReportRequest0.getApiVersion());
      assertEquals("financial_report", financialReportRequest0.getApiMethodName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      FinancialReportRequest financialReportRequest0 = FinancialReportRequest.newRequest((List<String>) linkedList1, (List<String>) linkedList0);
      assertEquals("financial_report", financialReportRequest0.getApiMethodName());
      assertEquals("2.0", financialReportRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Market market0 = Market.CN;
      FinancialPeriodType financialPeriodType0 = FinancialPeriodType.Quarterly;
      FinancialReportRequest financialReportRequest0 = FinancialReportRequest.newRequest((List<String>) linkedList0, market0, (List<String>) linkedList0, financialPeriodType0);
      assertEquals("2.0", financialReportRequest0.getApiVersion());
      assertEquals("financial_report", financialReportRequest0.getApiMethodName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FinancialReportRequest financialReportRequest0 = new FinancialReportRequest();
      financialReportRequest0.getResponseClass();
      assertEquals("financial_report", financialReportRequest0.getApiMethodName());
      assertEquals("2.0", financialReportRequest0.getApiVersion());
  }
}
