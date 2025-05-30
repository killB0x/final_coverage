/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 12:08:31 GMT 2022
 */

package com.insightml.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.insightml.utils.Utils;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(234);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) integer0;
      objectArray0[1] = (Object) integer0;
      objectArray0[2] = (Object) integer0;
      objectArray0[3] = (Object) integer0;
      double[] doubleArray0 = Utils.toDouble(objectArray0);
      assertArrayEquals(new double[] {234.0, 234.0, 234.0, 234.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Utils.setRandomSeed(321);
      int int0 = Utils.getRandomSeed();
      assertEquals(321, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "ML-D`";
      // Undeclared exception!
      try { 
        Utils.toDouble(objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.toDouble((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.insightml.utils.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        Utils.toDouble(objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null
         //
         verifyException("com.insightml.utils.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      double[] doubleArray0 = Utils.toDouble(objectArray0);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.toFloat("%F1w$y IK$E_qJi");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      float float0 = Utils.toFloat("true");
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        Utils.toFloat(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.Object@66985c69
         //
         verifyException("com.insightml.utils.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      float float0 = Utils.toFloat(integer0);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      float float0 = Utils.toFloat("false");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = Utils.toDouble((Object) "false");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = Utils.toDouble((Object) "true");
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.toDouble((Object) "%F1wCy IK$_^qJi");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer((-1726630692));
      double double0 = Utils.toDouble((Object) integer0);
      assertEquals((-1.726630692E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        Utils.toDouble(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.Object@8dc014f
         //
         verifyException("com.insightml.utils.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Utils.setRandomSeed((-1));
      int int0 = Utils.getRandomSeed();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Random random0 = Utils.random();
      assertNotNull(random0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Utils.getRandomSeed();
      assertEquals(0, int0);
  }
}
