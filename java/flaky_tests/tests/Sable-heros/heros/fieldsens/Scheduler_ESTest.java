/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 05:23:04 GMT 2022
 */

package heros.fieldsens;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import heros.fieldsens.Scheduler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Scheduler_ESTest extends Scheduler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Scheduler scheduler0 = null;
      try {
        scheduler0 = new Scheduler();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("heros.fieldsens.Scheduler", e);
      }
  }
}
