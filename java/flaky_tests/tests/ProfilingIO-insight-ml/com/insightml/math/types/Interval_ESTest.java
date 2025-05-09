/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 12:20:28 GMT 2022
 */

package com.insightml.math.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.insightml.math.types.Interval;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Interval_ESTest extends Interval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Interval interval0 = null;
      try {
        interval0 = new Interval((-4638.7052434836505), (-755.81913));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.insightml.math.types.Interval", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Interval interval0 = null;
      try {
        interval0 = new Interval((-1730.6048), (-1730.6048));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.insightml.math.types.Interval", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Interval interval0 = null;
      try {
        interval0 = new Interval((-569.0), (-1730.6048));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.insightml.math.types.Interval", e);
      }
  }
}
