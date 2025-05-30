/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 31 23:26:56 GMT 2022
 */

package com.neovisionaries.bluetooth.ble.advertising;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ADPayloadParser_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.neovisionaries.bluetooth.ble.advertising.ADPayloadParser"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ADPayloadParser_ESTest_scaffolding.class.getClassLoader() ,
      "com.neovisionaries.bluetooth.ble.advertising.UUIDsBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.Ucode",
      "com.neovisionaries.bluetooth.ble.advertising.TxPowerLevel",
      "com.neovisionaries.bluetooth.ble.advertising.ADPayloadParser",
      "com.neovisionaries.bluetooth.ble.advertising.LocalName",
      "com.neovisionaries.bluetooth.ble.advertising.ADManufacturerSpecific",
      "com.neovisionaries.bluetooth.ble.advertising.FlagsBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.Flags",
      "com.neovisionaries.bluetooth.ble.advertising.EddystoneTLM",
      "com.neovisionaries.bluetooth.ble.advertising.EddystoneURL",
      "com.neovisionaries.bluetooth.ble.advertising.ADStructure",
      "com.neovisionaries.bluetooth.ble.advertising.MS004CBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.ServiceDataBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.MS0105Builder",
      "com.neovisionaries.bluetooth.ble.advertising.TxPowerLevelBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.IBeacon",
      "com.neovisionaries.bluetooth.ble.advertising.UUIDs",
      "com.neovisionaries.bluetooth.ble.advertising.ADStructureBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.EddystoneBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.EddystoneEID",
      "com.neovisionaries.bluetooth.ble.advertising.IBeaconBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.Eddystone",
      "com.neovisionaries.bluetooth.ble.advertising.LocalNameBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.ADManufacturerSpecificBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.ADPayloadParser$MSBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.UcodeBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.MSBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.ServiceData",
      "com.neovisionaries.bluetooth.ble.advertising.EddystoneUID",
      "com.neovisionaries.bluetooth.ble.advertising.MS019ABuilder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ADPayloadParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.neovisionaries.bluetooth.ble.advertising.MSBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.MS004CBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.IBeaconBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.MS0105Builder",
      "com.neovisionaries.bluetooth.ble.advertising.UcodeBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.MS019ABuilder",
      "com.neovisionaries.bluetooth.ble.advertising.UUIDsBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.LocalNameBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.ServiceDataBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.FlagsBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.TxPowerLevelBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.EddystoneBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.ADPayloadParser$MSBuilder",
      "com.neovisionaries.bluetooth.ble.advertising.ADPayloadParser",
      "com.neovisionaries.bluetooth.ble.advertising.ADStructure",
      "com.neovisionaries.bluetooth.ble.advertising.ADManufacturerSpecific",
      "com.neovisionaries.bluetooth.ble.advertising.IBeacon",
      "com.neovisionaries.bluetooth.ble.advertising.LocalName",
      "com.neovisionaries.bluetooth.ble.advertising.Ucode",
      "com.neovisionaries.bluetooth.ble.advertising.ServiceData",
      "com.neovisionaries.bluetooth.ble.advertising.TxPowerLevel",
      "com.neovisionaries.bluetooth.ble.advertising.Flags",
      "com.neovisionaries.bluetooth.ble.advertising.UUIDs",
      "com.neovisionaries.bluetooth.ble.util.UUIDCreator",
      "com.neovisionaries.bluetooth.ble.util.Bytes"
    );
  }
}
