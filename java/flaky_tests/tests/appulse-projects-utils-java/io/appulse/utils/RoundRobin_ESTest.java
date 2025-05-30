/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 05:26:27 GMT 2022
 */

package io.appulse.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.appulse.utils.RoundRobin;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RoundRobin_ESTest extends RoundRobin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.addFirst((Integer) null);
      RoundRobin<Integer> roundRobin0 = null;
      try {
        roundRobin0 = new RoundRobin<Integer>(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.appulse.utils.RoundRobin", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-125));
      linkedList0.add(integer0);
      linkedList0.offerLast(integer0);
      RoundRobin<Integer> roundRobin0 = new RoundRobin<Integer>(linkedList0);
      Integer integer1 = roundRobin0.getNext();
      assertEquals((-125), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      RoundRobin<Integer> roundRobin0 = null;
      try {
        roundRobin0 = new RoundRobin<Integer>(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Elements collection is empty
         //
         verifyException("io.appulse.utils.RoundRobin", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RoundRobin<Integer> roundRobin0 = null;
      try {
        roundRobin0 = new RoundRobin<Integer>((Collection<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // collection is marked non-null but is null
         //
         verifyException("io.appulse.utils.RoundRobin", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      RoundRobin<Integer> roundRobin0 = null;
      try {
        roundRobin0 = new RoundRobin<Integer>(integerArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Elements array is empty
         //
         verifyException("io.appulse.utils.RoundRobin", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RoundRobin<Integer> roundRobin0 = null;
      try {
        roundRobin0 = new RoundRobin<Integer>((Integer[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // elements is marked non-null but is null
         //
         verifyException("io.appulse.utils.RoundRobin", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      RoundRobin<Integer> roundRobin0 = new RoundRobin<Integer>(integerArray0);
      Integer integer0 = roundRobin0.getNext();
      assertNull(integer0);
  }
}
