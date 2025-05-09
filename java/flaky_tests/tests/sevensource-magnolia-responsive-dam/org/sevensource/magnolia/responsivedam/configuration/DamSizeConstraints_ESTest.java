/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 19:48:14 GMT 2022
 */

package org.sevensource.magnolia.responsivedam.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sevensource.magnolia.responsivedam.configuration.DamSizeConstraints;
import org.sevensource.magnolia.responsivedam.configuration.SizeSpecification;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DamSizeConstraints_ESTest extends DamSizeConstraints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = new Integer(1533);
      damSizeConstraints0.setMinimumResolutionSizeStep(integer0);
      Integer integer1 = damSizeConstraints0.getMinimumResolutionSizeStep();
      assertEquals(1533, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = new Integer((-1));
      damSizeConstraints0.setMinimumResolutionSizeStep(integer0);
      Integer integer1 = damSizeConstraints0.getMinimumResolutionSizeStep();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = new Integer(2171);
      SizeSpecification.SizeDimension sizeSpecification_SizeDimension0 = SizeSpecification.SizeDimension.WIDTH;
      SizeSpecification sizeSpecification0 = new SizeSpecification(integer0, sizeSpecification_SizeDimension0);
      damSizeConstraints0.setMaximumSize(sizeSpecification0);
      SizeSpecification sizeSpecification1 = damSizeConstraints0.getMaximumSize();
      assertEquals(2171, (int)sizeSpecification1.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = new Integer(0);
      damSizeConstraints0.setMaximumResolutions(integer0);
      Integer integer1 = damSizeConstraints0.getMaximumResolutions();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = new Integer(1003);
      damSizeConstraints0.setMaximumResolutions(integer0);
      Integer integer1 = damSizeConstraints0.getMaximumResolutions();
      assertEquals(1003, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = new Integer((-510));
      damSizeConstraints0.setMaximumResolutions(integer0);
      Integer integer1 = damSizeConstraints0.getMaximumResolutions();
      assertEquals((-510), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = new Integer(2);
      SizeSpecification.SizeDimension sizeSpecification_SizeDimension0 = SizeSpecification.SizeDimension.WIDTH;
      SizeSpecification sizeSpecification0 = new SizeSpecification(integer0, sizeSpecification_SizeDimension0);
      damSizeConstraints0.setMinimumSize(sizeSpecification0);
      SizeSpecification sizeSpecification1 = damSizeConstraints0.getMinimumSize();
      assertEquals(2, (int)sizeSpecification1.getValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      SizeSpecification sizeSpecification0 = damSizeConstraints0.getMinimumSize();
      assertNull(sizeSpecification0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = damSizeConstraints0.getMaximumResolutions();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = new Integer(0);
      damSizeConstraints0.setMinimumResolutionSizeStep(integer0);
      Integer integer1 = damSizeConstraints0.getMinimumResolutionSizeStep();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      Integer integer0 = damSizeConstraints0.getMinimumResolutionSizeStep();
      damSizeConstraints0.setMaximumResolutions(integer0);
      assertNull(damSizeConstraints0.getMinimumResolutionSizeStep());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DamSizeConstraints damSizeConstraints0 = new DamSizeConstraints();
      SizeSpecification sizeSpecification0 = damSizeConstraints0.getMaximumSize();
      assertNull(sizeSpecification0);
  }
}
