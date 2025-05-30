/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 00:43:14 GMT 2022
 */

package com.googlecode.javaewah;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.googlecode.javaewah.BitCounter;
import com.googlecode.javaewah.Buffer;
import com.googlecode.javaewah.LongArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BitCounter_ESTest extends BitCounter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      LongArray longArray0 = new LongArray();
      longArray0.push_back(3912L);
      // Undeclared exception!
      try { 
        bitCounter0.addStreamOfNegatedLiteralWords(longArray0, 1, 3400);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      LongArray longArray0 = new LongArray();
      bitCounter0.addStreamOfNegatedLiteralWords(longArray0, 35, (-1));
      assertEquals(0L, longArray0.getLastWord());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      LongArray longArray0 = new LongArray(3401);
      bitCounter0.addStreamOfLiteralWords(longArray0, 2702, Integer.MAX_VALUE);
      assertEquals(0L, longArray0.getLastWord());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      bitCounter0.addStreamOfEmptyWords(true, (-150L));
      int int0 = bitCounter0.getCount();
      assertEquals((-9600), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      // Undeclared exception!
      try { 
        bitCounter0.addStreamOfNegatedLiteralWords((Buffer) null, 1, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BitCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      // Undeclared exception!
      try { 
        bitCounter0.addStreamOfLiteralWords((Buffer) null, 0, 225);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BitCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      LongArray longArray0 = new LongArray(3401);
      // Undeclared exception!
      try { 
        bitCounter0.addStreamOfLiteralWords(longArray0, 889, 3401);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3401 out of bounds for length 3401
         //
         verifyException("com.googlecode.javaewah.LongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      bitCounter0.addLiteralWord(1L);
      assertEquals(1, bitCounter0.getCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      bitCounter0.addStreamOfEmptyWords(false, 121);
      assertEquals(0, bitCounter0.getCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      LongArray longArray0 = new LongArray();
      bitCounter0.addStreamOfLiteralWords(longArray0, 3, 1);
      assertEquals(0, bitCounter0.getCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      bitCounter0.addWord((-3014L));
      int int0 = bitCounter0.getCount();
      assertEquals(57, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      LongArray longArray0 = new LongArray();
      bitCounter0.addStreamOfNegatedLiteralWords(longArray0, 1, 3);
      assertEquals(192, bitCounter0.getCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      bitCounter0.setSizeInBitsWithinLastWord(1);
      assertEquals(0, bitCounter0.getCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      int int0 = bitCounter0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BitCounter bitCounter0 = new BitCounter();
      bitCounter0.clear();
      assertEquals(0, bitCounter0.getCount());
  }
}
