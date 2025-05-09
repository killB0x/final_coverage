/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 31 20:06:27 GMT 2022
 */

package com.hubspot.jinjava.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DeferredValueUtils_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.hubspot.jinjava.util.DeferredValueUtils"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DeferredValueUtils_ESTest_scaffolding.class.getClassLoader() ,
      "com.hubspot.jinjava.interpret.DeferredValueImpl",
      "com.hubspot.jinjava.util.ScopeMap",
      "com.hubspot.jinjava.lib.tag.eager.DeferredToken",
      "com.hubspot.jinjava.interpret.DeferredValue",
      "com.hubspot.jinjava.tree.Node",
      "com.hubspot.jinjava.interpret.Context",
      "com.hubspot.jinjava.util.DeferredValueUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DeferredValueUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.hubspot.jinjava.util.DeferredValueUtils",
      "com.hubspot.jinjava.util.DeferredValueUtils$DeferredTag",
      "com.hubspot.jinjava.interpret.DeferredValueImpl",
      "com.hubspot.jinjava.tree.parse.Token",
      "com.hubspot.jinjava.tree.parse.ExpressionToken",
      "com.hubspot.jinjava.util.WhitespaceUtils",
      "com.hubspot.jinjava.lib.tag.ImportTag",
      "com.hubspot.jinjava.tree.parse.TokenScannerSymbols",
      "com.hubspot.jinjava.tree.parse.DefaultTokenScannerSymbols",
      "com.hubspot.jinjava.lib.expression.DefaultExpressionStrategy",
      "com.hubspot.jinjava.lib.expression.EagerExpressionStrategy",
      "com.hubspot.jinjava.tree.parse.TagToken",
      "com.hubspot.jinjava.interpret.InterpretException",
      "com.hubspot.jinjava.interpret.TemplateSyntaxException",
      "com.hubspot.jinjava.lib.tag.eager.DeferredToken",
      "com.hubspot.jinjava.lib.tag.FromTag",
      "com.hubspot.jinjava.tree.Node",
      "com.hubspot.jinjava.tree.ExpressionNode",
      "com.hubspot.jinjava.tree.parse.TextToken",
      "com.hubspot.jinjava.tree.parse.NoteToken"
    );
  }
}
