/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 14:01:25 GMT 2022
 */

package com.github.tomato.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.tomato.support.DefaultTokenProviderSupport;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultTokenProviderSupport_ESTest extends DefaultTokenProviderSupport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultTokenProviderSupport defaultTokenProviderSupport0 = new DefaultTokenProviderSupport();
      // Undeclared exception!
      try { 
        defaultTokenProviderSupport0.findTomatoToken((Method) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.tomato.support.DefaultTokenProviderSupport", e);
      }
  }
}
