/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 18:03:32 GMT 2022
 */

package io.github.jakaarl.iban;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.jakaarl.iban.Iban;
import io.github.jakaarl.iban.IbanValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IbanValidator_ESTest extends IbanValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IbanValidator ibanValidator0 = new IbanValidator();
      // Undeclared exception!
      try { 
        ibanValidator0.validate("7\"_fYYU?MrI");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument does not match valid IBAN pattern
         //
         verifyException("io.github.jakaarl.iban.Iban", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IbanValidator ibanValidator0 = new IbanValidator();
      // Undeclared exception!
      try { 
        ibanValidator0.validate((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Precondidition failed: non-null argument required
         //
         verifyException("io.github.jakaarl.iban.util.NullCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IbanValidator ibanValidator0 = new IbanValidator();
      // Undeclared exception!
      try { 
        ibanValidator0.validate((Iban) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Precondidition failed: non-null argument required
         //
         verifyException("io.github.jakaarl.iban.util.NullCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IbanValidator ibanValidator0 = new IbanValidator();
      Iban iban0 = new Iban("qo75");
      boolean boolean0 = ibanValidator0.validate(iban0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IbanValidator ibanValidator0 = new IbanValidator(true);
      Iban iban0 = new Iban("qo75");
      boolean boolean0 = ibanValidator0.validate(iban0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IbanValidator ibanValidator0 = new IbanValidator();
      boolean boolean0 = ibanValidator0.validate("qo75");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IbanValidator ibanValidator0 = new IbanValidator(true);
      boolean boolean0 = ibanValidator0.validate("qo75");
      assertFalse(boolean0);
  }
}
