/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Nov 02 08:50:19 GMT 2022
 */

package it.unitn.disi.smatch.data.mappings;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class HashMapping_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "it.unitn.disi.smatch.data.mappings.HashMapping"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HashMapping_ESTest_scaffolding.class.getClassLoader() ,
      "it.unitn.disi.common.DISIException",
      "it.unitn.disi.common.components.IConfigurable",
      "it.unitn.disi.smatch.data.trees.IContext",
      "it.unitn.disi.smatch.data.trees.INodeData",
      "it.unitn.disi.smatch.data.trees.ITreeStructureChangedListener",
      "it.unitn.disi.smatch.data.mappings.MappingElement",
      "it.unitn.disi.common.components.Configurable",
      "it.unitn.disi.smatch.data.mappings.HashMapping$Itr",
      "it.unitn.disi.smatch.data.matrices.IndexedObject",
      "it.unitn.disi.smatch.data.trees.Context",
      "it.unitn.disi.smatch.data.trees.BaseContext",
      "it.unitn.disi.smatch.data.mappings.HashMapping",
      "it.unitn.disi.smatch.data.trees.IBaseTreeStructureChangedListener",
      "it.unitn.disi.smatch.data.mappings.IMapping",
      "it.unitn.disi.smatch.data.mappings.IContextMapping",
      "it.unitn.disi.smatch.data.trees.Node",
      "it.unitn.disi.smatch.data.mappings.IMappingElement",
      "it.unitn.disi.smatch.data.ling.IAtomicConceptOfLabel",
      "it.unitn.disi.smatch.data.trees.BaseNode$1",
      "it.unitn.disi.smatch.data.trees.IBaseContext",
      "it.unitn.disi.smatch.data.trees.IBaseNodeData",
      "it.unitn.disi.smatch.data.trees.BaseNode",
      "it.unitn.disi.smatch.data.trees.INode",
      "it.unitn.disi.smatch.data.trees.IBaseNode",
      "it.unitn.disi.smatch.data.matrices.IIndexedObject",
      "it.unitn.disi.smatch.data.mappings.BaseMapping",
      "it.unitn.disi.smatch.data.mappings.IMappingFactory",
      "it.unitn.disi.common.components.ConfigurableException",
      "it.unitn.disi.smatch.data.mappings.HashMapping$NodePair"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HashMapping_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "it.unitn.disi.smatch.data.mappings.BaseMapping",
      "it.unitn.disi.smatch.data.mappings.HashMapping",
      "it.unitn.disi.smatch.data.mappings.HashMapping$NodePair",
      "it.unitn.disi.smatch.data.mappings.HashMapping$Itr",
      "it.unitn.disi.smatch.data.matrices.IndexedObject",
      "it.unitn.disi.smatch.data.trees.BaseNode$1",
      "it.unitn.disi.smatch.data.trees.BaseNode",
      "it.unitn.disi.smatch.data.trees.Node",
      "it.unitn.disi.smatch.data.mappings.MappingElement",
      "it.unitn.disi.smatch.data.trees.BaseContext",
      "it.unitn.disi.smatch.data.trees.Context",
      "it.unitn.disi.smatch.data.trees.BaseNode$BreadthFirstSearch",
      "it.unitn.disi.smatch.data.ling.AtomicConceptOfLabel",
      "it.unitn.disi.smatch.data.trees.BaseNode$Ancestors",
      "it.unitn.disi.smatch.data.trees.StartIterator"
    );
  }
}
