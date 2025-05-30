/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 19 03:02:23 GMT 2022
 */

package com.ajjpj.amapper.javabean;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SimpleJavaBeanMappingHelper_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.ajjpj.amapper.javabean.SimpleJavaBeanMappingHelper"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimpleJavaBeanMappingHelper_ESTest_scaffolding.class.getClassLoader() ,
      "com.ajjpj.amapper.core.tpe.AQualifiedType",
      "com.ajjpj.amapper.util.AArraySupport$TypeHandler",
      "com.ajjpj.amapper.collection.ACollectionHelper",
      "com.ajjpj.amapper.core.tpe.AQualifier",
      "com.ajjpj.amapper.javabean.SingleParamBeanType",
      "com.ajjpj.amapper.core.tpe.AType",
      "com.ajjpj.amapper.javabean.JavaBeanMappingHelper",
      "com.ajjpj.amapper.util.AArraySupport$3",
      "com.ajjpj.amapper.util.AArraySupport$4",
      "com.ajjpj.amapper.util.AArraySupport$1",
      "com.ajjpj.amapper.javabean.SimpleJavaBeanMappingHelper",
      "com.ajjpj.amapper.util.AArraySupport$2",
      "com.ajjpj.amapper.javabean.JavaBeanTypes",
      "com.ajjpj.amapper.util.AArraySupport$9",
      "com.ajjpj.amapper.util.AArraySupport$7",
      "com.ajjpj.amapper.javabean.JavaBeanType",
      "com.ajjpj.amapper.util.AArraySupport$8",
      "com.ajjpj.amapper.util.AArraySupport$5",
      "com.ajjpj.amapper.util.AArraySupport",
      "com.ajjpj.amapper.util.AArraySupport$6"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimpleJavaBeanMappingHelper_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.ajjpj.amapper.javabean.SimpleJavaBeanMappingHelper",
      "com.ajjpj.amapper.util.AArraySupport$1",
      "com.ajjpj.amapper.util.AArraySupport$2",
      "com.ajjpj.amapper.util.AArraySupport$3",
      "com.ajjpj.amapper.util.AArraySupport$4",
      "com.ajjpj.amapper.util.AArraySupport$5",
      "com.ajjpj.amapper.util.AArraySupport$6",
      "com.ajjpj.amapper.util.AArraySupport$7",
      "com.ajjpj.amapper.util.AArraySupport$8",
      "com.ajjpj.amapper.util.AArraySupport$9",
      "com.ajjpj.amapper.util.AArraySupport",
      "com.ajjpj.amapper.core.tpe.AQualifiedType",
      "com.ajjpj.amapper.javabean.JavaBeanType",
      "com.ajjpj.amapper.javabean.SingleParamBeanType",
      "com.ajjpj.amapper.javabean.JavaBeanTypes"
    );
  }
}
