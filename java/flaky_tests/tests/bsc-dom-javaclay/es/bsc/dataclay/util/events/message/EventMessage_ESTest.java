/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 12:48:35 GMT 2022
 */

package es.bsc.dataclay.util.events.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.serialization.lib.ImmutableParamOrReturn;
import es.bsc.dataclay.serialization.lib.LanguageParamOrReturn;
import es.bsc.dataclay.serialization.lib.ObjectWithDataParamOrReturn;
import es.bsc.dataclay.serialization.lib.PersistentParamOrReturn;
import es.bsc.dataclay.serialization.lib.SerializedParametersOrReturn;
import es.bsc.dataclay.util.events.EventMessageStateOuter;
import es.bsc.dataclay.util.events.message.EventMessage;
import es.bsc.dataclay.util.events.type.DeletedObjEventType;
import es.bsc.dataclay.util.events.type.EventType;
import es.bsc.dataclay.util.events.type.PersistedObjEventType;
import es.bsc.dataclay.util.events.type.UpdatedObjEventType;
import es.bsc.dataclay.util.ids.EventMessageID;
import es.bsc.dataclay.util.ids.MetaClassID;
import es.bsc.dataclay.util.ids.ObjectID;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EventMessage_ESTest extends EventMessage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectID objectID0 = new ObjectID();
      UpdatedObjEventType updatedObjEventType0 = new UpdatedObjEventType("!f0rXe{[+", "!f0rXe{[+");
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn();
      EventMessage eventMessage0 = new EventMessage(objectID0, updatedObjEventType0, serializedParametersOrReturn0);
      System.setCurrentTimeMillis(2504L);
      EventMessage eventMessage1 = new EventMessage(objectID0, updatedObjEventType0, serializedParametersOrReturn0);
      // Undeclared exception!
      try { 
        eventMessage0.compareTo(eventMessage1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class es.bsc.dataclay.util.Configuration$Flags
         //
         verifyException("es.bsc.dataclay.util.events.message.EventMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjectID objectID0 = new ObjectID();
      UpdatedObjEventType updatedObjEventType0 = new UpdatedObjEventType("!f0rXe{[+", "!f0rXe{[+");
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn();
      EventMessage eventMessage0 = new EventMessage(objectID0, updatedObjEventType0, serializedParametersOrReturn0);
      EventMessage eventMessage1 = new EventMessage(objectID0, updatedObjEventType0, serializedParametersOrReturn0);
      int int0 = eventMessage0.compareTo(eventMessage1);
      assertEquals(0, int0);
      assertEquals(1392409281320L, eventMessage1.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      ObjectID objectID0 = eventMessage0.getProducerObjectID();
      assertNull(objectID0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      SerializedParametersOrReturn serializedParametersOrReturn0 = eventMessage0.getParams();
      assertNull(serializedParametersOrReturn0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectID objectID0 = new ObjectID("Yaml");
      DeletedObjEventType deletedObjEventType0 = new DeletedObjEventType();
      HashMap<Integer, ImmutableParamOrReturn> hashMap0 = new HashMap<Integer, ImmutableParamOrReturn>();
      IdentityHashMap<Integer, LanguageParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, LanguageParamOrReturn>();
      Integer integer0 = new Integer((-2538));
      LanguageParamOrReturn languageParamOrReturn0 = mock(LanguageParamOrReturn.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(languageParamOrReturn0).toString();
      identityHashMap0.put(integer0, languageParamOrReturn0);
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      Map<Integer, ObjectWithDataParamOrReturn> map0 = serializedParametersOrReturn0.getVolatileObjs();
      IdentityHashMap<Integer, PersistentParamOrReturn> identityHashMap1 = new IdentityHashMap<Integer, PersistentParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn1 = new SerializedParametersOrReturn(3482, hashMap0, identityHashMap0, map0, identityHashMap1);
      EventMessage eventMessage0 = new EventMessage(objectID0, deletedObjEventType0, serializedParametersOrReturn1);
      eventMessage0.getParams();
      assertEquals(1392409281320L, eventMessage0.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      Map<Integer, ImmutableParamOrReturn> map0 = serializedParametersOrReturn0.getImmObjs();
      HashMap<Integer, LanguageParamOrReturn> hashMap0 = new HashMap<Integer, LanguageParamOrReturn>();
      IdentityHashMap<Integer, ObjectWithDataParamOrReturn> identityHashMap0 = new IdentityHashMap<Integer, ObjectWithDataParamOrReturn>();
      IdentityHashMap<Integer, PersistentParamOrReturn> identityHashMap1 = new IdentityHashMap<Integer, PersistentParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn1 = new SerializedParametersOrReturn((-1), map0, hashMap0, identityHashMap0, identityHashMap1);
      eventMessage0.setParams(serializedParametersOrReturn1);
      SerializedParametersOrReturn serializedParametersOrReturn2 = eventMessage0.getParams();
      assertFalse(serializedParametersOrReturn2.needWrappers());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      eventMessage0.setMessagePriorityAge(97L);
      long long0 = eventMessage0.getMessagePriorityAge();
      assertEquals(97L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      EventMessageID eventMessageID0 = eventMessage0.getId();
      assertNull(eventMessageID0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      DeletedObjEventType deletedObjEventType0 = new DeletedObjEventType();
      eventMessage0.setEventType(deletedObjEventType0);
      EventType eventType0 = eventMessage0.getEventType();
      assertSame(eventType0, deletedObjEventType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      eventMessage0.getEventState();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectID objectID0 = new ObjectID("!f0rXe{[+");
      UpdatedObjEventType updatedObjEventType0 = new UpdatedObjEventType("!f0rXe{[+", "!f0rXe{[+");
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn();
      DeletedObjEventType deletedObjEventType0 = new DeletedObjEventType("!f0rXe{[+", "!f0rXe{[+");
      EventMessage eventMessage0 = new EventMessage(objectID0, deletedObjEventType0, serializedParametersOrReturn0);
      EventMessage eventMessage1 = new EventMessage(objectID0, updatedObjEventType0, serializedParametersOrReturn0);
      int int0 = eventMessage0.compareTo(eventMessage1);
      assertEquals((-1), int0);
      assertEquals(1392409281320L, eventMessage1.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      // Undeclared exception!
      try { 
        eventMessage0.equals(eventMessage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.events.message.EventMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      // Undeclared exception!
      try { 
        eventMessage0.compareTo(eventMessage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.events.message.EventMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectID objectID0 = new ObjectID("0k)m77lnq;cQ]?!ARt.");
      DeletedObjEventType deletedObjEventType0 = new DeletedObjEventType((String) null, (String) null);
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      EventMessage eventMessage0 = new EventMessage(objectID0, deletedObjEventType0, serializedParametersOrReturn0);
      eventMessage0.getProducerObjectID();
      assertEquals(1392409281320L, eventMessage0.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      eventMessage0.setMessagePriorityAge((-4424L));
      long long0 = eventMessage0.getMessagePriorityAge();
      assertEquals((-4424L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      EventType eventType0 = eventMessage0.getEventType();
      assertNull(eventType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectID objectID0 = new ObjectID("");
      MetaClassID metaClassID0 = new MetaClassID(objectID0.id);
      UpdatedObjEventType updatedObjEventType0 = new UpdatedObjEventType(metaClassID0);
      EventMessage eventMessage0 = new EventMessage(objectID0, updatedObjEventType0, (SerializedParametersOrReturn) null);
      eventMessage0.setProducerObjectID(objectID0);
      assertEquals(1392409281320L, eventMessage0.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      EventMessageStateOuter.EventState eventMessageStateOuter_EventState0 = EventMessageStateOuter.EventState.EXECUTING;
      eventMessage0.setEventState(eventMessageStateOuter_EventState0);
      assertEquals(EventMessageStateOuter.EventState.EXECUTING, eventMessage0.getEventState());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      long long0 = eventMessage0.getMessagePriorityAge();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjectID objectID0 = new ObjectID("es.bsc.dataclay.util.events.message.EventMessage");
      DeletedObjEventType deletedObjEventType0 = new DeletedObjEventType("es.bsc.dataclay.util.events.message.EventMessage", "Alias cannot be empty");
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      EventMessage eventMessage0 = new EventMessage(objectID0, deletedObjEventType0, serializedParametersOrReturn0);
      EventMessage eventMessage1 = new EventMessage(objectID0, deletedObjEventType0, serializedParametersOrReturn0);
      UpdatedObjEventType updatedObjEventType0 = new UpdatedObjEventType("", "");
      eventMessage1.setEventType(updatedObjEventType0);
      // Undeclared exception!
      try { 
        eventMessage1.compareTo(eventMessage0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class es.bsc.dataclay.util.Configuration$Flags
         //
         verifyException("es.bsc.dataclay.util.events.message.EventMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      // Undeclared exception!
      try { 
        eventMessage0.compareTo((EventMessage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.events.message.EventMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ObjectID objectID0 = new ObjectID();
      MetaClassID metaClassID0 = new MetaClassID((String) null);
      PersistedObjEventType persistedObjEventType0 = new PersistedObjEventType(metaClassID0);
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      EventMessage eventMessage0 = new EventMessage(objectID0, persistedObjEventType0, serializedParametersOrReturn0);
      ObjectID objectID1 = new ObjectID();
      EventMessage eventMessage1 = new EventMessage(objectID1, persistedObjEventType0, serializedParametersOrReturn0);
      boolean boolean0 = eventMessage0.equals(eventMessage1);
      assertFalse(boolean0);
      assertEquals(1392409281320L, eventMessage1.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ObjectID objectID0 = new ObjectID("es.bsc.dataclay.util.events.message.EventMessage");
      DeletedObjEventType deletedObjEventType0 = new DeletedObjEventType("es.bsc.dataclay.util.events.message.EventMessage", "Alias cannot be empty");
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      EventMessage eventMessage0 = new EventMessage(objectID0, deletedObjEventType0, serializedParametersOrReturn0);
      EventMessage eventMessage1 = new EventMessage(objectID0, deletedObjEventType0, serializedParametersOrReturn0);
      UpdatedObjEventType updatedObjEventType0 = new UpdatedObjEventType("", "");
      eventMessage1.setEventType(updatedObjEventType0);
      boolean boolean0 = eventMessage1.equals(eventMessage0);
      assertFalse(boolean0);
      assertEquals(1392409281320L, eventMessage1.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      Object object0 = new Object();
      boolean boolean0 = eventMessage0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      boolean boolean0 = eventMessage0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ObjectID objectID0 = new ObjectID("es.bsc.dataclay.util.events.message.EventMessage");
      DeletedObjEventType deletedObjEventType0 = new DeletedObjEventType("es.bsc.dataclay.util.events.message.EventMessage", "Alias cannot be empty");
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      EventMessage eventMessage0 = new EventMessage(objectID0, deletedObjEventType0, serializedParametersOrReturn0);
      EventMessageID eventMessageID0 = eventMessage0.getId();
      eventMessage0.setId(eventMessageID0);
      assertEquals(1392409281320L, eventMessage0.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjectID objectID0 = new ObjectID("=8~$$f|");
      PersistedObjEventType persistedObjEventType0 = new PersistedObjEventType();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn();
      EventMessage eventMessage0 = new EventMessage(objectID0, persistedObjEventType0, serializedParametersOrReturn0);
      eventMessage0.getEventState();
      assertEquals(1392409281320L, eventMessage0.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      // Undeclared exception!
      try { 
        eventMessage0.toString();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/yaml/snakeyaml/representer/Representer
         //
         verifyException("es.bsc.dataclay.util.events.message.EventMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EventMessage eventMessage0 = new EventMessage();
      eventMessage0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ObjectID objectID0 = new ObjectID();
      MetaClassID metaClassID0 = new MetaClassID(objectID0.id);
      PersistedObjEventType persistedObjEventType0 = new PersistedObjEventType(metaClassID0);
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      EventMessage eventMessage0 = new EventMessage(objectID0, persistedObjEventType0, serializedParametersOrReturn0);
      boolean boolean0 = eventMessage0.equals(eventMessage0);
      assertTrue(boolean0);
      assertEquals(1392409281320L, eventMessage0.getMessagePriorityAge());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ObjectID objectID0 = new ObjectID("Yaml");
      DeletedObjEventType deletedObjEventType0 = new DeletedObjEventType();
      LinkedList<ObjectWithDataParamOrReturn> linkedList0 = new LinkedList<ObjectWithDataParamOrReturn>();
      SerializedParametersOrReturn serializedParametersOrReturn0 = new SerializedParametersOrReturn(linkedList0);
      EventMessage eventMessage0 = new EventMessage(objectID0, deletedObjEventType0, serializedParametersOrReturn0);
      eventMessage0.getParams();
      assertEquals(1392409281320L, eventMessage0.getMessagePriorityAge());
  }
}
