/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 30 07:51:57 GMT 2022
 */

package com.spotify.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import com.spotify.statistics.MuninGraphProvider;
import com.spotify.statistics.MuninGraphProviderBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MuninGraphProviderBuilder_ESTest extends MuninGraphProviderBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MuninGraphProviderBuilder muninGraphProviderBuilder0 = new MuninGraphProviderBuilder();
      muninGraphProviderBuilder0.category((String) null);
      MuninGraphProvider muninGraphProvider0 = muninGraphProviderBuilder0.build();
      assertNotNull(muninGraphProvider0);
  }
}
