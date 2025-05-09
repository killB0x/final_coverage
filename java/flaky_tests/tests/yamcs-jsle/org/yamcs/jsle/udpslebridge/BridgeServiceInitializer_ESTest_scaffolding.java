/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 11 19:21:46 GMT 2022
 */

package org.yamcs.jsle.udpslebridge;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BridgeServiceInitializer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.yamcs.jsle.udpslebridge.BridgeServiceInitializer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BridgeServiceInitializer_ESTest_scaffolding.class.getClassLoader() ,
      "org.yamcs.jsle.SleEnum",
      "org.yamcs.jsle.provider.ServiceInitializer$ServiceInitResult",
      "org.yamcs.jsle.Constants$CltuThrowEventDiagnostics",
      "org.yamcs.jsle.Constants$NotificationMode",
      "org.yamcs.jsle.Constants$CltuProductionStatus",
      "org.yamcs.jsle.Constants$ProductionStatus",
      "org.yamcs.jsle.udpslebridge.BridgeServiceInitializer",
      "org.yamcs.jsle.Constants$ForwardDuStatus",
      "org.yamcs.jsle.provider.ServiceInitializer",
      "org.yamcs.jsle.Constants$DeliveryMode",
      "org.yamcs.jsle.provider.FrameSink",
      "org.yamcs.jsle.Constants$UnbindReason",
      "org.yamcs.jsle.provider.SleService",
      "org.yamcs.jsle.provider.FrameSource",
      "org.yamcs.jsle.udpslebridge.ConfigurationException",
      "org.yamcs.jsle.Constants$UplinkStatus",
      "org.yamcs.jsle.Constants$LockStatus",
      "org.yamcs.jsle.Constants",
      "org.yamcs.jsle.Constants$ApplicationIdentifier",
      "org.yamcs.jsle.Constants$RequestedFrameQuality",
      "org.yamcs.jsle.Constants$FrameQuality"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BridgeServiceInitializer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.yamcs.jsle.udpslebridge.BridgeServiceInitializer",
      "org.yamcs.jsle.Constants$ApplicationIdentifier",
      "org.yamcs.jsle.udpslebridge.FrameSources",
      "org.yamcs.jsle.udpslebridge.FrameSinks",
      "org.yamcs.jsle.provider.ServiceInitializer$ServiceInitResult"
    );
  }
}
