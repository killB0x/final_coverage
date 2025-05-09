/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 06 01:01:18 GMT 2022
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
public class TabularBeliefState_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefState"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TabularBeliefState_ESTest_scaffolding.class.getClassLoader() ,
      "burlap.mdp.auxiliary.DomainGenerator",
      "burlap.domain.singleagent.mountaincar.MCState",
      "burlap.mdp.core.TerminalFunction",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefState",
      "burlap.mdp.singleagent.pomdp.PODomain",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel",
      "burlap.mdp.core.Domain",
      "burlap.mdp.core.action.Action",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.domain.singleagent.mountaincar.MountainCar$ClassicMCTF",
      "burlap.domain.singleagent.mountaincar.MountainCar",
      "burlap.statehashing.HashableStateFactory",
      "burlap.mdp.core.state.MutableState",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.mdp.singleagent.pomdp.beliefstate.DenseBeliefVector",
      "burlap.mdp.singleagent.pomdp.beliefstate.EnumerableBeliefState",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCPhysicsParams",
      "burlap.mdp.core.state.State",
      "burlap.mdp.core.action.ActionType",
      "burlap.statehashing.HashableState",
      "burlap.mdp.singleagent.pomdp.beliefstate.BeliefState",
      "burlap.mdp.singleagent.model.statemodel.SampleStateModel",
      "burlap.mdp.core.oo.state.ObjectInstance",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.debugtools.RandomFactory",
      "burlap.mdp.singleagent.pomdp.beliefstate.EnumerableBeliefState$StateBelief",
      "burlap.mdp.singleagent.model.SampleModel",
      "burlap.mdp.singleagent.pomdp.observations.ObservationFunction",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCModel",
      "burlap.behavior.singleagent.auxiliary.StateEnumerator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TabularBeliefState_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefState",
      "burlap.debugtools.RandomFactory",
      "burlap.domain.singleagent.blockdude.BlockDudeModel",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.domain.singleagent.blockdude.state.BlockDudeMap",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.domain.singleagent.blockdude.state.BlockDudeState",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.singleagent.pomdp.PODomain",
      "burlap.mdp.singleagent.model.FactoredModel",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.behavior.singleagent.auxiliary.StateEnumerator",
      "burlap.behavior.singleagent.auxiliary.StateReachability",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.mdp.stochasticgames.JointAction",
      "burlap.mdp.core.action.UniversalActionType",
      "burlap.mdp.stochasticgames.SGDomain",
      "burlap.domain.singleagent.blocksworld.BlocksWorldBlock",
      "burlap.mdp.stochasticgames.common.StaticRepeatedGameModel",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCPhysicsParams",
      "burlap.domain.singleagent.mountaincar.MCState",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCModel",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.mdp.auxiliary.common.SinglePFTF",
      "burlap.mdp.singleagent.common.GoalBasedRF",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.domain.singleagent.pomdp.tiger.TigerObservations",
      "burlap.domain.singleagent.frostbite.FrostbiteModel",
      "burlap.domain.singleagent.graphdefined.GraphDefinedDomain$GraphStateModel",
      "burlap.domain.singleagent.blocksworld.BWModel",
      "burlap.mdp.singleagent.common.SingleGoalPFRF",
      "burlap.mdp.core.oo.state.OOStateUtilities",
      "burlap.mdp.core.state.NullState",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$GridWorldModel",
      "burlap.domain.singleagent.lunarlander.LunarLanderModel",
      "burlap.mdp.singleagent.model.DelegatedModel",
      "burlap.mdp.singleagent.pomdp.beliefstate.EnumerableBeliefState$StateBelief",
      "burlap.mdp.core.state.StateUtilities",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$LLPhysicsParams",
      "burlap.mdp.auxiliary.stateconditiontest.SinglePFSCT",
      "burlap.mdp.singleagent.common.UniformCostRF",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.mdp.core.oo.state.OOVariableKey",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel$Helper",
      "burlap.mdp.core.StateTransitionProb",
      "burlap.mdp.stochasticgames.agent.SGAgentType",
      "burlap.domain.singleagent.pomdp.tiger.TigerObservation",
      "burlap.mdp.singleagent.common.NullRewardFunction",
      "burlap.mdp.singleagent.pomdp.observations.ObservationUtilities",
      "burlap.mdp.core.action.ActionUtils",
      "burlap.mdp.stochasticgames.model.FullJointModel$Helper",
      "burlap.debugtools.DPrint"
    );
  }
}
