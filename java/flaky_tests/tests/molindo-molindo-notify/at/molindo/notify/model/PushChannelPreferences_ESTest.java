/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 15:07:48 GMT 2022
 */

package at.molindo.notify.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import at.molindo.notify.model.PushChannelPreferences;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PushChannelPreferences_ESTest extends PushChannelPreferences_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PushChannelPreferences pushChannelPreferences0 = null;
      try {
        pushChannelPreferences0 = new PushChannelPreferences();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
         verifyException("at.molindo.notify.model.Params", e);
      }
  }
}
