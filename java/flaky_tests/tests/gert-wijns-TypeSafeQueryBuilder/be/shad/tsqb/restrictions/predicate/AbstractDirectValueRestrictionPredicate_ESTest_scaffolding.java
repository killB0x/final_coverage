/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 20 23:19:29 GMT 2022
 */

package be.shad.tsqb.restrictions.predicate;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractDirectValueRestrictionPredicate_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "be.shad.tsqb.restrictions.predicate.AbstractDirectValueRestrictionPredicate"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractDirectValueRestrictionPredicate_ESTest_scaffolding.class.getClassLoader() ,
      "be.shad.tsqb.values.HqlQueryValueImpl",
      "be.shad.tsqb.values.NamedValueEnabled",
      "be.shad.tsqb.values.DirectTypeSafeValue",
      "be.shad.tsqb.values.TypeSafeValue",
      "be.shad.tsqb.query.copy.Stateless",
      "be.shad.tsqb.values.TypeSafeValueImpl",
      "be.shad.tsqb.restrictions.WhereRestrictions",
      "be.shad.tsqb.restrictions.predicate.IgnoreDirectEmptyStringPredicate",
      "be.shad.tsqb.values.HqlQueryValueBuilder",
      "be.shad.tsqb.values.HqlQueryBuilderParams",
      "be.shad.tsqb.query.TypeSafeQueryJoin",
      "be.shad.tsqb.values.OperatorAwareValue",
      "be.shad.tsqb.values.DirectTypeSafeValueWrapper",
      "be.shad.tsqb.query.copy.CopyContext",
      "be.shad.tsqb.restrictions.predicate.RestrictionPredicate",
      "be.shad.tsqb.values.HqlQueryValue",
      "be.shad.tsqb.restrictions.HavingRestrictions",
      "be.shad.tsqb.exceptions.EqualsNotAllowedException",
      "be.shad.tsqb.query.copy.Copyable",
      "be.shad.tsqb.restrictions.RestrictionOperator",
      "be.shad.tsqb.query.TypeSafeQuery",
      "be.shad.tsqb.restrictions.predicate.AbstractDirectValueRestrictionPredicate",
      "be.shad.tsqb.values.DirectTypeSafeStringValue",
      "be.shad.tsqb.query.TypeSafeBaseQuery"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractDirectValueRestrictionPredicate_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "be.shad.tsqb.restrictions.predicate.AbstractDirectValueRestrictionPredicate",
      "be.shad.tsqb.restrictions.predicate.IgnoreDirectNullPredicate",
      "be.shad.tsqb.restrictions.predicate.IgnoreDirectEmptyStringPredicate",
      "be.shad.tsqb.restrictions.predicate.CompositeRestrictionValuePredicate",
      "be.shad.tsqb.restrictions.predicate.IgnoreEmptyCollectionPredicate",
      "be.shad.tsqb.restrictions.predicate.IgnoreNeverPredicate",
      "be.shad.tsqb.restrictions.predicate.RestrictionPredicate",
      "be.shad.tsqb.values.TypeSafeValueImpl",
      "be.shad.tsqb.values.DirectTypeSafeValue",
      "be.shad.tsqb.values.FunctionTypeSafeValue",
      "be.shad.tsqb.values.CollectionTypeSafeValue",
      "be.shad.tsqb.values.HqlQueryBuilderParamsImpl",
      "be.shad.tsqb.values.ProjectionTypeSafeValue",
      "be.shad.tsqb.values.DistinctTypeSafeValue",
      "be.shad.tsqb.values.DirectTypeSafeStringValue",
      "be.shad.tsqb.query.copy.CopyContext",
      "be.shad.tsqb.query.AbstractTypeSafeQuery",
      "be.shad.tsqb.query.TypeSafeRootQueryImpl",
      "be.shad.tsqb.query.TypeSafeDeleteQueryImpl",
      "be.shad.tsqb.data.TypeSafeQueryProxyDataTree",
      "be.shad.tsqb.restrictions.RestrictionsGroupFactoryImpl",
      "be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueFactoryImpl",
      "be.shad.tsqb.values.CustomTypeSafeValue",
      "be.shad.tsqb.values.HqlQueryValueImpl",
      "be.shad.tsqb.values.DirectTypeSafeStringValue$1",
      "be.shad.tsqb.query.TypeSafeUpdateQueryImpl",
      "be.shad.tsqb.values.CoalesceTypeSafeValue",
      "be.shad.tsqb.values.EntityTypeSafeValue",
      "be.shad.tsqb.values.WrappedTypeSafeValue",
      "be.shad.tsqb.values.CaseTypeSafeValue",
      "be.shad.tsqb.values.NullTypeSafeValue"
    );
  }
}
