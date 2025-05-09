/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:49:28 GMT 2022
 */

package org.dnal.api.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dnal.api.CompilerOptions;
import org.dnal.api.impl.CompilerContext;
import org.dnal.compiler.impoter.DefaultImportLoader;
import org.dnal.compiler.impoter.MockImportLoader;
import org.dnal.core.ErrorType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CompilerContext_ESTest extends CompilerContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultImportLoader defaultImportLoader0 = new DefaultImportLoader();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CompilerContext compilerContext0 = new CompilerContext((String) null, (Integer) null, defaultImportLoader0, (String) null, compilerOptions0);
      ErrorType errorType0 = ErrorType.PARSINGERROR;
      compilerContext0.addOldErrorMsg(errorType0, "?");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(0);
      MockImportLoader mockImportLoader0 = new MockImportLoader();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CompilerContext compilerContext0 = new CompilerContext((String) null, integer0, mockImportLoader0, "", compilerOptions0);
      CompilerContext compilerContext1 = compilerContext0.clone();
      assertNotSame(compilerContext1, compilerContext0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultImportLoader defaultImportLoader0 = new DefaultImportLoader();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CompilerContext compilerContext0 = new CompilerContext("", (Integer) null, defaultImportLoader0, "", compilerOptions0);
      CompilerContext compilerContext1 = compilerContext0.clone();
      assertNotSame(compilerContext1, compilerContext0);
  }
}
