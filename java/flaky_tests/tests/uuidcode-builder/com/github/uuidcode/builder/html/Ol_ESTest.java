/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 20:47:48 GMT 2022
 */

package com.github.uuidcode.builder.html;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.uuidcode.builder.html.Ol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Ol_ESTest extends Ol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Ol ol0 = new Ol();
      assertTrue(ol0.getRequiresEndTag());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ol ol0 = Ol.of();
      assertTrue(ol0.getRequiresEndTag());
  }
}
