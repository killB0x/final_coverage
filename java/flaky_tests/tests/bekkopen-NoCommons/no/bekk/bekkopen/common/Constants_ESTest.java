/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 20:54:17 GMT 2022
 */

package no.bekk.bekkopen.common;

import org.junit.Test;
import static org.junit.Assert.*;
import no.bekk.bekkopen.common.Constants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Constants_ESTest extends Constants_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constants constants0 = new Constants();
      assertEquals('.', Constants.DOT);
  }
}
