/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 20 05:31:42 GMT 2022
 */

package pythagoras.d;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RoundRectangle_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "pythagoras.d.RoundRectangle"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RoundRectangle_ESTest_scaffolding.class.getClassLoader() ,
      "pythagoras.d.Rectangle",
      "pythagoras.d.AbstractVector",
      "pythagoras.d.IShape",
      "pythagoras.d.RectangularShape",
      "pythagoras.d.ILine",
      "pythagoras.d.IRoundRectangle",
      "pythagoras.d.AbstractDimension",
      "pythagoras.d.AffineTransform",
      "pythagoras.d.AbstractRoundRectangle",
      "pythagoras.d.AbstractTransform",
      "pythagoras.d.RoundRectangle",
      "pythagoras.util.NoninvertibleTransformException",
      "pythagoras.d.AbstractPoint",
      "pythagoras.d.IDimension",
      "pythagoras.d.AbstractRectangle",
      "pythagoras.d.IRectangularShape",
      "pythagoras.d.Vector",
      "pythagoras.d.IPoint",
      "pythagoras.d.XY",
      "pythagoras.d.Dimension",
      "pythagoras.d.IVector",
      "pythagoras.d.Point",
      "pythagoras.d.PathIterator",
      "pythagoras.d.Transform",
      "pythagoras.d.IRectangle"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RoundRectangle_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "pythagoras.d.RectangularShape",
      "pythagoras.d.AbstractRoundRectangle",
      "pythagoras.d.RoundRectangle",
      "pythagoras.d.AbstractRectangle",
      "pythagoras.d.Rectangle",
      "pythagoras.d.AbstractDimension",
      "pythagoras.d.Dimension",
      "pythagoras.d.AbstractTransform",
      "pythagoras.d.AffineTransform",
      "pythagoras.d.AbstractVector",
      "pythagoras.d.Vector",
      "pythagoras.util.NoninvertibleTransformException",
      "pythagoras.d.MathUtil",
      "pythagoras.d.Vectors",
      "pythagoras.d.AbstractPoint",
      "pythagoras.d.Point",
      "pythagoras.d.IdentityTransform",
      "pythagoras.d.AbstractLine",
      "pythagoras.d.Line",
      "pythagoras.d.FlatteningPathIterator",
      "pythagoras.d.AbstractRoundRectangle$Iterator",
      "pythagoras.d.Lines",
      "pythagoras.d.Points"
    );
  }
}
