/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 15:55:57 GMT 2022
 */

package com.accelad.math.nilgiri;

import org.junit.Test;
import static org.junit.Assert.*;
import com.accelad.math.nilgiri.DoubleComplex;
import com.accelad.math.nilgiri.DoubleComplexFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DoubleComplexFactory_ESTest extends DoubleComplexFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DoubleComplexFactory doubleComplexFactory0 = DoubleComplexFactory.instance();
      DoubleComplex doubleComplex0 = doubleComplexFactory0.create((-2974.0), 389.363);
      assertEquals((-2974.0), doubleComplex0.re_double(), 0.01);
      assertEquals(389.363, doubleComplex0.im_double(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleComplexFactory doubleComplexFactory0 = DoubleComplexFactory.instance();
      DoubleComplex doubleComplex0 = doubleComplexFactory0.create(4197.79196771, (-133.3978711681968));
      assertEquals((-133.3978711681968), doubleComplex0.im_double(), 0.01);
      assertEquals(4197.79196771, doubleComplex0.re_double(), 0.01);
      assertEquals(1.76392523962028E7, doubleComplex0.absolute_square(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleComplexFactory doubleComplexFactory0 = DoubleComplexFactory.instance();
      DoubleComplex doubleComplex0 = doubleComplexFactory0.zero();
      assertEquals(0.0, doubleComplex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoubleComplexFactory doubleComplexFactory0 = DoubleComplexFactory.instance();
      DoubleComplex doubleComplex0 = doubleComplexFactory0.one();
      assertEquals(1.0, doubleComplex0.modulus(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleComplexFactory doubleComplexFactory0 = DoubleComplexFactory.instance();
      DoubleComplex doubleComplex0 = doubleComplexFactory0.create(0.0, 0.0);
      assertEquals(0.0, doubleComplex0.re_double(), 0.01);
      assertEquals(0.0, doubleComplex0.im_double(), 0.01);
  }
}
