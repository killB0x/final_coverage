/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 13:36:30 GMT 2022
 */

package es.bsc.dataclay.util.ids;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.serialization.buffer.DataClayByteBuffer;
import es.bsc.dataclay.serialization.buffer.JavaByteBuffer;
import es.bsc.dataclay.util.ids.DataClayInstanceID;
import es.bsc.dataclay.util.ids.ECAID;
import es.bsc.dataclay.util.ids.EventMessageID;
import es.bsc.dataclay.util.ids.EventObjsMeetConditionID;
import es.bsc.dataclay.util.ids.ImplementationID;
import es.bsc.dataclay.util.ids.QualitativeRegistryID;
import es.bsc.dataclay.util.ids.StorageLocationID;
import java.nio.BufferUnderflowException;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ID_ESTest extends ID_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaByteBuffer javaByteBuffer0 = new JavaByteBuffer();
      EventMessageID eventMessageID0 = new EventMessageID();
      eventMessageID0.serializeBase(javaByteBuffer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImplementationID implementationID0 = new ImplementationID((UUID) null);
      implementationID0.setId((UUID) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StorageLocationID storageLocationID0 = new StorageLocationID("");
      String string0 = storageLocationID0.toString();
      assertEquals("00000000-0100-4000-8200-000003000000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataClayInstanceID dataClayInstanceID0 = new DataClayInstanceID();
      UUID uUID0 = dataClayInstanceID0.getId();
      assertEquals(16793600L, uUID0.getMostSignificantBits());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EventObjsMeetConditionID eventObjsMeetConditionID0 = new EventObjsMeetConditionID();
      byte[] byteArray0 = new byte[0];
      JavaByteBuffer javaByteBuffer0 = new JavaByteBuffer(byteArray0);
      // Undeclared exception!
      try { 
        eventObjsMeetConditionID0.deserializeIDBase(javaByteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventObjsMeetConditionID eventObjsMeetConditionID0 = new EventObjsMeetConditionID();
      // Undeclared exception!
      try { 
        eventObjsMeetConditionID0.deserializeIDBase((DataClayByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.ids.ID", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ECAID eCAID0 = new ECAID((UUID) null);
      UUID uUID0 = eCAID0.getId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      QualitativeRegistryID qualitativeRegistryID0 = new QualitativeRegistryID(uUID0);
      boolean boolean0 = qualitativeRegistryID0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventObjsMeetConditionID eventObjsMeetConditionID0 = new EventObjsMeetConditionID();
      boolean boolean0 = eventObjsMeetConditionID0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventObjsMeetConditionID eventObjsMeetConditionID0 = new EventObjsMeetConditionID();
      QualitativeRegistryID qualitativeRegistryID0 = new QualitativeRegistryID(eventObjsMeetConditionID0.id);
      boolean boolean0 = qualitativeRegistryID0.equals(eventObjsMeetConditionID0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EventObjsMeetConditionID eventObjsMeetConditionID0 = new EventObjsMeetConditionID();
      JavaByteBuffer javaByteBuffer0 = new JavaByteBuffer();
      // Undeclared exception!
      try { 
        eventObjsMeetConditionID0.deserializeIDBase(javaByteBuffer0);
        fail("Expecting exception: NoSuchMethodError");
      
      } catch(NoSuchMethodError e) {
         //
         // 'java.util.UUID org.evosuite.runtime.mock.java.util.MockUUID.UUID(long, long)'
         //
         verifyException("es.bsc.dataclay.util.ids.ID", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImplementationID implementationID0 = new ImplementationID((UUID) null);
      // Undeclared exception!
      try { 
        implementationID0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.ids.ID", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventObjsMeetConditionID eventObjsMeetConditionID0 = new EventObjsMeetConditionID();
      eventObjsMeetConditionID0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EventObjsMeetConditionID eventObjsMeetConditionID0 = new EventObjsMeetConditionID();
      // Undeclared exception!
      try { 
        eventObjsMeetConditionID0.serializeBase((DataClayByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.ids.ID", e);
      }
  }
}
