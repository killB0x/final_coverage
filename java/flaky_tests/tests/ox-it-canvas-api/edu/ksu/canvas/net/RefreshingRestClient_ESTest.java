/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 11:05:10 GMT 2022
 */

package edu.ksu.canvas.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.ksu.canvas.net.RefreshingRestClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RefreshingRestClient_ESTest extends RefreshingRestClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RefreshingRestClient refreshingRestClient0 = null;
      try {
        refreshingRestClient0 = new RefreshingRestClient();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // edu/ksu/canvas/net/SimpleRestClient
         //
         verifyException("edu.ksu.canvas.net.RefreshingRestClient", e);
      }
  }
}
