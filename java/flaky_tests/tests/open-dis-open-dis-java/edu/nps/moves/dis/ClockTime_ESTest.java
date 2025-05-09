/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 14:32:18 GMT 2022
 */

package edu.nps.moves.dis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.nps.moves.dis.ClockTime;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClockTime_ESTest extends ClockTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      ClockTime clockTime1 = new ClockTime();
      assertTrue(clockTime1.equals((Object)clockTime0));
      
      clockTime1.timePastHour = 296L;
      boolean boolean0 = clockTime0.equals(clockTime1);
      assertFalse(clockTime1.equals((Object)clockTime0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      clockTime0.hour = (-465);
      ClockTime clockTime1 = new ClockTime();
      boolean boolean0 = clockTime0.equalsImpl(clockTime1);
      assertFalse(boolean0);
      assertFalse(clockTime1.equals((Object)clockTime0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      clockTime0.setHour((-1));
      int int0 = clockTime0.getMarshalledSize();
      assertEquals((-1), clockTime0.getHour());
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(8);
      clockTime0.unmarshal(byteBuffer0);
      assertEquals(8, byteBuffer0.capacity());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1055);
      clockTime0.marshal(byteBuffer0);
      assertEquals(0, clockTime0.getHour());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      clockTime0.setTimePastHour(2232L);
      long long0 = clockTime0.getTimePastHour();
      assertEquals(2232L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      clockTime0.setTimePastHour((-1L));
      long long0 = clockTime0.getTimePastHour();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      clockTime0.setHour(484);
      int int0 = clockTime0.getHour();
      assertEquals(484, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      clockTime0.hour = (-465);
      int int0 = clockTime0.getHour();
      assertEquals((-465), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      boolean boolean0 = clockTime0.equalsImpl(clockTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
      // Undeclared exception!
      try { 
        clockTime0.unmarshal(byteBuffer0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      // Undeclared exception!
      try { 
        clockTime0.marshal(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      ClockTime clockTime1 = new ClockTime();
      clockTime1.setHour(484);
      boolean boolean0 = clockTime1.equalsImpl(clockTime0);
      assertEquals(484, clockTime1.getHour());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      ClockTime clockTime1 = new ClockTime();
      assertTrue(clockTime1.equals((Object)clockTime0));
      
      clockTime1.timePastHour = (-1L);
      boolean boolean0 = clockTime0.equalsImpl(clockTime1);
      assertFalse(clockTime1.equals((Object)clockTime0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      Object object0 = new Object();
      boolean boolean0 = clockTime0.equalsImpl(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      Object object0 = new Object();
      boolean boolean0 = clockTime0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      ClockTime clockTime1 = new ClockTime();
      boolean boolean0 = clockTime0.equals(clockTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      boolean boolean0 = clockTime0.equals(clockTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      boolean boolean0 = clockTime0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      // Undeclared exception!
      try { 
        clockTime0.marshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.ClockTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      long long0 = clockTime0.getTimePastHour();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      int int0 = clockTime0.getHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClockTime clockTime0 = new ClockTime();
      // Undeclared exception!
      try { 
        clockTime0.unmarshal((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.nps.moves.dis.ClockTime", e);
      }
  }
}
