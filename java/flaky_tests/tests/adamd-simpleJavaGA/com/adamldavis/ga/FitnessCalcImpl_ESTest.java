/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:29:59 GMT 2022
 */

package com.adamldavis.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.adamldavis.ga.FitnessCalcImpl;
import com.adamldavis.ga.Individual;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FitnessCalcImpl_ESTest extends FitnessCalcImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-15);
      fitnessCalcImpl0.setSolution(byteArray0);
      Individual individual0 = new Individual(fitnessCalcImpl0);
      int int0 = fitnessCalcImpl0.getFitness(individual0);
      assertEquals(4, fitnessCalcImpl0.getMaxFitness());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      fitnessCalcImpl0.setSolution("");
      int int0 = fitnessCalcImpl0.getMaxFitness();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      assertEquals(64, fitnessCalcImpl0.getMaxFitness());
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)122;
      fitnessCalcImpl0.setSolution(byteArray0);
      Individual individual0 = new Individual(fitnessCalcImpl0);
      int int0 = fitnessCalcImpl0.getFitness(individual0);
      assertEquals(1, fitnessCalcImpl0.getMaxFitness());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      // Undeclared exception!
      try { 
        fitnessCalcImpl0.setSolution((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adamldavis.ga.FitnessCalcImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      fitnessCalcImpl0.solution = null;
      // Undeclared exception!
      try { 
        fitnessCalcImpl0.getMaxFitness();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adamldavis.ga.FitnessCalcImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      // Undeclared exception!
      try { 
        fitnessCalcImpl0.getFitness((Individual) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.adamldavis.ga.FitnessCalcImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      Individual individual0 = new Individual(fitnessCalcImpl0);
      int int0 = fitnessCalcImpl0.getFitness(individual0);
      assertEquals(64, fitnessCalcImpl0.getMaxFitness());
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      fitnessCalcImpl0.setSolution("M6l2uA1");
      assertEquals(7, fitnessCalcImpl0.getMaxFitness());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      fitnessCalcImpl0.setSolution("cF#60.h$(");
      assertEquals(9, fitnessCalcImpl0.getMaxFitness());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FitnessCalcImpl fitnessCalcImpl0 = new FitnessCalcImpl();
      int int0 = fitnessCalcImpl0.getMaxFitness();
      assertEquals(64, int0);
  }
}
