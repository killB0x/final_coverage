/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 19:19:00 GMT 2022
 */

package gutenberg.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import gutenberg.util.VariableResolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VariableResolver_ESTest extends VariableResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableResolver variableResolver0 = null;
      try {
        variableResolver0 = new VariableResolver();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
         verifyException("gutenberg.util.VariableResolver", e);
      }
  }
}
