/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:04:05 GMT 2022
 */

package com.google.common.css.compiler.passes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.ErrorManager;
import com.google.common.css.compiler.ast.VisitController;
import com.google.common.css.compiler.passes.VerifyRecognizedProperties;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VerifyRecognizedProperties_ESTest extends VerifyRecognizedProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VerifyRecognizedProperties verifyRecognizedProperties0 = null;
      try {
        verifyRecognizedProperties0 = new VerifyRecognizedProperties((Set<String>) null, (VisitController) null, (ErrorManager) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/ImmutableSet
         //
         verifyException("com.google.common.css.compiler.passes.VerifyRecognizedProperties", e);
      }
  }
}
