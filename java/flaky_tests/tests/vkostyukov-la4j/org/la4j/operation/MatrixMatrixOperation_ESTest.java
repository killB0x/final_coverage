/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 16:45:47 GMT 2022
 */

package org.la4j.operation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.sparse.CCSMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.MatrixOperation;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;
import org.la4j.operation.ooplace.OoPlaceKroneckerProduct;
import org.la4j.operation.ooplace.OoPlaceMatricesAddition;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MatrixMatrixOperation_ESTest extends MatrixMatrixOperation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(1, 1);
      OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new OoPlaceKroneckerProduct();
      MatrixOperation<Matrix> matrixOperation0 = ooPlaceKroneckerProduct0.partiallyApply(denseMatrix0);
      assertNotNull(matrixOperation0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      MatrixOperation<Matrix> matrixOperation0 = inPlaceCopyMatrixToMatrix0.partiallyApply((ColumnMajorSparseMatrix) null);
      assertNotNull(matrixOperation0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      MockRandom mockRandom0 = new MockRandom(0L);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.random(1, 1, (double) 1, (Random) mockRandom0);
      CRSMatrix cRSMatrix0 = (CRSMatrix)ooPlaceMatricesMultiplication0.apply(rowMajorSparseMatrix0, rowMajorSparseMatrix0);
      assertEquals(1, cRSMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(0, 0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 0);
      CCSMatrix cCSMatrix0 = (CCSMatrix)inPlaceCopyMatrixToMatrix0.apply(denseMatrix0, columnMajorSparseMatrix0);
      assertEquals(Double.NaN, cCSMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[7][2];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      inPlaceCopyMatrixToMatrix0.ensureApplicableTo(matrix0, matrix0);
      assertEquals(7, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.fromCSV("");
      assertEquals(0, columnMajorSparseMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[7][2];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      DenseMatrix denseMatrix0 = columnMajorSparseMatrix0.toDenseMatrix();
      assertEquals(7, denseMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 0);
      CCSMatrix cCSMatrix0 = (CCSMatrix)columnMajorSparseMatrix0.kroneckerProduct(columnMajorSparseMatrix0);
      assertEquals(0, cCSMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(0, 0);
      MatrixOperation<Matrix> matrixOperation0 = ooPlaceMatricesAddition0.partiallyApply(rowMajorSparseMatrix0);
      assertNotNull(matrixOperation0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.fromCSV("");
      assertTrue(rowMajorSparseMatrix0.isRowMajor());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(209, 209);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(209, 209);
      // Undeclared exception!
      inPlaceCopyMatrixToMatrix0.apply(denseMatrix0, columnMajorSparseMatrix0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 0);
      SparseMatrix sparseMatrix0 = columnMajorSparseMatrix0.toSparseMatrix();
      assertEquals(0, sparseMatrix0.rows());
  }
}
