/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 07:08:03 GMT 2022
 */

package org.valdroz.vscript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.valdroz.vscript.CompositeNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CompositeNode_ESTest extends CompositeNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CompositeNode compositeNode0 = null;
      try {
        compositeNode0 = new CompositeNode();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("org.valdroz.vscript.CompositeNode", e);
      }
  }
}
