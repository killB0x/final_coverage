/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 19:30:46 GMT 2022
 */

package org.yamcs.jsle.udpslebridge;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.yamcs.jsle.udpslebridge.ConfigurationException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConfigurationException_ESTest extends ConfigurationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConfigurationException configurationException0 = new ConfigurationException("-:");
  }
}
