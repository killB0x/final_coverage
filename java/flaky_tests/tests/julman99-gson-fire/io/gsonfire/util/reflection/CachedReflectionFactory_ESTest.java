/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 10:34:20 GMT 2022
 */

package io.gsonfire.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.gsonfire.util.reflection.CachedReflectionFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CachedReflectionFactory_ESTest extends CachedReflectionFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CachedReflectionFactory cachedReflectionFactory0 = new CachedReflectionFactory();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        cachedReflectionFactory0.get(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.InstantiationException: java.lang.Integer
         //
         verifyException("io.gsonfire.util.reflection.CachedReflectionFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CachedReflectionFactory cachedReflectionFactory0 = new CachedReflectionFactory();
      // Undeclared exception!
      try { 
        cachedReflectionFactory0.get((Class<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CachedReflectionFactory cachedReflectionFactory0 = new CachedReflectionFactory();
      Class<Object> class0 = Object.class;
      Object object0 = cachedReflectionFactory0.get(class0);
      Object object1 = cachedReflectionFactory0.get(class0);
      assertSame(object1, object0);
  }
}
