/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 12:18:10 GMT 2022
 */

package com.bizo.asperatus.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.bizo.asperatus.model.Dimension;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Dimension_ESTest extends Dimension_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Dimension dimension0 = null;
      try {
        dimension0 = new Dimension("", "og}4M>,~");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.bizo.asperatus.model.Dimension", e);
      }
  }
}
