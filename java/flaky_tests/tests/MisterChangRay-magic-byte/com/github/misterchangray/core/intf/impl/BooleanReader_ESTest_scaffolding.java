/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 14 16:38:27 GMT 2022
 */

package com.github.misterchangray.core.intf.impl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BooleanReader_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.misterchangray.core.intf.impl.BooleanReader"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BooleanReader_ESTest_scaffolding.class.getClassLoader() ,
      "com.github.misterchangray.core.intf.MField",
      "com.github.misterchangray.core.annotation.MagicField",
      "com.github.misterchangray.core.exception.MagicParseException",
      "com.github.misterchangray.core.intf.MWriter",
      "com.github.misterchangray.core.util.AssertUtil",
      "com.github.misterchangray.core.enums.TypeEnum",
      "com.github.misterchangray.core.intf.MReader",
      "com.github.misterchangray.core.clazz.FieldMetaInfoWrapper",
      "com.github.misterchangray.core.clazz.ClassMetaInfo",
      "com.github.misterchangray.core.exception.OutOfMemoryDetecteException",
      "com.github.misterchangray.core.intf.impl.BooleanReader",
      "com.github.misterchangray.core.clazz.FieldMetaInfo",
      "com.github.misterchangray.core.exception.MagicByteException",
      "com.github.misterchangray.core.intf.impl.StringReader",
      "com.github.misterchangray.core.MagicChecker",
      "com.github.misterchangray.core.util.DynamicByteBuffer",
      "com.github.misterchangray.core.intf.MClass"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BooleanReader_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.misterchangray.core.intf.MReader",
      "com.github.misterchangray.core.intf.impl.BooleanReader",
      "com.github.misterchangray.core.clazz.ClassMetaInfo",
      "com.github.misterchangray.core.clazz.FieldMetaInfo",
      "com.github.misterchangray.core.util.DynamicByteBuffer",
      "com.github.misterchangray.core.util.AssertUtil",
      "com.github.misterchangray.core.exception.MagicByteException",
      "com.github.misterchangray.core.exception.OutOfMemoryDetecteException",
      "com.github.misterchangray.core.intf.impl.StringReader",
      "com.github.misterchangray.core.intf.MWriter",
      "com.github.misterchangray.core.intf.impl.ByteWriter",
      "com.github.misterchangray.core.exception.MagicParseException",
      "com.github.misterchangray.core.intf.impl.DoubleWriter",
      "com.github.misterchangray.core.intf.impl.FloatReader",
      "com.github.misterchangray.core.intf.impl.CharWriter",
      "com.github.misterchangray.core.intf.impl.IntReader",
      "com.github.misterchangray.core.intf.impl.CollectionReader",
      "com.github.misterchangray.core.intf.impl.ObjectWriter",
      "com.github.misterchangray.core.intf.impl.StringWriter",
      "com.github.misterchangray.core.intf.impl.IntWriter",
      "com.github.misterchangray.core.intf.impl.LongReader",
      "com.github.misterchangray.core.intf.impl.FloatWriter",
      "com.github.misterchangray.core.intf.impl.LongWriter",
      "com.github.misterchangray.core.intf.impl.ShortReader",
      "com.github.misterchangray.core.intf.impl.CharReader",
      "com.github.misterchangray.core.intf.impl.ShortWriter",
      "com.github.misterchangray.core.intf.impl.ByteReader",
      "com.github.misterchangray.core.intf.impl.CollectionWriter",
      "com.github.misterchangray.core.intf.impl.DoubleReader",
      "com.github.misterchangray.core.intf.impl.ObjectReader",
      "com.github.misterchangray.core.intf.impl.BooleanWriter",
      "com.github.misterchangray.core.Packer",
      "com.github.misterchangray.core.enums.TypeEnum"
    );
  }
}
