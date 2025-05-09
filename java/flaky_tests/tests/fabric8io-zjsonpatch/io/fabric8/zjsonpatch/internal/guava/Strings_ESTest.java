/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 20:13:57 GMT 2022
 */

package io.fabric8.zjsonpatch.internal.guava;

import org.junit.Test;
import static org.junit.Assert.*;
import io.fabric8.zjsonpatch.internal.guava.Strings;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Strings_ESTest extends Strings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = Strings.isNullOrEmpty("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = Strings.isNullOrEmpty("8azJpRN=ut[k");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = Strings.isNullOrEmpty((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Strings strings0 = new Strings();
  }
}
