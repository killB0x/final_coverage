/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 03 16:28:26 GMT 2022
 */

package com.github.relayjdbc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class VirtualDatabaseMetaData_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.github.relayjdbc.VirtualDatabaseMetaData"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VirtualDatabaseMetaData_ESTest_scaffolding.class.getClassLoader() ,
      "com.github.relayjdbc.command.ConnectionContext",
      "com.github.relayjdbc.util.SQLExceptionHelper",
      "com.github.relayjdbc.VirtualDatabaseMetaData",
      "com.github.relayjdbc.parameters.PreparedStatementParameter",
      "com.github.relayjdbc.command.ResultSetProducerCommand",
      "com.github.relayjdbc.serial.SerialDatabaseMetaData",
      "com.github.relayjdbc.command.CommandPool",
      "com.github.relayjdbc.command.DatabaseMetaDataGetUserNameCommand",
      "com.github.relayjdbc.command.DecoratedCommandSink",
      "com.github.relayjdbc.command.Command",
      "com.github.relayjdbc.VirtualBase",
      "com.github.relayjdbc.command.PreparedStatementQueryCommand",
      "com.github.relayjdbc.serial.UIDEx"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VirtualDatabaseMetaData_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.github.relayjdbc.VirtualBase",
      "com.github.relayjdbc.VirtualDatabaseMetaData",
      "com.github.relayjdbc.command.DatabaseMetaDataGetUserNameCommand",
      "com.github.relayjdbc.serial.UIDEx",
      "com.github.relayjdbc.VirtualConnection",
      "com.github.relayjdbc.protocol.transport.http.HttpTransport",
      "com.github.relayjdbc.protocol.dataformat.kryo.KryoDataFormat",
      "com.github.relayjdbc.client.DefaultClient",
      "com.github.relayjdbc.command.NullCallingContextFactory",
      "com.github.relayjdbc.command.DecoratedCommandSink",
      "com.github.relayjdbc.serial.SerialDatabaseMetaData",
      "com.github.relayjdbc.command.StandardCallingContextFactory",
      "com.github.relayjdbc.command.CommandPool",
      "com.github.relayjdbc.serial.CallingContext",
      "com.github.relayjdbc.command.PreparedStatementQueryCommand",
      "com.github.relayjdbc.util.SQLExceptionHelper",
      "com.github.relayjdbc.command.StatementSetFetchSizeCommand",
      "com.github.relayjdbc.command.ConnectionCreateStatementCommand",
      "com.github.relayjdbc.command.ConnectionGetMetaDataCommand",
      "com.github.relayjdbc.serial.SerialSQLXML",
      "com.github.relayjdbc.command.StatementUpdateCommand",
      "com.github.relayjdbc.parameters.FloatParameter",
      "com.github.relayjdbc.parameters.ArrayParameter",
      "com.github.relayjdbc.parameters.NullParameter",
      "com.github.relayjdbc.parameters.ByteParameter",
      "com.github.relayjdbc.parameters.DoubleParameter",
      "com.github.relayjdbc.command.PreparedStatementUpdateCommand",
      "com.github.relayjdbc.command.ConnectionCommitCommand",
      "com.github.relayjdbc.parameters.ByteStreamParameter",
      "com.github.relayjdbc.parameters.DateParameter",
      "com.github.relayjdbc.protocol.transport.http.HttpTransportChannel",
      "com.github.relayjdbc.command.NextRowPacketCommand",
      "com.github.relayjdbc.parameters.TimestampParameter",
      "com.github.relayjdbc.parameters.BooleanParameter",
      "com.github.relayjdbc.parameters.URLParameter",
      "com.github.relayjdbc.serial.SerialRowId",
      "com.github.relayjdbc.parameters.RowIdParameter",
      "com.github.relayjdbc.parameters.ShortParameter",
      "com.github.relayjdbc.parameters.ObjectParameter",
      "com.github.relayjdbc.parameters.NStringParameter",
      "com.github.relayjdbc.parameters.BigDecimalParameter",
      "com.github.relayjdbc.serial.SerialArray",
      "com.github.relayjdbc.parameters.CharStreamParameter",
      "com.github.relayjdbc.parameters.SQLXMLParameter",
      "com.github.relayjdbc.parameters.TimeParameter",
      "com.github.relayjdbc.serial.StreamSerializer",
      "com.github.relayjdbc.parameters.IntegerParameter"
    );
  }
}
