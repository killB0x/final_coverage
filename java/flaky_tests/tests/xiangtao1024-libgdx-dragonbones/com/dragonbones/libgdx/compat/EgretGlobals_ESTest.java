/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 03:31:23 GMT 2022
 */

package com.dragonbones.libgdx.compat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.dragonbones.libgdx.compat.EgretGlobals;
import java.util.DoubleSummaryStatistics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EgretGlobals_ESTest extends EgretGlobals_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EgretGlobals egretGlobals0 = new EgretGlobals();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleSummaryStatistics doubleSummaryStatistics0 = new DoubleSummaryStatistics();
      EgretGlobals.startTick(doubleSummaryStatistics0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        EgretGlobals.getTimer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented
         //
         verifyException("com.dragonbones.libgdx.compat.EgretGlobals", e);
      }
  }
}
