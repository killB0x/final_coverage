/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 02:10:10 GMT 2022
 */

package org.jiuwo.fastel.constant;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jiuwo.fastel.constant.CharConstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharConstant_ESTest extends CharConstant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharConstant charConstant0 = new CharConstant();
      assertEquals('%', CharConstant.CHAR_PERCENT);
  }
}
