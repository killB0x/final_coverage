/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 03:21:35 GMT 2022
 */

package org.codelibs.jhighlight.fastutil.chars;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.codelibs.jhighlight.fastutil.chars.AbstractChar2ObjectMap;
import org.codelibs.jhighlight.fastutil.chars.Char2ObjectMap;
import org.codelibs.jhighlight.fastutil.chars.Char2ObjectOpenHashMap;
import org.codelibs.jhighlight.fastutil.objects.ObjectCollection;
import org.codelibs.jhighlight.fastutil.objects.ObjectSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractChar2ObjectMap_ESTest extends AbstractChar2ObjectMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>>(2428);
      Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>> char2ObjectOpenHashMap1 = char2ObjectOpenHashMap0.clone();
      assertTrue(char2ObjectOpenHashMap1.equals((Object)char2ObjectOpenHashMap0));
      
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap2 = new Char2ObjectOpenHashMap<Object>();
      char2ObjectOpenHashMap1.put('7', char2ObjectOpenHashMap2);
      boolean boolean0 = char2ObjectOpenHashMap1.equals(char2ObjectOpenHashMap0);
      assertFalse(char2ObjectOpenHashMap1.equals((Object)char2ObjectOpenHashMap0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>();
      Character character0 = Character.valueOf('u');
      AbstractChar2ObjectMap.BasicEntry<Object> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Object>('u', (Object) char2ObjectOpenHashMap0);
      Character character1 = Character.valueOf('N');
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry1 = new AbstractChar2ObjectMap.BasicEntry<Character>(character1, character0);
      boolean boolean0 = abstractChar2ObjectMap_BasicEntry1.equals(abstractChar2ObjectMap_BasicEntry0);
      assertFalse(boolean0);
      assertEquals('u', (char)abstractChar2ObjectMap_BasicEntry0.getKey());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Character, Character> hashMap0 = new HashMap<Character, Character>();
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>(hashMap0, 0.25F);
      char2ObjectOpenHashMap0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>();
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap1 = new Char2ObjectOpenHashMap<Object>((Map<? extends Character, ?>) char2ObjectOpenHashMap0);
      ObjectCollection<Object> objectCollection0 = char2ObjectOpenHashMap1.values();
      assertNotNull(objectCollection0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Character, Character> hashMap0 = new HashMap<Character, Character>();
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>(hashMap0, 0.25F);
      boolean boolean0 = char2ObjectOpenHashMap0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>(4);
      Character character0 = Character.valueOf('s');
      char2ObjectOpenHashMap0.put(character0, character0);
      boolean boolean0 = char2ObjectOpenHashMap0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>();
      Character character0 = Character.valueOf('R');
      char2ObjectOpenHashMap0.put(character0, character0);
      boolean boolean0 = char2ObjectOpenHashMap0.containsValue(character0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>();
      Character character0 = Character.valueOf('R');
      boolean boolean0 = char2ObjectOpenHashMap0.containsValue(character0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Character, Character> hashMap0 = new HashMap<Character, Character>();
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>(hashMap0, 0.25F);
      Character character0 = Character.valueOf('B');
      char2ObjectOpenHashMap0.put(character0, character0);
      boolean boolean0 = char2ObjectOpenHashMap0.containsKey('B');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Character, Character> hashMap0 = new HashMap<Character, Character>();
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>(hashMap0, 0.25F);
      boolean boolean0 = char2ObjectOpenHashMap0.containsKey('r');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>(2719669);
      char2ObjectOpenHashMap0.put('|', (Object) null);
      // Undeclared exception!
      char2ObjectOpenHashMap0.toString();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>();
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap1 = new Char2ObjectOpenHashMap<Object>();
      char2ObjectOpenHashMap1.put('+', (Object) char2ObjectOpenHashMap0);
      char2ObjectOpenHashMap1.size = (-62);
      // Undeclared exception!
      try { 
        char2ObjectOpenHashMap1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectOpenHashMap$MapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>();
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap1 = new Char2ObjectOpenHashMap<Object>();
      char2ObjectOpenHashMap1.n = 524;
      char2ObjectOpenHashMap1.put('B', (Object) char2ObjectOpenHashMap0);
      // Undeclared exception!
      try { 
        char2ObjectOpenHashMap1.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>();
      char2ObjectOpenHashMap0.size = (-1262);
      // Undeclared exception!
      try { 
        char2ObjectOpenHashMap0.putAll(char2ObjectOpenHashMap0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Character, Character> hashMap0 = new HashMap<Character, Character>();
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>(370663);
      // Undeclared exception!
      char2ObjectOpenHashMap0.containsValue(hashMap0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>();
      ObjectSet<Map.Entry<Character, Object>> objectSet0 = (ObjectSet<Map.Entry<Character, Object>>)char2ObjectOpenHashMap0.entrySet();
      assertEquals(0, objectSet0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>();
      char2ObjectOpenHashMap0.put('!', (Object) char2ObjectOpenHashMap0);
      String string0 = char2ObjectOpenHashMap0.toString();
      assertEquals("{!=>(this map)}", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>>(2428);
      Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>> char2ObjectOpenHashMap1 = new Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>>((Map<? extends Character, ? extends Char2ObjectOpenHashMap<Object>>) char2ObjectOpenHashMap0);
      assertTrue(char2ObjectOpenHashMap1.equals((Object)char2ObjectOpenHashMap0));
      
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap2 = new Char2ObjectOpenHashMap<Object>();
      char2ObjectOpenHashMap0.put('7', char2ObjectOpenHashMap2);
      boolean boolean0 = char2ObjectOpenHashMap1.equals(char2ObjectOpenHashMap0);
      assertFalse(char2ObjectOpenHashMap1.equals((Object)char2ObjectOpenHashMap0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>>(2428);
      Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>> char2ObjectOpenHashMap1 = new Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>>((Map<? extends Character, ? extends Char2ObjectOpenHashMap<Object>>) char2ObjectOpenHashMap0);
      boolean boolean0 = char2ObjectOpenHashMap1.equals(char2ObjectOpenHashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>();
      AbstractChar2ObjectMap.BasicEntry<Char2ObjectOpenHashMap<Object>> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Char2ObjectOpenHashMap<Object>>('F', char2ObjectOpenHashMap0);
      boolean boolean0 = char2ObjectOpenHashMap0.equals(abstractChar2ObjectMap_BasicEntry0.value);
      assertTrue(boolean0);
      assertEquals('F', (char)abstractChar2ObjectMap_BasicEntry0.getKey());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>();
      Character character0 = Character.valueOf('-');
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Character>('-', character0);
      AbstractChar2ObjectMap.BasicEntry<Object> abstractChar2ObjectMap_BasicEntry1 = new AbstractChar2ObjectMap.BasicEntry<Object>('\u008B', (Object) abstractChar2ObjectMap_BasicEntry0);
      HashMap<Character, Object> hashMap0 = new HashMap<Character, Object>(char2ObjectOpenHashMap0);
      hashMap0.getOrDefault(abstractChar2ObjectMap_BasicEntry1, character0);
      assertEquals('\u008B', abstractChar2ObjectMap_BasicEntry1.getCharKey());
      assertEquals('-', (char)abstractChar2ObjectMap_BasicEntry0.getKey());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Character character0 = Character.valueOf('p');
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Character>('p', (Character) null);
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry1 = new AbstractChar2ObjectMap.BasicEntry<Character>(character0, character0);
      boolean boolean0 = abstractChar2ObjectMap_BasicEntry1.equals(abstractChar2ObjectMap_BasicEntry0);
      assertEquals('p', abstractChar2ObjectMap_BasicEntry0.getCharKey());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Character character0 = Character.valueOf('y');
      AbstractChar2ObjectMap.BasicEntry<Object> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Object>('t', (Object) character0);
      Character character1 = Character.valueOf('t');
      abstractChar2ObjectMap_BasicEntry0.value = (Object) null;
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry1 = new AbstractChar2ObjectMap.BasicEntry<Character>(character1, (Character) null);
      boolean boolean0 = abstractChar2ObjectMap_BasicEntry1.equals(abstractChar2ObjectMap_BasicEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Character character0 = Character.valueOf('(');
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Character>(character0, character0);
      boolean boolean0 = abstractChar2ObjectMap_BasicEntry0.equals(abstractChar2ObjectMap_BasicEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Character character0 = Character.valueOf('y');
      AbstractChar2ObjectMap.BasicEntry<Object> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Object>('t', (Object) character0);
      Character character1 = Character.valueOf('t');
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry1 = new AbstractChar2ObjectMap.BasicEntry<Character>(character1, (Character) null);
      boolean boolean0 = abstractChar2ObjectMap_BasicEntry1.equals(abstractChar2ObjectMap_BasicEntry0);
      assertEquals('t', (char)abstractChar2ObjectMap_BasicEntry0.getKey());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>();
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap1 = new Char2ObjectOpenHashMap<Object>((Map<? extends Character, ?>) char2ObjectOpenHashMap0);
      Char2ObjectMap.FastEntrySet<Object> char2ObjectMap_FastEntrySet0 = char2ObjectOpenHashMap1.char2ObjectEntrySet();
      Character character0 = Character.valueOf('R');
      AbstractChar2ObjectMap.BasicEntry<Object> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Object>('@', (Object) char2ObjectMap_FastEntrySet0);
      boolean boolean0 = abstractChar2ObjectMap_BasicEntry0.equals(character0);
      assertEquals('@', (char)abstractChar2ObjectMap_BasicEntry0.getKey());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Character character0 = Character.valueOf('y');
      AbstractChar2ObjectMap.BasicEntry<Object> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Object>('t', (Object) character0);
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry1 = new AbstractChar2ObjectMap.BasicEntry<Character>(character0, (Character) null);
      boolean boolean0 = abstractChar2ObjectMap_BasicEntry1.equals(abstractChar2ObjectMap_BasicEntry0);
      assertFalse(boolean0);
      assertEquals('t', (char)abstractChar2ObjectMap_BasicEntry0.getKey());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>();
      HashMap<Character, Object> hashMap0 = new HashMap<Character, Object>();
      hashMap0.put((Character) null, (Object) null);
      // Undeclared exception!
      try { 
        char2ObjectOpenHashMap0.putAll(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectOpenHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Character character0 = Character.valueOf('R');
      Object object0 = new Object();
      AbstractChar2ObjectMap.BasicEntry<Object> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Object>(character0, object0);
      // Undeclared exception!
      try { 
        abstractChar2ObjectMap_BasicEntry0.setValue((Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractChar2ObjectMap$BasicEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Character character0 = Character.valueOf('-');
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Character>('x', character0);
      Character character1 = abstractChar2ObjectMap_BasicEntry0.getKey();
      assertEquals('x', (char)character1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<Character, Character> hashMap0 = new HashMap<Character, Character>();
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>(hashMap0, 0.25F);
      AbstractChar2ObjectMap.BasicEntry<Char2ObjectOpenHashMap<Character>> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Char2ObjectOpenHashMap<Character>>('A', char2ObjectOpenHashMap0);
      char char0 = abstractChar2ObjectMap_BasicEntry0.getCharKey();
      assertEquals('A', char0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      AbstractChar2ObjectMap.BasicEntry<Object> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Object>('C', object0);
      abstractChar2ObjectMap_BasicEntry0.toString();
      assertEquals('C', abstractChar2ObjectMap_BasicEntry0.getCharKey());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Character character0 = Character.valueOf('-');
      AbstractChar2ObjectMap.BasicEntry<Character> abstractChar2ObjectMap_BasicEntry0 = new AbstractChar2ObjectMap.BasicEntry<Character>('-', character0);
      AbstractChar2ObjectMap.BasicEntry<Object> abstractChar2ObjectMap_BasicEntry1 = new AbstractChar2ObjectMap.BasicEntry<Object>('\u008B', (Object) abstractChar2ObjectMap_BasicEntry0);
      AbstractChar2ObjectMap.BasicEntry abstractChar2ObjectMap_BasicEntry2 = (AbstractChar2ObjectMap.BasicEntry)abstractChar2ObjectMap_BasicEntry1.getValue();
      assertNotNull(abstractChar2ObjectMap_BasicEntry2);
      assertEquals('-', (char)abstractChar2ObjectMap_BasicEntry2.getKey());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Char2ObjectOpenHashMap<Object>>(3);
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap1 = new Char2ObjectOpenHashMap<Object>((Map<? extends Character, ?>) char2ObjectOpenHashMap0);
      boolean boolean0 = char2ObjectOpenHashMap1.equals("{}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>();
      char2ObjectOpenHashMap0.put('Q', (Object) null);
      char2ObjectOpenHashMap0.putAll(char2ObjectOpenHashMap0);
      assertTrue(char2ObjectOpenHashMap0.rehash());
  }
}
