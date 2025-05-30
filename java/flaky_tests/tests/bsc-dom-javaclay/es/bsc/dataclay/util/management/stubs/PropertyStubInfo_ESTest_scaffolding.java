/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 11 13:46:17 GMT 2022
 */

package es.bsc.dataclay.util.management.stubs;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PropertyStubInfo_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "es.bsc.dataclay.util.management.stubs.PropertyStubInfo"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PropertyStubInfo_ESTest_scaffolding.class.getClassLoader() ,
      "es.bsc.dataclay.util.ids.ID",
      "es.bsc.dataclay.util.DataClayObjectMetaData",
      "es.bsc.dataclay.util.ids.NamespaceID",
      "es.bsc.dataclay.util.management.classmgr.LanguageDependantTypeInfo",
      "es.bsc.dataclay.util.ReferenceCounting",
      "es.bsc.dataclay.util.management.classmgr.python.PythonTypeInfo",
      "es.bsc.dataclay.exceptions.logicmodule.classmgr.TypeDepInfoAlreadyRegisteredException",
      "es.bsc.dataclay.serialization.buffer.DataClayByteBuffer",
      "es.bsc.dataclay.serialization.DataClaySerializable",
      "es.bsc.dataclay.exceptions.DataClayException",
      "es.bsc.dataclay.util.management.classmgr.Type",
      "es.bsc.dataclay.util.ids.OperationID",
      "es.bsc.dataclay.util.management.classmgr.java.JavaTypeInfo",
      "es.bsc.dataclay.util.yaml.CommonYAML",
      "es.bsc.dataclay.util.management.stubs.PropertyStubInfo",
      "es.bsc.dataclay.util.ids.PropertyID"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PropertyStubInfo_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "es.bsc.dataclay.util.management.stubs.PropertyStubInfo",
      "es.bsc.dataclay.util.ids.ID",
      "es.bsc.dataclay.util.ids.PropertyID",
      "es.bsc.dataclay.util.management.classmgr.Type",
      "es.bsc.dataclay.util.ids.OperationID",
      "es.bsc.dataclay.util.ids.NamespaceID",
      "es.bsc.dataclay.serialization.buffer.JavaByteBuffer",
      "es.bsc.dataclay.util.ReferenceCounting",
      "es.bsc.dataclay.util.management.classmgr.java.JavaTypeInfo",
      "es.bsc.dataclay.util.management.classmgr.python.PythonTypeInfo",
      "es.bsc.dataclay.util.Configuration",
      "es.bsc.dataclay.util.DataClayObjectMetaData",
      "es.bsc.dataclay.serialization.buffer.GrpcByteBuffer",
      "es.bsc.dataclay.util.ids.ObjectID",
      "es.bsc.dataclay.util.ids.ExecutionEnvironmentID"
    );
  }
}
