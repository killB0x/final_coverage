/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 07:16:48 GMT 2022
 */

package com.irurueta.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import com.irurueta.geometry.RotationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RotationException_ESTest extends RotationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RotationException rotationException0 = new RotationException("com.irurueta.geometry.RotationException");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RotationException rotationException0 = new RotationException("", (Throwable) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RotationException rotationException0 = new RotationException();
      RotationException rotationException1 = new RotationException(rotationException0);
      assertFalse(rotationException1.equals((Object)rotationException0));
  }
}
