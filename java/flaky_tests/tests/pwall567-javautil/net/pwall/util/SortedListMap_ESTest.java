/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 16:06:00 GMT 2022
 */

package net.pwall.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import net.pwall.util.ListMap;
import net.pwall.util.SortedListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SortedListMap_ESTest extends SortedListMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>(6047);
      assertTrue(sortedListMap0.isEmpty());
      assertEquals(0, sortedListMap0.size());
      assertNotNull(sortedListMap0);
      
      Integer integer0 = new Integer(6047);
      assertNotNull(integer0);
      assertEquals(6047, (int)integer0);
      
      UnaryOperator<Integer> unaryOperator0 = UnaryOperator.identity();
      assertNotNull(unaryOperator0);
      
      Integer integer1 = sortedListMap0.computeIfAbsent(integer0, unaryOperator0);
      assertEquals(1, sortedListMap0.size());
      assertFalse(sortedListMap0.isEmpty());
      assertNotNull(integer1);
      assertEquals(6047, (int)integer1);
      
      Integer integer2 = new Integer(1026);
      assertNotNull(integer2);
      assertEquals(1026, (int)integer2);
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer0));
      
      Integer integer3 = sortedListMap0.put(integer2, integer0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(2, sortedListMap0.size());
      assertNull(integer3);
      assertFalse(integer0.equals((Object)integer2));
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer0));
      
      int int0 = sortedListMap0.findIndex(integer2);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(2, sortedListMap0.size());
      assertEquals(0, int0);
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>(6047);
      assertEquals(0, sortedListMap0.size());
      assertTrue(sortedListMap0.isEmpty());
      assertNotNull(sortedListMap0);
      
      Integer integer0 = new Integer(1);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
      
      BiFunction<Integer, Integer, Integer> biFunction0 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Integer integer1 = sortedListMap0.merge(integer0, integer0, biFunction0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(1, sortedListMap0.size());
      assertNotNull(integer1);
      assertEquals(1, (int)integer1);
      
      Integer integer2 = new Integer(6047);
      assertNotNull(integer2);
      assertEquals(6047, (int)integer2);
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer0));
      
      UnaryOperator<Integer> unaryOperator0 = UnaryOperator.identity();
      assertNotNull(unaryOperator0);
      
      Integer integer3 = sortedListMap0.computeIfAbsent(integer2, unaryOperator0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(2, sortedListMap0.size());
      assertNotNull(integer3);
      assertEquals(6047, (int)integer3);
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer1));
      assertFalse(integer3.equals((Object)integer0));
      
      Integer integer4 = new Integer(0);
      assertNotNull(integer4);
      assertEquals(0, (int)integer4);
      assertFalse(integer4.equals((Object)integer1));
      assertFalse(integer4.equals((Object)integer3));
      assertFalse(integer4.equals((Object)integer2));
      assertFalse(integer4.equals((Object)integer0));
      
      Integer integer5 = sortedListMap0.put(integer4, integer2);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(3, sortedListMap0.size());
      assertNull(integer5);
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer4));
      assertFalse(integer2.equals((Object)integer0));
      assertFalse(integer4.equals((Object)integer1));
      assertFalse(integer4.equals((Object)integer3));
      assertFalse(integer4.equals((Object)integer2));
      assertFalse(integer4.equals((Object)integer0));
      
      int int0 = sortedListMap0.findIndex(integer3);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(3, sortedListMap0.size());
      assertEquals(2, int0);
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer4));
      assertFalse(integer2.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer1));
      assertFalse(integer3.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer4));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>(6047);
      assertEquals(0, sortedListMap0.size());
      assertTrue(sortedListMap0.isEmpty());
      assertNotNull(sortedListMap0);
      
      Integer integer0 = new Integer(1);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
      
      BiFunction<Integer, Integer, Integer> biFunction0 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Integer integer1 = sortedListMap0.merge(integer0, integer0, biFunction0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(1, sortedListMap0.size());
      assertNotNull(integer1);
      assertEquals(1, (int)integer1);
      
      Integer integer2 = new Integer(6047);
      assertNotNull(integer2);
      assertEquals(6047, (int)integer2);
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer0));
      
      Integer integer3 = new Integer(0);
      assertNotNull(integer3);
      assertEquals(0, (int)integer3);
      assertFalse(integer3.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer1));
      assertFalse(integer3.equals((Object)integer2));
      
      Integer integer4 = sortedListMap0.put(integer3, integer2);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(2, sortedListMap0.size());
      assertNull(integer4);
      assertFalse(integer2.equals((Object)integer3));
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer1));
      assertFalse(integer3.equals((Object)integer2));
      
      Integer integer5 = sortedListMap0.put(integer2, integer2);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(3, sortedListMap0.size());
      assertNull(integer5);
      assertFalse(integer2.equals((Object)integer3));
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>(6047);
      assertTrue(sortedListMap0.isEmpty());
      assertEquals(0, sortedListMap0.size());
      assertNotNull(sortedListMap0);
      
      Integer integer0 = new Integer(1);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
      
      Integer integer1 = new Integer(6047);
      assertNotNull(integer1);
      assertEquals(6047, (int)integer1);
      assertFalse(integer1.equals((Object)integer0));
      
      UnaryOperator<Integer> unaryOperator0 = UnaryOperator.identity();
      assertNotNull(unaryOperator0);
      
      Integer integer2 = sortedListMap0.computeIfAbsent(integer1, unaryOperator0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(1, sortedListMap0.size());
      assertNotNull(integer2);
      assertEquals(6047, (int)integer2);
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(integer2.equals((Object)integer0));
      
      Integer integer3 = sortedListMap0.put(integer1, integer0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(1, sortedListMap0.size());
      assertNotNull(integer3);
      assertEquals(6047, (int)integer3);
      assertFalse(integer0.equals((Object)integer1));
      assertFalse(integer0.equals((Object)integer2));
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(integer3.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SortedListMap<Integer, ListMap.Entry<Integer, Integer>> sortedListMap0 = new SortedListMap<Integer, ListMap.Entry<Integer, Integer>>();
      assertEquals(0, sortedListMap0.size());
      assertTrue(sortedListMap0.isEmpty());
      assertNotNull(sortedListMap0);
      
      Integer integer0 = new Integer(0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      ListMap.Entry<Integer, Integer> listMap_Entry0 = new ListMap.Entry<Integer, Integer>(integer0, integer0);
      assertNotNull(listMap_Entry0);
      
      ListMap.Entry<Integer, Integer> listMap_Entry1 = sortedListMap0.put(integer0, listMap_Entry0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(1, sortedListMap0.size());
      assertNull(listMap_Entry1);
      
      ListMap.Entry<Integer, Integer> listMap_Entry2 = sortedListMap0.put(integer0, listMap_Entry0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(1, sortedListMap0.size());
      assertNotNull(listMap_Entry2);
      assertSame(listMap_Entry0, listMap_Entry2);
      assertSame(listMap_Entry2, listMap_Entry0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>(6047);
      assertEquals(0, sortedListMap0.size());
      assertTrue(sortedListMap0.isEmpty());
      assertNotNull(sortedListMap0);
      
      Integer integer0 = new Integer(1);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
      
      BiFunction<Integer, Integer, Integer> biFunction0 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Integer integer1 = sortedListMap0.merge(integer0, integer0, biFunction0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(1, sortedListMap0.size());
      assertNotNull(integer1);
      assertEquals(1, (int)integer1);
      
      Integer integer2 = new Integer(6047);
      assertNotNull(integer2);
      assertEquals(6047, (int)integer2);
      assertFalse(integer2.equals((Object)integer0));
      assertFalse(integer2.equals((Object)integer1));
      
      UnaryOperator<Integer> unaryOperator0 = UnaryOperator.identity();
      assertNotNull(unaryOperator0);
      
      Integer integer3 = sortedListMap0.computeIfAbsent(integer2, unaryOperator0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(2, sortedListMap0.size());
      assertNotNull(integer3);
      assertEquals(6047, (int)integer3);
      assertFalse(integer2.equals((Object)integer0));
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer3.equals((Object)integer1));
      assertFalse(integer3.equals((Object)integer0));
      
      int int0 = sortedListMap0.findIndex(integer2);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(2, sortedListMap0.size());
      assertEquals(1, int0);
      assertFalse(integer2.equals((Object)integer0));
      assertFalse(integer2.equals((Object)integer1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>(1);
      assertEquals(0, sortedListMap0.size());
      assertTrue(sortedListMap0.isEmpty());
      assertNotNull(sortedListMap0);
      
      // Undeclared exception!
      try { 
        sortedListMap0.put((Integer) null, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>();
      assertEquals(0, sortedListMap0.size());
      assertTrue(sortedListMap0.isEmpty());
      assertNotNull(sortedListMap0);
      
      Integer integer0 = new Integer((-243));
      assertNotNull(integer0);
      assertEquals((-243), (int)integer0);
      
      Integer integer1 = sortedListMap0.put(integer0, integer0);
      assertFalse(sortedListMap0.isEmpty());
      assertEquals(1, sortedListMap0.size());
      assertNull(integer1);
      
      // Undeclared exception!
      try { 
        sortedListMap0.findIndex((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = null;
      try {
        sortedListMap0 = new SortedListMap<Integer, Integer>((Map<? extends Integer, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.pwall.util.ListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = null;
      try {
        sortedListMap0 = new SortedListMap<Integer, Integer>((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>(6047);
      assertTrue(sortedListMap0.isEmpty());
      assertEquals(0, sortedListMap0.size());
      assertNotNull(sortedListMap0);
      
      Integer integer0 = new Integer(1);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
      
      Integer integer1 = new Integer(6047);
      assertNotNull(integer1);
      assertEquals(6047, (int)integer1);
      assertFalse(integer1.equals((Object)integer0));
      
      UnaryOperator<Integer> unaryOperator0 = UnaryOperator.identity();
      assertNotNull(unaryOperator0);
      
      Integer integer2 = sortedListMap0.computeIfAbsent(integer1, unaryOperator0);
      assertEquals(1, sortedListMap0.size());
      assertFalse(sortedListMap0.isEmpty());
      assertNotNull(integer2);
      assertEquals(6047, (int)integer2);
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(integer2.equals((Object)integer0));
      
      int int0 = sortedListMap0.findIndex(integer0);
      assertEquals(1, sortedListMap0.size());
      assertFalse(sortedListMap0.isEmpty());
      assertEquals((-1), int0);
      assertFalse(integer0.equals((Object)integer1));
      assertFalse(integer0.equals((Object)integer2));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>(6047);
      Integer integer0 = new Integer(1);
      BiFunction<Integer, Integer, Integer> biFunction0 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      sortedListMap0.merge(integer0, integer0, biFunction0);
      Integer integer1 = new Integer(6047);
      UnaryOperator<Integer> unaryOperator0 = UnaryOperator.identity();
      sortedListMap0.computeIfAbsent(integer1, unaryOperator0);
      Integer integer2 = new Integer(0);
      sortedListMap0.put(integer2, integer1);
      ListMap.Entry<Integer, Integer> listMap_Entry0 = sortedListMap0.getEntry(2);
      // Undeclared exception!
      try { 
        sortedListMap0.findIndex(listMap_Entry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.pwall.util.ListMap$Entry cannot be cast to class java.lang.Comparable (net.pwall.util.ListMap$Entry is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @7ca1b68b; java.lang.Comparable is in module java.base of loader 'bootstrap')
         //
         verifyException("net.pwall.util.SortedListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SortedListMap<Integer, Integer> sortedListMap0 = new SortedListMap<Integer, Integer>();
      SortedListMap<Integer, Comparable<Integer>> sortedListMap1 = new SortedListMap<Integer, Comparable<Integer>>(sortedListMap0);
      assertTrue(sortedListMap1.isEmpty());
  }
}
