/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 08:20:09 GMT 2022
 */

package com.easyinnova.tiff.model.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.easyinnova.tiff.model.types.SRational;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SRational_ESTest extends SRational_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SRational sRational0 = new SRational((-1626), (-1626));
      // Undeclared exception!
      try { 
        sRational0.getNumerator();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"com.easyinnova.tiff.model.types.SLong@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SRational sRational0 = new SRational(1, 705);
      // Undeclared exception!
      try { 
        sRational0.getDenominator();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"com.easyinnova.tiff.model.types.SLong@0000000003\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SRational sRational0 = new SRational((-1626), (-1626));
      String string0 = sRational0.toString();
      assertEquals("-1626/-1626", string0);
      assertEquals(8, sRational0.getTypeSize());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SRational sRational0 = new SRational(0, 0);
      sRational0.setNumerator(0);
      assertEquals(8, sRational0.getTypeSize());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SRational sRational0 = new SRational(2087, 2087);
      sRational0.setDenominator(2087);
      assertEquals(8, sRational0.getTypeSize());
  }
}
