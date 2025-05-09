/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 19:16:40 GMT 2022
 */

package com.github.echisan.wbp4j.cache;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.echisan.wbp4j.cache.CookieHolder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CookieHolder_ESTest extends CookieHolder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CookieHolder.setCookie("L0O*U};''Qm");
      String string0 = CookieHolder.getCookie();
      assertEquals("L0O*U};''Qm", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CookieHolder.setCookie("");
      String string0 = CookieHolder.getCookie();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CookieHolder cookieHolder0 = new CookieHolder();
      assertNull(cookieHolder0.getCookie());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = CookieHolder.getCookie();
      assertNull(string0);
  }
}
