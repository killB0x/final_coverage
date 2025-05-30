/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 11:26:16 GMT 2022
 */

package edu.nps.moves.dis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis.IffFundamentalData;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IffFundamentalData_ESTest extends IffFundamentalData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter6 = (-2550);
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertFalse(iffFundamentalData1.equals((Object)iffFundamentalData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter5(2997);
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData1.equalsImpl(iffFundamentalData0);
      assertEquals(2997, iffFundamentalData0.getParameter5());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter4 = 1410;
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertFalse(iffFundamentalData1.equals((Object)iffFundamentalData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      assertTrue(iffFundamentalData1.equals((Object)iffFundamentalData0));
      
      iffFundamentalData1.parameter2 = 4105;
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertFalse(iffFundamentalData1.equals((Object)iffFundamentalData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      assertTrue(iffFundamentalData1.equals((Object)iffFundamentalData0));
      
      iffFundamentalData1.modifier = (short)2;
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertFalse(iffFundamentalData1.equals((Object)iffFundamentalData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setInformationLayers((short) (-2917));
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertEquals((short) (-2917), iffFundamentalData0.getInformationLayers());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      assertTrue(iffFundamentalData1.equals((Object)iffFundamentalData0));
      
      iffFundamentalData1.alternateParameter4 = (short) (-1141);
      boolean boolean0 = iffFundamentalData1.equalsImpl(iffFundamentalData0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      assertTrue(iffFundamentalData1.equals((Object)iffFundamentalData0));
      
      iffFundamentalData1.systemStatus = (short)1;
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertFalse(iffFundamentalData1.equals((Object)iffFundamentalData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter1((-1));
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4105);
      iffFundamentalData0.marshal(byteBuffer0);
      assertEquals((-1), iffFundamentalData0.getParameter1());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(3469);
      iffFundamentalData0.setParameter5(2997);
      iffFundamentalData0.marshal(byteBuffer0);
      assertEquals(2997, iffFundamentalData0.getParameter5());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter4(710);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(3469);
      iffFundamentalData0.marshal(byteBuffer0);
      assertEquals(710, iffFundamentalData0.getParameter4());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter3 = (int) (short) (-405);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2952);
      iffFundamentalData0.marshal(byteBuffer0);
      assertTrue(byteBuffer0.hasArray());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter2((-1));
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4105);
      iffFundamentalData0.marshal(byteBuffer0);
      assertEquals((-1), iffFundamentalData0.getParameter2());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      iffFundamentalData0.parameter1 = (int) (byte)122;
      // Undeclared exception!
      try { 
        iffFundamentalData0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.modifier = (short) (-405);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2952);
      iffFundamentalData0.marshal(byteBuffer0);
      assertEquals(0, iffFundamentalData0.getParameter6());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setInformationLayers((short) (-920));
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        iffFundamentalData0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.systemStatus = (short)1;
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        iffFundamentalData0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setModifier((short)3077);
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        iffFundamentalData0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter1 = 3284;
      int int0 = iffFundamentalData0.getMarshalledSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter2 = 1082;
      int int0 = iffFundamentalData0.getMarshalledSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter3(1283);
      int int0 = iffFundamentalData0.getMarshalledSize();
      assertEquals(1283, iffFundamentalData0.getParameter3());
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter4((-1243));
      int int0 = iffFundamentalData0.getMarshalledSize();
      assertEquals((-1243), iffFundamentalData0.getParameter4());
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter5(4675);
      int int0 = iffFundamentalData0.getMarshalledSize();
      assertEquals(4675, iffFundamentalData0.getParameter5());
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter6(575);
      int int0 = iffFundamentalData0.getMarshalledSize();
      assertEquals(575, iffFundamentalData0.getParameter6());
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(585);
      iffFundamentalData0.unmarshal(byteBuffer0);
      assertEquals((short)0, iffFundamentalData0.getAlternateParameter4());
      assertEquals((short)0, iffFundamentalData0.getInformationLayers());
      assertEquals(0, iffFundamentalData0.getParameter3());
      assertEquals(0, iffFundamentalData0.getParameter2());
      assertEquals((short)0, iffFundamentalData0.getModifier());
      assertEquals(0, iffFundamentalData0.getParameter1());
      assertEquals(0, iffFundamentalData0.getParameter6());
      assertEquals(0, iffFundamentalData0.getParameter5());
      assertEquals((short)0, iffFundamentalData0.getSystemStatus());
      assertEquals(0, iffFundamentalData0.getParameter4());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setSystemStatus((short)1);
      short short0 = iffFundamentalData0.getSystemStatus();
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setSystemStatus((short) (-63));
      short short0 = iffFundamentalData0.getSystemStatus();
      assertEquals((short) (-63), short0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter6((short)1);
      int int0 = iffFundamentalData0.getParameter6();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter6 = (-3518);
      int int0 = iffFundamentalData0.getParameter6();
      assertEquals((-3518), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter5 = 438;
      int int0 = iffFundamentalData0.getParameter5();
      assertEquals(438, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter5 = (int) (short) (-405);
      int int0 = iffFundamentalData0.getParameter5();
      assertEquals((-405), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter4(2393);
      int int0 = iffFundamentalData0.getParameter4();
      assertEquals(2393, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter4((-968));
      int int0 = iffFundamentalData0.getParameter4();
      assertEquals((-968), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter3(1283);
      int int0 = iffFundamentalData0.getParameter3();
      assertEquals(1283, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter3 = (int) (short) (-405);
      int int0 = iffFundamentalData0.getParameter3();
      assertEquals((-405), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter2 = 1082;
      int int0 = iffFundamentalData0.getParameter2();
      assertEquals(1082, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter2((-1));
      int int0 = iffFundamentalData0.getParameter2();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter1(1764);
      int int0 = iffFundamentalData0.getParameter1();
      assertEquals(1764, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter1((-1));
      int int0 = iffFundamentalData0.getParameter1();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.modifier = (short)2701;
      short short0 = iffFundamentalData0.getModifier();
      assertEquals((short)2701, short0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.modifier = (short) (-1);
      short short0 = iffFundamentalData0.getModifier();
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setInformationLayers((short)456);
      short short0 = iffFundamentalData0.getInformationLayers();
      assertEquals((short)456, short0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setInformationLayers((short) (-1299));
      short short0 = iffFundamentalData0.getInformationLayers();
      assertEquals((short) (-1299), short0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setAlternateParameter4((short)1);
      short short0 = iffFundamentalData0.getAlternateParameter4();
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.alternateParameter4 = (short) (-1);
      short short0 = iffFundamentalData0.getAlternateParameter4();
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      // Undeclared exception!
      try { 
        iffFundamentalData0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.IffFundamentalData", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter4(710);
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData1.equalsImpl(iffFundamentalData0);
      assertEquals(710, iffFundamentalData0.getParameter4());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.parameter2 = 1082;
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertFalse(iffFundamentalData1.equals((Object)iffFundamentalData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      assertTrue(iffFundamentalData1.equals((Object)iffFundamentalData0));
      
      iffFundamentalData0.parameter1 = (int) (short) (-1);
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertFalse(iffFundamentalData1.equals((Object)iffFundamentalData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      iffFundamentalData1.setParameter4((-1));
      boolean boolean0 = iffFundamentalData1.equals(iffFundamentalData0);
      assertEquals((-1), iffFundamentalData1.getParameter4());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter3(1283);
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertEquals(1283, iffFundamentalData0.getParameter3());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.informationLayers = (short)1;
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertFalse(iffFundamentalData1.equals((Object)iffFundamentalData0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.systemStatus = (short)710;
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      Object object0 = new Object();
      boolean boolean0 = iffFundamentalData0.equalsImpl(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData1.equals(iffFundamentalData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      Object object0 = new Object();
      boolean boolean0 = iffFundamentalData0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equals(iffFundamentalData0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        iffFundamentalData0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      short short0 = iffFundamentalData0.getAlternateParameter4();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter5(4675);
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertEquals(4675, iffFundamentalData0.getParameter5());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      int int0 = iffFundamentalData0.getParameter1();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      int int0 = iffFundamentalData0.getParameter2();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      short short0 = iffFundamentalData0.getSystemStatus();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setAlternateParameter4((short)1233);
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertEquals((short)1233, iffFundamentalData0.getAlternateParameter4());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      short short0 = iffFundamentalData0.getInformationLayers();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter6(575);
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData0.equalsImpl(iffFundamentalData1);
      assertEquals(575, iffFundamentalData0.getParameter6());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      int int0 = iffFundamentalData0.getParameter4();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      int int0 = iffFundamentalData0.getParameter6();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      int int0 = iffFundamentalData0.getParameter3();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      // Undeclared exception!
      try { 
        iffFundamentalData0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.IffFundamentalData", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter1((-1));
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData1.equals(iffFundamentalData0);
      assertEquals((-1), iffFundamentalData0.getParameter1());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      int int0 = iffFundamentalData0.getParameter5();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      iffFundamentalData0.setParameter3(7);
      IffFundamentalData iffFundamentalData1 = new IffFundamentalData();
      boolean boolean0 = iffFundamentalData1.equalsImpl(iffFundamentalData0);
      assertEquals(7, iffFundamentalData0.getParameter3());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      IffFundamentalData iffFundamentalData0 = new IffFundamentalData();
      short short0 = iffFundamentalData0.getModifier();
      assertEquals((short)0, short0);
  }
}
