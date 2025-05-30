/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 14:02:45 GMT 2022
 */

package net.spy.memcached;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.spy.memcached.DefaultHashAlgorithm;
import net.spy.memcached.HashAlgorithm;
import net.spy.memcached.HashAlgorithmRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HashAlgorithmRegistry_ESTest extends HashAlgorithmRegistry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashAlgorithmRegistry.lookupHashAlgorithm("FNV_32_PRIME");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultHashAlgorithm defaultHashAlgorithm0 = DefaultHashAlgorithm.FNV1_32_HASH;
      HashAlgorithmRegistry.registerHashAlgorithm("chSu=>kVo5*7\"", defaultHashAlgorithm0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashAlgorithmRegistry.lookupHashAlgorithm("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashAlgorithm name should beprovided in order to perform the lookup: either NULL or empty string has been provided
         //
         verifyException("net.spy.memcached.HashAlgorithmRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashAlgorithmRegistry.lookupHashAlgorithm((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashAlgorithm name should beprovided in order to perform the lookup: either NULL or empty string has been provided
         //
         verifyException("net.spy.memcached.HashAlgorithmRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashAlgorithm hashAlgorithm0 = HashAlgorithmRegistry.lookupHashAlgorithm("@");
      assertNull(hashAlgorithm0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashAlgorithmRegistry.registerHashAlgorithm("chSui>kVoD*7\"", (HashAlgorithm) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashAlgorithm instance should be provided in order to register a new algorithm
         //
         verifyException("net.spy.memcached.HashAlgorithmRegistry", e);
      }
  }
}
