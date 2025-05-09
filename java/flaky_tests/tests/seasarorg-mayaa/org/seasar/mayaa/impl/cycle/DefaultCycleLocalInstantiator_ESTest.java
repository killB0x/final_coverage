/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 02:33:24 GMT 2022
 */

package org.seasar.mayaa.impl.cycle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.seasar.mayaa.impl.cycle.DefaultCycleLocalInstantiator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultCycleLocalInstantiator_ESTest extends DefaultCycleLocalInstantiator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultCycleLocalInstantiator defaultCycleLocalInstantiator0 = new DefaultCycleLocalInstantiator();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        defaultCycleLocalInstantiator0.create(object0, objectArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.seasar.mayaa.impl.cycle.DefaultCycleLocalInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultCycleLocalInstantiator defaultCycleLocalInstantiator0 = new DefaultCycleLocalInstantiator();
      // Undeclared exception!
      try { 
        defaultCycleLocalInstantiator0.create((Object[]) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.seasar.mayaa.impl.cycle.DefaultCycleLocalInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultCycleLocalInstantiator defaultCycleLocalInstantiator0 = new DefaultCycleLocalInstantiator();
      defaultCycleLocalInstantiator0.destroy(defaultCycleLocalInstantiator0);
  }
}
