/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 20 22:21:34 GMT 2022
 */

package uk.ziglio.construct.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PassClass_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ziglio.construct.core.PassClass"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PassClass_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ziglio.construct.lib.Containers$ContainerError",
      "uk.ziglio.construct.lib.Containers",
      "uk.ziglio.construct.core.PassClass",
      "uk.ziglio.construct.errors.ValueError",
      "uk.ziglio.construct.errors.FieldError",
      "uk.ziglio.construct.lib.Containers$Container",
      "uk.ziglio.construct.lib.ByteBufferWrapper",
      "uk.ziglio.construct.errors.SizeofError",
      "uk.ziglio.construct.errors.ConstructError",
      "uk.ziglio.construct.core.Construct"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PassClass_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ziglio.construct.core.Construct",
      "uk.ziglio.construct.core.PassClass",
      "uk.ziglio.construct.lib.Binary",
      "uk.ziglio.construct.lib.ByteBufferWrapper",
      "uk.ziglio.construct.lib.BitStream$BitStreamReader",
      "uk.ziglio.construct.lib.Containers$Container",
      "uk.ziglio.construct.Core$1",
      "uk.ziglio.construct.Core",
      "uk.ziglio.construct.lib.Containers$ContainerError",
      "uk.ziglio.construct.lib.BitStream$BitStreamWriter",
      "uk.ziglio.construct.errors.ConstructError",
      "uk.ziglio.construct.errors.ValueError",
      "uk.ziglio.construct.core.KeyFunc",
      "uk.ziglio.construct.core.Switch",
      "uk.ziglio.construct.errors.FieldError",
      "uk.ziglio.construct.errors.SwitchError",
      "uk.ziglio.construct.core.Subconstruct",
      "uk.ziglio.construct.core.Restream",
      "uk.ziglio.construct.core.Value",
      "uk.ziglio.construct.core.Struct",
      "uk.ziglio.construct.core.Sequence",
      "uk.ziglio.construct.core.Reconfig",
      "uk.ziglio.construct.errors.SizeofError"
    );
  }
}
