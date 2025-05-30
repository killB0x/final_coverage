/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 31 23:51:22 GMT 2022
 */

package com.hubspot.jinjava.lib.filter;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AdvancedFilter_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.hubspot.jinjava.lib.filter.AdvancedFilter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AdvancedFilter_ESTest_scaffolding.class.getClassLoader() ,
      "com.hubspot.jinjava.lib.filter.PlusTimeFilter",
      "com.hubspot.jinjava.lib.filter.SumFilter",
      "com.hubspot.jinjava.objects.serialization.PyishSerializable",
      "com.hubspot.jinjava.objects.PyWrapper",
      "com.hubspot.jinjava.doc.annotations.JinjavaParam",
      "com.hubspot.jinjava.doc.annotations.JinjavaDoc",
      "com.hubspot.jinjava.interpret.TemplateSyntaxException",
      "com.hubspot.jinjava.util.ForLoop",
      "com.hubspot.jinjava.interpret.InterpretException",
      "com.hubspot.jinjava.doc.annotations.JinjavaMetaValue",
      "com.hubspot.jinjava.lib.filter.BaseDateFilter",
      "com.hubspot.jinjava.lib.filter.Filter",
      "com.hubspot.jinjava.doc.annotations.JinjavaSnippet",
      "com.hubspot.jinjava.util.ObjectIterator",
      "com.hubspot.jinjava.lib.Importable",
      "com.hubspot.jinjava.interpret.InvalidArgumentException",
      "com.hubspot.jinjava.objects.SafeString",
      "com.hubspot.jinjava.lib.filter.AdvancedFilter",
      "com.hubspot.jinjava.interpret.JinjavaInterpreter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AdvancedFilter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.hubspot.jinjava.lib.filter.AbstractFilter",
      "com.hubspot.jinjava.lib.filter.DefaultFilter",
      "com.hubspot.jinjava.lib.filter.FormatFilter",
      "com.hubspot.jinjava.lib.filter.SumFilter",
      "com.hubspot.jinjava.lib.filter.AbstractSetFilter",
      "com.hubspot.jinjava.lib.filter.IntersectFilter",
      "com.hubspot.jinjava.util.ObjectIterator",
      "com.hubspot.jinjava.util.ForLoop",
      "com.hubspot.jinjava.lib.filter.BaseDateFilter",
      "com.hubspot.jinjava.lib.filter.PlusTimeFilter",
      "com.hubspot.jinjava.lib.filter.BetweenTimesFilter",
      "com.hubspot.jinjava.lib.filter.MinusTimeFilter",
      "com.hubspot.jinjava.lib.filter.SymmetricDifferenceFilter",
      "com.hubspot.jinjava.lib.filter.SelectFilter",
      "com.hubspot.jinjava.lib.filter.RejectFilter",
      "com.hubspot.jinjava.lib.filter.DAliasedDefaultFilter",
      "com.hubspot.jinjava.lib.filter.SelectAttrFilter",
      "com.hubspot.jinjava.lib.filter.RejectAttrFilter",
      "com.hubspot.jinjava.lib.filter.UnionFilter",
      "com.hubspot.jinjava.lib.filter.MapFilter",
      "com.hubspot.jinjava.interpret.InvalidArgumentException",
      "com.hubspot.jinjava.interpret.InvalidReason",
      "com.hubspot.jinjava.lib.filter.DifferenceFilter",
      "com.hubspot.jinjava.objects.SafeString",
      "com.hubspot.jinjava.interpret.InterpretException",
      "com.hubspot.jinjava.interpret.TemplateSyntaxException",
      "com.hubspot.jinjava.lib.fn.Functions",
      "com.hubspot.jinjava.lib.exptest.IsIterableExpTest",
      "com.hubspot.jinjava.lib.exptest.IsStringExpTest",
      "com.hubspot.jinjava.lib.exptest.IsStringContainingExpTest",
      "com.hubspot.jinjava.lib.exptest.IsDivisibleByExpTest",
      "com.hubspot.jinjava.lib.exptest.IsStringStartingWithExpTest",
      "com.hubspot.jinjava.lib.exptest.IsUpperExpTest",
      "com.hubspot.jinjava.lib.exptest.IsSequenceExpTest",
      "com.hubspot.jinjava.lib.exptest.IsSameAsExpTest",
      "com.hubspot.jinjava.lib.exptest.IsTruthyExpTest",
      "com.hubspot.jinjava.util.ObjectTruthValue",
      "com.hubspot.jinjava.lib.exptest.IsEvenExpTest",
      "com.hubspot.jinjava.lib.exptest.IsFloatExpTest",
      "com.hubspot.jinjava.lib.exptest.IsOddExpTest"
    );
  }
}
