/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 06 02:09:41 GMT 2022
 */

package burlap.behavior.singleagent.planning.deterministic.uninformed.dfs;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LimitedMemoryDFS_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "burlap.behavior.singleagent.planning.deterministic.uninformed.dfs.LimitedMemoryDFS"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LimitedMemoryDFS_ESTest_scaffolding.class.getClassLoader() ,
      "burlap.behavior.policy.Policy",
      "burlap.mdp.auxiliary.stateconditiontest.SinglePFSCT",
      "burlap.behavior.singleagent.planning.deterministic.uninformed.dfs.LimitedMemoryDFS",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.mdp.core.TerminalFunction",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.behavior.singleagent.MDPSolver",
      "burlap.statehashing.maskeddiscretized.IDDiscMaskedHashableState",
      "burlap.domain.singleagent.blocksworld.BlocksWorldBlock",
      "burlap.mdp.auxiliary.stateconditiontest.StateConditionTest",
      "burlap.behavior.singleagent.planning.deterministic.uninformed.dfs.DFS",
      "burlap.mdp.core.action.Action",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.domain.singleagent.mountaincar.MountainCar$ClassicMCTF",
      "burlap.mdp.core.oo.state.OOState",
      "burlap.behavior.policy.SolverDerivedPolicy",
      "burlap.mdp.singleagent.environment.EnvironmentOutcome",
      "burlap.behavior.singleagent.planning.deterministic.DeterministicPlanner$PlanningFailedException",
      "burlap.mdp.singleagent.model.FactoredModel",
      "burlap.mdp.singleagent.model.RewardFunction",
      "burlap.mdp.core.state.State",
      "burlap.mdp.core.action.ActionType",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.mdp.singleagent.model.TaskFactoredModel",
      "burlap.statehashing.HashableState",
      "burlap.behavior.policy.EnumerablePolicy",
      "burlap.mdp.core.oo.state.ObjectInstance",
      "burlap.mdp.singleagent.model.statemodel.SampleStateModel",
      "burlap.debugtools.RandomFactory",
      "burlap.statehashing.discretized.IDDiscHashableState",
      "burlap.statehashing.masked.MaskedConfig",
      "burlap.behavior.singleagent.planning.Planner",
      "burlap.behavior.singleagent.planning.deterministic.DeterministicPlanner",
      "burlap.mdp.auxiliary.DomainGenerator",
      "burlap.domain.singleagent.mountaincar.MCState",
      "burlap.mdp.singleagent.SADomain",
      "burlap.statehashing.simple.IDSimpleHashableState",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel",
      "burlap.mdp.singleagent.common.GoalBasedRF",
      "burlap.mdp.core.Domain",
      "burlap.statehashing.maskeddiscretized.DiscMaskedConfig",
      "burlap.statehashing.discretized.DiscConfig",
      "burlap.domain.singleagent.mountaincar.MountainCar",
      "burlap.statehashing.HashableStateFactory",
      "burlap.mdp.core.state.MutableState",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.behavior.singleagent.MDPSolverInterface",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCPhysicsParams",
      "burlap.statehashing.WrappedHashableState",
      "burlap.behavior.singleagent.planning.deterministic.SearchNode",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.behavior.singleagent.planning.deterministic.SDPlannerPolicy",
      "burlap.mdp.singleagent.model.SampleModel",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCModel",
      "burlap.statehashing.masked.IDMaskedHashableState",
      "burlap.mdp.singleagent.model.FullModel"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LimitedMemoryDFS_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "burlap.behavior.singleagent.MDPSolver",
      "burlap.behavior.singleagent.planning.deterministic.DeterministicPlanner",
      "burlap.behavior.singleagent.planning.deterministic.uninformed.dfs.DFS",
      "burlap.behavior.singleagent.planning.deterministic.uninformed.dfs.LimitedMemoryDFS",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.mdp.auxiliary.stateconditiontest.SinglePFSCT",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.mdp.core.action.UniversalActionType",
      "burlap.debugtools.RandomFactory",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.domain.singleagent.blockdude.state.BlockDudeMap",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.domain.singleagent.blockdude.state.BlockDudeState",
      "burlap.mdp.auxiliary.common.SinglePFTF",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.mdp.core.state.NullState",
      "burlap.statehashing.masked.MaskedConfig",
      "burlap.statehashing.maskeddiscretized.DiscMaskedConfig",
      "burlap.statehashing.WrappedHashableState",
      "burlap.statehashing.simple.IISimpleHashableState",
      "burlap.statehashing.masked.IIMaskedHashableState",
      "burlap.statehashing.simple.IDSimpleHashableState",
      "burlap.behavior.singleagent.planning.deterministic.SearchNode",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.domain.singleagent.blocksworld.BlocksWorldBlock",
      "burlap.statehashing.discretized.DiscConfig",
      "burlap.mdp.core.oo.state.OOStateUtilities",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.statehashing.discretized.IDDiscHashableState",
      "burlap.statehashing.maskeddiscretized.IIDiscMaskedHashableState",
      "burlap.statehashing.masked.IDMaskedHashableState",
      "burlap.statehashing.maskeddiscretized.IDDiscMaskedHashableState",
      "burlap.statehashing.discretized.IIDiscHashableState",
      "burlap.domain.singleagent.blockdude.BlockDudeModel",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$GridWorldModel",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCPhysicsParams",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCModel",
      "burlap.domain.singleagent.blocksworld.BWModel",
      "burlap.domain.singleagent.frostbite.FrostbiteModel",
      "burlap.mdp.singleagent.model.FactoredModel",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$LLPhysicsParams",
      "burlap.domain.singleagent.lunarlander.LunarLanderModel",
      "burlap.domain.singleagent.graphdefined.GraphDefinedDomain$GraphStateModel",
      "burlap.domain.singleagent.mountaincar.MCState",
      "burlap.mdp.singleagent.common.SingleGoalPFRF",
      "burlap.debugtools.DPrint",
      "burlap.mdp.singleagent.common.GoalBasedRF",
      "burlap.mdp.singleagent.common.NullRewardFunction",
      "burlap.mdp.singleagent.model.DelegatedModel",
      "burlap.mdp.singleagent.common.UniformCostRF",
      "burlap.mdp.core.oo.state.OOVariableKey",
      "burlap.mdp.core.state.StateUtilities",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel$Helper",
      "burlap.mdp.core.StateTransitionProb",
      "burlap.mdp.core.oo.state.exceptions.UnknownObjectException"
    );
  }
}
