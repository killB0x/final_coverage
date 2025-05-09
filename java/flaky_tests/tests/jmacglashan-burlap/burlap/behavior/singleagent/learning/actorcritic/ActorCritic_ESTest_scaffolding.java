/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 06 04:04:35 GMT 2022
 */

package burlap.behavior.singleagent.learning.actorcritic;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ActorCritic_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "burlap.behavior.singleagent.learning.actorcritic.ActorCritic"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ActorCritic_ESTest_scaffolding.class.getClassLoader() ,
      "burlap.behavior.policy.Policy",
      "burlap.behavior.singleagent.Episode",
      "burlap.mdp.auxiliary.stateconditiontest.SinglePFSCT",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.behavior.policy.PolicyUtils",
      "burlap.mdp.core.TerminalFunction",
      "burlap.behavior.valuefunction.ValueFunction",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.behavior.singleagent.MDPSolver",
      "burlap.behavior.valuefunction.ConstantValueFunction",
      "burlap.mdp.auxiliary.stateconditiontest.StateConditionTest",
      "burlap.mdp.core.action.Action",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.mdp.singleagent.environment.extensions.EnvironmentObserver",
      "burlap.mdp.core.oo.state.OOState",
      "burlap.behavior.singleagent.learning.actorcritic.actor.BoltzmannActor",
      "burlap.mdp.singleagent.environment.EnvironmentOutcome",
      "burlap.domain.singleagent.blockdude.state.BlockDudeState",
      "burlap.mdp.singleagent.oo.OOSADomain",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.mdp.auxiliary.common.ConstantStateGenerator",
      "burlap.mdp.singleagent.model.FactoredModel",
      "burlap.mdp.singleagent.model.RewardFunction",
      "burlap.behavior.policy.support.PolicyUndefinedException",
      "burlap.mdp.core.state.State",
      "burlap.mdp.core.action.ActionType",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.mdp.singleagent.model.TaskFactoredModel",
      "burlap.statehashing.HashableState",
      "burlap.mdp.singleagent.environment.extensions.StateSettableEnvironment",
      "burlap.behavior.policy.EnumerablePolicy",
      "burlap.mdp.singleagent.model.statemodel.SampleStateModel",
      "burlap.mdp.core.oo.state.ObjectInstance",
      "burlap.debugtools.RandomFactory",
      "burlap.mdp.singleagent.environment.Environment",
      "burlap.behavior.singleagent.learning.actorcritic.critics.TimeIndexedTDLambda",
      "burlap.behavior.singleagent.learning.LearningAgent",
      "burlap.behavior.singleagent.learning.actorcritic.critics.TDLambda",
      "burlap.mdp.auxiliary.StateGenerator",
      "burlap.domain.singleagent.blockdude.BlockDudeModel",
      "burlap.mdp.singleagent.environment.extensions.EnvironmentServerInterface",
      "burlap.mdp.singleagent.SADomain",
      "burlap.behavior.singleagent.learning.actorcritic.Critic",
      "burlap.mdp.core.state.NullState",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel",
      "burlap.mdp.singleagent.common.GoalBasedRF",
      "burlap.mdp.core.Domain",
      "burlap.mdp.core.oo.state.MutableOOState",
      "burlap.statehashing.HashableStateFactory",
      "burlap.mdp.core.state.MutableState",
      "burlap.mdp.singleagent.environment.SimulatedEnvironment",
      "burlap.mdp.auxiliary.common.SinglePFTF",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.behavior.singleagent.MDPSolverInterface",
      "burlap.behavior.singleagent.learning.actorcritic.ActorCritic",
      "burlap.behavior.learningrate.ConstantLR",
      "burlap.behavior.learningrate.LearningRate",
      "burlap.mdp.core.oo.OODomain",
      "burlap.behavior.singleagent.learning.actorcritic.Actor",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.behavior.valuefunction.QFunction",
      "burlap.mdp.singleagent.model.SampleModel",
      "burlap.mdp.singleagent.model.FullModel"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("burlap.behavior.singleagent.learning.actorcritic.Actor", false, ActorCritic_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ActorCritic_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "burlap.behavior.singleagent.MDPSolver",
      "burlap.behavior.singleagent.learning.actorcritic.ActorCritic",
      "burlap.behavior.valuefunction.ConstantValueFunction",
      "burlap.behavior.singleagent.learning.actorcritic.critics.TDLambda",
      "burlap.behavior.singleagent.learning.actorcritic.critics.TimeIndexedTDLambda",
      "burlap.behavior.learningrate.ConstantLR",
      "burlap.debugtools.DPrint",
      "burlap.mdp.singleagent.model.FactoredModel",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.domain.singleagent.blockdude.state.BlockDudeState",
      "burlap.mdp.auxiliary.common.ConstantStateGenerator",
      "burlap.mdp.singleagent.environment.SimulatedEnvironment",
      "burlap.behavior.singleagent.Episode",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.singleagent.oo.OOSADomain",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.mdp.core.action.UniversalActionType",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.behavior.singleagent.learning.actorcritic.actor.BoltzmannActor",
      "burlap.mdp.core.state.NullState",
      "burlap.mdp.stochasticgames.JointAction",
      "burlap.mdp.auxiliary.common.SinglePFTF",
      "burlap.mdp.auxiliary.common.RandomStartStateGenerator",
      "burlap.statehashing.simple.SimpleHashableStateFactory",
      "burlap.behavior.singleagent.auxiliary.StateReachability",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.mdp.core.oo.state.OOStateUtilities",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.domain.singleagent.blockdude.state.BlockDudeMap",
      "burlap.mdp.stochasticgames.SGDomain",
      "burlap.mdp.stochasticgames.oo.OOSGDomain",
      "burlap.mdp.singleagent.common.SingleGoalPFRF",
      "burlap.mdp.auxiliary.stateconditiontest.SinglePFSCT",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.behavior.policy.PolicyUtils",
      "burlap.debugtools.RandomFactory",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCPhysicsParams",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCModel",
      "burlap.behavior.learningrate.SoftTimeInverseDecayLR",
      "burlap.mdp.core.state.StateUtilities",
      "burlap.mdp.singleagent.model.DelegatedModel",
      "burlap.domain.singleagent.blocksworld.BlocksWorldBlock",
      "burlap.mdp.singleagent.common.GoalBasedRF",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.visualizer.StateRenderLayer",
      "burlap.mdp.singleagent.common.NullRewardFunction",
      "burlap.domain.singleagent.blockdude.BlockDudeModel",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.domain.singleagent.frostbite.FrostbiteModel",
      "burlap.domain.singleagent.mountaincar.MCState",
      "burlap.domain.singleagent.blocksworld.BWModel",
      "burlap.mdp.singleagent.common.UniformCostRF",
      "burlap.mdp.singleagent.common.VisualActionObserver",
      "burlap.domain.singleagent.graphdefined.GraphDefinedDomain$GraphStateModel",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$LLPhysicsParams",
      "burlap.domain.singleagent.lunarlander.LunarLanderModel",
      "burlap.mdp.stochasticgames.common.StaticRepeatedGameModel",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$GridWorldModel",
      "burlap.mdp.singleagent.model.statemodel.FullStateModel$Helper",
      "burlap.mdp.core.StateTransitionProb",
      "burlap.behavior.learningrate.ExponentialDecayLR",
      "burlap.mdp.core.oo.state.OOVariableKey",
      "burlap.visualizer.MultiLayerRenderer",
      "burlap.visualizer.Visualizer",
      "burlap.behavior.singleagent.Episode$1",
      "burlap.datastructures.AlphanumericSorting",
      "burlap.mdp.singleagent.environment.EnvironmentOutcome",
      "burlap.mdp.stochasticgames.agent.SGAgentType"
    );
  }
}
