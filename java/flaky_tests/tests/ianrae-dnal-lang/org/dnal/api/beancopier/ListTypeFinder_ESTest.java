/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 03:39:43 GMT 2022
 */

package org.dnal.api.beancopier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.dnal.api.beancopier.ListTypeFinder;
import org.dnal.compiler.et.XErrorTracker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ListTypeFinder_ESTest extends ListTypeFinder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XErrorTracker xErrorTracker0 = new XErrorTracker();
      ListTypeFinder listTypeFinder0 = new ListTypeFinder(xErrorTracker0);
      // Undeclared exception!
      try { 
        listTypeFinder0.isListType((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XErrorTracker xErrorTracker0 = new XErrorTracker();
      ListTypeFinder listTypeFinder0 = new ListTypeFinder(xErrorTracker0);
      Class<Object> class0 = Object.class;
      boolean boolean0 = listTypeFinder0.isListType(class0);
      assertEquals(0, listTypeFinder0.listDepth);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XErrorTracker xErrorTracker0 = new XErrorTracker();
      ListTypeFinder listTypeFinder0 = new ListTypeFinder(xErrorTracker0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        listTypeFinder0.getListElementType((Method) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.api.beancopier.ListTypeFinder", e);
      }
  }
}
