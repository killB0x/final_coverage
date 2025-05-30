/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 23:02:10 GMT 2022
 */

package jp.co.yahoo.yosegi.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jp.co.yahoo.yosegi.message.parser.ISettableIndexParser;
import jp.co.yahoo.yosegi.reader.YosegiParserFactory;
import jp.co.yahoo.yosegi.spread.column.ArrayColumn;
import jp.co.yahoo.yosegi.spread.column.ArrowPrimitiveColumn;
import jp.co.yahoo.yosegi.spread.column.ColumnType;
import jp.co.yahoo.yosegi.spread.column.IArrowPrimitiveConnector;
import jp.co.yahoo.yosegi.spread.column.IColumn;
import jp.co.yahoo.yosegi.spread.column.IColumnManager;
import jp.co.yahoo.yosegi.spread.column.LazyColumn;
import jp.co.yahoo.yosegi.spread.column.NullColumn;
import jp.co.yahoo.yosegi.spread.column.SpreadColumn;
import jp.co.yahoo.yosegi.spread.column.UnionColumn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class YosegiParserFactory_ESTest extends YosegiParserFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrowPrimitiveColumn arrowPrimitiveColumn0 = new ArrowPrimitiveColumn((IArrowPrimitiveConnector) null);
      // Undeclared exception!
      try { 
        YosegiParserFactory.hasParser(arrowPrimitiveColumn0, (-1052));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.spread.column.ArrowPrimitiveColumn", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColumnType columnType0 = ColumnType.ARRAY;
      LazyColumn lazyColumn0 = new LazyColumn("<uVG.Se/u^lwI", columnType0, (IColumnManager) null);
      // Undeclared exception!
      try { 
        YosegiParserFactory.get(lazyColumn0, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.spread.column.LazyColumn", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayColumn arrayColumn0 = new ArrayColumn(">sH*6wNV8FJ}e/");
      IColumn iColumn0 = arrayColumn0.getColumn(">sH*6wNV8FJ}e/");
      boolean boolean0 = YosegiParserFactory.hasParser(iColumn0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayColumn arrayColumn0 = new ArrayColumn(">sH*6wNV8FJ}e/");
      IColumn iColumn0 = arrayColumn0.getColumn(">sH*6wNV8FJ}e/");
      ISettableIndexParser iSettableIndexParser0 = YosegiParserFactory.get(iColumn0, (-1));
      assertEquals(0, iSettableIndexParser0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayColumn arrayColumn0 = new ArrayColumn(">sH*6wNV8FJ}e/");
      boolean boolean0 = YosegiParserFactory.hasParser(arrayColumn0, (-1086));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SpreadColumn spreadColumn0 = new SpreadColumn("");
      boolean boolean0 = YosegiParserFactory.hasParser(spreadColumn0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = YosegiParserFactory.hasParser((IColumn) null, (-1567));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayColumn arrayColumn0 = new ArrayColumn(">sH*6wNV8FJ}e/");
      IColumn iColumn0 = arrayColumn0.getColumn(">sH*6wNV8FJ}e/");
      UnionColumn unionColumn0 = new UnionColumn(iColumn0);
      boolean boolean0 = YosegiParserFactory.hasParser(unionColumn0, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IColumn iColumn0 = NullColumn.getInstance();
      UnionColumn unionColumn0 = new UnionColumn(iColumn0);
      ISettableIndexParser iSettableIndexParser0 = YosegiParserFactory.get(unionColumn0, 2);
      assertFalse(iSettableIndexParser0.isStruct());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SpreadColumn spreadColumn0 = new SpreadColumn("jb0Da-q0 YrY8,c");
      ISettableIndexParser iSettableIndexParser0 = YosegiParserFactory.get(spreadColumn0, (-1713));
      assertFalse(iSettableIndexParser0.isStruct());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISettableIndexParser iSettableIndexParser0 = YosegiParserFactory.get((IColumn) null, 0);
      assertNull(iSettableIndexParser0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayColumn arrayColumn0 = new ArrayColumn((String) null);
      ISettableIndexParser iSettableIndexParser0 = YosegiParserFactory.get(arrayColumn0, (-784));
      assertTrue(iSettableIndexParser0.isArray());
  }
}
