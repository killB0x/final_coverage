/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 03:26:54 GMT 2022
 */

package org.codelibs.jhighlight.fastutil.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.codelibs.jhighlight.fastutil.objects.ObjectIterators;
import org.codelibs.jhighlight.fastutil.objects.ObjectListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractObjectBidirectionalIterator_ESTest extends AbstractObjectBidirectionalIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectIterators.EmptyIterator<Object> objectIterators_EmptyIterator0 = new ObjectIterators.EmptyIterator<Object>();
      ObjectIterators.UnmodifiableListIterator<Object> objectIterators_UnmodifiableListIterator0 = new ObjectIterators.UnmodifiableListIterator<Object>(objectIterators_EmptyIterator0);
      int int0 = objectIterators_UnmodifiableListIterator0.back((-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectIterators.UnmodifiableListIterator<Object> objectIterators_UnmodifiableListIterator0 = new ObjectIterators.UnmodifiableListIterator<Object>((ObjectListIterator<Object>) null);
      // Undeclared exception!
      try { 
        objectIterators_UnmodifiableListIterator0.back(1431);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.objects.ObjectIterators$UnmodifiableListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectIterators.EmptyIterator<Object> objectIterators_EmptyIterator0 = new ObjectIterators.EmptyIterator<Object>();
      ObjectIterators.UnmodifiableBidirectionalIterator<Object> objectIterators_UnmodifiableBidirectionalIterator0 = new ObjectIterators.UnmodifiableBidirectionalIterator<Object>(objectIterators_EmptyIterator0);
      int int0 = objectIterators_UnmodifiableBidirectionalIterator0.back(0);
      assertEquals(0, int0);
  }
}
