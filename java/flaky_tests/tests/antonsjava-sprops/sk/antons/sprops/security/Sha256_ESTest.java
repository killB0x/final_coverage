/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 13:19:51 GMT 2022
 */

package sk.antons.sprops.security;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sk.antons.sprops.security.Sha256;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Sha256_ESTest extends Sha256_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = Sha256.hash("Unable to get UTF-8 bytes from string");
      // Undeclared exception!
      try { 
        Sha256.hash(byteArray0, 1320, 1320);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input buffer too short
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Sha256.hash(byteArray0, (-2324), (-2324));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha256.hash((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to compute hash from null bytes
         //
         verifyException("sk.antons.sprops.security.Sha256", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = Sha256.hash("");
      byte[] byteArray1 = Sha256.hash(byteArray0, 0, 0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha256.hash((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to compute hash from null bytes
         //
         verifyException("sk.antons.sprops.security.Sha256", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha256.hash((byte[]) null, 2394, 2394);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to compute hash from null bytes
         //
         verifyException("sk.antons.sprops.security.Sha256", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = Sha256.hash(byteArray0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Sha256 sha256_0 = new Sha256();
  }
}
