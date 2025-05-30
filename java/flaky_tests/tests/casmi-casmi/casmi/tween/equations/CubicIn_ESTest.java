/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:54:22 GMT 2022
 */

package casmi.tween.equations;

import org.junit.Test;
import static org.junit.Assert.*;
import casmi.tween.equations.CubicIn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CubicIn_ESTest extends CubicIn_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CubicIn cubicIn0 = new CubicIn();
      double double0 = cubicIn0.compute(0.0, 0.0, 2666.0, (-2836.9133));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CubicIn cubicIn0 = new CubicIn();
      double double0 = cubicIn0.compute(825.8228474867, 1.0, 428.5149264292837, 1749.52457927992);
      assertEquals(46.067813810215156, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CubicIn cubicIn0 = new CubicIn();
      double double0 = cubicIn0.compute((-2836.9133), (-2836.9133), (-1.0), (-2836.9133));
      assertEquals((-2837.9133), double0, 0.01);
  }
}
