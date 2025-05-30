/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 11 21:22:57 GMT 2022
 */

package org.gedcom4j.model.thirdpartyadapters;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractThirdPartyAdapter_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.gedcom4j.model.thirdpartyadapters.AbstractThirdPartyAdapter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractThirdPartyAdapter_ESTest_scaffolding.class.getClassLoader() ,
      "org.gedcom4j.model.IndividualEvent",
      "org.gedcom4j.model.Individual",
      "org.gedcom4j.model.AbstractAddressableElement",
      "org.gedcom4j.model.PersonalName",
      "org.gedcom4j.model.thirdpartyadapters.LegacyFamilyTree8Adapter",
      "org.gedcom4j.model.SubmitterReference",
      "org.gedcom4j.model.SubmissionReference",
      "org.gedcom4j.model.HasAddresses",
      "org.gedcom4j.model.SourceSystem",
      "org.gedcom4j.model.Gedcom",
      "org.gedcom4j.model.Repository",
      "org.gedcom4j.model.Address",
      "org.gedcom4j.model.FamilyEvent",
      "org.gedcom4j.model.ModelElement",
      "org.gedcom4j.model.Submitter",
      "org.gedcom4j.model.MultimediaReference",
      "org.gedcom4j.model.StringWithCustomFacts",
      "org.gedcom4j.model.thirdpartyadapters.LegacyFamilyTree8Adapter$AddressMailingList",
      "org.gedcom4j.model.enumerations.IndividualEventType",
      "org.gedcom4j.model.Family",
      "org.gedcom4j.model.FamilyChild",
      "org.gedcom4j.model.CustomFact",
      "org.gedcom4j.model.HasCustomFacts",
      "org.gedcom4j.model.Header",
      "org.gedcom4j.model.thirdpartyadapters.AbstractThirdPartyAdapter",
      "org.gedcom4j.model.RepositoryCitation",
      "org.gedcom4j.model.NoteRecord",
      "org.gedcom4j.model.SourceData",
      "org.gedcom4j.model.AbstractCitation",
      "org.gedcom4j.model.HasXref",
      "org.gedcom4j.model.enumerations.IndividualAttributeType",
      "org.gedcom4j.model.Submission",
      "org.gedcom4j.model.Place",
      "org.gedcom4j.model.Multimedia",
      "org.gedcom4j.model.IndividualReference",
      "org.gedcom4j.model.Trailer",
      "org.gedcom4j.model.CharacterSet",
      "org.gedcom4j.model.AbstractEvent",
      "org.gedcom4j.model.NoteStructure",
      "org.gedcom4j.Options",
      "org.gedcom4j.model.AbstractElement",
      "org.gedcom4j.model.HasNotes",
      "org.gedcom4j.model.AbstractNotesElement",
      "org.gedcom4j.model.enumerations.SupportedVersion",
      "org.gedcom4j.model.HasCitations",
      "org.gedcom4j.model.Source",
      "org.gedcom4j.model.ChangeDate",
      "org.gedcom4j.model.GedcomVersion",
      "org.gedcom4j.io.encoding.Encoding",
      "org.gedcom4j.exception.UnsupportedVersionException",
      "org.gedcom4j.model.MultiStringWithCustomFacts",
      "org.gedcom4j.model.thirdpartyadapters.FamilyTreeMaker3Adapter",
      "org.gedcom4j.model.thirdpartyadapters.FamilyHistorianAdapter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractThirdPartyAdapter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.gedcom4j.model.thirdpartyadapters.AbstractThirdPartyAdapter",
      "org.gedcom4j.model.thirdpartyadapters.FamilyTreeMaker3Adapter",
      "org.gedcom4j.model.AbstractElement",
      "org.gedcom4j.model.AbstractNotesElement",
      "org.gedcom4j.model.AbstractAddressableElement",
      "org.gedcom4j.model.Individual",
      "org.gedcom4j.Options",
      "org.gedcom4j.model.CustomFact",
      "org.gedcom4j.model.HeaderSourceData",
      "org.gedcom4j.model.StringWithCustomFacts",
      "org.gedcom4j.model.thirdpartyadapters.FamilyHistorianAdapter",
      "org.gedcom4j.model.AbstractEvent",
      "org.gedcom4j.model.IndividualAttribute",
      "org.gedcom4j.model.Submitter",
      "org.gedcom4j.model.Gedcom",
      "org.gedcom4j.model.Header",
      "org.gedcom4j.model.CharacterSet",
      "org.gedcom4j.io.encoding.Encoding",
      "org.gedcom4j.model.GedcomVersion",
      "org.gedcom4j.model.enumerations.SupportedVersion",
      "org.gedcom4j.model.SourceSystem",
      "org.gedcom4j.model.SubmitterReference",
      "org.gedcom4j.model.Submission",
      "org.gedcom4j.model.Trailer",
      "org.gedcom4j.model.thirdpartyadapters.LegacyFamilyTree8Adapter",
      "org.gedcom4j.model.IndividualEvent",
      "org.gedcom4j.model.Address",
      "org.gedcom4j.model.PersonalName",
      "org.gedcom4j.model.Multimedia",
      "org.gedcom4j.model.Family",
      "org.gedcom4j.model.Source",
      "org.gedcom4j.model.EventRecorded",
      "org.gedcom4j.model.AbstractCitation",
      "org.gedcom4j.model.CitationWithSource",
      "org.gedcom4j.model.FamilyChild",
      "org.gedcom4j.model.Repository",
      "org.gedcom4j.model.NoteStructure",
      "org.gedcom4j.model.MultiStringWithCustomFacts",
      "org.gedcom4j.model.FamilySpouse",
      "org.gedcom4j.model.FamilyEvent",
      "org.gedcom4j.model.AbstractLdsOrdinance",
      "org.gedcom4j.model.LdsIndividualOrdinance",
      "org.gedcom4j.model.NoteRecord",
      "org.gedcom4j.model.Place",
      "org.gedcom4j.model.IndividualReference",
      "org.gedcom4j.model.CitationWithoutSource",
      "org.gedcom4j.model.UserReference",
      "org.gedcom4j.model.AbstractNameVariation",
      "org.gedcom4j.model.PlaceNameVariation",
      "org.gedcom4j.model.ChangeDate",
      "org.gedcom4j.model.FileReference",
      "org.gedcom4j.model.MultimediaReference",
      "org.gedcom4j.model.PersonalNameVariation",
      "org.gedcom4j.model.RepositoryCitation",
      "org.gedcom4j.model.LdsSpouseSealing",
      "org.gedcom4j.model.CitationData",
      "org.gedcom4j.model.Corporation",
      "org.gedcom4j.model.FamilyReference",
      "org.gedcom4j.model.Association",
      "org.gedcom4j.model.SourceData",
      "org.gedcom4j.model.SourceCallNumber",
      "org.gedcom4j.model.SubmissionReference"
    );
  }
}
