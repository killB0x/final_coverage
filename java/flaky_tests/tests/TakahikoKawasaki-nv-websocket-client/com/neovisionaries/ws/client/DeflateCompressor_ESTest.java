/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 14:02:50 GMT 2022
 */

package com.neovisionaries.ws.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.neovisionaries.ws.client.DeflateCompressor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DeflateCompressor_ESTest extends DeflateCompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        DeflateCompressor.compress(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.zip.Deflater
         //
         verifyException("com.neovisionaries.ws.client.DeflateCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeflateCompressor deflateCompressor0 = new DeflateCompressor();
  }
}
