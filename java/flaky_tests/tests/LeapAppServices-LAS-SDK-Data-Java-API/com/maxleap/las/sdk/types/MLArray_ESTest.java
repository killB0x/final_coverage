/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 19:48:09 GMT 2022
 */

package com.maxleap.las.sdk.types;

import org.junit.Test;
import static org.junit.Assert.*;
import com.maxleap.las.sdk.types.MLArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MLArray_ESTest extends MLArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MLArray mLArray0 = new MLArray();
      assertTrue(mLArray0.isEmpty());
  }
}
