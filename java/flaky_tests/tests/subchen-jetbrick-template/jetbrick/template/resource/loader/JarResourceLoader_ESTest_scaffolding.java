/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 10 11:32:03 GMT 2022
 */

package jetbrick.template.resource.loader;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JarResourceLoader_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jetbrick.template.resource.loader.JarResourceLoader"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/user"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JarResourceLoader_ESTest_scaffolding.class.getClassLoader() ,
      "jetbrick.template.resource.Resource",
      "jetbrick.template.resource.loader.FileSystemResourceLoader",
      "jetbrick.template.utils.finder.FileFinder",
      "jetbrick.template.resource.SourceCodeResource",
      "jetbrick.template.JetSecurityManager",
      "jetbrick.template.parser.support.ClassUtils",
      "jetbrick.template.compiler.JavaCompiler",
      "jetbrick.template.JetEngine$ConcurrentResourceCache",
      "jetbrick.template.runtime.JetTags",
      "jetbrick.template.JetGlobalVariables",
      "jetbrick.template.resource.JarResource",
      "jetbrick.template.utils.PathUtils",
      "jetbrick.template.runtime.JetTagContext",
      "jetbrick.template.JetContextAware",
      "jetbrick.template.utils.ConfigSupport",
      "jetbrick.template.resource.loader.JarResourceLoader",
      "jetbrick.template.JetConfig",
      "jetbrick.template.utils.finder.FileFinder$FileEntry",
      "jetbrick.template.utils.IoUtils",
      "jetbrick.template.runtime.JetMethods",
      "jetbrick.template.parser.VariableResolver",
      "jetbrick.template.resource.FileSystemResource",
      "jetbrick.template.utils.WordUtils",
      "jetbrick.template.JetEngine",
      "jetbrick.template.utils.finder.TemplateFileFinder",
      "jetbrick.template.compiler.JdkCompiler",
      "jetbrick.template.runtime.JetPageContext",
      "jetbrick.template.JetTemplate",
      "jetbrick.template.utils.ExceptionUtils",
      "jetbrick.template.utils.ConcurrentCache",
      "jetbrick.template.utils.ClassLoaderUtils",
      "jetbrick.template.runtime.JetFunctions",
      "jetbrick.template.resource.loader.ResourceLoader",
      "jetbrick.template.ResourceNotFoundException",
      "jetbrick.template.JetEngine$1",
      "jetbrick.template.JetEngine$ConcurrentTemplateCache",
      "jetbrick.template.utils.StringUtils",
      "jetbrick.template.utils.URLUtils",
      "jetbrick.template.utils.Version",
      "jetbrick.template.JetConfig$CompileStrategy",
      "jetbrick.template.compiler.JetTemplateClassLoader"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JarResourceLoader_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jetbrick.template.resource.loader.JarResourceLoader",
      "jetbrick.template.utils.PathUtils",
      "jetbrick.template.utils.finder.FileFinder",
      "jetbrick.template.utils.finder.TemplateFileFinder",
      "jetbrick.template.utils.IoUtils",
      "jetbrick.template.utils.Version",
      "jetbrick.template.JetEngine",
      "jetbrick.template.utils.ConfigSupport",
      "jetbrick.template.JetConfig",
      "jetbrick.template.parser.support.ClassUtils",
      "jetbrick.template.utils.ClassLoaderUtils",
      "jetbrick.template.utils.StringUtils",
      "jetbrick.template.utils.WordUtils",
      "jetbrick.template.JetConfig$CompileStrategy",
      "jetbrick.template.parser.VariableResolver",
      "jetbrick.template.resource.loader.FileSystemResourceLoader",
      "jetbrick.template.compiler.JetTemplateClassLoader",
      "jetbrick.template.utils.URLUtils",
      "jetbrick.template.utils.ConcurrentCache",
      "jetbrick.template.JetEngine$ConcurrentResourceCache",
      "jetbrick.template.JetEngine$ConcurrentTemplateCache",
      "jetbrick.template.resource.Resource",
      "jetbrick.template.resource.JarResource",
      "jetbrick.template.resource.SourceCodeResource",
      "jetbrick.template.utils.ConcurrentCache$VolatileReference",
      "jetbrick.template.ResourceNotFoundException",
      "jetbrick.template.utils.ExceptionUtils",
      "jetbrick.template.resource.FileSystemResource"
    );
  }
}
