/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 07:35:26 GMT 2022
 */

package com.clouway.cuse.spi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.clouway.cuse.spi.EscapeUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EscapeUtil_ESTest extends EscapeUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = EscapeUtil.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        EscapeUtil.escape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.clouway.cuse.spi.EscapeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = EscapeUtil.escape("\\-");
      assertEquals("\\\\\\-", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EscapeUtil escapeUtil0 = new EscapeUtil();
  }
}
