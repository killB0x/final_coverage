/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 03:31:12 GMT 2022
 */

package org.codelibs.jhighlight.fastutil.chars;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.function.UnaryOperator;
import org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunction;
import org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions;
import org.codelibs.jhighlight.fastutil.chars.Char2ObjectOpenHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Char2ObjectFunctions_ESTest extends Char2ObjectFunctions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_UnmodifiableFunction0.containsKey((Object) char2ObjectFunctions_EmptyFunction0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$EmptyFunction cannot be cast to class java.lang.Character (org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$EmptyFunction is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @4b363063; java.lang.Character is in module java.base of loader 'bootstrap')
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractChar2ObjectFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Character character0 = Character.valueOf(',');
      UnaryOperator<Object> unaryOperator0 = UnaryOperator.identity();
      Char2ObjectFunctions.EmptyFunction<Character> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Character>();
      Char2ObjectFunctions.SynchronizedFunction<Character> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Character>(char2ObjectFunctions_EmptyFunction0, unaryOperator0);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_SynchronizedFunction0.put(',', character0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractChar2ObjectFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(5262);
      Char2ObjectFunctions.Singleton<Integer> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Integer>('h', integer0);
      Integer integer1 = char2ObjectFunctions_Singleton0.get('G');
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      Object object0 = char2ObjectFunctions_UnmodifiableFunction0.get((Object) char2ObjectFunctions_UnmodifiableFunction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>(9721);
      Character character0 = Character.valueOf(',');
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectOpenHashMap0);
      Object object0 = char2ObjectFunctions_SynchronizedFunction0.remove((Object) character0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Char2ObjectOpenHashMap<Object> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Object>(598);
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectOpenHashMap0);
      Object object0 = char2ObjectFunctions_SynchronizedFunction0.remove('u');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_UnmodifiableFunction0.put('!', (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$UnmodifiableFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Char2ObjectOpenHashMap<Integer> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Integer>();
      Char2ObjectFunctions.UnmodifiableFunction<Integer> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Integer>(char2ObjectOpenHashMap0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_UnmodifiableFunction0.defaultReturnValue(integer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$UnmodifiableFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      boolean boolean0 = char2ObjectFunctions_UnmodifiableFunction0.containsKey('c');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-497));
      Char2ObjectFunctions.Singleton<Object> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Object>('R', integer0);
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectFunctions_Singleton0);
      int int0 = char2ObjectFunctions_SynchronizedFunction0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Char2ObjectOpenHashMap<Integer> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Integer>(1724);
      Char2ObjectFunction<Object> char2ObjectFunction0 = Char2ObjectFunctions.singleton('o', (Object) char2ObjectOpenHashMap0);
      Character character0 = Character.valueOf('o');
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectFunction0, character0);
      boolean boolean0 = char2ObjectFunctions_SynchronizedFunction0.containsKey((Object) character0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Char2ObjectFunctions.Singleton<Object> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Object>('N', (Object) null);
      boolean boolean0 = char2ObjectFunctions_Singleton0.containsKey('R');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Object object0 = char2ObjectFunctions_EmptyFunction0.get((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Character> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Character>();
      Object object0 = char2ObjectFunctions_EmptyFunction0.get('K');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_EmptyFunction0.defaultReturnValue((Object) integer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$EmptyFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Object object0 = char2ObjectFunctions_EmptyFunction0.defaultReturnValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      boolean boolean0 = char2ObjectFunctions_EmptyFunction0.containsKey('c');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      int int0 = char2ObjectFunctions_UnmodifiableFunction0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Character character0 = Character.valueOf('c');
      Char2ObjectFunction<Object> char2ObjectFunction0 = Char2ObjectFunctions.singleton(character0, (Object) null);
      assertNotNull(char2ObjectFunction0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Char2ObjectFunctions.unmodifiable((Char2ObjectFunction<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$UnmodifiableFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Char2ObjectFunctions.synchronize((Char2ObjectFunction<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$SynchronizedFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Char2ObjectFunctions.synchronize((Char2ObjectFunction<Integer>) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$SynchronizedFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Char2ObjectOpenHashMap<Integer> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Integer>();
      Char2ObjectFunctions.Singleton<Object> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Object>('P', char2ObjectOpenHashMap0);
      Char2ObjectOpenHashMap char2ObjectOpenHashMap1 = (Char2ObjectOpenHashMap)char2ObjectFunctions_Singleton0.get('P');
      assertEquals(16, char2ObjectOpenHashMap1.growthFactor());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Character character0 = Character.valueOf('O');
      Char2ObjectFunctions.Singleton<Object> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Object>('q', character0);
      Object object0 = char2ObjectFunctions_Singleton0.get((Object) character0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      char2ObjectFunctions_EmptyFunction0.clear();
      assertEquals(0, char2ObjectFunctions_EmptyFunction0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.EmptyFunction char2ObjectFunctions_EmptyFunction1 = (Char2ObjectFunctions.EmptyFunction)char2ObjectFunctions_EmptyFunction0.clone();
      assertEquals(0, char2ObjectFunctions_EmptyFunction1.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Char2ObjectFunctions.singleton((Character) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunction<Object> char2ObjectFunction0 = Char2ObjectFunctions.synchronize((Char2ObjectFunction<Object>) char2ObjectFunctions_EmptyFunction0, (Object) null);
      assertNotNull(char2ObjectFunction0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_UnmodifiableFunction0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$UnmodifiableFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_UnmodifiableFunction0.remove('');
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$UnmodifiableFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_UnmodifiableFunction0.remove((Object) char2ObjectFunctions_EmptyFunction0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$UnmodifiableFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Integer integer0 = new Integer((-497));
      Char2ObjectFunctions.Singleton<Object> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Object>('R', integer0);
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectFunctions_Singleton0);
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_SynchronizedFunction0);
      String string0 = char2ObjectFunctions_UnmodifiableFunction0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Integer integer0 = new Integer((-497));
      Char2ObjectFunctions.Singleton<Object> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Object>('R', integer0);
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectFunctions_Singleton0);
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_SynchronizedFunction0);
      Object object0 = char2ObjectFunctions_UnmodifiableFunction0.get('j');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashMap<Character, Character> hashMap0 = new HashMap<Character, Character>();
      Char2ObjectOpenHashMap<Character> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Character>(hashMap0, 0.5F);
      Char2ObjectFunction<Character> char2ObjectFunction0 = Char2ObjectFunctions.unmodifiable((Char2ObjectFunction<Character>) char2ObjectOpenHashMap0);
      Char2ObjectFunctions.SynchronizedFunction<Character> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Character>(char2ObjectFunction0);
      Character character0 = Character.valueOf('R');
      // Undeclared exception!
      try { 
        char2ObjectFunctions_SynchronizedFunction0.defaultReturnValue(character0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.Char2ObjectFunctions$UnmodifiableFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      Object object0 = char2ObjectFunctions_UnmodifiableFunction0.defaultReturnValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Integer> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Integer>();
      Char2ObjectFunctions.SynchronizedFunction<Integer> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Integer>(char2ObjectFunctions_EmptyFunction0);
      Char2ObjectFunctions.UnmodifiableFunction<Integer> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Integer>(char2ObjectFunctions_SynchronizedFunction0);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_UnmodifiableFunction0.containsKey((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractChar2ObjectFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Char2ObjectOpenHashMap<Integer> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Integer>(1724);
      Char2ObjectFunctions.SynchronizedFunction<Integer> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Integer>(char2ObjectOpenHashMap0);
      String string0 = char2ObjectFunctions_SynchronizedFunction0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Char2ObjectOpenHashMap<Integer> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Integer>();
      Char2ObjectFunction<Object> char2ObjectFunction0 = Char2ObjectFunctions.singleton('i', (Object) char2ObjectOpenHashMap0);
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectFunction0);
      Object object0 = char2ObjectFunctions_SynchronizedFunction0.defaultReturnValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Integer integer0 = new Integer((-497));
      Char2ObjectFunctions.Singleton<Object> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Object>('R', integer0);
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectFunctions_Singleton0);
      boolean boolean0 = char2ObjectFunctions_SynchronizedFunction0.containsKey('R');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectFunctions_EmptyFunction0);
      Object object0 = char2ObjectFunctions_SynchronizedFunction0.get((Object) char2ObjectFunctions_EmptyFunction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Character character0 = Character.valueOf('d');
      Char2ObjectFunctions.Singleton<Character> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Character>('d', character0);
      Integer integer0 = new Integer(1182);
      Char2ObjectFunctions.SynchronizedFunction<Character> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Character>(char2ObjectFunctions_Singleton0, integer0);
      // Undeclared exception!
      try { 
        char2ObjectFunctions_SynchronizedFunction0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractChar2ObjectFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Integer> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Integer>();
      Char2ObjectFunctions.SynchronizedFunction<Integer> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Integer>(char2ObjectFunctions_EmptyFunction0);
      Character character0 = Character.valueOf('*');
      Integer integer0 = new Integer((-2359));
      // Undeclared exception!
      try { 
        char2ObjectFunctions_SynchronizedFunction0.put(character0, integer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.codelibs.jhighlight.fastutil.chars.AbstractChar2ObjectFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Char2ObjectFunctions.EmptyFunction<Object> char2ObjectFunctions_EmptyFunction0 = new Char2ObjectFunctions.EmptyFunction<Object>();
      Char2ObjectFunctions.SynchronizedFunction<Object> char2ObjectFunctions_SynchronizedFunction0 = new Char2ObjectFunctions.SynchronizedFunction<Object>(char2ObjectFunctions_EmptyFunction0, char2ObjectFunctions_EmptyFunction0);
      Object object0 = char2ObjectFunctions_SynchronizedFunction0.get('c');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Character character0 = Character.valueOf('+');
      Char2ObjectFunction<Object> char2ObjectFunction0 = Char2ObjectFunctions.singleton('d', (Object) character0);
      Char2ObjectFunction<Object> char2ObjectFunction1 = Char2ObjectFunctions.synchronize(char2ObjectFunction0);
      Char2ObjectFunctions.UnmodifiableFunction<Object> char2ObjectFunctions_UnmodifiableFunction0 = new Char2ObjectFunctions.UnmodifiableFunction<Object>(char2ObjectFunction1);
      int int0 = char2ObjectFunctions_UnmodifiableFunction0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Char2ObjectOpenHashMap<Integer> char2ObjectOpenHashMap0 = new Char2ObjectOpenHashMap<Integer>();
      Char2ObjectFunctions.Singleton<Object> char2ObjectFunctions_Singleton0 = new Char2ObjectFunctions.Singleton<Object>('*', char2ObjectOpenHashMap0);
      Char2ObjectFunctions.Singleton char2ObjectFunctions_Singleton1 = (Char2ObjectFunctions.Singleton)char2ObjectFunctions_Singleton0.clone();
      assertEquals(1, char2ObjectFunctions_Singleton1.size());
  }
}
