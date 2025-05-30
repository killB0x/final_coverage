/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 10:46:27 GMT 2022
 */

package edu.ksu.canvas.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.ksu.canvas.impl.RoleImpl;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.NonRefreshableOauthToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RoleImpl_ESTest extends RoleImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = Integer.getInteger("/roles", 125);
      NonRefreshableOauthToken nonRefreshableOauthToken0 = new NonRefreshableOauthToken("edu.ksu.canvas.exception.InvalidOauthTokenException");
      Boolean boolean0 = Boolean.TRUE;
      RoleImpl roleImpl0 = null;
      try {
        roleImpl0 = new RoleImpl("", integer0, nonRefreshableOauthToken0, (RestClient) null, 125, 125, integer0, boolean0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/BooleanUtils
         //
         verifyException("edu.ksu.canvas.impl.BaseImpl", e);
      }
  }
}
