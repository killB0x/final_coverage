/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:14:15 GMT 2022
 */

package com.google.common.css.compiler.passes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.CssDefinitionNode;
import com.google.common.css.compiler.ast.VisitController;
import com.google.common.css.compiler.passes.MarkDefaultDefinitions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MarkDefaultDefinitions_ESTest extends MarkDefaultDefinitions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MarkDefaultDefinitions markDefaultDefinitions0 = new MarkDefaultDefinitions((VisitController) null);
      // Undeclared exception!
      try { 
        markDefaultDefinitions0.enterDefinition((CssDefinitionNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.passes.MarkDefaultDefinitions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MarkDefaultDefinitions markDefaultDefinitions0 = new MarkDefaultDefinitions((VisitController) null);
      // Undeclared exception!
      try { 
        markDefaultDefinitions0.runPass();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.passes.MarkDefaultDefinitions", e);
      }
  }
}
