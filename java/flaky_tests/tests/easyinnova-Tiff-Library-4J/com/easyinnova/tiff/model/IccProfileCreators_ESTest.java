/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 08:07:31 GMT 2022
 */

package com.easyinnova.tiff.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.easyinnova.tiff.model.IccProfileCreator;
import com.easyinnova.tiff.model.IccProfileCreators;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IccProfileCreators_ESTest extends IccProfileCreators_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IccProfileCreators iccProfileCreators0 = null;
      try {
        iccProfileCreators0 = new IccProfileCreators();
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.model.IccProfileCreators", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        IccProfileCreators.getIccProfileCreators();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.model.IccProfileCreators", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IccProfileCreator iccProfileCreator0 = IccProfileCreators.getIccProfile(0);
      assertNull(iccProfileCreator0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = IccProfileCreators.hasIccCreator(0);
      assertFalse(boolean0);
  }
}
