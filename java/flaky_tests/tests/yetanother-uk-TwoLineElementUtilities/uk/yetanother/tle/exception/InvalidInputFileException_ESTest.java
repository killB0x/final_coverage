/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 20:17:16 GMT 2022
 */

package uk.yetanother.tle.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.yetanother.tle.exception.InvalidInputFileException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InvalidInputFileException_ESTest extends InvalidInputFileException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvalidInputFileException invalidInputFileException0 = new InvalidInputFileException("8&LU{ENPXp#qJ''");
      InvalidInputFileException invalidInputFileException1 = new InvalidInputFileException("8&LU{ENPXp#qJ''", invalidInputFileException0);
      assertFalse(invalidInputFileException1.equals((Object)invalidInputFileException0));
  }
}
