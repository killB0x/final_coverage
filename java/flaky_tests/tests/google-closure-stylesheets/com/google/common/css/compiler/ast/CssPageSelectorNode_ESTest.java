/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 02:00:35 GMT 2022
 */

package com.google.common.css.compiler.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.CssPageSelectorNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CssPageSelectorNode_ESTest extends CssPageSelectorNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CssPageSelectorNode cssPageSelectorNode0 = null;
      try {
        cssPageSelectorNode0 = new CssPageSelectorNode((CssPageSelectorNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.ast.CssAtRuleNode", e);
      }
  }
}
