/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 08:38:09 GMT 2022
 */

package com.amlinv.javasched.engine;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.amlinv.javasched.Step;
import com.amlinv.javasched.engine.ProcessStepExecutionListener;
import com.amlinv.javasched.engine.ProcessStepExecutionSlip;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProcessStepExecutionSlip_ESTest extends ProcessStepExecutionSlip_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      ProcessStepExecutionListener processStepExecutionListener0 = mock(ProcessStepExecutionListener.class, new ViolatedAssumptionAnswer());
      ProcessStepExecutionSlip processStepExecutionSlip0 = new ProcessStepExecutionSlip(step0, processStepExecutionListener0);
      processStepExecutionSlip0.execute();
      assertFalse(processStepExecutionSlip0.isBlocking());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(step0).isBlocking();
      ProcessStepExecutionListener processStepExecutionListener0 = mock(ProcessStepExecutionListener.class, new ViolatedAssumptionAnswer());
      ProcessStepExecutionSlip processStepExecutionSlip0 = new ProcessStepExecutionSlip(step0, processStepExecutionListener0);
      boolean boolean0 = processStepExecutionSlip0.isBlocking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProcessStepExecutionListener processStepExecutionListener0 = mock(ProcessStepExecutionListener.class, new ViolatedAssumptionAnswer());
      ProcessStepExecutionSlip processStepExecutionSlip0 = new ProcessStepExecutionSlip((Step) null, processStepExecutionListener0);
      // Undeclared exception!
      try { 
        processStepExecutionSlip0.isBlocking();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.amlinv.javasched.engine.ProcessStepExecutionSlip", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ProcessStepExecutionSlip processStepExecutionSlip0 = new ProcessStepExecutionSlip((Step) null, (ProcessStepExecutionListener) null);
      // Undeclared exception!
      try { 
        processStepExecutionSlip0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.amlinv.javasched.engine.ProcessStepExecutionSlip", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(step0).isBlocking();
      ProcessStepExecutionListener processStepExecutionListener0 = mock(ProcessStepExecutionListener.class, new ViolatedAssumptionAnswer());
      ProcessStepExecutionSlip processStepExecutionSlip0 = new ProcessStepExecutionSlip(step0, processStepExecutionListener0);
      boolean boolean0 = processStepExecutionSlip0.isBlocking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ProcessStepExecutionListener processStepExecutionListener0 = mock(ProcessStepExecutionListener.class, new ViolatedAssumptionAnswer());
      ProcessStepExecutionSlip processStepExecutionSlip0 = new ProcessStepExecutionSlip((Step) null, processStepExecutionListener0);
      // Undeclared exception!
      try { 
        processStepExecutionSlip0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.amlinv.javasched.engine.ProcessStepExecutionSlip", e);
      }
  }
}
