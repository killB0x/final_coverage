/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 06:28:40 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.struct.enums;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.struct.enums.FinancialReportField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FinancialReportField_ESTest extends FinancialReportField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FinancialReportField[] financialReportFieldArray0 = FinancialReportField.values();
      assertEquals(490, financialReportFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.valueOf("investmentIncome");
      assertEquals(FinancialReportField.investmentIncome, financialReportField0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.valueOf("amortOfGoodwillAndIntangiblesCf");
      assertEquals(2182L, financialReportField0.getDataItemId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.otherUnusualItemsTotal;
      int int0 = financialReportField0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.dilutedEpsBeforeExtra5YrCagr;
      int int0 = financialReportField0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.shortTermDebtIssued;
      String string0 = financialReportField0.getField();
      assertEquals("short_term_debt_issued", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.cashPerShare;
      long long0 = financialReportField0.getDataItemId();
      assertEquals(4381L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.leveredFreeCashFlow5YrCagr;
      long long0 = financialReportField0.getDataItemId();
      assertEquals(4427L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.totalRedeemableMinorityInterest;
      int int0 = financialReportField0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.valueOf("tangibleBookValue");
      financialReportField0.setField("tangibleBookValue");
      assertEquals("tangibleBookValue", financialReportField0.getField());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.valueOf("dilutedEpsExclExtraItems");
      financialReportField0.setDataItemId(1178);
      assertEquals(1178L, financialReportField0.getDataItemId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.currIncomeTaxesPayable;
      long long0 = financialReportField0.getDataItemId();
      assertEquals(1094L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.valueOf("dilutedEpsExclExtraItems");
      financialReportField0.setType(851);
      assertEquals(851, financialReportField0.getType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FinancialReportField financialReportField0 = FinancialReportField.changeInAccPayable;
      String string0 = financialReportField0.getField();
      assertEquals("change_in_acc_payable", string0);
  }
}
