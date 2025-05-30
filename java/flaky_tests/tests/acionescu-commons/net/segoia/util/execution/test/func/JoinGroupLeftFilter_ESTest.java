/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:49:57 GMT 2022
 */

package net.segoia.util.execution.test.func;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.segoia.util.execution.test.func.JoinGroup;
import net.segoia.util.execution.test.func.JoinGroupLeftFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JoinGroupLeftFilter_ESTest extends JoinGroupLeftFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JoinGroupLeftFilter<JoinGroup<Integer, Integer>, Integer> joinGroupLeftFilter0 = new JoinGroupLeftFilter<JoinGroup<Integer, Integer>, Integer>();
      JoinGroup<Integer, Integer> joinGroup0 = (JoinGroup<Integer, Integer>) mock(JoinGroup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(joinGroup0).toString();
      doReturn((Object) null).when(joinGroup0).getLeft();
      Integer integer0 = new Integer((-1622));
      JoinGroup<JoinGroup<Integer, Integer>, Integer> joinGroup1 = new JoinGroup<JoinGroup<Integer, Integer>, Integer>(joinGroup0, integer0);
      JoinGroup<Integer, Integer> joinGroup2 = joinGroupLeftFilter0.execute(joinGroup1);
      JoinGroupLeftFilter<Integer, Integer> joinGroupLeftFilter1 = new JoinGroupLeftFilter<Integer, Integer>();
      Integer integer1 = joinGroupLeftFilter1.execute(joinGroup2);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JoinGroupLeftFilter<Integer, JoinGroup<Integer, Integer>> joinGroupLeftFilter0 = new JoinGroupLeftFilter<Integer, JoinGroup<Integer, Integer>>();
      try { 
        joinGroupLeftFilter0.execute((JoinGroup<Integer, JoinGroup<Integer, Integer>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.segoia.util.execution.test.func.JoinGroupLeftFilter", e);
      }
  }
}
