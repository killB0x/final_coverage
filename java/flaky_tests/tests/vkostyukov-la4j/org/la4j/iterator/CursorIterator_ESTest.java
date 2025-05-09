/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 16:46:27 GMT 2022
 */

package org.la4j.iterator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.iterator.CursorIterator;
import org.la4j.iterator.CursorToColumnMajorMatrixIterator;
import org.la4j.iterator.CursorToRowMajorMatrixIterator;
import org.la4j.iterator.CursorToVectorIterator;
import org.la4j.iterator.JoinFunction;
import org.la4j.iterator.MatrixIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CursorIterator_ESTest extends CursorIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, (-4360), (-4360));
      CursorToColumnMajorMatrixIterator cursorToColumnMajorMatrixIterator0 = new CursorToColumnMajorMatrixIterator((CursorIterator) null, (-4360), (-4360));
      MatrixIterator matrixIterator0 = cursorToRowMajorMatrixIterator0.orElseSubtract(cursorToColumnMajorMatrixIterator0);
      CursorToVectorIterator cursorToVectorIterator0 = new CursorToVectorIterator(matrixIterator0, (-4360));
      // Undeclared exception!
      try { 
        cursorToVectorIterator0.andAlsoDivide(cursorToVectorIterator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToRowMajorMatrixIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, 188, 188);
      // Undeclared exception!
      try { 
        cursorToRowMajorMatrixIterator0.set(188);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToRowMajorMatrixIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, 149, 149);
      JoinFunction joinFunction0 = JoinFunction.MUL;
      CursorIterator cursorIterator0 = cursorToRowMajorMatrixIterator0.orElse((CursorIterator) null, joinFunction0);
      // Undeclared exception!
      try { 
        cursorIterator0.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToRowMajorMatrixIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, 134, 134);
      CursorToColumnMajorMatrixIterator cursorToColumnMajorMatrixIterator0 = new CursorToColumnMajorMatrixIterator((CursorIterator) null, 134, 134);
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator1 = (CursorToRowMajorMatrixIterator)cursorToRowMajorMatrixIterator0.orElseSubtract(cursorToColumnMajorMatrixIterator0);
      // Undeclared exception!
      try { 
        cursorToRowMajorMatrixIterator1.cursor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToRowMajorMatrixIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CursorToVectorIterator cursorToVectorIterator0 = new CursorToVectorIterator((CursorIterator) null, (-96));
      // Undeclared exception!
      try { 
        cursorToVectorIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // This will be supported in 0.6.0.
         //
         verifyException("org.la4j.iterator.CursorIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, 149, 149);
      JoinFunction joinFunction0 = JoinFunction.MOD;
      // Undeclared exception!
      try { 
        cursorToRowMajorMatrixIterator0.andAlso((CursorIterator) null, joinFunction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToRowMajorMatrixIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, 149, 149);
      JoinFunction joinFunction0 = JoinFunction.MUL;
      CursorIterator cursorIterator0 = cursorToRowMajorMatrixIterator0.orElse((CursorIterator) null, joinFunction0);
      // Undeclared exception!
      try { 
        cursorIterator0.set(149);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Composed iterators are read-only for now.
         //
         verifyException("org.la4j.iterator.CursorIterator$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, 442, 442);
      JoinFunction joinFunction0 = JoinFunction.SUB;
      CursorIterator cursorIterator0 = cursorToRowMajorMatrixIterator0.orElse((CursorIterator) null, joinFunction0);
      // Undeclared exception!
      try { 
        cursorIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToRowMajorMatrixIterator", e);
      }
  }
}
