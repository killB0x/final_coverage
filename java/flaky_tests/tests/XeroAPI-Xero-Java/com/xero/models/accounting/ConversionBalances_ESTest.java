/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 15:30:13 GMT 2022
 */

package com.xero.models.accounting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.accounting.ConversionBalances;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConversionBalances_ESTest extends ConversionBalances_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConversionBalances conversionBalances0 = null;
      try {
        conversionBalances0 = new ConversionBalances();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.accounting.ConversionBalances", e);
      }
  }
}
