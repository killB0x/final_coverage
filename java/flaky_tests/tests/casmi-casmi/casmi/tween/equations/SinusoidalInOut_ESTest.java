/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:52:39 GMT 2022
 */

package casmi.tween.equations;

import org.junit.Test;
import static org.junit.Assert.*;
import casmi.tween.equations.SinusoidalInOut;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SinusoidalInOut_ESTest extends SinusoidalInOut_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinusoidalInOut sinusoidalInOut0 = new SinusoidalInOut();
      double double0 = sinusoidalInOut0.compute((-1.0), 1236.63073558564, 0.0, 1236.63073558564);
      assertEquals(1236.63073558564, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SinusoidalInOut sinusoidalInOut0 = new SinusoidalInOut();
      double double0 = sinusoidalInOut0.compute(0.0, 0.0, (-1735.712), 4382.196);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SinusoidalInOut sinusoidalInOut0 = new SinusoidalInOut();
      double double0 = sinusoidalInOut0.compute((-3603.92), (-3603.92), (-2036.6444283193764), 287.1301974);
      assertEquals((-4786.339349461677), double0, 0.01);
  }
}
