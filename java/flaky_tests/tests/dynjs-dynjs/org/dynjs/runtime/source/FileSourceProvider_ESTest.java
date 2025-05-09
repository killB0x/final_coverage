/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 21:50:16 GMT 2022
 */

package org.dynjs.runtime.source;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.dynjs.runtime.source.FileSourceProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileSourceProvider_ESTest extends FileSourceProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileSourceProvider fileSourceProvider0 = null;
      try {
        fileSourceProvider0 = new FileSourceProvider((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.dynjs.runtime.source.InputStreamSourceProvider", "org.dynjs.runtime.source.InputStreamSourceProvider");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSourceProvider fileSourceProvider0 = null;
      try {
        fileSourceProvider0 = new FileSourceProvider(file0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U` tF/-NT}>0tO+8");
      FileSourceProvider fileSourceProvider0 = null;
      try {
        fileSourceProvider0 = new FileSourceProvider(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = MockFile.createTempFile("Xrg.dynjs.rAntime.source.InputStreamSourceProvider", "Xrg.dynjs.rAntime.source.InputStreamSourceProvider");
      FileSourceProvider fileSourceProvider0 = new FileSourceProvider(file0);
      assertEquals("/tmp/Xrg.dynjs.rAntime.source.InputStreamSourceProvider0Xrg.dynjs.rAntime.source.InputStreamSourceProvider", fileSourceProvider0.getName());
  }
}
