/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 00:24:18 GMT 2022
 */

package jp.co.yahoo.yosegi.spread.analyzer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import jp.co.yahoo.yosegi.spread.Spread;
import jp.co.yahoo.yosegi.spread.analyzer.Analyzer;
import jp.co.yahoo.yosegi.spread.analyzer.IColumnAnalizeResult;
import jp.co.yahoo.yosegi.spread.analyzer.IColumnAnalizer;
import jp.co.yahoo.yosegi.spread.column.ArrayColumn;
import jp.co.yahoo.yosegi.spread.column.IColumn;
import jp.co.yahoo.yosegi.spread.column.NullColumn;
import jp.co.yahoo.yosegi.spread.column.SpreadColumn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Analyzer_ESTest extends Analyzer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Analyzer.getAnalizer((Spread) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.spread.analyzer.Analyzer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Analyzer.analize((Spread) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.spread.analyzer.Analyzer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayColumn arrayColumn0 = new ArrayColumn("eMBd\"Yq ");
      Spread spread0 = new Spread();
      spread0.addColumn(arrayColumn0);
      List<IColumnAnalizer> list0 = Analyzer.getAnalizer(spread0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Spread spread0 = new Spread();
      List<IColumnAnalizer> list0 = Analyzer.getAnalizer(spread0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Spread spread0 = new Spread();
      SpreadColumn spreadColumn0 = new SpreadColumn((String) null);
      spread0.addColumn(spreadColumn0);
      List<IColumnAnalizeResult> list0 = Analyzer.analize(spread0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Spread spread0 = new Spread();
      IColumn iColumn0 = NullColumn.getInstance();
      spread0.addColumn(iColumn0);
      List<IColumnAnalizeResult> list0 = Analyzer.analize(spread0);
      assertTrue(list0.isEmpty());
  }
}
