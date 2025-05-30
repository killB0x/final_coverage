/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 11:02:41 GMT 2022
 */

package edu.ksu.canvas.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.ksu.canvas.impl.ProgressImpl;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.NonRefreshableOauthToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProgressImpl_ESTest extends ProgressImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(1709);
      NonRefreshableOauthToken nonRefreshableOauthToken0 = new NonRefreshableOauthToken("vwhiy7c)@5sj%`~xn");
      ProgressImpl progressImpl0 = null;
      try {
        progressImpl0 = new ProgressImpl("", integer0, nonRefreshableOauthToken0, (RestClient) null, 1709, 10, integer0, (Boolean) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/BooleanUtils
         //
         verifyException("edu.ksu.canvas.impl.BaseImpl", e);
      }
  }
}
