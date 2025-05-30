/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 22:25:21 GMT 2022
 */

package edu.cornell.lassp.houle.RngPack;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.cornell.lassp.houle.RngPack.RandomElement;
import edu.cornell.lassp.houle.RngPack.RandomJava;
import edu.cornell.lassp.houle.RngPack.RandomShuffle;
import edu.cornell.lassp.houle.RngPack.Ranlux;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RandomShuffle_ESTest extends RandomShuffle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomJava randomJava0 = new RandomJava();
      RandomShuffle randomShuffle0 = new RandomShuffle(randomJava0, randomJava0, 96);
      RandomShuffle randomShuffle1 = new RandomShuffle(randomJava0, randomShuffle0, 553);
      double double0 = randomShuffle1.raw();
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RandomJava randomJava0 = new RandomJava();
      RandomShuffle randomShuffle0 = new RandomShuffle(randomJava0, randomJava0, 96);
      randomShuffle0.raw();
      double double0 = randomShuffle0.raw();
      assertEquals(0.6, double0, 0.01);
      
      double double1 = randomShuffle0.raw();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Ranlux ranlux0 = new Ranlux();
      ranlux0.powlaw((-2107.6437364644644), 0.0);
      RandomShuffle randomShuffle0 = new RandomShuffle(ranlux0, ranlux0, 3);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-2107.6437364644644);
      randomShuffle0.deck = doubleArray0;
      double double0 = randomShuffle0.raw();
      assertEquals((-2107.6437364644644), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Ranlux ranlux0 = new Ranlux();
      RandomShuffle randomShuffle0 = new RandomShuffle(ranlux0, ranlux0, 1196);
      randomShuffle0.raw();
      // Undeclared exception!
      randomShuffle0.raw();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RandomJava randomJava0 = new RandomJava();
      RandomShuffle randomShuffle0 = new RandomShuffle(randomJava0, randomJava0, 0);
      // Undeclared exception!
      try { 
        randomShuffle0.raw();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 0
         //
         verifyException("edu.cornell.lassp.houle.RngPack.RandomShuffle", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RandomJava randomJava0 = new RandomJava();
      RandomShuffle randomShuffle0 = new RandomShuffle(randomJava0, randomJava0, 12345);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RandomShuffle randomShuffle0 = null;
      try {
        randomShuffle0 = new RandomShuffle((RandomElement) null, (RandomElement) null, 1147);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RandomJava randomJava0 = new RandomJava();
      RandomShuffle randomShuffle0 = null;
      try {
        randomShuffle0 = new RandomShuffle(randomJava0, randomJava0, (-1110));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1110
         //
         verifyException("edu.cornell.lassp.houle.RngPack.RandomShuffle", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Ranlux ranlux0 = new Ranlux();
      ranlux0.i24 = (-140);
      RandomShuffle randomShuffle0 = null;
      try {
        randomShuffle0 = new RandomShuffle(ranlux0, ranlux0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Ranlux ranlux0 = new Ranlux();
      RandomShuffle randomShuffle0 = new RandomShuffle(ranlux0, (RandomElement) null, 3);
      // Undeclared exception!
      try { 
        randomShuffle0.raw();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.cornell.lassp.houle.RngPack.RandomShuffle", e);
      }
  }
}
