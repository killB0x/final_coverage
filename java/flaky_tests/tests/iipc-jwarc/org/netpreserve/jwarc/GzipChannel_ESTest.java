/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 01:15:14 GMT 2022
 */

package org.netpreserve.jwarc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.netpreserve.jwarc.GzipChannel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GzipChannel_ESTest extends GzipChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GzipChannel gzipChannel0 = null;
      try {
        gzipChannel0 = new GzipChannel((WritableByteChannel) null, (ByteBuffer) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.zip.Deflater
         //
         verifyException("org.netpreserve.jwarc.GzipChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GzipChannel gzipChannel0 = null;
      try {
        gzipChannel0 = new GzipChannel((WritableByteChannel) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.zip.Deflater
         //
         verifyException("org.netpreserve.jwarc.GzipChannel", e);
      }
  }
}
