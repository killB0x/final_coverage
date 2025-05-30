/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 00:06:17 GMT 2022
 */

package io.resourcepool.model;

import org.junit.Test;
import static org.junit.Assert.*;
import io.resourcepool.model.Gender;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Gender_ESTest extends Gender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gender[] genderArray0 = Gender.values();
      assertEquals(2, genderArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Gender gender0 = Gender.valueOf("FEMALE");
      assertEquals(Gender.FEMALE, gender0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Gender.parse("p#");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Gender gender0 = Gender.parse("m");
      assertEquals(Gender.MALE, gender0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Gender gender0 = Gender.parse("f");
      assertEquals(Gender.FEMALE, gender0);
  }
}
