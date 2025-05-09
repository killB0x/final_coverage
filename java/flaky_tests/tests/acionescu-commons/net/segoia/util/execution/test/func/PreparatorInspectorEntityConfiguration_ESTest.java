/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:31:07 GMT 2022
 */

package net.segoia.util.execution.test.func;

import org.junit.Test;
import static org.junit.Assert.*;
import net.segoia.util.execution.ExecutionEntity;
import net.segoia.util.execution.test.func.PreparatorInspectorEntityConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PreparatorInspectorEntityConfiguration_ESTest extends PreparatorInspectorEntityConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer> preparatorInspectorEntityConfiguration0 = new PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer>();
      ExecutionEntity<Integer, Integer> executionEntity0 = preparatorInspectorEntityConfiguration0.getExecutor();
      assertNull(executionEntity0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer> preparatorInspectorEntityConfiguration0 = new PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer>();
      ExecutionEntity<Integer, Integer> executionEntity0 = preparatorInspectorEntityConfiguration0.getPreparator();
      assertNull(executionEntity0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer> preparatorInspectorEntityConfiguration0 = new PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer>();
      preparatorInspectorEntityConfiguration0.setInspector((ExecutionEntity<Integer, Integer>) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer> preparatorInspectorEntityConfiguration0 = new PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer>();
      preparatorInspectorEntityConfiguration0.setExecutor((ExecutionEntity<Integer, Integer>) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer> preparatorInspectorEntityConfiguration0 = new PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer>();
      ExecutionEntity<Integer, Integer> executionEntity0 = preparatorInspectorEntityConfiguration0.getInspector();
      assertNull(executionEntity0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer> preparatorInspectorEntityConfiguration0 = new PreparatorInspectorEntityConfiguration<Integer, Integer, Integer, Integer>();
      preparatorInspectorEntityConfiguration0.setPreparator((ExecutionEntity<Integer, Integer>) null);
  }
}
