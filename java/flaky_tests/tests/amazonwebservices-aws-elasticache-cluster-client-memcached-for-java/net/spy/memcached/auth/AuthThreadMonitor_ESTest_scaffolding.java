/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 15 13:52:58 GMT 2022
 */

package net.spy.memcached.auth;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AuthThreadMonitor_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.spy.memcached.auth.AuthThreadMonitor"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AuthThreadMonitor_ESTest_scaffolding.class.getClassLoader() ,
      "net.spy.memcached.ops.GetsOperation",
      "net.spy.memcached.ops.ConcatenationOperation",
      "net.spy.memcached.auth.AuthThreadMonitor",
      "net.spy.memcached.ops.VersionOperation",
      "net.spy.memcached.ConnectionFactory",
      "net.spy.memcached.ops.TapOperation",
      "net.spy.memcached.auth.PlainCallbackHandler",
      "net.spy.memcached.ops.StatsOperation",
      "net.spy.memcached.compat.log.Level",
      "net.spy.memcached.ClientMode",
      "net.spy.memcached.protocol.binary.BinaryOperationFactory",
      "net.spy.memcached.ops.GetAndTouchOperation$Callback",
      "net.spy.memcached.ops.StoreType",
      "net.spy.memcached.ops.TouchOperation",
      "net.spy.memcached.auth.AuthDescriptor",
      "net.spy.memcached.ops.MutatorOperation",
      "net.spy.memcached.ops.Mutator",
      "net.spy.memcached.ops.GetlOperation$Callback",
      "net.spy.memcached.ops.GetsOperation$Callback",
      "net.spy.memcached.ops.GetOperation",
      "net.spy.memcached.DefaultConnectionFactory",
      "net.spy.memcached.compat.log.AbstractLogger",
      "net.spy.memcached.ops.OperationStatus",
      "net.spy.memcached.ops.BaseOperationFactory",
      "net.spy.memcached.compat.SpyObject",
      "net.spy.memcached.ops.Operation",
      "net.spy.memcached.ops.GetConfigOperation$Callback",
      "net.spy.memcached.ops.NoopOperation",
      "net.spy.memcached.compat.log.LoggerFactory",
      "net.spy.memcached.ops.KeyedOperation",
      "net.spy.memcached.metrics.MetricCollector",
      "net.spy.memcached.ops.UnlockOperation",
      "net.spy.memcached.HashAlgorithm",
      "net.spy.memcached.MemcachedConnection",
      "net.spy.memcached.config.ConfigurationObserver",
      "net.spy.memcached.MemcachedNode",
      "net.spy.memcached.ops.ConcatenationType",
      "net.spy.memcached.ops.CASOperation",
      "net.spy.memcached.auth.AuthThread",
      "net.spy.memcached.ops.SASLAuthOperation",
      "net.spy.memcached.ops.DeleteOperation$Callback",
      "net.spy.memcached.NodeLocator",
      "net.spy.memcached.compat.log.DefaultLogger",
      "net.spy.memcached.ops.GetConfigOperation",
      "net.spy.memcached.ops.GetOperation$Callback",
      "net.spy.memcached.ops.StoreOperation$Callback",
      "net.spy.memcached.ops.FlushOperation",
      "net.spy.memcached.ops.ObserveOperation",
      "net.spy.memcached.compat.SpyThread",
      "net.spy.memcached.ops.SetConfigOperation",
      "net.spy.memcached.tapmessage.RequestMessage",
      "net.spy.memcached.ops.ReplicaGetsOperation",
      "net.spy.memcached.metrics.MetricType",
      "net.spy.memcached.transcoders.Transcoder",
      "net.spy.memcached.ops.SASLMechsOperation",
      "net.spy.memcached.ops.StoreOperation",
      "net.spy.memcached.DefaultHashAlgorithm",
      "net.spy.memcached.ops.DeleteOperation",
      "net.spy.memcached.BinaryConnectionFactory",
      "net.spy.memcached.ops.ReplicaGetOperation",
      "net.spy.memcached.ops.GetlOperation",
      "net.spy.memcached.tapmessage.TapOpcode",
      "net.spy.memcached.ops.DeleteConfigOperation",
      "net.spy.memcached.ops.ObserveOperation$Callback",
      "net.spy.memcached.protocol.ascii.AsciiOperationFactory",
      "net.spy.memcached.OperationFactory",
      "net.spy.memcached.ops.SASLStepOperation",
      "net.spy.memcached.ops.GetAndTouchOperation",
      "net.spy.memcached.ops.StatsOperation$Callback",
      "net.spy.memcached.FailureMode",
      "net.spy.memcached.ops.ReplicaGetOperation$Callback",
      "net.spy.memcached.compat.log.Logger",
      "net.spy.memcached.config.ClusterConfigurationObserver",
      "net.spy.memcached.ops.ConfigurationType",
      "net.spy.memcached.ops.OperationCallback",
      "net.spy.memcached.ops.ReplicaGetsOperation$Callback",
      "net.spy.memcached.tapmessage.BaseMessage"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AuthThreadMonitor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.spy.memcached.compat.SpyObject",
      "net.spy.memcached.auth.AuthThreadMonitor",
      "net.spy.memcached.DefaultHashAlgorithm",
      "net.spy.memcached.metrics.MetricType",
      "net.spy.memcached.DefaultConnectionFactory",
      "net.spy.memcached.BinaryConnectionFactory",
      "net.spy.memcached.TapConnectionProvider",
      "net.spy.memcached.config.ClusterConfiguration",
      "net.spy.memcached.compat.SpyThread",
      "net.spy.memcached.MemcachedConnection",
      "net.spy.memcached.ops.BaseOperationFactory",
      "net.spy.memcached.protocol.binary.BinaryOperationFactory",
      "net.spy.memcached.DefaultConnectionFactory$1",
      "net.spy.memcached.compat.log.LoggerFactory",
      "net.spy.memcached.compat.log.AbstractLogger",
      "net.spy.memcached.compat.log.DefaultLogger",
      "net.spy.memcached.compat.log.Level",
      "net.spy.memcached.metrics.AbstractMetricCollector",
      "net.spy.memcached.metrics.NoopMetricCollector",
      "net.spy.memcached.ArrayModNodeLocator",
      "net.spy.memcached.auth.PlainCallbackHandler",
      "net.spy.memcached.config.NodeEndPoint",
      "net.spy.memcached.protocol.ascii.AsciiOperationFactory",
      "net.spy.memcached.protocol.TCPMemcachedNodeImpl",
      "net.spy.memcached.protocol.ascii.AsciiMemcachedNodeImpl",
      "net.spy.memcached.KetamaConnectionFactory",
      "net.spy.memcached.auth.AuthDescriptor",
      "net.spy.memcached.MemcachedClient",
      "net.spy.memcached.transcoders.BaseSerializingTranscoder",
      "net.spy.memcached.transcoders.SerializingTranscoder",
      "net.spy.memcached.transcoders.TranscoderUtils",
      "net.spy.memcached.transcoders.TranscodeService",
      "net.spy.memcached.internal.BasicThreadFactory",
      "net.spy.memcached.MemcachedNodeROImpl",
      "net.spy.memcached.ops.OperationStatus",
      "net.spy.memcached.ops.CancelledOperationStatus",
      "net.spy.memcached.ops.StatusCode",
      "net.spy.memcached.ops.TimedOutOperationStatus",
      "net.spy.memcached.protocol.BaseOperationImpl",
      "net.spy.memcached.protocol.ascii.OperationImpl",
      "net.spy.memcached.protocol.ascii.BaseStoreOperationImpl",
      "net.spy.memcached.protocol.ascii.ConcatenationOperationImpl",
      "net.spy.memcached.ops.OperationState",
      "net.spy.memcached.protocol.ascii.OperationReadType",
      "net.spy.memcached.auth.AuthThread",
      "net.spy.memcached.protocol.binary.BinaryMemcachedNodeImpl",
      "net.spy.memcached.ops.MultiOperationCallback",
      "net.spy.memcached.ops.MultiReplicaGetOperationCallback",
      "net.spy.memcached.KetamaNodeLocator",
      "net.spy.memcached.util.DefaultKetamaNodeLocatorConfiguration",
      "net.spy.memcached.KetamaNodeKeyFormatter",
      "net.spy.memcached.ops.MultiGetsOperationCallback",
      "net.spy.memcached.ops.MultiGetOperationCallback",
      "net.spy.memcached.DefaultHashAlgorithm$1",
      "net.spy.memcached.ops.CASOperationStatus",
      "net.spy.memcached.CASResponse",
      "net.spy.memcached.protocol.binary.OperationImpl",
      "net.spy.memcached.protocol.binary.SingleKeyOperationImpl",
      "net.spy.memcached.protocol.binary.ReplicaGetsOperationImpl",
      "net.spy.memcached.protocol.ascii.MutatorOperationImpl",
      "net.spy.memcached.KeyUtil",
      "net.spy.memcached.protocol.binary.TapOperationImpl",
      "net.spy.memcached.protocol.binary.TapDumpOperationImpl",
      "net.spy.memcached.protocol.binary.TouchOperationImpl",
      "net.spy.memcached.protocol.binary.StatsOperationImpl",
      "net.spy.memcached.protocol.binary.ConcatenationOperationImpl",
      "net.spy.memcached.protocol.binary.ConcatenationOperationImpl$1",
      "net.spy.memcached.protocol.ascii.VersionOperationImpl",
      "net.spy.memcached.protocol.binary.SASLMechsOperationImpl",
      "net.spy.memcached.protocol.binary.GetAndTouchOperationImpl",
      "net.spy.memcached.protocol.ascii.BaseGetOpImpl",
      "net.spy.memcached.protocol.ascii.GetOperationImpl",
      "net.spy.memcached.protocol.binary.MutatorOperationImpl",
      "net.spy.memcached.protocol.binary.TapAckOperationImpl",
      "net.spy.memcached.protocol.binary.ReplicaGetOperationImpl",
      "net.spy.memcached.protocol.binary.UnlockOperationImpl",
      "net.spy.memcached.protocol.ascii.UnlockOperationImpl",
      "net.spy.memcached.protocol.binary.SetConfigOperationImpl",
      "net.spy.memcached.protocol.binary.GetlOperationImpl",
      "net.spy.memcached.protocol.binary.ObserveOperationImpl",
      "net.spy.memcached.protocol.binary.KeyStatsOperationImpl",
      "net.spy.memcached.protocol.binary.StoreOperationImpl",
      "net.spy.memcached.protocol.binary.StoreOperationImpl$1",
      "net.spy.memcached.tapmessage.BaseMessage",
      "net.spy.memcached.tapmessage.RequestMessage",
      "net.spy.memcached.protocol.binary.GetConfigOperationImpl",
      "net.spy.memcached.protocol.binary.FlushOperationImpl",
      "net.spy.memcached.protocol.binary.DeleteOperationImpl",
      "net.spy.memcached.protocol.ascii.CASOperationImpl",
      "net.spy.memcached.protocol.ascii.FlushOperationImpl",
      "net.spy.memcached.protocol.binary.TapCustomOperationImpl",
      "net.spy.memcached.protocol.binary.GetsOperationImpl",
      "net.spy.memcached.protocol.binary.GetOperationImpl",
      "net.spy.memcached.protocol.ascii.DeleteOperationImpl",
      "net.spy.memcached.protocol.binary.DeleteConfigOperationImpl",
      "net.spy.memcached.protocol.binary.TapBackfillOperationImpl",
      "net.spy.memcached.protocol.binary.NoopOperationImpl",
      "net.spy.memcached.protocol.binary.VersionOperationImpl",
      "net.spy.memcached.protocol.binary.SASLBaseOperationImpl",
      "net.spy.memcached.protocol.binary.SASLAuthOperationImpl",
      "net.spy.memcached.util.StringUtils",
      "net.spy.memcached.protocol.ascii.GetAndTouchOperationImpl",
      "net.spy.memcached.protocol.ascii.BaseGetConfigOperationImpl",
      "net.spy.memcached.protocol.ascii.GetConfigOperationImpl",
      "net.spy.memcached.protocol.ascii.BaseGetConfigOperationImpl$BufferState",
      "net.spy.memcached.protocol.ascii.SetConfigOperationImpl",
      "net.spy.memcached.FailureMode"
    );
  }
}
