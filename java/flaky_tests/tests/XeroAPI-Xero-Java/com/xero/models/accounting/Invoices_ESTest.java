/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 19:05:32 GMT 2022
 */

package com.xero.models.accounting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.accounting.Invoices;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Invoices_ESTest extends Invoices_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Invoices invoices0 = null;
      try {
        invoices0 = new Invoices();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.accounting.Invoices", e);
      }
  }
}
