/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 20 05:10:34 GMT 2022
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
public class QuadCurves_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "pythagoras.f.QuadCurves"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(QuadCurves_ESTest_scaffolding.class.getClassLoader() ,
      "pythagoras.f.FloatMath",
      "pythagoras.f.QuadCurve",
      "pythagoras.f.Point",
      "pythagoras.f.RectangularShape",
      "pythagoras.f.Rectangle",
      "pythagoras.f.QuadCurves",
      "pythagoras.f.XY",
      "pythagoras.f.AbstractRectangle",
      "pythagoras.f.Transform",
      "pythagoras.f.IQuadCurve",
      "pythagoras.f.AbstractPoint",
      "pythagoras.f.MathUtil",
      "pythagoras.f.PathIterator",
      "pythagoras.f.IRectangularShape",
      "pythagoras.f.IShape",
      "pythagoras.f.IRectangle",
      "pythagoras.f.AbstractQuadCurve",
      "pythagoras.f.Crossing",
      "pythagoras.f.Lines",
      "pythagoras.f.IPoint"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(QuadCurves_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "pythagoras.f.QuadCurves",
      "pythagoras.f.AbstractQuadCurve",
      "pythagoras.f.QuadCurve",
      "pythagoras.f.AbstractTransform",
      "pythagoras.f.AffineTransform",
      "pythagoras.f.AbstractVector",
      "pythagoras.f.Vector",
      "pythagoras.f.MathUtil",
      "pythagoras.f.FloatMath",
      "pythagoras.f.AbstractPoint",
      "pythagoras.f.Point",
      "pythagoras.f.Lines",
      "pythagoras.f.Crossing",
      "pythagoras.f.AbstractLine",
      "pythagoras.f.Line",
      "pythagoras.f.RectangularShape",
      "pythagoras.f.AbstractRectangle",
      "pythagoras.f.Rectangle",
      "pythagoras.f.IdentityTransform",
      "pythagoras.util.NoninvertibleTransformException",
      "pythagoras.f.Vectors",
      "pythagoras.f.AbstractDimension",
      "pythagoras.f.Dimension",
      "pythagoras.f.Points",
      "pythagoras.f.AbstractQuadCurve$Iterator",
      "pythagoras.f.FlatteningPathIterator",
      "pythagoras.f.Crossing$QuadCurve"
    );
  }
}
