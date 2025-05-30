/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 08 21:13:20 GMT 2022
 */

package dev.codesoapbox.dummy4j.dummies;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LoremDummy_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "dev.codesoapbox.dummy4j.dummies.LoremDummy"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LoremDummy_ESTest_scaffolding.class.getClassLoader() ,
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.InternationalStandardNumberFactory",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.serialnumber.IssnFactory",
      "dev.codesoapbox.dummy4j.definitions.DefaultUniqueValues",
      "dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.LuhnFormula",
      "dev.codesoapbox.dummy4j.dummies.finance.FinanceBuilderFactory",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.booknumber.IsbnValidator",
      "dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModTenFormula",
      "dev.codesoapbox.dummy4j.dummies.ScifiDummy",
      "dev.codesoapbox.dummy4j.definitions.UniqueValues",
      "dev.codesoapbox.dummy4j.exceptions.InvalidIsbnParameterException",
      "dev.codesoapbox.dummy4j.Dummy4j",
      "dev.codesoapbox.dummy4j.dummies.BookDummy",
      "dev.codesoapbox.dummy4j.convenience.ConvenienceMethods",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.SsccFactory",
      "dev.codesoapbox.dummy4j.dummies.DateAndTimeDummy",
      "dev.codesoapbox.dummy4j.dummies.internet.InternetDummy",
      "dev.codesoapbox.dummy4j.exceptions.UniqueValueRetryLimitExceededException",
      "dev.codesoapbox.dummy4j.dummies.NumeralsDummy",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.Gtin14Builder",
      "dev.codesoapbox.dummy4j.NumberService",
      "dev.codesoapbox.dummy4j.dummies.NameDummy",
      "dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy",
      "dev.codesoapbox.dummy4j.definitions.providers.DefinitionProvider",
      "dev.codesoapbox.dummy4j.exceptions.InvalidIsmnParameterException",
      "dev.codesoapbox.dummy4j.dummies.address.AddressDummy",
      "dev.codesoapbox.dummy4j.dummies.LoremDummy",
      "dev.codesoapbox.dummy4j.dummies.NationDummy",
      "dev.codesoapbox.dummy4j.dummies.EducationDummy",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.DeviceIdentifierFactory",
      "dev.codesoapbox.dummy4j.RandomService",
      "dev.codesoapbox.dummy4j.dummies.identifier.IdentifierDummy",
      "dev.codesoapbox.dummy4j.ExpressionResolver",
      "dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModElevenFormula",
      "dev.codesoapbox.dummy4j.dummies.Dummies",
      "dev.codesoapbox.dummy4j.dummies.finance.IbanFormula",
      "dev.codesoapbox.dummy4j.dummies.ResearchPaperDummy",
      "dev.codesoapbox.dummy4j.dummies.business.BusinessDummy",
      "dev.codesoapbox.dummy4j.DefaultRandomService",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.musicnumber.IsmnValidator",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.InternationalNumberCheckDigitFormulaProvider",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.GtinWithGs1PrefixBuilder",
      "dev.codesoapbox.dummy4j.convenience.MethodFinder",
      "dev.codesoapbox.dummy4j.dummies.color.ColorDummy",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.UpcFactory",
      "dev.codesoapbox.dummy4j.dummies.finance.FinanceDummy",
      "dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModElevenDashTwoFormula",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.Gs1Dash128Factory",
      "dev.codesoapbox.dummy4j.dummies.MedicalDummy",
      "dev.codesoapbox.dummy4j.convenience.MethodPathLoader",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.namenumber.BasicIsniProvider"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LoremDummy_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "dev.codesoapbox.dummy4j.dummies.LoremDummy",
      "dev.codesoapbox.dummy4j.Dummy4j",
      "dev.codesoapbox.dummy4j.DefaultRandomService",
      "dev.codesoapbox.dummy4j.definitions.providers.files.yaml.YamlFileDefinitionProvider",
      "dev.codesoapbox.dummy4j.definitions.DefaultUniqueValues",
      "dev.codesoapbox.dummy4j.convenience.ConvenienceMethods",
      "dev.codesoapbox.dummy4j.convenience.MethodFinder",
      "dev.codesoapbox.dummy4j.convenience.MethodPathLoader",
      "dev.codesoapbox.dummy4j.dummies.Dummies",
      "dev.codesoapbox.dummy4j.dummies.NameDummy",
      "dev.codesoapbox.dummy4j.dummies.NationDummy",
      "dev.codesoapbox.dummy4j.dummies.address.AddressDummy",
      "dev.codesoapbox.dummy4j.dummies.DateAndTimeDummy",
      "dev.codesoapbox.dummy4j.dummies.identifier.IdentifierDummy",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.InternationalStandardNumberFactory",
      "dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModTenFormula",
      "dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModElevenFormula",
      "dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModElevenDashTwoFormula",
      "dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.LuhnFormula",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.InternationalNumberCheckDigitFormulaProvider",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.serialnumber.IssnFactory",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.namenumber.BasicIsniProvider",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.UpcFactory",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.SsccFactory",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.GtinWithGs1PrefixBuilder",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.Gtin14Builder",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.articlenumber.Gs1Dash128Factory",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.DeviceIdentifierFactory",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.booknumber.IsbnValidator",
      "dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.musicnumber.IsmnValidator",
      "dev.codesoapbox.dummy4j.dummies.EducationDummy",
      "dev.codesoapbox.dummy4j.dummies.BookDummy",
      "dev.codesoapbox.dummy4j.dummies.ResearchPaperDummy",
      "dev.codesoapbox.dummy4j.dummies.ScifiDummy",
      "dev.codesoapbox.dummy4j.dummies.color.ColorDummy",
      "dev.codesoapbox.dummy4j.dummies.NumeralsDummy",
      "dev.codesoapbox.dummy4j.dummies.MedicalDummy",
      "dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy",
      "dev.codesoapbox.dummy4j.dummies.internet.InternetDummy",
      "dev.codesoapbox.dummy4j.dummies.finance.FinanceDummy",
      "dev.codesoapbox.dummy4j.dummies.finance.FinanceBuilderFactory",
      "dev.codesoapbox.dummy4j.dummies.finance.IbanFormula",
      "dev.codesoapbox.dummy4j.dummies.business.BusinessDummy",
      "dev.codesoapbox.dummy4j.DefaultExpressionResolver",
      "dev.codesoapbox.dummy4j.dummies.shared.string.StringValidator"
    );
  }
}
