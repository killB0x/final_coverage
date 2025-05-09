/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 21:54:10 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Object>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Object> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Object>();
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node4 = new LinkedHashTreeMap.Node<Integer, Object>();
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Object>(linkedHashTreeMap_Node4);
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap1 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Integer, Object>>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap_Node0, (String) null);
      linkedHashTreeMap1.replace(abstractMap_SimpleEntry1, abstractMap_SimpleEntry0, abstractMap_SimpleEntry0);
      LinkedHashTreeMap<Object, String> linkedHashTreeMap2 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap2.new EntrySet();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry2 = new AbstractMap.SimpleEntry<String, String>("", "");
      AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<String, String>, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<String, String>, Object>(abstractMap_SimpleEntry2, "");
      linkedHashTreeMap_EntrySet0.contains(abstractMap_SimpleImmutableEntry0);
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap3 = new LinkedHashTreeMap<String, Integer>();
      Integer integer0 = new Integer(7);
      Integer integer1 = linkedHashTreeMap3.put("H=C992", integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      String string0 = linkedHashTreeMap_Node0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, String>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap_AvlBuilder0.root();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap$AvlBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Integer, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, String>();
      linkedHashTreeMap_AvlBuilder0.reset(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      Object object0 = new Object();
      linkedHashTreeMap0.removeInternalByKey(object0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      Integer integer0 = new Integer((-14));
      linkedHashTreeMap0.findByObject(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<Object, Object>>(comparator0);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node1 = linkedHashTreeMap0.find(abstractMap_SimpleEntry0, false);
      assertNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      Integer integer0 = Integer.getInteger("", 0);
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = linkedHashTreeMap0.get(integer0);
      linkedHashTreeMap0.put(integer0, abstractMap_SimpleEntry0);
      linkedHashTreeMap0.entrySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<String, Integer>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Integer>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>((Comparator<? super String>) null);
      boolean boolean0 = linkedHashTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<String, Comparable<String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Comparable<String>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, String>();
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, String>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap1, (Object) null);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(abstractMap_SimpleImmutableEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("i", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      linkedHashTreeMap0.find("i", true);
      Set<String> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.contains("i"));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("I;E'<RGb8G!e_4", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Integer, Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Integer>();
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 4);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node0, "iI)'3uz,N0}|tq8`", 2145, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node2;
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node2;
      // Undeclared exception!
      LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Integer>[]) linkedHashTreeMap_NodeArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Object>();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>>();
      LinkedHashTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>>(linkedHashTreeMap_Node0, "com.google.gson.internal.LinkedHashTreeMap$KeySet$1", 2090, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      boolean boolean0 = linkedHashTreeMap_Node2.equals(linkedHashTreeMap_Node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, Object>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("", "com.google.gson.internal.LinkedHashTreeMap$AvlIterator");
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>(abstractMap_SimpleEntry0);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<String, String>(abstractMap_SimpleImmutableEntry0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, Object>(linkedHashTreeMap_Node1, abstractMap_SimpleEntry1, 0, linkedHashTreeMap_Node1, linkedHashTreeMap_Node1);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>>();
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>>(linkedHashTreeMap_Node0, linkedHashTreeMap_Node0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      assertNotNull(linkedHashTreeMap_Node2);
      
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, Object> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, Object>();
      boolean boolean0 = linkedHashTreeMap_Node2.equals(linkedHashTreeMap_Node3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Integer>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>();
      Object object0 = linkedHashTreeMap_Node1.getValue();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, AbstractMap.SimpleEntry<Object, String>>();
      linkedHashTreeMap0.keySet();
      Set<LinkedHashTreeMap<Integer, Object>> set0 = linkedHashTreeMap0.keySet();
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer>();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.replaceAll(biFunction0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>>();
      Integer integer0 = new Integer(4);
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>>(linkedHashTreeMap_Node0, integer0, (-2467), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>>(linkedHashTreeMap_Node0, integer0, (-1028), linkedHashTreeMap_Node0, linkedHashTreeMap_Node1);
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<String, String>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node2, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>, AbstractMap.SimpleEntry<String, String>>();
      LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>, AbstractMap.SimpleEntry<String, String>>();
      LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>, AbstractMap.SimpleEntry<String, String>>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Integer>>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      int int0 = linkedHashTreeMap0.size();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Integer>((Comparator<? super AbstractMap.SimpleImmutableEntry<Object, String>>) null);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Integer>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("i", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("i", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      //  // Unstable assertion: assertEquals(1, linkedHashTreeMap0.size());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>((Comparator<? super Integer>) null);
      linkedHashTreeMap0.remove((Object) "!De>ptx6]LR:H!d^IQ");
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<LinkedHashTreeMap<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<String, String>, Integer>(comparator0);
      Integer integer0 = new Integer((-828));
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((LinkedHashTreeMap<String, String>) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains("I;E'<RGb8G!e_4");
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>((Comparator<? super String>) null);
      linkedHashTreeMap0.find("co[.goog/e.gson.internal.LinkedHashTreeMap$KeySet", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 3);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<String, Integer>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Integer>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(6, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Integer>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>();
      Object object0 = linkedHashTreeMap_Node1.setValue(linkedHashTreeMap_Node0);
      assertNull(object0);
      
      Object object1 = linkedHashTreeMap_Node1.getValue();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(object1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, AbstractMap.SimpleEntry<Object, String>>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, String>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 137, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap_Node1);
      Set<Map.Entry<LinkedHashTreeMap<Integer, Object>, AbstractMap.SimpleEntry<Object, String>>> set0 = (Set<Map.Entry<LinkedHashTreeMap<Integer, Object>, AbstractMap.SimpleEntry<Object, String>>>)linkedHashTreeMap0.entrySet();
      assertEquals(0, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<String, String>, Object>, Integer>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<String, String>>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("com.google.gson.internal.LinkedHashTreeMap$EntrySet$1", "");
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(abstractMap_SimpleImmutableEntry0, abstractMap_SimpleImmutableEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }
}
