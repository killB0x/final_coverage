/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:11:44 GMT 2022
 */

package org.jfaster.mango.sharding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.sharding.ModHundredTableShardingStrategy;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ModHundredTableShardingStrategy_ESTest extends ModHundredTableShardingStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ModHundredTableShardingStrategy modHundredTableShardingStrategy0 = new ModHundredTableShardingStrategy();
      Float float0 = Float.valueOf((-1.0F));
      String string0 = modHundredTableShardingStrategy0.getTargetTable("uh", (Number) float0);
      assertEquals("uh_1", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ModHundredTableShardingStrategy modHundredTableShardingStrategy0 = new ModHundredTableShardingStrategy();
      // Undeclared exception!
      try { 
        modHundredTableShardingStrategy0.getTargetTable((String) null, (Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.sharding.ModHundredTableShardingStrategy", e);
      }
  }
}
