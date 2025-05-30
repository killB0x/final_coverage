/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 08 23:31:31 GMT 2022
 */

package net.named_data.jndn.encrypt;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Consumer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.named_data.jndn.encrypt.Consumer"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    java.lang.System.setProperty("user.home", "/home/user"); 
    java.lang.System.setProperty("user.dir", "/home/user"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Consumer_ESTest_scaffolding.class.getClassLoader() ,
      "net.named_data.jndn.KeyLocatorType",
      "net.named_data.jndn.Name",
      "net.named_data.jndn.security.KeyIdType",
      "net.named_data.jndn.encrypt.EncryptError$OnError",
      "net.named_data.jndn.encoding.der.DerDecodingException",
      "net.named_data.jndn.util.Common",
      "net.named_data.jndn.encoding.EncodingException",
      "net.named_data.jndn.HmacWithSha256Signature",
      "net.named_data.jndn.security.certificate.PublicKey",
      "net.named_data.jndn.encoding.SignatureHolder",
      "net.named_data.jndn.security.v2.CertificateV2$Error",
      "net.named_data.jndn.ControlParameters",
      "net.named_data.jndn.encoding.ElementListener",
      "net.named_data.jndn.encoding.tlv.TlvDecoder",
      "net.named_data.jndn.encoding.TlvWireFormat",
      "net.named_data.jndn.security.EcKeyParams",
      "net.named_data.jndn.security.KeyChain",
      "net.named_data.jndn.encrypt.Sqlite3ConsumerDb",
      "net.named_data.jndn.impl.InterestFilterTable",
      "net.named_data.jndn.OnTimeout",
      "net.named_data.jndn.security.tpm.TpmKeyHandle",
      "net.named_data.jndn.security.certificate.Certificate",
      "net.named_data.jndn.MetaInfo",
      "net.named_data.jndn.impl.DelayedCallTable",
      "net.named_data.jndn.encrypt.Consumer$OnPlainText",
      "net.named_data.jndn.encoding.der.DerEncodingException",
      "net.named_data.jndn.KeyLocator",
      "net.named_data.jndn.security.DigestAlgorithm",
      "net.named_data.jndn.security.RsaKeyParams",
      "net.named_data.jndn.encoding.ElementReader",
      "net.named_data.jndn.security.OnInterestValidationFailed",
      "net.named_data.jndn.security.KeyChain$Error",
      "net.named_data.jndn.security.KeyChain$LocatorMismatchError",
      "net.named_data.jndn.security.ValidationRequest",
      "net.named_data.jndn.encrypt.Consumer",
      "net.named_data.jndn.Interest",
      "net.named_data.jndn.transport.Transport$ConnectionInfo",
      "net.named_data.jndn.Face",
      "net.named_data.jndn.security.OnVerifyFailed",
      "net.named_data.jndn.security.policy.PolicyManager",
      "net.named_data.jndn.security.SigningInfo",
      "net.named_data.jndn.ControlResponse",
      "net.named_data.jndn.encoding.WireFormat",
      "net.named_data.jndn.security.pib.PibIdentity",
      "net.named_data.jndn.security.policy.CertificateCache",
      "net.named_data.jndn.OnData",
      "net.named_data.jndn.Sha256WithEcdsaSignature",
      "net.named_data.jndn.util.DynamicByteBuffer",
      "net.named_data.jndn.GenericSignature",
      "net.named_data.jndn.OnInterestCallback",
      "net.named_data.jndn.security.KeyParams",
      "net.named_data.jndn.encrypt.ConsumerDb$Error",
      "net.named_data.jndn.RegistrationOptions",
      "net.named_data.jndn.NetworkNack",
      "net.named_data.jndn.DelegationSet$Delegation",
      "net.named_data.jndn.DelegationSet",
      "net.named_data.jndn.security.KeyChain$MakePibImpl",
      "net.named_data.jndn.security.tpm.Tpm",
      "net.named_data.jndn.security.identity.BasicIdentityStorage",
      "net.named_data.jndn.security.identity.PrivateKeyStorage",
      "net.named_data.jndn.Exclude",
      "net.named_data.jndn.transport.AsyncTcpTransport",
      "net.named_data.jndn.security.ValidityPeriod",
      "net.named_data.jndn.security.tpm.TpmBackEnd",
      "net.named_data.jndn.security.tpm.TpmKeyHandleMemory",
      "net.named_data.jndn.ComponentType",
      "net.named_data.jndn.Name$Component",
      "net.named_data.jndn.security.KeyChain$InvalidSigningInfoError",
      "net.named_data.jndn.encoding.tlv.TlvEncoder",
      "net.named_data.jndn.security.pib.PibIdentityContainer",
      "net.named_data.jndn.Sha256WithRsaSignature",
      "net.named_data.jndn.Node$ConnectStatus",
      "net.named_data.jndn.security.SecurityException",
      "net.named_data.jndn.security.pib.Pib$Error",
      "net.named_data.jndn.util.Blob",
      "net.named_data.jndn.encrypt.Consumer$OnConsumeComplete",
      "net.named_data.jndn.security.KeyType",
      "net.named_data.jndn.impl.PendingInterestTable",
      "net.named_data.jndn.security.policy.SelfVerifyPolicyManager",
      "net.named_data.jndn.util.Common$Base64ConverterType",
      "net.named_data.jndn.impl.RegisteredPrefixTable",
      "net.named_data.jndn.security.KeyChain$MakeTpmBackEnd",
      "net.named_data.jndn.security.pib.PibKey",
      "net.named_data.jndn.security.identity.IdentityManager",
      "net.named_data.jndn.util.ConfigFile",
      "net.named_data.jndn.Node",
      "net.named_data.jndn.encrypt.EncryptedContent",
      "net.named_data.jndn.security.tpm.TpmBackEndMemory",
      "net.named_data.jndn.Node$2",
      "net.named_data.jndn.encrypt.Consumer$1",
      "net.named_data.jndn.Node$1",
      "net.named_data.jndn.Link",
      "net.named_data.jndn.encrypt.EncryptError",
      "net.named_data.jndn.util.CommandInterestGenerator",
      "net.named_data.jndn.security.OnVerifiedInterest",
      "net.named_data.jndn.ContentType",
      "net.named_data.jndn.encoding.der.DerException",
      "net.named_data.jndn.security.pib.PibImpl",
      "net.named_data.jndn.encrypt.ConsumerDb",
      "net.named_data.jndn.security.policy.NoVerifyPolicyManager",
      "net.named_data.jndn.lp.LpPacket",
      "net.named_data.jndn.OnRegisterSuccess",
      "net.named_data.jndn.InterestFilter",
      "net.named_data.jndn.security.identity.IdentityStorage",
      "net.named_data.jndn.Signature",
      "net.named_data.jndn.security.identity.FilePrivateKeyStorage",
      "net.named_data.jndn.security.UnrecognizedKeyFormatException",
      "net.named_data.jndn.security.pib.Pib",
      "net.named_data.jndn.security.identity.Sqlite3IdentityStorageBase",
      "net.named_data.jndn.encrypt.Consumer$5",
      "net.named_data.jndn.transport.TcpTransport$ConnectionInfo",
      "net.named_data.jndn.transport.AsyncTcpTransport$ConnectionInfo",
      "net.named_data.jndn.security.SigningInfo$SignerType",
      "net.named_data.jndn.transport.AsyncTcpTransport$1",
      "net.named_data.jndn.transport.TcpTransport",
      "net.named_data.jndn.encrypt.Consumer$6",
      "net.named_data.jndn.transport.AsyncTcpTransport$2",
      "net.named_data.jndn.encrypt.Consumer$7",
      "net.named_data.jndn.transport.Transport",
      "net.named_data.jndn.DigestSha256Signature",
      "net.named_data.jndn.security.pib.detail.PibKeyImpl",
      "net.named_data.jndn.encrypt.Consumer$FriendAccessImpl",
      "net.named_data.jndn.security.certificate.IdentityCertificate",
      "net.named_data.jndn.security.pib.PibImpl$Error",
      "net.named_data.jndn.security.pib.PibCertificateContainer",
      "net.named_data.jndn.security.KeyClass",
      "net.named_data.jndn.security.tpm.Tpm$Error",
      "net.named_data.jndn.encrypt.Consumer$FriendAccess",
      "net.named_data.jndn.encrypt.Sqlite3ConsumerDbBase",
      "net.named_data.jndn.encoding.Tlv0_3WireFormat",
      "net.named_data.jndn.encrypt.Consumer$Friend",
      "net.named_data.jndn.security.SafeBag",
      "net.named_data.jndn.encrypt.EncryptError$ErrorCode",
      "net.named_data.jndn.security.OnVerifyInterestFailed",
      "net.named_data.jndn.security.OnVerified",
      "net.named_data.jndn.Data",
      "net.named_data.jndn.security.tpm.TpmBackEnd$Error",
      "net.named_data.jndn.security.v2.CertificateV2",
      "net.named_data.jndn.security.CommandInterestPreparer",
      "net.named_data.jndn.security.tpm.TpmPrivateKey$Error",
      "net.named_data.jndn.OnNetworkNack",
      "net.named_data.jndn.util.ChangeCounter",
      "net.named_data.jndn.util.SignedBlob",
      "net.named_data.jndn.util.ChangeCountable",
      "net.named_data.jndn.security.OnDataValidationFailed",
      "net.named_data.jndn.OnRegisterFailed"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.concurrent.ThreadFactory", false, Consumer_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("net.named_data.jndn.encrypt.Consumer$Friend", false, Consumer_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("net.named_data.jndn.encrypt.Consumer$OnConsumeComplete", false, Consumer_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("net.named_data.jndn.encrypt.EncryptError$OnError", false, Consumer_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Consumer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.named_data.jndn.Data",
      "net.named_data.jndn.Link",
      "net.named_data.jndn.util.ChangeCounter",
      "net.named_data.jndn.Signature",
      "net.named_data.jndn.Sha256WithRsaSignature",
      "net.named_data.jndn.util.Blob",
      "net.named_data.jndn.KeyLocator",
      "net.named_data.jndn.KeyLocatorType",
      "net.named_data.jndn.Name",
      "net.named_data.jndn.security.ValidityPeriod",
      "net.named_data.jndn.MetaInfo",
      "net.named_data.jndn.ContentType",
      "net.named_data.jndn.Name$Component",
      "net.named_data.jndn.ComponentType",
      "net.named_data.jndn.util.SignedBlob",
      "net.named_data.jndn.DelegationSet",
      "net.named_data.jndn.encrypt.Consumer",
      "net.named_data.jndn.encrypt.Consumer$1",
      "net.named_data.jndn.encrypt.Consumer$5",
      "net.named_data.jndn.encrypt.Consumer$6",
      "net.named_data.jndn.encrypt.Consumer$7",
      "net.named_data.jndn.encrypt.Consumer$2",
      "net.named_data.jndn.encrypt.Consumer$3",
      "net.named_data.jndn.encrypt.Consumer$4",
      "net.named_data.jndn.encrypt.Consumer$FriendAccess",
      "net.named_data.jndn.encrypt.Consumer$FriendAccessImpl",
      "net.named_data.jndn.encrypt.Consumer$1$1",
      "net.named_data.jndn.encrypt.Consumer$2$1",
      "net.named_data.jndn.encrypt.Consumer$3$1",
      "net.named_data.jndn.encrypt.EncryptError$ErrorCode",
      "net.named_data.jndn.encrypt.algo.EncryptAlgorithmType",
      "net.named_data.jndn.encrypt.algo.Encryptor",
      "net.named_data.jndn.encrypt.ConsumerDb$Error",
      "net.named_data.jndn.Face",
      "net.named_data.jndn.Node",
      "net.named_data.jndn.util.Common$Base64ConverterType",
      "net.named_data.jndn.util.Common",
      "net.named_data.jndn.transport.Transport",
      "net.named_data.jndn.transport.TcpTransport",
      "net.named_data.jndn.transport.Transport$ConnectionInfo",
      "net.named_data.jndn.transport.TcpTransport$ConnectionInfo",
      "net.named_data.jndn.impl.PendingInterestTable",
      "net.named_data.jndn.impl.InterestFilterTable",
      "net.named_data.jndn.impl.RegisteredPrefixTable",
      "net.named_data.jndn.impl.DelayedCallTable",
      "net.named_data.jndn.security.CommandInterestPreparer",
      "net.named_data.jndn.util.CommandInterestGenerator",
      "net.named_data.jndn.Node$ConnectStatus",
      "net.named_data.jndn.security.tpm.TpmBackEnd",
      "net.named_data.jndn.security.tpm.TpmBackEndMemory",
      "net.named_data.jndn.security.KeyParams",
      "net.named_data.jndn.security.RsaKeyParams",
      "net.named_data.jndn.security.KeyType",
      "net.named_data.jndn.security.KeyIdType",
      "net.named_data.jndn.security.SigningInfo",
      "net.named_data.jndn.security.SigningInfo$SignerType",
      "net.named_data.jndn.security.DigestAlgorithm",
      "net.named_data.jndn.security.KeyChain",
      "net.named_data.jndn.security.policy.PolicyManager",
      "net.named_data.jndn.security.policy.NoVerifyPolicyManager",
      "net.named_data.jndn.security.pib.Pib",
      "net.named_data.jndn.security.pib.PibIdentityContainer",
      "net.named_data.jndn.util.ConfigFile",
      "net.named_data.jndn.security.pib.PibImpl",
      "net.named_data.jndn.security.pib.PibSqlite3Base",
      "net.named_data.jndn.security.pib.PibSqlite3",
      "net.named_data.jndn.security.KeyChain$3",
      "net.named_data.jndn.security.pib.PibMemory",
      "net.named_data.jndn.security.KeyChain$4",
      "net.named_data.jndn.security.KeyChain$Error",
      "net.named_data.jndn.security.identity.IdentityStorage",
      "net.named_data.jndn.security.identity.Sqlite3IdentityStorageBase",
      "net.named_data.jndn.security.identity.BasicIdentityStorage",
      "net.named_data.jndn.security.tpm.TpmBackEndFile",
      "net.named_data.jndn.security.KeyChain$5",
      "net.named_data.jndn.security.KeyChain$6",
      "net.named_data.jndn.security.identity.IdentityManager",
      "net.named_data.jndn.transport.UdpTransport",
      "net.named_data.jndn.transport.AsyncTcpTransport",
      "net.named_data.jndn.transport.AsyncTcpTransport$1",
      "net.named_data.jndn.transport.AsyncTcpTransport$2",
      "net.named_data.jndn.security.v2.CertificateCacheV2",
      "net.named_data.jndn.security.policy.ConfigPolicyManager",
      "net.named_data.jndn.security.policy.CertificateCache",
      "net.named_data.jndn.util.BoostInfoParser",
      "net.named_data.jndn.util.BoostInfoTree",
      "net.named_data.jndn.security.policy.ConfigPolicyManager$TrustAnchorRefreshManager",
      "net.named_data.jndn.security.identity.MemoryIdentityStorage",
      "net.named_data.jndn.security.identity.PrivateKeyStorage",
      "net.named_data.jndn.security.KeyClass",
      "net.named_data.jndn.security.identity.FilePrivateKeyStorage",
      "net.named_data.jndn.security.SecurityException",
      "net.named_data.jndn.Interest",
      "net.named_data.jndn.Exclude",
      "net.named_data.jndn.security.tpm.Tpm",
      "net.named_data.jndn.security.pib.Pib$Error",
      "net.named_data.jndn.security.pib.PibKey",
      "net.named_data.jndn.encrypt.ConsumerDb",
      "net.named_data.jndn.encrypt.Sqlite3ConsumerDbBase",
      "net.named_data.jndn.encrypt.Sqlite3ConsumerDb",
      "net.named_data.jndn.security.identity.MemoryPrivateKeyStorage",
      "net.named_data.jndn.security.v2.CertificateV2",
      "net.named_data.jndn.security.policy.SelfVerifyPolicyManager",
      "net.named_data.jndn.security.certificate.Certificate",
      "net.named_data.jndn.security.certificate.IdentityCertificate",
      "net.named_data.jndn.encoding.WireFormat",
      "net.named_data.jndn.encoding.Tlv0_3WireFormat",
      "net.named_data.jndn.encoding.TlvWireFormat",
      "net.named_data.jndn.security.certificate.PublicKey",
      "net.named_data.jndn.security.v2.ValidationPolicy",
      "net.named_data.jndn.security.v2.ValidationError",
      "net.named_data.jndn.security.v2.ValidationState",
      "net.named_data.jndn.security.v2.InterestValidationState",
      "net.named_data.jndn.encoding.EncodingException",
      "net.named_data.jndn.GenericSignature",
      "net.named_data.jndn.encoding.tlv.TlvEncoder",
      "net.named_data.jndn.util.DynamicByteBuffer",
      "net.named_data.jndn.security.EcKeyParams",
      "net.named_data.jndn.security.identity.MemoryIdentityStorage$IdentityRecord",
      "net.named_data.jndn.util.MemoryContentCache",
      "net.named_data.jndn.util.MemoryContentCache$1",
      "net.named_data.jndn.RegistrationOptions",
      "net.named_data.jndn.security.v2.DataValidationState",
      "net.named_data.jndn.Node$1",
      "net.named_data.jndn.Node$2",
      "net.named_data.jndn.security.v2.CertificateV2$Error",
      "net.named_data.jndn.util.ExponentialReExpress",
      "net.named_data.jndn.encoding.tlv.TlvDecoder",
      "net.named_data.jndn.DelegationSet$Delegation",
      "net.named_data.jndn.Sha256WithEcdsaSignature",
      "net.named_data.jndn.ControlParameters",
      "net.named_data.jndn.HmacWithSha256Signature",
      "net.named_data.jndn.InterestFilter",
      "net.named_data.jndn.impl.InterestFilterTable$Entry",
      "net.named_data.jndn.encrypt.EncryptedContent",
      "net.named_data.jndn.DigestSha256Signature",
      "net.named_data.jndn.security.v2.ValidationPolicyConfig",
      "net.named_data.jndn.security.v2.ValidationPolicyCommandInterest",
      "net.named_data.jndn.security.v2.ValidationPolicyCommandInterest$Options",
      "net.named_data.jndn.security.v2.CertificateStorage",
      "net.named_data.jndn.security.v2.Validator",
      "net.named_data.jndn.security.v2.TrustAnchorContainer",
      "net.named_data.jndn.security.v2.CertificateContainerInterface",
      "net.named_data.jndn.security.v2.TrustAnchorContainer$AnchorContainer",
      "net.named_data.jndn.security.v2.CertificateFetcher",
      "net.named_data.jndn.security.v2.CertificateFetcherOffline",
      "net.named_data.jndn.encoding.der.DerNode",
      "net.named_data.jndn.security.tpm.TpmBackEnd$Error",
      "net.named_data.jndn.ControlResponse",
      "net.named_data.jndn.security.pib.detail.PibKeyImpl",
      "net.named_data.jndn.lp.LpPacket",
      "net.named_data.jndn.NetworkNack"
    );
  }
}
