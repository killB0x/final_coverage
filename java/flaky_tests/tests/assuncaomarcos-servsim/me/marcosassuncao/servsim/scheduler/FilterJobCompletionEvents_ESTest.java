/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 00:35:29 GMT 2022
 */

package me.marcosassuncao.servsim.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import me.marcosassuncao.servsim.SimEvent;
import me.marcosassuncao.servsim.scheduler.FilterJobCompletionEvents;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FilterJobCompletionEvents_ESTest extends FilterJobCompletionEvents_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FilterJobCompletionEvents filterJobCompletionEvents0 = new FilterJobCompletionEvents();
      // Undeclared exception!
      try { 
        filterJobCompletionEvents0.test((SimEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("me.marcosassuncao.servsim.scheduler.FilterJobCompletionEvents", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FilterJobCompletionEvents filterJobCompletionEvents0 = new FilterJobCompletionEvents();
      filterJobCompletionEvents0.setJobId((-1960));
  }
}
