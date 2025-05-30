/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 12:51:11 GMT 2022
 */

package es.bsc.dataclay.serialization.lib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.serialization.lib.ImmutableParamOrReturn;
import es.bsc.dataclay.serialization.lib.LanguageParamOrReturn;
import es.bsc.dataclay.serialization.lib.ObjectWithDataParamOrReturn;
import es.bsc.dataclay.serialization.lib.PersistentParamOrReturn;
import es.bsc.dataclay.serialization.lib.SerializedParametersOrReturn;
import es.bsc.dataclay.util.ids.ObjectID;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SerializedParametersOrReturn_ESTest extends SerializedParametersOrReturn_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn();
      Map<Integer, ObjectWithDataParamOrReturn> map0 = serializedParametersOrReturn0.getVolatileObjs();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, LanguageParamOrReturn> hashMap0 = new HashMap<Integer, LanguageParamOrReturn>();
      IdentityHashMap<Integer, ObjectWithDataParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, ObjectWithDataParamOrReturn>();
      Integer integer0 = new Integer(0);
      ObjectWithDataParamOrReturn objectWithDataParamOrReturn0 = new ObjectWithDataParamOrReturn();
      identityHashMap0.put(integer0, objectWithDataParamOrReturn0);
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn((-2233), (Map<Integer, ImmutableParamOrReturn>) null, hashMap0, identityHashMap0, (Map<Integer, PersistentParamOrReturn>) null);
      Map<Integer, ObjectWithDataParamOrReturn> map0 = serializedParametersOrReturn0.getVolatileObjs();
      assertNotNull(map0);
      assertEquals((-2233), serializedParametersOrReturn0.getNumParams());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn();
      Map<Integer, PersistentParamOrReturn> map0 = serializedParametersOrReturn0.getPersistentRefs();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      HashMap<Integer, PersistentParamOrReturn> hashMap0 = new HashMap<Integer, PersistentParamOrReturn>();
      Integer integer0 = new Integer((-3226));
      ObjectID objectID0 = new ObjectID();
      PersistentParamOrReturn persistentParamOrReturn0 = new PersistentParamOrReturn(objectID0);
      hashMap0.put(integer0, persistentParamOrReturn0);
      serializedParametersOrReturn0.setPersistentRefs(hashMap0);
      Map<Integer, PersistentParamOrReturn> map0 = serializedParametersOrReturn0.getPersistentRefs();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IdentityHashMap<Integer, ImmutableParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, ImmutableParamOrReturn>();
      HashMap<Integer, LanguageParamOrReturn> hashMap0 = new HashMap<Integer, LanguageParamOrReturn>();
      HashMap<Integer, ObjectWithDataParamOrReturn> hashMap1 = new HashMap<Integer, ObjectWithDataParamOrReturn>();
      IdentityHashMap<Integer, PersistentParamOrReturn> identityHashMap1 = new IdentityHashMap<Integer, PersistentParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(10, identityHashMap0, hashMap0, hashMap1, identityHashMap1);
      int int0 = serializedParametersOrReturn0.getNumParams();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashSet<ObjectWithDataParamOrReturn> linkedHashSet0 = new LinkedHashSet<ObjectWithDataParamOrReturn>();
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>(linkedHashSet0);
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      Map<Integer, ImmutableParamOrReturn> map0 = serializedParametersOrReturn0.getImmObjs();
      Map<Integer, LanguageParamOrReturn> map1 = serializedParametersOrReturn0.getLangObjs();
      HashMap<Integer, ObjectWithDataParamOrReturn> hashMap0 = new HashMap<Integer, ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn1 = new SerializedParametersOrReturn((-1116), map0, map1, hashMap0, (Map<Integer, PersistentParamOrReturn>) null);
      int int0 = serializedParametersOrReturn1.getNumParams();
      assertEquals((-1116), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn();
      Map<Integer, LanguageParamOrReturn> map0 = serializedParametersOrReturn0.getLangObjs();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IdentityHashMap<Integer, ImmutableParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, ImmutableParamOrReturn>();
      HashMap<Integer, LanguageParamOrReturn> hashMap0 = new HashMap<Integer, LanguageParamOrReturn>();
      HashMap<Integer, ObjectWithDataParamOrReturn> hashMap1 = new HashMap<Integer, ObjectWithDataParamOrReturn>();
      Integer integer0 = new Integer(1);
      LanguageParamOrReturn languageParamOrReturn0 = new LanguageParamOrReturn();
      hashMap0.put(integer0, languageParamOrReturn0);
      IdentityHashMap<Integer, PersistentParamOrReturn> identityHashMap1 = new IdentityHashMap<Integer, PersistentParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(1, identityHashMap0, hashMap0, hashMap1, identityHashMap1);
      Map<Integer, LanguageParamOrReturn> map0 = serializedParametersOrReturn0.getLangObjs();
      assertEquals(1, serializedParametersOrReturn0.getNumParams());
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn();
      Map<Integer, ImmutableParamOrReturn> map0 = serializedParametersOrReturn0.getImmObjs();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      IdentityHashMap<Integer, ImmutableParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, ImmutableParamOrReturn>();
      Integer integer0 = new Integer((-780));
      identityHashMap0.put(integer0, (ImmutableParamOrReturn) null);
      serializedParametersOrReturn0.setImmObjs(identityHashMap0);
      Map<Integer, ImmutableParamOrReturn> map0 = serializedParametersOrReturn0.getImmObjs();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      IdentityHashMap<Integer, ImmutableParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, ImmutableParamOrReturn>();
      Integer integer0 = new Integer((-780));
      identityHashMap0.put(integer0, (ImmutableParamOrReturn) null);
      serializedParametersOrReturn0.setImmObjs(identityHashMap0);
      // Undeclared exception!
      try { 
        serializedParametersOrReturn0.removeReferencesForYaml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.serialization.lib.SerializedParametersOrReturn", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      ObjectWithDataParamOrReturn objectWithDataParamOrReturn0 = new ObjectWithDataParamOrReturn();
      linkedList0.add(objectWithDataParamOrReturn0);
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      // Undeclared exception!
      try { 
        serializedParametersOrReturn0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.serialization.lib.ObjectWithDataParamOrReturn", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SerializedParametersOrReturn serializedParametersOrReturn0 = null;
      try {
        serializedParametersOrReturn0 = new SerializedParametersOrReturn((List<ObjectWithDataParamOrReturn>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.serialization.lib.SerializedParametersOrReturn", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      assertFalse(serializedParametersOrReturn0.needWrappers());
      
      HashMap<Integer, LanguageParamOrReturn> hashMap0 = new HashMap<Integer, LanguageParamOrReturn>();
      Integer integer0 = new Integer(0);
      hashMap0.put(integer0, (LanguageParamOrReturn) null);
      serializedParametersOrReturn0.setLangObjs(hashMap0);
      boolean boolean0 = serializedParametersOrReturn0.needWrappers();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      boolean boolean0 = serializedParametersOrReturn0.needWrappers();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      assertFalse(serializedParametersOrReturn0.needWrappers());
      
      HashMap<Integer, ImmutableParamOrReturn> hashMap0 = new HashMap<Integer, ImmutableParamOrReturn>();
      ImmutableParamOrReturn immutableParamOrReturn0 = new ImmutableParamOrReturn();
      hashMap0.put((Integer) null, immutableParamOrReturn0);
      serializedParametersOrReturn0.setImmObjs(hashMap0);
      boolean boolean0 = serializedParametersOrReturn0.needWrappers();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      IdentityHashMap<Integer, PersistentParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, PersistentParamOrReturn>();
      Integer integer0 = new Integer(1);
      ObjectID objectID0 = new ObjectID();
      PersistentParamOrReturn persistentParamOrReturn0 = new PersistentParamOrReturn(objectID0);
      identityHashMap0.put(integer0, persistentParamOrReturn0);
      serializedParametersOrReturn0.setPersistentRefs(identityHashMap0);
      serializedParametersOrReturn0.removeReferencesForYaml();
      assertEquals(0, serializedParametersOrReturn0.getNumParams());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      HashMap<Integer, ImmutableParamOrReturn> hashMap0 = new HashMap<Integer, ImmutableParamOrReturn>();
      ImmutableParamOrReturn immutableParamOrReturn0 = new ImmutableParamOrReturn();
      hashMap0.put((Integer) null, immutableParamOrReturn0);
      serializedParametersOrReturn0.setImmObjs(hashMap0);
      serializedParametersOrReturn0.removeReferencesForYaml();
      assertTrue(serializedParametersOrReturn0.needWrappers());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IdentityHashMap<Integer, ImmutableParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, ImmutableParamOrReturn>();
      HashMap<Integer, LanguageParamOrReturn> hashMap0 = new HashMap<Integer, LanguageParamOrReturn>();
      HashMap<Integer, ObjectWithDataParamOrReturn> hashMap1 = new HashMap<Integer, ObjectWithDataParamOrReturn>();
      Integer integer0 = new Integer(0);
      LanguageParamOrReturn languageParamOrReturn0 = new LanguageParamOrReturn();
      hashMap0.put(integer0, languageParamOrReturn0);
      IdentityHashMap<Integer, PersistentParamOrReturn> identityHashMap1 = new IdentityHashMap<Integer, PersistentParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(1289, identityHashMap0, hashMap0, hashMap1, identityHashMap1);
      serializedParametersOrReturn0.removeReferencesForYaml();
      assertEquals(1289, serializedParametersOrReturn0.getNumParams());
      assertTrue(serializedParametersOrReturn0.needWrappers());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      Map<Integer, ObjectWithDataParamOrReturn> map0 = serializedParametersOrReturn0.getVolatileObjs();
      IdentityHashMap<Integer, ObjectWithDataParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, ObjectWithDataParamOrReturn>(map0);
      Integer integer0 = new Integer(2);
      ObjectWithDataParamOrReturn objectWithDataParamOrReturn0 = new ObjectWithDataParamOrReturn();
      identityHashMap0.put(integer0, objectWithDataParamOrReturn0);
      serializedParametersOrReturn0.setVolatileObjs(identityHashMap0);
      serializedParametersOrReturn0.removeReferencesForYaml();
      assertFalse(serializedParametersOrReturn0.needWrappers());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      Map<Integer, PersistentParamOrReturn> map0 = serializedParametersOrReturn0.getPersistentRefs();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      int int0 = serializedParametersOrReturn0.getNumParams();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      serializedParametersOrReturn0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      Map<Integer, ImmutableParamOrReturn> map0 = serializedParametersOrReturn0.getImmObjs();
      IdentityHashMap<Integer, LanguageParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, LanguageParamOrReturn>();
      HashMap<Integer, ObjectWithDataParamOrReturn> hashMap0 = new HashMap<Integer, ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn1 = new SerializedParametersOrReturn((-4473), map0, identityHashMap0, hashMap0, (Map<Integer, PersistentParamOrReturn>) null);
      // Undeclared exception!
      try { 
        serializedParametersOrReturn1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.serialization.lib.SerializedParametersOrReturn", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      String string0 = serializedParametersOrReturn0.toString();
      assertEquals("{\nNum params = 0\n-- immutable params = []\n-- language params = []\n-- volatile params = []\n-- persistent params = []\n{\n", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      serializedParametersOrReturn0.setNumParams(1);
      assertEquals(1, serializedParametersOrReturn0.getNumParams());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn();
      // Undeclared exception!
      try { 
        serializedParametersOrReturn0.needWrappers();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.serialization.lib.SerializedParametersOrReturn", e);
      }
  }
}
