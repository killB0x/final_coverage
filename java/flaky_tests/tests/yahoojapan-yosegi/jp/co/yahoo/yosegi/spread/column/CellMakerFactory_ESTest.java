/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:52:41 GMT 2022
 */

package jp.co.yahoo.yosegi.spread.column;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import jp.co.yahoo.yosegi.spread.column.CellMakerFactory;
import jp.co.yahoo.yosegi.spread.column.ColumnType;
import jp.co.yahoo.yosegi.spread.column.ICellMaker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CellMakerFactory_ESTest extends CellMakerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        CellMakerFactory.getCellMaker((ColumnType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.spread.column.CellMakerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColumnType columnType0 = ColumnType.EMPTY_SPREAD;
      try { 
        CellMakerFactory.getCellMaker(columnType0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown column type : EMPTY_SPREAD
         //
         verifyException("jp.co.yahoo.yosegi.spread.column.CellMakerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColumnType columnType0 = ColumnType.BYTE;
      ICellMaker iCellMaker0 = CellMakerFactory.getCellMaker(columnType0);
      assertNotNull(iCellMaker0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColumnType columnType0 = ColumnType.BOOLEAN;
      ICellMaker iCellMaker0 = CellMakerFactory.getCellMaker(columnType0);
      assertNotNull(iCellMaker0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ColumnType columnType0 = ColumnType.DOUBLE;
      ICellMaker iCellMaker0 = CellMakerFactory.getCellMaker(columnType0);
      assertNotNull(iCellMaker0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ColumnType columnType0 = ColumnType.BYTES;
      ICellMaker iCellMaker0 = CellMakerFactory.getCellMaker(columnType0);
      assertNotNull(iCellMaker0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ColumnType columnType0 = ColumnType.INTEGER;
      ICellMaker iCellMaker0 = CellMakerFactory.getCellMaker(columnType0);
      assertNotNull(iCellMaker0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ColumnType columnType0 = ColumnType.FLOAT;
      ICellMaker iCellMaker0 = CellMakerFactory.getCellMaker(columnType0);
      assertNotNull(iCellMaker0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ColumnType columnType0 = ColumnType.SHORT;
      ICellMaker iCellMaker0 = CellMakerFactory.getCellMaker(columnType0);
      assertNotNull(iCellMaker0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ColumnType columnType0 = ColumnType.LONG;
      ICellMaker iCellMaker0 = CellMakerFactory.getCellMaker(columnType0);
      assertNotNull(iCellMaker0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColumnType columnType0 = ColumnType.STRING;
      ICellMaker iCellMaker0 = CellMakerFactory.getCellMaker(columnType0);
      assertNotNull(iCellMaker0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CellMakerFactory cellMakerFactory0 = new CellMakerFactory();
  }
}
