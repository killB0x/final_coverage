/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 13:37:15 GMT 2022
 */

package edu.nps.moves.dis7;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis7.DataQueryDatumSpecification;
import edu.nps.moves.dis7.UnsignedDISInteger;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DataQueryDatumSpecification_ESTest extends DataQueryDatumSpecification_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      DataQueryDatumSpecification dataQueryDatumSpecification1 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification1.setNumberOfVariableDatums((-2035L));
      boolean boolean0 = dataQueryDatumSpecification0.equalsImpl(dataQueryDatumSpecification1);
      assertEquals((-2035L), dataQueryDatumSpecification1.getNumberOfVariableDatums());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      DataQueryDatumSpecification dataQueryDatumSpecification1 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification1.setNumberOfFixedDatums((-1L));
      boolean boolean0 = dataQueryDatumSpecification0.equals(dataQueryDatumSpecification1);
      assertEquals((-1L), dataQueryDatumSpecification1.getNumberOfFixedDatums());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.numberOfFixedDatums = 2201L;
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        dataQueryDatumSpecification0.marshal(byteBuffer0);
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
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.numberOfFixedDatums = 2201L;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(":o8yL^(jON >L&M&Z");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dataQueryDatumSpecification0.marshal(dataOutputStream0);
      assertEquals(2201L, dataQueryDatumSpecification0.getNumberOfFixedDatums());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(896);
      dataQueryDatumSpecification0.unmarshal(byteBuffer0);
      assertEquals("java.nio.DirectByteBuffer[pos=16 lim=896 cap=896]", byteBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)39);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      dataQueryDatumSpecification0.unmarshal(dataInputStream0);
      assertEquals(0L, dataQueryDatumSpecification0.getNumberOfFixedDatums());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      dataQueryDatumSpecification0.unmarshal(dataInputStream0);
      assertEquals(0L, dataQueryDatumSpecification0.getNumberOfVariableDatums());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(3973);
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = charset0.encode(charBuffer0);
      dataQueryDatumSpecification0.marshal(byteBuffer1);
      assertFalse(byteBuffer1.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.setVariableDatumIDList((UnsignedDISInteger) null);
      UnsignedDISInteger unsignedDISInteger0 = dataQueryDatumSpecification0.getVariableDatumIDList();
      assertNull(unsignedDISInteger0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      UnsignedDISInteger unsignedDISInteger0 = dataQueryDatumSpecification0.variableDatumIDList;
      unsignedDISInteger0.val = (long) 16;
      UnsignedDISInteger unsignedDISInteger1 = dataQueryDatumSpecification0.getVariableDatumIDList();
      assertEquals(16L, unsignedDISInteger1.getVal());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      UnsignedDISInteger unsignedDISInteger0 = dataQueryDatumSpecification0.fixedDatumIDList;
      dataQueryDatumSpecification0.variableDatumIDList = unsignedDISInteger0;
      unsignedDISInteger0.setVal((-577L));
      UnsignedDISInteger unsignedDISInteger1 = dataQueryDatumSpecification0.getVariableDatumIDList();
      assertEquals((-577L), unsignedDISInteger1.getVal());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.numberOfVariableDatums = 2619L;
      long long0 = dataQueryDatumSpecification0.getNumberOfVariableDatums();
      assertEquals(2619L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.numberOfVariableDatums = (-365L);
      long long0 = dataQueryDatumSpecification0.getNumberOfVariableDatums();
      assertEquals((-365L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.numberOfFixedDatums = 1L;
      long long0 = dataQueryDatumSpecification0.getNumberOfFixedDatums();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.numberOfFixedDatums = (-49L);
      long long0 = dataQueryDatumSpecification0.getNumberOfFixedDatums();
      assertEquals((-49L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.setFixedDatumIDList((UnsignedDISInteger) null);
      UnsignedDISInteger unsignedDISInteger0 = dataQueryDatumSpecification0.getFixedDatumIDList();
      assertNull(unsignedDISInteger0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      UnsignedDISInteger unsignedDISInteger0 = dataQueryDatumSpecification0.variableDatumIDList;
      dataQueryDatumSpecification0.fixedDatumIDList = unsignedDISInteger0;
      unsignedDISInteger0.val = (long) 16;
      UnsignedDISInteger unsignedDISInteger1 = dataQueryDatumSpecification0.getFixedDatumIDList();
      assertSame(unsignedDISInteger1, unsignedDISInteger0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      boolean boolean0 = dataQueryDatumSpecification0.equalsImpl(dataQueryDatumSpecification0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      // Undeclared exception!
      try { 
        dataQueryDatumSpecification0.unmarshal(byteBuffer0);
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
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.setFixedDatumIDList((UnsignedDISInteger) null);
      // Undeclared exception!
      try { 
        dataQueryDatumSpecification0.equalsImpl(dataQueryDatumSpecification0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.DataQueryDatumSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.setNumberOfVariableDatums((-1205L));
      DataQueryDatumSpecification dataQueryDatumSpecification1 = new DataQueryDatumSpecification();
      boolean boolean0 = dataQueryDatumSpecification0.equalsImpl(dataQueryDatumSpecification1);
      assertEquals((-1205L), dataQueryDatumSpecification0.getNumberOfVariableDatums());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      DataQueryDatumSpecification dataQueryDatumSpecification1 = new DataQueryDatumSpecification();
      assertTrue(dataQueryDatumSpecification1.equals((Object)dataQueryDatumSpecification0));
      
      dataQueryDatumSpecification0.numberOfFixedDatums = (-1L);
      boolean boolean0 = dataQueryDatumSpecification0.equalsImpl(dataQueryDatumSpecification1);
      assertFalse(dataQueryDatumSpecification1.equals((Object)dataQueryDatumSpecification0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      Object object0 = new Object();
      boolean boolean0 = dataQueryDatumSpecification0.equalsImpl(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      Object object0 = new Object();
      boolean boolean0 = dataQueryDatumSpecification0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      DataQueryDatumSpecification dataQueryDatumSpecification1 = new DataQueryDatumSpecification();
      boolean boolean0 = dataQueryDatumSpecification0.equals(dataQueryDatumSpecification1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      boolean boolean0 = dataQueryDatumSpecification0.equals(dataQueryDatumSpecification0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      boolean boolean0 = dataQueryDatumSpecification0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      long long0 = dataQueryDatumSpecification0.getNumberOfFixedDatums();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      // Undeclared exception!
      try { 
        dataQueryDatumSpecification0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.DataQueryDatumSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      UnsignedDISInteger unsignedDISInteger0 = dataQueryDatumSpecification0.getFixedDatumIDList();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-100);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      unsignedDISInteger0.unmarshal(byteBuffer0);
      UnsignedDISInteger unsignedDISInteger1 = dataQueryDatumSpecification0.getFixedDatumIDList();
      assertEquals(4, unsignedDISInteger1.getMarshalledSize());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      int int0 = dataQueryDatumSpecification0.getMarshalledSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      // Undeclared exception!
      try { 
        dataQueryDatumSpecification0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.DataQueryDatumSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      long long0 = dataQueryDatumSpecification0.getNumberOfVariableDatums();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.setVariableDatumIDList((UnsignedDISInteger) null);
      // Undeclared exception!
      try { 
        dataQueryDatumSpecification0.getMarshalledSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.DataQueryDatumSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      UnsignedDISInteger unsignedDISInteger0 = dataQueryDatumSpecification0.getVariableDatumIDList();
      unsignedDISInteger0.val = (-1205L);
      dataQueryDatumSpecification0.setFixedDatumIDList(unsignedDISInteger0);
      DataQueryDatumSpecification dataQueryDatumSpecification1 = new DataQueryDatumSpecification();
      boolean boolean0 = dataQueryDatumSpecification0.equalsImpl(dataQueryDatumSpecification1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DataQueryDatumSpecification dataQueryDatumSpecification0 = new DataQueryDatumSpecification();
      dataQueryDatumSpecification0.marshal((DataOutputStream) null);
      assertEquals(16, dataQueryDatumSpecification0.getMarshalledSize());
  }
}
