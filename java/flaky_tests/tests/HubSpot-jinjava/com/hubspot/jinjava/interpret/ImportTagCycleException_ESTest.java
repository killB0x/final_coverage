/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:51:43 GMT 2022
 */

package com.hubspot.jinjava.interpret;

import org.junit.Test;
import static org.junit.Assert.*;
import com.hubspot.jinjava.interpret.ImportTagCycleException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ImportTagCycleException_ESTest extends ImportTagCycleException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImportTagCycleException importTagCycleException0 = new ImportTagCycleException("com.hubspot.jinjava.interpret.FromTagCycleException", (-2208), (-2208));
  }
}
