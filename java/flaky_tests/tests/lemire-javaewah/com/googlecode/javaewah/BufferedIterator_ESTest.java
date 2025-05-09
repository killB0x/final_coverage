/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 00:19:59 GMT 2022
 */

package com.googlecode.javaewah;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.googlecode.javaewah.BufferedAndIterator;
import com.googlecode.javaewah.BufferedIterator;
import com.googlecode.javaewah.BufferedORIterator;
import com.googlecode.javaewah.BufferedXORIterator;
import com.googlecode.javaewah.CloneableIterator;
import com.googlecode.javaewah.EWAHCompressedBitmap;
import com.googlecode.javaewah.EWAHIterator;
import com.googlecode.javaewah.IteratingRLW;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BufferedIterator_ESTest extends BufferedIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(8);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardLiteralWords((-562L));
      bufferedIterator0.discardRunningWords();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedAndIterator bufferedAndIterator0 = new BufferedAndIterator(linkedList0, (-1640531535));
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedAndIterator0);
      bufferedIterator0.discardFirstWords((-1640531535));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 1);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap((-2176));
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      long long0 = bufferedIterator0.size();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap();
      eWAHCompressedBitmap0.addStreamOfEmptyWords(false, 2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      long long0 = bufferedIterator0.size();
      assertEquals(2608L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardLiteralWords((-8589934591L));
      long long0 = bufferedIterator0.size();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(8);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      long long0 = bufferedIterator0.getRunningLength();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap();
      eWAHCompressedBitmap0.addStreamOfEmptyWords(false, 2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      long long0 = bufferedIterator0.getRunningLength();
      assertEquals(2608L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 1);
      long[] longArray0 = new long[6];
      longArray0[0] = 1509L;
      LongBuffer longBuffer0 = LongBuffer.wrap(longArray0);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(longBuffer0);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.offerLast(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
      boolean boolean0 = bufferedIterator0.getRunningBit();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(8);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      boolean boolean0 = linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      boolean boolean1 = bufferedIterator0.getRunningBit();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(8);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      int int0 = bufferedIterator0.getNumberOfLiteralWords();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardLiteralWords((-1954L));
      int int0 = bufferedIterator0.getNumberOfLiteralWords();
      assertEquals(1954, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardLiteralWords((-8589934591L));
      int int0 = bufferedIterator0.getNumberOfLiteralWords();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2586);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(2586);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      long long0 = bufferedIterator0.getLiteralWordAt(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 1491);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = bufferedXORIterator0.buffer;
      eWAHCompressedBitmap0.addLiteralWord(1509L);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.offerLast(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      long long0 = bufferedIterator0.getLiteralWordAt(0);
      assertEquals(1509L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedAndIterator bufferedAndIterator0 = new BufferedAndIterator(linkedList0, 4);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedAndIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardLiteralWords((-1954L));
      linkedList0.add((IteratingRLW) bufferedIterator0);
      BufferedIterator bufferedIterator1 = bufferedIterator0.clone();
      // Undeclared exception!
      try { 
        bufferedIterator1.next();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1953 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah.LongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.getLiteralWordAt(64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 65 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah.LongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedAndIterator bufferedAndIterator0 = new BufferedAndIterator(linkedList0, (-51));
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedAndIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.discardRunningWords();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedAndIterator bufferedAndIterator0 = new BufferedAndIterator(linkedList0, (-51));
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedAndIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.discardLiteralWords((-51));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 0);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap();
      eWAHCompressedBitmap0.addLiteralWord(64L);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
      // Undeclared exception!
      bufferedIterator0.discardFirstWords(64L);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedAndIterator bufferedAndIterator0 = new BufferedAndIterator(linkedList0, 2608);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedAndIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.discardFirstWords(2608);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 1);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap();
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.clone();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.googlecode.javaewah.BufferedORIterator cannot be cast to class com.googlecode.javaewah.BufferedXORIterator (com.googlecode.javaewah.BufferedORIterator and com.googlecode.javaewah.BufferedXORIterator are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @30ea172d)
         //
         verifyException("com.googlecode.javaewah.BufferedORIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BufferedIterator bufferedIterator0 = null;
      try {
        bufferedIterator0 = new BufferedIterator((CloneableIterator<EWAHIterator>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap();
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedAndIterator bufferedAndIterator0 = new BufferedAndIterator(linkedList0, 1);
      BufferedIterator bufferedIterator0 = null;
      try {
        bufferedIterator0 = new BufferedIterator(bufferedAndIterator0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 1);
      long[] longArray0 = new long[4];
      longArray0[0] = (-891L);
      LongBuffer longBuffer0 = LongBuffer.wrap(longArray0);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(longBuffer0);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = null;
      try {
        bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(0) > toIndex(-446)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 1);
      long[] longArray0 = new long[7];
      longArray0[0] = (-3188L);
      LongBuffer longBuffer0 = LongBuffer.wrap(longArray0);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(longBuffer0);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = null;
      try {
        bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1594 out of bounds for length 1
         //
         verifyException("com.googlecode.javaewah.IteratorAggregation", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 1);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap();
      eWAHCompressedBitmap0.addLiteralWord(1);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
      boolean boolean0 = bufferedIterator0.next();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      boolean boolean0 = linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      boolean boolean1 = bufferedIterator0.next();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 1);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = bufferedORIterator0.buffer;
      eWAHCompressedBitmap0.addLiteralWord(1);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
      bufferedIterator0.discardFirstWords(1);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedAndIterator bufferedAndIterator0 = new BufferedAndIterator(linkedList0, 0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedAndIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.getRunningBit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.getRunningLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2586);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.getLiteralWordAt(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 956);
      int[] intArray0 = new int[3];
      intArray0[2] = 956;
      EWAHCompressedBitmap eWAHCompressedBitmap0 = EWAHCompressedBitmap.bitmapOf(intArray0);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
      boolean boolean0 = bufferedIterator0.next();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardRunningWords();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2586);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap();
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardLiteralWords(433L);
      bufferedIterator0.discardRunningWords();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2586);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap();
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardLiteralWords(0L);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(2608);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardLiteralWords((-1954L));
      bufferedIterator0.discardFirstWords(1L);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 1);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = bufferedORIterator0.buffer;
      eWAHCompressedBitmap0.addLiteralWord(1);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
      BufferedIterator bufferedIterator1 = new BufferedIterator(bufferedORIterator0);
      bufferedIterator1.discardFirstWords(1);
      assertFalse(bufferedIterator1.equals((Object)bufferedIterator0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 1491);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1491);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = new EWAHCompressedBitmap(byteBuffer0);
      eWAHCompressedBitmap0.addWord(62L, 3906);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      bufferedIterator0.discardFirstWords(1L);
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedXORIterator bufferedXORIterator0 = new BufferedXORIterator(linkedList0, 2608);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedXORIterator0);
      // Undeclared exception!
      try { 
        bufferedIterator0.getNumberOfLiteralWords();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah.BufferedIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedList<IteratingRLW> linkedList0 = new LinkedList<IteratingRLW>();
      BufferedORIterator bufferedORIterator0 = new BufferedORIterator(linkedList0, 1);
      EWAHCompressedBitmap eWAHCompressedBitmap0 = bufferedORIterator0.buffer;
      eWAHCompressedBitmap0.addLiteralWord(1);
      IteratingRLW iteratingRLW0 = eWAHCompressedBitmap0.getIteratingRLW();
      linkedList0.add(iteratingRLW0);
      BufferedIterator bufferedIterator0 = new BufferedIterator(bufferedORIterator0);
      linkedList0.add((IteratingRLW) bufferedIterator0);
      BufferedIterator bufferedIterator1 = new BufferedIterator(bufferedORIterator0);
      bufferedIterator1.discardFirstWords(1);
      assertEquals(0, linkedList0.size());
  }
}
