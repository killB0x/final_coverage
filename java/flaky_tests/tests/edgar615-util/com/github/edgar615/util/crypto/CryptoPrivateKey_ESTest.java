/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 15:23:28 GMT 2022
 */

package com.github.edgar615.util.crypto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.edgar615.util.crypto.CryptoPrivateKey;
import java.security.PrivateKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CryptoPrivateKey_ESTest extends CryptoPrivateKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CryptoPrivateKey cryptoPrivateKey0 = null;
      try {
        cryptoPrivateKey0 = new CryptoPrivateKey((String) null, (PrivateKey) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null algorithm name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CryptoPrivateKey cryptoPrivateKey0 = null;
      try {
        cryptoPrivateKey0 = new CryptoPrivateKey("", (PrivateKey) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.security.NoSuchAlgorithmException:  Signature not available
         //
         verifyException("com.github.edgar615.util.crypto.CryptoPrivateKey", e);
      }
  }
}
