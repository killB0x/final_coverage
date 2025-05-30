/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 15 04:45:12 GMT 2022
 */

package termo.matter;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Mixture_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "termo.matter.Mixture"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Mixture_ESTest_scaffolding.class.getClassLoader() ,
      "termo.eos.alpha.TwuEquation",
      "termo.binaryParameter.ActivityModelBinaryParameter",
      "termo.eos.EOS",
      "termo.cp.CpEquation",
      "termo.activityModel.VanLaarActivityModel",
      "termo.equations.EqnVaporPressure",
      "termo.component.Compound",
      "termo.eos.alpha.Alpha",
      "termo.equations.Eqn10VaporPressure",
      "termo.cp.DIPPR_107_Equation",
      "termo.eos.alpha.MathiasAboveTcAlphaEquation",
      "termo.matter.Mixture",
      "termo.activityModel.ActivityModel",
      "termo.eos.mixingRule.ExcessGibbsMixingRule",
      "termo.optimization.ContainsParameters",
      "termo.eos.mixingRule.TwoParameterVanDerWaals",
      "termo.binaryParameter.InteractionParameter",
      "termo.equations.Eqn101VaporPressure",
      "termo.eos.alpha.GeneralTwuEquation",
      "termo.eos.mixingRule.VDWMixingRule",
      "termo.activityModel.WilsonActivityModel",
      "termo.eos.alpha.Soave2Parameters",
      "termo.eos.alpha.commonaAlphaEquationsImplementation.StryjekAndVera",
      "termo.eos.Cubic",
      "termo.eos.alpha.UnitAlpha",
      "termo.eos.alpha.CommonAlphaEquation",
      "termo.eos.alpha.YuAndLu",
      "termo.matter.Homogeneous",
      "termo.eos.alpha.MelhemEtAl",
      "termo.eos.alpha.TwoEquationsAlphaExpression",
      "termo.eos.mixingRule.MixingRule",
      "termo.eos.mixingRule.HuronVidalModified2Order",
      "termo.eos.mixingRule.HuronVidalMixingRule",
      "termo.data.ExperimentalDataList",
      "termo.activityModel.UNIQUACActivityModel",
      "termo.eos.mixingRule.WongSandlerMixingRule",
      "termo.activityModel.NRTLActivityModel",
      "termo.matter.Substance",
      "termo.eos.mixingRule.MathiasKlotzPrausnitzMixingRule",
      "termo.eos.alpha.commonaAlphaEquationsImplementation.SoaveAlpha",
      "termo.phase.Phase",
      "termo.eos.alpha.GCEOSEquation",
      "termo.eos.mixingRule.HuronVidalOrbeySandlerModification"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Mixture_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "termo.matter.Homogeneous",
      "termo.matter.Mixture",
      "termo.binaryParameter.InteractionParameter",
      "termo.binaryParameter.ActivityModelBinaryParameter",
      "termo.eos.EOS",
      "termo.eos.Cubic",
      "termo.eos.alpha.Alpha",
      "termo.eos.alpha.CommonAlphaEquation",
      "termo.eos.alpha.commonaAlphaEquationsImplementation.StryjekAndVera",
      "termo.component.Compound",
      "termo.matter.Substance",
      "termo.eos.mixingRule.MixingRule",
      "termo.eos.mixingRule.TwoParameterVanDerWaals",
      "termo.equations.EqnVaporPressure",
      "termo.equations.Eqn101VaporPressure",
      "termo.eos.mixingRule.VDWMixingRule",
      "termo.eos.alpha.MathiasAboveTcAlphaEquation",
      "termo.data.ExperimentalDataList",
      "termo.eos.alpha.commonaAlphaEquationsImplementation.PengAndRobinsonAlpha",
      "termo.activityModel.ActivityModel",
      "termo.activityModel.WilsonActivityModel",
      "termo.eos.mixingRule.ExcessGibbsMixingRule",
      "termo.eos.mixingRule.WongSandlerMixingRule",
      "termo.eos.alpha.YuAndLuAboveTc",
      "termo.activityModel.UNIQUACActivityModel",
      "termo.eos.mixingRule.HuronVidalOrbeySandlerModification",
      "termo.activityModel.VanLaarActivityModel",
      "termo.eos.mixingRule.HuronVidalModified2Order",
      "termo.data.Experimental",
      "termo.data.ExperimentalData",
      "termo.eos.alpha.Soave2Parameters",
      "termo.cp.DIPPR_107_Equation",
      "termo.activityModel.NRTLActivityModel",
      "termo.eos.mixingRule.MathiasKlotzPrausnitzMixingRule",
      "termo.eos.mixingRule.HuronVidalMixingRule",
      "termo.eos.alpha.AndroulakisEtAlAboveTc",
      "termo.eos.alpha.MelhemEtAl",
      "termo.eos.alpha.GeneralTwuEquation",
      "termo.eos.alpha.UnitAlpha",
      "termo.eos.alpha.YuAndLu",
      "termo.eos.alpha.TwoEquationsAlphaExpression",
      "termo.eos.alpha.GCEOSEquation",
      "termo.eos.alpha.TwuEquation",
      "termo.equations.Eqn10VaporPressure",
      "termo.eos.mixingRule.LinearCombinationOfHuronVidalAndMichelsenModels",
      "termo.eos.alpha.AndroulakisEtAl",
      "termo.eos.alpha.commonaAlphaEquationsImplementation.SoaveAlpha",
      "termo.eos.alpha.AdachiAndLuAlphaExpresion",
      "termo.eos.alpha.MathiasCopemanEquation",
      "termo.eos.alpha.commonaAlphaEquationsImplementation.MathiasAlpha",
      "termo.cp.PolinomialCpEquation"
    );
  }
}
