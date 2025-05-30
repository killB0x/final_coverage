/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 19:50:59 GMT 2022
 */

package com.maxleap.las.sdk.types;

import org.junit.Test;
import static org.junit.Assert.*;
import com.maxleap.las.sdk.types.MLKeyType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MLKeyType_ESTest extends MLKeyType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MLKeyType[] mLKeyTypeArray0 = MLKeyType.values();
      assertEquals(12, mLKeyTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MLKeyType mLKeyType0 = MLKeyType.valueOf("GEOPOINT");
      assertEquals(MLKeyType.GEOPOINT, mLKeyType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MLKeyType mLKeyType0 = MLKeyType.OBJECT;
      String string0 = mLKeyType0.v();
      assertEquals("Object", string0);
  }
}
