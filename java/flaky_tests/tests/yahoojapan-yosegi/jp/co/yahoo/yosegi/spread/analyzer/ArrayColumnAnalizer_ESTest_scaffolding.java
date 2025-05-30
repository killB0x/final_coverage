/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 26 00:50:30 GMT 2022
 */

package jp.co.yahoo.yosegi.spread.analyzer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ArrayColumnAnalizer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jp.co.yahoo.yosegi.spread.analyzer.ArrayColumnAnalizer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ArrayColumnAnalizer_ESTest_scaffolding.class.getClassLoader() ,
      "jp.co.yahoo.yosegi.message.objects.PrimitiveObject",
      "jp.co.yahoo.yosegi.spread.column.UnionColumn",
      "jp.co.yahoo.yosegi.message.design.IField",
      "jp.co.yahoo.yosegi.spread.column.ColumnType",
      "jp.co.yahoo.yosegi.spread.Spread",
      "jp.co.yahoo.yosegi.spread.column.SpreadColumn$EmptySpreadCell",
      "jp.co.yahoo.yosegi.spread.column.IColumn",
      "jp.co.yahoo.yosegi.spread.analyzer.SpreadColumnAnalizeResult",
      "jp.co.yahoo.yosegi.spread.column.ICell",
      "jp.co.yahoo.yosegi.spread.analyzer.ArrayColumnAnalizeResult",
      "jp.co.yahoo.yosegi.spread.column.SpreadColumn",
      "jp.co.yahoo.yosegi.spread.column.CellManager",
      "jp.co.yahoo.yosegi.spread.analyzer.SpreadColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.analyzer.ArrayColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.analyzer.UnionColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.column.NullColumn",
      "jp.co.yahoo.yosegi.util.RangeBinarySearch",
      "jp.co.yahoo.yosegi.spread.analyzer.ColumnAnalizerFactory",
      "jp.co.yahoo.yosegi.spread.analyzer.ColumnAnalizerFactory$1",
      "jp.co.yahoo.yosegi.spread.analyzer.IColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.column.ICellManager",
      "jp.co.yahoo.yosegi.spread.column.NullCell",
      "jp.co.yahoo.yosegi.spread.analyzer.IColumnAnalizeResult"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ArrayColumnAnalizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jp.co.yahoo.yosegi.spread.analyzer.ArrayColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.column.ColumnType",
      "jp.co.yahoo.yosegi.spread.analyzer.ColumnAnalizerFactory$1",
      "jp.co.yahoo.yosegi.spread.column.UnionColumn",
      "jp.co.yahoo.yosegi.spread.column.NullCell",
      "jp.co.yahoo.yosegi.spread.column.NullColumn",
      "jp.co.yahoo.yosegi.spread.column.CellManager",
      "jp.co.yahoo.yosegi.util.RangeBinarySearch",
      "jp.co.yahoo.yosegi.spread.column.SpreadColumn",
      "jp.co.yahoo.yosegi.spread.Spread",
      "jp.co.yahoo.yosegi.spread.column.SpreadColumn$EmptySpreadCell",
      "jp.co.yahoo.yosegi.spread.column.ArrowPrimitiveColumn",
      "jp.co.yahoo.yosegi.spread.column.ArrayColumn",
      "jp.co.yahoo.yosegi.spread.column.ArrayColumn$EmptyArrayCell",
      "jp.co.yahoo.yosegi.spread.analyzer.ArrayColumnAnalizeResult",
      "jp.co.yahoo.yosegi.spread.column.LazyColumn",
      "jp.co.yahoo.yosegi.spread.column.PrimitiveColumn",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$10",
      "jp.co.yahoo.yosegi.spread.analyzer.ColumnAnalizerFactory",
      "jp.co.yahoo.yosegi.spread.analyzer.UnionColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$4",
      "jp.co.yahoo.yosegi.spread.column.PrimitiveCellManager",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$6",
      "jp.co.yahoo.yosegi.spread.column.PrimitiveSchemaFactory",
      "jp.co.yahoo.yosegi.spread.column.PrimitiveSchemaFactory$1",
      "jp.co.yahoo.yosegi.message.design.IntegerField",
      "jp.co.yahoo.yosegi.message.design.Properties",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$2",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$5",
      "jp.co.yahoo.yosegi.message.design.FloatField",
      "jp.co.yahoo.yosegi.spread.column.ArrayCell",
      "jp.co.yahoo.yosegi.message.design.NullField",
      "jp.co.yahoo.yosegi.message.design.ArrayContainerField",
      "jp.co.yahoo.yosegi.spread.analyzer.SpreadColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.analyzer.SpreadColumnAnalizeResult",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$7",
      "jp.co.yahoo.yosegi.message.design.ByteField",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$1",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$8",
      "jp.co.yahoo.yosegi.spread.column.SpreadCell",
      "jp.co.yahoo.yosegi.spread.column.SpreadLink",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$3",
      "jp.co.yahoo.yosegi.util.IndexAndObject",
      "jp.co.yahoo.yosegi.message.design.BooleanField",
      "jp.co.yahoo.yosegi.spread.column.SpreadArrayLink",
      "jp.co.yahoo.yosegi.message.design.BytesField",
      "jp.co.yahoo.yosegi.message.design.StructContainerField",
      "jp.co.yahoo.yosegi.spread.column.CellMakerFactory$9",
      "jp.co.yahoo.yosegi.spread.column.ColumnTypeFactory",
      "jp.co.yahoo.yosegi.message.design.LongField",
      "jp.co.yahoo.yosegi.message.design.UnionField",
      "jp.co.yahoo.yosegi.message.design.FieldType",
      "jp.co.yahoo.yosegi.spread.column.ColumnFactory",
      "jp.co.yahoo.yosegi.spread.column.ColumnFactory$1",
      "jp.co.yahoo.yosegi.message.design.ShortField",
      "jp.co.yahoo.yosegi.spread.analyzer.StringColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.analyzer.StringColumnAnalizeResult",
      "jp.co.yahoo.yosegi.message.design.DoubleField",
      "jp.co.yahoo.yosegi.message.parser.text.TextNullParser",
      "jp.co.yahoo.yosegi.spread.analyzer.ByteColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.analyzer.ByteColumnAnalizeResult",
      "jp.co.yahoo.yosegi.message.design.StringField",
      "jp.co.yahoo.yosegi.message.parser.text.TextStructParser",
      "jp.co.yahoo.yosegi.spread.analyzer.LongColumnAnalizer",
      "jp.co.yahoo.yosegi.message.parser.text.TextArrayParser",
      "jp.co.yahoo.yosegi.spread.analyzer.UnionColumnAnalizeResult",
      "jp.co.yahoo.yosegi.message.objects.PrimitiveType",
      "jp.co.yahoo.yosegi.spread.column.ColumnTypeFactory$1",
      "jp.co.yahoo.yosegi.spread.analyzer.DoubleColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.analyzer.DoubleColumnAnalizeResult",
      "jp.co.yahoo.yosegi.spread.analyzer.BytesColumnAnalizer",
      "jp.co.yahoo.yosegi.spread.analyzer.BytesColumnAnalizeResult",
      "jp.co.yahoo.yosegi.message.parser.java.JavaListParser",
      "jp.co.yahoo.yosegi.message.objects.NullObj",
      "jp.co.yahoo.yosegi.spread.column.PrimitiveCell",
      "jp.co.yahoo.yosegi.spread.column.ByteCell"
    );
  }
}
