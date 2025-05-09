/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:33:02 GMT 2022
 */

package dev.codesoapbox.dummy4j.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import dev.codesoapbox.dummy4j.exceptions.InvalidRangeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InvalidRangeException_ESTest extends InvalidRangeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvalidRangeException invalidRangeException0 = new InvalidRangeException(1.0F, 1.0F);
      String string0 = invalidRangeException0.getMessage();
      assertEquals("Given range from 1.0 to 1.0 is invalid", string0);
  }
}
