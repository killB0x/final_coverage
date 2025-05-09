/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:02:47 GMT 2022
 */

package net.imglib2.type.volatiles;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.type.logic.BoolType;
import net.imglib2.type.numeric.ARGBDoubleType;
import net.imglib2.type.volatiles.VolatileNumericType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VolatileNumericType_ESTest extends VolatileNumericType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoolType boolType0 = new BoolType();
      VolatileNumericType<BoolType> volatileNumericType0 = new VolatileNumericType<BoolType>(boolType0);
      VolatileNumericType<BoolType> volatileNumericType1 = volatileNumericType0.copy();
      assertNotSame(volatileNumericType0, volatileNumericType1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoolType boolType0 = new BoolType();
      VolatileNumericType<BoolType> volatileNumericType0 = new VolatileNumericType<BoolType>(boolType0);
      VolatileNumericType<BoolType> volatileNumericType1 = new VolatileNumericType<BoolType>(boolType0, false);
      volatileNumericType0.set(volatileNumericType1);
      VolatileNumericType<BoolType> volatileNumericType2 = volatileNumericType0.copy();
      assertTrue(volatileNumericType2.equals((Object)volatileNumericType0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VolatileNumericType<BoolType> volatileNumericType0 = new VolatileNumericType<BoolType>((BoolType) null);
      // Undeclared exception!
      try { 
        volatileNumericType0.createVariable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.volatiles.VolatileNumericType", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ARGBDoubleType aRGBDoubleType0 = new ARGBDoubleType(0.0, 0.0F, 0.0F, (-1.0));
      VolatileNumericType<ARGBDoubleType> volatileNumericType0 = new VolatileNumericType<ARGBDoubleType>(aRGBDoubleType0, false);
      VolatileNumericType<ARGBDoubleType> volatileNumericType1 = volatileNumericType0.createVariable();
      assertTrue(volatileNumericType1.isValid());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VolatileNumericType<BoolType> volatileNumericType0 = new VolatileNumericType<BoolType>((BoolType) null);
      // Undeclared exception!
      try { 
        volatileNumericType0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.type.volatiles.VolatileNumericType", e);
      }
  }
}
