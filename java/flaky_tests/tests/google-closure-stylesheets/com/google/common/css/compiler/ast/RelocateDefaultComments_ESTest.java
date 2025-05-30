/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:20:39 GMT 2022
 */

package com.google.common.css.compiler.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.CssDefinitionNode;
import com.google.common.css.compiler.ast.MutatingVisitController;
import com.google.common.css.compiler.ast.RelocateDefaultComments;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RelocateDefaultComments_ESTest extends RelocateDefaultComments_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RelocateDefaultComments relocateDefaultComments0 = new RelocateDefaultComments((MutatingVisitController) null);
      // Undeclared exception!
      try { 
        relocateDefaultComments0.enterDefinition((CssDefinitionNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.ast.RelocateDefaultComments", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RelocateDefaultComments relocateDefaultComments0 = new RelocateDefaultComments((MutatingVisitController) null);
      // Undeclared exception!
      try { 
        relocateDefaultComments0.runPass();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.ast.RelocateDefaultComments", e);
      }
  }
}
