/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 19:22:37 GMT 2022
 */

package gutenberg.pygments;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import gutenberg.pygments.Tokens;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Tokens_ESTest extends Tokens_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tokens tokens0 = null;
      try {
        tokens0 = new Tokens();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("gutenberg.pygments.Tokens", e);
      }
  }
}
