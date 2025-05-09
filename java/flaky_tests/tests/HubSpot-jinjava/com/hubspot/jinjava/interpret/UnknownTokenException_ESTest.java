/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:27:18 GMT 2022
 */

package com.hubspot.jinjava.interpret;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.UnknownTokenException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnknownTokenException_ESTest extends UnknownTokenException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnknownTokenException unknownTokenException0 = new UnknownTokenException("", 0, 1);
      String string0 = unknownTokenException0.getToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnknownTokenException unknownTokenException0 = null;
      try {
        unknownTokenException0 = new UnknownTokenException((String) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.interpret.UnknownTokenException", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnknownTokenException unknownTokenException0 = new UnknownTokenException("DV:", 2433, 2433);
      String string0 = unknownTokenException0.getToken();
      assertEquals("DV:", string0);
  }
}
