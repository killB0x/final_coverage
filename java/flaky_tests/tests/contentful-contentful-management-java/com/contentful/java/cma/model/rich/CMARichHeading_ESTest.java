/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:56:57 GMT 2022
 */

package com.contentful.java.cma.model.rich;

import org.junit.Test;
import static org.junit.Assert.*;
import com.contentful.java.cma.model.rich.CMARichHeading;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CMARichHeading_ESTest extends CMARichHeading_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CMARichHeading cMARichHeading0 = new CMARichHeading((-172));
      int int0 = cMARichHeading0.getLevel();
      assertEquals((-172), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CMARichHeading cMARichHeading0 = new CMARichHeading(118);
      int int0 = cMARichHeading0.getLevel();
      assertEquals(118, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CMARichHeading cMARichHeading0 = new CMARichHeading(0);
      int int0 = cMARichHeading0.getLevel();
      assertEquals(0, int0);
  }
}
