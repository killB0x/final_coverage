/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 24 14:12:08 GMT 2022
 */

package ognl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class NoSuchPropertyException_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "ognl.NoSuchPropertyException"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NoSuchPropertyException_ESTest_scaffolding.class.getClassLoader() ,
      "ognl.MemberAccess",
      "ognl.enhance.LocalReference",
      "ognl.DefaultTypeConverter",
      "ognl.Node",
      "ognl.DefaultClassResolver",
      "ognl.ClassResolver",
      "ognl.TypeConverter",
      "ognl.Evaluation",
      "ognl.OgnlException",
      "ognl.OgnlContext",
      "ognl.NoSuchPropertyException",
      "ognl.JavaSource"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("ognl.MemberAccess", false, NoSuchPropertyException_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NoSuchPropertyException_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "ognl.OgnlException",
      "ognl.NoSuchPropertyException",
      "ognl.DefaultClassResolver",
      "ognl.DefaultTypeConverter",
      "ognl.OgnlContext",
      "ognl.OgnlParser$LookaheadSuccess",
      "ognl.OgnlParser",
      "ognl.SimpleNode",
      "ognl.ASTProperty",
      "ognl.OgnlOps",
      "ognl.ExpressionNode",
      "ognl.BooleanExpression",
      "ognl.ComparisonExpression",
      "ognl.ASTLessEq",
      "ognl.Evaluation",
      "ognl.OgnlParserTreeConstants",
      "ognl.NumericExpression",
      "ognl.ASTNegate",
      "ognl.JavaCharStream",
      "ognl.OgnlParserTokenManager",
      "ognl.ASTProject",
      "ognl.ASTSelectLast",
      "ognl.ASTNotIn",
      "ognl.ASTShiftLeft",
      "ognl.ASTOr",
      "ognl.ASTShiftRight",
      "ognl.ASTList",
      "ognl.ASTRemainder",
      "ognl.ASTSelectFirst",
      "ognl.ASTEval",
      "ognl.enhance.OgnlLocalReference",
      "ognl.ASTChain",
      "ognl.ASTIn",
      "ognl.ASTSequence",
      "ognl.ASTTest",
      "ognl.ASTUnsignedShiftRight",
      "ognl.ASTXor",
      "ognl.ASTConst",
      "ognl.ASTInstanceof",
      "ognl.ASTLess",
      "ognl.ASTStaticField",
      "ognl.ASTMap",
      "ognl.ASTKeyValue",
      "ognl.ASTMultiply",
      "ognl.ASTNotEq",
      "ognl.ASTMethod"
    );
  }
}
