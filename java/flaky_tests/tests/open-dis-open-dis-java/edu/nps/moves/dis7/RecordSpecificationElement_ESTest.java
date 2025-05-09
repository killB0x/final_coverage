/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 12:39:38 GMT 2022
 */

package edu.nps.moves.dis7;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis7.RecordSpecificationElement;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RecordSpecificationElement_ESTest extends RecordSpecificationElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      assertTrue(recordSpecificationElement1.equals((Object)recordSpecificationElement0));
      
      recordSpecificationElement1.recordValues = (-3131);
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement1);
      assertFalse(recordSpecificationElement1.equals((Object)recordSpecificationElement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordCount(4714);
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement1);
      assertEquals(4714, recordSpecificationElement0.getRecordCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordCount(4714);
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement0);
      assertEquals(4714, recordSpecificationElement0.getRecordCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      assertTrue(recordSpecificationElement1.equals((Object)recordSpecificationElement0));
      
      recordSpecificationElement1.recordSetSerialNumber = (-4232L);
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement1);
      assertFalse(recordSpecificationElement1.equals((Object)recordSpecificationElement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordID(1L);
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement1);
      assertEquals(1L, recordSpecificationElement0.getRecordID());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordID(1L);
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement0);
      assertEquals(1L, recordSpecificationElement0.getRecordID());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.recordValues = 1256;
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(3289);
      recordSpecificationElement0.marshal(byteBuffer0);
      assertTrue(byteBuffer0.hasArray());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)37;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      recordSpecificationElement0.unmarshal(dataInputStream0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3239);
      recordSpecificationElement0.marshal(byteBuffer0);
      assertEquals(0L, recordSpecificationElement0.getRecordSetSerialNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.recordCount = 0;
      recordSpecificationElement0.recordCount = (-2605);
      MockPrintStream mockPrintStream0 = new MockPrintStream("hVyH;4vFd*EAn f");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      recordSpecificationElement0.marshal(dataOutputStream0);
      assertEquals(0, recordSpecificationElement0.getRecordValues());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordLength((-2214));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      recordSpecificationElement0.marshal(dataOutputStream0);
      assertEquals((-2214), recordSpecificationElement0.getRecordLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("X4k~D|,{P/");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      recordSpecificationElement0.setRecordID(1L);
      recordSpecificationElement0.marshal(dataOutputStream0);
      assertEquals(1L, recordSpecificationElement0.getRecordID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordCount((short)4);
      int int0 = recordSpecificationElement0.getMarshalledSize();
      assertEquals(4, recordSpecificationElement0.getRecordCount());
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordLength(2768);
      int int0 = recordSpecificationElement0.getMarshalledSize();
      assertEquals(2768, recordSpecificationElement0.getRecordLength());
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.recordValues = 3371;
      int int0 = recordSpecificationElement0.getMarshalledSize();
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      recordSpecificationElement0.unmarshal(dataInputStream0);
      assertEquals(0, recordSpecificationElement0.getRecordValues());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordValues(255);
      int int0 = recordSpecificationElement0.getRecordValues();
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.recordValues = (-1066);
      int int0 = recordSpecificationElement0.getRecordValues();
      assertEquals((-1066), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordSetSerialNumber(255);
      long long0 = recordSpecificationElement0.getRecordSetSerialNumber();
      assertEquals(255L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordSetSerialNumber((-4790L));
      long long0 = recordSpecificationElement0.getRecordSetSerialNumber();
      assertEquals((-4790L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordLength(2768);
      int int0 = recordSpecificationElement0.getRecordLength();
      assertEquals(2768, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordLength((-2605));
      int int0 = recordSpecificationElement0.getRecordLength();
      assertEquals((-2605), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.recordID = 1L;
      long long0 = recordSpecificationElement0.getRecordID();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordID((-1655L));
      long long0 = recordSpecificationElement0.getRecordID();
      assertEquals((-1655L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordCount(2146976328);
      int int0 = recordSpecificationElement0.getRecordCount();
      assertEquals(2146976328, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordCount((-3175));
      int int0 = recordSpecificationElement0.getRecordCount();
      assertEquals((-3175), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.pad4 = (short)4;
      short short0 = recordSpecificationElement0.getPad4();
      assertEquals((short)4, short0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.pad4 = (short) (-1443);
      short short0 = recordSpecificationElement0.getPad4();
      assertEquals((short) (-1443), short0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        recordSpecificationElement0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      // Undeclared exception!
      try { 
        recordSpecificationElement0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.RecordSpecificationElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        recordSpecificationElement0.marshal(byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.DirectByteBufferR", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((short)2);
      // Undeclared exception!
      try { 
        recordSpecificationElement0.marshal(byteBuffer0);
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
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      // Undeclared exception!
      try { 
        recordSpecificationElement0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.RecordSpecificationElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      recordSpecificationElement1.setPad4((short)1);
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement1);
      assertEquals((short)1, recordSpecificationElement1.getPad4());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      assertTrue(recordSpecificationElement1.equals((Object)recordSpecificationElement0));
      
      recordSpecificationElement1.recordValues = (-1066);
      boolean boolean0 = recordSpecificationElement1.equalsImpl(recordSpecificationElement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      recordSpecificationElement1.setRecordCount(1383);
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement1);
      assertEquals(1383, recordSpecificationElement1.getRecordCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      recordSpecificationElement1.setRecordLength((-194));
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement1);
      assertEquals((-194), recordSpecificationElement1.getRecordLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.recordSetSerialNumber = 1L;
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      boolean boolean0 = recordSpecificationElement1.equalsImpl(recordSpecificationElement0);
      assertFalse(recordSpecificationElement0.equals((Object)recordSpecificationElement1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordID(4712);
      boolean boolean0 = recordSpecificationElement1.equalsImpl(recordSpecificationElement0);
      assertEquals(4712L, recordSpecificationElement0.getRecordID());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      Object object0 = new Object();
      boolean boolean0 = recordSpecificationElement0.equalsImpl(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      MockFile mockFile0 = new MockFile("Y\"1/M5ItkGgqf%<s");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      boolean boolean0 = recordSpecificationElement0.equals(mockFileOutputStream0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      boolean boolean0 = recordSpecificationElement0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      boolean boolean0 = recordSpecificationElement0.equals(recordSpecificationElement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      boolean boolean0 = recordSpecificationElement0.equals(recordSpecificationElement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      long long0 = recordSpecificationElement0.getRecordID();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.marshal((DataOutputStream) null);
      assertEquals(0, recordSpecificationElement0.getRecordValues());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      int int0 = recordSpecificationElement0.getRecordLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4696);
      recordSpecificationElement0.unmarshal(byteBuffer0);
      assertEquals(0, recordSpecificationElement0.getRecordValues());
      assertEquals(0, recordSpecificationElement0.getRecordCount());
      assertEquals((short)0, recordSpecificationElement0.getPad4());
      assertEquals(0, recordSpecificationElement0.getRecordLength());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      short short0 = recordSpecificationElement0.getPad4();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setRecordLength((-194));
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4707);
      recordSpecificationElement0.marshal(byteBuffer0);
      assertEquals((-194), recordSpecificationElement0.getRecordLength());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      int int0 = recordSpecificationElement0.getRecordCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      long long0 = recordSpecificationElement0.getRecordSetSerialNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      int int0 = recordSpecificationElement0.getRecordValues();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RecordSpecificationElement recordSpecificationElement0 = new RecordSpecificationElement();
      recordSpecificationElement0.setPad4((short)2);
      RecordSpecificationElement recordSpecificationElement1 = new RecordSpecificationElement();
      boolean boolean0 = recordSpecificationElement0.equalsImpl(recordSpecificationElement1);
      assertEquals((short)2, recordSpecificationElement0.getPad4());
      assertFalse(boolean0);
  }
}
