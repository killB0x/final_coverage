/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 20:16:06 GMT 2022
 */

package io.fabric8.zjsonpatch.internal.collections4.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.fabric8.zjsonpatch.internal.collections4.sequence.CommandVisitor;
import io.fabric8.zjsonpatch.internal.collections4.sequence.KeepCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KeepCommand_ESTest extends KeepCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      KeepCommand<Integer> keepCommand0 = new KeepCommand<Integer>(integer0);
      // Undeclared exception!
      try { 
        keepCommand0.accept((CommandVisitor<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.fabric8.zjsonpatch.internal.collections4.sequence.KeepCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      KeepCommand<Object> keepCommand0 = new KeepCommand<Object>(object0);
      CommandVisitor<Object> commandVisitor0 = (CommandVisitor<Object>) mock(CommandVisitor.class, new ViolatedAssumptionAnswer());
      keepCommand0.accept(commandVisitor0);
  }
}
