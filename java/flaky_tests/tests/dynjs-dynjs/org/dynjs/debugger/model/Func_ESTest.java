/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 21:14:59 GMT 2022
 */

package org.dynjs.debugger.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.dynjs.debugger.model.Func;
import org.dynjs.runtime.DynJS;
import org.dynjs.runtime.ExecutionContext;
import org.dynjs.runtime.LexicalEnvironment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Func_ESTest extends Func_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExecutionContext executionContext0 = new ExecutionContext((DynJS) null, (ExecutionContext) null, (LexicalEnvironment) null, (LexicalEnvironment) null, (Object) null, false);
      Func func0 = new Func(executionContext0);
      // Undeclared exception!
      try { 
        func0.getInferredName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dynjs.debugger.model.Func", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Func func0 = new Func((ExecutionContext) null);
      // Undeclared exception!
      try { 
        func0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dynjs.debugger.model.Func", e);
      }
  }
}
