/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 16:48:26 GMT 2022
 */

package com.github.relayjdbc.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.relayjdbc.util.StreamCloser;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.PipedWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StreamCloser_ESTest extends StreamCloser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      StreamCloser.close(pipedWriter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        StreamCloser.close(bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StreamCloser.close((Closeable) null);
  }
}
