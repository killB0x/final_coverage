/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 05:32:23 GMT 2022
 */

package heros.flowfunc;

import org.junit.Test;
import static org.junit.Assert.*;
import heros.flowfunc.Identity;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Identity_ESTest extends Identity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identity<Object> identity0 = Identity.v();
      Set<Object> set0 = identity0.computeTargets(identity0);
      assertEquals(1, set0.size());
  }
}
