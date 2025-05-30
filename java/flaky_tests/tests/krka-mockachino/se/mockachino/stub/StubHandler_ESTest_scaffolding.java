/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 24 08:53:52 GMT 2022
 */

package se.mockachino.stub;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class StubHandler_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "se.mockachino.stub.StubHandler"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StubHandler_ESTest_scaffolding.class.getClassLoader() ,
      "se.mockachino.verifier.BadUsageBuilder",
      "se.mockachino.matchers.matcher.BasicMatcher",
      "se.mockachino.VerifyableCallHandler",
      "com.googlecode.gentyref.WildcardTypeImpl",
      "se.mockachino.stub.MethodStubs",
      "se.mockachino.exceptions.UsageError",
      "se.mockachino.stub.StubHandler",
      "se.mockachino.matchers.MatcherThreadHandler",
      "se.mockachino.util.SafeIteratorList",
      "se.mockachino.CallHandler",
      "se.mockachino.MethodCall",
      "se.mockachino.util.MockachinoMethod",
      "com.googlecode.gentyref.VarMap",
      "se.mockachino.matchers.matcher.Matcher",
      "se.mockachino.util.PrimitiveList",
      "se.mockachino.Invocation",
      "se.mockachino.Primitives",
      "se.mockachino.matchers.MethodMatcherImpl",
      "com.googlecode.gentyref.GenericTypeReflector",
      "se.mockachino.invocationhandler.AbstractInvocationHandler",
      "se.mockachino.order.MockPoint",
      "se.mockachino.matchers.matcher.AnyMatcher",
      "com.googlecode.gentyref.UnresolvedTypeVariableException",
      "se.mockachino.verifier.BadUsageHandler",
      "se.mockachino.stub.MethodStub",
      "se.mockachino.matchers.matcher.EqualityMatcher",
      "se.mockachino.VerifyableCallHandlerWrapper",
      "se.mockachino.matchers.MatcherThreadHandler$1",
      "se.mockachino.matchers.MatchersBase",
      "se.mockachino.MockData",
      "se.mockachino.verifier.MatchingHandler",
      "se.mockachino.matchers.MethodMatcher",
      "se.mockachino.Invocation$1",
      "se.mockachino.proxy.ProxyUtil"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("se.mockachino.CallHandler", false, StubHandler_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StubHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "se.mockachino.invocationhandler.AbstractInvocationHandler",
      "se.mockachino.verifier.MatchingHandler",
      "se.mockachino.verifier.BadUsageHandler",
      "se.mockachino.verifier.BadUsageBuilder",
      "se.mockachino.stub.StubHandler",
      "se.mockachino.VerifyableCallHandlerWrapper",
      "se.mockachino.MockData",
      "se.mockachino.util.SafeIteratorList",
      "se.mockachino.Invocation$1",
      "se.mockachino.Invocation",
      "se.mockachino.util.MockachinoMethod",
      "se.mockachino.stub.MethodStubs",
      "se.mockachino.matchers.MethodMatcherImpl",
      "se.mockachino.MethodCall",
      "se.mockachino.matchers.MatcherThreadHandler$1",
      "se.mockachino.matchers.MatcherThreadHandler",
      "se.mockachino.matchers.matcher.BasicMatcher",
      "se.mockachino.matchers.matcher.EqualityMatcher",
      "se.mockachino.util.PrimitiveList",
      "se.mockachino.stub.MethodStub",
      "com.googlecode.gentyref.WildcardTypeImpl",
      "com.googlecode.gentyref.GenericTypeReflector",
      "com.googlecode.gentyref.VarMap",
      "se.mockachino.proxy.ProxyUtil",
      "se.mockachino.Primitives",
      "se.mockachino.MockUtil",
      "se.mockachino.matchers.MatchersBase",
      "se.mockachino.matchers.matcher.AnyMatcher",
      "se.mockachino.order.MockPoint",
      "se.mockachino.order.MockPointIterable",
      "se.mockachino.util.Formatting"
    );
  }
}
