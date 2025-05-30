/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 19:35:53 GMT 2022
 */

package com.pyramidacceptors.ptalk.api;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pyramidacceptors.ptalk.api.CreditActions;
import com.pyramidacceptors.ptalk.api.RS232Packet;
import com.pyramidacceptors.ptalk.api.RS232Socket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RS232Socket_ESTest extends RS232Socket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      byte[] byteArray0 = new byte[0];
      RS232Packet rS232Packet0 = rS232Socket0.parseResponse(byteArray0);
      assertEquals(0, rS232Packet0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      // Undeclared exception!
      try { 
        rS232Socket0.parseResponse((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pyramidacceptors.ptalk.api.RS232Packet", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        rS232Socket0.generateCommandCustom(byteArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      // Undeclared exception!
      try { 
        rS232Socket0.generateCommandCustom((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bytes must not be null
         //
         verifyException("com.pyramidacceptors.ptalk.api.RS232Packet", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      // Undeclared exception!
      try { 
        rS232Socket0.generateCommand((CreditActions) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pyramidacceptors.ptalk.api.RS232Socket", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      CreditActions creditActions0 = CreditActions.RETURN;
      byte[] byteArray0 = rS232Socket0.generateCommand(creditActions0);
      assertArrayEquals(new byte[] {(byte)2, (byte)8, (byte)16, (byte)127, (byte)80, (byte)0, (byte)3, (byte)55}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      CreditActions creditActions0 = CreditActions.NONE;
      byte[] byteArray0 = rS232Socket0.generateCommand(creditActions0);
      assertArrayEquals(new byte[] {(byte)2, (byte)8, (byte)16, (byte)127, (byte)0, (byte)0, (byte)3, (byte)103}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      CreditActions creditActions0 = CreditActions.ACCEPT;
      byte[] byteArray0 = rS232Socket0.generateCommand(creditActions0);
      rS232Socket0.parseResponse(byteArray0);
      assertArrayEquals(new byte[] {(byte)2, (byte)8, (byte)16, (byte)127, (byte)48, (byte)0, (byte)3, (byte)87}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      CreditActions creditActions0 = CreditActions.ACCEPT;
      byte[] byteArray0 = rS232Socket0.generateCommand(creditActions0);
      byte[] byteArray1 = rS232Socket0.generateCommandCustom(byteArray0);
      byte[] byteArray2 = rS232Socket0.generateCommandCustom(byteArray1);
      byte[] byteArray3 = rS232Socket0.generateCommandCustom(byteArray2);
      RS232Packet rS232Packet0 = rS232Socket0.parseResponse(byteArray3);
      assertArrayEquals(new byte[] {(byte)2, (byte)8, (byte)16, (byte)127, (byte)48, (byte)0, (byte)3, (byte)87, (byte)84}, byteArray1);
      assertEquals((byte)87, rS232Packet0.getAcceptorModel());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      RS232Socket rS232Socket0 = new RS232Socket();
      int int0 = rS232Socket0.getMaxPacketRespSize();
      assertEquals(11, int0);
  }
}
