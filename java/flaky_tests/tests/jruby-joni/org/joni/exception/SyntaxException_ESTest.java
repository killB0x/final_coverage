/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 15:32:12 GMT 2022
 */

package org.joni.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joni.exception.SyntaxException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SyntaxException_ESTest extends SyntaxException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SyntaxException syntaxException0 = new SyntaxException("");
  }
}
