/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Oct 25 22:34:17 GMT 2022
 */

package jp.co.yahoo.yosegi.binary.optimizer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DefaultOptimizerFactory_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jp.co.yahoo.yosegi.binary.optimizer.DefaultOptimizerFactory"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultOptimizerFactory_ESTest_scaffolding.class.getClassLoader() ,
      "jp.co.yahoo.yosegi.message.objects.PrimitiveObject",
      "jp.co.yahoo.yosegi.spread.column.ColumnType",
      "jp.co.yahoo.yosegi.binary.FindColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDoubleColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.StringOptimizer",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpLongColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpFloatColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.DefaultOptimizerFactory$1",
      "jp.co.yahoo.yosegi.binary.optimizer.LongOptimizer",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpStringColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.IOptimizerFactory",
      "jp.co.yahoo.yosegi.binary.optimizer.DefaultOptimizerFactory",
      "jp.co.yahoo.yosegi.blockindex.IBlockIndex",
      "jp.co.yahoo.yosegi.binary.optimizer.ByteOptimizer",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayLongColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.RleLongColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayFloatColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.DoubleOptimizer",
      "jp.co.yahoo.yosegi.binary.ColumnBinaryMakerConfig",
      "jp.co.yahoo.yosegi.binary.optimizer.BooleanOptimizer",
      "jp.co.yahoo.yosegi.binary.maker.RleStringColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.IOptimizer",
      "jp.co.yahoo.yosegi.binary.maker.DictionaryRleStringColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.FloatOptimizer",
      "jp.co.yahoo.yosegi.inmemory.IDictionary",
      "jp.co.yahoo.yosegi.binary.maker.IColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.ShortOptimizer",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayStringColumnBinaryMaker",
      "jp.co.yahoo.yosegi.config.Configuration",
      "jp.co.yahoo.yosegi.binary.optimizer.IntegerOptimizer",
      "jp.co.yahoo.yosegi.binary.optimizer.NullOptimizer",
      "jp.co.yahoo.yosegi.util.FindClass",
      "jp.co.yahoo.yosegi.spread.analyzer.IColumnAnalizeResult"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultOptimizerFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jp.co.yahoo.yosegi.binary.optimizer.DefaultOptimizerFactory",
      "jp.co.yahoo.yosegi.spread.column.ColumnType",
      "jp.co.yahoo.yosegi.binary.optimizer.DefaultOptimizerFactory$1",
      "jp.co.yahoo.yosegi.binary.optimizer.NullOptimizer",
      "jp.co.yahoo.yosegi.config.Configuration",
      "jp.co.yahoo.yosegi.binary.optimizer.BooleanOptimizer",
      "jp.co.yahoo.yosegi.binary.optimizer.ByteOptimizer",
      "jp.co.yahoo.yosegi.binary.FindColumnBinaryMaker",
      "jp.co.yahoo.yosegi.util.FindClass",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayLongColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpLongColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.RleLongColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.ShortOptimizer",
      "jp.co.yahoo.yosegi.binary.optimizer.IntegerOptimizer",
      "jp.co.yahoo.yosegi.binary.optimizer.LongOptimizer",
      "jp.co.yahoo.yosegi.binary.optimizer.FloatOptimizer",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayFloatColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpFloatColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.DoubleOptimizer",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDoubleColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpDoubleColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.optimizer.StringOptimizer",
      "jp.co.yahoo.yosegi.binary.maker.RleStringColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.DictionaryRleStringColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayDumpStringColumnBinaryMaker",
      "jp.co.yahoo.yosegi.binary.maker.OptimizedNullArrayStringColumnBinaryMaker"
    );
  }
}
