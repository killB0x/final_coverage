/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 12:36:19 GMT 2022
 */

package com.xero.models.finance;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.finance.DataSourceResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DataSourceResponse_ESTest extends DataSourceResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataSourceResponse dataSourceResponse0 = null;
      try {
        dataSourceResponse0 = new DataSourceResponse();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.finance.DataSourceResponse", e);
      }
  }
}
