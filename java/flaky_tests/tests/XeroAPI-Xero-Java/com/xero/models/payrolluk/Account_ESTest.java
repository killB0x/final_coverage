/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 16:04:39 GMT 2022
 */

package com.xero.models.payrolluk;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.payrolluk.Account;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Account_ESTest extends Account_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Account.TypeEnum account_TypeEnum0 = Account.TypeEnum.fromValue("WAGESPAYABLE");
      assertEquals(Account.TypeEnum.WAGESPAYABLE, account_TypeEnum0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Account.TypeEnum account_TypeEnum0 = Account.TypeEnum.fromValue("BANK");
      assertEquals(Account.TypeEnum.BANK, account_TypeEnum0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Account.TypeEnum.fromValue("^/Date((d+)([+-]d+)?)/$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value '^/Date((d+)([+-]d+)?)/$'
         //
         verifyException("com.xero.models.payrolluk.Account$TypeEnum", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Account.TypeEnum account_TypeEnum0 = Account.TypeEnum.PAYELIABILITY;
      String string0 = account_TypeEnum0.toString();
      assertEquals("PAYELIABILITY", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Account.TypeEnum account_TypeEnum0 = Account.TypeEnum.EMPLOYERSNIC;
      String string0 = account_TypeEnum0.getValue();
      assertEquals("EMPLOYERSNIC", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Account account0 = null;
      try {
        account0 = new Account();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.payrolluk.Account", e);
      }
  }
}
