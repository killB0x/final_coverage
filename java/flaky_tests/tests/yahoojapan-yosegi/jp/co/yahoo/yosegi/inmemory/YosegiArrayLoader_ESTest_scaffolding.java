/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 26 01:26:55 GMT 2022
 */

package jp.co.yahoo.yosegi.inmemory;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class YosegiArrayLoader_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jp.co.yahoo.yosegi.inmemory.YosegiArrayLoader"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(YosegiArrayLoader_ESTest_scaffolding.class.getClassLoader() ,
      "jp.co.yahoo.yosegi.message.objects.PrimitiveObject",
      "jp.co.yahoo.yosegi.spread.column.ColumnType",
      "jp.co.yahoo.yosegi.inmemory.ILoaderFactory",
      "jp.co.yahoo.yosegi.binary.FindColumnBinaryMaker",
      "jp.co.yahoo.yosegi.compressor.AbstractCommonsCompressor",
      "jp.co.yahoo.yosegi.spread.column.ArrayColumn$EmptyArrayCell",
      "jp.co.yahoo.yosegi.binary.ColumnBinary",
      "jp.co.yahoo.yosegi.compressor.ICompressor",
      "jp.co.yahoo.yosegi.spread.column.ArrayCell",
      "jp.co.yahoo.yosegi.inmemory.YosegiArrayLoader",
      "jp.co.yahoo.yosegi.spread.column.NullCell",
      "jp.co.yahoo.yosegi.inmemory.LoadType",
      "jp.co.yahoo.yosegi.message.design.IField",
      "jp.co.yahoo.yosegi.spread.Spread",
      "jp.co.yahoo.yosegi.inmemory.ILoader",
      "jp.co.yahoo.yosegi.spread.column.IColumn",
      "jp.co.yahoo.yosegi.spread.column.ArrayColumn",
      "jp.co.yahoo.yosegi.spread.column.ICell",
      "jp.co.yahoo.yosegi.inmemory.YosegiLoaderFactory",
      "jp.co.yahoo.yosegi.spread.column.CellManager",
      "jp.co.yahoo.yosegi.inmemory.YosegiLoaderFactory$1",
      "jp.co.yahoo.yosegi.stats.SummaryStats",
      "jp.co.yahoo.yosegi.stats.ColumnStats",
      "jp.co.yahoo.yosegi.inmemory.IArrayLoader",
      "jp.co.yahoo.yosegi.inmemory.YosegiArrayLoader$ArrayCellManager",
      "jp.co.yahoo.yosegi.spread.column.SpreadArrayLink",
      "jp.co.yahoo.yosegi.spread.column.NullColumn",
      "jp.co.yahoo.yosegi.util.RangeBinarySearch",
      "jp.co.yahoo.yosegi.spread.column.ICellManager",
      "jp.co.yahoo.yosegi.util.FindClass",
      "jp.co.yahoo.yosegi.compressor.DeflateCommonsCompressor"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(YosegiArrayLoader_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jp.co.yahoo.yosegi.inmemory.YosegiArrayLoader",
      "jp.co.yahoo.yosegi.inmemory.YosegiArrayLoader$ArrayCellManager",
      "jp.co.yahoo.yosegi.binary.ColumnBinary",
      "jp.co.yahoo.yosegi.spread.column.ArrayColumn",
      "jp.co.yahoo.yosegi.spread.Spread",
      "jp.co.yahoo.yosegi.spread.column.CellManager",
      "jp.co.yahoo.yosegi.util.RangeBinarySearch",
      "jp.co.yahoo.yosegi.spread.column.ArrayColumn$EmptyArrayCell",
      "jp.co.yahoo.yosegi.spread.column.NullCell",
      "jp.co.yahoo.yosegi.spread.column.NullColumn",
      "jp.co.yahoo.yosegi.inmemory.YosegiLoaderFactory",
      "jp.co.yahoo.yosegi.inmemory.LoadType",
      "jp.co.yahoo.yosegi.inmemory.YosegiLoaderFactory$1",
      "jp.co.yahoo.yosegi.binary.FindColumnBinaryMaker",
      "jp.co.yahoo.yosegi.util.FindClass",
      "jp.co.yahoo.yosegi.spread.column.ArrayCell",
      "jp.co.yahoo.yosegi.spread.column.SpreadArrayLink",
      "jp.co.yahoo.yosegi.message.objects.ByteObj",
      "jp.co.yahoo.yosegi.stats.SummaryStats",
      "jp.co.yahoo.yosegi.util.Pair",
      "jp.co.yahoo.yosegi.binary.ColumnBinaryMakerNameShortCut",
      "jp.co.yahoo.yosegi.compressor.CompressorNameShortCut",
      "jp.co.yahoo.yosegi.spread.column.ColumnTypeFactory",
      "jp.co.yahoo.yosegi.message.objects.PrimitiveType",
      "jp.co.yahoo.yosegi.spread.column.ColumnTypeFactory$1",
      "jp.co.yahoo.yosegi.stats.ColumnStats",
      "jp.co.yahoo.yosegi.spread.column.SpreadColumn",
      "jp.co.yahoo.yosegi.spread.column.SpreadColumn$EmptySpreadCell",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayFloatColumnBinaryMaker",
      "jp.co.yahoo.yosegi.inmemory.YosegiSequentialLoader",
      "jp.co.yahoo.yosegi.compressor.FindCompressor",
      "jp.co.yahoo.yosegi.message.parser.json.JacksonArrayParser",
      "jp.co.yahoo.yosegi.message.design.ArrayContainerField",
      "jp.co.yahoo.yosegi.message.design.FloatField",
      "jp.co.yahoo.yosegi.spread.column.PrimitiveCell",
      "jp.co.yahoo.yosegi.spread.column.IntegerCell",
      "jp.co.yahoo.yosegi.spread.column.DoubleCell",
      "jp.co.yahoo.yosegi.message.parser.text.TextMapParser",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDoubleColumnBinaryMaker",
      "jp.co.yahoo.yosegi.spread.column.ArrowFloatConnector",
      "jp.co.yahoo.yosegi.spread.column.LazyColumn",
      "jp.co.yahoo.yosegi.message.objects.BytesObj",
      "jp.co.yahoo.yosegi.message.objects.BytesStringObj",
      "jp.co.yahoo.yosegi.spread.column.LongCell",
      "jp.co.yahoo.yosegi.message.design.ByteField",
      "jp.co.yahoo.yosegi.message.design.ShortField",
      "jp.co.yahoo.yosegi.message.design.StructContainerField",
      "jp.co.yahoo.yosegi.message.design.Properties",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker",
      "jp.co.yahoo.yosegi.spread.column.ShortCell",
      "jp.co.yahoo.yosegi.binary.maker.MaxLengthBasedArrayColumnBinaryMaker",
      "jp.co.yahoo.yosegi.message.design.FieldType",
      "jp.co.yahoo.yosegi.message.design.MapContainerField",
      "jp.co.yahoo.yosegi.message.design.BooleanField",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpLongColumnBinaryMaker",
      "jp.co.yahoo.yosegi.message.design.IntegerField"
    );
  }
}
