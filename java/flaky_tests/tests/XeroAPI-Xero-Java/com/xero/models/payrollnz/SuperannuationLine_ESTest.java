/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 14:01:09 GMT 2022
 */

package com.xero.models.payrollnz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.payrollnz.SuperannuationLine;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SuperannuationLine_ESTest extends SuperannuationLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SuperannuationLine superannuationLine0 = null;
      try {
        superannuationLine0 = new SuperannuationLine();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.payrollnz.SuperannuationLine", e);
      }
  }
}
