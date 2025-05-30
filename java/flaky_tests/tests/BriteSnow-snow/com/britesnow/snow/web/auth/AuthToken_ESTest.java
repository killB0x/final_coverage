/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 21:05:49 GMT 2022
 */

package com.britesnow.snow.web.auth;

import org.junit.Test;
import static org.junit.Assert.*;
import com.britesnow.snow.web.auth.AuthToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AuthToken_ESTest extends AuthToken_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AuthToken<Object> authToken0 = new AuthToken<Object>();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      AuthToken<Object> authToken0 = new AuthToken<Object>(object0);
      Object object1 = authToken0.getUser();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      AuthToken<Object> authToken0 = new AuthToken<Object>(object0);
      AuthToken<Object> authToken1 = authToken0.setUser((Object) null);
      Object object1 = authToken1.getUser();
      assertNull(object1);
  }
}
