/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 14:27:37 GMT 2022
 */

package edu.nps.moves.dis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis.EventID;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EventID_ESTest extends EventID_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EventID eventID0 = new EventID();
      EventID eventID1 = new EventID();
      eventID0.setEventNumber((-346));
      boolean boolean0 = eventID0.equalsImpl(eventID1);
      assertEquals((-346), eventID0.getEventNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setSite(1);
      EventID eventID1 = new EventID();
      boolean boolean0 = eventID0.equals(eventID1);
      assertEquals(1, eventID0.getSite());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setEventNumber((-346));
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      eventID0.marshal(byteBuffer0);
      assertEquals((-346), eventID0.getEventNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setApplication((-1));
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      eventID0.marshal(byteBuffer0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-1), (byte) (-1), (byte)0, (byte)0}, byteArray0);
      assertEquals((-1), eventID0.getApplication());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setApplication(516);
      int int0 = eventID0.getMarshalledSize();
      assertEquals(516, eventID0.getApplication());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventID eventID0 = new EventID();
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      eventID0.unmarshal(byteBuffer0);
      assertEquals(0, eventID0.getEventNumber());
      assertEquals(0, eventID0.getSite());
      assertEquals(0, eventID0.getApplication());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.site = 291;
      int int0 = eventID0.getSite();
      assertEquals(291, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setSite((-745));
      int int0 = eventID0.getSite();
      assertEquals((-745), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.eventNumber = 1;
      int int0 = eventID0.getEventNumber();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setEventNumber((-1));
      int int0 = eventID0.getEventNumber();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setApplication(1);
      int int0 = eventID0.getApplication();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setApplication((-1));
      int int0 = eventID0.getApplication();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventID eventID0 = new EventID();
      boolean boolean0 = eventID0.equalsImpl(eventID0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EventID eventID0 = new EventID();
      // Undeclared exception!
      try { 
        eventID0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.EventID", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EventID eventID0 = new EventID();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(65535);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        eventID0.marshal(byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBufferR", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EventID eventID0 = new EventID();
      // Undeclared exception!
      try { 
        eventID0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.EventID", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setApplication((-130));
      EventID eventID1 = new EventID();
      boolean boolean0 = eventID0.equalsImpl(eventID1);
      assertEquals((-130), eventID0.getApplication());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventID eventID0 = new EventID();
      EventID eventID1 = new EventID();
      assertTrue(eventID1.equals((Object)eventID0));
      
      eventID1.site = 516;
      boolean boolean0 = eventID0.equalsImpl(eventID1);
      assertFalse(eventID1.equals((Object)eventID0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventID eventID0 = new EventID();
      EventID eventID1 = new EventID();
      eventID0.setEventNumber(1236);
      boolean boolean0 = eventID0.equalsImpl(eventID1);
      assertEquals(1236, eventID0.getEventNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EventID eventID0 = new EventID();
      EventID eventID1 = new EventID();
      eventID1.setApplication((-670));
      boolean boolean0 = eventID0.equals(eventID1);
      assertEquals((-670), eventID1.getApplication());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EventID eventID0 = new EventID();
      Object object0 = new Object();
      boolean boolean0 = eventID0.equalsImpl(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventID eventID0 = new EventID();
      EventID eventID1 = new EventID();
      boolean boolean0 = eventID1.equals(eventID0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EventID eventID0 = new EventID();
      boolean boolean0 = eventID0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EventID eventID0 = new EventID();
      boolean boolean0 = eventID0.equals(eventID0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EventID eventID0 = new EventID();
      Object object0 = new Object();
      boolean boolean0 = eventID0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EventID eventID0 = new EventID();
      int int0 = eventID0.getSite();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setSite(2167);
      int int0 = eventID0.getMarshalledSize();
      assertEquals(2167, eventID0.getSite());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EventID eventID0 = new EventID();
      int int0 = eventID0.getApplication();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EventID eventID0 = new EventID();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      try { 
        eventID0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EventID eventID0 = new EventID();
      eventID0.setEventNumber(1236);
      int int0 = eventID0.getMarshalledSize();
      assertEquals(1236, eventID0.getEventNumber());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      EventID eventID0 = new EventID();
      // Undeclared exception!
      try { 
        eventID0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EventID eventID0 = new EventID();
      int int0 = eventID0.getEventNumber();
      assertEquals(0, int0);
  }
}
