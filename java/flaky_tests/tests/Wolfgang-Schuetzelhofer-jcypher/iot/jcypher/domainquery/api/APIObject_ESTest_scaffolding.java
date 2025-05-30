/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 25 21:40:50 GMT 2022
 */

package iot.jcypher.domainquery.api;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class APIObject_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "iot.jcypher.domainquery.api.APIObject"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(APIObject_ESTest_scaffolding.class.getClassLoader() ,
      "iot.jcypher.query.values.JcValue",
      "iot.jcypher.domainquery.ast.PredicateExpression",
      "iot.jcypher.domainquery.AbstractDomainQuery",
      "iot.jcypher.domainquery.internal.QueryRecorder",
      "iot.jcypher.domainquery.ast.PredicateExpression$Operator",
      "iot.jcypher.domainquery.internal.IASTObjectsContainer",
      "iot.jcypher.domainquery.internal.RecordedQuery",
      "iot.jcypher.domainquery.internal.RecordedQuery$Statement",
      "iot.jcypher.domainquery.api.APIAccess",
      "iot.jcypher.domainquery.internal.RecordedQuery$Invocation",
      "iot.jcypher.query.values.JcBoolean",
      "iot.jcypher.domainquery.api.TerminalResult",
      "iot.jcypher.query.values.JcNumber",
      "iot.jcypher.domainquery.internal.QueryRecorder$RecQueryHolder",
      "iot.jcypher.domainquery.ast.IASTObject",
      "iot.jcypher.domainquery.internal.QueryRecorder$1",
      "iot.jcypher.query.values.IFragment",
      "iot.jcypher.query.values.JcString",
      "iot.jcypher.domainquery.api.APIObject",
      "iot.jcypher.domainquery.internal.QueryRecorder$QueriesPerThread",
      "iot.jcypher.domainquery.internal.RecordedQuery$Literal",
      "iot.jcypher.domainquery.api.DomainObjectMatch",
      "iot.jcypher.query.values.JcPrimitive",
      "iot.jcypher.domainquery.internal.QueryRecorder$Literal",
      "iot.jcypher.domainquery.api.IPredicateOperand1",
      "iot.jcypher.query.values.ValueElement",
      "iot.jcypher.domainquery.api.BooleanOperation",
      "iot.jcypher.query.values.IOperatorOrFunction",
      "iot.jcypher.query.values.JcCollection"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(APIObject_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "iot.jcypher.domainquery.api.APIObject",
      "iot.jcypher.database.remote.AbstractRemoteDBAccess",
      "iot.jcypher.database.remote.RemoteDBAccess",
      "iot.jcypher.domain.internal.DomainAccess",
      "iot.jcypher.domain.internal.DomainAccess$DomainAccessHandler",
      "iot.jcypher.domain.internal.DomainAccess$DomainAccessHandler$DBAccessWrapper",
      "iot.jcypher.domain.mapping.DomainState",
      "iot.jcypher.domain.mapping.surrogate.SurrogateState",
      "iot.jcypher.domain.internal.DomainAccess$InternalDomainAccess",
      "iot.jcypher.domain.genericmodel.internal.InternalAccess",
      "iot.jcypher.domain.genericmodel.internal.DomainModel",
      "iot.jcypher.domainquery.AbstractDomainQuery",
      "iot.jcypher.domainquery.GDomainQuery",
      "iot.jcypher.domainquery.internal.QueryExecutor",
      "iot.jcypher.domainquery.ast.PredicateExpression",
      "iot.jcypher.domainquery.api.APIAccess",
      "iot.jcypher.domainquery.api.BooleanOperation",
      "iot.jcypher.domainquery.internal.QueryRecorder$1",
      "iot.jcypher.domainquery.internal.QueryRecorder",
      "iot.jcypher.domainquery.internal.QueryRecorder$PlaceHolder",
      "iot.jcypher.domainquery.internal.QueryRecorder$QueriesPerThread",
      "iot.jcypher.domainquery.internal.QueryRecorder$RecQueryHolder",
      "iot.jcypher.domainquery.ast.UnionExpression",
      "iot.jcypher.domainquery.AbstractDomainQuery$IntAccess",
      "iot.jcypher.domainquery.ast.PredicateExpression$Operator",
      "iot.jcypher.domainquery.api.TerminalResult",
      "iot.jcypher.domainquery.internal.QueryRecorder$Literal",
      "iot.jcypher.domainquery.internal.RecordedQuery",
      "iot.jcypher.domainquery.internal.RecordedQuery$Literal",
      "iot.jcypher.domainquery.internal.RecordedQuery$Invocation",
      "iot.jcypher.domainquery.internal.QueryExecutor$MappingInfo",
      "iot.jcypher.domainquery.api.DomainObjectMatch",
      "iot.jcypher.domain.internal.DomainAccess$ExecContext",
      "iot.jcypher.domain.internal.CurrentDomain",
      "iot.jcypher.query.values.ValueElement",
      "iot.jcypher.query.values.JcValue",
      "iot.jcypher.query.values.JcElement",
      "iot.jcypher.query.values.JcNode",
      "iot.jcypher.query.JcQuery",
      "iot.jcypher.query.factories.clause.MERGE",
      "iot.jcypher.query.factories.xpression.X",
      "iot.jcypher.query.api.pattern.XFactory",
      "iot.jcypher.query.ast.ASTNode",
      "iot.jcypher.query.ast.pattern.PatternExpression",
      "iot.jcypher.query.ast.pattern.PatternElement",
      "iot.jcypher.query.ast.pattern.PatternNode",
      "iot.jcypher.query.api.APIObject",
      "iot.jcypher.query.api.pattern.Element",
      "iot.jcypher.query.api.pattern.Node",
      "iot.jcypher.query.api.APIObjectAccess",
      "iot.jcypher.query.ast.ClauseType",
      "iot.jcypher.query.ast.pattern.PatternProperty",
      "iot.jcypher.query.api.pattern.Property",
      "iot.jcypher.query.values.JcProperty",
      "iot.jcypher.query.values.Operator",
      "iot.jcypher.query.values.operators.OPTYPE$PropertyContainer",
      "iot.jcypher.query.values.operators.OPERATOR$PropertyContainer",
      "iot.jcypher.query.factories.clause.ON_CREATE",
      "iot.jcypher.query.api.modify.ModifyFactory",
      "iot.jcypher.query.ast.modify.ModifyExpression",
      "iot.jcypher.query.ast.modify.ModifyExpression$ModifyAction",
      "iot.jcypher.query.api.modify.Set",
      "iot.jcypher.query.api.modify.ModifyTerminal",
      "iot.jcypher.query.factories.clause.WITH",
      "iot.jcypher.query.api.returns.RFactory",
      "iot.jcypher.query.ast.returns.ReturnExpression",
      "iot.jcypher.query.ast.returns.ReturnValue",
      "iot.jcypher.query.ast.returns.ReturnElement",
      "iot.jcypher.query.api.returns.RElement",
      "iot.jcypher.query.api.returns.RSortable",
      "iot.jcypher.query.factories.clause.OPTIONAL_MATCH",
      "iot.jcypher.query.factories.clause.SEPARATE",
      "iot.jcypher.query.ast.separate.SeparateExpression",
      "iot.jcypher.query.factories.clause.RETURN",
      "iot.jcypher.query.api.returns.RDistinct",
      "iot.jcypher.query.api.returns.RCount",
      "iot.jcypher.query.values.JcPrimitive",
      "iot.jcypher.query.values.JcNumber",
      "iot.jcypher.domain.internal.DomainAccess$Exec",
      "iot.jcypher.util.QueriesPrintObserver$QueryToObserve",
      "iot.jcypher.query.writer.Format",
      "iot.jcypher.util.Util",
      "iot.jcypher.util.MultiOutputStream",
      "iot.jcypher.util.QueriesPrintObserver",
      "iot.jcypher.util.QueriesPrintObserver$ContentToObserve",
      "iot.jcypher.query.writer.WriterContext",
      "iot.jcypher.query.writer.ContextAccess",
      "iot.jcypher.query.writer.JSONWriter",
      "iot.jcypher.query.writer.PreparedQueries",
      "iot.jcypher.query.writer.QueryParam",
      "iot.jcypher.query.writer.PreparedQuery",
      "iot.jcypher.query.writer.PreparedQuery$PQContext",
      "iot.jcypher.query.writer.CypherWriter",
      "iot.jcypher.database.DBVersion",
      "iot.jcypher.domainquery.internal.Settings$1",
      "iot.jcypher.domainquery.internal.Settings",
      "iot.jcypher.query.writer.Pretty",
      "iot.jcypher.query.writer.CypherWriter$PatternCypherWriter",
      "iot.jcypher.query.values.ValueWriter",
      "iot.jcypher.query.writer.QueryParamSet",
      "iot.jcypher.query.writer.CypherWriter$PrimitiveCypherWriter",
      "iot.jcypher.query.writer.CypherWriter$STCypherWriter",
      "iot.jcypher.query.values.operators.OPTYPE$String",
      "iot.jcypher.query.values.operators.OPERATOR$Common",
      "iot.jcypher.query.writer.CypherWriter$ReturnCypherWriter",
      "iot.jcypher.query.writer.JSONWriter$Statement",
      "iot.jcypher.domainquery.ast.TraversalExpression",
      "iot.jcypher.domainquery.api.Traverse",
      "iot.jcypher.domainquery.ast.TraversalExpression$Step",
      "iot.jcypher.domainquery.api.TraversalStep",
      "iot.jcypher.domainquery.ast.SelectExpression",
      "iot.jcypher.database.internal.DBUtil",
      "iot.jcypher.query.values.JcRelation",
      "iot.jcypher.query.factories.clause.MATCH",
      "iot.jcypher.query.ast.pattern.PatternRelation",
      "iot.jcypher.query.ast.pattern.PatternRelation$Direction",
      "iot.jcypher.query.api.pattern.Relation",
      "iot.jcypher.query.factories.clause.DO",
      "iot.jcypher.domainquery.ast.OrderExpression",
      "iot.jcypher.domainquery.ast.OrderExpression$OrderBy",
      "iot.jcypher.domainquery.api.OrderDirection",
      "iot.jcypher.query.values.FunctionInstance",
      "iot.jcypher.query.values.Function",
      "iot.jcypher.query.values.functions.FTYPE$Relation",
      "iot.jcypher.query.values.functions.FUNCTION$Relation",
      "iot.jcypher.domainquery.DomainQuery",
      "iot.jcypher.domainquery.InternalAccess",
      "iot.jcypher.domainquery.internal.QueryExecutor$RecordedQueryContext",
      "iot.jcypher.query.values.ValueAccess",
      "iot.jcypher.domain.mapping.MappingUtil",
      "iot.jcypher.domainquery.ast.Parameter",
      "iot.jcypher.query.values.JcCollection",
      "iot.jcypher.query.values.functions.FTYPE$Node",
      "iot.jcypher.query.values.functions.FUNCTION$Node",
      "iot.jcypher.domainquery.ast.CollectExpression",
      "iot.jcypher.domainquery.api.Collect",
      "iot.jcypher.domain.internal.DomainAccess$UpdateContext",
      "iot.jcypher.domain.internal.DomainAccess$SurrogateChangeLog",
      "iot.jcypher.domain.internal.DomainAccess$ClosureCalculator",
      "iot.jcypher.domain.mapping.DefaultObjectMappingCreator",
      "iot.jcypher.domain.mapping.ObjectMapping",
      "iot.jcypher.domain.mapping.SimpleObjectMapping",
      "iot.jcypher.database.remote.AbstractRemoteDBAccess$1",
      "iot.jcypher.domainquery.QueryPersistor",
      "iot.jcypher.domainquery.CountQueryResult",
      "iot.jcypher.query.values.JcString",
      "iot.jcypher.query.values.functions.FTYPE$Common",
      "iot.jcypher.query.values.functions.FUNCTION$Common",
      "iot.jcypher.domainquery.ast.FromPreviousQueryExpression",
      "iot.jcypher.domainquery.DomainQueryResult",
      "iot.jcypher.concurrency.QExecution",
      "iot.jcypher.concurrency.QExecution$ExecType",
      "iot.jcypher.domainquery.internal.QueryExecutor$QueryContext",
      "iot.jcypher.domainquery.internal.QueryExecutor$QueryBuilder",
      "iot.jcypher.domainquery.internal.QueryExecutor$QueryBuilder$ClauseBuilder",
      "iot.jcypher.domainquery.internal.QueryExecutor$QueryBuilder$ClauseBuilderContext",
      "iot.jcypher.transaction.internal.AbstractTransaction",
      "iot.jcypher.database.remote.RTransactionImpl",
      "iot.jcypher.domainquery.QueryLoader",
      "iot.jcypher.domainquery.api.Select",
      "iot.jcypher.domain.genericmodel.internal.DomainModel$TransactionState",
      "iot.jcypher.domainquery.api.Order",
      "iot.jcypher.domain.internal.DomainAccess$GenericDomainAccess",
      "iot.jcypher.query.values.functions.FTYPE$PropertyContainer",
      "iot.jcypher.query.values.functions.FUNCTION$PropertyContainer"
    );
  }
}
