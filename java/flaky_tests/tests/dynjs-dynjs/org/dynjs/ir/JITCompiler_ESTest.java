/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 21:31:43 GMT 2022
 */

package org.dynjs.ir;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.dynjs.ir.IRJSFunction;
import org.dynjs.ir.JITCompiler;
import org.dynjs.runtime.ExecutionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JITCompiler_ESTest extends JITCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JITCompiler jITCompiler0 = new JITCompiler();
      // Undeclared exception!
      try { 
        jITCompiler0.compile((ExecutionContext) null, (IRJSFunction) null, (JITCompiler.CompilerCallback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dynjs.ir.JITCompiler", e);
      }
  }
}
