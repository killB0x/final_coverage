/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:29:52 GMT 2022
 */

package com.google.common.css.compiler.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.CssRulesetNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CssRulesetNode_ESTest extends CssRulesetNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CssRulesetNode cssRulesetNode0 = null;
      try {
        cssRulesetNode0 = new CssRulesetNode();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.google.common.css.compiler.ast.CssDeclarationBlockNode
         //
         verifyException("com.google.common.css.compiler.ast.CssRulesetNode", e);
      }
  }
}
