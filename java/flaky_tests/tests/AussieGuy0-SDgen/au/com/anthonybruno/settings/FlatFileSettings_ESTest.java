/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 05:29:10 GMT 2022
 */

package au.com.anthonybruno.settings;

import org.junit.Test;
import static org.junit.Assert.*;
import au.com.anthonybruno.settings.FlatFileSettings;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FlatFileSettings_ESTest extends FlatFileSettings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FlatFileSettings flatFileSettings0 = new FlatFileSettings(true);
      boolean boolean0 = flatFileSettings0.isIncludingHeaders();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FlatFileSettings flatFileSettings0 = new FlatFileSettings(false);
      boolean boolean0 = flatFileSettings0.isIncludingHeaders();
      assertFalse(boolean0);
  }
}
