/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 20 05:04:11 GMT 2022
 */

package pythagoras.f;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RectangularShape_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "pythagoras.f.RectangularShape"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RectangularShape_ESTest_scaffolding.class.getClassLoader() ,
      "pythagoras.f.FloatMath",
      "pythagoras.f.Rectangle",
      "pythagoras.f.XY",
      "pythagoras.f.AbstractRectangle",
      "pythagoras.f.Transform",
      "pythagoras.f.IVector",
      "pythagoras.f.IRectangle",
      "pythagoras.f.Points",
      "pythagoras.util.NoninvertibleTransformException",
      "pythagoras.f.AbstractRoundRectangle",
      "pythagoras.f.Arc",
      "pythagoras.f.AffineTransform",
      "pythagoras.f.AbstractDimension",
      "pythagoras.f.AbstractTransform",
      "pythagoras.f.FlatteningPathIterator",
      "pythagoras.f.AbstractEllipse",
      "pythagoras.f.Line",
      "pythagoras.f.Point",
      "pythagoras.f.RectangularShape",
      "pythagoras.f.AbstractVector",
      "pythagoras.f.AbstractArc$Iterator",
      "pythagoras.f.Vector",
      "pythagoras.f.IdentityTransform",
      "pythagoras.f.Dimensions",
      "pythagoras.f.AbstractArc",
      "pythagoras.f.IEllipse",
      "pythagoras.f.AbstractPoint",
      "pythagoras.f.MathUtil",
      "pythagoras.f.PathIterator",
      "pythagoras.f.IRectangularShape",
      "pythagoras.f.IArc",
      "pythagoras.f.IShape",
      "pythagoras.f.Dimension",
      "pythagoras.f.Ellipse",
      "pythagoras.f.IDimension",
      "pythagoras.f.AbstractLine",
      "pythagoras.f.IPoint",
      "pythagoras.f.ILine",
      "pythagoras.f.RoundRectangle",
      "pythagoras.f.IRoundRectangle"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RectangularShape_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "pythagoras.f.RectangularShape",
      "pythagoras.f.MathUtil",
      "pythagoras.f.FloatMath",
      "pythagoras.f.AbstractRoundRectangle",
      "pythagoras.f.RoundRectangle",
      "pythagoras.f.AbstractVector",
      "pythagoras.f.Vector",
      "pythagoras.f.AbstractArc",
      "pythagoras.f.Arc",
      "pythagoras.f.AbstractDimension",
      "pythagoras.f.Dimension",
      "pythagoras.f.AbstractRectangle",
      "pythagoras.f.Rectangle",
      "pythagoras.f.Dimensions",
      "pythagoras.f.AbstractPoint",
      "pythagoras.f.Point",
      "pythagoras.f.Points",
      "pythagoras.f.AbstractEllipse",
      "pythagoras.f.Ellipse",
      "pythagoras.f.AbstractLine",
      "pythagoras.f.Line",
      "pythagoras.f.Lines",
      "pythagoras.f.AbstractTransform",
      "pythagoras.f.AffineTransform",
      "pythagoras.f.IdentityTransform",
      "pythagoras.f.FlatteningPathIterator",
      "pythagoras.f.AbstractEllipse$Iterator",
      "pythagoras.f.AbstractRoundRectangle$Iterator",
      "pythagoras.f.AbstractArc$Iterator",
      "pythagoras.f.AbstractRectangle$Iterator",
      "pythagoras.f.Transforms",
      "pythagoras.util.NoninvertibleTransformException",
      "pythagoras.f.Vectors",
      "pythagoras.f.AbstractLine$Iterator"
    );
  }
}
