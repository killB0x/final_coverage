/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 16:36:23 GMT 2022
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
import org.la4j.iterator.MatrixIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MatrixIterator_ESTest extends MatrixIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, 1969, (-1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, 0, 0);
      CursorToColumnMajorMatrixIterator cursorToColumnMajorMatrixIterator0 = new CursorToColumnMajorMatrixIterator(cursorToRowMajorMatrixIterator0, 0, 0);
      MatrixIterator matrixIterator0 = cursorToRowMajorMatrixIterator0.orElseSubtract(cursorToColumnMajorMatrixIterator0);
      assertFalse(matrixIterator0.equals((Object)cursorToRowMajorMatrixIterator0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CursorToRowMajorMatrixIterator cursorToRowMajorMatrixIterator0 = new CursorToRowMajorMatrixIterator((CursorIterator) null, 1, 1);
      CursorToVectorIterator cursorToVectorIterator0 = new CursorToVectorIterator(cursorToRowMajorMatrixIterator0, 0);
      CursorToColumnMajorMatrixIterator cursorToColumnMajorMatrixIterator0 = new CursorToColumnMajorMatrixIterator(cursorToVectorIterator0, 0, 0);
      MatrixIterator matrixIterator0 = cursorToColumnMajorMatrixIterator0.orElseAdd(cursorToColumnMajorMatrixIterator0);
      assertNotSame(cursorToColumnMajorMatrixIterator0, matrixIterator0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CursorToColumnMajorMatrixIterator cursorToColumnMajorMatrixIterator0 = new CursorToColumnMajorMatrixIterator((CursorIterator) null, 0, 0);
      // Undeclared exception!
      try { 
        cursorToColumnMajorMatrixIterator0.rowIndex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToColumnMajorMatrixIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CursorToColumnMajorMatrixIterator cursorToColumnMajorMatrixIterator0 = new CursorToColumnMajorMatrixIterator((CursorIterator) null, 0, 0);
      // Undeclared exception!
      try { 
        cursorToColumnMajorMatrixIterator0.columnIndex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToColumnMajorMatrixIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CursorToColumnMajorMatrixIterator cursorToColumnMajorMatrixIterator0 = new CursorToColumnMajorMatrixIterator((CursorIterator) null, (-12), (-12));
      // Undeclared exception!
      try { 
        cursorToColumnMajorMatrixIterator0.andAlsoMultiply((MatrixIterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToColumnMajorMatrixIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CursorToColumnMajorMatrixIterator cursorToColumnMajorMatrixIterator0 = new CursorToColumnMajorMatrixIterator((CursorIterator) null, (-16), (-16));
      // Undeclared exception!
      try { 
        cursorToColumnMajorMatrixIterator0.andAlsoDivide(cursorToColumnMajorMatrixIterator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.iterator.CursorToColumnMajorMatrixIterator", e);
      }
  }
}
