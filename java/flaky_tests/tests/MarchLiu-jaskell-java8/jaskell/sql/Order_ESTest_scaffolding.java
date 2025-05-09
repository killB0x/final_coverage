/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 01 11:29:12 GMT 2022
 */

package jaskell.sql;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Order_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jaskell.sql.Order"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Order_ESTest_scaffolding.class.getClassLoader() ,
      "jaskell.sql.Count",
      "jaskell.sql.Order$By",
      "jaskell.script.Parameter",
      "jaskell.sql.Equal",
      "jaskell.sql.Query",
      "jaskell.sql.CouldAlias",
      "jaskell.sql.Having",
      "jaskell.sql.Order",
      "jaskell.sql.CouldFrom",
      "jaskell.sql.CouldOffset",
      "jaskell.sql.CouldJoin",
      "jaskell.sql.Alias",
      "jaskell.sql.CouldHaving",
      "jaskell.sql.Delete$Where",
      "jaskell.sql.CouldWhere",
      "jaskell.sql.Predicate$2",
      "jaskell.sql.CouldUnion",
      "jaskell.sql.Predicate$1",
      "jaskell.sql.Or",
      "jaskell.sql.By",
      "jaskell.sql.Query$1",
      "jaskell.sql.Returning",
      "jaskell.sql.Offset",
      "jaskell.sql.Inner",
      "jaskell.sql.LessOrEqual",
      "jaskell.sql.Left",
      "jaskell.sql.Where",
      "jaskell.sql.Union",
      "jaskell.sql.Right",
      "jaskell.sql.Full",
      "jaskell.sql.Binary",
      "jaskell.sql.Name",
      "jaskell.sql.Great",
      "jaskell.sql.GreateOrEqual",
      "jaskell.sql.Like",
      "jaskell.sql.And",
      "jaskell.sql.ThenSelect",
      "jaskell.sql.Delete",
      "jaskell.sql.Predicate",
      "jaskell.sql.CouldLimit",
      "jaskell.sql.Limit",
      "jaskell.sql.Cross",
      "jaskell.sql.CouldOrder",
      "jaskell.sql.Literal$Alias",
      "jaskell.sql.CouldGroup",
      "jaskell.sql.Less",
      "jaskell.sql.Group",
      "jaskell.sql.Statement$1",
      "jaskell.sql.IsNotNull",
      "jaskell.sql.IsNull",
      "jaskell.sql.From",
      "jaskell.sql.NotEqual",
      "jaskell.sql.Join",
      "jaskell.sql.Select$From",
      "jaskell.sql.Literal",
      "jaskell.sql.Statement",
      "jaskell.sql.Func",
      "jaskell.script.Directive"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Order_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jaskell.sql.Order",
      "jaskell.sql.Statement",
      "jaskell.sql.Query",
      "jaskell.sql.Select$From",
      "jaskell.sql.By",
      "jaskell.sql.Order$By",
      "jaskell.sql.Group$By",
      "jaskell.sql.Predicate",
      "jaskell.sql.Literal",
      "jaskell.sql.Count",
      "jaskell.sql.Name",
      "jaskell.sql.IsNull",
      "jaskell.sql.Where",
      "jaskell.sql.Delete$Where",
      "jaskell.sql.Select",
      "jaskell.sql.Binary",
      "jaskell.sql.GreateOrEqual",
      "jaskell.sql.Having",
      "jaskell.sql.Returning",
      "jaskell.sql.Delete",
      "jaskell.sql.And",
      "jaskell.sql.Alias",
      "jaskell.sql.Quot",
      "jaskell.sql.Limit",
      "jaskell.sql.Join$On",
      "jaskell.sql.Brackets",
      "jaskell.sql.With$CommonTableQuery",
      "jaskell.sql.Union",
      "jaskell.sql.Like",
      "jaskell.sql.Func",
      "jaskell.sql.Left",
      "jaskell.sql.Join",
      "jaskell.sql.Cross",
      "jaskell.sql.Less",
      "jaskell.sql.Not",
      "jaskell.sql.ThenSelect$Select",
      "jaskell.sql.NotEqual",
      "jaskell.sql.Offset",
      "jaskell.sql.Or",
      "jaskell.sql.With",
      "jaskell.sql.With$Recursive",
      "jaskell.sql.Exists",
      "jaskell.sql.LessOrEqual",
      "jaskell.sql.Query$1",
      "jaskell.sql.Sum",
      "jaskell.sql.Great",
      "jaskell.sql.Text",
      "jaskell.sql.Right",
      "jaskell.sql.Equal",
      "jaskell.sql.IsNotNull",
      "jaskell.sql.Full",
      "jaskell.sql.Inner",
      "jaskell.sql.Group",
      "jaskell.sql.With$Delete",
      "jaskell.sql.Predicate$1",
      "jaskell.sql.Literal$Alias",
      "jaskell.sql.Predicate$2",
      "jaskell.script.Parameter",
      "jaskell.sql.Update$Set",
      "jaskell.sql.Update$Equation",
      "jaskell.sql.Using",
      "jaskell.sql.Using$Where",
      "jaskell.sql.Union$All",
      "jaskell.sql.With$As",
      "jaskell.sql.Delete$From"
    );
  }
}
