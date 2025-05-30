/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 16:06:16 GMT 2022
 */

package org.addition.epanet.msx;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.addition.epanet.msx.Chemical;
import org.addition.epanet.msx.ENToolkit2;
import org.addition.epanet.msx.EnumTypes;
import org.addition.epanet.msx.EpanetMSX;
import org.addition.epanet.msx.Quality;
import org.addition.epanet.msx.Solvers.JacobianInterface;
import org.addition.epanet.msx.Solvers.Newton;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Chemical_ESTest extends Chemical_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Quality quality0 = epanetMSX0.getQuality();
      Chemical chemical0 = quality0.chemical;
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        chemical0.getTankEquil(6, doubleArray0, 1, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[3];
      JacobianInterface.Operation jacobianInterface_Operation0 = JacobianInterface.Operation.PIPES_EQUIL;
      // Undeclared exception!
      try { 
        chemical0.solve(4, doubleArray0, 1, doubleArray0, 5, jacobianInterface_Operation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.getChemical();
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        chemical0.getTankDcDt(39.725, doubleArray0, 1, (double[]) null, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Quality quality0 = epanetMSX0.getQuality();
      Chemical chemical0 = quality0.chemical;
      double[] doubleArray0 = new double[2];
      JacobianInterface.Operation jacobianInterface_Operation0 = JacobianInterface.Operation.TANKS_EQUIL;
      // Undeclared exception!
      try { 
        chemical0.solve(14, doubleArray0, 1, doubleArray0, 26, jacobianInterface_Operation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      JacobianInterface.Operation jacobianInterface_Operation0 = JacobianInterface.Operation.PIPES_DC_DT_CONCENTRATIONS;
      // Undeclared exception!
      try { 
        chemical0.solve(2446.6, (double[]) null, 1, (double[]) null, 1, jacobianInterface_Operation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.getChemical();
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        chemical0.getPipeDcDt(0, doubleArray0, 1, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      // Undeclared exception!
      try { 
        chemical0.getTankVariableValue((-1246));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.getChemical();
      chemical0.loadDependencies(epanetMSX0);
      assertEquals(0L, epanetMSX0.getResultsOffset());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      chemical0.setTankChemistry();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      chemical0.setSpeciesChemistry();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      double[] doubleArray0 = new double[10];
      chemical0.evalTankFormulas(doubleArray0);
      assertEquals(10, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      double[] doubleArray0 = new double[6];
      chemical0.evalPipeFormulas(doubleArray0);
      assertEquals(6, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[2];
      JacobianInterface.Operation jacobianInterface_Operation0 = JacobianInterface.Operation.TANKS_DC_DT_CONCENTRATIONS;
      chemical0.solve((-809.286981183), doubleArray0, 0, doubleArray0, 655, jacobianInterface_Operation0);
      assertEquals(2, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Quality quality0 = epanetMSX0.mQuality;
      Chemical chemical0 = quality0.chemical;
      // Undeclared exception!
      try { 
        chemical0.evalTankReactions(1, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[2];
      chemical0.MSXchem_open();
      JacobianInterface.Operation jacobianInterface_Operation0 = JacobianInterface.Operation.TANKS_DC_DT_CONCENTRATIONS;
      // Undeclared exception!
      try { 
        chemical0.solve(2, doubleArray0, 2, doubleArray0, 0, jacobianInterface_Operation0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      // Undeclared exception!
      try { 
        chemical0.loadDependencies((EpanetMSX) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        chemical0.getTankEquil(0, doubleArray0, 3441, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      // Undeclared exception!
      try { 
        chemical0.getTankDcDt(0, (double[]) null, 6, (double[]) null, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.getChemical();
      chemical0.MSXchem_open();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        chemical0.getTankDcDt(0, doubleArray0, 1393, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.mChemical;
      File file0 = MockFile.createTempFile("m&n[P~A&", "m&n[P~A&");
      epanetMSX0.load(file0);
      // Undeclared exception!
      try { 
        chemical0.getPipeVariableValue((-142));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -142 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        chemical0.getPipeEquil(0, doubleArray0, 117, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.getChemical();
      chemical0.MSXchem_open();
      // Undeclared exception!
      try { 
        chemical0.getPipeDcDt(0, (double[]) null, 201, (double[]) null, 201);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        chemical0.getPipeDcDt(0, doubleArray0, 30, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      // Undeclared exception!
      try { 
        chemical0.evalPipeReactions(42, 42);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Quality quality0 = epanetMSX0.getQuality();
      quality0.MSXqual_open();
      Chemical chemical0 = quality0.chemical;
      // Undeclared exception!
      try { 
        chemical0.evalPipeReactions(9, 1473L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 9 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      // Undeclared exception!
      try { 
        chemical0.evalHydVariables(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      File file0 = MockFile.createTempFile("66H", "66H");
      epanetMSX0.load(file0);
      Chemical chemical0 = epanetMSX0.mChemical;
      // Undeclared exception!
      try { 
        chemical0.evalHydVariables(6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 6 out of bounds for length 1
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      // Undeclared exception!
      try { 
        chemical0.MSXchem_react(1642);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      // Undeclared exception!
      try { 
        chemical0.MSXchem_open();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[9];
      JacobianInterface.Operation jacobianInterface_Operation0 = JacobianInterface.Operation.TANKS_EQUIL;
      chemical0.solve(28.317, doubleArray0, 0, doubleArray0, 0, jacobianInterface_Operation0);
      assertEquals(9, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.mChemical;
      JacobianInterface.Operation jacobianInterface_Operation0 = JacobianInterface.Operation.PIPES_EQUIL;
      chemical0.solve(1463.02, (double[]) null, (-10), (double[]) null, 5, jacobianInterface_Operation0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.getChemical();
      double[] doubleArray0 = new double[7];
      JacobianInterface.Operation jacobianInterface_Operation0 = JacobianInterface.Operation.PIPES_DC_DT_CONCENTRATIONS;
      chemical0.solve(39.725, doubleArray0, (-2372), doubleArray0, 1274, jacobianInterface_Operation0);
      assertEquals(7, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[9];
      chemical0.getTankEquil(8.0, doubleArray0, (-1143), doubleArray0);
      assertEquals(9, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        chemical0.getPipeEquil(0, doubleArray0, 117, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[7];
      chemical0.getPipeEquil(6, doubleArray0, 0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[0];
      chemical0.getTankDcDt(0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.getChemical();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        chemical0.getTankDcDt(0, doubleArray0, 1393, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.getChemical();
      double[] doubleArray0 = new double[2];
      chemical0.getTankDcDt(0, doubleArray0, 0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.getChemical();
      // Undeclared exception!
      try { 
        chemical0.getPipeDcDt(0, (double[]) null, 201, (double[]) null, 201);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[0];
      chemical0.getPipeDcDt(0, doubleArray0, 0, doubleArray0, 0);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      double[] doubleArray0 = new double[2];
      chemical0.getPipeDcDt(0, doubleArray0, 0, doubleArray0);
      assertEquals(2, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      // Undeclared exception!
      try { 
        chemical0.getTankVariableValue(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      double double0 = chemical0.getTankVariableValue(3);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      double double0 = chemical0.getPipeVariableValue(491);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      // Undeclared exception!
      try { 
        chemical0.getPipeVariableValue(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.getChemical();
      int int0 = chemical0.MSXchem_open();
      assertEquals(0, int0);
      
      int int1 = chemical0.evalTankEquil(doubleArray0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Chemical chemical0 = epanetMSX0.getChemical();
      // Undeclared exception!
      try { 
        chemical0.evalTankEquil(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      double[] doubleArray0 = new double[5];
      Newton newton0 = new Newton();
      chemical0.newton = newton0;
      int int0 = chemical0.evalPipeEquil(doubleArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        chemical0.evalPipeEquil(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.addition.epanet.msx.Chemical", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Chemical chemical0 = new Chemical();
      EnumTypes.ObjectTypes enumTypes_ObjectTypes0 = EnumTypes.ObjectTypes.NODE;
      double[] doubleArray0 = new double[3];
      int int0 = chemical0.MSXchem_equil(enumTypes_ObjectTypes0, doubleArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EpanetMSX epanetMSX0 = new EpanetMSX((ENToolkit2) null);
      Quality quality0 = epanetMSX0.getQuality();
      Chemical chemical0 = quality0.chemical;
      double[] doubleArray0 = new double[4];
      EnumTypes.ObjectTypes enumTypes_ObjectTypes0 = EnumTypes.ObjectTypes.LINK;
      int int0 = chemical0.MSXchem_equil(enumTypes_ObjectTypes0, doubleArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.mChemical;
      int int0 = chemical0.MSXchem_react(2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      org.addition.epanet.network.Network network0 = new org.addition.epanet.network.Network();
      ENToolkit2 eNToolkit2_0 = new ENToolkit2(network0);
      EpanetMSX epanetMSX0 = new EpanetMSX(eNToolkit2_0);
      Chemical chemical0 = epanetMSX0.mChemical;
      chemical0.MSXchem_open();
      double double0 = chemical0.getPipeVariableValue(2);
      assertEquals(0.0, double0, 0.01);
  }
}
