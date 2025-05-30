/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 15:33:25 GMT 2022
 */

package fun.fengwk.jwt4j.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fun.fengwk.jwt4j.support.HS256Signer;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HS256Signer_ESTest extends HS256Signer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HS256Signer hS256Signer0 = new HS256Signer();
      byte[] byteArray0 = new byte[5];
      SecretKeySpec secretKeySpec0 = new SecretKeySpec(byteArray0, "HS256");
      byte[] byteArray1 = hS256Signer0.sign(byteArray0, secretKeySpec0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HS256Signer hS256Signer0 = new HS256Signer();
      // Undeclared exception!
      try { 
        hS256Signer0.sign((byte[]) null, (Key) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.security.InvalidKeyException: No installed provider supports this key: (null)
         //
         verifyException("fun.fengwk.jwt4j.support.HS256Signer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HS256Signer hS256Signer0 = new HS256Signer();
      String string0 = hS256Signer0.alg();
      assertEquals("HS256", string0);
  }
}
