/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 21:07:55 GMT 2022
 */

package org.kivio.c3faces.listener.change;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.kivio.c3faces.listener.change.ViewDataSetCumulatibleChange;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ViewDataSetCumulatibleChange_ESTest extends ViewDataSetCumulatibleChange_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ViewDataSetCumulatibleChange viewDataSetCumulatibleChange0 = new ViewDataSetCumulatibleChange("", "");
      boolean boolean0 = viewDataSetCumulatibleChange0.isCumulatible();
      assertTrue(boolean0);
  }
}
