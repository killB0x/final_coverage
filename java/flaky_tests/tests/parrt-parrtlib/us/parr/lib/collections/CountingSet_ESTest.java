/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 13 18:52:46 GMT 2022
 */

package us.parr.lib.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.parr.lib.collections.CountingDenseIntSet;
import us.parr.lib.collections.CountingHashSet;
import us.parr.lib.collections.CountingSet;
import us.parr.lib.collections.MutableInt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CountingSet_ESTest extends CountingSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CountingHashSet<Object> countingHashSet0 = new CountingHashSet<Object>();
      countingHashSet0.add(countingHashSet0);
      CountingHashSet<Object> countingHashSet1 = new CountingHashSet<Object>();
      boolean boolean0 = countingHashSet1.addAll((Collection<?>) countingHashSet0);
      assertEquals(1, countingHashSet1.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CountingHashSet<Object> countingHashSet0 = new CountingHashSet<Object>();
      CountingDenseIntSet countingDenseIntSet0 = new CountingDenseIntSet(375);
      // Undeclared exception!
      try { 
        countingHashSet0.addAll((CountingSet<?>) countingDenseIntSet0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CountingHashSet<Object> countingHashSet0 = new CountingHashSet<Object>();
      // Undeclared exception!
      try { 
        countingHashSet0.addAll((CountingSet<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.parr.lib.collections.CountingSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CountingHashSet<Object> countingHashSet0 = new CountingHashSet<Object>();
      CountingDenseIntSet countingDenseIntSet0 = new CountingDenseIntSet(1);
      // Undeclared exception!
      try { 
        countingHashSet0.addAll((Collection<?>) countingDenseIntSet0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CountingHashSet<MutableInt> countingHashSet0 = new CountingHashSet<MutableInt>();
      // Undeclared exception!
      try { 
        countingHashSet0.addAll((Collection<? extends MutableInt>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.parr.lib.collections.CountingSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CountingHashSet<Object> countingHashSet0 = new CountingHashSet<Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        countingHashSet0.addAll((Collection<?>) linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.util.LinkedList cannot be cast to class us.parr.lib.collections.CountingSet (java.util.LinkedList is in module java.base of loader 'bootstrap'; us.parr.lib.collections.CountingSet is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @5b21edf3)
         //
         verifyException("us.parr.lib.collections.CountingSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CountingHashSet<Object> countingHashSet0 = new CountingHashSet<Object>();
      CountingHashSet<Object> countingHashSet1 = new CountingHashSet<Object>(countingHashSet0);
      countingHashSet0.add(countingHashSet1);
      boolean boolean0 = countingHashSet1.addAll((CountingSet<?>) countingHashSet0);
      assertEquals(1, countingHashSet1.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CountingHashSet<Object> countingHashSet0 = new CountingHashSet<Object>();
      countingHashSet0.add(countingHashSet0);
      boolean boolean0 = countingHashSet0.addAll((CountingSet<?>) countingHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CountingHashSet<Object> countingHashSet0 = new CountingHashSet<Object>();
      boolean boolean0 = countingHashSet0.addAll((Collection<?>) countingHashSet0);
      assertFalse(boolean0);
  }
}
