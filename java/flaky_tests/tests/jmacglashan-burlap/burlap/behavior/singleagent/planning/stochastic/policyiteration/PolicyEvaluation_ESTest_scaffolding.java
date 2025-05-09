/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 06 02:05:56 GMT 2022
 */

package burlap.behavior.singleagent.planning.stochastic.policyiteration;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PolicyEvaluation_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "burlap.behavior.singleagent.planning.stochastic.policyiteration.PolicyEvaluation"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PolicyEvaluation_ESTest_scaffolding.class.getClassLoader() ,
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$TouchGroundPF",
      "burlap.behavior.policy.Policy",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.behavior.valuefunction.ValueFunction",
      "burlap.domain.singleagent.gridworld.GridWorldDomain",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.behavior.singleagent.learning.tdmethods.SarsaLam",
      "burlap.behavior.policy.EpsilonGreedy",
      "burlap.domain.singleagent.blocksworld.BWModel",
      "burlap.behavior.valuefunction.ConstantValueFunction",
      "burlap.mdp.auxiliary.stateconditiontest.StateConditionTest",
      "burlap.mdp.core.action.Action",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.mdp.core.oo.state.OOState",
      "burlap.behavior.policy.SolverDerivedPolicy",
      "burlap.mdp.singleagent.environment.EnvironmentOutcome",
      "burlap.mdp.singleagent.oo.OOSADomain",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.mdp.core.action.ActionUtils",
      "burlap.mdp.singleagent.model.FactoredModel",
      "burlap.behavior.singleagent.learning.tdmethods.QLearningStateNode",
      "burlap.mdp.singleagent.model.RewardFunction",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.mdp.core.oo.state.exceptions.UnknownObjectException",
      "burlap.behavior.policy.EnumerablePolicy",
      "burlap.behavior.policy.RandomPolicy",
      "burlap.debugtools.RandomFactory",
      "burlap.mdp.singleagent.environment.Environment",
      "burlap.behavior.singleagent.planning.Planner",
      "burlap.behavior.singleagent.planning.stochastic.policyiteration.PolicyEvaluation",
      "burlap.domain.singleagent.blockdude.BlockDudeModel",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel",
      "burlap.mdp.singleagent.common.GoalBasedRF",
      "burlap.datastructures.BoltzmannDistribution",
      "burlap.mdp.core.Domain",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$OnPadPF",
      "burlap.behavior.singleagent.learning.tdmethods.QLearning",
      "burlap.behavior.singleagent.options.EnvironmentOptionOutcome",
      "burlap.mdp.core.state.MutableState",
      "burlap.mdp.singleagent.pomdp.beliefstate.DenseBeliefVector",
      "burlap.behavior.policy.GreedyQPolicy",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.mdp.auxiliary.common.SinglePFTF",
      "burlap.behavior.singleagent.planning.stochastic.dpoperator.DPOperator",
      "burlap.domain.singleagent.lunarlander.LunarLanderModel",
      "burlap.behavior.learningrate.ConstantLR",
      "burlap.behavior.learningrate.LearningRate",
      "burlap.mdp.core.StateTransitionProb",
      "burlap.mdp.singleagent.pomdp.beliefstate.BeliefState",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.behavior.singleagent.planning.stochastic.dpoperator.BellmanOperator",
      "burlap.behavior.policy.GreedyDeterministicQPolicy",
      "burlap.domain.singleagent.blockdude.state.BlockDudeMap",
      "burlap.domain.singleagent.blocksworld.BlocksWorldState",
      "burlap.behavior.singleagent.Episode",
      "burlap.mdp.core.TerminalFunction",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$GridWorldModel",
      "burlap.behavior.singleagent.MDPSolver",
      "burlap.mdp.singleagent.pomdp.PODomain",
      "burlap.mdp.core.action.UniversalActionType",
      "burlap.domain.singleagent.blockdude.state.BlockDudeState",
      "burlap.mdp.singleagent.common.SingleGoalPFRF",
      "burlap.behavior.policy.support.PolicyUndefinedException",
      "burlap.mdp.core.state.State",
      "burlap.debugtools.DPrint",
      "burlap.mdp.core.action.ActionType",
      "burlap.mdp.singleagent.model.TaskFactoredModel",
      "burlap.statehashing.HashableState",
      "burlap.mdp.singleagent.model.statemodel.SampleStateModel",
      "burlap.mdp.core.oo.state.ObjectInstance",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$TouchPadPF",
      "burlap.behavior.singleagent.learning.LearningAgent",
      "burlap.behavior.singleagent.auxiliary.StateEnumerator",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$WallToPF",
      "burlap.mdp.auxiliary.DomainGenerator",
      "burlap.behavior.valuefunction.QProvider",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$TouchSurfacePF",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefState",
      "burlap.behavior.singleagent.planning.stochastic.DynamicProgramming",
      "burlap.mdp.core.oo.state.MutableOOState",
      "burlap.statehashing.HashableStateFactory",
      "burlap.behavior.policy.BoltzmannQPolicy",
      "burlap.behavior.singleagent.MDPSolverInterface",
      "burlap.mdp.singleagent.pomdp.beliefstate.EnumerableBeliefState",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$LLPhysicsParams",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.mdp.core.oo.OODomain",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel$Helper",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$ThrustType",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$AtLocationPF",
      "burlap.behavior.valuefunction.QFunction",
      "burlap.mdp.singleagent.model.SampleModel",
      "burlap.mdp.singleagent.model.FullModel"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PolicyEvaluation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "burlap.behavior.singleagent.MDPSolver",
      "burlap.behavior.singleagent.planning.stochastic.DynamicProgramming",
      "burlap.behavior.singleagent.planning.stochastic.policyiteration.PolicyEvaluation",
      "burlap.debugtools.DPrint",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.singleagent.oo.OOSADomain",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.behavior.valuefunction.ConstantValueFunction",
      "burlap.behavior.singleagent.planning.stochastic.dpoperator.BellmanOperator",
      "burlap.domain.singleagent.graphdefined.GraphDefinedDomain$GraphStateModel",
      "burlap.debugtools.RandomFactory",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.behavior.policy.RandomPolicy",
      "burlap.mdp.singleagent.pomdp.PODomain",
      "burlap.behavior.singleagent.pomdp.wrappedmdpalgs.BeliefSparseSampling",
      "burlap.mdp.singleagent.pomdp.BeliefMDPGenerator",
      "burlap.mdp.singleagent.pomdp.BeliefMDPGenerator$BeliefModel",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefUpdate",
      "burlap.domain.singleagent.blocksworld.BlocksWorldBlock",
      "burlap.mdp.singleagent.pomdp.beliefstate.TabularBeliefState",
      "burlap.behavior.singleagent.learning.tdmethods.QLearning",
      "burlap.behavior.singleagent.learning.tdmethods.SarsaLam",
      "burlap.behavior.policy.EpsilonGreedy",
      "burlap.behavior.learningrate.ConstantLR",
      "burlap.mdp.stochasticgames.SGDomain",
      "burlap.mdp.stochasticgames.oo.OOSGDomain",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.mdp.stochasticgames.JointAction",
      "burlap.mdp.core.action.UniversalActionType",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.domain.singleagent.blockdude.state.BlockDudeMap",
      "burlap.behavior.policy.GreedyDeterministicQPolicy",
      "burlap.behavior.policy.GreedyQPolicy",
      "burlap.behavior.policy.CachedPolicy",
      "burlap.statehashing.discretized.DiscConfig",
      "burlap.statehashing.WrappedHashableState",
      "burlap.statehashing.simple.IDSimpleHashableState",
      "burlap.statehashing.discretized.IDDiscHashableState",
      "burlap.behavior.singleagent.auxiliary.StateEnumerator",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.domain.singleagent.blockdude.state.BlockDudeState",
      "burlap.mdp.stochasticgames.common.StaticRepeatedGameModel",
      "burlap.domain.singleagent.pomdp.tiger.TigerObservations",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCPhysicsParams",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCModel",
      "burlap.mdp.singleagent.model.FactoredModel",
      "burlap.mdp.singleagent.model.DelegatedModel",
      "burlap.mdp.core.action.ActionUtils",
      "burlap.domain.singleagent.mountaincar.MCState",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$LLPhysicsParams",
      "burlap.domain.singleagent.lunarlander.LunarLanderModel",
      "burlap.behavior.policy.BoltzmannQPolicy",
      "burlap.mdp.core.oo.state.OOStateUtilities",
      "burlap.behavior.singleagent.learning.actorcritic.actor.BoltzmannActor",
      "burlap.domain.singleagent.frostbite.FrostbiteModel",
      "burlap.behavior.policy.support.PolicyUndefinedException",
      "burlap.behavior.singleagent.learning.actorcritic.critics.TDLambda",
      "burlap.behavior.singleagent.learning.actorcritic.ActorCritic",
      "burlap.domain.singleagent.blockdude.BlockDudeModel",
      "burlap.mdp.core.state.NullState",
      "burlap.behavior.singleagent.auxiliary.StateReachability",
      "burlap.domain.singleagent.blocksworld.BWModel",
      "burlap.mdp.singleagent.common.NullRewardFunction",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.behavior.singleagent.pomdp.qmdp.QMDP",
      "burlap.behavior.singleagent.planning.stochastic.valueiteration.ValueIteration",
      "burlap.visualizer.StateRenderLayer",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$GridWorldModel",
      "burlap.behavior.policy.PolicyUtils",
      "burlap.datastructures.BoltzmannDistribution",
      "burlap.mdp.auxiliary.common.SinglePFTF",
      "burlap.mdp.singleagent.common.GoalBasedRF",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.behavior.singleagent.learnfromdemo.RewardValueProjection",
      "burlap.mdp.singleagent.common.SingleGoalPFRF",
      "burlap.behavior.singleagent.learning.actorcritic.critics.TimeIndexedTDLambda",
      "burlap.statehashing.maskeddiscretized.IDDiscMaskedHashableState",
      "burlap.statehashing.masked.MaskedConfig",
      "burlap.statehashing.simple.IISimpleHashableState",
      "burlap.statehashing.masked.IIMaskedHashableState",
      "burlap.behavior.singleagent.learning.actorcritic.actor.BoltzmannActor$PolicyNode",
      "burlap.mdp.auxiliary.stateconditiontest.SinglePFSCT",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.mdp.core.state.StateUtilities",
      "burlap.behavior.singleagent.planning.stochastic.dpoperator.SoftmaxOperator",
      "burlap.statehashing.maskeddiscretized.DiscMaskedConfig",
      "burlap.statehashing.maskeddiscretized.IIDiscMaskedHashableState",
      "burlap.mdp.singleagent.common.UniformCostRF",
      "burlap.behavior.singleagent.planning.stochastic.sparsesampling.SparseSampling",
      "burlap.statehashing.simple.SimpleHashableStateFactory",
      "burlap.behavior.singleagent.learnfromdemo.CustomRewardModel",
      "burlap.behavior.singleagent.learnfromdemo.RewardValueProjection$CustomRewardNoTermModel",
      "burlap.mdp.core.oo.state.OOVariableKey",
      "burlap.mdp.core.oo.state.exceptions.UnknownObjectException",
      "burlap.visualizer.MultiLayerRenderer",
      "burlap.visualizer.Visualizer",
      "burlap.mdp.auxiliary.common.RandomStartStateGenerator",
      "burlap.behavior.singleagent.learning.tdmethods.QLearningStateNode",
      "burlap.statehashing.discretized.IIDiscHashableState",
      "burlap.mdp.singleagent.environment.EnvironmentOutcome",
      "burlap.behavior.valuefunction.QValue",
      "burlap.visualizer.OOStatePainter",
      "burlap.mdp.stochasticgames.model.FullJointModel$Helper",
      "burlap.behavior.learningrate.SoftTimeInverseDecayLR",
      "burlap.mdp.singleagent.common.VisualActionObserver",
      "burlap.behavior.valuefunction.QProvider$Helper",
      "burlap.statehashing.masked.IDMaskedHashableState",
      "burlap.mdp.singleagent.environment.SimulatedEnvironment",
      "burlap.mdp.auxiliary.common.ConstantStateGenerator",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel$Helper",
      "burlap.mdp.core.StateTransitionProb",
      "burlap.behavior.singleagent.Episode",
      "burlap.behavior.policy.support.ActionProb"
    );
  }
}
