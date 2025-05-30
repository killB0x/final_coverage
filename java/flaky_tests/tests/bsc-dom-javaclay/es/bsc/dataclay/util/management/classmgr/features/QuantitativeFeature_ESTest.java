/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 14:08:43 GMT 2022
 */

package es.bsc.dataclay.util.management.classmgr.features;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.util.management.classmgr.features.MemoryFeature;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuantitativeFeature_ESTest extends QuantitativeFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MemoryFeature memoryFeature0 = null;
      try {
        memoryFeature0 = new MemoryFeature(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad capacity in MB : 0 (must be > 0)
         //
         verifyException("es.bsc.dataclay.util.management.classmgr.features.MemoryFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MemoryFeature memoryFeature0 = new MemoryFeature();
      assertNull(memoryFeature0.getType());
  }
}
