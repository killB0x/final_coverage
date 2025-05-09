/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 23:20:21 GMT 2022
 */

package org.gedcom4j;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.Options;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Options_ESTest extends Options_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Options.resetToDefaults();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Options.setCollectionInitializationEnabled(true);
      boolean boolean0 = Options.isCollectionInitializationEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = Options.isCollectionInitializationEnabled();
      assertFalse(boolean0);
  }
}
