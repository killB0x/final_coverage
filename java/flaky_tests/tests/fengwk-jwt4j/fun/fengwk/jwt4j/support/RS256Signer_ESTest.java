/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 15:31:33 GMT 2022
 */

package fun.fengwk.jwt4j.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fun.fengwk.jwt4j.support.RS256Signer;
import java.security.Key;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RS256Signer_ESTest extends RS256Signer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RS256Signer rS256Signer0 = new RS256Signer();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        rS256Signer0.sign(byteArray0, (Key) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // RS256Signer's key must be private key
         //
         verifyException("fun.fengwk.jwt4j.support.RS256Signer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RS256Signer rS256Signer0 = new RS256Signer();
      String string0 = rS256Signer0.alg();
      assertEquals("RS256", string0);
  }
}
