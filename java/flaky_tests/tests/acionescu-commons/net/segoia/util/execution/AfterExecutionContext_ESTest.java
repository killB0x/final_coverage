/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:49:25 GMT 2022
 */

package net.segoia.util.execution;

import org.junit.Test;
import static org.junit.Assert.*;
import net.segoia.util.execution.AfterExecutionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AfterExecutionContext_ESTest extends AfterExecutionContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(2046);
      AfterExecutionContext<Integer, Integer, Integer> afterExecutionContext0 = new AfterExecutionContext<Integer, Integer, Integer>(integer0, (Integer) null, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1));
      AfterExecutionContext<Integer, Integer, Integer> afterExecutionContext0 = new AfterExecutionContext<Integer, Integer, Integer>(integer0, integer1, integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AfterExecutionContext<Integer, Integer, Integer> afterExecutionContext0 = new AfterExecutionContext<Integer, Integer, Integer>((Integer) null, (Integer) null, (Integer) null);
      Integer integer0 = afterExecutionContext0.getOutput();
      assertNull(integer0);
  }
}
