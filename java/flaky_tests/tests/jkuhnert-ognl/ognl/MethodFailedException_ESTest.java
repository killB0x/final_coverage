/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 14:23:39 GMT 2022
 */

package ognl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import ognl.MethodFailedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MethodFailedException_ESTest extends MethodFailedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 23);
      MethodFailedException methodFailedException0 = null;
      try {
        methodFailedException0 = new MethodFailedException(pushbackInputStream0, "jyP?w{=k@#n", (Throwable) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MethodFailedException methodFailedException0 = null;
      try {
        methodFailedException0 = new MethodFailedException((Object) null, (String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockException", e);
      }
  }
}
