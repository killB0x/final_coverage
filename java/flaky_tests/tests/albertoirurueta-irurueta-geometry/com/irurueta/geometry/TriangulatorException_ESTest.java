/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 07:10:13 GMT 2022
 */

package com.irurueta.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import com.irurueta.geometry.TriangulatorException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TriangulatorException_ESTest extends TriangulatorException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TriangulatorException triangulatorException0 = new TriangulatorException("-*Z(", (Throwable) null);
      TriangulatorException triangulatorException1 = new TriangulatorException(triangulatorException0);
      assertFalse(triangulatorException1.equals((Object)triangulatorException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TriangulatorException triangulatorException0 = new TriangulatorException("7aQBCa}EMPaOM2D^3j");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TriangulatorException triangulatorException0 = new TriangulatorException();
  }
}
