/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:09:21 GMT 2022
 */

package com.google.common.css.compiler.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.CssComponentNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CssComponentNode_ESTest extends CssComponentNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CssComponentNode cssComponentNode0 = null;
      try {
        cssComponentNode0 = new CssComponentNode((CssComponentNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.ast.CssAtRuleNode", e);
      }
  }
}
