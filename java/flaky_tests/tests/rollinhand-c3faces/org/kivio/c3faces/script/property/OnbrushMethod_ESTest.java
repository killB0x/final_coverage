/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 21:01:35 GMT 2022
 */

package org.kivio.c3faces.script.property;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.kivio.c3faces.script.property.OnbrushMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OnbrushMethod_ESTest extends OnbrushMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OnbrushMethod onbrushMethod0 = new OnbrushMethod("onbrush", (String[]) null);
      String string0 = onbrushMethod0.getName();
      assertEquals("onbrush", string0);
  }
}
