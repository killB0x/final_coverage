/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 08:23:45 GMT 2022
 */

package edu.cornell.lassp.houle.RngPack;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.cornell.lassp.houle.RngPack.RanMT;
import edu.cornell.lassp.houle.RngPack.RandomElement;
import edu.cornell.lassp.houle.RngPack.RandomShuffle;
import edu.cornell.lassp.houle.RngPack.Ranecu;
import edu.cornell.lassp.houle.RngPack.Ranlux;
import edu.cornell.lassp.houle.RngPack.Ranmar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RandomShuffle_ESTest extends RandomShuffle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ranmar ranmar0 = new Ranmar(0L);
      RandomShuffle randomShuffle0 = new RandomShuffle(ranmar0, ranmar0, 452);
      Ranlux ranlux0 = new Ranlux((-99), 2688L);
      randomShuffle0.generatorA = (RandomElement) ranlux0;
      double double0 = randomShuffle0.raw();
      assertEquals(0.4224936366081238, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu(574L);
      Ranlux ranlux0 = new Ranlux();
      RandomShuffle randomShuffle0 = new RandomShuffle(ranecu0, ranlux0, 4);
      assertEquals(827313948L, ranecu0.getSeed());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ranlux ranlux0 = new Ranlux();
      RandomShuffle randomShuffle0 = new RandomShuffle(ranlux0, ranlux0, 3);
      double[] doubleArray0 = new double[5];
      randomShuffle0.deck = doubleArray0;
      double double0 = randomShuffle0.raw();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ranlux ranlux0 = new Ranlux();
      ranlux0.carry = 1.0F;
      RandomShuffle randomShuffle0 = new RandomShuffle(ranlux0, ranlux0, 4);
      double double0 = randomShuffle0.raw();
      assertEquals((-0.4601817727088928), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ranlux ranlux0 = new Ranlux((-2260), 1);
      RandomShuffle randomShuffle0 = new RandomShuffle(ranlux0, ranlux0, 1187);
      ranlux0.twom24 = (-1.0F);
      randomShuffle0.raw();
      randomShuffle0.raw();
      randomShuffle0.gaussian(0.9954394102096558);
      // Undeclared exception!
      randomShuffle0.raw();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RandomShuffle randomShuffle0 = new RandomShuffle((RandomElement) null, (RandomElement) null, 0);
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

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ranmar ranmar0 = new Ranmar();
      RandomShuffle randomShuffle0 = new RandomShuffle(ranmar0, ranmar0, 0);
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
  public void test07()  throws Throwable  {
      Ranecu ranecu0 = new Ranecu();
      RandomShuffle randomShuffle0 = new RandomShuffle(ranecu0, ranecu0, 67890);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RandomShuffle randomShuffle0 = null;
      try {
        randomShuffle0 = new RandomShuffle((RandomElement) null, (RandomElement) null, 3019);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RanMT ranMT0 = new RanMT();
      RandomShuffle randomShuffle0 = null;
      try {
        randomShuffle0 = new RandomShuffle(ranMT0, ranMT0, (-4));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -4
         //
         verifyException("edu.cornell.lassp.houle.RngPack.RandomShuffle", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ranlux ranlux0 = new Ranlux();
      ranlux0.j24 = (-2998);
      RandomShuffle randomShuffle0 = null;
      try {
        randomShuffle0 = new RandomShuffle(ranlux0, ranlux0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
