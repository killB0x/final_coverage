/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 14:34:31 GMT 2022
 */

package edu.nps.moves.dis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis.AntennaLocation;
import edu.nps.moves.dis.Vector3Double;
import edu.nps.moves.dis.Vector3Float;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AntennaLocation_ESTest extends AntennaLocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(36);
      antennaLocation0.marshal(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=36 lim=36 cap=36]", byteBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      antennaLocation0.relativeAntennaLocation = null;
      Vector3Float vector3Float0 = antennaLocation0.getRelativeAntennaLocation();
      assertNull(vector3Float0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Float vector3Float0 = antennaLocation0.getRelativeAntennaLocation();
      vector3Float0.setZ(1144);
      Vector3Float vector3Float1 = antennaLocation0.getRelativeAntennaLocation();
      assertEquals(0.0F, vector3Float1.getY(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Float vector3Float0 = antennaLocation0.relativeAntennaLocation;
      vector3Float0.z = (-1.0F);
      Vector3Float vector3Float1 = antennaLocation0.getRelativeAntennaLocation();
      assertEquals((-1.0F), vector3Float1.getZ(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Float vector3Float0 = new Vector3Float();
      vector3Float0.setY(1665.1803F);
      antennaLocation0.setRelativeAntennaLocation(vector3Float0);
      Vector3Float vector3Float1 = antennaLocation0.getRelativeAntennaLocation();
      assertEquals(1665.1803F, vector3Float1.getY(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Float vector3Float0 = antennaLocation0.getRelativeAntennaLocation();
      vector3Float0.setY((-1932.1796F));
      Vector3Float vector3Float1 = antennaLocation0.getRelativeAntennaLocation();
      assertEquals(0.0F, vector3Float1.getZ(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Float vector3Float0 = antennaLocation0.relativeAntennaLocation;
      vector3Float0.x = 2677.0F;
      Vector3Float vector3Float1 = antennaLocation0.getRelativeAntennaLocation();
      assertEquals(12, vector3Float1.getMarshalledSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Float vector3Float0 = new Vector3Float();
      vector3Float0.setX((-3459.0F));
      antennaLocation0.setRelativeAntennaLocation(vector3Float0);
      Vector3Float vector3Float1 = antennaLocation0.getRelativeAntennaLocation();
      assertEquals((-3459.0F), vector3Float1.getX(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      antennaLocation0.antennaLocation = null;
      Vector3Double vector3Double0 = antennaLocation0.getAntennaLocation();
      assertNull(vector3Double0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Double vector3Double0 = antennaLocation0.antennaLocation;
      vector3Double0.setZ(1.0);
      Vector3Double vector3Double1 = antennaLocation0.getAntennaLocation();
      assertEquals(0.0, vector3Double1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      antennaLocation0.antennaLocation.z = (-818.569155);
      Vector3Double vector3Double0 = antennaLocation0.getAntennaLocation();
      assertEquals((-818.569155), vector3Double0.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Double vector3Double0 = new Vector3Double();
      vector3Double0.y = (-1213.95132);
      antennaLocation0.antennaLocation = vector3Double0;
      Vector3Double vector3Double1 = antennaLocation0.getAntennaLocation();
      assertEquals(24, vector3Double1.getMarshalledSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Double vector3Double0 = new Vector3Double();
      vector3Double0.x = 3.141592653589793;
      antennaLocation0.setAntennaLocation(vector3Double0);
      Vector3Double vector3Double1 = antennaLocation0.getAntennaLocation();
      assertEquals(3.141592653589793, vector3Double1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      antennaLocation0.antennaLocation.setX((-743.717));
      Vector3Double vector3Double0 = antennaLocation0.getAntennaLocation();
      assertEquals((-743.717), vector3Double0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      boolean boolean0 = antennaLocation0.equalsImpl(antennaLocation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        antennaLocation0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      // Undeclared exception!
      try { 
        antennaLocation0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.Vector3Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      // Undeclared exception!
      try { 
        antennaLocation0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.Vector3Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      antennaLocation0.relativeAntennaLocation = null;
      // Undeclared exception!
      try { 
        antennaLocation0.getMarshalledSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.AntennaLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      antennaLocation0.setRelativeAntennaLocation((Vector3Float) null);
      // Undeclared exception!
      try { 
        antennaLocation0.equalsImpl(antennaLocation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.AntennaLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      antennaLocation0.relativeAntennaLocation = null;
      AntennaLocation antennaLocation1 = new AntennaLocation();
      // Undeclared exception!
      try { 
        antennaLocation0.equals(antennaLocation1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.AntennaLocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      AntennaLocation antennaLocation1 = new AntennaLocation();
      assertTrue(antennaLocation1.equals((Object)antennaLocation0));
      
      antennaLocation1.setRelativeAntennaLocation((Vector3Float) null);
      boolean boolean0 = antennaLocation0.equalsImpl(antennaLocation1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Double vector3Double0 = antennaLocation0.antennaLocation;
      vector3Double0.convertLatitudeLongitudeAltitudeToDis();
      AntennaLocation antennaLocation1 = new AntennaLocation();
      boolean boolean0 = antennaLocation1.equalsImpl(antennaLocation0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Object object0 = new Object();
      boolean boolean0 = antennaLocation0.equalsImpl(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Object object0 = new Object();
      boolean boolean0 = antennaLocation0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      boolean boolean0 = antennaLocation0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      boolean boolean0 = antennaLocation0.equals(antennaLocation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      try { 
        antennaLocation0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      Vector3Double vector3Double0 = antennaLocation0.getAntennaLocation();
      vector3Double0.setY(2883.2554409);
      Vector3Double vector3Double1 = antennaLocation0.getAntennaLocation();
      assertEquals(24, vector3Double1.getMarshalledSize());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      int int0 = antennaLocation0.getMarshalledSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AntennaLocation antennaLocation0 = new AntennaLocation();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1144);
      antennaLocation0.unmarshal(byteBuffer0);
      assertEquals(1144, byteBuffer0.limit());
  }
}
