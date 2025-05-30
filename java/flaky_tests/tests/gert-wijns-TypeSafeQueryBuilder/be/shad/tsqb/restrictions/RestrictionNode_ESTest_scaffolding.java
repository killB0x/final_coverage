/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 20 23:49:32 GMT 2022
 */

package be.shad.tsqb.restrictions;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RestrictionNode_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "be.shad.tsqb.restrictions.RestrictionNode"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RestrictionNode_ESTest_scaffolding.class.getClassLoader() ,
      "be.shad.tsqb.restrictions.RestrictionsGroupBuilder",
      "be.shad.tsqb.values.HqlQueryValueImpl",
      "be.shad.tsqb.restrictions.OnGoingBooleanRestriction",
      "be.shad.tsqb.restrictions.OnGoingNumberRestriction",
      "be.shad.tsqb.restrictions.RestrictionsGroup$RestrictionsGroupBracketsPolicy",
      "be.shad.tsqb.values.TypeSafeValue",
      "be.shad.tsqb.restrictions.OnGoingTextRestriction",
      "be.shad.tsqb.restrictions.OnGoingDateRestriction",
      "be.shad.tsqb.values.HqlQueryValueBuilder",
      "be.shad.tsqb.query.copy.CopyContext",
      "be.shad.tsqb.query.TypeSafeSubQuery",
      "be.shad.tsqb.restrictions.RestrictionsGroup",
      "be.shad.tsqb.restrictions.RestrictionsGroupImpl",
      "be.shad.tsqb.query.TypeSafeBaseQuery",
      "be.shad.tsqb.data.TypeSafeQueryProxyData",
      "be.shad.tsqb.restrictions.RestrictionNodeType",
      "be.shad.tsqb.restrictions.RestrictionHolder",
      "be.shad.tsqb.restrictions.OnGoingLocalDateRestriction",
      "be.shad.tsqb.query.TypeSafeQueryInternal",
      "be.shad.tsqb.restrictions.WhereRestrictions",
      "be.shad.tsqb.restrictions.Restriction",
      "be.shad.tsqb.restrictions.ContinuedRestrictionChainable",
      "be.shad.tsqb.restrictions.OnGoingRestriction",
      "be.shad.tsqb.query.TypeSafeQueryJoin",
      "be.shad.tsqb.values.HqlQueryBuilderParams",
      "be.shad.tsqb.values.HqlQueryValue",
      "be.shad.tsqb.restrictions.OnGoingEnumRestriction",
      "be.shad.tsqb.restrictions.HavingRestrictions",
      "be.shad.tsqb.exceptions.EqualsNotAllowedException",
      "be.shad.tsqb.query.copy.Copyable",
      "be.shad.tsqb.restrictions.OnGoingObjectRestriction",
      "be.shad.tsqb.restrictions.RestrictionNode",
      "be.shad.tsqb.restrictions.RestrictionChainableImpl",
      "be.shad.tsqb.restrictions.RestrictionChainable",
      "be.shad.tsqb.restrictions.RestrictionsGroupInternal",
      "be.shad.tsqb.query.TypeSafeQuery",
      "be.shad.tsqb.restrictions.RestrictionAndChainable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RestrictionNode_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "be.shad.tsqb.restrictions.RestrictionNode",
      "be.shad.tsqb.query.copy.CopyContext",
      "be.shad.tsqb.restrictions.RestrictionImpl",
      "be.shad.tsqb.query.AbstractTypeSafeQuery",
      "be.shad.tsqb.query.TypeSafeSubQueryImpl",
      "be.shad.tsqb.data.TypeSafeQueryProxyDataTree",
      "be.shad.tsqb.restrictions.RestrictionsGroupFactoryImpl",
      "be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueFactoryImpl",
      "be.shad.tsqb.query.TypeSafeRootQueryImpl",
      "be.shad.tsqb.query.TypeSafeUpdateQueryImpl",
      "be.shad.tsqb.restrictions.RestrictionChainableImpl",
      "be.shad.tsqb.restrictions.RestrictionChainableDelegatingImpl",
      "be.shad.tsqb.restrictions.OnGoingRestrictionImpl",
      "be.shad.tsqb.restrictions.OnGoingEnumRestrictionImpl",
      "be.shad.tsqb.restrictions.RestrictionsGroupImpl",
      "be.shad.tsqb.query.TypeSafeDeleteQueryImpl",
      "be.shad.tsqb.restrictions.OnGoingBooleanRestrictionImpl",
      "be.shad.tsqb.restrictions.predicate.IgnoreDirectNullPredicate",
      "be.shad.tsqb.restrictions.predicate.AbstractDirectValueRestrictionPredicate",
      "be.shad.tsqb.restrictions.predicate.IgnoreDirectEmptyStringPredicate",
      "be.shad.tsqb.restrictions.predicate.CompositeRestrictionValuePredicate",
      "be.shad.tsqb.restrictions.predicate.IgnoreEmptyCollectionPredicate",
      "be.shad.tsqb.restrictions.predicate.IgnoreNeverPredicate",
      "be.shad.tsqb.restrictions.predicate.RestrictionPredicate",
      "be.shad.tsqb.restrictions.OnGoingNumberRestrictionImpl",
      "be.shad.tsqb.values.TypeSafeValueImpl",
      "be.shad.tsqb.values.RestrictionTypeSafeValue",
      "be.shad.tsqb.values.DirectTypeSafeValue",
      "be.shad.tsqb.values.ReferenceTypeSafeValue",
      "be.shad.tsqb.values.FunctionTypeSafeValue",
      "be.shad.tsqb.restrictions.RestrictionsGroup$RestrictionsGroupBracketsPolicy"
    );
  }
}
