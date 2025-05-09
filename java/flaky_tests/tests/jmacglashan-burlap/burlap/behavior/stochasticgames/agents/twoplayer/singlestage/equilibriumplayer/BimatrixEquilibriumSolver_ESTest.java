/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 03:14:18 GMT 2022
 */

package burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.BimatrixEquilibriumSolver;
import burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.CorrelatedEquilibrium;
import burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MaxMax;
import burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MinMax;
import burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.Utilitarian;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BimatrixEquilibriumSolver_ESTest extends BimatrixEquilibriumSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      Utilitarian utilitarian0 = new Utilitarian();
      double[][] doubleArray1 = new double[2][5];
      double[] doubleArray2 = new double[7];
      doubleArray1[0] = doubleArray2;
      utilitarian0.solve(doubleArray1, doubleArray1);
      utilitarian0.solve(doubleArray0, doubleArray1);
      assertEquals(2, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Utilitarian utilitarian0 = new Utilitarian();
      double[][] doubleArray0 = new double[1][5];
      utilitarian0.solve(doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[8][8];
      // Undeclared exception!
      try { 
        utilitarian0.solve(doubleArray1, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.Utilitarian", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      Utilitarian utilitarian0 = new Utilitarian();
      double[][] doubleArray1 = new double[2][5];
      utilitarian0.solve(doubleArray0, doubleArray1);
      utilitarian0.solve(doubleArray0, doubleArray1);
      assertEquals(1.0E-8, BimatrixEquilibriumSolver.doubleEpislon, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Utilitarian utilitarian0 = new Utilitarian();
      double[][] doubleArray0 = new double[2][7];
      utilitarian0.solve(doubleArray0, doubleArray0);
      double[] doubleArray1 = utilitarian0.getLastComputedRowStrategy();
      assertNotNull(doubleArray1);
      assertEquals(2, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MaxMax maxMax0 = new MaxMax();
      double[][] doubleArray0 = new double[4][5];
      maxMax0.solve(doubleArray0, doubleArray0);
      double[] doubleArray1 = maxMax0.getLastComputedColStrategy();
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.2, 0.2, 0.2, 0.2, 0.2}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Utilitarian utilitarian0 = new Utilitarian();
      double[][] doubleArray0 = new double[8][1];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      utilitarian0.solve(doubleArray0, doubleArray0);
      double[] doubleArray2 = utilitarian0.getLastComputedColStrategy();
      assertNotNull(doubleArray2);
      assertEquals(0, doubleArray2.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = BimatrixEquilibriumSolver.doubleEquality(0.0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = BimatrixEquilibriumSolver.doubleEquality(0.0, 885.0041804349);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[7][5];
      MaxMax maxMax0 = new MaxMax();
      double[] doubleArray1 = maxMax0.computeRowStrategy(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.14285714285714285, 0.14285714285714285, 0.14285714285714285, 0.14285714285714285, 0.14285714285714285, 0.14285714285714285, 0.14285714285714285}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MaxMax maxMax0 = new MaxMax();
      double[][] doubleArray0 = new double[0][0];
      double[] doubleArray1 = maxMax0.computeRowStrategy(doubleArray0, doubleArray0);
      assertEquals(0, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      MaxMax maxMax0 = new MaxMax();
      double[] doubleArray1 = maxMax0.computeColStrategy(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MaxMax maxMax0 = new MaxMax();
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = maxMax0.computeColStrategy(doubleArray0, doubleArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MaxMax maxMax0 = new MaxMax();
      // Undeclared exception!
      try { 
        maxMax0.solve((double[][]) null, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MaxMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      MinMax minMax0 = new MinMax();
      // Undeclared exception!
      try { 
        minMax0.solve(doubleArray0, doubleArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // scpsolver/constraints/LinearConstraint
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MinMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Utilitarian utilitarian0 = new Utilitarian();
      // Undeclared exception!
      try { 
        utilitarian0.computeRowStrategy((double[][]) null, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.Utilitarian", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MinMax minMax0 = new MinMax();
      double[][] doubleArray0 = new double[0][9];
      // Undeclared exception!
      try { 
        minMax0.computeRowStrategy(doubleArray0, doubleArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // scpsolver/constraints/LinearConstraint
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MinMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[5][5];
      Utilitarian utilitarian0 = new Utilitarian();
      double[][] doubleArray1 = new double[0][3];
      // Undeclared exception!
      try { 
        utilitarian0.computeRowStrategy(doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.Utilitarian", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MaxMax maxMax0 = new MaxMax();
      // Undeclared exception!
      try { 
        maxMax0.computeColStrategy((double[][]) null, (double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MaxMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      CorrelatedEquilibrium correlatedEquilibrium0 = new CorrelatedEquilibrium();
      // Undeclared exception!
      try { 
        correlatedEquilibrium0.computeColStrategy(doubleArray0, doubleArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // scpsolver/constraints/LinearConstraint
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.CorrelatedEquilibrium", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MaxMax maxMax0 = new MaxMax();
      double[][] doubleArray0 = new double[0][6];
      // Undeclared exception!
      try { 
        maxMax0.computeColStrategy(doubleArray0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.MaxMax", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      Utilitarian utilitarian0 = new Utilitarian();
      utilitarian0.solve(doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[1][3];
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = 1.0E-8;
      doubleArray1[0] = doubleArray2;
      // Undeclared exception!
      try { 
        utilitarian0.solve(doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.Utilitarian", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      Utilitarian utilitarian0 = new Utilitarian();
      double[] doubleArray1 = utilitarian0.computeColStrategy(doubleArray0, doubleArray0);
      utilitarian0.solve(doubleArray0, doubleArray0);
      double[][] doubleArray2 = new double[4][2];
      doubleArray2[0] = doubleArray1;
      utilitarian0.solve(doubleArray2, doubleArray0);
      assertEquals(4, doubleArray2.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      Utilitarian utilitarian0 = new Utilitarian();
      double[][] doubleArray1 = new double[2][5];
      double[] doubleArray2 = new double[7];
      doubleArray1[0] = doubleArray2;
      utilitarian0.solve(doubleArray0, doubleArray0);
      utilitarian0.solve(doubleArray1, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      Utilitarian utilitarian0 = new Utilitarian();
      utilitarian0.solve(doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[0][6];
      // Undeclared exception!
      try { 
        utilitarian0.solve(doubleArray1, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("burlap.behavior.stochasticgames.agents.twoplayer.singlestage.equilibriumplayer.equilibriumsolvers.Utilitarian", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CorrelatedEquilibrium correlatedEquilibrium0 = new CorrelatedEquilibrium();
      double[] doubleArray0 = correlatedEquilibrium0.getLastComputedRowStrategy();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Utilitarian utilitarian0 = new Utilitarian();
      double[] doubleArray0 = utilitarian0.getLastComputedColStrategy();
      assertNull(doubleArray0);
  }
}
