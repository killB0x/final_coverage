/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 21 01:39:11 GMT 2022
 */

package org.jiuwo.fastel.parser;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ExpressionParser_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jiuwo.fastel.parser.ExpressionParser"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ExpressionParser_ESTest_scaffolding.class.getClassLoader() ,
      "org.jiuwo.fastel.contract.enums.ExpressionEnum$JsToken",
      "org.jiuwo.fastel.parser.ExpressionParser$1",
      "org.jiuwo.fastel.exception.FastElException",
      "org.jiuwo.fastel.util.ExecutableUtil",
      "org.jiuwo.fastel.util.CharUtil",
      "org.jiuwo.fastel.parser.CharConsumer",
      "org.jiuwo.fastel.contract.enums.ParserEnum$ParseStatus",
      "org.jiuwo.fastel.util.TreeUtil$1",
      "org.jiuwo.fastel.contract.ParserParam",
      "org.jiuwo.fastel.contract.enums.ExpressionEnum",
      "org.jiuwo.fastel.constant.map.MapParserStringConsumerConstant",
      "org.jiuwo.fastel.util.NumberUtil",
      "org.jiuwo.fastel.contract.enums.ExpressionEnum$Token",
      "org.jiuwo.fastel.util.TreeUtil",
      "org.jiuwo.fastel.contract.CharConsumerParam",
      "org.jiuwo.fastel.impl.ExpressionNode",
      "org.jiuwo.fastel.contract.enums.ParserEnum$CharEscape",
      "org.jiuwo.fastel.util.StringUtil",
      "org.jiuwo.fastel.Executable",
      "org.jiuwo.fastel.parser.AbstractParser",
      "org.jiuwo.fastel.parser.ExpressionParser"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ExpressionParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jiuwo.fastel.parser.AbstractParser",
      "org.jiuwo.fastel.impl.ExpressionNode",
      "org.jiuwo.fastel.contract.enums.ExpressionEnum$Token",
      "org.jiuwo.fastel.parser.ExpressionParser",
      "org.jiuwo.fastel.contract.enums.ParserEnum$ParseStatus",
      "org.jiuwo.fastel.util.TreeUtil$1",
      "org.jiuwo.fastel.parser.ExpressionParser$1",
      "org.jiuwo.fastel.constant.map.MapParserStringConsumerConstant",
      "org.jiuwo.fastel.contract.enums.ParserEnum$CharEscape",
      "org.jiuwo.fastel.exception.FastElException",
      "org.jiuwo.fastel.util.TreeUtil",
      "org.jiuwo.fastel.util.CharUtil",
      "org.jiuwo.fastel.util.StringUtil",
      "org.jiuwo.fastel.util.ExecutableUtil",
      "org.jiuwo.fastel.parser.CharConsumer",
      "org.jiuwo.fastel.contract.CharConsumerParam",
      "org.jiuwo.fastel.contract.ParserParam",
      "org.jiuwo.fastel.util.NumberUtil"
    );
  }
}
