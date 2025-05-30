/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 16:33:23 GMT 2022
 */

package com.github.relayjdbc.server.command;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.relayjdbc.serial.UIDEx;
import com.github.relayjdbc.server.command.ReturnedObjectGuard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ReturnedObjectGuard_ESTest extends ReturnedObjectGuard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      UIDEx uIDEx0 = ReturnedObjectGuard.checkResult(object0);
      assertNull(uIDEx0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReturnedObjectGuard returnedObjectGuard0 = new ReturnedObjectGuard();
  }
}
