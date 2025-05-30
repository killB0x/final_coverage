/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:08:21 GMT 2022
 */

package com.google.common.css.compiler.passes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.CssMixinDefinitionNode;
import com.google.common.css.compiler.ast.CssRootNode;
import com.google.common.css.compiler.ast.CssValueNode;
import com.google.common.css.compiler.ast.MutatingVisitController;
import com.google.common.css.compiler.passes.CreateConstantReferences;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CreateConstantReferences_ESTest extends CreateConstantReferences_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MutatingVisitController mutatingVisitController0 = mock(MutatingVisitController.class, new ViolatedAssumptionAnswer());
      CreateConstantReferences createConstantReferences0 = new CreateConstantReferences(mutatingVisitController0);
      createConstantReferences0.runPass();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CreateConstantReferences createConstantReferences0 = new CreateConstantReferences((MutatingVisitController) null);
      createConstantReferences0.leaveValueNode((CssValueNode) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CreateConstantReferences createConstantReferences0 = new CreateConstantReferences((MutatingVisitController) null);
      createConstantReferences0.leaveArgumentNode((CssValueNode) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CreateConstantReferences createConstantReferences0 = new CreateConstantReferences((MutatingVisitController) null);
      boolean boolean0 = createConstantReferences0.enterTree((CssRootNode) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CreateConstantReferences createConstantReferences0 = new CreateConstantReferences((MutatingVisitController) null);
      // Undeclared exception!
      try { 
        createConstantReferences0.runPass();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.passes.CreateConstantReferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CreateConstantReferences createConstantReferences0 = new CreateConstantReferences((MutatingVisitController) null);
      createConstantReferences0.leaveMixinDefinition((CssMixinDefinitionNode) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CreateConstantReferences createConstantReferences0 = new CreateConstantReferences((MutatingVisitController) null);
      boolean boolean0 = createConstantReferences0.enterMixinDefinition((CssMixinDefinitionNode) null);
      assertTrue(boolean0);
  }
}
