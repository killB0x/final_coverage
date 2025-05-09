/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 02:26:29 GMT 2022
 */

package burlap.behavior.stochasticgames.madynamicprogramming.dpplanners;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import burlap.behavior.stochasticgames.madynamicprogramming.SGBackupOperator;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.CoCoQ;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MaxQ;
import burlap.behavior.stochasticgames.madynamicprogramming.dpplanners.MAValueIteration;
import burlap.behavior.valuefunction.ConstantValueFunction;
import burlap.behavior.valuefunction.ValueFunction;
import burlap.domain.singleagent.blocksworld.BlocksWorldBlock;
import burlap.mdp.auxiliary.common.NullTermination;
import burlap.mdp.auxiliary.common.SinglePFTF;
import burlap.mdp.core.TerminalFunction;
import burlap.mdp.core.oo.propositional.PropositionalFunction;
import burlap.mdp.core.oo.state.generic.GenericOOState;
import burlap.mdp.core.state.NullState;
import burlap.mdp.core.state.State;
import burlap.mdp.stochasticgames.SGDomain;
import burlap.mdp.stochasticgames.agent.SGAgentType;
import burlap.mdp.stochasticgames.common.NullJointRewardFunction;
import burlap.statehashing.HashableStateFactory;
import burlap.statehashing.ReflectiveHashableStateFactory;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MAValueIteration_ESTest extends MAValueIteration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      LinkedList<SGAgentType> linkedList0 = new LinkedList<SGAgentType>();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ConstantValueFunction constantValueFunction0 = new ConstantValueFunction(3589.05);
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, linkedList0, nullJointRewardFunction0, (TerminalFunction) null, 1.0, reflectiveHashableStateFactory0, constantValueFunction0, (SGBackupOperator) null, 5152.875111492602, 0);
      assertFalse(mAValueIteration0.hasStartedPlanning());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      NullTermination nullTermination0 = new NullTermination();
      MaxQ maxQ0 = new MaxQ();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, (List<SGAgentType>) null, nullJointRewardFunction0, nullTermination0, 6.0, (HashableStateFactory) null, 6.0, maxQ0, 0.0, 1053);
      assertFalse(mAValueIteration0.hasStartedPlanning());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      CoCoQ coCoQ0 = new CoCoQ();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, nullJointRewardFunction0, (TerminalFunction) null, (-1112), reflectiveHashableStateFactory0, (ValueFunction) null, coCoQ0, (-1205.51), (-1112));
      assertFalse(mAValueIteration0.hasStartedPlanning());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      SinglePFTF singlePFTF0 = new SinglePFTF((PropositionalFunction) null);
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      MaxQ maxQ0 = new MaxQ();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, nullJointRewardFunction0, singlePFTF0, 392.03623205, reflectiveHashableStateFactory0, 392.03623205, maxQ0, 1562.9722225812493, 0);
      assertFalse(mAValueIteration0.hasStartedPlanning());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      LinkedList<SGAgentType> linkedList0 = new LinkedList<SGAgentType>();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      NullTermination nullTermination0 = new NullTermination();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      CoCoQ coCoQ0 = new CoCoQ();
      ConstantValueFunction constantValueFunction0 = new ConstantValueFunction();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, linkedList0, nullJointRewardFunction0, nullTermination0, (-1.0), reflectiveHashableStateFactory0, constantValueFunction0, coCoQ0, 0.0, 1);
      assertFalse(mAValueIteration0.hasStartedPlanning());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      CoCoQ coCoQ0 = new CoCoQ();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, nullJointRewardFunction0, (TerminalFunction) null, 1498, reflectiveHashableStateFactory0, 1498, coCoQ0, 1498, 1498);
      mAValueIteration0.states = null;
      // Undeclared exception!
      try { 
        mAValueIteration0.runVI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      CoCoQ coCoQ0 = new CoCoQ();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, nullJointRewardFunction0, (TerminalFunction) null, 0, reflectiveHashableStateFactory0, 0, coCoQ0, 0, 0);
      GenericOOState genericOOState0 = new GenericOOState();
      // Undeclared exception!
      try { 
        mAValueIteration0.planFromState(genericOOState0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Reflective Hashable State should only be used with State objects that also already implement HashableState.
         //
         verifyException("burlap.statehashing.ReflectiveHashableStateFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      CoCoQ coCoQ0 = new CoCoQ();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, nullJointRewardFunction0, (TerminalFunction) null, 0, reflectiveHashableStateFactory0, 0, coCoQ0, 0, 0);
      NullState nullState0 = NullState.instance;
      // Undeclared exception!
      try { 
        mAValueIteration0.performStateReachabilityFrom(nullState0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Reflective Hashable State should only be used with State objects that also already implement HashableState.
         //
         verifyException("burlap.statehashing.ReflectiveHashableStateFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      NullTermination nullTermination0 = new NullTermination();
      MaxQ maxQ0 = new MaxQ();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, (List<SGAgentType>) null, nullJointRewardFunction0, nullTermination0, 6.0, (HashableStateFactory) null, 6.0, maxQ0, 6.0, 1053);
      BlocksWorldBlock blocksWorldBlock0 = new BlocksWorldBlock();
      // Undeclared exception!
      try { 
        mAValueIteration0.performStateReachabilityFrom(blocksWorldBlock0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.stochasticgames.madynamicprogramming.dpplanners.MAValueIteration", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      CoCoQ coCoQ0 = new CoCoQ();
      ConstantValueFunction constantValueFunction0 = new ConstantValueFunction(0);
      MAValueIteration mAValueIteration0 = null;
      try {
        mAValueIteration0 = new MAValueIteration((SGDomain) null, nullJointRewardFunction0, (TerminalFunction) null, 0, reflectiveHashableStateFactory0, constantValueFunction0, coCoQ0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.stochasticgames.madynamicprogramming.MADynamicProgramming", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      CoCoQ coCoQ0 = new CoCoQ();
      MAValueIteration mAValueIteration0 = null;
      try {
        mAValueIteration0 = new MAValueIteration((SGDomain) null, nullJointRewardFunction0, (TerminalFunction) null, 3968, reflectiveHashableStateFactory0, 3968, coCoQ0, 3968, 3968);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.stochasticgames.madynamicprogramming.MADynamicProgramming", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      CoCoQ coCoQ0 = new CoCoQ();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, nullJointRewardFunction0, (TerminalFunction) null, (-1112), reflectiveHashableStateFactory0, (-1112), coCoQ0, (-1112), (-1112));
      // Undeclared exception!
      try { 
        mAValueIteration0.runVI();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No states to iterate over. Note that state reacability needs to be performed before runVI() can be called. Consider using planFromState(State s) method instead or using the performStateReachabilityFrom(State s) method first.
         //
         verifyException("burlap.behavior.stochasticgames.madynamicprogramming.dpplanners.MAValueIteration", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SGDomain sGDomain0 = new SGDomain();
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      CoCoQ coCoQ0 = new CoCoQ();
      MAValueIteration mAValueIteration0 = new MAValueIteration(sGDomain0, nullJointRewardFunction0, (TerminalFunction) null, 3954, (HashableStateFactory) null, 0.0, coCoQ0, 3954, 3954);
      // Undeclared exception!
      try { 
        mAValueIteration0.planFromState((State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.stochasticgames.madynamicprogramming.dpplanners.MAValueIteration", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      CoCoQ coCoQ0 = new CoCoQ();
      LinkedList<SGAgentType> linkedList0 = new LinkedList<SGAgentType>();
      MAValueIteration mAValueIteration0 = null;
      try {
        mAValueIteration0 = new MAValueIteration((SGDomain) null, linkedList0, nullJointRewardFunction0, (TerminalFunction) null, 3364, reflectiveHashableStateFactory0, (-539.0), coCoQ0, 0.0, 3364);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.stochasticgames.madynamicprogramming.MADynamicProgramming", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullJointRewardFunction nullJointRewardFunction0 = new NullJointRewardFunction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      CoCoQ coCoQ0 = new CoCoQ();
      LinkedList<SGAgentType> linkedList0 = new LinkedList<SGAgentType>();
      ConstantValueFunction constantValueFunction0 = new ConstantValueFunction();
      MAValueIteration mAValueIteration0 = null;
      try {
        mAValueIteration0 = new MAValueIteration((SGDomain) null, linkedList0, nullJointRewardFunction0, (TerminalFunction) null, 0.0, reflectiveHashableStateFactory0, constantValueFunction0, coCoQ0, 0.0, (-30));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.stochasticgames.madynamicprogramming.MADynamicProgramming", e);
      }
  }
}
