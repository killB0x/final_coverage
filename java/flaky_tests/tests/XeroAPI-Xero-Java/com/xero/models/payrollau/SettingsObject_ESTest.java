/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 19:32:26 GMT 2022
 */

package com.xero.models.payrollau;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.payrollau.SettingsObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SettingsObject_ESTest extends SettingsObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SettingsObject settingsObject0 = null;
      try {
        settingsObject0 = new SettingsObject();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.payrollau.SettingsObject", e);
      }
  }
}
