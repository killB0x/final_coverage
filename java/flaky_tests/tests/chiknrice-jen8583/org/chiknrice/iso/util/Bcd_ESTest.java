/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 01:49:54 GMT 2022
 */

package org.chiknrice.iso.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.chiknrice.iso.util.Bcd;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Bcd_ESTest extends Bcd_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bcd.encode("+/io{aGM_*e~vB:`0");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid numeric value [+/io{aGM_*e~vB:`0]
         //
         verifyException("org.chiknrice.iso.util.Bcd", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)117;
      String string0 = Bcd.decode(byteArray0);
      assertEquals("750000", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bcd.encode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.chiknrice.iso.util.Bcd", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bcd.decode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.chiknrice.iso.util.Bcd", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bcd.encode("??<:1400");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid numeric value [??<:1400]
         //
         verifyException("org.chiknrice.iso.util.Bcd", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = Bcd.encode("754865");
      assertEquals(3, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)117, (byte)72, (byte)101}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = Bcd.encode("");
      String string0 = Bcd.decode(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Bcd bcd0 = new Bcd();
  }
}
