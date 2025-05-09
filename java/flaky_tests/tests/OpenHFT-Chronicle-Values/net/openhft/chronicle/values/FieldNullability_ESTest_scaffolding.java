/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 03 10:50:34 GMT 2022
 */

package net.openhft.chronicle.values;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FieldNullability_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.openhft.chronicle.values.FieldNullability"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FieldNullability_ESTest_scaffolding.class.getClassLoader() ,
      "net.openhft.chronicle.values.ValueFieldModel$1",
      "net.openhft.chronicle.values.Nullability",
      "net.openhft.chronicle.values.ValueFieldModel",
      "net.openhft.chronicle.values.ScalarFieldModel",
      "net.openhft.chronicle.values.MemberGenerator",
      "net.openhft.chronicle.values.ObjectHeapMemberGenerator",
      "net.openhft.chronicle.values.MethodTemplate",
      "net.openhft.chronicle.values.HeapMemberGenerator",
      "net.openhft.chronicle.values.ValueFieldModel$NativeMemberGenerator",
      "net.openhft.chronicle.values.FieldNullability",
      "net.openhft.chronicle.values.FieldModel"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FieldNullability_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.openhft.chronicle.values.FieldNullability",
      "net.openhft.chronicle.values.Nullability",
      "net.openhft.chronicle.values.FieldModel",
      "net.openhft.chronicle.values.ScalarFieldModel",
      "net.openhft.chronicle.values.CharSequenceFieldModel",
      "net.openhft.chronicle.values.MemberGenerator",
      "net.openhft.chronicle.values.CharSequenceFieldModel$1",
      "net.openhft.chronicle.values.MethodTemplate",
      "net.openhft.chronicle.values.PrimitiveFieldModel",
      "net.openhft.chronicle.values.IntegerFieldModel",
      "net.openhft.chronicle.values.IntegerBackedNativeMemberGenerator",
      "net.openhft.chronicle.values.IntegerFieldModel$1",
      "net.openhft.chronicle.values.ArrayFieldModel",
      "net.openhft.chronicle.values.IntegerBackedFieldModel",
      "net.openhft.chronicle.values.FloatingFieldModel",
      "net.openhft.chronicle.values.FloatingFieldModel$1",
      "net.openhft.chronicle.values.BooleanFieldModel",
      "net.openhft.chronicle.values.BooleanFieldModel$1",
      "net.openhft.chronicle.values.ValueFieldModel",
      "net.openhft.chronicle.values.ValueFieldModel$NativeMemberGenerator",
      "net.openhft.chronicle.values.PointerFieldModel",
      "net.openhft.chronicle.values.PointerFieldModel$1",
      "net.openhft.chronicle.values.DateFieldModel",
      "net.openhft.chronicle.values.DateFieldModel$1",
      "net.openhft.chronicle.values.RangeImpl",
      "net.openhft.chronicle.values.ValueModel$1",
      "net.openhft.chronicle.values.ValueModel",
      "net.openhft.chronicle.values.Primitives"
    );
  }
}
