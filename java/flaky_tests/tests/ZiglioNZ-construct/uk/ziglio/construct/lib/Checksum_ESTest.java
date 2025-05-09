/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 22:17:45 GMT 2022
 */

package uk.ziglio.construct.lib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ziglio.construct.lib.Checksum;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Checksum_ESTest extends Checksum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-1);
      byteArray0[5] = (byte) (-1);
      long long0 = Checksum.calculateChecksum(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Checksum.calculateChecksum((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ziglio.construct.lib.Checksum", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)60;
      byteArray0[2] = (byte) (-1);
      long long0 = Checksum.calculateChecksum(byteArray0);
      assertEquals(50430L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)37;
      byteArray0[2] = (byte) (-1);
      long long0 = Checksum.calculateChecksum(byteArray0);
      assertEquals(56318L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Checksum checksum0 = new Checksum();
  }
}
