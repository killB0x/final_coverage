/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 02:15:35 GMT 2022
 */

package com.google.common.css.compiler.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.CssUnicodeRangeNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CssUnicodeRangeNode_ESTest extends CssUnicodeRangeNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CssUnicodeRangeNode cssUnicodeRangeNode0 = null;
      try {
        cssUnicodeRangeNode0 = new CssUnicodeRangeNode("B_de");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.common.css.compiler.ast.CssNode", e);
      }
  }
}
