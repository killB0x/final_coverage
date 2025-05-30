/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 07:14:31 GMT 2022
 */

package com.irurueta.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import com.irurueta.geometry.NotAvailableException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NotAvailableException_ESTest extends NotAvailableException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotAvailableException notAvailableException0 = new NotAvailableException("0");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NotAvailableException notAvailableException0 = new NotAvailableException();
      NotAvailableException notAvailableException1 = new NotAvailableException("", notAvailableException0);
      assertFalse(notAvailableException1.equals((Object)notAvailableException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NotAvailableException notAvailableException0 = new NotAvailableException();
      NotAvailableException notAvailableException1 = new NotAvailableException(notAvailableException0);
      assertFalse(notAvailableException1.equals((Object)notAvailableException0));
  }
}
