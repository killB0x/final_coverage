/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 10 10:44:29 GMT 2022
 */

package jetbrick.template.parser;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TypedKlassParser_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jetbrick.template.parser.TypedKlassParser"; 
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
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("user.dir", "/home/user"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TypedKlassParser_ESTest_scaffolding.class.getClassLoader() ,
      "jetbrick.template.JetContext",
      "jetbrick.template.runtime.JetPageContext",
      "jetbrick.template.parser.support.ClassUtils",
      "jetbrick.template.parser.TypedKlassParser",
      "jetbrick.template.utils.ClassLoaderUtils",
      "jetbrick.template.runtime.JetForStatus",
      "jetbrick.template.runtime.JetTags",
      "jetbrick.template.runtime.JetFunctions",
      "jetbrick.template.parser.SyntaxErrorException",
      "jetbrick.template.runtime.JetTagContext",
      "jetbrick.template.JetContextAware",
      "jetbrick.template.runtime.JetWriter",
      "jetbrick.template.utils.StringUtils",
      "jetbrick.template.runtime.JetMethods",
      "jetbrick.template.parser.VariableResolver",
      "jetbrick.template.parser.support.TypedKlass"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TypedKlassParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jetbrick.template.parser.TypedKlassParser",
      "jetbrick.template.parser.support.TypedKlass",
      "jetbrick.template.parser.VariableResolver",
      "jetbrick.template.utils.ClassLoaderUtils",
      "jetbrick.template.utils.StringUtils",
      "jetbrick.template.parser.SyntaxErrorException",
      "jetbrick.template.parser.support.MethodFinderUtils",
      "jetbrick.template.utils.ExceptionUtils",
      "jetbrick.template.parser.support.ClassUtils",
      "jetbrick.template.utils.finder.PackagesFinder",
      "jetbrick.template.utils.finder.FileFinder",
      "jetbrick.template.utils.finder.PackagesFinder$1",
      "jetbrick.template.utils.URLUtils",
      "jetbrick.template.parser.support.PrimitiveClassUtils"
    );
  }
}
