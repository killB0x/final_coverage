/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 03:26:16 GMT 2022
 */

package org.jiucai.appframework.base.executor.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jiucai.appframework.base.executor.impl.DefaultExecutorCommand;
import org.jiucai.appframework.base.executor.impl.DefaultExecutorService;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultExecutorCommand_ESTest extends DefaultExecutorCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultExecutorCommand defaultExecutorCommand0 = new DefaultExecutorCommand();
      DefaultExecutorService defaultExecutorService0 = DefaultExecutorService.getInstance();
      defaultExecutorCommand0.setService(defaultExecutorService0);
      assertEquals("Default", defaultExecutorCommand0.getName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultExecutorCommand defaultExecutorCommand0 = new DefaultExecutorCommand();
      DefaultExecutorService defaultExecutorService0 = defaultExecutorCommand0.getService();
      assertNull(defaultExecutorService0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultExecutorService defaultExecutorService0 = DefaultExecutorService.getInstance();
      DefaultExecutorCommand defaultExecutorCommand0 = new DefaultExecutorCommand(defaultExecutorService0);
      DefaultExecutorService.setParam((String) null, 0);
      String string0 = defaultExecutorCommand0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultExecutorService defaultExecutorService0 = DefaultExecutorService.getInstance();
      DefaultExecutorCommand defaultExecutorCommand0 = new DefaultExecutorCommand(defaultExecutorService0);
      DefaultExecutorService.setParam("", 1531);
      String string0 = defaultExecutorCommand0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultExecutorCommand defaultExecutorCommand0 = new DefaultExecutorCommand();
      // Undeclared exception!
      try { 
        defaultExecutorCommand0.shutdown();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jiucai.appframework.base.executor.impl.DefaultExecutorCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultExecutorService defaultExecutorService0 = DefaultExecutorService.getInstance();
      DefaultExecutorCommand defaultExecutorCommand0 = new DefaultExecutorCommand(defaultExecutorService0);
      String string0 = defaultExecutorCommand0.getName();
      assertEquals("Default", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultExecutorCommand defaultExecutorCommand0 = new DefaultExecutorCommand();
      // Undeclared exception!
      try { 
        defaultExecutorCommand0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jiucai.appframework.base.executor.impl.DefaultExecutorCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultExecutorService defaultExecutorService0 = DefaultExecutorService.getInstance();
      DefaultExecutorCommand defaultExecutorCommand0 = new DefaultExecutorCommand(defaultExecutorService0);
      defaultExecutorCommand0.shutdown();
      assertEquals("Default", defaultExecutorCommand0.getName());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultExecutorService defaultExecutorService0 = DefaultExecutorService.getInstance();
      DefaultExecutorCommand defaultExecutorCommand0 = new DefaultExecutorCommand(defaultExecutorService0);
      DefaultExecutorService defaultExecutorService1 = defaultExecutorCommand0.getService();
      assertEquals("Default", defaultExecutorService1.getName());
  }
}
