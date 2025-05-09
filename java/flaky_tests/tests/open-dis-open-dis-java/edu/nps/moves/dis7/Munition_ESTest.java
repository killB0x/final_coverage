/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 13:17:13 GMT 2022
 */

package edu.nps.moves.dis7;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis7.EntityType;
import edu.nps.moves.dis7.Munition;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Munition_ESTest extends Munition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setPadding((short)255);
      Munition munition1 = new Munition();
      boolean boolean0 = munition0.equalsImpl(munition1);
      assertEquals((short)255, munition0.getPadding());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.munitionStatus = (short)1366;
      Munition munition1 = new Munition();
      boolean boolean0 = munition0.equalsImpl(munition1);
      assertFalse(boolean0);
      assertFalse(munition1.equals((Object)munition0));
      assertEquals((short)0, munition1.getPadding());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setPadding((short)255);
      boolean boolean0 = munition0.equalsImpl(munition0);
      assertEquals((short)255, munition0.getPadding());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setQuantity(16);
      Munition munition1 = new Munition();
      boolean boolean0 = munition1.equals(munition0);
      assertEquals(16, munition0.getQuantity());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Munition munition0 = new Munition();
      Munition munition1 = new Munition();
      munition1.setStation((byte) (-84));
      boolean boolean0 = munition1.equalsImpl(munition0);
      assertEquals((-84L), munition1.getStation());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Munition munition0 = new Munition();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2381);
      munition0.setMunitionStatus((short) (-1632));
      munition0.marshal(byteBuffer0);
      assertEquals((short) (-1632), munition0.getMunitionStatus());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setQuantity(255);
      int int0 = munition0.getMarshalledSize();
      assertEquals(255, munition0.getQuantity());
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Munition munition0 = new Munition();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      munition0.marshal(dataOutputStream0);
      assertEquals((short)0, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setStation(2650L);
      long long0 = munition0.getStation();
      assertEquals(2650L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.station = (-621L);
      long long0 = munition0.getStation();
      assertEquals((-621L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setQuantity(255);
      int int0 = munition0.getQuantity();
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setPadding((short)2);
      short short0 = munition0.getPadding();
      assertEquals((short)2, short0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.padding = (short) (-1);
      short short0 = munition0.getPadding();
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setMunitionType((EntityType) null);
      EntityType entityType0 = munition0.getMunitionType();
      assertEquals((short)0, munition0.getPadding());
      assertNull(entityType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Munition munition0 = new Munition();
      EntityType entityType0 = munition0.getMunitionType();
      entityType0.subcategory = (short) (-1002);
      munition0.getMunitionType();
      assertEquals((short)0, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Munition munition0 = new Munition();
      EntityType entityType0 = munition0.getMunitionType();
      entityType0.setSpecific((short)255);
      munition0.getMunitionType();
      assertEquals((short)0, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Munition munition0 = new Munition();
      EntityType entityType0 = munition0.getMunitionType();
      entityType0.setCountry((short)255);
      munition0.getMunitionType();
      assertEquals((short)0, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.munitionStatus = (short)281;
      short short0 = munition0.getMunitionStatus();
      assertEquals((short)281, short0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setMunitionStatus((short) (-11));
      short short0 = munition0.getMunitionStatus();
      assertEquals((short) (-11), short0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, 0);
      Munition munition0 = new Munition();
      // Undeclared exception!
      try { 
        munition0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Munition munition0 = new Munition();
      // Undeclared exception!
      try { 
        munition0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.EntityType", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Munition munition0 = new Munition();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      // Undeclared exception!
      try { 
        munition0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setMunitionType((EntityType) null);
      // Undeclared exception!
      try { 
        munition0.getMarshalledSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.Munition", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Munition munition0 = new Munition();
      Munition munition1 = new Munition();
      assertEquals((short)0, munition1.getPadding());
      
      munition1.padding = (short)805;
      boolean boolean0 = munition0.equalsImpl(munition1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.station = 255L;
      Munition munition1 = new Munition();
      boolean boolean0 = munition0.equalsImpl(munition1);
      assertFalse(boolean0);
      assertFalse(munition1.equals((Object)munition0));
      assertEquals((short)0, munition1.getPadding());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Munition munition0 = new Munition();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Munition munition1 = new Munition();
      assertTrue(munition1.equals((Object)munition0));
      
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      munition0.unmarshal(dataInputStream0);
      boolean boolean0 = munition0.equals(munition1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Munition munition0 = new Munition();
      Object object0 = new Object();
      boolean boolean0 = munition0.equalsImpl(object0);
      assertFalse(boolean0);
      assertEquals((short)0, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Munition munition0 = new Munition();
      Object object0 = new Object();
      boolean boolean0 = munition0.equals(object0);
      assertFalse(boolean0);
      assertEquals((short)0, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Munition munition0 = new Munition();
      boolean boolean0 = munition0.equals((Object) null);
      assertEquals((short)0, munition0.getPadding());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Munition munition0 = new Munition();
      boolean boolean0 = munition0.equals(munition0);
      assertEquals((short)0, munition0.getPadding());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setMunitionStatus((short) (-2673));
      Munition munition1 = new Munition();
      boolean boolean0 = munition0.equalsImpl(munition1);
      assertEquals((short) (-2673), munition0.getMunitionStatus());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Munition munition0 = new Munition();
      short short0 = munition0.getPadding();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setPadding((short)255);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((short)0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      munition0.marshal(dataOutputStream0);
      assertEquals((short)255, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.getStation();
      assertEquals((short)0, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.setQuantity(255);
      Munition munition1 = new Munition();
      boolean boolean0 = munition0.equalsImpl(munition1);
      assertEquals(255, munition0.getQuantity());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Munition munition0 = new Munition();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1366);
      munition0.unmarshal(byteBuffer0);
      assertEquals(0, munition0.getQuantity());
      assertEquals((short)0, munition0.getPadding());
      assertEquals((short)0, munition0.getMunitionStatus());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Munition munition0 = new Munition();
      int int0 = munition0.getQuantity();
      assertEquals(0, int0);
      assertEquals((short)0, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Munition munition0 = new Munition();
      munition0.getMunitionStatus();
      assertEquals((short)0, munition0.getPadding());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Munition munition0 = new Munition();
      // Undeclared exception!
      try { 
        munition0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.EntityType", e);
      }
  }
}
