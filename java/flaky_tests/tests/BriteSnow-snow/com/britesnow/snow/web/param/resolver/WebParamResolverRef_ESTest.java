/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 21:04:30 GMT 2022
 */

package com.britesnow.snow.web.param.resolver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.britesnow.snow.web.param.resolver.WebParamResolverRef;
import com.britesnow.snow.web.param.resolver.annotation.WebParamResolver;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WebParamResolverRef_ESTest extends WebParamResolverRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      WebParamResolverRef webParamResolverRef0 = null;
      try {
        webParamResolverRef0 = new WebParamResolverRef((WebParamResolver) null, class0, (Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.britesnow.snow.web.param.resolver.WebParamResolverRef", e);
      }
  }
}
