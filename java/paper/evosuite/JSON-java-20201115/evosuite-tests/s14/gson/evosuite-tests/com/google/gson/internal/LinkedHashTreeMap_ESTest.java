/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 20:20:47 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlBuilder0.root();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = linkedHashTreeMap_Node0.getValue();
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      String string0 = linkedHashTreeMap0.put("J", "a:xAY=39");
      assertNull(string0);
      
      Collection<String> collection0 = linkedHashTreeMap0.values();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(";M}]aAd~_D", "mXB4q");
      linkedHashTreeMap0.putAll(hashMap0);
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap2 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node0, collection0, 1477, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      assertNotNull(linkedHashTreeMap_Node2);
      
      Object object0 = linkedHashTreeMap_Node2.getKey();
      assertNotNull(object0);
      
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(object0, "{[yEAi1+5;");
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry1 = linkedHashTreeMap2.getOrDefault("mXB4q", abstractMap_SimpleEntry0);
      assertNotNull(abstractMap_SimpleEntry1);
      
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(collection0);
      assertFalse(boolean0);
      assertTrue(collection0.contains("a:xAY=39"));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<String, String>, Comparable<Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<String, String>, Comparable<Integer>>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      int int0 = linkedHashTreeMap0.size();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      Integer integer0 = new Integer((-908));
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap0.put("Y,/ir'6pBS8cE!N_=F>", "Om");
      linkedHashTreeMap0.keySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      linkedHashTreeMap1.findByObject(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap<Object, Comparable<Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Comparable<Integer>>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Integer>(linkedHashTreeMap_Node0, linkedHashTreeMap_Node0, 2800, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node1);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>((Comparator<? super Integer>) null);
      Integer integer0 = new Integer(0);
      linkedHashTreeMap0.find(integer0, false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>((Comparator<? super Integer>) null);
      Set<Map.Entry<Integer, Object>> set0 = (Set<Map.Entry<Integer, Object>>)linkedHashTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      linkedHashTreeMap0.size = 2094;
      Set<Map.Entry<String, String>> set0 = (Set<Map.Entry<String, String>>)linkedHashTreeMap0.entrySet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>();
      boolean boolean0 = linkedHashTreeMap0.containsKey(linkedHashTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Integer, Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap.AvlIterator<String, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, String>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(linkedHashTreeMap_Node0, linkedHashTreeMap_AvlIterator0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
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
  public void test19()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find((Object) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>();
      Integer integer0 = new Integer((-1));
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>();
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>(linkedHashTreeMap_Node0, integer0, 4, linkedHashTreeMap_Node0, linkedHashTreeMap_Node1);
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node2.last();
      linkedHashTreeMap_Node2.left = linkedHashTreeMap_Node3;
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 2);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node3;
      // Undeclared exception!
      LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>[]) linkedHashTreeMap_NodeArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.containsKey(linkedHashTreeMap_Node0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Integer, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Integer, String>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node0, "", (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains("");
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, AbstractMap.SimpleEntry<String, Object>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node2 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<Integer, Object>>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<Integer, Object>>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 4);
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<Integer, Object>>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<Integer, Object>>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<Integer, Object>>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<Integer, Object>>>(linkedHashTreeMap_Node0, "vnt>zye!327sl%!xE{", (-2670), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_NodeArray0[3] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<Integer, Object>>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<Integer, Object>>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(8, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, String>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 4);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, String>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(8, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 1440, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node2);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      Integer integer0 = new Integer(2);
      AbstractMap.SimpleEntry<AbstractMap.SimpleEntry<Integer, Object>, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<AbstractMap.SimpleEntry<Integer, Object>, Integer>((AbstractMap.SimpleEntry<Integer, Object>) null, integer0);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(abstractMap_SimpleEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      Integer integer0 = new Integer(3374);
      linkedHashTreeMap_Node0.value = integer0;
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node0, "", (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>();
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      linkedHashTreeMap0.keySet();
      Set<AbstractMap.SimpleEntry<String, Object>> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Comparable<String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<String>, Object>(comparator0);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.forEach(biConsumer0);
      BiConsumer<Object, Object> biConsumer1 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.forEach(biConsumer1);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      Integer integer0 = new Integer(0);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Object>(linkedHashTreeMap_Node0, integer0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      Integer integer0 = new Integer(0);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Object>(linkedHashTreeMap_Node0, integer0, 641, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap1);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(abstractMap_SimpleEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      String string0 = linkedHashTreeMap0.put(";M}]aAd~_D", " is not Comparable");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyString() , anyString());
      linkedHashTreeMap0.comparator = comparator0;
      linkedHashTreeMap0.put("iK", "");
      linkedHashTreeMap0.putAll(linkedHashTreeMap0);
      //  // Unstable assertion: assertEquals(2, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Integer integer0 = new Integer(1);
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>(")NQm^(-5bz/KpRynFQ", integer0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      linkedHashTreeMap0.remove((Object) abstractMap_SimpleEntry0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      linkedHashTreeMap0.put(integer0, (Object) null);
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      Integer integer0 = linkedHashTreeMap0.compute(linkedHashTreeMap_Node0, biFunction0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((Object) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object>(comparator0);
      AbstractMap.SimpleImmutableEntry<Object, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, String>(linkedHashTreeMap0, "2@%$r0mK");
      linkedHashTreeMap0.find(abstractMap_SimpleImmutableEntry0, true);
      boolean boolean0 = linkedHashTreeMap0.containsKey("t3}o3iFB");
      assertEquals(1, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = linkedHashTreeMap1.get(linkedHashTreeMap0);
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, LinkedHashTreeMap<Object, String>>();
      linkedHashTreeMap_AvlBuilder0.reset(3419);
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedHashTreeMap_KeySet0.removeAll(linkedList0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap0.put("iK", "");
      linkedHashTreeMap0.putAll(linkedHashTreeMap0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object>();
      Object object0 = linkedHashTreeMap_Node0.setValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node0, "", (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Integer>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap1.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }
}
