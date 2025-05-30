/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 13 20:47:24 GMT 2022
 */

package org.iban4j;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.iban4j.BicFormatException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BicFormatException_ESTest extends BicFormatException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BicFormatException.BicFormatViolation bicFormatException_BicFormatViolation0 = BicFormatException.BicFormatViolation.UNKNOWN;
      Object object0 = new Object();
      BicFormatException bicFormatException0 = new BicFormatException(bicFormatException_BicFormatViolation0, bicFormatException_BicFormatViolation0, object0, "org.iban4j.Iban4jException");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BicFormatException.BicFormatViolation bicFormatException_BicFormatViolation0 = BicFormatException.BicFormatViolation.BRANCH_CODE_ONLY_LETTERS_OR_DIGITS;
      Object object0 = new Object();
      BicFormatException bicFormatException0 = new BicFormatException(bicFormatException_BicFormatViolation0, object0, "");
      BicFormatException.BicFormatViolation bicFormatException_BicFormatViolation1 = bicFormatException0.getFormatViolation();
      assertSame(bicFormatException_BicFormatViolation1, bicFormatException_BicFormatViolation0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BicFormatException.BicFormatViolation bicFormatException_BicFormatViolation0 = BicFormatException.BicFormatViolation.BANK_CODE_ONLY_LETTERS;
      Object object0 = new Object();
      BicFormatException bicFormatException0 = new BicFormatException(bicFormatException_BicFormatViolation0, object0, "`tM ");
      Object object1 = bicFormatException0.getActual();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BicFormatException.BicFormatViolation bicFormatException_BicFormatViolation0 = BicFormatException.BicFormatViolation.BIC_NOT_EMPTY;
      BicFormatException bicFormatException0 = new BicFormatException(bicFormatException_BicFormatViolation0, (String) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BicFormatException bicFormatException0 = new BicFormatException();
      bicFormatException0.getFormatViolation();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BicFormatException bicFormatException0 = new BicFormatException("", (Throwable) null);
      BicFormatException bicFormatException1 = new BicFormatException(bicFormatException0);
      assertFalse(bicFormatException1.equals((Object)bicFormatException0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BicFormatException bicFormatException0 = new BicFormatException("");
      Object object0 = bicFormatException0.getExpected();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BicFormatException.BicFormatViolation bicFormatException_BicFormatViolation0 = BicFormatException.BicFormatViolation.BIC_NOT_EMPTY;
      Object object0 = new Object();
      BicFormatException bicFormatException0 = new BicFormatException(bicFormatException_BicFormatViolation0, object0, object0, (String) null);
      Object object1 = bicFormatException0.getExpected();
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BicFormatException bicFormatException0 = new BicFormatException();
      Object object0 = bicFormatException0.getActual();
      assertNull(object0);
  }
}
