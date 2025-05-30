/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 06 03:21:49 GMT 2022
 */

package burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EquilibriumPlayingSGAgent_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.EquilibriumPlayingSGAgent"; 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.home", "/home/user"); 
    java.lang.System.setProperty("user.dir", "/home/user"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EquilibriumPlayingSGAgent_ESTest_scaffolding.class.getClassLoader() ,
      "burlap.mdp.auxiliary.StateGenerator",
      "burlap.behavior.policy.Policy",
      "burlap.behavior.stochasticgames.JointPolicy",
      "burlap.mdp.stochasticgames.oo.OOSGDomain",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.mdp.core.TerminalFunction",
      "burlap.mdp.stochasticgames.SGDomain",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.stochasticgames.agent.SGAgentType",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefState",
      "burlap.mdp.stochasticgames.JointAction",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.BimatrixEquilibriumSolver",
      "burlap.mdp.singleagent.pomdp.PODomain",
      "burlap.mdp.core.state.NullState",
      "burlap.mdp.stochasticgames.world.WorldObserver",
      "burlap.mdp.auxiliary.StateMapping",
      "burlap.mdp.core.action.Action",
      "burlap.mdp.core.Domain",
      "burlap.mdp.stochasticgames.agent.SGAgentBase",
      "burlap.mdp.stochasticgames.agent.SGAgent",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MaxMax",
      "burlap.mdp.core.state.MutableState",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.mdp.singleagent.pomdp.beliefstate.DenseBeliefVector",
      "burlap.mdp.auxiliary.common.ConstantStateGenerator",
      "burlap.mdp.core.action.ActionUtils",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.mdp.singleagent.pomdp.beliefstate.EnumerableBeliefState",
      "burlap.mdp.auxiliary.common.IdentityStateMapping",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.EquilibriumPlayingSGAgent$BimatrixTuple",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.Utilitarian",
      "burlap.mdp.core.state.State",
      "burlap.mdp.core.oo.OODomain",
      "burlap.mdp.core.action.ActionType",
      "burlap.mdp.stochasticgames.model.JointModel",
      "burlap.statehashing.HashableState",
      "burlap.mdp.stochasticgames.world.World",
      "burlap.datastructures.HashedAggregator",
      "burlap.mdp.singleagent.pomdp.beliefstate.BeliefState",
      "burlap.mdp.core.oo.state.ObjectInstance",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.debugtools.RandomFactory",
      "burlap.mdp.stochasticgames.model.JointRewardFunction",
      "burlap.behavior.stochasticgames.GameEpisode",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.EquilibriumPlayingSGAgent",
      "burlap.behavior.singleagent.auxiliary.StateEnumerator",
      "burlap.mdp.stochasticgames.common.NullJointRewardFunction"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EquilibriumPlayingSGAgent_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "burlap.mdp.stochasticgames.agent.SGAgentBase",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.EquilibriumPlayingSGAgent",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.EquilibriumPlayingSGAgent$BimatrixTuple",
      "burlap.debugtools.RandomFactory",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.BimatrixEquilibriumSolver",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MinMax",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MaxMax",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.CorrelatedEquilibrium",
      "burlap.domain.singleagent.pomdp.tiger.TigerObservations",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.mdp.stochasticgames.SGDomain",
      "burlap.mdp.stochasticgames.oo.OOSGDomain",
      "burlap.mdp.core.action.UniversalActionType",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.mdp.auxiliary.common.SinglePFTF",
      "burlap.mdp.singleagent.SADomain",
      "burlap.domain.singleagent.blockdude.state.BlockDudeMap",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.mdp.auxiliary.common.RandomStartStateGenerator",
      "burlap.behavior.singleagent.auxiliary.StateReachability",
      "burlap.mdp.stochasticgames.common.NullJointRewardFunction",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.mdp.core.state.NullState",
      "burlap.mdp.stochasticgames.world.World",
      "burlap.mdp.auxiliary.common.ConstantStateGenerator",
      "burlap.mdp.auxiliary.common.IdentityStateMapping",
      "burlap.datastructures.HashedAggregator",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.behavior.stochasticgames.GameEpisode",
      "burlap.mdp.stochasticgames.JointAction",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.mdp.singleagent.pomdp.PODomain",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefState",
      "burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.Utilitarian",
      "burlap.domain.singleagent.blocksworld.BlocksWorldBlock",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$LLPhysicsParams",
      "burlap.domain.singleagent.lunarlander.LunarLanderModel",
      "burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.CoCoQ",
      "burlap.behavior.stochasticgames.agents.maql.MultiAgentQLearning",
      "burlap.behavior.learningrate.ConstantLR",
      "burlap.behavior.valuefunction.ConstantValueFunction",
      "burlap.behavior.stochasticgames.madynamicprogramming.QSourceForSingleAgent$HashBackedQSource",
      "burlap.behavior.stochasticgames.PolicyFromJointPolicy",
      "burlap.behavior.stochasticgames.JointPolicy",
      "burlap.behavior.stochasticgames.madynamicprogramming.MAQSourcePolicy",
      "burlap.behavior.stochasticgames.madynamicprogramming.policies.EGreedyMaxWellfare",
      "burlap.behavior.stochasticgames.solvers.GeneralBimatrixSolverTools",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCPhysicsParams",
      "burlap.behavior.singleagent.auxiliary.StateEnumerator",
      "burlap.domain.singleagent.blockdude.state.BlockDudeState",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.mdp.singleagent.oo.OOSADomain",
      "burlap.statehashing.simple.SimpleHashableStateFactory",
      "burlap.shell.command.world.ManualAgentsCommands$ManualSGAgent",
      "burlap.mdp.stochasticgames.common.StaticRepeatedGameModel",
      "burlap.mdp.core.oo.state.OOStateUtilities",
      "burlap.mdp.core.state.StateUtilities",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$GridWorldModel",
      "burlap.behavior.policy.GreedyDeterministicQPolicy",
      "burlap.behavior.policy.CachedPolicy",
      "burlap.behavior.policy.PolicyUtils",
      "burlap.mdp.auxiliary.stateconditiontest.SinglePFSCT",
      "burlap.mdp.stochasticgames.agent.SGAgentType",
      "burlap.behavior.policy.RandomPolicy",
      "burlap.visualizer.MultiLayerRenderer",
      "burlap.visualizer.Visualizer",
      "burlap.visualizer.StateRenderLayer",
      "burlap.mdp.stochasticgames.common.VisualWorldObserver",
      "burlap.domain.singleagent.mountaincar.MCState",
      "burlap.behavior.singleagent.MDPSolver",
      "burlap.behavior.singleagent.planning.stochastic.DynamicProgramming",
      "burlap.behavior.singleagent.planning.stochastic.dpoperator.BellmanOperator",
      "burlap.behavior.singleagent.pomdp.wrappedmdpalgs.BeliefSparseSampling",
      "burlap.mdp.singleagent.pomdp.BeliefMDPGenerator",
      "burlap.mdp.singleagent.pomdp.BeliefMDPGenerator$BeliefModel",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefUpdate",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCModel",
      "burlap.domain.singleagent.blockdude.BlockDudeModel",
      "burlap.behavior.stochasticgames.agents.RandomSGAgent",
      "burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MaxQ",
      "burlap.behavior.stochasticgames.madynamicprogramming.policies.EGreedyJointPolicy",
      "burlap.behavior.stochasticgames.madynamicprogramming.policies.EMinMaxPolicy",
      "burlap.domain.singleagent.blocksworld.BWModel",
      "burlap.behavior.policy.EpsilonGreedy",
      "burlap.mdp.core.action.ActionUtils",
      "burlap.mdp.auxiliary.common.ShallowIdentityStateMapping",
      "burlap.behavior.singleagent.learning.tdmethods.QLearning",
      "burlap.behavior.singleagent.learning.tdmethods.SarsaLam",
      "burlap.behavior.stochasticgames.madynamicprogramming.policies.ECorrelatedQJointPolicy",
      "burlap.behavior.policy.GreedyQPolicy",
      "burlap.mdp.core.oo.state.OOVariableKey",
      "burlap.behavior.policy.BoltzmannQPolicy",
      "burlap.behavior.policy.support.PolicyUndefinedException",
      "burlap.domain.singleagent.frostbite.FrostbiteModel",
      "burlap.domain.singleagent.graphdefined.GraphDefinedDomain$GraphStateModel",
      "burlap.debugtools.DPrint",
      "burlap.behavior.stochasticgames.agents.SetStrategySGAgent",
      "burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.CorrelatedQ",
      "burlap.behavior.learningrate.ExponentialDecayLR",
      "burlap.behavior.singleagent.learning.actorcritic.actor.BoltzmannActor",
      "burlap.behavior.singleagent.learning.actorcritic.actor.BoltzmannActor$PolicyNode",
      "burlap.datastructures.BoltzmannDistribution",
      "burlap.visualizer.OOStatePainter",
      "burlap.statehashing.masked.MaskedConfig",
      "burlap.statehashing.maskeddiscretized.DiscMaskedConfig",
      "burlap.behavior.singleagent.planning.stochastic.dpoperator.SoftmaxOperator"
    );
  }
}
