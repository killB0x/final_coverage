/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 21 03:05:19 GMT 2022
 */

package com.dragonbones.parser;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DataParser_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.dragonbones.parser.DataParser"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DataParser_ESTest_scaffolding.class.getClassLoader() ,
      "com.dragonbones.util.CharArray",
      "com.dragonbones.model.TextureData",
      "com.dragonbones.model.TextureAtlasData",
      "com.dragonbones.util.ShortArray",
      "com.dragonbones.util.buffer.ArrayBuffer",
      "com.dragonbones.model.ArmatureData",
      "com.dragonbones.parser.ActionFrame",
      "com.dragonbones.geom.Transform",
      "com.dragonbones.core.ActionType",
      "com.dragonbones.util.json.JSON",
      "com.dragonbones.model.SkinData",
      "com.dragonbones.model.BoneData",
      "com.dragonbones.model.SlotData",
      "com.dragonbones.model.BoundingBoxData",
      "com.dragonbones.util.ArrayBase",
      "com.dragonbones.model.WeightData",
      "com.dragonbones.model.ArmatureDisplayData",
      "com.dragonbones.model.ImageDisplayData",
      "com.dragonbones.util.buffer.Uint8Array",
      "com.dragonbones.util.Array",
      "com.dragonbones.parser.BinaryDataParser",
      "com.dragonbones.core.BlendMode",
      "com.dragonbones.util.Dynamic",
      "com.dragonbones.core.BoundingBoxType",
      "com.dragonbones.util.buffer.Float32Array",
      "com.dragonbones.util.StrReader",
      "com.dragonbones.geom.Point",
      "com.dragonbones.core.TimelineType",
      "com.dragonbones.util.NumberArray",
      "com.dragonbones.model.TimelineData",
      "com.dragonbones.libgdx.compat.EgretTexture",
      "com.dragonbones.util.buffer.Int16Array",
      "com.dragonbones.util.buffer.Uint16Array",
      "com.dragonbones.util.Console",
      "com.dragonbones.model.PolygonBoundingBoxData",
      "com.dragonbones.util.buffer.ArrayBufferView",
      "com.dragonbones.geom.Matrix",
      "com.dragonbones.parser.ObjectDataParser$FrameParser",
      "com.dragonbones.parser.ObjectDataParser",
      "com.dragonbones.model.MeshDisplayData",
      "com.dragonbones.model.AnimationData",
      "com.dragonbones.util.StrReader$ParseException",
      "com.dragonbones.util.FloatArray",
      "com.dragonbones.parser.DataParser",
      "com.dragonbones.model.DisplayData",
      "com.dragonbones.libgdx.GdxTextureAtlasData",
      "com.dragonbones.model.DragonBonesData",
      "com.dragonbones.core.ArmatureType",
      "com.dragonbones.util.IntArray",
      "com.dragonbones.core.DisplayType",
      "com.dragonbones.model.BoundingBoxDisplayData",
      "com.dragonbones.geom.ColorTransform",
      "com.dragonbones.core.BaseObject"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DataParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.dragonbones.parser.DataParser",
      "com.dragonbones.parser.DataParser$1",
      "com.dragonbones.core.ArmatureType",
      "com.dragonbones.core.DisplayType",
      "com.dragonbones.core.BoundingBoxType",
      "com.dragonbones.core.ActionType",
      "com.dragonbones.core.BlendMode",
      "com.dragonbones.parser.ObjectDataParser",
      "com.dragonbones.parser.BinaryDataParser",
      "com.dragonbones.util.ArrayBase",
      "com.dragonbones.util.NumberArray",
      "com.dragonbones.util.IntArray",
      "com.dragonbones.util.FloatArray",
      "com.dragonbones.util.Array",
      "com.dragonbones.geom.Matrix",
      "com.dragonbones.geom.Transform",
      "com.dragonbones.geom.ColorTransform",
      "com.dragonbones.geom.Point",
      "com.dragonbones.util.Dynamic",
      "com.dragonbones.util.Console",
      "com.dragonbones.core.BaseObject",
      "com.dragonbones.model.DisplayData",
      "com.dragonbones.model.ImageDisplayData",
      "com.dragonbones.model.BoundingBoxData",
      "com.dragonbones.model.PolygonBoundingBoxData",
      "com.dragonbones.model.SlotData",
      "com.dragonbones.util.buffer.ArrayBuffer",
      "com.dragonbones.model.ArmatureData",
      "com.dragonbones.geom.Rectangle",
      "com.dragonbones.util.ArrayBase$1",
      "com.dragonbones.model.ArmatureDisplayData",
      "com.dragonbones.util.buffer.Uint8Array",
      "com.dragonbones.model.TextureAtlasData",
      "com.dragonbones.libgdx.GdxTextureAtlasData",
      "com.dragonbones.model.MeshDisplayData",
      "com.dragonbones.util.json.JSON",
      "com.dragonbones.util.StrReader",
      "com.dragonbones.model.TextureData",
      "com.dragonbones.libgdx.GdxTextureData",
      "com.dragonbones.model.SkinData",
      "com.dragonbones.core.BinaryOffset",
      "com.dragonbones.parser.ObjectDataParser$1",
      "com.dragonbones.model.RectangleBoundingBoxData",
      "com.dragonbones.util.CharArray",
      "com.dragonbones.model.BoneData",
      "com.dragonbones.util.ShortArray",
      "com.dragonbones.util.buffer.Int16Array",
      "com.dragonbones.model.AnimationData",
      "com.dragonbones.util.BoolArray",
      "com.dragonbones.model.UserData",
      "com.dragonbones.util.StrReader$ParseException",
      "com.dragonbones.core.TweenType",
      "com.dragonbones.model.DragonBonesData",
      "com.dragonbones.model.ActionData",
      "com.dragonbones.libgdx.compat.EgretTexture",
      "com.dragonbones.libgdx.compat.EgretBitmapData",
      "com.dragonbones.model.TimelineData",
      "com.dragonbones.model.WeightData",
      "com.dragonbones.model.CanvasData",
      "com.dragonbones.model.EllipseBoundingBoxData"
    );
  }
}
