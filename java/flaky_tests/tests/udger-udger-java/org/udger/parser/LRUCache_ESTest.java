/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 05:49:50 GMT 2022
 */

package org.udger.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.udger.parser.LRUCache;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LRUCache_ESTest extends LRUCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LRUCache<Integer, Integer> lRUCache0 = new LRUCache<Integer, Integer>((-1595));
      lRUCache0.setCapacity(1);
      assertEquals(1, lRUCache0.getCapacity());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LRUCache<Integer, LRUCache<Integer, Integer>> lRUCache0 = new LRUCache<Integer, LRUCache<Integer, Integer>>(0);
      int int0 = lRUCache0.getCapacity();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LRUCache<LRUCache<Integer, Integer>, Integer> lRUCache0 = new LRUCache<LRUCache<Integer, Integer>, Integer>(715);
      int int0 = lRUCache0.getCapacity();
      assertEquals(715, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LRUCache<LRUCache<Integer, Integer>, Integer> lRUCache0 = new LRUCache<LRUCache<Integer, Integer>, Integer>(1);
      LRUCache<Integer, Integer> lRUCache1 = new LRUCache<Integer, Integer>(1);
      Integer integer0 = lRUCache0.get(lRUCache1);
      LRUCache<Integer, LRUCache<Integer, Integer>> lRUCache2 = new LRUCache<Integer, LRUCache<Integer, Integer>>(1);
      lRUCache2.put(integer0, lRUCache1);
      LRUCache<Integer, Integer> lRUCache3 = lRUCache2.get(integer0);
      assertEquals(1, lRUCache3.getCapacity());
      assertNotNull(lRUCache3);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LRUCache<Integer, Integer> lRUCache0 = new LRUCache<Integer, Integer>((-1));
      Integer integer0 = new Integer(0);
      LRUCache<Integer, LRUCache<Integer, Integer>> lRUCache1 = new LRUCache<Integer, LRUCache<Integer, Integer>>(2045);
      lRUCache1.setCapacity(0);
      // Undeclared exception!
      try { 
        lRUCache1.put(integer0, lRUCache0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LRUCache<LRUCache<Integer, Integer>, Integer> lRUCache0 = new LRUCache<LRUCache<Integer, Integer>, Integer>(1);
      LRUCache<Integer, Integer> lRUCache1 = new LRUCache<Integer, Integer>(1);
      Integer integer0 = lRUCache0.get(lRUCache1);
      Integer integer1 = new Integer(1004);
      LRUCache<Integer, LRUCache<Integer, Integer>> lRUCache2 = new LRUCache<Integer, LRUCache<Integer, Integer>>(1);
      lRUCache2.put(integer1, lRUCache1);
      lRUCache2.put(integer0, lRUCache1);
      assertEquals(1, lRUCache2.getCapacity());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LRUCache<Integer, Integer> lRUCache0 = new LRUCache<Integer, Integer>(9);
      Integer integer0 = new Integer(9);
      lRUCache0.put(integer0, integer0);
      lRUCache0.put(integer0, integer0);
      assertEquals(9, lRUCache0.getCapacity());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LRUCache<Integer, Integer> lRUCache0 = new LRUCache<Integer, Integer>(9);
      Integer integer0 = new Integer(9);
      Integer integer1 = lRUCache0.get(integer0);
      Integer integer2 = new Integer((-93));
      lRUCache0.put(integer2, (Integer) null);
      lRUCache0.put(integer0, integer0);
      lRUCache0.put(integer1, integer1);
      lRUCache0.get(integer0);
      assertEquals(9, lRUCache0.getCapacity());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LRUCache<Integer, Integer> lRUCache0 = new LRUCache<Integer, Integer>(9);
      Integer integer0 = new Integer(9);
      Integer integer1 = lRUCache0.get(integer0);
      lRUCache0.put(integer0, integer0);
      lRUCache0.put(integer1, integer1);
      lRUCache0.get(integer0);
      assertEquals(9, lRUCache0.getCapacity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LRUCache<Integer, Integer> lRUCache0 = new LRUCache<Integer, Integer>(9);
      Integer integer0 = new Integer(9);
      Integer integer1 = new Integer((-93));
      lRUCache0.put(integer1, (Integer) null);
      lRUCache0.put(integer0, integer0);
      // Undeclared exception!
      try { 
        lRUCache0.setCapacity((-2808));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.udger.parser.LRUCache$Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LRUCache<Integer, Integer> lRUCache0 = new LRUCache<Integer, Integer>(9);
      // Undeclared exception!
      try { 
        lRUCache0.setCapacity((-2808));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LRUCache<LRUCache<Integer, Integer>, LRUCache<Integer, Integer>> lRUCache0 = new LRUCache<LRUCache<Integer, Integer>, LRUCache<Integer, Integer>>(9);
      lRUCache0.setCapacity(1);
      assertEquals(1, lRUCache0.getCapacity());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LRUCache<LRUCache<Integer, Integer>, LRUCache<Integer, Integer>> lRUCache0 = new LRUCache<LRUCache<Integer, Integer>, LRUCache<Integer, Integer>>(9);
      lRUCache0.setCapacity(9);
      assertEquals(9, lRUCache0.getCapacity());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LRUCache<LRUCache<Integer, Integer>, LRUCache<Integer, Integer>> lRUCache0 = new LRUCache<LRUCache<Integer, Integer>, LRUCache<Integer, Integer>>(9);
      lRUCache0.clear();
      assertEquals(9, lRUCache0.getCapacity());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LRUCache<Integer, Integer> lRUCache0 = new LRUCache<Integer, Integer>((-1));
      int int0 = lRUCache0.getCapacity();
      assertEquals((-1), int0);
  }
}
