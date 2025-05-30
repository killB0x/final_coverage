/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 08:39:34 GMT 2022
 */

package io.tauris.expression;

import org.junit.Test;
import static org.junit.Assert.*;
import io.tauris.expression.IsBinary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IsBinary_ESTest extends IsBinary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IsBinary isBinary0 = new IsBinary();
      boolean boolean0 = isBinary0.check((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IsBinary isBinary0 = new IsBinary();
      boolean boolean0 = isBinary0.check("binary");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IsBinary isBinary0 = new IsBinary();
      String string0 = isBinary0.toString();
      assertEquals("binary", string0);
  }
}
