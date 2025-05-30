/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:36:38 GMT 2022
 */

package net.segoia.util.execution.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.segoia.util.execution.ExecutionEntity;
import net.segoia.util.execution.test.ContextExecutionEntity;
import net.segoia.util.execution.test.EntityExceptionContext;
import net.segoia.util.execution.test.ExecutionContext;
import net.segoia.util.execution.test.ExecutionEntityWrapper;
import net.segoia.util.execution.test.ExecutionEntityWrapperConfiguration;
import net.segoia.util.execution.test.ExecutionPipeLine;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExecutionEntityWrapper_ESTest extends ExecutionEntityWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExecutionEntityWrapper<Integer, ExecutionPipeLine<Integer, Integer>, Integer> executionEntityWrapper0 = new ExecutionEntityWrapper<Integer, ExecutionPipeLine<Integer, Integer>, Integer>();
      ExecutionEntityWrapperConfiguration<Integer, Integer, Integer> executionEntityWrapperConfiguration0 = new ExecutionEntityWrapperConfiguration<Integer, Integer, Integer>();
      Integer integer0 = new Integer(1);
      ExecutionEntity<EntityExceptionContext, Integer> executionEntity0 = (ExecutionEntity<EntityExceptionContext, Integer>) mock(ExecutionEntity.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(executionEntity0).execute(any(net.segoia.util.execution.test.EntityExceptionContext.class));
      executionEntityWrapperConfiguration0.setExceptionHandler(executionEntity0);
      executionEntityWrapper0.setConfig(executionEntityWrapperConfiguration0);
      ExecutionPipeLine<Integer, Integer> executionPipeLine0 = executionEntityWrapper0.execute(integer0);
      assertEquals(1, executionPipeLine0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExecutionEntityWrapper<Integer, ExecutionPipeLine<Integer, Integer>, Integer> executionEntityWrapper0 = new ExecutionEntityWrapper<Integer, ExecutionPipeLine<Integer, Integer>, Integer>();
      ExecutionEntityWrapperConfiguration<Integer, Integer, Integer> executionEntityWrapperConfiguration0 = new ExecutionEntityWrapperConfiguration<Integer, Integer, Integer>();
      Integer integer0 = new Integer(1);
      executionEntityWrapper0.setConfig(executionEntityWrapperConfiguration0);
      executionEntityWrapperConfiguration0.setWrappedEntityConfiguration(integer0);
      try { 
        executionEntityWrapper0.execute(integer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // EXECUTION_ENTITY_EXCEPTION
         // Error Context: java.util.ArrayList@0000000002
         //
         verifyException("net.segoia.util.execution.test.ExecutionEntityWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExecutionEntityWrapper<Integer, Integer, Integer> executionEntityWrapper0 = new ExecutionEntityWrapper<Integer, Integer, Integer>();
      ExecutionEntityWrapperConfiguration<Integer, Integer, Integer> executionEntityWrapperConfiguration0 = new ExecutionEntityWrapperConfiguration<Integer, Integer, Integer>();
      executionEntityWrapper0.setConfig(executionEntityWrapperConfiguration0);
      ContextExecutionEntity<ExecutionContext<Integer, Integer>, Integer> contextExecutionEntity0 = (ContextExecutionEntity<ExecutionContext<Integer, Integer>, Integer>) mock(ContextExecutionEntity.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contextExecutionEntity0).execute(any(net.segoia.util.execution.test.ExecutionContext.class));
      executionEntityWrapperConfiguration0.setWrappedEntity(contextExecutionEntity0);
      Integer integer0 = new Integer(0);
      Integer integer1 = executionEntityWrapper0.execute(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExecutionEntityWrapper<Integer, ExecutionPipeLine<Integer, Integer>, ExecutionPipeLine<Integer, Integer>> executionEntityWrapper0 = new ExecutionEntityWrapper<Integer, ExecutionPipeLine<Integer, Integer>, ExecutionPipeLine<Integer, Integer>>();
      ExecutionEntityWrapperConfiguration<Integer, Integer, Integer> executionEntityWrapperConfiguration0 = new ExecutionEntityWrapperConfiguration<Integer, Integer, Integer>();
      executionEntityWrapper0.setConfig(executionEntityWrapperConfiguration0);
      ExecutionEntityWrapperConfiguration executionEntityWrapperConfiguration1 = executionEntityWrapper0.getConfig();
      assertNotNull(executionEntityWrapperConfiguration1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer((-660));
      ExecutionEntityWrapper<Integer, Integer, Integer> executionEntityWrapper0 = new ExecutionEntityWrapper<Integer, Integer, Integer>();
      try { 
        executionEntityWrapper0.execute(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.segoia.util.execution.test.ExecutionEntityWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExecutionEntityWrapper<Integer, Integer, Integer> executionEntityWrapper0 = new ExecutionEntityWrapper<Integer, Integer, Integer>();
      ExecutionEntityWrapperConfiguration executionEntityWrapperConfiguration0 = executionEntityWrapper0.getConfig();
      assertNull(executionEntityWrapperConfiguration0);
  }
}
