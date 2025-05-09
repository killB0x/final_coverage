/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 21:07:53 GMT 2022
 */

package com.britesnow.snow.web.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.britesnow.snow.web.handler.WebObjectValidationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WebObjectValidationException_ESTest extends WebObjectValidationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      WebObjectValidationException webObjectValidationException0 = new WebObjectValidationException(class0, (WebObjectValidationException.ERROR) null);
      // Undeclared exception!
      try { 
        webObjectValidationException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.britesnow.snow.web.handler.WebObjectValidationException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WebObjectValidationException.ERROR webObjectValidationException_ERROR0 = WebObjectValidationException.ERROR.NO_SINGLETON;
      String string0 = webObjectValidationException_ERROR0.getMsg();
      assertEquals("'WebClass' %1$s must be annotated with @Singleton, because objects with @Web... are treated as singleton by Snow.", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      WebObjectValidationException.ERROR webObjectValidationException_ERROR0 = WebObjectValidationException.ERROR.NO_SINGLETON;
      WebObjectValidationException webObjectValidationException0 = new WebObjectValidationException(class0, webObjectValidationException_ERROR0);
      String string0 = webObjectValidationException0.getMessage();
      assertEquals("'WebClass' Integer must be annotated with @Singleton, because objects with @Web... are treated as singleton by Snow.", string0);
  }
}
