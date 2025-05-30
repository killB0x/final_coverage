/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:28:45 GMT 2022
 */

package burlap.behavior.learningrate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import burlap.behavior.learningrate.ExponentialDecayLR;
import burlap.mdp.core.action.Action;
import burlap.mdp.core.action.SimpleAction;
import burlap.mdp.core.state.NullState;
import burlap.mdp.core.state.State;
import burlap.statehashing.HashableStateFactory;
import burlap.statehashing.ReflectiveHashableStateFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExponentialDecayLR_ESTest extends ExponentialDecayLR_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0, reflectiveHashableStateFactory0, true);
      double double0 = exponentialDecayLR0.pollLearningRate((-4588), (-4588));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0);
      double double0 = exponentialDecayLR0.pollLearningRate(1452, 0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = exponentialDecayLR0.pollLearningRate(3912, 0);
      assertEquals(2.2250738585072014E-308, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0, 0.0);
      NullState nullState0 = NullState.instance;
      SimpleAction simpleAction0 = new SimpleAction();
      double double0 = exponentialDecayLR0.pollLearningRate(1452, (State) nullState0, (Action) simpleAction0);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = exponentialDecayLR0.pollLearningRate(1452, 0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0, 509.43887);
      exponentialDecayLR0.universalLR = (-1470.0);
      double double0 = exponentialDecayLR0.pollLearningRate((-2651), (-1843));
      assertEquals((-1470.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0, 0.0);
      NullState nullState0 = NullState.instance;
      SimpleAction simpleAction0 = new SimpleAction();
      exponentialDecayLR0.lastPollTime = (-2146960869);
      double double0 = exponentialDecayLR0.pollLearningRate((-2146960869), (State) nullState0, (Action) simpleAction0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0);
      exponentialDecayLR0.universalLR = (-6057.643573);
      NullState nullState0 = NullState.instance;
      SimpleAction simpleAction0 = new SimpleAction("");
      double double0 = exponentialDecayLR0.pollLearningRate(2397, (State) nullState0, (Action) simpleAction0);
      assertEquals((-6057.643573), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(3484.39762, 2.2250738585072014E-308, 2.2250738585072014E-308);
      NullState nullState0 = NullState.instance;
      SimpleAction simpleAction0 = new SimpleAction("burlap.behavior.learningrate.ExponentialDecayLR$StateWiseLearningRate");
      double double0 = exponentialDecayLR0.pollLearningRate(8, 1);
      assertEquals(3484.39762, double0, 0.01);
      
      double double1 = exponentialDecayLR0.peekAtLearningRate((State) nullState0, (Action) simpleAction0);
      assertEquals(7.75304205690671E-305, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(509.43887, 0.0, 0.0, reflectiveHashableStateFactory0, false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(1.0, 1.0, 1.0, (HashableStateFactory) null, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(1.0, 1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(2.2250738585072014E-308, 2.2250738585072014E-308, 3902.0866, reflectiveHashableStateFactory0, true);
      exponentialDecayLR0.resetDecay();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR((-2251.5394573604), 0.0, 0.0);
      NullState nullState0 = NullState.instance;
      SimpleAction simpleAction0 = new SimpleAction();
      double double0 = exponentialDecayLR0.pollLearningRate(1282, (State) nullState0, (Action) simpleAction0);
      assertEquals((-2251.5394573604), double0, 0.01);
      
      double double1 = exponentialDecayLR0.peekAtLearningRate((-1));
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0, 0.0);
      NullState nullState0 = NullState.instance;
      SimpleAction simpleAction0 = new SimpleAction();
      double double0 = exponentialDecayLR0.peekAtLearningRate((State) nullState0, (Action) simpleAction0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR((-1140.817598567941), 0.0, 0.0);
      NullState nullState0 = NullState.instance;
      SimpleAction simpleAction0 = new SimpleAction();
      double double0 = exponentialDecayLR0.peekAtLearningRate((State) nullState0, (Action) simpleAction0);
      assertEquals((-1140.817598567941), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(509.43887, 0.0, reflectiveHashableStateFactory0, true);
      double double0 = exponentialDecayLR0.peekAtLearningRate((-2277));
      assertEquals(509.43887, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR((-2251.5394573604), 0.0, 0.0);
      double double0 = exponentialDecayLR0.nextLRVal(2.2250738585072014E-308);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(3484.39762, 2.2250738585072014E-308, 2.2250738585072014E-308);
      double double0 = exponentialDecayLR0.nextLRVal(0.0);
      assertEquals(2.2250738585072014E-308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR((-15.9193207461), 2.2250738585072014E-308, (-2085.911));
      double double0 = exponentialDecayLR0.nextLRVal((-265.0));
      assertEquals((-5.896445725044084E-306), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(1, 1, reflectiveHashableStateFactory0, true);
      ExponentialDecayLR.StateWiseLearningRate exponentialDecayLR_StateWiseLearningRate0 = exponentialDecayLR0.getFeatureWiseLearningRate(1);
      assertNotNull(exponentialDecayLR_StateWiseLearningRate0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(1, 1, reflectiveHashableStateFactory0, true);
      SimpleAction simpleAction0 = new SimpleAction();
      NullState nullState0 = NullState.instance;
      // Undeclared exception!
      try { 
        exponentialDecayLR0.pollLearningRate(1, (State) nullState0, (Action) simpleAction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Reflective Hashable State should only be used with State objects that also already implement HashableState.
         //
         verifyException("burlap.statehashing.ReflectiveHashableStateFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(1, 1);
      exponentialDecayLR0.useStateWise = true;
      // Undeclared exception!
      try { 
        exponentialDecayLR0.pollLearningRate(1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0, reflectiveHashableStateFactory0, false);
      SimpleAction simpleAction0 = new SimpleAction();
      NullState nullState0 = NullState.instance;
      // Undeclared exception!
      try { 
        exponentialDecayLR0.peekAtLearningRate((State) nullState0, (Action) simpleAction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Reflective Hashable State should only be used with State objects that also already implement HashableState.
         //
         verifyException("burlap.statehashing.ReflectiveHashableStateFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0);
      exponentialDecayLR0.useStateWise = true;
      // Undeclared exception!
      try { 
        exponentialDecayLR0.peekAtLearningRate(12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0, reflectiveHashableStateFactory0, true);
      NullState nullState0 = NullState.instance;
      // Undeclared exception!
      try { 
        exponentialDecayLR0.getStateWiseLearningRate(nullState0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Reflective Hashable State should only be used with State objects that also already implement HashableState.
         //
         verifyException("burlap.statehashing.ReflectiveHashableStateFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0);
      NullState nullState0 = NullState.instance;
      // Undeclared exception!
      try { 
        exponentialDecayLR0.getStateWiseLearningRate(nullState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(1, 1);
      // Undeclared exception!
      try { 
        exponentialDecayLR0.getFeatureWiseLearningRate(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0);
      ExponentialDecayLR.StateWiseLearningRate exponentialDecayLR_StateWiseLearningRate0 = exponentialDecayLR0.new StateWiseLearningRate();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0);
      ExponentialDecayLR.MutableDouble exponentialDecayLR_MutableDouble0 = exponentialDecayLR0.new MutableDouble(0.0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0, reflectiveHashableStateFactory0, true);
      double double0 = exponentialDecayLR0.pollLearningRate(1452, (-628));
      assertEquals(0.0, double0, 0.01);
      
      double double1 = exponentialDecayLR0.pollLearningRate(1452, (-628));
      assertEquals(2.2250738585072014E-308, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR((-3114.97332), 1.0, reflectiveHashableStateFactory0, false);
      double double0 = exponentialDecayLR0.pollLearningRate(0, 1);
      assertEquals((-3114.97332), double0, 0.01);
      
      double double1 = exponentialDecayLR0.pollLearningRate(1683, 1);
      assertEquals(2.2250738585072014E-308, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR((-2251.5394573604), 0.0, 0.0);
      double double0 = exponentialDecayLR0.peekAtLearningRate((-1));
      assertEquals((-2251.5394573604), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.0, 0.0, 0.0);
      NullState nullState0 = NullState.instance;
      SimpleAction simpleAction0 = new SimpleAction();
      double double0 = exponentialDecayLR0.pollLearningRate((-2146960869), (State) nullState0, (Action) simpleAction0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(1, 1);
      NullState nullState0 = NullState.instance;
      exponentialDecayLR0.useStateWise = true;
      // Undeclared exception!
      try { 
        exponentialDecayLR0.pollLearningRate(1, (State) nullState0, (Action) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(972.7545, 0.0);
      SimpleAction simpleAction0 = new SimpleAction("@");
      NullState nullState0 = NullState.instance;
      double double0 = exponentialDecayLR0.peekAtLearningRate((State) nullState0, (Action) simpleAction0);
      assertEquals(972.7545, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(0.6831205528725957, 0.6831205528725957, (HashableStateFactory) null, false);
      SimpleAction simpleAction0 = new SimpleAction();
      NullState nullState0 = NullState.instance;
      // Undeclared exception!
      try { 
        exponentialDecayLR0.peekAtLearningRate((State) nullState0, (Action) simpleAction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = null;
      try {
        exponentialDecayLR0 = new ExponentialDecayLR((-1256.477199), (-1256.477199), (-1256.477199), reflectiveHashableStateFactory0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Decay rate must be <= 1 and >= 0
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = null;
      try {
        exponentialDecayLR0 = new ExponentialDecayLR(14, 14, 14, reflectiveHashableStateFactory0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Decay rate must be <= 1 and >= 0
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = null;
      try {
        exponentialDecayLR0 = new ExponentialDecayLR((-11), (-11), reflectiveHashableStateFactory0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Decay rate must be <= 1 and >= 0
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = null;
      try {
        exponentialDecayLR0 = new ExponentialDecayLR(603, 603, reflectiveHashableStateFactory0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Decay rate must be <= 1 and >= 0
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = null;
      try {
        exponentialDecayLR0 = new ExponentialDecayLR((-0.3142884853567737), (-0.3142884853567737), (-0.3142884853567737));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Decay rate must be <= 1 and >= 0
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = null;
      try {
        exponentialDecayLR0 = new ExponentialDecayLR(1009.4052520236967, 1009.4052520236967, 1009.4052520236967);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Decay rate must be <= 1 and >= 0
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = null;
      try {
        exponentialDecayLR0 = new ExponentialDecayLR((-6.361466367204337), (-6.361466367204337));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Decay rate must be <= 1 and >= 0
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = null;
      try {
        exponentialDecayLR0 = new ExponentialDecayLR(1004.5577834689138, 1004.5577834689138);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Decay rate must be <= 1 and >= 0
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleAction simpleAction0 = new SimpleAction();
      ReflectiveHashableStateFactory reflectiveHashableStateFactory0 = new ReflectiveHashableStateFactory();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(628.4855159, 0.0, reflectiveHashableStateFactory0, true);
      ExponentialDecayLR.StateWiseLearningRate exponentialDecayLR_StateWiseLearningRate0 = exponentialDecayLR0.new StateWiseLearningRate();
      ExponentialDecayLR.MutableDouble exponentialDecayLR_MutableDouble0 = exponentialDecayLR_StateWiseLearningRate0.getActionLearningRateEntry(simpleAction0);
      ExponentialDecayLR.MutableDouble exponentialDecayLR_MutableDouble1 = exponentialDecayLR_StateWiseLearningRate0.getActionLearningRateEntry((Action) null);
      assertSame(exponentialDecayLR_MutableDouble1, exponentialDecayLR_MutableDouble0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR((-2251.5394573604), 0.0, 0.0);
      // Undeclared exception!
      try { 
        exponentialDecayLR0.resetDecay();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.learningrate.ExponentialDecayLR", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NullState nullState0 = NullState.instance;
      SimpleAction simpleAction0 = new SimpleAction();
      ExponentialDecayLR exponentialDecayLR0 = new ExponentialDecayLR(1, 1);
      double double0 = exponentialDecayLR0.pollLearningRate(1, (State) nullState0, (Action) simpleAction0);
      assertEquals(1.0, double0, 0.01);
  }
}
