/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 21:07:15 GMT 2022
 */

package org.kivio.c3faces.script.property;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.kivio.c3faces.script.property.OnzoomMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OnzoomMethod_ESTest extends OnzoomMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[6];
      OnzoomMethod onzoomMethod0 = new OnzoomMethod(stringArray0[0], stringArray0);
      String string0 = onzoomMethod0.getName();
      assertEquals("onzoom", string0);
  }
}
