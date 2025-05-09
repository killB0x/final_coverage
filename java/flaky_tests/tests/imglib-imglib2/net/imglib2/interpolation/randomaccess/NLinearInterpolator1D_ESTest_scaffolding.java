/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 05 17:30:37 GMT 2022
 */

package net.imglib2.interpolation.randomaccess;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class NLinearInterpolator1D_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.imglib2.interpolation.randomaccess.NLinearInterpolator1D"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NLinearInterpolator1D_ESTest_scaffolding.class.getClassLoader() ,
      "net.imglib2.RealInterval",
      "net.imglib2.Point",
      "net.imglib2.type.operators.Add",
      "net.imglib2.AbstractRealLocalizable",
      "net.imglib2.type.numeric.ARGBDoubleType",
      "net.imglib2.RandomAccess$1",
      "net.imglib2.type.operators.PowFloatingPoint",
      "net.imglib2.AbstractLocalizable",
      "net.imglib2.type.operators.Div",
      "net.imglib2.type.NativeType",
      "net.imglib2.Sampler",
      "net.imglib2.Localizable",
      "net.imglib2.view.RandomAccessibleOnRealRandomAccessible",
      "net.imglib2.RandomAccess",
      "net.imglib2.RealPoint",
      "net.imglib2.type.numeric.NativeARGBDoubleType",
      "net.imglib2.type.operators.SetOne",
      "net.imglib2.type.operators.MulFloatingPoint",
      "net.imglib2.RealPositionable",
      "net.imglib2.view.RandomAccessibleOnRealRandomAccessible$RandomAccessOnRealRandomAccessible",
      "net.imglib2.interpolation.randomaccess.NLinearInterpolator1D",
      "net.imglib2.Interval",
      "net.imglib2.view.SubsampleView$SubsampleRandomAccess",
      "net.imglib2.type.operators.ValueEquals",
      "net.imglib2.type.operators.Pow",
      "net.imglib2.position.transform.AbstractPositionableTransform",
      "net.imglib2.interpolation.randomaccess.NLinearInterpolator",
      "net.imglib2.Positionable",
      "net.imglib2.type.operators.Mul",
      "net.imglib2.position.FunctionRandomAccessible",
      "net.imglib2.position.FunctionRandomAccessible$FunctionRandomAccess",
      "net.imglib2.position.transform.Floor",
      "net.imglib2.type.numeric.AbstractARGBDoubleType",
      "net.imglib2.RealLocalizable",
      "net.imglib2.type.operators.SetZero",
      "net.imglib2.View",
      "net.imglib2.Dimensions",
      "net.imglib2.RealRandomAccess",
      "net.imglib2.view.SubsampleView",
      "net.imglib2.PointSample",
      "net.imglib2.type.operators.Sub",
      "net.imglib2.position.AbstractFunctionEuclideanSpace",
      "net.imglib2.type.Type",
      "net.imglib2.type.numeric.NumericType",
      "net.imglib2.RealRandomAccess$1",
      "net.imglib2.RealRandomAccessible",
      "net.imglib2.EuclideanSpace",
      "net.imglib2.RandomAccessible",
      "net.imglib2.AbstractEuclideanSpace",
      "net.imglib2.RealPointSample"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.function.BiConsumer", false, NLinearInterpolator1D_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.Supplier", false, NLinearInterpolator1D_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("net.imglib2.RealRandomAccessible", false, NLinearInterpolator1D_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NLinearInterpolator1D_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.imglib2.AbstractEuclideanSpace",
      "net.imglib2.position.transform.AbstractPositionableTransform",
      "net.imglib2.position.transform.Floor",
      "net.imglib2.RealRandomAccess$1",
      "net.imglib2.RealRandomAccess",
      "net.imglib2.interpolation.randomaccess.NLinearInterpolator",
      "net.imglib2.interpolation.randomaccess.NLinearInterpolator1D",
      "net.imglib2.position.AbstractFunctionEuclideanSpace",
      "net.imglib2.position.FunctionRandomAccessible",
      "net.imglib2.view.HyperSlice",
      "net.imglib2.RandomAccess$1",
      "net.imglib2.RandomAccess",
      "net.imglib2.view.HyperSlice$HyperSliceRandomAccess",
      "net.imglib2.AbstractLocalizable",
      "net.imglib2.Point",
      "net.imglib2.position.FunctionRandomAccessible$FunctionRandomAccess",
      "net.imglib2.view.SubsampleView",
      "net.imglib2.view.SubsampleIntervalView",
      "net.imglib2.view.Views",
      "net.imglib2.view.ViewTransforms",
      "net.imglib2.view.RandomAccessibleOnRealRandomAccessible",
      "net.imglib2.AbstractInterval",
      "net.imglib2.view.StackView",
      "net.imglib2.view.MixedTransformView",
      "net.imglib2.type.numeric.AbstractARGBDoubleType",
      "net.imglib2.type.numeric.ARGBDoubleType",
      "net.imglib2.view.RandomAccessibleOnRealRandomAccessible$RandomAccessOnRealRandomAccessible",
      "net.imglib2.img.ImgFactory",
      "net.imglib2.AbstractWrappedRealInterval",
      "net.imglib2.AbstractWrappedInterval",
      "net.imglib2.view.IterableRandomAccessibleInterval",
      "net.imglib2.img.ImgView",
      "net.imglib2.view.IntervalView",
      "net.imglib2.transform.integer.AbstractMixedTransform",
      "net.imglib2.transform.integer.MixedTransform",
      "net.imglib2.util.Intervals",
      "net.imglib2.FinalInterval",
      "net.imglib2.view.TransformBuilder",
      "net.imglib2.transform.integer.BoundingBox",
      "net.imglib2.util.Util",
      "net.imglib2.view.SubsampleView$SubsampleRandomAccess",
      "net.imglib2.view.TransformView",
      "net.imglib2.concatenate.ConcatenateUtils",
      "net.imglib2.AbstractRealLocalizable",
      "net.imglib2.RealPointSample",
      "net.imglib2.view.iteration.IterableTransformBuilder",
      "net.imglib2.view.RandomAccessibleIntervalCursor",
      "net.imglib2.util.Grid",
      "net.imglib2.util.Grid$CellIntervals",
      "net.imglib2.RealPointSampleList",
      "net.imglib2.RealPointSampleList$RealPointSampleListCursor",
      "net.imglib2.histogram.Histogram1d",
      "net.imglib2.histogram.DiscreteFrequencyDistribution",
      "net.imglib2.type.NativeTypeFactory",
      "net.imglib2.type.PrimitiveType",
      "net.imglib2.type.numeric.NativeARGBDoubleType",
      "net.imglib2.type.Index",
      "net.imglib2.img.basictypeaccess.array.AbstractDoubleArray",
      "net.imglib2.img.basictypeaccess.array.DoubleArray",
      "net.imglib2.PointSample",
      "net.imglib2.RealPoint",
      "net.imglib2.img.basictypeaccess.nio.AbstractBufferAccess",
      "net.imglib2.img.basictypeaccess.nio.DoubleBufferAccess",
      "net.imglib2.transform.integer.SlicingTransform",
      "net.imglib2.view.TransformBuilder$4",
      "net.imglib2.view.FullSourceMapSlicingRandomAccess",
      "net.imglib2.view.RandomAccessiblePair",
      "net.imglib2.PointSampleList",
      "net.imglib2.PointSampleList$PointSampleListCursor",
      "net.imglib2.img.basictypeaccess.array.DirtyDoubleArray",
      "net.imglib2.position.PositionRandomAccessible",
      "net.imglib2.position.PositionRandomAccessible$PositionRandomAccess",
      "net.imglib2.type.numeric.complex.AbstractComplexType",
      "net.imglib2.type.numeric.real.AbstractRealType",
      "net.imglib2.type.numeric.integer.AbstractIntegerType",
      "net.imglib2.type.numeric.integer.GenericLongType",
      "net.imglib2.type.numeric.integer.LongType",
      "net.imglib2.img.basictypeaccess.array.AbstractLongArray",
      "net.imglib2.img.basictypeaccess.array.LongArray",
      "net.imglib2.view.TransformBuilder$2",
      "net.imglib2.view.MixedRandomAccess",
      "net.imglib2.util.Localizables",
      "net.imglib2.FlatIterationOrder",
      "net.imglib2.type.AbstractNativeType",
      "net.imglib2.type.numeric.ARGBType",
      "net.imglib2.img.basictypeaccess.array.AbstractIntArray",
      "net.imglib2.img.basictypeaccess.array.IntArray",
      "net.imglib2.util.Fraction",
      "net.imglib2.img.AbstractImg",
      "net.imglib2.img.AbstractNativeImg",
      "net.imglib2.img.array.ArrayImg",
      "net.imglib2.util.IntervalIndexer",
      "net.imglib2.AbstractLocalizableInt",
      "net.imglib2.img.array.ArrayRandomAccess",
      "net.imglib2.img.cell.AbstractCellImg",
      "net.imglib2.img.cell.LazyCellImg",
      "net.imglib2.img.list.AbstractLongListImg",
      "net.imglib2.img.cell.LazyCellImg$LazyCells",
      "net.imglib2.KDTree",
      "net.imglib2.KDTree$KDTreeCursor",
      "net.imglib2.img.NativeImgFactory",
      "net.imglib2.img.array.ArrayImgFactory",
      "net.imglib2.exception.InvalidDimensionsException"
    );
  }
}
