/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 11:02:49 GMT 2022
 */

package com.iciql.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iciql.util.WeakIdentityHashMap;
import java.util.AbstractMap;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WeakIdentityHashMap_ESTest extends WeakIdentityHashMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer(28);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      BiFunction<Object, Integer, Integer> biFunction0 = (BiFunction<Object, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      weakIdentityHashMap0.merge(abstractMap_SimpleImmutableEntry0, integer0, biFunction0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry1, integer0);
      Integer integer1 = weakIdentityHashMap0.remove((Object) integer0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, integer0);
      weakIdentityHashMap0.putIfAbsent(abstractMap_SimpleImmutableEntry2, integer0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      BiFunction<Integer, Integer, Integer> biFunction1 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      weakIdentityHashMap0.merge(abstractMap_SimpleImmutableEntry3, integer0, biFunction1);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, (Integer) null);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry4, integer0);
      weakIdentityHashMap0.replace((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, (Integer) null, integer1);
      assertEquals(5, weakIdentityHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer(45);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      BiFunction<Object, Integer, Integer> biFunction0 = (BiFunction<Object, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      weakIdentityHashMap0.merge(abstractMap_SimpleImmutableEntry0, integer0, biFunction0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry1, integer0);
      weakIdentityHashMap0.remove((Object) integer0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, integer0);
      weakIdentityHashMap0.putIfAbsent(abstractMap_SimpleImmutableEntry2, integer0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      BiFunction<Integer, Integer, Integer> biFunction1 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      weakIdentityHashMap0.merge(abstractMap_SimpleImmutableEntry3, integer0, biFunction1);
      Integer integer1 = weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, (Integer) null);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry4, integer0);
      weakIdentityHashMap0.remove((Object) integer1);
      assertFalse(weakIdentityHashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer((-1058));
      weakIdentityHashMap0.putIfAbsent((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      Integer integer1 = weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer1);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      assertEquals(1, weakIdentityHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WeakIdentityHashMap<Integer, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<Integer, Integer>();
      Integer integer0 = new Integer(2);
      BiFunction<Integer, Integer, Integer> biFunction0 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      weakIdentityHashMap0.merge(integer0, integer0, biFunction0);
      int int0 = weakIdentityHashMap0.size();
      assertFalse(weakIdentityHashMap0.isEmpty());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WeakIdentityHashMap<Integer, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<Integer, Integer>();
      WeakIdentityHashMap<Comparable<Integer>, Comparable<Integer>> weakIdentityHashMap1 = new WeakIdentityHashMap<Comparable<Integer>, Comparable<Integer>>();
      weakIdentityHashMap1.get(weakIdentityHashMap0);
      assertTrue(weakIdentityHashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WeakIdentityHashMap<Integer, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<Integer, Integer>();
      WeakIdentityHashMap<Object, Integer> weakIdentityHashMap1 = new WeakIdentityHashMap<Object, Integer>();
      boolean boolean0 = weakIdentityHashMap1.containsKey(weakIdentityHashMap0);
      assertFalse(boolean0);
      assertEquals(0, weakIdentityHashMap1.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WeakIdentityHashMap<Comparable<Object>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<Comparable<Object>, Integer>();
      boolean boolean0 = weakIdentityHashMap0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(1);
      WeakIdentityHashMap<Integer, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<Integer, Integer>();
      weakIdentityHashMap0.put(integer0, integer0);
      boolean boolean0 = weakIdentityHashMap0.isEmpty();
      assertEquals(1, weakIdentityHashMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer(1138);
      weakIdentityHashMap0.putIfAbsent((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      boolean boolean0 = weakIdentityHashMap0.containsValue(integer0);
      assertEquals(1, weakIdentityHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      boolean boolean0 = weakIdentityHashMap0.containsValue((Object) null);
      assertFalse(boolean0);
      assertTrue(weakIdentityHashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer(1138);
      boolean boolean0 = weakIdentityHashMap0.containsValue(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(1);
      WeakIdentityHashMap<Integer, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<Integer, Integer>();
      weakIdentityHashMap0.put(integer0, integer0);
      boolean boolean0 = weakIdentityHashMap0.containsKey(integer0);
      assertEquals(1, weakIdentityHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer((-1105));
      weakIdentityHashMap0.remove((Object) integer0);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, (Integer) null);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, (Integer) null);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, (Integer) null);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry0, (Integer) null);
      boolean boolean0 = weakIdentityHashMap0.replace((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, (Integer) null, (Integer) null);
      assertEquals(1, weakIdentityHashMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer(19);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      BiFunction<Object, Integer, Integer> biFunction0 = (BiFunction<Object, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Integer integer1 = weakIdentityHashMap0.merge(abstractMap_SimpleImmutableEntry0, integer0, biFunction0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      Integer integer2 = weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry1, integer0);
      BiFunction<Integer, Integer, Integer> biFunction1 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction1).apply(anyInt() , anyInt());
      weakIdentityHashMap0.merge(abstractMap_SimpleImmutableEntry1, integer1, biFunction1);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer2);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer2);
      assertEquals(2, weakIdentityHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer(28);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      BiFunction<Object, Integer, Integer> biFunction0 = (BiFunction<Object, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      weakIdentityHashMap0.merge(abstractMap_SimpleImmutableEntry0, integer0, biFunction0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry1, integer0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, integer0);
      weakIdentityHashMap0.putIfAbsent(abstractMap_SimpleImmutableEntry2, integer0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      BiFunction<Integer, Integer, Integer> biFunction1 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      weakIdentityHashMap0.merge(abstractMap_SimpleImmutableEntry3, integer0, biFunction1);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, integer0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, (Integer) null);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry4, integer0);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry1, (Integer) null);
      assertEquals(5, weakIdentityHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer((-1105));
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, (Integer) null);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, (Integer) null);
      weakIdentityHashMap0.replace((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, (Integer) null, (Integer) null);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry0, integer0);
      assertEquals(1, weakIdentityHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WeakIdentityHashMap<Object, Object> weakIdentityHashMap0 = new WeakIdentityHashMap<Object, Object>();
      WeakIdentityHashMap<Integer, Object> weakIdentityHashMap1 = new WeakIdentityHashMap<Integer, Object>();
      // Undeclared exception!
      try { 
        weakIdentityHashMap0.putAll(weakIdentityHashMap1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.util.WeakIdentityHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, AbstractMap.SimpleImmutableEntry<Integer, Integer>> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, AbstractMap.SimpleImmutableEntry<Integer, Integer>>();
      // Undeclared exception!
      try { 
        weakIdentityHashMap0.entrySet();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.util.WeakIdentityHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WeakIdentityHashMap<Integer, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<Integer, Integer>();
      // Undeclared exception!
      try { 
        weakIdentityHashMap0.values();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.util.WeakIdentityHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      Integer integer0 = new Integer((-1105));
      weakIdentityHashMap0.remove((Object) integer0);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, (Integer) null);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, (Integer) null);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, (Integer) null);
      weakIdentityHashMap0.put(abstractMap_SimpleImmutableEntry0, (Integer) null);
      weakIdentityHashMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Integer>) null, (Integer) null);
      assertEquals(2, weakIdentityHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      WeakIdentityHashMap<Comparable<Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<Comparable<Integer>, Integer>();
      int int0 = weakIdentityHashMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      weakIdentityHashMap0.clear();
      assertEquals(0, weakIdentityHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WeakIdentityHashMap<Integer, Integer> weakIdentityHashMap0 = new WeakIdentityHashMap<Integer, Integer>();
      // Undeclared exception!
      try { 
        weakIdentityHashMap0.keySet();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.util.WeakIdentityHashMap", e);
      }
  }
}
