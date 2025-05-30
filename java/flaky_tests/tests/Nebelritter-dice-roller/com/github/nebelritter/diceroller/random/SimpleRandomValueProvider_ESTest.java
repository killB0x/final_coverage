/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 23 23:45:49 GMT 2022
 */

package com.github.nebelritter.diceroller.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.nebelritter.diceroller.random.SimpleRandomValueProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleRandomValueProvider_ESTest extends SimpleRandomValueProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random.setNextRandom((-1));
      SimpleRandomValueProvider simpleRandomValueProvider0 = new SimpleRandomValueProvider();
      int int0 = simpleRandomValueProvider0.nextInt((-411));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleRandomValueProvider simpleRandomValueProvider0 = new SimpleRandomValueProvider();
      // Undeclared exception!
      try { 
        simpleRandomValueProvider0.nextInt(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleRandomValueProvider simpleRandomValueProvider0 = new SimpleRandomValueProvider();
      boolean boolean0 = simpleRandomValueProvider0.nextBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimpleRandomValueProvider simpleRandomValueProvider0 = new SimpleRandomValueProvider();
      int int0 = simpleRandomValueProvider0.nextInt((-411));
      assertEquals(0, int0);
  }
}
