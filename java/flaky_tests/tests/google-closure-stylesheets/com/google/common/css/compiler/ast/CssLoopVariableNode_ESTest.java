/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 02:12:42 GMT 2022
 */

package com.google.common.css.compiler.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.SourceCodeLocation;
import com.google.common.css.compiler.ast.CssLoopVariableNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CssLoopVariableNode_ESTest extends CssLoopVariableNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CssLoopVariableNode cssLoopVariableNode0 = null;
      try {
        cssLoopVariableNode0 = new CssLoopVariableNode((CssLoopVariableNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.css.compiler.ast.CssValueNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CssLoopVariableNode cssLoopVariableNode0 = null;
      try {
        cssLoopVariableNode0 = new CssLoopVariableNode("com.google.common.css.compiler.ast.CssLoopVariableNode", (SourceCodeLocation) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.common.css.compiler.ast.CssNode", e);
      }
  }
}
