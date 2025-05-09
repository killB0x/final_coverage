/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 07:12:01 GMT 2022
 */

package com.irurueta.geometry;

import org.junit.Test;
import static org.junit.Assert.*;
import com.irurueta.geometry.GeometryException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GeometryException_ESTest extends GeometryException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GeometryException geometryException0 = new GeometryException();
      GeometryException geometryException1 = new GeometryException(geometryException0);
      assertFalse(geometryException1.equals((Object)geometryException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GeometryException geometryException0 = new GeometryException("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GeometryException geometryException0 = new GeometryException();
      GeometryException geometryException1 = new GeometryException("", geometryException0);
      assertFalse(geometryException1.equals((Object)geometryException0));
  }
}
