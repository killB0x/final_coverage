/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 06 03:08:07 GMT 2022
 */

package burlap.visualizer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Visualizer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "burlap.visualizer.Visualizer"; 
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
    java.lang.System.setProperty("user.home", "/home/user"); 
    java.lang.System.setProperty("user.dir", "/home/user"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Visualizer_ESTest_scaffolding.class.getClassLoader() ,
      "burlap.mdp.core.state.MutableState",
      "burlap.visualizer.MultiLayerRenderer",
      "burlap.visualizer.OOStatePainter",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.mdp.core.state.State",
      "burlap.mdp.core.state.NullState",
      "burlap.mdp.core.oo.state.exceptions.UnknownObjectException",
      "burlap.mdp.core.action.Action",
      "burlap.visualizer.StateRenderLayer",
      "burlap.visualizer.StateActionRenderLayer",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.visualizer.RenderLayer",
      "burlap.mdp.core.oo.state.ObjectInstance",
      "burlap.visualizer.StatePainter",
      "burlap.mdp.core.oo.state.OOState",
      "burlap.mdp.core.oo.state.MutableOOState",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.visualizer.ObjectPainter",
      "burlap.visualizer.Visualizer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Visualizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "burlap.visualizer.MultiLayerRenderer",
      "burlap.visualizer.Visualizer",
      "burlap.visualizer.StateRenderLayer",
      "burlap.mdp.core.state.NullState",
      "burlap.mdp.core.oo.state.generic.GenericOOState",
      "burlap.mdp.core.oo.state.generic.DeepOOState",
      "burlap.mdp.core.oo.state.OOStateUtilities",
      "burlap.visualizer.OOStatePainter",
      "burlap.domain.singleagent.blocksworld.BlocksWorldVisualizer$BlockPainter",
      "burlap.visualizer.OOStatePainter$ObjectPainterAndClassNamePair",
      "burlap.domain.singleagent.blocksworld.BlocksWorldBlock",
      "burlap.mdp.core.action.SimpleAction",
      "burlap.domain.singleagent.frostbite.FrostbiteVisualizer$PlatformPainter",
      "burlap.domain.singleagent.frostbite.FrostbiteVisualizer$IglooPainter",
      "burlap.domain.singleagent.lunarlander.LLVisualizer$PadPainter",
      "burlap.domain.singleagent.frostbite.FrostbiteVisualizer$AgentPainter",
      "burlap.domain.singleagent.blockdude.BlockDudeVisualizer$ExitPainter",
      "burlap.domain.singleagent.lunarlander.LunarLanderDomain$LLPhysicsParams",
      "burlap.domain.singleagent.frostbite.FrostbiteVisualizer",
      "burlap.mdp.core.state.StateUtilities",
      "burlap.domain.stochasticgames.gridgame.GGVisualizer$CellPainter",
      "burlap.domain.singleagent.lunarlander.LLVisualizer$AgentPainter",
      "burlap.domain.singleagent.blockdude.BlockDudeVisualizer$BlockPainter",
      "burlap.mdp.core.oo.state.OOVariableKey",
      "burlap.domain.singleagent.lunarlander.LLVisualizer$ObstaclePainter",
      "burlap.domain.singleagent.gridworld.GridWorldVisualizer$LocationPainter",
      "burlap.mdp.core.oo.state.exceptions.UnknownObjectException",
      "burlap.domain.singleagent.blockdude.BlockDudeVisualizer$AgentPainter"
    );
  }
}
