/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 13 18:57:41 GMT 2022
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
import us.parr.lib.collections.BaseMultiMap;
import us.parr.lib.collections.CountingHashSet;
import us.parr.lib.collections.CountingSet;
import us.parr.lib.collections.DenseIntSet;
import us.parr.lib.collections.MultiMapOfCountingSets;
import us.parr.lib.collections.MutableInt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultiMapOfCountingSets_ESTest extends MultiMapOfCountingSets_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiMapOfCountingSets<DenseIntSet, DenseIntSet> multiMapOfCountingSets0 = new MultiMapOfCountingSets<DenseIntSet, DenseIntSet>();
      DenseIntSet denseIntSet0 = new DenseIntSet(0);
      Collection<DenseIntSet> collection0 = multiMapOfCountingSets0.createValueCollection();
      multiMapOfCountingSets0.data.put(denseIntSet0, collection0);
      CountingSet<DenseIntSet> countingSet0 = multiMapOfCountingSets0.get(denseIntSet0);
      assertEquals(0, countingSet0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultiMapOfCountingSets<DenseIntSet, DenseIntSet> multiMapOfCountingSets0 = new MultiMapOfCountingSets<DenseIntSet, DenseIntSet>();
      DenseIntSet denseIntSet0 = new DenseIntSet(0);
      multiMapOfCountingSets0.put(denseIntSet0, denseIntSet0);
      CountingSet<DenseIntSet> countingSet0 = multiMapOfCountingSets0.get(denseIntSet0);
      assertEquals(1, countingSet0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiMapOfCountingSets<CountingHashSet<MutableInt>, DenseIntSet> multiMapOfCountingSets0 = new MultiMapOfCountingSets<CountingHashSet<MutableInt>, DenseIntSet>();
      multiMapOfCountingSets0.data = null;
      CountingHashSet<MutableInt> countingHashSet0 = new CountingHashSet<MutableInt>();
      // Undeclared exception!
      try { 
        multiMapOfCountingSets0.get(countingHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.parr.lib.collections.BaseMultiMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiMapOfCountingSets<Integer, DenseIntSet> multiMapOfCountingSets0 = new MultiMapOfCountingSets<Integer, DenseIntSet>();
      Integer integer0 = new Integer(0);
      LinkedList<DenseIntSet> linkedList0 = new LinkedList<DenseIntSet>();
      multiMapOfCountingSets0.set(integer0, linkedList0);
      // Undeclared exception!
      try { 
        multiMapOfCountingSets0.get(integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.util.LinkedList cannot be cast to class us.parr.lib.collections.CountingSet (java.util.LinkedList is in module java.base of loader 'bootstrap'; us.parr.lib.collections.CountingSet is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @2728f54d)
         //
         verifyException("us.parr.lib.collections.MultiMapOfCountingSets", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiMapOfCountingSets<DenseIntSet, DenseIntSet> multiMapOfCountingSets0 = new MultiMapOfCountingSets<DenseIntSet, DenseIntSet>();
      DenseIntSet denseIntSet0 = new DenseIntSet(0);
      CountingSet<DenseIntSet> countingSet0 = multiMapOfCountingSets0.get(denseIntSet0);
      assertNull(countingSet0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MultiMapOfCountingSets<DenseIntSet, DenseIntSet> multiMapOfCountingSets0 = new MultiMapOfCountingSets<DenseIntSet, DenseIntSet>();
      BaseMultiMap<DenseIntSet, DenseIntSet> baseMultiMap0 = multiMapOfCountingSets0.createCollection();
      assertNotNull(baseMultiMap0);
  }
}
