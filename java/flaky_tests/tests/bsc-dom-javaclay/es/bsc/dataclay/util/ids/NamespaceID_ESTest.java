/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 13:49:32 GMT 2022
 */

package es.bsc.dataclay.util.ids;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.DataClayObject;
import es.bsc.dataclay.serialization.buffer.DataClayByteBuffer;
import es.bsc.dataclay.serialization.buffer.GrpcByteBuffer;
import es.bsc.dataclay.serialization.buffer.JavaByteBuffer;
import es.bsc.dataclay.util.DataClayObjectMetaData;
import es.bsc.dataclay.util.ReferenceCounting;
import es.bsc.dataclay.util.ids.MetaClassID;
import es.bsc.dataclay.util.ids.NamespaceID;
import java.nio.BufferUnderflowException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.ListIterator;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NamespaceID_ESTest extends NamespaceID_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NamespaceID namespaceID0 = new NamespaceID();
      byte[] byteArray0 = new byte[0];
      JavaByteBuffer javaByteBuffer0 = new JavaByteBuffer(byteArray0);
      IdentityHashMap<MetaClassID, byte[]> identityHashMap0 = new IdentityHashMap<MetaClassID, byte[]>();
      IdentityHashMap<Integer, Object> identityHashMap1 = new IdentityHashMap<Integer, Object>();
      // Undeclared exception!
      try { 
        namespaceID0.deserialize(javaByteBuffer0, identityHashMap0, (DataClayObjectMetaData) null, identityHashMap1);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NamespaceID namespaceID0 = new NamespaceID();
      GrpcByteBuffer grpcByteBuffer0 = new GrpcByteBuffer();
      HashMap<MetaClassID, byte[]> hashMap0 = new HashMap<MetaClassID, byte[]>();
      IdentityHashMap<Integer, Object> identityHashMap0 = new IdentityHashMap<Integer, Object>();
      // Undeclared exception!
      try { 
        namespaceID0.deserialize(grpcByteBuffer0, hashMap0, (DataClayObjectMetaData) null, identityHashMap0);
        fail("Expecting exception: NoSuchMethodError");
      
      } catch(NoSuchMethodError e) {
         //
         // 'java.util.UUID org.evosuite.runtime.mock.java.util.MockUUID.UUID(long, long)'
         //
         verifyException("es.bsc.dataclay.util.ids.ID", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NamespaceID namespaceID0 = new NamespaceID((String) null);
      assertEquals("00000000-0100-4000-8200-000003000000", namespaceID0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NamespaceID namespaceID0 = new NamespaceID("es.bsc.ataclay.util.ids.NamespaceID");
      assertEquals("00000000-0100-4000-8200-000003000000", namespaceID0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      NamespaceID namespaceID0 = new NamespaceID(uUID0);
      HashMap<MetaClassID, byte[]> hashMap0 = new HashMap<MetaClassID, byte[]>();
      ReferenceCounting referenceCounting0 = new ReferenceCounting();
      // Undeclared exception!
      try { 
        namespaceID0.serialize((DataClayByteBuffer) null, false, hashMap0, (IdentityHashMap<Object, Integer>) null, (ListIterator<DataClayObject>) null, referenceCounting0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.ids.ID", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NamespaceID namespaceID0 = new NamespaceID();
      HashMap<MetaClassID, byte[]> hashMap0 = new HashMap<MetaClassID, byte[]>();
      IdentityHashMap<Integer, Object> identityHashMap0 = new IdentityHashMap<Integer, Object>();
      // Undeclared exception!
      try { 
        namespaceID0.deserialize((DataClayByteBuffer) null, hashMap0, (DataClayObjectMetaData) null, identityHashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.bsc.dataclay.util.ids.ID", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NamespaceID namespaceID0 = new NamespaceID();
      JavaByteBuffer javaByteBuffer0 = new JavaByteBuffer();
      HashMap<MetaClassID, byte[]> hashMap0 = new HashMap<MetaClassID, byte[]>();
      IdentityHashMap<Object, Integer> identityHashMap0 = new IdentityHashMap<Object, Integer>();
      ReferenceCounting referenceCounting0 = new ReferenceCounting();
      namespaceID0.serialize(javaByteBuffer0, true, hashMap0, identityHashMap0, (ListIterator<DataClayObject>) null, referenceCounting0);
  }
}
