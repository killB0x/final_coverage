/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 01 12:13:55 GMT 2022
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
public class Having_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jaskell.sql.Having"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Having_ESTest_scaffolding.class.getClassLoader() ,
      "jaskell.sql.Count",
      "jaskell.script.Parameter",
      "jaskell.sql.Order$By",
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
      "jaskell.sql.Query$1",
      "jaskell.sql.By",
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
      "jaskell.sql.Quot",
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
      "jaskell.sql.With$As",
      "jaskell.sql.IsNotNull",
      "jaskell.sql.IsNull",
      "jaskell.sql.From",
      "jaskell.sql.NotEqual",
      "jaskell.sql.Join",
      "jaskell.sql.Select",
      "jaskell.sql.Select$From",
      "jaskell.sql.Literal",
      "jaskell.sql.With",
      "jaskell.sql.Statement",
      "jaskell.sql.Func",
      "jaskell.sql.ThenSelect$Select",
      "jaskell.script.Directive"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Having_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jaskell.sql.Statement",
      "jaskell.sql.Query",
      "jaskell.sql.Having",
      "jaskell.sql.Predicate",
      "jaskell.sql.Literal",
      "jaskell.sql.Name",
      "jaskell.sql.Select",
      "jaskell.sql.Where",
      "jaskell.sql.Delete$Where",
      "jaskell.sql.Union",
      "jaskell.sql.ThenSelect$Select",
      "jaskell.sql.Func",
      "jaskell.sql.Select$From",
      "jaskell.sql.By",
      "jaskell.sql.Order$By",
      "jaskell.sql.Binary",
      "jaskell.sql.Equal",
      "jaskell.sql.Or",
      "jaskell.sql.Count",
      "jaskell.sql.Like",
      "jaskell.sql.IsNotNull",
      "jaskell.sql.Offset",
      "jaskell.sql.LessOrEqual",
      "jaskell.sql.With",
      "jaskell.sql.Order",
      "jaskell.sql.IsNull",
      "jaskell.sql.Limit",
      "jaskell.sql.Not",
      "jaskell.sql.Full",
      "jaskell.sql.NotEqual",
      "jaskell.sql.Right",
      "jaskell.sql.Great",
      "jaskell.sql.Returning",
      "jaskell.sql.Quot",
      "jaskell.sql.With$Recursive",
      "jaskell.sql.And",
      "jaskell.sql.Join$On",
      "jaskell.sql.Join",
      "jaskell.sql.GreateOrEqual",
      "jaskell.script.Parameter",
      "jaskell.sql.Less",
      "jaskell.sql.Alias",
      "jaskell.sql.Literal$Alias",
      "jaskell.sql.Cross",
      "jaskell.sql.Query$1",
      "jaskell.sql.Predicate$2",
      "jaskell.sql.Predicate$1",
      "jaskell.sql.With$CommonTableQuery",
      "jaskell.sql.Brackets",
      "jaskell.sql.Left",
      "jaskell.sql.Group$By",
      "jaskell.sql.Sum",
      "jaskell.sql.Delete",
      "jaskell.sql.Exists",
      "jaskell.sql.Union$All",
      "jaskell.sql.Text",
      "jaskell.sql.Update$Set",
      "jaskell.sql.Update$Equation",
      "jaskell.sql.Inner",
      "jaskell.sql.Using$Where",
      "jaskell.sql.Group",
      "jaskell.sql.With$Delete",
      "jaskell.sql.Using",
      "jaskell.sql.Delete$From",
      "jaskell.sql.With$As"
    );
  }
}
