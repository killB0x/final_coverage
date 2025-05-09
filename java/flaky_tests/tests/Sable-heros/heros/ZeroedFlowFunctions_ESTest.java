/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 05:33:49 GMT 2022
 */

package heros;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import heros.FlowFunction;
import heros.FlowFunctions;
import heros.ProfiledFlowFunctions;
import heros.ZeroedFlowFunctions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ZeroedFlowFunctions_ESTest extends ZeroedFlowFunctions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FlowFunctions<Integer, Integer, Integer> flowFunctions0 = (FlowFunctions<Integer, Integer, Integer>) mock(FlowFunctions.class, new ViolatedAssumptionAnswer());
      doReturn((FlowFunction) null).when(flowFunctions0).getCallToReturnFlowFunction(anyInt() , anyInt());
      ProfiledFlowFunctions<Integer, Integer, Integer> profiledFlowFunctions0 = new ProfiledFlowFunctions<Integer, Integer, Integer>(flowFunctions0);
      Integer integer0 = new Integer(3904);
      Integer integer1 = new Integer(3904);
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>(profiledFlowFunctions0, integer1);
      FlowFunction<Integer> flowFunction0 = zeroedFlowFunctions0.getCallToReturnFlowFunction(integer0, integer0);
      assertNotNull(flowFunction0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FlowFunctions<Integer, Integer, Integer> flowFunctions0 = (FlowFunctions<Integer, Integer, Integer>) mock(FlowFunctions.class, new ViolatedAssumptionAnswer());
      doReturn((FlowFunction) null).when(flowFunctions0).getCallToReturnFlowFunction(anyInt() , anyInt());
      ProfiledFlowFunctions<Integer, Integer, Integer> profiledFlowFunctions0 = new ProfiledFlowFunctions<Integer, Integer, Integer>(flowFunctions0);
      Integer integer0 = new Integer(3904);
      Integer integer1 = new Integer(3904);
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>(profiledFlowFunctions0, integer1);
      FlowFunction<Integer> flowFunction0 = zeroedFlowFunctions0.getCallToReturnFlowFunction(integer0, integer1);
      assertNotNull(flowFunction0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FlowFunctions<Integer, Integer, Integer> flowFunctions0 = (FlowFunctions<Integer, Integer, Integer>) mock(FlowFunctions.class, new ViolatedAssumptionAnswer());
      doReturn((FlowFunction) null).when(flowFunctions0).getReturnFlowFunction(anyInt() , anyInt() , anyInt() , anyInt());
      ProfiledFlowFunctions<Integer, Integer, Integer> profiledFlowFunctions0 = new ProfiledFlowFunctions<Integer, Integer, Integer>(flowFunctions0);
      Integer integer0 = new Integer(3904);
      Integer integer1 = new Integer(3904);
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>(profiledFlowFunctions0, integer1);
      FlowFunction<Integer> flowFunction0 = zeroedFlowFunctions0.getReturnFlowFunction(integer0, integer1, integer0, integer0);
      assertNotNull(flowFunction0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FlowFunctions<Integer, Integer, Integer> flowFunctions0 = (FlowFunctions<Integer, Integer, Integer>) mock(FlowFunctions.class, new ViolatedAssumptionAnswer());
      doReturn((FlowFunction) null).when(flowFunctions0).getReturnFlowFunction(anyInt() , anyInt() , anyInt() , anyInt());
      ProfiledFlowFunctions<Integer, Integer, Integer> profiledFlowFunctions0 = new ProfiledFlowFunctions<Integer, Integer, Integer>(flowFunctions0);
      Integer integer0 = new Integer(3904);
      Integer integer1 = new Integer(3904);
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>(profiledFlowFunctions0, integer1);
      FlowFunction<Integer> flowFunction0 = zeroedFlowFunctions0.getReturnFlowFunction(integer0, integer1, integer0, integer1);
      assertNotNull(flowFunction0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FlowFunctions<Integer, Integer, Integer> flowFunctions0 = (FlowFunctions<Integer, Integer, Integer>) mock(FlowFunctions.class, new ViolatedAssumptionAnswer());
      doReturn((FlowFunction) null).when(flowFunctions0).getReturnFlowFunction(anyInt() , anyInt() , anyInt() , anyInt());
      ProfiledFlowFunctions<Integer, Integer, Integer> profiledFlowFunctions0 = new ProfiledFlowFunctions<Integer, Integer, Integer>(flowFunctions0);
      Integer integer0 = new Integer(3904);
      Integer integer1 = new Integer(3904);
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>(profiledFlowFunctions0, integer1);
      FlowFunction<Integer> flowFunction0 = zeroedFlowFunctions0.getReturnFlowFunction(integer1, integer0, integer0, integer1);
      assertNotNull(flowFunction0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FlowFunctions<Integer, Integer, Integer> flowFunctions0 = (FlowFunctions<Integer, Integer, Integer>) mock(FlowFunctions.class, new ViolatedAssumptionAnswer());
      doReturn((FlowFunction) null).when(flowFunctions0).getCallFlowFunction(anyInt() , anyInt());
      Integer integer0 = new Integer((-1039));
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>(flowFunctions0, integer0);
      Integer integer1 = new Integer(0);
      FlowFunction<Integer> flowFunction0 = zeroedFlowFunctions0.getCallFlowFunction(integer0, integer1);
      assertNotNull(flowFunction0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FlowFunctions<Integer, Integer, Integer> flowFunctions0 = (FlowFunctions<Integer, Integer, Integer>) mock(FlowFunctions.class, new ViolatedAssumptionAnswer());
      doReturn((FlowFunction) null).when(flowFunctions0).getCallFlowFunction(anyInt() , anyInt());
      Integer integer0 = new Integer((-1039));
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>(flowFunctions0, integer0);
      Integer integer1 = new Integer(0);
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions1 = new ZeroedFlowFunctions<Integer, Integer, Integer>(zeroedFlowFunctions0, integer1);
      FlowFunction<Integer> flowFunction0 = zeroedFlowFunctions1.getCallFlowFunction(integer0, integer0);
      assertNotNull(flowFunction0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FlowFunctions<Integer, Integer, Integer> flowFunctions0 = (FlowFunctions<Integer, Integer, Integer>) mock(FlowFunctions.class, new ViolatedAssumptionAnswer());
      doReturn((FlowFunction) null).when(flowFunctions0).getNormalFlowFunction(anyInt() , anyInt());
      ProfiledFlowFunctions<Integer, Integer, Integer> profiledFlowFunctions0 = new ProfiledFlowFunctions<Integer, Integer, Integer>(flowFunctions0);
      Integer integer0 = new Integer(3904);
      Integer integer1 = new Integer(3904);
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>(profiledFlowFunctions0, integer1);
      FlowFunction<Integer> flowFunction0 = zeroedFlowFunctions0.getNormalFlowFunction(integer1, integer0);
      assertNotNull(flowFunction0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FlowFunctions<Integer, Integer, Integer> flowFunctions0 = (FlowFunctions<Integer, Integer, Integer>) mock(FlowFunctions.class, new ViolatedAssumptionAnswer());
      doReturn((FlowFunction) null).when(flowFunctions0).getNormalFlowFunction(anyInt() , anyInt());
      ProfiledFlowFunctions<Integer, Integer, Integer> profiledFlowFunctions0 = new ProfiledFlowFunctions<Integer, Integer, Integer>(flowFunctions0);
      Integer integer0 = new Integer(3904);
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>(profiledFlowFunctions0, integer0);
      Integer integer1 = new Integer(3904);
      FlowFunction<Integer> flowFunction0 = zeroedFlowFunctions0.getNormalFlowFunction(integer1, integer0);
      assertNotNull(flowFunction0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>((FlowFunctions<Integer, Integer, Integer>) null, (Integer) null);
      // Undeclared exception!
      try { 
        zeroedFlowFunctions0.getReturnFlowFunction((Integer) null, (Integer) null, (Integer) null, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("heros.ZeroedFlowFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>((FlowFunctions<Integer, Integer, Integer>) null, (Integer) null);
      // Undeclared exception!
      try { 
        zeroedFlowFunctions0.getCallToReturnFlowFunction((Integer) null, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("heros.ZeroedFlowFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>((FlowFunctions<Integer, Integer, Integer>) null, (Integer) null);
      // Undeclared exception!
      try { 
        zeroedFlowFunctions0.getCallFlowFunction((Integer) null, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("heros.ZeroedFlowFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZeroedFlowFunctions<Integer, Integer, Integer> zeroedFlowFunctions0 = new ZeroedFlowFunctions<Integer, Integer, Integer>((FlowFunctions<Integer, Integer, Integer>) null, (Integer) null);
      // Undeclared exception!
      try { 
        zeroedFlowFunctions0.getNormalFlowFunction((Integer) null, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("heros.ZeroedFlowFunctions", e);
      }
  }
}
