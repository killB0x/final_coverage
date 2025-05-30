/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 12:42:41 GMT 2022
 */

package edu.nps.moves.dis7;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis7.RemoveEntityReliablePdu;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RemoveEntityReliablePdu_ESTest extends RemoveEntityReliablePdu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setTimestamp((-114L));
      boolean boolean0 = removeEntityReliablePdu0.equalsImpl(removeEntityReliablePdu0);
      assertTrue(boolean0);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
      assertEquals(32, removeEntityReliablePdu0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setPad2((short) (-1096));
      boolean boolean0 = removeEntityReliablePdu0.equalsImpl(removeEntityReliablePdu0);
      assertEquals((short) (-1096), removeEntityReliablePdu0.getPad2());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.pad1 = 4;
      RemoveEntityReliablePdu removeEntityReliablePdu1 = new RemoveEntityReliablePdu();
      boolean boolean0 = removeEntityReliablePdu0.equalsImpl(removeEntityReliablePdu1);
      assertFalse(removeEntityReliablePdu1.equals((Object)removeEntityReliablePdu0));
      assertEquals((short)52, removeEntityReliablePdu1.getPduType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.requiredReliabilityService = (short) (-1537);
      boolean boolean0 = removeEntityReliablePdu0.equalsImpl(removeEntityReliablePdu0);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
      assertEquals(32, removeEntityReliablePdu0.getMarshalledSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequestID((short)1394);
      removeEntityReliablePdu0.marshal();
      assertEquals(1394L, removeEntityReliablePdu0.getRequestID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setPad2((short)10);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((short)255);
      removeEntityReliablePdu0.marshal(byteBuffer0);
      assertEquals((short)10, removeEntityReliablePdu0.getPad2());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequiredReliabilityService((short) (-318));
      removeEntityReliablePdu0.marshal();
      assertEquals((short) (-318), removeEntityReliablePdu0.getRequiredReliabilityService());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequestID((-313L));
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      removeEntityReliablePdu0.marshal(dataOutputStream0);
      assertEquals((-313L), removeEntityReliablePdu0.getRequestID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setPad2((short)10);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      removeEntityReliablePdu0.marshal(dataOutputStream0);
      assertEquals((short)10, removeEntityReliablePdu0.getPad2());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequiredReliabilityService((short)255);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      removeEntityReliablePdu0.marshal(dataOutputStream0);
      assertEquals((short)255, removeEntityReliablePdu0.getRequiredReliabilityService());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(65535);
      removeEntityReliablePdu0.unmarshal(byteBuffer0);
      assertEquals((short)0, removeEntityReliablePdu0.getRequiredReliabilityService());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequiredReliabilityService((short)2);
      short short0 = removeEntityReliablePdu0.getRequiredReliabilityService();
      assertEquals((short)2, short0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequiredReliabilityService((short) (-318));
      short short0 = removeEntityReliablePdu0.getRequiredReliabilityService();
      assertEquals((short) (-318), short0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequestID(2303L);
      long long0 = removeEntityReliablePdu0.getRequestID();
      assertEquals(2303L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequestID((short) (-412));
      long long0 = removeEntityReliablePdu0.getRequestID();
      assertEquals((-412L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setPad2((short)3);
      short short0 = removeEntityReliablePdu0.getPad2();
      assertEquals((short)3, short0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setPad2((short) (-2178));
      short short0 = removeEntityReliablePdu0.getPad2();
      assertEquals((short) (-2178), short0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setPad1(65535);
      int int0 = removeEntityReliablePdu0.getPad1();
      assertEquals(65535, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      try { 
        removeEntityReliablePdu0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(342);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        removeEntityReliablePdu0.marshal(byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.DirectByteBufferR", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      // Undeclared exception!
      try { 
        removeEntityReliablePdu0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      // Undeclared exception!
      try { 
        removeEntityReliablePdu0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.PduSuperclass", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.receivingEntityID = null;
      // Undeclared exception!
      try { 
        removeEntityReliablePdu0.getMarshalledSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.SimulationManagementWithReliabilityFamilyPdu", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      int int0 = removeEntityReliablePdu0.getMarshalledSize();
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
      
      removeEntityReliablePdu0.setPduType((short) (-4617));
      RemoveEntityReliablePdu removeEntityReliablePdu1 = new RemoveEntityReliablePdu();
      boolean boolean0 = removeEntityReliablePdu1.equalsImpl(removeEntityReliablePdu0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequestID(1637L);
      RemoveEntityReliablePdu removeEntityReliablePdu1 = new RemoveEntityReliablePdu();
      boolean boolean0 = removeEntityReliablePdu1.equalsImpl(removeEntityReliablePdu0);
      assertEquals(1637L, removeEntityReliablePdu0.getRequestID());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      RemoveEntityReliablePdu removeEntityReliablePdu1 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu1.setPad1(114);
      boolean boolean0 = removeEntityReliablePdu0.equalsImpl(removeEntityReliablePdu1);
      assertEquals(114, removeEntityReliablePdu1.getPad1());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      RemoveEntityReliablePdu removeEntityReliablePdu1 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setRequiredReliabilityService((short) (-1515));
      boolean boolean0 = removeEntityReliablePdu1.equalsImpl(removeEntityReliablePdu0);
      assertEquals((short) (-1515), removeEntityReliablePdu0.getRequiredReliabilityService());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      Object object0 = new Object();
      boolean boolean0 = removeEntityReliablePdu0.equalsImpl(object0);
      assertFalse(boolean0);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      RemoveEntityReliablePdu removeEntityReliablePdu1 = new RemoveEntityReliablePdu();
      boolean boolean0 = removeEntityReliablePdu1.equals(removeEntityReliablePdu0);
      assertEquals(32, removeEntityReliablePdu1.getMarshalledSize());
      assertTrue(boolean0);
      assertEquals((short)52, removeEntityReliablePdu1.getPduType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      boolean boolean0 = removeEntityReliablePdu0.equals((Object) null);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      boolean boolean0 = removeEntityReliablePdu0.equals(removeEntityReliablePdu0);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      Object object0 = new Object();
      boolean boolean0 = removeEntityReliablePdu0.equals(object0);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.getRequestID();
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      int int0 = removeEntityReliablePdu0.getPad1();
      assertEquals(0, int0);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.marshal((DataOutputStream) null);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      short short0 = removeEntityReliablePdu0.getPad2();
      assertEquals((short)0, short0);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      removeEntityReliablePdu0.setPad2((short)1422);
      RemoveEntityReliablePdu removeEntityReliablePdu1 = new RemoveEntityReliablePdu();
      boolean boolean0 = removeEntityReliablePdu0.equalsImpl(removeEntityReliablePdu1);
      assertEquals((short)1422, removeEntityReliablePdu0.getPad2());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      short short0 = removeEntityReliablePdu0.getRequiredReliabilityService();
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1049), 32);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      removeEntityReliablePdu0.unmarshal(dataInputStream0);
      assertEquals((short)52, removeEntityReliablePdu0.getPduType());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RemoveEntityReliablePdu removeEntityReliablePdu0 = new RemoveEntityReliablePdu();
      // Undeclared exception!
      try { 
        removeEntityReliablePdu0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.PduSuperclass", e);
      }
  }
}
