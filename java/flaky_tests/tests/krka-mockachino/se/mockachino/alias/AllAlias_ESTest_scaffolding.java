/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 24 08:50:03 GMT 2022
 */

package se.mockachino.alias;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AllAlias_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "se.mockachino.alias.AllAlias"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AllAlias_ESTest_scaffolding.class.getClassLoader() ,
      "se.mockachino.Invocation",
      "se.mockachino.ProxyMetadata",
      "se.mockachino.VerifyableCallHandler",
      "se.mockachino.order.MockPoint",
      "se.mockachino.cleaner.StacktraceCleaner",
      "se.mockachino.exceptions.UsageError",
      "se.mockachino.invocationhandler.CollectionsHandler",
      "se.mockachino.alias.Alias",
      "se.mockachino.Mockachino",
      "se.mockachino.alias.AllAlias",
      "se.mockachino.exceptions.VerificationError",
      "se.mockachino.invocationhandler.DeepMockHandler",
      "se.mockachino.CallHandler",
      "se.mockachino.MethodCall",
      "se.mockachino.MockUtil",
      "se.mockachino.util.MockachinoMethod",
      "se.mockachino.matchers.MethodMatcher",
      "se.mockachino.matchers.matcher.Matcher",
      "se.mockachino.util.Formatting",
      "se.mockachino.invocationhandler.PrimitiveInvocationHandler",
      "se.mockachino.Invocation$1",
      "se.mockachino.util.PrimitiveList",
      "se.mockachino.cleaner.StacktraceCleaner$1",
      "se.mockachino.alias.AbstractAlias"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AllAlias_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "se.mockachino.alias.AbstractAlias",
      "se.mockachino.alias.AllAlias",
      "se.mockachino.invocationhandler.PrimitiveInvocationHandler",
      "se.mockachino.invocationhandler.CollectionsHandler",
      "se.mockachino.invocationhandler.DeepMockHandler",
      "se.mockachino.order.MockPoint",
      "se.mockachino.Mockachino",
      "se.mockachino.MockUtil",
      "se.mockachino.exceptions.UsageError",
      "se.mockachino.cleaner.StacktraceCleaner$1",
      "se.mockachino.cleaner.StacktraceCleaner",
      "se.mockachino.Invocation$1",
      "se.mockachino.Invocation",
      "se.mockachino.MethodCall",
      "se.mockachino.util.MockachinoMethod",
      "se.mockachino.util.Formatting",
      "se.mockachino.alias.IntersectionAlias",
      "se.mockachino.alias.DifferenceAlias",
      "se.mockachino.exceptions.VerificationError",
      "se.mockachino.alias.UnionAlias",
      "se.mockachino.verifier.BadUsageHandler",
      "se.mockachino.verifier.BadUsageBuilder",
      "se.mockachino.alias.SimpleAlias",
      "se.mockachino.util.PrimitiveList",
      "com.googlecode.gentyref.WildcardTypeImpl",
      "com.googlecode.gentyref.GenericTypeReflector",
      "com.googlecode.gentyref.VarMap"
    );
  }
}
