/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 22:31:48 GMT 2022
 */

package uk.ziglio.construct.errors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ziglio.construct.errors.TypeError;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypeError_ESTest extends TypeError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TypeError typeError0 = new TypeError("AkOD{");
  }
}
