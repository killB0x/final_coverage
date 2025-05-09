/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 12:49:38 GMT 2022
 */

package edu.nps.moves.dis7;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis7.Sensor;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Sensor_ESTest extends Sensor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setQuantity(2401);
      Sensor sensor1 = new Sensor();
      boolean boolean0 = sensor0.equals(sensor1);
      assertEquals(2401, sensor0.getQuantity());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Sensor sensor1 = new Sensor();
      sensor1.setStation((-693L));
      boolean boolean0 = sensor0.equals(sensor1);
      assertEquals((-693L), sensor1.getStation());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Sensor sensor1 = new Sensor();
      sensor1.setSensorType((-706));
      boolean boolean0 = sensor0.equals(sensor1);
      assertEquals((-706), sensor1.getSensorType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      assertEquals(0, sensor0.getPadding());
      
      sensor0.padding = 1;
      boolean boolean0 = sensor0.equalsImpl(sensor0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.sensorOnOffStatus = (short) (-1);
      Sensor sensor1 = new Sensor();
      boolean boolean0 = sensor1.equals(sensor0);
      assertFalse(sensor0.equals((Object)sensor1));
      assertEquals(0, sensor1.getPadding());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setSensorTypeSource((short)325);
      Sensor sensor1 = new Sensor();
      boolean boolean0 = sensor0.equals(sensor1);
      assertEquals((short)325, sensor0.getSensorTypeSource());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.sensorTypeSource = (short) (-2011);
      boolean boolean0 = sensor0.equalsImpl(sensor0);
      assertEquals(0, sensor0.getPadding());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1591);
      sensor0.setQuantity((-1));
      sensor0.marshal(byteBuffer0);
      assertEquals((-1), sensor0.getQuantity());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("%=f~Im 8?v]\"e");
      sensor0.padding = (-857);
      sensor0.marshal(byteBuffer0);
      assertEquals(0, sensor0.getQuantity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.sensorTypeSource = (short) (-2011);
      Charset charset0 = Charset.defaultCharset();
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        sensor0.marshal(byteBuffer0);
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
      Sensor sensor0 = new Sensor();
      sensor0.setQuantity(1);
      MockPrintStream mockPrintStream0 = new MockPrintStream("8jL=e7(Hmo8_IjLW<T");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      sensor0.marshal(dataOutputStream0);
      assertEquals(1, sensor0.getQuantity());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.padding = 1;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      sensor0.marshal(dataOutputStream0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.sensorTypeSource = (short) (-2011);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      sensor0.marshal(dataOutputStream0);
      assertEquals("%\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setSensorType((-4785));
      int int0 = sensor0.getMarshalledSize();
      assertEquals((-4785), sensor0.getSensorType());
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setQuantity((-1));
      int int0 = sensor0.getMarshalledSize();
      assertEquals((-1), sensor0.getQuantity());
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      assertEquals(0, sensor0.getPadding());
      
      sensor0.padding = (int) (short)4;
      int int0 = sensor0.getMarshalledSize();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1591);
      sensor0.unmarshal(byteBuffer0);
      assertEquals((short)0, sensor0.getSensorOnOffStatus());
      assertEquals(0, sensor0.getPadding());
      assertEquals(0, sensor0.getQuantity());
      assertEquals((short)0, sensor0.getSensorTypeSource());
      assertEquals(0, sensor0.getSensorType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 3281);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      sensor0.unmarshal(dataInputStream0);
      assertEquals(0, sensor0.getPadding());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.marshal((DataOutputStream) null);
      assertEquals(0, sensor0.getPadding());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.station = (long) (short)384;
      long long0 = sensor0.getStation();
      assertEquals(384L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setStation((-693L));
      long long0 = sensor0.getStation();
      assertEquals((-693L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.sensorTypeSource = (short) (-2011);
      short short0 = sensor0.getSensorTypeSource();
      assertEquals((short) (-2011), short0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      sensor0.unmarshal(dataInputStream0);
      int int0 = sensor0.getSensorType();
      assertEquals(256, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setSensorType((-857));
      int int0 = sensor0.getSensorType();
      assertEquals((-857), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)99;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 1146);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      sensor0.unmarshal(dataInputStream0);
      short short0 = sensor0.getSensorOnOffStatus();
      assertEquals((short)99, short0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setQuantity(1);
      int int0 = sensor0.getQuantity();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.quantity = (-1438);
      int int0 = sensor0.getQuantity();
      assertEquals((-1438), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.padding = (int) (short)4;
      int int0 = sensor0.getPadding();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.padding = (-857);
      int int0 = sensor0.getPadding();
      assertEquals((-857), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      // Undeclared exception!
      try { 
        sensor0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.Sensor", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      // Undeclared exception!
      try { 
        sensor0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis7.Sensor", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Sensor sensor1 = new Sensor();
      assertEquals(0, sensor1.getPadding());
      
      sensor1.padding = (-2365);
      boolean boolean0 = sensor0.equalsImpl(sensor1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Sensor sensor1 = new Sensor();
      assertTrue(sensor1.equals((Object)sensor0));
      
      sensor1.quantity = 3195;
      boolean boolean0 = sensor0.equalsImpl(sensor1);
      assertFalse(sensor1.equals((Object)sensor0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Sensor sensor1 = new Sensor();
      assertTrue(sensor1.equals((Object)sensor0));
      
      sensor0.station = 1L;
      boolean boolean0 = sensor1.equalsImpl(sensor0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Sensor sensor1 = new Sensor();
      assertTrue(sensor1.equals((Object)sensor0));
      
      sensor1.sensorType = 1350;
      boolean boolean0 = sensor0.equalsImpl(sensor1);
      assertFalse(sensor1.equals((Object)sensor0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Sensor sensor1 = new Sensor();
      assertTrue(sensor1.equals((Object)sensor0));
      
      sensor1.sensorOnOffStatus = (short)1069;
      boolean boolean0 = sensor0.equals(sensor1);
      assertFalse(sensor1.equals((Object)sensor0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.sensorTypeSource = (short) (-2011);
      Sensor sensor1 = new Sensor();
      boolean boolean0 = sensor0.equalsImpl(sensor1);
      assertEquals(0, sensor1.getPadding());
      assertFalse(boolean0);
      assertFalse(sensor1.equals((Object)sensor0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      boolean boolean0 = sensor0.equalsImpl("D:~f->E6#}5?");
      assertFalse(boolean0);
      assertEquals(0, sensor0.getPadding());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Sensor sensor1 = new Sensor();
      boolean boolean0 = sensor0.equals(sensor1);
      assertTrue(boolean0);
      assertEquals(0, sensor1.getPadding());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      Object object0 = new Object();
      boolean boolean0 = sensor0.equals(object0);
      assertEquals(0, sensor0.getPadding());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      boolean boolean0 = sensor0.equals(sensor0);
      assertTrue(boolean0);
      assertEquals(0, sensor0.getPadding());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      boolean boolean0 = sensor0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0, sensor0.getPadding());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      int int0 = sensor0.getQuantity();
      assertEquals(0, sensor0.getPadding());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.getSensorOnOffStatus();
      assertEquals(0, sensor0.getPadding());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      int int0 = sensor0.getPadding();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setSensorOnOffStatus((short) (-530));
      short short0 = sensor0.getSensorOnOffStatus();
      assertEquals((short) (-530), short0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        sensor0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.getSensorTypeSource();
      assertEquals(0, sensor0.getPadding());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.getStation();
      assertEquals(0, sensor0.getPadding());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      int int0 = sensor0.getSensorType();
      assertEquals(0, int0);
      assertEquals(0, sensor0.getPadding());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setSensorTypeSource((short)325);
      short short0 = sensor0.getSensorTypeSource();
      assertEquals((short)325, short0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Sensor sensor0 = new Sensor();
      sensor0.setPadding(1012);
      assertEquals(1012, sensor0.getPadding());
  }
}
