/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 13:07:52 GMT 2022
 */

package com.xero.models.accounting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.accounting.ImportSummaryAccounts;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ImportSummaryAccounts_ESTest extends ImportSummaryAccounts_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImportSummaryAccounts importSummaryAccounts0 = null;
      try {
        importSummaryAccounts0 = new ImportSummaryAccounts();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.accounting.ImportSummaryAccounts", e);
      }
  }
}
