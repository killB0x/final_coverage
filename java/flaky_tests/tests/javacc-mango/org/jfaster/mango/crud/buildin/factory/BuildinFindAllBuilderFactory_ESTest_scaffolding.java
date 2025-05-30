/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 05 16:04:00 GMT 2022
 */

package org.jfaster.mango.crud.buildin.factory;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BuildinFindAllBuilderFactory_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfaster.mango.crud.buildin.factory.BuildinFindAllBuilderFactory"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BuildinFindAllBuilderFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfaster.mango.util.reflect.TypeToken",
      "org.jfaster.mango.util.reflect.DynamicTokens$7",
      "org.jfaster.mango.util.reflect.Types$ParameterizedTypeImpl",
      "org.jfaster.mango.exception.MangoException",
      "org.jfaster.mango.crud.BuilderFactory",
      "org.jfaster.mango.util.local.LoadingCache",
      "org.jfaster.mango.util.reflect.TypeResolver$TypeTable",
      "org.jfaster.mango.util.local.CacheLoader",
      "org.jfaster.mango.util.reflect.TypeResolver",
      "org.jfaster.mango.util.local.DoubleCheckCache",
      "org.jfaster.mango.crud.buildin.factory.AbstractBuildinBuilderFactory",
      "org.jfaster.mango.crud.buildin.builder.BuildinGetAllBuilder",
      "org.jfaster.mango.util.reflect.TypeResolver$TypeTable$1",
      "org.jfaster.mango.crud.buildin.factory.BuildinFindAllBuilderFactory",
      "org.jfaster.mango.util.reflect.Types",
      "org.jfaster.mango.util.Objects",
      "org.jfaster.mango.crud.Builder",
      "org.jfaster.mango.util.Joiner$1",
      "org.jfaster.mango.util.bean.BeanUtil$1",
      "org.jfaster.mango.util.reflect.Types$ClassOwnership$1LocalClass",
      "org.jfaster.mango.util.reflect.TypeCapture",
      "org.jfaster.mango.util.bean.BeanUtil",
      "org.jfaster.mango.util.reflect.DynamicTokens",
      "org.jfaster.mango.crud.CrudMeta",
      "org.jfaster.mango.util.reflect.TypeToken$SimpleTypeToken",
      "org.jfaster.mango.util.reflect.Types$ClassOwnership$3",
      "org.jfaster.mango.util.reflect.Types$ClassOwnership$2",
      "org.jfaster.mango.util.reflect.Types$ClassOwnership",
      "org.jfaster.mango.crud.buildin.builder.AbstractBuildinBuilder",
      "org.jfaster.mango.util.reflect.TypeResolver$TypeVariableKey",
      "org.jfaster.mango.util.reflect.TypeParameter",
      "org.jfaster.mango.util.reflect.Types$ClassOwnership$1",
      "org.jfaster.mango.util.Joiner",
      "org.jfaster.mango.descriptor.MethodDescriptor",
      "org.jfaster.mango.util.reflect.Types$JavaVersion$3",
      "org.jfaster.mango.util.reflect.DynamicTokens$1",
      "org.jfaster.mango.util.reflect.Types$JavaVersion$1",
      "org.jfaster.mango.util.reflect.Types$JavaVersion$2",
      "org.jfaster.mango.util.reflect.DynamicTokens$3",
      "org.jfaster.mango.util.reflect.Types$JavaVersion",
      "org.jfaster.mango.util.reflect.DynamicTokens$4",
      "org.jfaster.mango.util.reflect.DynamicTokens$5",
      "org.jfaster.mango.exception.UncheckedException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BuildinFindAllBuilderFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfaster.mango.crud.BuilderFactory",
      "org.jfaster.mango.crud.buildin.factory.AbstractBuildinBuilderFactory",
      "org.jfaster.mango.crud.buildin.factory.BuildinFindAllBuilderFactory",
      "org.jfaster.mango.crud.CrudMeta",
      "org.jfaster.mango.util.local.DoubleCheckCache",
      "org.jfaster.mango.util.bean.BeanUtil$1",
      "org.jfaster.mango.util.bean.BeanUtil",
      "org.jfaster.mango.crud.buildin.builder.AbstractBuildinBuilder",
      "org.jfaster.mango.crud.buildin.builder.BuildinGetAllBuilder",
      "org.jfaster.mango.util.reflect.TypeCapture",
      "org.jfaster.mango.util.reflect.TypeToken",
      "org.jfaster.mango.util.reflect.TypeToken$SimpleTypeToken",
      "org.jfaster.mango.util.reflect.DynamicTokens",
      "org.jfaster.mango.util.reflect.DynamicTokens$4",
      "org.jfaster.mango.util.reflect.TypeParameter",
      "org.jfaster.mango.util.reflect.DynamicTokens$3",
      "org.jfaster.mango.util.reflect.TypeResolver$TypeVariableKey",
      "org.jfaster.mango.util.Objects",
      "org.jfaster.mango.util.reflect.TypeResolver",
      "org.jfaster.mango.util.reflect.TypeResolver$TypeTable",
      "org.jfaster.mango.util.reflect.TypeResolver$TypeTable$1",
      "org.jfaster.mango.util.Joiner",
      "org.jfaster.mango.util.Joiner$1",
      "org.jfaster.mango.util.reflect.Types",
      "org.jfaster.mango.util.reflect.Types$ParameterizedTypeImpl",
      "org.jfaster.mango.util.reflect.Types$ClassOwnership$1LocalClass",
      "org.jfaster.mango.util.reflect.Types$ClassOwnership$3",
      "org.jfaster.mango.util.reflect.Types$ClassOwnership",
      "org.jfaster.mango.util.reflect.Types$JavaVersion",
      "org.jfaster.mango.exception.MangoException",
      "org.jfaster.mango.exception.UncheckedException",
      "org.jfaster.mango.descriptor.TypeWithAnnotationDescriptor",
      "org.jfaster.mango.descriptor.ReturnDescriptor",
      "org.jfaster.mango.util.reflect.TypeVisitor",
      "org.jfaster.mango.util.reflect.TypeToken$1",
      "org.jfaster.mango.util.reflect.TypeWrapper",
      "org.jfaster.mango.util.reflect.TypeWrapper$1",
      "org.jfaster.mango.descriptor.ParameterDescriptor",
      "org.jfaster.mango.util.logging.Slf4JLoggerFactory",
      "org.jfaster.mango.util.logging.Slf4JLoggerFactory$1",
      "org.jfaster.mango.util.logging.AbstractInternalLogger",
      "org.jfaster.mango.util.logging.Slf4JLogger",
      "org.jfaster.mango.util.logging.InternalLoggerFactory",
      "org.jfaster.mango.descriptor.MethodDescriptor",
      "org.jfaster.mango.util.reflect.Types$TypeVariableImpl",
      "org.jfaster.mango.util.reflect.Types$TypeVariableInvocationHandler",
      "org.jfaster.mango.util.reflect.Reflection",
      "org.jfaster.mango.util.reflect.Types$NativeTypeVariableEquals",
      "org.jfaster.mango.exception.DescriptionException"
    );
  }
}
