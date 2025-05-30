/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 01:15:36 GMT 2022
 */

package com.irurueta.navigation.inertial.calibration.intervals.thresholdfactor;

import org.junit.Test;
import static org.junit.Assert.*;
import com.irurueta.navigation.inertial.calibration.intervals.thresholdfactor.DefaultAccelerometerGyroscopeAndMagnetometerMseRule;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultAccelerometerGyroscopeAndMagnetometerMseRule_ESTest extends DefaultAccelerometerGyroscopeAndMagnetometerMseRule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultAccelerometerGyroscopeAndMagnetometerMseRule defaultAccelerometerGyroscopeAndMagnetometerMseRule0 = new DefaultAccelerometerGyroscopeAndMagnetometerMseRule();
      double double0 = defaultAccelerometerGyroscopeAndMagnetometerMseRule0.evaluate(0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultAccelerometerGyroscopeAndMagnetometerMseRule defaultAccelerometerGyroscopeAndMagnetometerMseRule0 = new DefaultAccelerometerGyroscopeAndMagnetometerMseRule();
      double double0 = defaultAccelerometerGyroscopeAndMagnetometerMseRule0.evaluate((-4026.269888957), 1.0, 0.0);
      assertEquals((-4025.269888957), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultAccelerometerGyroscopeAndMagnetometerMseRule defaultAccelerometerGyroscopeAndMagnetometerMseRule0 = new DefaultAccelerometerGyroscopeAndMagnetometerMseRule();
      double double0 = defaultAccelerometerGyroscopeAndMagnetometerMseRule0.evaluate(2201.709, 2201.709, (-770.273424785));
      assertEquals(3633.144575215, double0, 0.01);
  }
}
