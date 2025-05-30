/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 15:18:36 GMT 2022
 */

package edu.nps.moves.dis7;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis7.Relationship;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Relationship_ESTest extends Relationship_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      Relationship relationship1 = new Relationship();
      assertTrue(relationship1.equals((Object)relationship0));
      
      relationship1.position = (-1);
      boolean boolean0 = relationship0.equals(relationship1);
      assertFalse(relationship1.equals((Object)relationship0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)1, 65535);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      relationship0.unmarshal(dataInputStream0);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("edu.nps.moves.dis7.Relationship");
      relationship0.marshal(byteBuffer0);
      assertEquals(27, byteBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.setPosition(2605);
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, (int) (byte)0);
      // Undeclared exception!
      try { 
        relationship0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.position = 1;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      relationship0.marshal(dataOutputStream0);
      assertEquals(1, relationship0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.setPosition((byte) (-94));
      int int0 = relationship0.getMarshalledSize();
      assertEquals((-94), relationship0.getPosition());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.setNature((byte)1);
      int int0 = relationship0.getMarshalledSize();
      assertEquals(1, relationship0.getNature());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      relationship0.unmarshal(byteBuffer0);
      assertEquals(0, relationship0.getPosition());
      assertEquals(0, relationship0.getNature());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      relationship0.marshal(dataOutputStream0);
      assertEquals(4, relationship0.getMarshalledSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.setPosition(4);
      int int0 = relationship0.getPosition();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.position = (-316);
      int int0 = relationship0.getPosition();
      assertEquals((-316), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.setNature(1259);
      int int0 = relationship0.getNature();
      assertEquals(1259, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.setNature((-1565));
      int int0 = relationship0.getNature();
      assertEquals((-1565), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      boolean boolean0 = relationship0.equalsImpl(relationship0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      // Undeclared exception!
      try { 
        relationship0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      // Undeclared exception!
      try { 
        relationship0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.Relationship", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.setNature((byte)1);
      Relationship relationship1 = new Relationship();
      boolean boolean0 = relationship0.equalsImpl(relationship1);
      assertEquals(1, relationship0.getNature());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      Relationship relationship1 = new Relationship();
      relationship1.setNature(4);
      boolean boolean0 = relationship0.equals(relationship1);
      assertEquals(4, relationship1.getNature());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      Object object0 = new Object();
      boolean boolean0 = relationship0.equalsImpl(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      Object object0 = new Object();
      boolean boolean0 = relationship0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      boolean boolean0 = relationship0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      boolean boolean0 = relationship0.equals(relationship0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      int int0 = relationship0.getNature();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      int int0 = relationship0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.unmarshal((DataInputStream) null);
      assertEquals(0, relationship0.getNature());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      // Undeclared exception!
      try { 
        relationship0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.Relationship", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Relationship relationship0 = new Relationship();
      relationship0.setPosition((byte) (-94));
      Relationship relationship1 = new Relationship();
      boolean boolean0 = relationship0.equalsImpl(relationship1);
      assertEquals((-94), relationship0.getPosition());
      assertFalse(boolean0);
  }
}
