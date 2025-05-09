/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 06 03:59:46 GMT 2022
 */

package burlap.mdp.singleagent.pomdp.beliefstate;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TabularBeliefUpdate_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefUpdate"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/user"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TabularBeliefUpdate_ESTest_scaffolding.class.getClassLoader() ,
      "burlap.mdp.core.state.MutableState",
      "burlap.mdp.singleagent.pomdp.beliefstate.DenseBeliefVector",
      "burlap.mdp.singleagent.pomdp.beliefstate.EnumerableBeliefState",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.singleagent.pomdp.beliefstate.BeliefUpdate",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefState",
      "burlap.mdp.stochasticgames.JointAction",
      "burlap.mdp.core.state.State",
      "burlap.mdp.singleagent.pomdp.PODomain",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefUpdate",
      "burlap.mdp.core.action.ActionType",
      "burlap.statehashing.HashableState",
      "burlap.mdp.core.Domain",
      "burlap.mdp.core.action.Action",
      "burlap.datastructures.HashedAggregator",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.mdp.singleagent.pomdp.beliefstate.BeliefState",
      "burlap.statehashing.HashableStateFactory",
      "burlap.mdp.singleagent.model.SampleModel",
      "burlap.mdp.singleagent.pomdp.observations.ObservationFunction",
      "burlap.behavior.singleagent.auxiliary.StateEnumerator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TabularBeliefUpdate_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefUpdate",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.singleagent.pomdp.PODomain",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.domain.singleagent.blockdude.state.BlockDudeMap",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.domain.singleagent.blockdude.state.BlockDudeState",
      "burlap.mdp.singleagent.model.FactoredModel",
      "burlap.mdp.singleagent.model.DelegatedModel",
      "burlap.mdp.core.oo.state.OOStateUtilities",
      "burlap.mdp.core.oo.state.OOVariableKey",
      "burlap.mdp.stochasticgames.SGDomain",
      "burlap.mdp.core.action.UniversalActionType",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.behavior.singleagent.auxiliary.StateEnumerator",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefState",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCPhysicsParams",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCModel",
      "burlap.debugtools.RandomFactory",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.domain.singleagent.pomdp.tiger.TigerObservations",
      "burlap.domain.singleagent.blocksworld.BlocksWorldBlock",
      "burlap.mdp.stochasticgames.JointAction",
      "burlap.datastructures.HashedAggregator",
      "burlap.behavior.singleagent.auxiliary.StateReachability",
      "burlap.mdp.stochasticgames.common.StaticRepeatedGameModel",
      "burlap.mdp.core.state.NullState",
      "burlap.domain.singleagent.blocksworld.BWModel",
      "burlap.mdp.singleagent.common.UniformCostRF",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.mdp.auxiliary.common.SinglePFTF",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$GridWorldModel",
      "burlap.mdp.singleagent.common.GoalBasedRF",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.domain.singleagent.mountaincar.MCState",
      "burlap.domain.singleagent.blockdude.BlockDudeModel",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$LLPhysicsParams",
      "burlap.domain.singleagent.lunarlander.LunarLanderModel",
      "burlap.mdp.auxiliary.stateconditiontest.SinglePFSCT",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.mdp.singleagent.common.SingleGoalPFRF",
      "burlap.domain.singleagent.graphdefined.GraphDefinedDomain$GraphStateModel",
      "burlap.domain.singleagent.frostbite.FrostbiteModel",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.domain.singleagent.pomdp.tiger.TigerObservation",
      "burlap.mdp.singleagent.common.NullRewardFunction",
      "burlap.mdp.core.state.StateUtilities",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel$Helper",
      "burlap.mdp.core.StateTransitionProb",
      "burlap.mdp.singleagent.pomdp.observations.ObservationUtilities",
      "burlap.mdp.stochasticgames.agent.SGAgentType",
      "burlap.mdp.core.action.ActionUtils"
    );
  }
}
