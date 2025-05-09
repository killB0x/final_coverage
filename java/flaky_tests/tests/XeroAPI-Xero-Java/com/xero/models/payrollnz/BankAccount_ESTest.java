/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 13:25:46 GMT 2022
 */

package com.xero.models.payrollnz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.payrollnz.BankAccount;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BankAccount_ESTest extends BankAccount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BankAccount.CalculationTypeEnum bankAccount_CalculationTypeEnum0 = BankAccount.CalculationTypeEnum.fromValue("Balance");
      assertEquals(BankAccount.CalculationTypeEnum.BALANCE, bankAccount_CalculationTypeEnum0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BankAccount.CalculationTypeEnum bankAccount_CalculationTypeEnum0 = BankAccount.CalculationTypeEnum.fromValue("FixedAmount");
      assertEquals(BankAccount.CalculationTypeEnum.FIXEDAMOUNT, bankAccount_CalculationTypeEnum0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        BankAccount.CalculationTypeEnum.fromValue("GY)5Be+Q]0i6PKK30e1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'GY)5Be+Q]0i6PKK30e1'
         //
         verifyException("com.xero.models.payrollnz.BankAccount$CalculationTypeEnum", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BankAccount bankAccount0 = null;
      try {
        bankAccount0 = new BankAccount();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.payrollnz.BankAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BankAccount.CalculationTypeEnum bankAccount_CalculationTypeEnum0 = BankAccount.CalculationTypeEnum.FIXEDAMOUNT;
      String string0 = bankAccount_CalculationTypeEnum0.toString();
      assertEquals("FixedAmount", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BankAccount.CalculationTypeEnum bankAccount_CalculationTypeEnum0 = BankAccount.CalculationTypeEnum.FIXEDAMOUNT;
      String string0 = bankAccount_CalculationTypeEnum0.getValue();
      assertEquals("FixedAmount", string0);
  }
}
