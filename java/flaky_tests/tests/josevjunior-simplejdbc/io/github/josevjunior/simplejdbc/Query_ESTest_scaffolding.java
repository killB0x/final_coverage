/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 19 21:40:12 GMT 2022
 */

package io.github.josevjunior.simplejdbc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Query_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "io.github.josevjunior.simplejdbc.Query"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Query_ESTest_scaffolding.class.getClassLoader() ,
      "io.github.josevjunior.simplejdbc.ArrayRowMapper",
      "io.github.josevjunior.simplejdbc.RowMapperInjector",
      "io.github.josevjunior.simplejdbc.JdbcUtils",
      "io.github.josevjunior.simplejdbc.RowMapper",
      "io.github.josevjunior.simplejdbc.UpdateBuilder",
      "io.github.josevjunior.simplejdbc.ColumnValueMapper",
      "io.github.josevjunior.simplejdbc.Query$ScrollableResultImpl",
      "io.github.josevjunior.simplejdbc.JdbcException",
      "io.github.josevjunior.simplejdbc.MapRowMapper",
      "io.github.josevjunior.simplejdbc.QueryCreator",
      "io.github.josevjunior.simplejdbc.InsertBuilder",
      "io.github.josevjunior.simplejdbc.ColumnValueMappers",
      "io.github.josevjunior.simplejdbc.NamedParameterSQL",
      "io.github.josevjunior.simplejdbc.ScrollableResult",
      "io.github.josevjunior.simplejdbc.Query"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.Connection", false, Query_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.sql.PreparedStatement", false, Query_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.sql.ResultSet", false, Query_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.sql.DataSource", false, Query_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Query_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.github.josevjunior.simplejdbc.Query",
      "io.github.josevjunior.simplejdbc.Query$ScrollableResultImpl",
      "io.github.josevjunior.simplejdbc.NamedParameterSQL",
      "io.github.josevjunior.simplejdbc.ColumnValueMappers",
      "io.github.josevjunior.simplejdbc.ArrayRowMapper",
      "io.github.josevjunior.simplejdbc.MapRowMapper",
      "io.github.josevjunior.simplejdbc.QueryCreator",
      "io.github.josevjunior.simplejdbc.ColumnValueMapper",
      "io.github.josevjunior.simplejdbc.JdbcException",
      "io.github.josevjunior.simplejdbc.JdbcUtils",
      "io.github.josevjunior.simplejdbc.UpdateBuilder",
      "io.github.josevjunior.simplejdbc.InsertBuilder"
    );
  }
}
