/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 12 09:35:17 GMT 2022
 */

package jodd.csselly.selector;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AttributeSelector_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jodd.csselly.selector.AttributeSelector"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/user"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AttributeSelector_ESTest_scaffolding.class.getClassLoader() ,
      "jodd.csselly.selector.Match",
      "jodd.util.CharUtil",
      "jodd.lagarto.dom.NodeVisitor",
      "jodd.csselly.selector.Match$6",
      "jodd.lagarto.dom.Element",
      "jodd.csselly.selector.Match$5",
      "jodd.lagarto.dom.Text",
      "jodd.csselly.selector.Match$4",
      "jodd.lagarto.dom.Node$NodeType",
      "jodd.csselly.selector.Match$3",
      "jodd.csselly.CSSellyException",
      "jodd.csselly.selector.Match$2",
      "jodd.csselly.selector.Match$1",
      "jodd.lagarto.dom.Attribute",
      "jodd.lagarto.dom.Node",
      "jodd.lagarto.dom.DocumentType",
      "jodd.csselly.Selector",
      "jodd.csselly.Selector$Type",
      "jodd.lagarto.dom.LagartoDOMException",
      "jodd.lagarto.dom.NodeFilter",
      "jodd.lagarto.dom.Document",
      "jodd.util.StringUtil",
      "jodd.csselly.selector.AttributeSelector"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AttributeSelector_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jodd.csselly.Selector",
      "jodd.csselly.selector.AttributeSelector",
      "jodd.csselly.Selector$Type",
      "jodd.csselly.selector.Match",
      "jodd.lagarto.dom.Node",
      "jodd.lagarto.dom.DocumentType",
      "jodd.lagarto.dom.Node$NodeType",
      "jodd.lagarto.dom.Document",
      "org.nlab.xml.stream.reader.XmlMatcherStreamReader",
      "org.nlab.xml.stream.context.StreamContext",
      "org.nlab.xml.stream.context.UserContext",
      "org.nlab.xml.stream.context.PathContext",
      "jodd.lagarto.dom.Comment",
      "jodd.lagarto.dom.LagartoDOMException",
      "jodd.lagarto.dom.CData",
      "jodd.lagarto.dom.XmlDeclaration",
      "jodd.util.Util",
      "jodd.lagarto.dom.Element",
      "jodd.lagarto.dom.Text",
      "jodd.lagarto.dom.Attribute",
      "org.nlab.xml.stream.XmlStreamSpec",
      "jodd.util.StringUtil",
      "jodd.util.CharUtil",
      "org.nlab.util.Tries"
    );
  }
}
