/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 15:36:01 GMT 2022
 */

package org.joni;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joni.ApplyCaseFoldArg;
import org.joni.ScanEnvironment;
import org.joni.ast.CClassNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApplyCaseFoldArg_ESTest extends ApplyCaseFoldArg_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CClassNode cClassNode0 = new CClassNode();
      ApplyCaseFoldArg applyCaseFoldArg0 = new ApplyCaseFoldArg((ScanEnvironment) null, cClassNode0, (CClassNode) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CClassNode cClassNode0 = new CClassNode();
      ApplyCaseFoldArg applyCaseFoldArg0 = new ApplyCaseFoldArg((ScanEnvironment) null, cClassNode0, cClassNode0);
  }
}
