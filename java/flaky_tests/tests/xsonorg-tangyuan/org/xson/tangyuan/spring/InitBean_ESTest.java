/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:29:02 GMT 2022
 */

package org.xson.tangyuan.spring;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xson.tangyuan.spring.InitBean;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InitBean_ESTest extends InitBean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InitBean initBean0 = new InitBean();
      initBean0.setResource("");
      try { 
        initBean0.init();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.xson.tangyuan.TangYuanContainer
         //
         verifyException("org.xson.tangyuan.spring.InitBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InitBean initBean0 = new InitBean();
      initBean0.init();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InitBean initBean0 = new InitBean();
      initBean0.destroy();
  }
}
