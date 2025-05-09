/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 00:22:22 GMT 2022
 */

package com.googlecode.javaewah32;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.googlecode.javaewah32.Buffer32;
import com.googlecode.javaewah32.IntArray;
import com.googlecode.javaewah32.IntBufferWrapper;
import java.nio.IntBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IntArray_ESTest extends IntArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.removeLastWord();
      // Undeclared exception!
      try { 
        intArray0.push_back((Buffer32) intArray0, 32768, 32768);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBuffer intBuffer0 = IntBuffer.allocate(1820);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0, 0);
      intBufferWrapper0.swap(intArray0);
      // Undeclared exception!
      try { 
        intArray0.expand(3535, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.expand(0, 1044);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntArray intArray0 = new IntArray((-4986));
      // Undeclared exception!
      try { 
        intArray0.expand(457, (-4986));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.push_back(1271);
      intArray0.orLastWord(2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.negateWord(2);
      intArray0.negateWord(2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      int[] intArray1 = new int[7];
      intArray1[0] = (-286);
      IntBuffer intBuffer0 = IntBuffer.wrap(intArray1);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0);
      intArray0.negative_push_back(intBufferWrapper0, 0, 3);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBuffer intBuffer0 = IntBuffer.allocate(1);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0);
      intArray0.push_back((Buffer32) intBufferWrapper0, 82, (-1551));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      int[] intArray1 = new int[9];
      IntBuffer intBuffer0 = IntBuffer.wrap(intArray1);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0);
      intArray0.push_back((Buffer32) intBufferWrapper0, 1, 1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.setWord(1, 1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntArray intArray0 = new IntArray(522);
      intArray0.orWord(245, 3538);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.push_back((Buffer32) intArray0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBuffer intBuffer0 = IntBuffer.allocate(1820);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0, 0);
      intBufferWrapper0.swap(intArray0);
      intArray0.sizeInWords();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.negative_push_back(intArray0, (-3510), (-3510));
      intArray0.sizeInWords();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.getWord(0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.negateWord(2);
      intArray0.getWord(2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.push_back(1273);
      intArray0.getLastWord();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.push_back((-2375));
      intArray0.getLastWord();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.removeLastWord();
      intArray0.clone();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.negative_push_back(intArray0, (-3510), (-3510));
      intArray0.clone();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntArray intArray0 = new IntArray((-2196));
      int[] intArray1 = new int[1];
      intArray1[0] = 1656;
      IntBuffer intBuffer0 = IntBuffer.wrap(intArray1);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0);
      intArray0.swap(intBufferWrapper0);
      intArray0.clone();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.push_back((-2375));
      intArray0.clone();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBuffer intBuffer0 = IntBuffer.allocate(32768);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0, 32768);
      // Undeclared exception!
      intArray0.swap(intBufferWrapper0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      // Undeclared exception!
      try { 
        intArray0.swap((Buffer32) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper((IntBuffer) null, (-105));
      // Undeclared exception!
      try { 
        intArray0.swap(intBufferWrapper0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -105
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBuffer intBuffer0 = IntBuffer.allocate(0);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0);
      // Undeclared exception!
      try { 
        intArray0.swap(intBufferWrapper0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.removeLastWord();
      // Undeclared exception!
      try { 
        intArray0.setLastWord((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.removeLastWord();
      // Undeclared exception!
      try { 
        intArray0.removeLastWord();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      // Undeclared exception!
      try { 
        intArray0.push_back((Buffer32) null, 490, 490);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBuffer intBuffer0 = IntBuffer.allocate(2526);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0);
      // Undeclared exception!
      try { 
        intArray0.push_back((Buffer32) intBufferWrapper0, 2526, 2526);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.negative_push_back(intArray0, 721, (-4692));
      // Undeclared exception!
      try { 
        intArray0.push_back(721);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -4691 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBuffer intBuffer0 = IntBuffer.allocate(3247);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0);
      // Undeclared exception!
      try { 
        intArray0.negative_push_back(intBufferWrapper0, 3247, 184);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntArray intArray1 = new IntArray();
      // Undeclared exception!
      try { 
        intArray0.negative_push_back(intArray1, 1351, 1351);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1351 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      // Undeclared exception!
      try { 
        intArray0.negateWord(1397);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1397 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.removeLastWord();
      // Undeclared exception!
      try { 
        intArray0.getLastWord();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      // Undeclared exception!
      try { 
        intArray0.collapse(7098, 7098);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.removeLastWord();
      intArray0.trim();
      // Undeclared exception!
      try { 
        intArray0.clear();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      // Undeclared exception!
      try { 
        intArray0.andWord((-1), (-1702));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      // Undeclared exception!
      try { 
        intArray0.setWord(307, (-464));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 307 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.sizeInWords();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IntArray intArray0 = new IntArray((-1));
      // Undeclared exception!
      try { 
        intArray0.orWord(1583, 705);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1583 out of bounds for length 1
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IntArray intArray0 = new IntArray(1810);
      // Undeclared exception!
      try { 
        intArray0.getWord(1810);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1810 out of bounds for length 1810
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.andWord(0, 1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.swap(intArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.collapse(0, 1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      // Undeclared exception!
      try { 
        intArray0.negative_push_back((Buffer32) null, 4, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.negative_push_back(intArray0, (-258), (-258));
      // Undeclared exception!
      try { 
        intArray0.trim();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -257
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      // Undeclared exception!
      try { 
        intArray0.push_back((Buffer32) intArray0, 1360, 1136);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBuffer intBuffer0 = IntBuffer.allocate(32768);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0);
      // Undeclared exception!
      intArray0.push_back((Buffer32) intBufferWrapper0, 2975, 32768);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntArray intArray1 = intArray0.clone();
      assertEquals(1, intArray1.sizeInWords());
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.removeLastWord();
      // Undeclared exception!
      try { 
        intArray0.andLastWord(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 4
         //
         verifyException("com.googlecode.javaewah32.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.push_back(1761);
      int int0 = intArray0.getWord(1);
      assertEquals(2, intArray0.sizeInWords());
      assertEquals(1761, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.andLastWord(0);
      assertEquals(1, intArray0.sizeInWords());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IntArray intArray0 = new IntArray((-545));
      int int0 = intArray0.getLastWord();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.clear();
      assertEquals(1, intArray0.sizeInWords());
      assertEquals(0, intArray0.getLastWord());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      IntBuffer intBuffer0 = IntBuffer.allocate(7033);
      IntBufferWrapper intBufferWrapper0 = new IntBufferWrapper(intBuffer0, 7033);
      intArray0.swap(intBufferWrapper0);
      intArray0.expand(1136, 1136);
      intArray0.collapse(7033, (-620));
      assertEquals(8169, intArray0.sizeInWords());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      assertEquals(1, intArray0.sizeInWords());
      
      intArray0.setLastWord((-1));
      assertEquals((-1), intArray0.getLastWord());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IntArray intArray0 = new IntArray();
      intArray0.ensureCapacity(55);
      assertEquals(1, intArray0.sizeInWords());
  }
}
