/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 13:13:31 GMT 2022
 */

package sk.antons.sprops.tool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sk.antons.sprops.tool.Args;
import sk.antons.sprops.tool.FileDecodeCommand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileDecodeCommand_ESTest extends FileDecodeCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileDecodeCommand fileDecodeCommand0 = new FileDecodeCommand();
      // Undeclared exception!
      try { 
        fileDecodeCommand0.realize((Args) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sk.antons.sprops.tool.FileDecodeCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileDecodeCommand fileDecodeCommand0 = new FileDecodeCommand();
      Args args0 = Args.instance();
      // Undeclared exception!
      try { 
        fileDecodeCommand0.realize(args0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No password provided.
         //
         verifyException("sk.antons.sprops.tool.Resolved", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileDecodeCommand fileDecodeCommand0 = new FileDecodeCommand();
      // Undeclared exception!
      try { 
        fileDecodeCommand0.checkInput((Args) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sk.antons.sprops.tool.FileDecodeCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileDecodeCommand fileDecodeCommand0 = new FileDecodeCommand();
      Args args0 = new Args();
      // Undeclared exception!
      try { 
        fileDecodeCommand0.checkInput(args0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // sk/antons/jaul/Is
         //
         verifyException("sk.antons.sprops.tool.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileDecodeCommand fileDecodeCommand0 = new FileDecodeCommand();
      boolean boolean0 = fileDecodeCommand0.requirePassword();
      assertTrue(boolean0);
  }
}
