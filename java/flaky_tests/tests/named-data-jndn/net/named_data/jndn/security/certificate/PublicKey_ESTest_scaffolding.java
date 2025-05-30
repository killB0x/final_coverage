/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 08 23:45:26 GMT 2022
 */

package net.named_data.jndn.security.certificate;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PublicKey_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.named_data.jndn.security.certificate.PublicKey"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PublicKey_ESTest_scaffolding.class.getClassLoader() ,
      "net.named_data.jndn.util.Common$Base64ConverterType",
      "net.named_data.jndn.encoding.der.DerDecodingException",
      "net.named_data.jndn.util.Common",
      "net.named_data.jndn.security.certificate.PublicKey",
      "net.named_data.jndn.encoding.der.DerNode$DerNull",
      "net.named_data.jndn.encoding.der.DerNode",
      "net.named_data.jndn.encoding.der.DerNode$DerInteger",
      "net.named_data.jndn.encoding.der.DerNode$DerByteString",
      "net.named_data.jndn.encoding.der.DerEncodingException",
      "net.named_data.jndn.encoding.der.DerException",
      "net.named_data.jndn.security.DigestAlgorithm",
      "net.named_data.jndn.encoding.der.DerNode$DerBoolean",
      "net.named_data.jndn.security.UnrecognizedDigestAlgorithmException",
      "net.named_data.jndn.encoding.der.DerNode$DerSequence",
      "net.named_data.jndn.encoding.der.DerNode$DerPrintableString",
      "net.named_data.jndn.encoding.der.DerNode$DerExplicitlyTagged",
      "net.named_data.jndn.security.UnrecognizedKeyFormatException",
      "net.named_data.jndn.encoding.der.DerNode$DerOid",
      "net.named_data.jndn.encoding.der.DerNode$DerGeneralizedTime",
      "net.named_data.jndn.encrypt.algo.EncryptAlgorithmType",
      "net.named_data.jndn.encoding.der.DerNode$DerStructure",
      "net.named_data.jndn.security.SecurityException",
      "net.named_data.jndn.encoding.der.DerNode$DerOctetString",
      "net.named_data.jndn.util.Blob",
      "net.named_data.jndn.util.DynamicByteBuffer",
      "net.named_data.jndn.security.KeyType",
      "net.named_data.jndn.encoding.der.DerNode$DerBitString"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PublicKey_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.named_data.jndn.security.certificate.PublicKey",
      "net.named_data.jndn.security.KeyType",
      "net.named_data.jndn.security.DigestAlgorithm",
      "net.named_data.jndn.util.Common$Base64ConverterType",
      "net.named_data.jndn.encrypt.algo.EncryptAlgorithmType",
      "net.named_data.jndn.util.Blob",
      "net.named_data.jndn.util.Common",
      "net.named_data.jndn.encoding.der.DerNode",
      "net.named_data.jndn.encoding.der.DerException",
      "net.named_data.jndn.encoding.der.DerDecodingException",
      "net.named_data.jndn.security.SecurityException",
      "net.named_data.jndn.security.UnrecognizedKeyFormatException",
      "net.named_data.jndn.encoding.der.DerNode$DerExplicitlyTagged",
      "net.named_data.jndn.util.DynamicByteBuffer",
      "net.named_data.jndn.encoding.der.DerNode$DerBoolean",
      "net.named_data.jndn.encoding.der.DerNode$DerGeneralizedTime",
      "net.named_data.jndn.encoding.der.DerNode$DerOid",
      "net.named_data.jndn.encoding.der.DerNode$DerStructure",
      "net.named_data.jndn.encoding.der.DerNode$DerSequence",
      "net.named_data.jndn.encoding.der.DerNode$DerNull",
      "net.named_data.jndn.encoding.der.DerNode$DerInteger",
      "net.named_data.jndn.encoding.der.DerNode$DerByteString",
      "net.named_data.jndn.encoding.der.DerNode$DerOctetString",
      "net.named_data.jndn.encoding.der.DerNode$DerBitString",
      "net.named_data.jndn.encoding.der.DerNode$DerPrintableString",
      "net.named_data.jndn.security.UnrecognizedDigestAlgorithmException"
    );
  }
}
