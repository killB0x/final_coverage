/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 18:43:16 GMT 2022
 */

package net.imglib2.display;

import org.junit.Test;
import static org.junit.Assert.*;
import net.imglib2.display.AbstractLinearRange;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractLinearRange_ESTest extends AbstractLinearRange_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AbstractLinearRange abstractLinearRange0 = new AbstractLinearRange((-1.0), (-1.0));
      abstractLinearRange0.setMin((-1.0));
      assertEquals((-1.0), abstractLinearRange0.getMax(), 0.01);
      assertEquals((-1.0), abstractLinearRange0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = AbstractLinearRange.roundPositive(0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = AbstractLinearRange.roundPositive(1.0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AbstractLinearRange abstractLinearRange0 = new AbstractLinearRange();
      double double0 = abstractLinearRange0.getMin();
      assertEquals(1.0, abstractLinearRange0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AbstractLinearRange abstractLinearRange0 = new AbstractLinearRange();
      assertEquals(0.0, abstractLinearRange0.getMin(), 0.01);
      
      abstractLinearRange0.min = 1.0;
      double double0 = abstractLinearRange0.getMin();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AbstractLinearRange abstractLinearRange0 = new AbstractLinearRange((-1.0), (-1.0));
      abstractLinearRange0.setMax(0.0);
      double double0 = abstractLinearRange0.getMax();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AbstractLinearRange abstractLinearRange0 = new AbstractLinearRange();
      double double0 = abstractLinearRange0.getMax();
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, abstractLinearRange0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = AbstractLinearRange.roundPositive((-678.882478397));
      assertEquals((-678), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AbstractLinearRange abstractLinearRange0 = new AbstractLinearRange((-1931.5501), (-678.882478397));
      double double0 = abstractLinearRange0.getMax();
      assertEquals((-678.882478397), double0, 0.01);
      assertEquals((-1931.5501), abstractLinearRange0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AbstractLinearRange abstractLinearRange0 = new AbstractLinearRange((-1931.5501), (-678.882478397));
      abstractLinearRange0.setMax((-678.882478397));
      assertEquals((-1931.5501), abstractLinearRange0.getMin(), 0.01);
      assertEquals((-678.882478397), abstractLinearRange0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AbstractLinearRange abstractLinearRange0 = new AbstractLinearRange();
      assertEquals(0.0, abstractLinearRange0.getMin(), 0.01);
      
      abstractLinearRange0.setMin((-1.0));
      assertEquals((-1.0), abstractLinearRange0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractLinearRange abstractLinearRange0 = new AbstractLinearRange((-1931.5501), (-678.882478397));
      double double0 = abstractLinearRange0.getMin();
      assertEquals((-1931.5501), double0, 0.01);
      assertEquals((-678.882478397), abstractLinearRange0.getMax(), 0.01);
  }
}
