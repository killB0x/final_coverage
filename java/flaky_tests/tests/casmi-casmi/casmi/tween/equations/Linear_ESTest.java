/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:48:48 GMT 2022
 */

package casmi.tween.equations;

import org.junit.Test;
import static org.junit.Assert.*;
import casmi.tween.equations.Linear;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Linear_ESTest extends Linear_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Linear linear0 = new Linear();
      double double0 = linear0.compute(0.0, 0.0, 0.0, 383.7);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Linear linear0 = new Linear();
      double double0 = linear0.compute((-735.4470446), 0.0, (-1587.1223778), 533.7);
      assertEquals(2187.0797492440224, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Linear linear0 = new Linear();
      double double0 = linear0.compute((-1880.8), (-1880.8), (-1880.8), (-1880.8));
      assertEquals((-3761.6), double0, 0.01);
  }
}
