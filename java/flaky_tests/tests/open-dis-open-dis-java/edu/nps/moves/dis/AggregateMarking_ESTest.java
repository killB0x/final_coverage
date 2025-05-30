/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 12:57:49 GMT 2022
 */

package edu.nps.moves.dis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis.AggregateMarking;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AggregateMarking_ESTest extends AggregateMarking_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      AggregateMarking aggregateMarking1 = new AggregateMarking();
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-67);
      aggregateMarking1.characters = byteArray0;
      // Undeclared exception!
      try { 
        aggregateMarking0.equalsImpl(aggregateMarking1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("edu.nps.moves.dis.AggregateMarking", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      aggregateMarking0.setCharacters((byte[]) null);
      byte[] byteArray0 = aggregateMarking0.getCharacters();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      byte[] byteArray0 = new byte[0];
      aggregateMarking0.setCharacters(byteArray0);
      byte[] byteArray1 = aggregateMarking0.getCharacters();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      aggregateMarking0.setCharacterSet((short)1330);
      short short0 = aggregateMarking0.getCharacterSet();
      assertEquals((short)1330, short0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      aggregateMarking0.setCharacterSet((short) (-351));
      short short0 = aggregateMarking0.getCharacterSet();
      assertEquals((short) (-351), short0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      boolean boolean0 = aggregateMarking0.equalsImpl(aggregateMarking0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      try { 
        aggregateMarking0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      // Undeclared exception!
      try { 
        aggregateMarking0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.AggregateMarking", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(311);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        aggregateMarking0.marshal(byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.DirectByteBufferR", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      // Undeclared exception!
      try { 
        aggregateMarking0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      // Undeclared exception!
      try { 
        aggregateMarking0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.AggregateMarking", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      aggregateMarking0.setCharacters((byte[]) null);
      // Undeclared exception!
      try { 
        aggregateMarking0.equalsImpl(aggregateMarking0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.AggregateMarking", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      aggregateMarking0.setCharacters((byte[]) null);
      AggregateMarking aggregateMarking1 = new AggregateMarking();
      // Undeclared exception!
      try { 
        aggregateMarking0.equals(aggregateMarking1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.AggregateMarking", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      aggregateMarking0.characterSet = (short)673;
      AggregateMarking aggregateMarking1 = new AggregateMarking();
      boolean boolean0 = aggregateMarking1.equalsImpl(aggregateMarking0);
      assertFalse(aggregateMarking0.equals((Object)aggregateMarking1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      AggregateMarking aggregateMarking1 = new AggregateMarking();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)1;
      aggregateMarking1.characters = byteArray0;
      // Undeclared exception!
      try { 
        aggregateMarking0.equalsImpl(aggregateMarking1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("edu.nps.moves.dis.AggregateMarking", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      AggregateMarking aggregateMarking1 = new AggregateMarking();
      aggregateMarking0.setCharacterSet((short)255);
      boolean boolean0 = aggregateMarking0.equals(aggregateMarking1);
      assertEquals((short)255, aggregateMarking0.getCharacterSet());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3651);
      boolean boolean0 = aggregateMarking0.equalsImpl(byteBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      Object object0 = new Object();
      boolean boolean0 = aggregateMarking0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      boolean boolean0 = aggregateMarking0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      boolean boolean0 = aggregateMarking0.equals(aggregateMarking0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3651);
      aggregateMarking0.unmarshal(byteBuffer0);
      assertEquals(32, byteBuffer0.position());
      assertEquals("java.nio.DirectByteBuffer[pos=32 lim=3651 cap=3651]", byteBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3651);
      aggregateMarking0.marshal(byteBuffer0);
      assertEquals("java.nio.DirectByteBuffer[pos=32 lim=3651 cap=3651]", byteBuffer0.toString());
      assertEquals(3619, byteBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      byte[] byteArray0 = new byte[0];
      aggregateMarking0.setCharacters(byteArray0);
      AggregateMarking aggregateMarking1 = new AggregateMarking();
      // Undeclared exception!
      try { 
        aggregateMarking1.equals(aggregateMarking0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("edu.nps.moves.dis.AggregateMarking", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      byte[] byteArray0 = aggregateMarking0.getCharacters();
      assertEquals(31, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      short short0 = aggregateMarking0.getCharacterSet();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AggregateMarking aggregateMarking0 = new AggregateMarking();
      int int0 = aggregateMarking0.getMarshalledSize();
      assertEquals(32, int0);
  }
}
