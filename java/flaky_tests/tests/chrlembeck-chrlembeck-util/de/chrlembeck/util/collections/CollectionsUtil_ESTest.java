/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 18:18:26 GMT 2022
 */

package de.chrlembeck.util.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.chrlembeck.util.collections.CollectionsUtil;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CollectionsUtil_ESTest extends CollectionsUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      Integer integer0 = new Integer(0);
      linkedList0.add((Object) integer0);
      // Undeclared exception!
      try { 
        CollectionsUtil.isNullOrEmpty((Collection<Object>) list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList$SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(1);
      linkedList0.add((Object) integer0);
      boolean boolean0 = CollectionsUtil.isNullOrEmpty((Collection<Object>) linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = CollectionsUtil.isNullOrEmpty((Collection<Object>) linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = CollectionsUtil.isNullOrEmpty((Collection<Integer>) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CollectionsUtil collectionsUtil0 = new CollectionsUtil();
  }
}
