/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 20:53:42 GMT 2022
 */

package com.github.uuidcode.builder.html;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.uuidcode.builder.html.Input;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Input_ESTest extends Input_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Input input0 = new Input();
      assertTrue(input0.getRequiresEndTag());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Input input0 = Input.of();
      assertFalse(input0.getRequiresEndTag());
  }
}
