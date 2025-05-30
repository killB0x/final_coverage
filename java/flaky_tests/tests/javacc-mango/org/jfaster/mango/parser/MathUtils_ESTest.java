/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 14:06:42 GMT 2022
 */

package org.jfaster.mango.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.parser.MathUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MathUtils_ESTest extends MathUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.compare((Number) null, (Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-25));
      Double double0 = Double.valueOf((-3535.91735218785));
      // Undeclared exception!
      try { 
        MathUtils.compare(integer0, double0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Double cannot be cast to class java.lang.Integer or class java.lang.Long
         //
         verifyException("org.jfaster.mango.parser.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = Integer.valueOf(2616);
      int int0 = MathUtils.compare(integer0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Long long0 = new Long(574L);
      int int0 = MathUtils.compare(0, long0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-2286));
      int int0 = MathUtils.compare(integer0, integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MathUtils mathUtils0 = new MathUtils();
  }
}
