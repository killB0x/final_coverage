/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:35:16 GMT 2022
 */

package dev.codesoapbox.dummy4j.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.codesoapbox.dummy4j.exceptions.IvalidIsniParameterException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IvalidIsniParameterException_ESTest extends IvalidIsniParameterException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IvalidIsniParameterException ivalidIsniParameterException0 = new IvalidIsniParameterException((String) null);
  }
}
