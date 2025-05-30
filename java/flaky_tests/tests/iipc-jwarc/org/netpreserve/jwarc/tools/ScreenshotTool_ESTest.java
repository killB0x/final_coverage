/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 01:19:01 GMT 2022
 */

package org.netpreserve.jwarc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.netpreserve.jwarc.tools.ScreenshotTool;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ScreenshotTool_ESTest extends ScreenshotTool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "0";
      try { 
        ScreenshotTool.main(stringArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      try { 
        ScreenshotTool.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        ScreenshotTool.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ScreenshotTool.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ScreenshotTool screenshotTool0 = new ScreenshotTool();
  }
}
