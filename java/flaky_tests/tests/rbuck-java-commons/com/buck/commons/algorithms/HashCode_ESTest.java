/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 06:44:39 GMT 2022
 */

package com.buck.commons.algorithms;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.buck.commons.algorithms.HashCode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HashCode_ESTest extends HashCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        HashCode.hashCode(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.buck.commons.algorithms.HashCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashCode.hashCode((-439), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.buck.commons.algorithms.HashCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "eJ%F'I%*k:)9";
      stringArray0[1] = "eJ%F'I%*k:)9";
      stringArray0[2] = "eJ%F'I%*k:)9";
      stringArray0[3] = "eJ%F'I%*k:)9";
      stringArray0[4] = "com.buck.commons.algorithms.HashCode";
      stringArray0[5] = "eJ%F'I%*k:)9";
      HashCode.hashCode(stringArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashCode.hashCode(753, "eJ%F'I%*k:)9");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashCode hashCode0 = new HashCode();
  }
}
