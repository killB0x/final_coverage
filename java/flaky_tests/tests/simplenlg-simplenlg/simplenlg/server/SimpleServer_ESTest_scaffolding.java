/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 18 02:57:47 GMT 2022
 */

package simplenlg.server;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SimpleServer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "simplenlg.server.SimpleServer"; 
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
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimpleServer_ESTest_scaffolding.class.getClassLoader() ,
      "simplenlg.xmlrealiser.XMLRealiser$LexiconType",
      "simplenlg.framework.DocumentElement",
      "simplenlg.xmlrealiser.wrapper.RecordSet",
      "simplenlg.xmlrealiser.wrapper.XmlDocumentElement",
      "simplenlg.server.RealisationRequest",
      "simplenlg.server.SimpleServer",
      "simplenlg.xmlrealiser.wrapper.RequestType",
      "simplenlg.lexicon.Lexicon",
      "simplenlg.lexicon.NIHDBLexicon",
      "simplenlg.lexicon.XMLLexicon",
      "simplenlg.xmlrealiser.XMLRealiser",
      "simplenlg.framework.NLGElement",
      "simplenlg.xmlrealiser.XMLRealiserException",
      "simplenlg.xmlrealiser.wrapper.XmlNLGElement"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimpleServer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "simplenlg.server.SimpleServer",
      "simplenlg.xmlrealiser.XMLRealiser$LexiconType",
      "simplenlg.xmlrealiser.XMLRealiser",
      "simplenlg.lexicon.Lexicon",
      "simplenlg.lexicon.NIHDBLexicon",
      "simplenlg.server.RealisationRequest",
      "simplenlg.lexicon.XMLLexicon",
      "simplenlg.framework.NLGElement",
      "simplenlg.framework.WordElement",
      "simplenlg.framework.LexicalCategory",
      "simplenlg.features.Inflection",
      "simplenlg.framework.WordElement$InflectionSet",
      "simplenlg.lexicon.XMLLexicon$1",
      "simplenlg.xmlrealiser.wrapper.XmlNLGElement",
      "simplenlg.xmlrealiser.wrapper.XmlDocumentElement",
      "simplenlg.xmlrealiser.UnWrapper",
      "simplenlg.framework.NLGFactory",
      "simplenlg.framework.DocumentElement",
      "simplenlg.framework.DocumentCategory",
      "simplenlg.framework.NLGModule",
      "simplenlg.realiser.english.Realiser",
      "simplenlg.morphology.english.MorphologyProcessor",
      "simplenlg.orthography.english.OrthographyProcessor",
      "simplenlg.syntax.english.SyntaxProcessor",
      "simplenlg.format.english.NumberedPrefix",
      "simplenlg.format.english.TextFormatter",
      "simplenlg.orthography.english.OrthographyProcessor$1",
      "simplenlg.features.DiscourseFunction",
      "simplenlg.format.english.TextFormatter$1",
      "simplenlg.framework.StringElement",
      "simplenlg.framework.PhraseCategory",
      "simplenlg.xmlrealiser.XMLRealiserException"
    );
  }
}
