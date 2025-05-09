/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 15 15:03:24 GMT 2022
 */

package net.spy.memcached.protocol.binary;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ReplicaGetsOperationImpl_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.spy.memcached.protocol.binary.ReplicaGetsOperationImpl"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReplicaGetsOperationImpl_ESTest_scaffolding.class.getClassLoader() ,
      "net.spy.memcached.protocol.binary.SingleKeyOperationImpl",
      "net.spy.memcached.ops.TimedOutOperationStatus",
      "net.spy.memcached.ops.OperationState",
      "net.spy.memcached.compat.log.DefaultLogger",
      "net.spy.memcached.ops.StatusCode",
      "net.spy.memcached.ops.CASOperationStatus",
      "net.spy.memcached.ops.VBucketAware",
      "net.spy.memcached.protocol.BaseOperationImpl",
      "net.spy.memcached.ops.CancelledOperationStatus",
      "net.spy.memcached.KeyUtil",
      "net.spy.memcached.compat.log.AbstractLogger",
      "net.spy.memcached.ops.ReplicaGetsOperation",
      "net.spy.memcached.ops.OperationStatus",
      "net.spy.memcached.ops.OperationException",
      "net.spy.memcached.ops.OperationErrorType",
      "net.spy.memcached.protocol.binary.ReplicaGetsOperationImpl",
      "net.spy.memcached.ops.Operation",
      "net.spy.memcached.compat.SpyObject",
      "net.spy.memcached.compat.log.LoggerFactory",
      "net.spy.memcached.ops.KeyedOperation",
      "net.spy.memcached.CASResponse",
      "net.spy.memcached.compat.log.Logger",
      "net.spy.memcached.protocol.binary.OperationImpl",
      "net.spy.memcached.MemcachedNode",
      "net.spy.memcached.ops.OperationCallback",
      "net.spy.memcached.ops.ReplicaGetsOperation$Callback"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("net.spy.memcached.ops.ReplicaGetsOperation$Callback", false, ReplicaGetsOperationImpl_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReplicaGetsOperationImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.spy.memcached.compat.SpyObject",
      "net.spy.memcached.ops.OperationStatus",
      "net.spy.memcached.ops.CancelledOperationStatus",
      "net.spy.memcached.ops.StatusCode",
      "net.spy.memcached.ops.TimedOutOperationStatus",
      "net.spy.memcached.protocol.BaseOperationImpl",
      "net.spy.memcached.ops.CASOperationStatus",
      "net.spy.memcached.CASResponse",
      "net.spy.memcached.protocol.binary.OperationImpl",
      "net.spy.memcached.protocol.binary.SingleKeyOperationImpl",
      "net.spy.memcached.protocol.binary.ReplicaGetsOperationImpl",
      "net.spy.memcached.ops.OperationState",
      "net.spy.memcached.FailureMode",
      "net.spy.memcached.DefaultHashAlgorithm",
      "net.spy.memcached.metrics.MetricType",
      "net.spy.memcached.DefaultConnectionFactory",
      "net.spy.memcached.BinaryConnectionFactory",
      "net.spy.memcached.config.NodeEndPoint",
      "net.spy.memcached.protocol.TCPMemcachedNodeImpl",
      "net.spy.memcached.protocol.binary.BinaryMemcachedNodeImpl",
      "net.spy.memcached.compat.log.LoggerFactory",
      "net.spy.memcached.compat.log.AbstractLogger",
      "net.spy.memcached.compat.log.DefaultLogger",
      "net.spy.memcached.KeyUtil",
      "net.spy.memcached.compat.log.Level",
      "net.spy.memcached.ops.OperationErrorType",
      "net.spy.memcached.protocol.BaseOperationImpl$1",
      "net.spy.memcached.ops.OperationException",
      "net.spy.memcached.KetamaConnectionFactory",
      "net.spy.memcached.KetamaNodeKeyFormatter$Format",
      "net.spy.memcached.ops.BaseOperationFactory",
      "net.spy.memcached.protocol.binary.BinaryOperationFactory",
      "net.spy.memcached.protocol.binary.ConcatenationOperationImpl",
      "net.spy.memcached.protocol.binary.ConcatenationOperationImpl$1",
      "net.spy.memcached.MemcachedNodeROImpl",
      "net.spy.memcached.protocol.binary.StatsOperationImpl",
      "net.spy.memcached.protocol.ascii.AsciiOperationFactory",
      "net.spy.memcached.ops.MultiOperationCallback",
      "net.spy.memcached.ops.MultiGetsOperationCallback",
      "net.spy.memcached.ops.MultiGetOperationCallback",
      "net.spy.memcached.ops.MultiReplicaGetOperationCallback",
      "net.spy.memcached.protocol.ascii.OperationImpl",
      "net.spy.memcached.protocol.ascii.FlushOperationImpl",
      "net.spy.memcached.protocol.ascii.OperationReadType",
      "net.spy.memcached.protocol.binary.ObserveOperationImpl"
    );
  }
}
