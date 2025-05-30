/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 06 03:38:38 GMT 2022
 */

package burlap.mdp.singleagent.common;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class VisualActionObserver_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "burlap.mdp.singleagent.common.VisualActionObserver"; 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.home", "/home/user"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VisualActionObserver_ESTest_scaffolding.class.getClassLoader() ,
      "burlap.visualizer.MultiLayerRenderer",
      "burlap.mdp.core.state.State",
      "burlap.mdp.core.state.NullState",
      "burlap.mdp.core.oo.OODomain",
      "burlap.mdp.singleagent.common.VisualActionObserver",
      "burlap.mdp.core.Domain",
      "burlap.mdp.core.action.Action",
      "burlap.visualizer.StateRenderLayer",
      "burlap.visualizer.StateActionRenderLayer",
      "burlap.visualizer.RenderLayer",
      "burlap.mdp.singleagent.environment.extensions.EnvironmentObserver",
      "burlap.mdp.singleagent.environment.Environment",
      "burlap.visualizer.StatePainter",
      "burlap.mdp.singleagent.environment.EnvironmentOutcome",
      "burlap.visualizer.Visualizer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VisualActionObserver_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "burlap.mdp.singleagent.common.VisualActionObserver",
      "burlap.mdp.singleagent.common.VisualActionObserver$1",
      "burlap.mdp.singleagent.common.VisualActionObserver$2",
      "burlap.visualizer.StateRenderLayer",
      "burlap.mdp.core.state.NullState",
      "burlap.mdp.singleagent.SADomain",
      "burlap.mdp.singleagent.oo.OOSADomain",
      "burlap.visualizer.MultiLayerRenderer",
      "burlap.visualizer.Visualizer",
      "burlap.mdp.stochasticgames.SGDomain",
      "burlap.mdp.stochasticgames.oo.OOSGDomain",
      "burlap.mdp.core.oo.propositional.PropositionalFunction",
      "burlap.mdp.singleagent.model.DelegatedModel",
      "burlap.mdp.core.action.UniversalActionType",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.mdp.singleagent.model.FactoredModel",
      "burlap.visualizer.OOStatePainter",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$LLPhysicsParams",
      "burlap.domain.singleagent.lunarlander.LLVisualizer$PadPainter",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCPhysicsParams",
      "burlap.domain.singleagent.mountaincar.MountainCar$MCModel",
      "burlap.domain.singleagent.blockdude.state.BlockDudeCell",
      "burlap.mdp.stochasticgames.JointAction",
      "burlap.mdp.stochasticgames.common.StaticRepeatedGameModel",
      "burlap.domain.singleagent.blockdude.state.BlockDudeAgent",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.mdp.singleagent.environment.SimulatedEnvironment",
      "burlap.domain.singleagent.blockdude.state.BlockDudeMap",
      "burlap.domain.singleagent.blockdude.state.BlockDudeState",
      "burlap.mdp.auxiliary.common.SinglePFTF",
      "burlap.mdp.auxiliary.stateconditiontest.TFGoalCondition",
      "burlap.mdp.auxiliary.stateconditiontest.SinglePFSCT",
      "burlap.mdp.auxiliary.common.GoalConditionTF",
      "burlap.domain.singleagent.blockdude.BlockDudeModel",
      "burlap.mdp.singleagent.common.SingleGoalPFRF",
      "burlap.statehashing.ReflectiveHashableStateFactory",
      "burlap.visualizer.StateActionRenderLayer",
      "burlap.domain.singleagent.graphdefined.GraphDefinedDomain$GraphStateModel",
      "burlap.debugtools.RandomFactory",
      "burlap.mdp.singleagent.common.NullRewardFunction",
      "burlap.mdp.auxiliary.common.RandomStartStateGenerator",
      "burlap.behavior.singleagent.auxiliary.StateReachability",
      "burlap.domain.singleagent.blockdude.BlockDudeVisualizer$BricksPainter",
      "burlap.visualizer.OOStatePainter$ObjectPainterAndClassNamePair",
      "burlap.domain.singleagent.gridworld.GridWorldVisualizer$CellPainter",
      "burlap.domain.singleagent.lunarlander.LunarLanderModel",
      "burlap.domain.singleagent.lunarlander.LLVisualizer$AgentPainter",
      "burlap.domain.singleagent.gridworld.GridWorldDomain$GridWorldModel",
      "burlap.domain.singleagent.mountaincar.MCState",
      "burlap.mdp.singleagent.common.UniformCostRF",
      "burlap.mdp.auxiliary.common.NullTermination",
      "burlap.domain.singleagent.blocksworld.BlocksWorldBlock",
      "burlap.domain.singleagent.blocksworld.BWModel",
      "burlap.mdp.auxiliary.common.ConstantStateGenerator",
      "burlap.mdp.core.oo.state.OOStateUtilities",
      "burlap.domain.singleagent.frostbite.FrostbiteModel",
      "burlap.mdp.core.oo.propositional.GroundedProp",
      "burlap.domain.singleagent.frostbite.FrostbiteVisualizer$AgentPainter",
      "burlap.mdp.core.state.StateUtilities",
      "burlap.domain.singleagent.blockdude.BlockDudeVisualizer$AgentPainter",
      "burlap.domain.stochasticgames.gridgame.GGVisualizer$CellPainter",
      "burlap.domain.singleagent.blockdude.BlockDudeVisualizer$BlockPainter"
    );
  }
}
