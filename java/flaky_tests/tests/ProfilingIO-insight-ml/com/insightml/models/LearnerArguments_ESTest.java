/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 13:01:45 GMT 2022
 */

package com.insightml.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.insightml.models.LearnerArguments;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LearnerArguments_ESTest extends LearnerArguments_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double(2725.4065752);
      LearnerArguments learnerArguments0 = new LearnerArguments();
      LearnerArguments learnerArguments1 = learnerArguments0.add("text", double0, (-746.57513209), 15.0);
      assertSame(learnerArguments1, learnerArguments0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = new Double(15.0);
      LearnerArguments learnerArguments0 = new LearnerArguments();
      LearnerArguments learnerArguments1 = learnerArguments0.add("", double0, 1.0, 1.0);
      assertSame(learnerArguments1, learnerArguments0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Iterator<LearnerArguments.Argument> iterator0 = learnerArguments0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Double double0 = new Double((-1.0));
      LearnerArguments learnerArguments1 = learnerArguments0.add("z", double0, 0.0, 0.0);
      LearnerArguments.Argument learnerArguments_Argument0 = learnerArguments1.get("z");
      assertEquals(0.0, learnerArguments_Argument0.getParameterSearchStepSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Double double0 = new Double(9.99999999E8);
      LearnerArguments learnerArguments1 = learnerArguments0.add("", double0, 2294.64, 2294.64);
      LearnerArguments.Argument learnerArguments_Argument0 = learnerArguments1.get("");
      assertEquals(2294.64, learnerArguments_Argument0.getMin(), 0.01);
      assertEquals(0.0, learnerArguments_Argument0.getParameterSearchStepSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Double double0 = new Double(1.0);
      LearnerArguments learnerArguments1 = learnerArguments0.add("", double0, (-1645.55), (-805.8));
      LearnerArguments.Argument learnerArguments_Argument0 = learnerArguments1.get("");
      assertEquals(55.983333333333334, learnerArguments_Argument0.getParameterSearchStepSize(), 0.01);
      assertEquals((-805.8), learnerArguments_Argument0.getMax(), 0.01);
      assertEquals((-1645.55), learnerArguments_Argument0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Double double0 = new Double(9.999999996125561E8);
      // Undeclared exception!
      try { 
        learnerArguments0.add("", double0, 9.999999996125561E8, 9.999999996125561E8, 9.999999996125561E8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.String@0000000002                        (LearnerArguments.java:40 : LearnerArguments.java:71)
         //
         verifyException("com.insightml.utils.Check", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Double double0 = new Double(237.35168);
      LearnerArguments learnerArguments1 = learnerArguments0.add("EREZDlTO", double0, 1.0, 15.0);
      assertSame(learnerArguments0, learnerArguments1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Double double0 = new Double(237.35168);
      LearnerArguments learnerArguments1 = learnerArguments0.add("", double0, 237.35168, 237.35168);
      int int0 = learnerArguments1.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Double double0 = new Double(237.35168);
      learnerArguments0.add("EREZDlTO", double0, (-2300.815658), 2765.782491313, (-39.0));
      LearnerArguments.Argument learnerArguments_Argument0 = learnerArguments0.get("EREZDlTO");
      assertEquals(2765.782491313, learnerArguments_Argument0.getMax(), 0.01);
      
      double double1 = learnerArguments_Argument0.validate(1);
      assertEquals((-2300.815658), learnerArguments_Argument0.getMin(), 0.01);
      assertEquals((-39.0), learnerArguments_Argument0.getParameterSearchStepSize(), 0.01);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Double double0 = new Double(0.0);
      learnerArguments0.add("", double0, (-2329.647470149), 0.0);
      LearnerArguments.Argument learnerArguments_Argument0 = learnerArguments0.get("");
      learnerArguments_Argument0.getName();
      assertEquals((-2329.647470149), learnerArguments_Argument0.getMin(), 0.01);
      assertEquals(0.0, learnerArguments_Argument0.getMax(), 0.01);
      assertEquals(155.30983134326667, learnerArguments_Argument0.getParameterSearchStepSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double double0 = new Double(237.35168);
      LearnerArguments.Argument learnerArguments_Argument0 = new LearnerArguments.Argument((String) null, double0, 237.35168, 237.35168, 237.35168);
      double double1 = learnerArguments_Argument0.getMax();
      assertEquals(237.35168, double1, 0.01);
      assertEquals(237.35168, learnerArguments_Argument0.getParameterSearchStepSize(), 0.01);
      assertEquals(237.35168, learnerArguments_Argument0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double double0 = new Double(2725.4065752);
      LearnerArguments.Argument learnerArguments_Argument0 = new LearnerArguments.Argument(">lTj", double0, 2725.4065752, 2725.4065752, 2725.4065752);
      learnerArguments_Argument0.getDefault();
      assertEquals(2725.4065752, learnerArguments_Argument0.getMin(), 0.01);
      assertEquals(2725.4065752, learnerArguments_Argument0.getParameterSearchStepSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double double0 = new Double(237.35168);
      LearnerArguments.Argument learnerArguments_Argument0 = new LearnerArguments.Argument("0o_w65?8\"N:>jD{E", double0, (-2300.815658), (-1494.732), (-2944.1417754949));
      double double1 = learnerArguments_Argument0.getMin();
      assertEquals((-2944.1417754949), learnerArguments_Argument0.getParameterSearchStepSize(), 0.01);
      assertEquals((-1494.732), learnerArguments_Argument0.getMax(), 0.01);
      assertEquals((-2300.815658), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      Double double0 = new Double(237.35168);
      learnerArguments0.add("EREZDlTO", double0, (-2300.815658), 2765.782491313, (-39.0));
      LearnerArguments.Argument learnerArguments_Argument0 = learnerArguments0.get("EREZDlTO");
      double double1 = learnerArguments_Argument0.getParameterSearchStepSize();
      assertEquals((-2300.815658), learnerArguments_Argument0.getMin(), 0.01);
      assertEquals((-39.0), double1, 0.01);
      assertEquals(2765.782491313, learnerArguments_Argument0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      // Undeclared exception!
      try { 
        learnerArguments0.add("", (Double) null, 1037.4680365543, 15.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.String@0000000002                        (LearnerArguments.java:40 : LearnerArguments.java:71)
         //
         verifyException("com.insightml.utils.Check", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      int int0 = learnerArguments0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LearnerArguments learnerArguments0 = new LearnerArguments();
      // Undeclared exception!
      try { 
        learnerArguments0.get(">lTj");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // java.lang.String@0000000002
         //
         verifyException("com.insightml.utils.Check", e);
      }
  }
}
