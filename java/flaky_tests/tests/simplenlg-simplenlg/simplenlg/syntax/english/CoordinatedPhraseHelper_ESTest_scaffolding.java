/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 18 02:33:18 GMT 2022
 */

package simplenlg.syntax.english;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CoordinatedPhraseHelper_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "simplenlg.syntax.english.CoordinatedPhraseHelper"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CoordinatedPhraseHelper_ESTest_scaffolding.class.getClassLoader() ,
      "simplenlg.syntax.english.CoordinatedPhraseHelper",
      "simplenlg.features.NumberAgreement",
      "simplenlg.features.ClauseStatus",
      "simplenlg.framework.DocumentElement",
      "simplenlg.framework.ListElement",
      "simplenlg.features.InterrogativeType",
      "simplenlg.phrasespec.SPhraseSpec",
      "simplenlg.phrasespec.AdjPhraseSpec",
      "simplenlg.lexicon.Lexicon",
      "simplenlg.features.Tense",
      "simplenlg.framework.ElementCategory",
      "simplenlg.features.Person",
      "simplenlg.framework.NLGModule",
      "simplenlg.features.Form",
      "simplenlg.framework.StringElement",
      "simplenlg.syntax.english.PhraseHelper",
      "simplenlg.phrasespec.NPPhraseSpec",
      "simplenlg.framework.NLGFactory",
      "simplenlg.features.Gender",
      "simplenlg.features.Inflection",
      "simplenlg.framework.InflectedWordElement",
      "simplenlg.framework.PhraseCategory",
      "simplenlg.syntax.english.ClauseHelper",
      "simplenlg.lexicon.MultipleLexicon",
      "simplenlg.phrasespec.VPPhraseSpec",
      "simplenlg.framework.PhraseElement",
      "simplenlg.framework.DocumentCategory",
      "simplenlg.framework.CoordinatedPhraseElement",
      "simplenlg.features.DiscourseFunction",
      "simplenlg.framework.LexicalCategory",
      "simplenlg.framework.WordElement",
      "simplenlg.lexicon.XMLLexicon",
      "simplenlg.syntax.english.SyntaxProcessor",
      "simplenlg.phrasespec.AdvPhraseSpec",
      "simplenlg.syntax.english.SyntaxProcessor$1",
      "simplenlg.phrasespec.PPPhraseSpec",
      "simplenlg.framework.NLGElement",
      "simplenlg.syntax.english.NounPhraseHelper",
      "simplenlg.syntax.english.VerbPhraseHelper"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CoordinatedPhraseHelper_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "simplenlg.syntax.english.CoordinatedPhraseHelper",
      "simplenlg.features.DiscourseFunction",
      "simplenlg.framework.PhraseCategory",
      "simplenlg.framework.LexicalCategory",
      "simplenlg.framework.NLGModule",
      "simplenlg.syntax.english.SyntaxProcessor",
      "simplenlg.framework.NLGFactory",
      "simplenlg.framework.NLGElement",
      "simplenlg.framework.CoordinatedPhraseElement",
      "simplenlg.framework.ListElement",
      "simplenlg.syntax.english.PhraseHelper",
      "simplenlg.features.Tense",
      "simplenlg.lexicon.Lexicon",
      "simplenlg.lexicon.XMLLexicon",
      "simplenlg.framework.WordElement",
      "simplenlg.features.Inflection",
      "simplenlg.framework.WordElement$InflectionSet",
      "simplenlg.lexicon.XMLLexicon$1",
      "simplenlg.framework.PhraseElement",
      "simplenlg.phrasespec.SPhraseSpec",
      "simplenlg.phrasespec.VPPhraseSpec",
      "simplenlg.features.Person",
      "simplenlg.features.NumberAgreement",
      "simplenlg.features.Form",
      "simplenlg.features.ClauseStatus",
      "simplenlg.lexicon.MultipleLexicon",
      "simplenlg.framework.InflectedWordElement",
      "simplenlg.phrasespec.AdjPhraseSpec",
      "simplenlg.framework.DocumentElement",
      "simplenlg.framework.DocumentCategory",
      "simplenlg.syntax.english.SyntaxProcessor$1",
      "simplenlg.phrasespec.PPPhraseSpec",
      "simplenlg.lexicon.NIHDBLexicon",
      "simplenlg.phrasespec.NPPhraseSpec",
      "simplenlg.phrasespec.AdvPhraseSpec",
      "simplenlg.framework.DocumentCategory$1",
      "simplenlg.features.Gender",
      "simplenlg.framework.StringElement",
      "simplenlg.syntax.english.VerbPhraseHelper",
      "simplenlg.features.InterrogativeType",
      "simplenlg.framework.PhraseElement$1",
      "simplenlg.syntax.english.NounPhraseHelper",
      "simplenlg.syntax.english.ClauseHelper"
    );
  }
}
