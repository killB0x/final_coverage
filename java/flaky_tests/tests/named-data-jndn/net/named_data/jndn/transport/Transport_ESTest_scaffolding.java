/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Nov 09 01:18:40 GMT 2022
 */

package net.named_data.jndn.transport;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Transport_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.named_data.jndn.transport.Transport"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Transport_ESTest_scaffolding.class.getClassLoader() ,
      "net.named_data.jndn.OnInterestCallback",
      "net.named_data.jndn.util.Common$Base64ConverterType",
      "net.named_data.jndn.impl.RegisteredPrefixTable",
      "net.named_data.jndn.Name",
      "net.named_data.jndn.util.Common",
      "net.named_data.jndn.encoding.EncodingException",
      "net.named_data.jndn.encoding.SignatureHolder",
      "net.named_data.jndn.Node",
      "net.named_data.jndn.RegistrationOptions",
      "net.named_data.jndn.encoding.ElementListener",
      "net.named_data.jndn.encoding.TlvWireFormat",
      "net.named_data.jndn.security.KeyChain",
      "net.named_data.jndn.impl.InterestFilterTable",
      "net.named_data.jndn.NetworkNack",
      "net.named_data.jndn.OnTimeout",
      "net.named_data.jndn.util.CommandInterestGenerator",
      "net.named_data.jndn.impl.DelayedCallTable",
      "net.named_data.jndn.encoding.Tlv0_3WireFormat",
      "net.named_data.jndn.transport.AsyncTcpTransport",
      "net.named_data.jndn.ComponentType",
      "net.named_data.jndn.encoding.ElementReader",
      "net.named_data.jndn.Data",
      "net.named_data.jndn.OnRegisterSuccess",
      "net.named_data.jndn.InterestFilter",
      "net.named_data.jndn.transport.Transport$ConnectionInfo",
      "net.named_data.jndn.Interest",
      "net.named_data.jndn.Name$Component",
      "net.named_data.jndn.Face",
      "net.named_data.jndn.transport.UdpTransport",
      "net.named_data.jndn.security.CommandInterestPreparer",
      "net.named_data.jndn.transport.TcpTransport$ConnectionInfo",
      "net.named_data.jndn.transport.AsyncTcpTransport$ConnectionInfo",
      "net.named_data.jndn.OnNetworkNack",
      "net.named_data.jndn.util.SignedBlob",
      "net.named_data.jndn.transport.AsyncTcpTransport$1",
      "net.named_data.jndn.transport.TcpTransport",
      "net.named_data.jndn.encoding.WireFormat",
      "net.named_data.jndn.transport.AsyncTcpTransport$2",
      "net.named_data.jndn.transport.Transport",
      "net.named_data.jndn.Node$ConnectStatus",
      "net.named_data.jndn.security.SecurityException",
      "net.named_data.jndn.util.ChangeCountable",
      "net.named_data.jndn.OnData",
      "net.named_data.jndn.util.Blob",
      "net.named_data.jndn.OnRegisterFailed",
      "net.named_data.jndn.transport.UdpTransport$ConnectionInfo",
      "net.named_data.jndn.impl.PendingInterestTable"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.concurrent.ThreadFactory", false, Transport_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Transport_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.named_data.jndn.util.Common$Base64ConverterType",
      "net.named_data.jndn.util.Common",
      "net.named_data.jndn.transport.Transport",
      "net.named_data.jndn.transport.TcpTransport",
      "net.named_data.jndn.transport.UdpTransport",
      "net.named_data.jndn.transport.Transport$ConnectionInfo",
      "net.named_data.jndn.util.Blob",
      "net.named_data.jndn.Node",
      "net.named_data.jndn.impl.PendingInterestTable",
      "net.named_data.jndn.impl.InterestFilterTable",
      "net.named_data.jndn.impl.RegisteredPrefixTable",
      "net.named_data.jndn.impl.DelayedCallTable",
      "net.named_data.jndn.security.CommandInterestPreparer",
      "net.named_data.jndn.util.CommandInterestGenerator",
      "net.named_data.jndn.Name",
      "net.named_data.jndn.ComponentType",
      "net.named_data.jndn.Name$Component",
      "net.named_data.jndn.Node$ConnectStatus",
      "net.named_data.jndn.transport.AsyncTcpTransport",
      "net.named_data.jndn.transport.AsyncTcpTransport$1",
      "net.named_data.jndn.transport.AsyncTcpTransport$2",
      "net.named_data.jndn.Data",
      "net.named_data.jndn.security.certificate.Certificate",
      "net.named_data.jndn.security.certificate.IdentityCertificate",
      "net.named_data.jndn.util.ChangeCounter",
      "net.named_data.jndn.Signature",
      "net.named_data.jndn.Sha256WithRsaSignature",
      "net.named_data.jndn.KeyLocator",
      "net.named_data.jndn.KeyLocatorType",
      "net.named_data.jndn.security.ValidityPeriod",
      "net.named_data.jndn.MetaInfo",
      "net.named_data.jndn.ContentType",
      "net.named_data.jndn.util.SignedBlob",
      "net.named_data.jndn.security.certificate.PublicKey",
      "net.named_data.jndn.encoding.WireFormat",
      "net.named_data.jndn.encoding.Tlv0_3WireFormat",
      "net.named_data.jndn.encoding.TlvWireFormat",
      "net.named_data.jndn.security.identity.IdentityStorage",
      "net.named_data.jndn.security.identity.PrivateKeyStorage",
      "net.named_data.jndn.security.identity.IdentityManager",
      "net.named_data.jndn.Face",
      "net.named_data.jndn.transport.TcpTransport$ConnectionInfo",
      "net.named_data.jndn.util.MemoryContentCache",
      "net.named_data.jndn.util.MemoryContentCache$1",
      "net.named_data.jndn.InterestFilter",
      "net.named_data.jndn.lp.LpPacket",
      "net.named_data.jndn.NetworkNack"
    );
  }
}
