/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 23:50:09 GMT 2022
 */

package io.muserver;

import org.junit.Test;
import static org.junit.Assert.*;
import io.muserver.Toggles;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Toggles_ESTest extends Toggles_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Toggles toggles0 = new Toggles();
      assertFalse(Toggles.fixedLengthResponsesEnabled);
  }
}
